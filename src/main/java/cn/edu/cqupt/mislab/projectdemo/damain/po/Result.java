package cn.edu.cqupt.mislab.projectdemo.damain.po;

import lombok.Data;
import lombok.ToString;

/**
 * @program: ProjectDemo
 * @description: 返回类
 * @author: 宋丽
 * @create: 2019-10-19 18:32
 **/
@ToString
@Data
public class Result<T> {

    private Integer status;
    private String msg;
    private T data;

    public Result() {
    }

    public Result(Integer status, String msg, T data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }
}
