package mnday4;

import io.micronaut.aop.Around;
import io.micronaut.context.annotation.Type;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Around
@Type(ExecuteAroundInterceptor.class)
public @interface ExecuteAround {
}
