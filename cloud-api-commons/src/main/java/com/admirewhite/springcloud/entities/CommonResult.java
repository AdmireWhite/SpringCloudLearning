package com.admirewhite.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName CommonResult
 * @Description 结果类
 * @Author wangchen
 * @Date 2021/8/25 12:35 下午
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    // 404 not found
    private Integer code;
    private String message;
    private T       data;

    public CommonResult(Integer code, String message){
        this(code,message,null);
    }
}
