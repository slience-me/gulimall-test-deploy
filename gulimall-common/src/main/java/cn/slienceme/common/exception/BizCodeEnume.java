package cn.slienceme.common.exception;

import lombok.Getter;

/***
 * 错误码和错误信息定义类
 * 1. 错误码定义规则为5为数字
 * 2. 前两位表示业务场景，最后三位表示错误码。例如：100001。10:通用 001:系统未知异常
 * 3. 维护错误码后需要维护错误描述，将他们定义为枚举形式
 * 错误码列表：
 *  10: 通用
 *      001：参数格式校验
 *  11: 商品
 *  12: 订单
 *  13: 购物车
 *  14: 物流
 *  15: 用户
 *  21：库存
 *
 *
 *
 */
@Getter
public enum BizCodeEnume {
    UNKNOW_EXCEPTION(10000,"系统未知异常"),
    VAILD_EXCEPTION(10001,"参数格式校验失败"),
    VALID_SMS_CODE_EXCEPTION(10002, "短信验证码频率太高"),
    PRODUCT_UP_EXCEPTION(11000,"商品上架异常"),
    USER_EXIST_EXCEPTION(15001, "用户已存在"),
    PHONE_EXIST_EXCEPTION(15002, "手机号已存在"),
    SECKILL_EXCEPTION(10005,"秒杀请求过多，请重新再试"),
    TOO_MANY_REQUEST_EXCEPTION(10004,"请求过多，请重新再试"),
    LOGIN_ACCT_PASSWORD_EXCEPTION(15003, "账号或密码错误"),
    NO_STOCK_EXCEPTION(21001, "商品库存不足"),
    READ_TIME_OUT_EXCEPTION(10005, "读取超时错误");


    private int code;
    private String msg;
    BizCodeEnume(int code,String msg){
        this.code = code;
        this.msg = msg;
    }

}
