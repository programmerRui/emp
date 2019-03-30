package com.nuesoft.controller;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nuesoft.po.Dept;
import com.nuesoft.po.Emp;
import com.nuesoft.service.DeptService;
import com.nuesoft.service.EmpService;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.ServletContextAware;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.List;

@Controller
public class EmpController implements ServletContextAware {
    private ServletContext servletContext;
    @Override
    public void setServletContext(ServletContext servletContext) {
        this.servletContext = servletContext;
    }
    @Autowired
    private EmpService empService;
    @Autowired
    private DeptService deptService;
    @RequestMapping("selectAll.do")
    public String querybook(@RequestParam(value = "empdeptid", required = false, defaultValue = "0") Integer empdeptid,
                            @RequestParam(value = "empname", required = false, defaultValue = "") String empname,
                            @RequestParam(value = "empwages", required = false, defaultValue = "0") Integer empwages,
                            @RequestParam(value = "now", required = false, defaultValue = "1") Integer now, ModelMap map) {
        PageHelper.startPage(now, 5);
        List<Emp> empList = empService.selectAll(empdeptid, empname, empwages);
        PageInfo<Emp> pageInfo = new PageInfo<>(empList);
        map.put("pageInfo", pageInfo);
       List<Dept> depts = deptService.selectAll();
        map.put("dept",depts);
        //将条件添加到map 作为回显
        map.put("empdeptid", empdeptid);
        map.put("empname", empname);
        map.put("empwages", empwages);
        return "index";
    }
    @RequestMapping("toadd.do")
    public String toadd(ModelMap map){
        List<Dept> deptList = deptService.selectAll();
        map.put("deptlist",deptList);
        return "add";
    }
    @RequestMapping("add.do")
    public void add(Emp emp, HttpServletResponse response) throws IOException {
        int num = empService.insertSelective(emp);
        response.setContentType("text/html;charset=utf-8");
        PrintWriter printWriter = response.getWriter();
        if (num > 0) {
            printWriter.write("<script type='text/javascript'>alert('新增成功');location.href='selectAll.do'</script>");
        } else {
            printWriter.write("<script type='text/javascript'>alert('新增失败');location.href='add.do'</script>");
        }
    }
    @RequestMapping("toupdate.do")
    public String touptada(int empid,ModelMap map){
        Emp emp = empService.selectByPrimaryKey(empid);
        List<Dept> deptList = deptService.selectAll();
        map.put("deptList",deptList);
        map.put("emp",emp);
        return "update";
    }
    @RequestMapping("update.do")
    public void update(Emp emp,HttpServletResponse response) throws IOException {
        int num = empService.updateByPrimaryKeySelective(emp);
        response.setContentType("text/html;charset=utf-8");
        PrintWriter printWriter = response.getWriter();
        if (num > 0) {
            printWriter.write("<script type='text/javascript'>alert('修改成功');location.href='selectAll.do'</script>");
        } else {
            printWriter.write("<script type='text/javascript'>alert('修改失败');location.href='add.do'</script>");
        }
    }
    @RequestMapping("detail.do")
    public String detail(ModelMap map,int empid){
        Emp emp = empService.selectByPrimaryKey(empid);
        map.put("emp",emp);
        return "detailed";
    }
    @RequestMapping("delete.do")
    public void delete(HttpServletResponse response,int empid) throws IOException {
        int num = empService.deleteByPrimaryKey(empid);
        response.setContentType("text/html;charset=utf-8");
        PrintWriter printWriter = response.getWriter();
        if (num > 0) {
            printWriter.write("<script type='text/javascript'>alert('修改成功');location.href='selectAll.do'</script>");
        } else {
            printWriter.write("<script type='text/javascript'>alert('修改失败');location.href='add.do'</script>");
        }
    }
    @RequestMapping("deteleByIds.do")
    public void deletes(String[] empid,HttpServletResponse response) throws IOException {
        int num = empService.deleteByids(empid);
        response.setContentType("text/html;charset=utf-8");
        PrintWriter printWriter = response.getWriter();
        if (num > 0) {
            printWriter.write("<script type='text/javascript'>alert('删除成功');location.href='selectAll.do'</script>");
        } else {
            printWriter.write("<script type='text/javascript'>alert('删除失败');location.href='selectAll.do'</script>");
        }
    }
    @RequestMapping(value = "/imageupload.do", produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String imageUpload(@RequestParam("fileImage") MultipartFile fileImage) throws UnsupportedEncodingException {
        //获取上传图片位置
        String path = servletContext.getRealPath("/resource/upload/");
        //创建文件名称
        String name = fileImage.getOriginalFilename();
        System.out.println(name);
       /* String name=new
                String(filename.getBytes("UTF-8"),"iso-8859-1");//为了解决中文名称乱码问题*/
        //创建file对象写入
        File file = new File(path, name);
        try {
            //fileImage.getFileItem().write(file);
            fileImage.transferTo(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //将上传的图片路径json的方式返回客户端
        String imagePath = "resource/upload/" + name;
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("imagePath", imagePath);
        //将对象转为json格式
        String json = jsonObject.toJSONString();
        System.out.println(json);
        return json;
    }

    @RequestMapping("download.do")
    public ResponseEntity<byte[]> download(String imagepath) throws IOException {
        String path = servletContext.getRealPath(imagepath);
        String[] split = path.split("\\\\");
        String name = split[split.length - 1];
        File file = new File(path);
        HttpHeaders headers = new HttpHeaders();
        String fileName = new
                String(name.getBytes("UTF-8"), "iso-8859-1");//为了解决中文名称乱码问题
        headers.setContentDispositionFormData("attachment", fileName);
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file), headers, HttpStatus.CREATED);
    }

}
