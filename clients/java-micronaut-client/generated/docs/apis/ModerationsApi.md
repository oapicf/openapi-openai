# ModerationsApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createModeration**](ModerationsApi.md#createModeration) | **POST** /moderations | Classifies if text is potentially harmful. |


## Creating ModerationsApi

To initiate an instance of `ModerationsApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import org.openapitools.api.ModerationsApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(ModerationsApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    ModerationsApi moderationsApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a id="createModeration"></a>
# **createModeration**
```java
Mono<CreateModerationResponse> ModerationsApi.createModeration(createModerationRequest)
```

Classifies if text is potentially harmful.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createModerationRequest** | [**CreateModerationRequest**](CreateModerationRequest.md)|  | |


### Return type
[**CreateModerationResponse**](CreateModerationResponse.md)

### Authorization
* **[ApiKeyAuth](auth.md#ApiKeyAuth)**

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

