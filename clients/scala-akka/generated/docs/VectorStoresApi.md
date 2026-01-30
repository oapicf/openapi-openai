# VectorStoresApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelVectorStoreFileBatch**](VectorStoresApi.md#cancelVectorStoreFileBatch) | **POST** /vector_stores/{vector_store_id}/file_batches/{batch_id}/cancel | Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.
[**cancelVectorStoreFileBatchWithHttpInfo**](VectorStoresApi.md#cancelVectorStoreFileBatchWithHttpInfo) | **POST** /vector_stores/{vector_store_id}/file_batches/{batch_id}/cancel | Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.
[**createVectorStore**](VectorStoresApi.md#createVectorStore) | **POST** /vector_stores | Create a vector store.
[**createVectorStoreWithHttpInfo**](VectorStoresApi.md#createVectorStoreWithHttpInfo) | **POST** /vector_stores | Create a vector store.
[**createVectorStoreFile**](VectorStoresApi.md#createVectorStoreFile) | **POST** /vector_stores/{vector_store_id}/files | Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).
[**createVectorStoreFileWithHttpInfo**](VectorStoresApi.md#createVectorStoreFileWithHttpInfo) | **POST** /vector_stores/{vector_store_id}/files | Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).
[**createVectorStoreFileBatch**](VectorStoresApi.md#createVectorStoreFileBatch) | **POST** /vector_stores/{vector_store_id}/file_batches | Create a vector store file batch.
[**createVectorStoreFileBatchWithHttpInfo**](VectorStoresApi.md#createVectorStoreFileBatchWithHttpInfo) | **POST** /vector_stores/{vector_store_id}/file_batches | Create a vector store file batch.
[**deleteVectorStore**](VectorStoresApi.md#deleteVectorStore) | **DELETE** /vector_stores/{vector_store_id} | Delete a vector store.
[**deleteVectorStoreWithHttpInfo**](VectorStoresApi.md#deleteVectorStoreWithHttpInfo) | **DELETE** /vector_stores/{vector_store_id} | Delete a vector store.
[**deleteVectorStoreFile**](VectorStoresApi.md#deleteVectorStoreFile) | **DELETE** /vector_stores/{vector_store_id}/files/{file_id} | Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.
[**deleteVectorStoreFileWithHttpInfo**](VectorStoresApi.md#deleteVectorStoreFileWithHttpInfo) | **DELETE** /vector_stores/{vector_store_id}/files/{file_id} | Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.
[**getVectorStore**](VectorStoresApi.md#getVectorStore) | **GET** /vector_stores/{vector_store_id} | Retrieves a vector store.
[**getVectorStoreWithHttpInfo**](VectorStoresApi.md#getVectorStoreWithHttpInfo) | **GET** /vector_stores/{vector_store_id} | Retrieves a vector store.
[**getVectorStoreFile**](VectorStoresApi.md#getVectorStoreFile) | **GET** /vector_stores/{vector_store_id}/files/{file_id} | Retrieves a vector store file.
[**getVectorStoreFileWithHttpInfo**](VectorStoresApi.md#getVectorStoreFileWithHttpInfo) | **GET** /vector_stores/{vector_store_id}/files/{file_id} | Retrieves a vector store file.
[**getVectorStoreFileBatch**](VectorStoresApi.md#getVectorStoreFileBatch) | **GET** /vector_stores/{vector_store_id}/file_batches/{batch_id} | Retrieves a vector store file batch.
[**getVectorStoreFileBatchWithHttpInfo**](VectorStoresApi.md#getVectorStoreFileBatchWithHttpInfo) | **GET** /vector_stores/{vector_store_id}/file_batches/{batch_id} | Retrieves a vector store file batch.
[**listFilesInVectorStoreBatch**](VectorStoresApi.md#listFilesInVectorStoreBatch) | **GET** /vector_stores/{vector_store_id}/file_batches/{batch_id}/files | Returns a list of vector store files in a batch.
[**listFilesInVectorStoreBatchWithHttpInfo**](VectorStoresApi.md#listFilesInVectorStoreBatchWithHttpInfo) | **GET** /vector_stores/{vector_store_id}/file_batches/{batch_id}/files | Returns a list of vector store files in a batch.
[**listVectorStoreFiles**](VectorStoresApi.md#listVectorStoreFiles) | **GET** /vector_stores/{vector_store_id}/files | Returns a list of vector store files.
[**listVectorStoreFilesWithHttpInfo**](VectorStoresApi.md#listVectorStoreFilesWithHttpInfo) | **GET** /vector_stores/{vector_store_id}/files | Returns a list of vector store files.
[**listVectorStores**](VectorStoresApi.md#listVectorStores) | **GET** /vector_stores | Returns a list of vector stores.
[**listVectorStoresWithHttpInfo**](VectorStoresApi.md#listVectorStoresWithHttpInfo) | **GET** /vector_stores | Returns a list of vector stores.
[**modifyVectorStore**](VectorStoresApi.md#modifyVectorStore) | **POST** /vector_stores/{vector_store_id} | Modifies a vector store.
[**modifyVectorStoreWithHttpInfo**](VectorStoresApi.md#modifyVectorStoreWithHttpInfo) | **POST** /vector_stores/{vector_store_id} | Modifies a vector store.



## cancelVectorStoreFileBatch

> cancelVectorStoreFileBatch(cancelVectorStoreFileBatchRequest): ApiRequest[VectorStoreFileBatchObject]

Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.

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
    val apiInstance = VectorStoresApi("https://api.openai.com/v1")
    val vectorStoreId: String = vectorStoreId_example // String | The ID of the vector store that the file batch belongs to.

    val batchId: String = batchId_example // String | The ID of the file batch to cancel.
    
    val request = apiInstance.cancelVectorStoreFileBatch(vectorStoreId, batchId)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling VectorStoresApi#cancelVectorStoreFileBatch")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling VectorStoresApi#cancelVectorStoreFileBatch")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vectorStoreId** | **String**| The ID of the vector store that the file batch belongs to. |
 **batchId** | **String**| The ID of the file batch to cancel. |

### Return type

ApiRequest[[**VectorStoreFileBatchObject**](VectorStoreFileBatchObject.md)]


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## createVectorStore

> createVectorStore(createVectorStoreRequest): ApiRequest[VectorStoreObject]

Create a vector store.

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
    val apiInstance = VectorStoresApi("https://api.openai.com/v1")
    val createVectorStoreRequest: CreateVectorStoreRequest =  // CreateVectorStoreRequest | 
    
    val request = apiInstance.createVectorStore(createVectorStoreRequest)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling VectorStoresApi#createVectorStore")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling VectorStoresApi#createVectorStore")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createVectorStoreRequest** | [**CreateVectorStoreRequest**](CreateVectorStoreRequest.md)|  |

### Return type

ApiRequest[[**VectorStoreObject**](VectorStoreObject.md)]


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## createVectorStoreFile

> createVectorStoreFile(createVectorStoreFileRequest): ApiRequest[VectorStoreFileObject]

Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).

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
    val apiInstance = VectorStoresApi("https://api.openai.com/v1")
    val vectorStoreId: String = vs_abc123 // String | The ID of the vector store for which to create a File. 

    val createVectorStoreFileRequest: CreateVectorStoreFileRequest =  // CreateVectorStoreFileRequest | 
    
    val request = apiInstance.createVectorStoreFile(vectorStoreId, createVectorStoreFileRequest)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling VectorStoresApi#createVectorStoreFile")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling VectorStoresApi#createVectorStoreFile")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vectorStoreId** | **String**| The ID of the vector store for which to create a File.  |
 **createVectorStoreFileRequest** | [**CreateVectorStoreFileRequest**](CreateVectorStoreFileRequest.md)|  |

### Return type

ApiRequest[[**VectorStoreFileObject**](VectorStoreFileObject.md)]


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## createVectorStoreFileBatch

> createVectorStoreFileBatch(createVectorStoreFileBatchRequest): ApiRequest[VectorStoreFileBatchObject]

Create a vector store file batch.

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
    val apiInstance = VectorStoresApi("https://api.openai.com/v1")
    val vectorStoreId: String = vs_abc123 // String | The ID of the vector store for which to create a File Batch. 

    val createVectorStoreFileBatchRequest: CreateVectorStoreFileBatchRequest =  // CreateVectorStoreFileBatchRequest | 
    
    val request = apiInstance.createVectorStoreFileBatch(vectorStoreId, createVectorStoreFileBatchRequest)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling VectorStoresApi#createVectorStoreFileBatch")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling VectorStoresApi#createVectorStoreFileBatch")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vectorStoreId** | **String**| The ID of the vector store for which to create a File Batch.  |
 **createVectorStoreFileBatchRequest** | [**CreateVectorStoreFileBatchRequest**](CreateVectorStoreFileBatchRequest.md)|  |

### Return type

ApiRequest[[**VectorStoreFileBatchObject**](VectorStoreFileBatchObject.md)]


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## deleteVectorStore

> deleteVectorStore(deleteVectorStoreRequest): ApiRequest[DeleteVectorStoreResponse]

Delete a vector store.

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
    val apiInstance = VectorStoresApi("https://api.openai.com/v1")
    val vectorStoreId: String = vectorStoreId_example // String | The ID of the vector store to delete.
    
    val request = apiInstance.deleteVectorStore(vectorStoreId)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling VectorStoresApi#deleteVectorStore")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling VectorStoresApi#deleteVectorStore")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vectorStoreId** | **String**| The ID of the vector store to delete. |

### Return type

ApiRequest[[**DeleteVectorStoreResponse**](DeleteVectorStoreResponse.md)]


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## deleteVectorStoreFile

> deleteVectorStoreFile(deleteVectorStoreFileRequest): ApiRequest[DeleteVectorStoreFileResponse]

Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.

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
    val apiInstance = VectorStoresApi("https://api.openai.com/v1")
    val vectorStoreId: String = vectorStoreId_example // String | The ID of the vector store that the file belongs to.

    val fileId: String = fileId_example // String | The ID of the file to delete.
    
    val request = apiInstance.deleteVectorStoreFile(vectorStoreId, fileId)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling VectorStoresApi#deleteVectorStoreFile")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling VectorStoresApi#deleteVectorStoreFile")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vectorStoreId** | **String**| The ID of the vector store that the file belongs to. |
 **fileId** | **String**| The ID of the file to delete. |

### Return type

ApiRequest[[**DeleteVectorStoreFileResponse**](DeleteVectorStoreFileResponse.md)]


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getVectorStore

> getVectorStore(getVectorStoreRequest): ApiRequest[VectorStoreObject]

Retrieves a vector store.

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
    val apiInstance = VectorStoresApi("https://api.openai.com/v1")
    val vectorStoreId: String = vectorStoreId_example // String | The ID of the vector store to retrieve.
    
    val request = apiInstance.getVectorStore(vectorStoreId)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling VectorStoresApi#getVectorStore")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling VectorStoresApi#getVectorStore")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vectorStoreId** | **String**| The ID of the vector store to retrieve. |

### Return type

ApiRequest[[**VectorStoreObject**](VectorStoreObject.md)]


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getVectorStoreFile

> getVectorStoreFile(getVectorStoreFileRequest): ApiRequest[VectorStoreFileObject]

Retrieves a vector store file.

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
    val apiInstance = VectorStoresApi("https://api.openai.com/v1")
    val vectorStoreId: String = vs_abc123 // String | The ID of the vector store that the file belongs to.

    val fileId: String = file-abc123 // String | The ID of the file being retrieved.
    
    val request = apiInstance.getVectorStoreFile(vectorStoreId, fileId)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling VectorStoresApi#getVectorStoreFile")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling VectorStoresApi#getVectorStoreFile")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vectorStoreId** | **String**| The ID of the vector store that the file belongs to. |
 **fileId** | **String**| The ID of the file being retrieved. |

### Return type

ApiRequest[[**VectorStoreFileObject**](VectorStoreFileObject.md)]


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getVectorStoreFileBatch

> getVectorStoreFileBatch(getVectorStoreFileBatchRequest): ApiRequest[VectorStoreFileBatchObject]

Retrieves a vector store file batch.

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
    val apiInstance = VectorStoresApi("https://api.openai.com/v1")
    val vectorStoreId: String = vs_abc123 // String | The ID of the vector store that the file batch belongs to.

    val batchId: String = vsfb_abc123 // String | The ID of the file batch being retrieved.
    
    val request = apiInstance.getVectorStoreFileBatch(vectorStoreId, batchId)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling VectorStoresApi#getVectorStoreFileBatch")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling VectorStoresApi#getVectorStoreFileBatch")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vectorStoreId** | **String**| The ID of the vector store that the file batch belongs to. |
 **batchId** | **String**| The ID of the file batch being retrieved. |

### Return type

ApiRequest[[**VectorStoreFileBatchObject**](VectorStoreFileBatchObject.md)]


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## listFilesInVectorStoreBatch

> listFilesInVectorStoreBatch(listFilesInVectorStoreBatchRequest): ApiRequest[ListVectorStoreFilesResponse]

Returns a list of vector store files in a batch.

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
    val apiInstance = VectorStoresApi("https://api.openai.com/v1")
    val vectorStoreId: String = vectorStoreId_example // String | The ID of the vector store that the files belong to.

    val batchId: String = batchId_example // String | The ID of the file batch that the files belong to.

    val limit: Int = 56 // Int | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 

    val order: String = order_example // String | Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. 

    val after: String = after_example // String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 

    val before: String = before_example // String | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 

    val filter: String = filter_example // String | Filter by file status. One of `in_progress`, `completed`, `failed`, `cancelled`.
    
    val request = apiInstance.listFilesInVectorStoreBatch(vectorStoreId, batchId, limit, order, after, before, filter)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling VectorStoresApi#listFilesInVectorStoreBatch")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling VectorStoresApi#listFilesInVectorStoreBatch")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vectorStoreId** | **String**| The ID of the vector store that the files belong to. |
 **batchId** | **String**| The ID of the file batch that the files belong to. |
 **limit** | **Int**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional]
 **order** | **String**| Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [enum: asc, desc]
 **after** | **String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional]
 **before** | **String**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional]
 **filter** | **String**| Filter by file status. One of &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;failed&#x60;, &#x60;cancelled&#x60;. | [optional] [enum: in_progress, completed, failed, cancelled]

### Return type

ApiRequest[[**ListVectorStoreFilesResponse**](ListVectorStoreFilesResponse.md)]


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## listVectorStoreFiles

> listVectorStoreFiles(listVectorStoreFilesRequest): ApiRequest[ListVectorStoreFilesResponse]

Returns a list of vector store files.

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
    val apiInstance = VectorStoresApi("https://api.openai.com/v1")
    val vectorStoreId: String = vectorStoreId_example // String | The ID of the vector store that the files belong to.

    val limit: Int = 56 // Int | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 

    val order: String = order_example // String | Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. 

    val after: String = after_example // String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 

    val before: String = before_example // String | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 

    val filter: String = filter_example // String | Filter by file status. One of `in_progress`, `completed`, `failed`, `cancelled`.
    
    val request = apiInstance.listVectorStoreFiles(vectorStoreId, limit, order, after, before, filter)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling VectorStoresApi#listVectorStoreFiles")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling VectorStoresApi#listVectorStoreFiles")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vectorStoreId** | **String**| The ID of the vector store that the files belong to. |
 **limit** | **Int**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional]
 **order** | **String**| Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [enum: asc, desc]
 **after** | **String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional]
 **before** | **String**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional]
 **filter** | **String**| Filter by file status. One of &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;failed&#x60;, &#x60;cancelled&#x60;. | [optional] [enum: in_progress, completed, failed, cancelled]

### Return type

ApiRequest[[**ListVectorStoreFilesResponse**](ListVectorStoreFilesResponse.md)]


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## listVectorStores

> listVectorStores(listVectorStoresRequest): ApiRequest[ListVectorStoresResponse]

Returns a list of vector stores.

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
    val apiInstance = VectorStoresApi("https://api.openai.com/v1")
    val limit: Int = 56 // Int | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 

    val order: String = order_example // String | Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. 

    val after: String = after_example // String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 

    val before: String = before_example // String | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
    
    val request = apiInstance.listVectorStores(limit, order, after, before)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling VectorStoresApi#listVectorStores")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling VectorStoresApi#listVectorStores")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Int**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional]
 **order** | **String**| Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [enum: asc, desc]
 **after** | **String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional]
 **before** | **String**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional]

### Return type

ApiRequest[[**ListVectorStoresResponse**](ListVectorStoresResponse.md)]


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## modifyVectorStore

> modifyVectorStore(modifyVectorStoreRequest): ApiRequest[VectorStoreObject]

Modifies a vector store.

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
    val apiInstance = VectorStoresApi("https://api.openai.com/v1")
    val vectorStoreId: String = vectorStoreId_example // String | The ID of the vector store to modify.

    val updateVectorStoreRequest: UpdateVectorStoreRequest =  // UpdateVectorStoreRequest | 
    
    val request = apiInstance.modifyVectorStore(vectorStoreId, updateVectorStoreRequest)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling VectorStoresApi#modifyVectorStore")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling VectorStoresApi#modifyVectorStore")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vectorStoreId** | **String**| The ID of the vector store to modify. |
 **updateVectorStoreRequest** | [**UpdateVectorStoreRequest**](UpdateVectorStoreRequest.md)|  |

### Return type

ApiRequest[[**VectorStoreObject**](VectorStoreObject.md)]


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

