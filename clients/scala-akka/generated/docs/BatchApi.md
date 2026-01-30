# BatchApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelBatch**](BatchApi.md#cancelBatch) | **POST** /batches/{batch_id}/cancel | Cancels an in-progress batch. The batch will be in status &#x60;cancelling&#x60; for up to 10 minutes, before changing to &#x60;cancelled&#x60;, where it will have partial results (if any) available in the output file.
[**cancelBatchWithHttpInfo**](BatchApi.md#cancelBatchWithHttpInfo) | **POST** /batches/{batch_id}/cancel | Cancels an in-progress batch. The batch will be in status &#x60;cancelling&#x60; for up to 10 minutes, before changing to &#x60;cancelled&#x60;, where it will have partial results (if any) available in the output file.
[**createBatch**](BatchApi.md#createBatch) | **POST** /batches | Creates and executes a batch from an uploaded file of requests
[**createBatchWithHttpInfo**](BatchApi.md#createBatchWithHttpInfo) | **POST** /batches | Creates and executes a batch from an uploaded file of requests
[**listBatches**](BatchApi.md#listBatches) | **GET** /batches | List your organization&#39;s batches.
[**listBatchesWithHttpInfo**](BatchApi.md#listBatchesWithHttpInfo) | **GET** /batches | List your organization&#39;s batches.
[**retrieveBatch**](BatchApi.md#retrieveBatch) | **GET** /batches/{batch_id} | Retrieves a batch.
[**retrieveBatchWithHttpInfo**](BatchApi.md#retrieveBatchWithHttpInfo) | **GET** /batches/{batch_id} | Retrieves a batch.



## cancelBatch

> cancelBatch(cancelBatchRequest): ApiRequest[Batch]

Cancels an in-progress batch. The batch will be in status &#x60;cancelling&#x60; for up to 10 minutes, before changing to &#x60;cancelled&#x60;, where it will have partial results (if any) available in the output file.

### Example

```scala
// Import classes:
import 
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import akka.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher
    
    // Configure HTTP bearer authorization: ApiKeyAuth
    implicit val ApiKeyAuth: BearerToken = BearerToken("BEARER TOKEN")

    val apiInvoker = ApiInvoker()
    val apiInstance = BatchApi("https://api.openai.com/v1")
    val batchId: String = batchId_example // String | The ID of the batch to cancel.
    
    val request = apiInstance.cancelBatch(batchId)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling BatchApi#cancelBatch")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling BatchApi#cancelBatch")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchId** | **String**| The ID of the batch to cancel. |

### Return type

ApiRequest[[**Batch**](Batch.md)]


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Batch is cancelling. Returns the cancelling batch&#39;s details. |  -  |


## createBatch

> createBatch(createBatchRequest): ApiRequest[Batch]

Creates and executes a batch from an uploaded file of requests

### Example

```scala
// Import classes:
import 
import 
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import akka.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher
    
    // Configure HTTP bearer authorization: ApiKeyAuth
    implicit val ApiKeyAuth: BearerToken = BearerToken("BEARER TOKEN")

    val apiInvoker = ApiInvoker()
    val apiInstance = BatchApi("https://api.openai.com/v1")
    val createBatchRequest: CreateBatchRequest =  // CreateBatchRequest | 
    
    val request = apiInstance.createBatch(createBatchRequest)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling BatchApi#createBatch")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling BatchApi#createBatch")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createBatchRequest** | [**CreateBatchRequest**](CreateBatchRequest.md)|  |

### Return type

ApiRequest[[**Batch**](Batch.md)]


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Batch created successfully. |  -  |


## listBatches

> listBatches(listBatchesRequest): ApiRequest[ListBatchesResponse]

List your organization&#39;s batches.

### Example

```scala
// Import classes:
import 
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import akka.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher
    
    // Configure HTTP bearer authorization: ApiKeyAuth
    implicit val ApiKeyAuth: BearerToken = BearerToken("BEARER TOKEN")

    val apiInvoker = ApiInvoker()
    val apiInstance = BatchApi("https://api.openai.com/v1")
    val after: String = after_example // String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 

    val limit: Int = 56 // Int | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
    
    val request = apiInstance.listBatches(after, limit)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling BatchApi#listBatches")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling BatchApi#listBatches")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **after** | **String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional]
 **limit** | **Int**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional]

### Return type

ApiRequest[[**ListBatchesResponse**](ListBatchesResponse.md)]


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Batch listed successfully. |  -  |


## retrieveBatch

> retrieveBatch(retrieveBatchRequest): ApiRequest[Batch]

Retrieves a batch.

### Example

```scala
// Import classes:
import 
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import akka.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher
    
    // Configure HTTP bearer authorization: ApiKeyAuth
    implicit val ApiKeyAuth: BearerToken = BearerToken("BEARER TOKEN")

    val apiInvoker = ApiInvoker()
    val apiInstance = BatchApi("https://api.openai.com/v1")
    val batchId: String = batchId_example // String | The ID of the batch to retrieve.
    
    val request = apiInstance.retrieveBatch(batchId)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling BatchApi#retrieveBatch")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling BatchApi#retrieveBatch")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchId** | **String**| The ID of the batch to retrieve. |

### Return type

ApiRequest[[**Batch**](Batch.md)]


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Batch retrieved successfully. |  -  |

