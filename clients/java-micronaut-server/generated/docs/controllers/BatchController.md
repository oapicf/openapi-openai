# BatchController

All URIs are relative to `"/v1"`

The controller class is defined in **[BatchController.java](../../src/main/java/org/openapitools/controller/BatchController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelBatch**](#cancelBatch) | **POST** /batches/{batch_id}/cancel | Cancels an in-progress batch. The batch will be in status &#x60;cancelling&#x60; for up to 10 minutes, before changing to &#x60;cancelled&#x60;, where it will have partial results (if any) available in the output file.
[**createBatch**](#createBatch) | **POST** /batches | Creates and executes a batch from an uploaded file of requests
[**listBatches**](#listBatches) | **GET** /batches | List your organization&#39;s batches.
[**retrieveBatch**](#retrieveBatch) | **GET** /batches/{batch_id} | Retrieves a batch.

<a id="cancelBatch"></a>
# **cancelBatch**
```java
Mono<Batch> BatchController.cancelBatch(batchId)
```

Cancels an in-progress batch. The batch will be in status &#x60;cancelling&#x60; for up to 10 minutes, before changing to &#x60;cancelled&#x60;, where it will have partial results (if any) available in the output file.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**batchId** | `String` | The ID of the batch to cancel. |

### Return type
[**Batch**](../../docs/models/Batch.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="createBatch"></a>
# **createBatch**
```java
Mono<Batch> BatchController.createBatch(createBatchRequest)
```

Creates and executes a batch from an uploaded file of requests

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**createBatchRequest** | [**CreateBatchRequest**](../../docs/models/CreateBatchRequest.md) |  |

### Return type
[**Batch**](../../docs/models/Batch.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="listBatches"></a>
# **listBatches**
```java
Mono<ListBatchesResponse> BatchController.listBatches(afterlimit)
```

List your organization&#39;s batches.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**after** | `String` | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional parameter]
**limit** | `Integer` | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional parameter] [default to `20`]

### Return type
[**ListBatchesResponse**](../../docs/models/ListBatchesResponse.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="retrieveBatch"></a>
# **retrieveBatch**
```java
Mono<Batch> BatchController.retrieveBatch(batchId)
```

Retrieves a batch.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**batchId** | `String` | The ID of the batch to retrieve. |

### Return type
[**Batch**](../../docs/models/Batch.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

