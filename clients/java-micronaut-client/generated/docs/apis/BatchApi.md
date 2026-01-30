# BatchApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelBatch**](BatchApi.md#cancelBatch) | **POST** /batches/{batch_id}/cancel | Cancels an in-progress batch. The batch will be in status &#x60;cancelling&#x60; for up to 10 minutes, before changing to &#x60;cancelled&#x60;, where it will have partial results (if any) available in the output file. |
| [**createBatch**](BatchApi.md#createBatch) | **POST** /batches | Creates and executes a batch from an uploaded file of requests |
| [**listBatches**](BatchApi.md#listBatches) | **GET** /batches | List your organization&#39;s batches. |
| [**retrieveBatch**](BatchApi.md#retrieveBatch) | **GET** /batches/{batch_id} | Retrieves a batch. |


## Creating BatchApi

To initiate an instance of `BatchApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import org.openapitools.api.BatchApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(BatchApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    BatchApi batchApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a id="cancelBatch"></a>
# **cancelBatch**
```java
Mono<Batch> BatchApi.cancelBatch(batchId)
```

Cancels an in-progress batch. The batch will be in status &#x60;cancelling&#x60; for up to 10 minutes, before changing to &#x60;cancelled&#x60;, where it will have partial results (if any) available in the output file.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **batchId** | `String`| The ID of the batch to cancel. | |


### Return type
[**Batch**](Batch.md)

### Authorization
* **[ApiKeyAuth](auth.md#ApiKeyAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="createBatch"></a>
# **createBatch**
```java
Mono<Batch> BatchApi.createBatch(createBatchRequest)
```

Creates and executes a batch from an uploaded file of requests

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createBatchRequest** | [**CreateBatchRequest**](CreateBatchRequest.md)|  | |


### Return type
[**Batch**](Batch.md)

### Authorization
* **[ApiKeyAuth](auth.md#ApiKeyAuth)**

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="listBatches"></a>
# **listBatches**
```java
Mono<ListBatchesResponse> BatchApi.listBatches(afterlimit)
```

List your organization&#39;s batches.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **after** | `String`| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional parameter] |
| **limit** | `Integer`| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional parameter] [default to `20`] |


### Return type
[**ListBatchesResponse**](ListBatchesResponse.md)

### Authorization
* **[ApiKeyAuth](auth.md#ApiKeyAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="retrieveBatch"></a>
# **retrieveBatch**
```java
Mono<Batch> BatchApi.retrieveBatch(batchId)
```

Retrieves a batch.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **batchId** | `String`| The ID of the batch to retrieve. | |


### Return type
[**Batch**](Batch.md)

### Authorization
* **[ApiKeyAuth](auth.md#ApiKeyAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

