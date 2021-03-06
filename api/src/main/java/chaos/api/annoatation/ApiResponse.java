package chaos.api.annoatation;

import java.lang.annotation.*;

/**
 * © shop
 * qq:1413221142
 * 作者：王健(chaos)
 * 时间：2016-02-02
 */
@Documented //文档
@Retention(RetentionPolicy.RUNTIME) //在运行时可以获取
@Target({ElementType.TYPE, ElementType.METHOD}) //作用到类，方法，接口上等
@Inherited //子类会继承
@Deprecated
public @interface ApiResponse {
    /**
     * 标题
     *
     * @return
     */
    String value() default "";


    /**
     * 详细说明
     *
     * @return
     */
    String desc() default "";

    /**
     * <pre>
     *     item: { 字段名称 / 字段说明 / 字段类型 / 默认值 }
     *     [/]分割
     *     默认值，为time时，会直接转成时间戳
     * </pre>
     *
     * @return
     */
    String[] names() default {};
}
