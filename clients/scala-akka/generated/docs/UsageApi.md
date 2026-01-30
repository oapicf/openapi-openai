# UsageApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**usageAudioSpeeches**](UsageApi.md#usageAudioSpeeches) | **GET** /organization/usage/audio_speeches | Get audio speeches usage details for the organization.
[**usageAudioSpeechesWithHttpInfo**](UsageApi.md#usageAudioSpeechesWithHttpInfo) | **GET** /organization/usage/audio_speeches | Get audio speeches usage details for the organization.
[**usageAudioTranscriptions**](UsageApi.md#usageAudioTranscriptions) | **GET** /organization/usage/audio_transcriptions | Get audio transcriptions usage details for the organization.
[**usageAudioTranscriptionsWithHttpInfo**](UsageApi.md#usageAudioTranscriptionsWithHttpInfo) | **GET** /organization/usage/audio_transcriptions | Get audio transcriptions usage details for the organization.
[**usageCodeInterpreterSessions**](UsageApi.md#usageCodeInterpreterSessions) | **GET** /organization/usage/code_interpreter_sessions | Get code interpreter sessions usage details for the organization.
[**usageCodeInterpreterSessionsWithHttpInfo**](UsageApi.md#usageCodeInterpreterSessionsWithHttpInfo) | **GET** /organization/usage/code_interpreter_sessions | Get code interpreter sessions usage details for the organization.
[**usageCompletions**](UsageApi.md#usageCompletions) | **GET** /organization/usage/completions | Get completions usage details for the organization.
[**usageCompletionsWithHttpInfo**](UsageApi.md#usageCompletionsWithHttpInfo) | **GET** /organization/usage/completions | Get completions usage details for the organization.
[**usageCosts**](UsageApi.md#usageCosts) | **GET** /organization/costs | Get costs details for the organization.
[**usageCostsWithHttpInfo**](UsageApi.md#usageCostsWithHttpInfo) | **GET** /organization/costs | Get costs details for the organization.
[**usageEmbeddings**](UsageApi.md#usageEmbeddings) | **GET** /organization/usage/embeddings | Get embeddings usage details for the organization.
[**usageEmbeddingsWithHttpInfo**](UsageApi.md#usageEmbeddingsWithHttpInfo) | **GET** /organization/usage/embeddings | Get embeddings usage details for the organization.
[**usageImages**](UsageApi.md#usageImages) | **GET** /organization/usage/images | Get images usage details for the organization.
[**usageImagesWithHttpInfo**](UsageApi.md#usageImagesWithHttpInfo) | **GET** /organization/usage/images | Get images usage details for the organization.
[**usageModerations**](UsageApi.md#usageModerations) | **GET** /organization/usage/moderations | Get moderations usage details for the organization.
[**usageModerationsWithHttpInfo**](UsageApi.md#usageModerationsWithHttpInfo) | **GET** /organization/usage/moderations | Get moderations usage details for the organization.
[**usageVectorStores**](UsageApi.md#usageVectorStores) | **GET** /organization/usage/vector_stores | Get vector stores usage details for the organization.
[**usageVectorStoresWithHttpInfo**](UsageApi.md#usageVectorStoresWithHttpInfo) | **GET** /organization/usage/vector_stores | Get vector stores usage details for the organization.



## usageAudioSpeeches

> usageAudioSpeeches(usageAudioSpeechesRequest): ApiRequest[UsageResponse]

Get audio speeches usage details for the organization.

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
    val apiInstance = UsageApi("https://api.openai.com/v1")
    val startTime: Int = 56 // Int | Start time (Unix seconds) of the query time range, inclusive.

    val endTime: Int = 56 // Int | End time (Unix seconds) of the query time range, exclusive.

    val bucketWidth: String = bucketWidth_example // String | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.

    val projectIds: Seq[String] =  // Seq[String] | Return only usage for these projects.

    val userIds: Seq[String] =  // Seq[String] | Return only usage for these users.

    val apiKeyIds: Seq[String] =  // Seq[String] | Return only usage for these API keys.

    val models: Seq[String] =  // Seq[String] | Return only usage for these models.

    val groupBy: Seq[String] =  // Seq[String] | Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them.

    val limit: Int = 56 // Int | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 

    val page: String = page_example // String | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
    
    val request = apiInstance.usageAudioSpeeches(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling UsageApi#usageAudioSpeeches")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling UsageApi#usageAudioSpeeches")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startTime** | **Int**| Start time (Unix seconds) of the query time range, inclusive. |
 **endTime** | **Int**| End time (Unix seconds) of the query time range, exclusive. | [optional]
 **bucketWidth** | **String**| Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [enum: 1m, 1h, 1d]
 **projectIds** | [**Seq[String]**](String.md)| Return only usage for these projects. | [optional]
 **userIds** | [**Seq[String]**](String.md)| Return only usage for these users. | [optional]
 **apiKeyIds** | [**Seq[String]**](String.md)| Return only usage for these API keys. | [optional]
 **models** | [**Seq[String]**](String.md)| Return only usage for these models. | [optional]
 **groupBy** | [**Seq[String]**](String.md)| Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. | [optional] [enum: project_id, user_id, api_key_id, model]
 **limit** | **Int**| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional]
 **page** | **String**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional]

### Return type

ApiRequest[[**UsageResponse**](UsageResponse.md)]


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Usage data retrieved successfully. |  -  |


## usageAudioTranscriptions

> usageAudioTranscriptions(usageAudioTranscriptionsRequest): ApiRequest[UsageResponse]

Get audio transcriptions usage details for the organization.

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
    val apiInstance = UsageApi("https://api.openai.com/v1")
    val startTime: Int = 56 // Int | Start time (Unix seconds) of the query time range, inclusive.

    val endTime: Int = 56 // Int | End time (Unix seconds) of the query time range, exclusive.

    val bucketWidth: String = bucketWidth_example // String | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.

    val projectIds: Seq[String] =  // Seq[String] | Return only usage for these projects.

    val userIds: Seq[String] =  // Seq[String] | Return only usage for these users.

    val apiKeyIds: Seq[String] =  // Seq[String] | Return only usage for these API keys.

    val models: Seq[String] =  // Seq[String] | Return only usage for these models.

    val groupBy: Seq[String] =  // Seq[String] | Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them.

    val limit: Int = 56 // Int | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 

    val page: String = page_example // String | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
    
    val request = apiInstance.usageAudioTranscriptions(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling UsageApi#usageAudioTranscriptions")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling UsageApi#usageAudioTranscriptions")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startTime** | **Int**| Start time (Unix seconds) of the query time range, inclusive. |
 **endTime** | **Int**| End time (Unix seconds) of the query time range, exclusive. | [optional]
 **bucketWidth** | **String**| Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [enum: 1m, 1h, 1d]
 **projectIds** | [**Seq[String]**](String.md)| Return only usage for these projects. | [optional]
 **userIds** | [**Seq[String]**](String.md)| Return only usage for these users. | [optional]
 **apiKeyIds** | [**Seq[String]**](String.md)| Return only usage for these API keys. | [optional]
 **models** | [**Seq[String]**](String.md)| Return only usage for these models. | [optional]
 **groupBy** | [**Seq[String]**](String.md)| Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. | [optional] [enum: project_id, user_id, api_key_id, model]
 **limit** | **Int**| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional]
 **page** | **String**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional]

### Return type

ApiRequest[[**UsageResponse**](UsageResponse.md)]


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Usage data retrieved successfully. |  -  |


## usageCodeInterpreterSessions

> usageCodeInterpreterSessions(usageCodeInterpreterSessionsRequest): ApiRequest[UsageResponse]

Get code interpreter sessions usage details for the organization.

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
    val apiInstance = UsageApi("https://api.openai.com/v1")
    val startTime: Int = 56 // Int | Start time (Unix seconds) of the query time range, inclusive.

    val endTime: Int = 56 // Int | End time (Unix seconds) of the query time range, exclusive.

    val bucketWidth: String = bucketWidth_example // String | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.

    val projectIds: Seq[String] =  // Seq[String] | Return only usage for these projects.

    val groupBy: Seq[String] =  // Seq[String] | Group the usage data by the specified fields. Support fields include `project_id`.

    val limit: Int = 56 // Int | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 

    val page: String = page_example // String | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
    
    val request = apiInstance.usageCodeInterpreterSessions(startTime, endTime, bucketWidth, projectIds, groupBy, limit, page)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling UsageApi#usageCodeInterpreterSessions")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling UsageApi#usageCodeInterpreterSessions")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startTime** | **Int**| Start time (Unix seconds) of the query time range, inclusive. |
 **endTime** | **Int**| End time (Unix seconds) of the query time range, exclusive. | [optional]
 **bucketWidth** | **String**| Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [enum: 1m, 1h, 1d]
 **projectIds** | [**Seq[String]**](String.md)| Return only usage for these projects. | [optional]
 **groupBy** | [**Seq[String]**](String.md)| Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;. | [optional] [enum: project_id]
 **limit** | **Int**| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional]
 **page** | **String**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional]

### Return type

ApiRequest[[**UsageResponse**](UsageResponse.md)]


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Usage data retrieved successfully. |  -  |


## usageCompletions

> usageCompletions(usageCompletionsRequest): ApiRequest[UsageResponse]

Get completions usage details for the organization.

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
    val apiInstance = UsageApi("https://api.openai.com/v1")
    val startTime: Int = 56 // Int | Start time (Unix seconds) of the query time range, inclusive.

    val endTime: Int = 56 // Int | End time (Unix seconds) of the query time range, exclusive.

    val bucketWidth: String = bucketWidth_example // String | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.

    val projectIds: Seq[String] =  // Seq[String] | Return only usage for these projects.

    val userIds: Seq[String] =  // Seq[String] | Return only usage for these users.

    val apiKeyIds: Seq[String] =  // Seq[String] | Return only usage for these API keys.

    val models: Seq[String] =  // Seq[String] | Return only usage for these models.

    val batch: Boolean = true // Boolean | If `true`, return batch jobs only. If `false`, return non-batch jobs only. By default, return both. 

    val groupBy: Seq[String] =  // Seq[String] | Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model`, `batch` or any combination of them.

    val limit: Int = 56 // Int | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 

    val page: String = page_example // String | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
    
    val request = apiInstance.usageCompletions(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, batch, groupBy, limit, page)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling UsageApi#usageCompletions")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling UsageApi#usageCompletions")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startTime** | **Int**| Start time (Unix seconds) of the query time range, inclusive. |
 **endTime** | **Int**| End time (Unix seconds) of the query time range, exclusive. | [optional]
 **bucketWidth** | **String**| Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [enum: 1m, 1h, 1d]
 **projectIds** | [**Seq[String]**](String.md)| Return only usage for these projects. | [optional]
 **userIds** | [**Seq[String]**](String.md)| Return only usage for these users. | [optional]
 **apiKeyIds** | [**Seq[String]**](String.md)| Return only usage for these API keys. | [optional]
 **models** | [**Seq[String]**](String.md)| Return only usage for these models. | [optional]
 **batch** | **Boolean**| If &#x60;true&#x60;, return batch jobs only. If &#x60;false&#x60;, return non-batch jobs only. By default, return both.  | [optional]
 **groupBy** | [**Seq[String]**](String.md)| Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60;, &#x60;batch&#x60; or any combination of them. | [optional] [enum: project_id, user_id, api_key_id, model, batch]
 **limit** | **Int**| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional]
 **page** | **String**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional]

### Return type

ApiRequest[[**UsageResponse**](UsageResponse.md)]


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Usage data retrieved successfully. |  -  |


## usageCosts

> usageCosts(usageCostsRequest): ApiRequest[UsageResponse]

Get costs details for the organization.

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
    val apiInstance = UsageApi("https://api.openai.com/v1")
    val startTime: Int = 56 // Int | Start time (Unix seconds) of the query time range, inclusive.

    val endTime: Int = 56 // Int | End time (Unix seconds) of the query time range, exclusive.

    val bucketWidth: String = bucketWidth_example // String | Width of each time bucket in response. Currently only `1d` is supported, default to `1d`.

    val projectIds: Seq[String] =  // Seq[String] | Return only costs for these projects.

    val groupBy: Seq[String] =  // Seq[String] | Group the costs by the specified fields. Support fields include `project_id`, `line_item` and any combination of them.

    val limit: Int = 56 // Int | A limit on the number of buckets to be returned. Limit can range between 1 and 180, and the default is 7. 

    val page: String = page_example // String | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
    
    val request = apiInstance.usageCosts(startTime, endTime, bucketWidth, projectIds, groupBy, limit, page)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling UsageApi#usageCosts")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling UsageApi#usageCosts")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startTime** | **Int**| Start time (Unix seconds) of the query time range, inclusive. |
 **endTime** | **Int**| End time (Unix seconds) of the query time range, exclusive. | [optional]
 **bucketWidth** | **String**| Width of each time bucket in response. Currently only &#x60;1d&#x60; is supported, default to &#x60;1d&#x60;. | [optional] [enum: 1d]
 **projectIds** | [**Seq[String]**](String.md)| Return only costs for these projects. | [optional]
 **groupBy** | [**Seq[String]**](String.md)| Group the costs by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;line_item&#x60; and any combination of them. | [optional] [enum: project_id, line_item]
 **limit** | **Int**| A limit on the number of buckets to be returned. Limit can range between 1 and 180, and the default is 7.  | [optional]
 **page** | **String**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional]

### Return type

ApiRequest[[**UsageResponse**](UsageResponse.md)]


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Costs data retrieved successfully. |  -  |


## usageEmbeddings

> usageEmbeddings(usageEmbeddingsRequest): ApiRequest[UsageResponse]

Get embeddings usage details for the organization.

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
    val apiInstance = UsageApi("https://api.openai.com/v1")
    val startTime: Int = 56 // Int | Start time (Unix seconds) of the query time range, inclusive.

    val endTime: Int = 56 // Int | End time (Unix seconds) of the query time range, exclusive.

    val bucketWidth: String = bucketWidth_example // String | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.

    val projectIds: Seq[String] =  // Seq[String] | Return only usage for these projects.

    val userIds: Seq[String] =  // Seq[String] | Return only usage for these users.

    val apiKeyIds: Seq[String] =  // Seq[String] | Return only usage for these API keys.

    val models: Seq[String] =  // Seq[String] | Return only usage for these models.

    val groupBy: Seq[String] =  // Seq[String] | Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them.

    val limit: Int = 56 // Int | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 

    val page: String = page_example // String | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
    
    val request = apiInstance.usageEmbeddings(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling UsageApi#usageEmbeddings")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling UsageApi#usageEmbeddings")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startTime** | **Int**| Start time (Unix seconds) of the query time range, inclusive. |
 **endTime** | **Int**| End time (Unix seconds) of the query time range, exclusive. | [optional]
 **bucketWidth** | **String**| Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [enum: 1m, 1h, 1d]
 **projectIds** | [**Seq[String]**](String.md)| Return only usage for these projects. | [optional]
 **userIds** | [**Seq[String]**](String.md)| Return only usage for these users. | [optional]
 **apiKeyIds** | [**Seq[String]**](String.md)| Return only usage for these API keys. | [optional]
 **models** | [**Seq[String]**](String.md)| Return only usage for these models. | [optional]
 **groupBy** | [**Seq[String]**](String.md)| Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. | [optional] [enum: project_id, user_id, api_key_id, model]
 **limit** | **Int**| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional]
 **page** | **String**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional]

### Return type

ApiRequest[[**UsageResponse**](UsageResponse.md)]


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Usage data retrieved successfully. |  -  |


## usageImages

> usageImages(usageImagesRequest): ApiRequest[UsageResponse]

Get images usage details for the organization.

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
    val apiInstance = UsageApi("https://api.openai.com/v1")
    val startTime: Int = 56 // Int | Start time (Unix seconds) of the query time range, inclusive.

    val endTime: Int = 56 // Int | End time (Unix seconds) of the query time range, exclusive.

    val bucketWidth: String = bucketWidth_example // String | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.

    val sources: Seq[String] =  // Seq[String] | Return only usages for these sources. Possible values are `image.generation`, `image.edit`, `image.variation` or any combination of them.

    val sizes: Seq[String] =  // Seq[String] | Return only usages for these image sizes. Possible values are `256x256`, `512x512`, `1024x1024`, `1792x1792`, `1024x1792` or any combination of them.

    val projectIds: Seq[String] =  // Seq[String] | Return only usage for these projects.

    val userIds: Seq[String] =  // Seq[String] | Return only usage for these users.

    val apiKeyIds: Seq[String] =  // Seq[String] | Return only usage for these API keys.

    val models: Seq[String] =  // Seq[String] | Return only usage for these models.

    val groupBy: Seq[String] =  // Seq[String] | Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model`, `size`, `source` or any combination of them.

    val limit: Int = 56 // Int | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 

    val page: String = page_example // String | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
    
    val request = apiInstance.usageImages(startTime, endTime, bucketWidth, sources, sizes, projectIds, userIds, apiKeyIds, models, groupBy, limit, page)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling UsageApi#usageImages")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling UsageApi#usageImages")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startTime** | **Int**| Start time (Unix seconds) of the query time range, inclusive. |
 **endTime** | **Int**| End time (Unix seconds) of the query time range, exclusive. | [optional]
 **bucketWidth** | **String**| Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [enum: 1m, 1h, 1d]
 **sources** | [**Seq[String]**](String.md)| Return only usages for these sources. Possible values are &#x60;image.generation&#x60;, &#x60;image.edit&#x60;, &#x60;image.variation&#x60; or any combination of them. | [optional] [enum: image.generation, image.edit, image.variation]
 **sizes** | [**Seq[String]**](String.md)| Return only usages for these image sizes. Possible values are &#x60;256x256&#x60;, &#x60;512x512&#x60;, &#x60;1024x1024&#x60;, &#x60;1792x1792&#x60;, &#x60;1024x1792&#x60; or any combination of them. | [optional] [enum: 256x256, 512x512, 1024x1024, 1792x1792, 1024x1792]
 **projectIds** | [**Seq[String]**](String.md)| Return only usage for these projects. | [optional]
 **userIds** | [**Seq[String]**](String.md)| Return only usage for these users. | [optional]
 **apiKeyIds** | [**Seq[String]**](String.md)| Return only usage for these API keys. | [optional]
 **models** | [**Seq[String]**](String.md)| Return only usage for these models. | [optional]
 **groupBy** | [**Seq[String]**](String.md)| Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60;, &#x60;size&#x60;, &#x60;source&#x60; or any combination of them. | [optional] [enum: project_id, user_id, api_key_id, model, size, source]
 **limit** | **Int**| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional]
 **page** | **String**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional]

### Return type

ApiRequest[[**UsageResponse**](UsageResponse.md)]


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Usage data retrieved successfully. |  -  |


## usageModerations

> usageModerations(usageModerationsRequest): ApiRequest[UsageResponse]

Get moderations usage details for the organization.

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
    val apiInstance = UsageApi("https://api.openai.com/v1")
    val startTime: Int = 56 // Int | Start time (Unix seconds) of the query time range, inclusive.

    val endTime: Int = 56 // Int | End time (Unix seconds) of the query time range, exclusive.

    val bucketWidth: String = bucketWidth_example // String | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.

    val projectIds: Seq[String] =  // Seq[String] | Return only usage for these projects.

    val userIds: Seq[String] =  // Seq[String] | Return only usage for these users.

    val apiKeyIds: Seq[String] =  // Seq[String] | Return only usage for these API keys.

    val models: Seq[String] =  // Seq[String] | Return only usage for these models.

    val groupBy: Seq[String] =  // Seq[String] | Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them.

    val limit: Int = 56 // Int | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 

    val page: String = page_example // String | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
    
    val request = apiInstance.usageModerations(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling UsageApi#usageModerations")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling UsageApi#usageModerations")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startTime** | **Int**| Start time (Unix seconds) of the query time range, inclusive. |
 **endTime** | **Int**| End time (Unix seconds) of the query time range, exclusive. | [optional]
 **bucketWidth** | **String**| Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [enum: 1m, 1h, 1d]
 **projectIds** | [**Seq[String]**](String.md)| Return only usage for these projects. | [optional]
 **userIds** | [**Seq[String]**](String.md)| Return only usage for these users. | [optional]
 **apiKeyIds** | [**Seq[String]**](String.md)| Return only usage for these API keys. | [optional]
 **models** | [**Seq[String]**](String.md)| Return only usage for these models. | [optional]
 **groupBy** | [**Seq[String]**](String.md)| Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. | [optional] [enum: project_id, user_id, api_key_id, model]
 **limit** | **Int**| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional]
 **page** | **String**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional]

### Return type

ApiRequest[[**UsageResponse**](UsageResponse.md)]


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Usage data retrieved successfully. |  -  |


## usageVectorStores

> usageVectorStores(usageVectorStoresRequest): ApiRequest[UsageResponse]

Get vector stores usage details for the organization.

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
    val apiInstance = UsageApi("https://api.openai.com/v1")
    val startTime: Int = 56 // Int | Start time (Unix seconds) of the query time range, inclusive.

    val endTime: Int = 56 // Int | End time (Unix seconds) of the query time range, exclusive.

    val bucketWidth: String = bucketWidth_example // String | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.

    val projectIds: Seq[String] =  // Seq[String] | Return only usage for these projects.

    val groupBy: Seq[String] =  // Seq[String] | Group the usage data by the specified fields. Support fields include `project_id`.

    val limit: Int = 56 // Int | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 

    val page: String = page_example // String | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
    
    val request = apiInstance.usageVectorStores(startTime, endTime, bucketWidth, projectIds, groupBy, limit, page)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling UsageApi#usageVectorStores")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling UsageApi#usageVectorStores")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startTime** | **Int**| Start time (Unix seconds) of the query time range, inclusive. |
 **endTime** | **Int**| End time (Unix seconds) of the query time range, exclusive. | [optional]
 **bucketWidth** | **String**| Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [enum: 1m, 1h, 1d]
 **projectIds** | [**Seq[String]**](String.md)| Return only usage for these projects. | [optional]
 **groupBy** | [**Seq[String]**](String.md)| Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;. | [optional] [enum: project_id]
 **limit** | **Int**| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional]
 **page** | **String**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional]

### Return type

ApiRequest[[**UsageResponse**](UsageResponse.md)]


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Usage data retrieved successfully. |  -  |

