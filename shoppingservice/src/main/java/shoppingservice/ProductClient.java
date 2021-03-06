package shoppingservice;

import io.micronaut.core.version.annotation.Version;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Header;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.retry.annotation.CircuitBreaker;
import io.micronaut.retry.annotation.Retryable;
import io.reactivex.Flowable;

import java.util.Map;

@Version("v2")
@Client(id = "productservice")
@CircuitBreaker(attempts = "1", reset = "30s")
//@Retryable(attempts = "1")
public interface ProductClient extends ProductOperations{

}
