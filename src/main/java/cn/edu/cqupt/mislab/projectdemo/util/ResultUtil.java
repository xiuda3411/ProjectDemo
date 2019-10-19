package cn.edu.cqupt.mislab.projectdemo.util;

import cn.edu.cqupt.mislab.projectdemo.constant.ResultEnum;
import cn.edu.cqupt.mislab.projectdemo.damain.po.Result;

/**
 * @program: ProjectDemo
 * @description: 返回类使用帮助工具
 * @author: 宋丽
 * @create: 2019-10-19 18:33
 **/
public class ResultUtil {

    public static Result<Object> success(Object object) {
        Result<Object> result = new Result<>();
        result.setStatus(ResultEnum.SUCCESS.getStatus());
        result.setMsg(ResultEnum.SUCCESS.getMsg());
        result.setData(object);
        return result;
    }

    public static Result<Object> error(Object object) {
        Result<Object> result = new Result<>();
        result.setStatus(ResultEnum.ERROR.getStatus());
        result.setMsg(ResultEnum.ERROR.getMsg());
        result.setData(object);
        return result;
    }

    /**失败使用枚举**/
    public static Result error(ResultEnum resultEnum){
        Result result = new Result();
        result.setStatus(resultEnum.getStatus());
        result.setMsg(resultEnum.getMsg());
        return result;
    }

    public static Result<Object> success() {
        return success(null);
    }

    public static Result error() {
        Result result = new Result();
        result.setStatus(ResultEnum.ERROR.getStatus());
        result.setMsg(ResultEnum.ERROR.getMsg());
        return result;
    }

    public static Result isNull() {
        Result result = new Result();
        result.setStatus(ResultEnum.ISNULL.getStatus());
        result.setMsg(ResultEnum.ISNULL.getMsg());
        return result;
    }

    public static Result isExist() {
        Result Result = new Result();
        Result.setStatus(ResultEnum.ISEXIST.getStatus());
        Result.setMsg(ResultEnum.ISEXIST.getMsg());
        return Result;
    }

    public static Result notExist() {
        Result Result = new Result();
        Result.setStatus(ResultEnum.NOTEXIST.getStatus());
        Result.setMsg(ResultEnum.NOTEXIST.getMsg());
        return Result;
    }
    public static Result notLogin() {
        Result Result = new Result();
        Result.setStatus(ResultEnum.NOLOGIN.getStatus());
        Result.setMsg(ResultEnum.NOLOGIN.getMsg());
        return Result;
    }
}
