package jx.stjh.demo03complete.util;

/**
 * @Description:用于同一个VO中，应对不同的验证需要，如loginbean分组校验
 * @Author: Zlk
 * @Date: 2020/3/27 23:55
 */
public class ValidationGroups {

    /**
     * 用户校验添加校验
     */
    public interface Add {}

    /**
     * 用于校验修改校验
     */
    public interface Update {}

    /**
     * 用于校验查询校验
     */
    public interface Select {}

    /**
     * 用于校验删除校验
     */
    public interface Delete{}

}



