package cn.edu.cqupt.mislab.projectdemo.controller;
import cn.edu.cqupt.mislab.projectdemo.damain.po.Result;
import cn.edu.cqupt.mislab.projectdemo.util.ResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
/**
 * @program: ProjectDemo
 * @description: 测试用
 * @author: 宋丽
 * @create: 2019-10-19 18:29
 **/
@Api("任务")
@RestController
@RequestMapping("/Mission")
public class DemoController {
    @ApiOperation(value = "登陆")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id",value = "用户id",dataType = "int",required = true),
    })
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public Result addMission(HttpServletRequest request, @RequestParam("id")Integer id) {
        HttpSession session = request.getSession();
        session.setAttribute("userId",id);
        return ResultUtil.success(id);
    }
}
