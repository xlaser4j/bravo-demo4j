package com.xlaser4j.common.response;

import com.xlaser4j.common.enums.Status;
import com.xlaser4j.common.exception.BaseException;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @package: com.xlaser4j.common.response
 * @author: Elijah.D
 * @time: 2020/2/10 15:18
 * @description:
 * @modified: Elijah.D
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiResponse<T> {
    /**
     * 状态码
     */
    private Integer code;

    /**
     * 返回消息
     */
    private String message;

    /**
     * 返回数据
     */
    private T data;

    /**
     * <p> 构造一个成功无返回数据的API返回
     *
     * @return ApiResponse api返回
     */
    public ApiResponse<T> ofSuccess() {
        return ofStatus(Status.OK);
    }

    /**
     * <p> 构造一个成功且带数据的API返回
     *
     * @param data 返回数据
     * @return ApiResponse api返回
     */
    public ApiResponse<T> ofSuccess(T data) {
        return ofStatus(Status.OK, data);
    }

    /**
     * <p> 构造一个成功且自定义消息的API返回
     *
     * @param message 返回消息
     * @return ApiResponse api返回
     */
    public ApiResponse<T> ofMessage(String message) {
        return of(Status.OK.getCode(), message, null);
    }

    /**
     * <p> 构造一个成功且自定义消息的API返回数据
     *
     * @param message 返回消息
     * @param data    返回数据
     * @return ApiResponse api返回
     */
    public ApiResponse<T> ofMessage(String message, T data) {
        return of(Status.OK.getCode(), message, data);
    }

    /**
     * <p> 构造一个有状态的API返回
     *
     * @param status 状态 {@link Status}
     * @return ApiResponse api返回
     */
    public ApiResponse<T> ofStatus(Status status) {
        return ofStatus(status, null);
    }

    /**
     * <p> 构造一个有状态且带数据的API返回
     *
     * @param status 状态 {@link Status}
     * @param data   返回数据
     * @return ApiResponse api返回
     */
    public ApiResponse<T> ofStatus(Status status, T data) {
        return of(status.getCode(), status.getMessage(), data);
    }

    /**
     * <p> 构造一个自定义的API返回
     *
     * @param code    状态码
     * @param message 返回消息
     * @param data    返回数据
     * @return ApiResponse api返回
     */
    public ApiResponse<T> of(Integer code, String message, T data) {
        return new ApiResponse<>(code, message, data);
    }

    /**
     * <p> 构造一个异常的API返回
     *
     * @param <E> {@link com.xlaser4j.common.exception.BaseException} 的子类
     * @param t   异常
     * @return ApiResponse api返回
     */
    @SuppressWarnings("unchecked")
    public <E extends BaseException> ApiResponse<T> ofException(E t) {
        return of(t.getCode(), t.getMessage(), (T)t.getData());
    }
}
