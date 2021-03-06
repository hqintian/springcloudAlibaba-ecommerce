package com.caostudy.ecommerce.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Cao Study
 * @description CommonResponse 通用响应对象定义
 * @date 2021/7/22 19:14
 * 结构如下
 * {
 *     "code":0,
 *     "message":"",
 *     "data":{}
 * }
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResponse<T> implements Serializable {
    /** 错误码 */
    private Integer code;

    /** 错误消息 */
    private String message;

    /** 泛型响应数据 */
    private T Data;

    public CommonResponse(Integer code, String message) {

        this.code = code;
        this.message = message;
    }
}
