package cn.idealismus.multiDataSource.config;

import java.lang.annotation.*;

@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DataSource {
    
    DataSourceEnum value() default DataSourceEnum.DB0;
    
}
