# EmbeddingsApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createEmbedding**](EmbeddingsApi.md#createEmbedding) | **POST** /embeddings | Creates an embedding vector representing the input text. |


## Creating EmbeddingsApi

To initiate an instance of `EmbeddingsApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import org.openapitools.api.EmbeddingsApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(EmbeddingsApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    EmbeddingsApi embeddingsApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a id="createEmbedding"></a>
# **createEmbedding**
```java
Mono<CreateEmbeddingResponse> EmbeddingsApi.createEmbedding(createEmbeddingRequest)
```

Creates an embedding vector representing the input text.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createEmbeddingRequest** | [**CreateEmbeddingRequest**](CreateEmbeddingRequest.md)|  | |


### Return type
[**CreateEmbeddingResponse**](CreateEmbeddingResponse.md)

### Authorization
* **[ApiKeyAuth](auth.md#ApiKeyAuth)**

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

