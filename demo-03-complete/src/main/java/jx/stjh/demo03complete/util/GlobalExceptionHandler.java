package jx.stjh.demo03complete.util;

import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import org.springframework.validation.BindException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ConstraintViolationException;

/**
 * @Description: 统一的异常处理
 * @Author: Zlk
 * @Date: 2020/3/27 23:40
 */
@RestControllerAdvice
public class GlobalExceptionHandler extends ApiController {
    /**
     * post请求参数校验抛出的异常
     * @param e
     * @return
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public R methodArgumentNotValidExceptionHandler(MethodArgumentNotValidException e){
        //获取异常中随机一个异常信息
        String defaultMessage = e.getBindingResult().getFieldError().getDefaultMessage();
        return failed(defaultMessage);
    }

    /**
     * get请求参数校验抛出的异常
     * @param e
     * @return
     */
    @ExceptionHandler(BindException.class)
    public R bindExceptionHandler(BindException e){
        //获取异常中随机一个异常信息
        String defaultMessage = e.getBindingResult().getFieldError().getDefaultMessage();
        return failed(defaultMessage);
    }

    /**
     * 请求方法中校验抛出的异常
     * @param e
     * @return
     */
    @ExceptionHandler(ConstraintViolationException.class)
    public R constraintViolationExceptionHandler(ConstraintViolationException e){
        //获取异常中第一个错误信息
        String message = e.getConstraintViolations().iterator().next().getMessage();
        return failed(message);
    }
}