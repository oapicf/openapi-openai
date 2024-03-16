# OpenAIApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelFineTune**](OpenAIApi.md#cancelFineTune) | **POST** /fine-tunes/{fine_tune_id}/cancel | Immediately cancel a fine-tune job. 
[**cancelFineTuneWithHttpInfo**](OpenAIApi.md#cancelFineTuneWithHttpInfo) | **POST** /fine-tunes/{fine_tune_id}/cancel | Immediately cancel a fine-tune job. 
[**createChatCompletion**](OpenAIApi.md#createChatCompletion) | **POST** /chat/completions | Creates a model response for the given chat conversation.
[**createChatCompletionWithHttpInfo**](OpenAIApi.md#createChatCompletionWithHttpInfo) | **POST** /chat/completions | Creates a model response for the given chat conversation.
[**createCompletion**](OpenAIApi.md#createCompletion) | **POST** /completions | Creates a completion for the provided prompt and parameters.
[**createCompletionWithHttpInfo**](OpenAIApi.md#createCompletionWithHttpInfo) | **POST** /completions | Creates a completion for the provided prompt and parameters.
[**createEdit**](OpenAIApi.md#createEdit) | **POST** /edits | Creates a new edit for the provided input, instruction, and parameters.
[**createEditWithHttpInfo**](OpenAIApi.md#createEditWithHttpInfo) | **POST** /edits | Creates a new edit for the provided input, instruction, and parameters.
[**createEmbedding**](OpenAIApi.md#createEmbedding) | **POST** /embeddings | Creates an embedding vector representing the input text.
[**createEmbeddingWithHttpInfo**](OpenAIApi.md#createEmbeddingWithHttpInfo) | **POST** /embeddings | Creates an embedding vector representing the input text.
[**createFile**](OpenAIApi.md#createFile) | **POST** /files | Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 
[**createFileWithHttpInfo**](OpenAIApi.md#createFileWithHttpInfo) | **POST** /files | Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 
[**createFineTune**](OpenAIApi.md#createFineTune) | **POST** /fine-tunes | Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
[**createFineTuneWithHttpInfo**](OpenAIApi.md#createFineTuneWithHttpInfo) | **POST** /fine-tunes | Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
[**createImage**](OpenAIApi.md#createImage) | **POST** /images/generations | Creates an image given a prompt.
[**createImageWithHttpInfo**](OpenAIApi.md#createImageWithHttpInfo) | **POST** /images/generations | Creates an image given a prompt.
[**createImageEdit**](OpenAIApi.md#createImageEdit) | **POST** /images/edits | Creates an edited or extended image given an original image and a prompt.
[**createImageEditWithHttpInfo**](OpenAIApi.md#createImageEditWithHttpInfo) | **POST** /images/edits | Creates an edited or extended image given an original image and a prompt.
[**createImageVariation**](OpenAIApi.md#createImageVariation) | **POST** /images/variations | Creates a variation of a given image.
[**createImageVariationWithHttpInfo**](OpenAIApi.md#createImageVariationWithHttpInfo) | **POST** /images/variations | Creates a variation of a given image.
[**createModeration**](OpenAIApi.md#createModeration) | **POST** /moderations | Classifies if text violates OpenAI&#39;s Content Policy
[**createModerationWithHttpInfo**](OpenAIApi.md#createModerationWithHttpInfo) | **POST** /moderations | Classifies if text violates OpenAI&#39;s Content Policy
[**createTranscription**](OpenAIApi.md#createTranscription) | **POST** /audio/transcriptions | Transcribes audio into the input language.
[**createTranscriptionWithHttpInfo**](OpenAIApi.md#createTranscriptionWithHttpInfo) | **POST** /audio/transcriptions | Transcribes audio into the input language.
[**createTranslation**](OpenAIApi.md#createTranslation) | **POST** /audio/translations | Translates audio into English.
[**createTranslationWithHttpInfo**](OpenAIApi.md#createTranslationWithHttpInfo) | **POST** /audio/translations | Translates audio into English.
[**deleteFile**](OpenAIApi.md#deleteFile) | **DELETE** /files/{file_id} | Delete a file.
[**deleteFileWithHttpInfo**](OpenAIApi.md#deleteFileWithHttpInfo) | **DELETE** /files/{file_id} | Delete a file.
[**deleteModel**](OpenAIApi.md#deleteModel) | **DELETE** /models/{model} | Delete a fine-tuned model. You must have the Owner role in your organization.
[**deleteModelWithHttpInfo**](OpenAIApi.md#deleteModelWithHttpInfo) | **DELETE** /models/{model} | Delete a fine-tuned model. You must have the Owner role in your organization.
[**downloadFile**](OpenAIApi.md#downloadFile) | **GET** /files/{file_id}/content | Returns the contents of the specified file
[**downloadFileWithHttpInfo**](OpenAIApi.md#downloadFileWithHttpInfo) | **GET** /files/{file_id}/content | Returns the contents of the specified file
[**listFiles**](OpenAIApi.md#listFiles) | **GET** /files | Returns a list of files that belong to the user&#39;s organization.
[**listFilesWithHttpInfo**](OpenAIApi.md#listFilesWithHttpInfo) | **GET** /files | Returns a list of files that belong to the user&#39;s organization.
[**listFineTuneEvents**](OpenAIApi.md#listFineTuneEvents) | **GET** /fine-tunes/{fine_tune_id}/events | Get fine-grained status updates for a fine-tune job. 
[**listFineTuneEventsWithHttpInfo**](OpenAIApi.md#listFineTuneEventsWithHttpInfo) | **GET** /fine-tunes/{fine_tune_id}/events | Get fine-grained status updates for a fine-tune job. 
[**listFineTunes**](OpenAIApi.md#listFineTunes) | **GET** /fine-tunes | List your organization&#39;s fine-tuning jobs 
[**listFineTunesWithHttpInfo**](OpenAIApi.md#listFineTunesWithHttpInfo) | **GET** /fine-tunes | List your organization&#39;s fine-tuning jobs 
[**listModels**](OpenAIApi.md#listModels) | **GET** /models | Lists the currently available models, and provides basic information about each one such as the owner and availability.
[**listModelsWithHttpInfo**](OpenAIApi.md#listModelsWithHttpInfo) | **GET** /models | Lists the currently available models, and provides basic information about each one such as the owner and availability.
[**retrieveFile**](OpenAIApi.md#retrieveFile) | **GET** /files/{file_id} | Returns information about a specific file.
[**retrieveFileWithHttpInfo**](OpenAIApi.md#retrieveFileWithHttpInfo) | **GET** /files/{file_id} | Returns information about a specific file.
[**retrieveFineTune**](OpenAIApi.md#retrieveFineTune) | **GET** /fine-tunes/{fine_tune_id} | Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
[**retrieveFineTuneWithHttpInfo**](OpenAIApi.md#retrieveFineTuneWithHttpInfo) | **GET** /fine-tunes/{fine_tune_id} | Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
[**retrieveModel**](OpenAIApi.md#retrieveModel) | **GET** /models/{model} | Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
[**retrieveModelWithHttpInfo**](OpenAIApi.md#retrieveModelWithHttpInfo) | **GET** /models/{model} | Retrieves a model instance, providing basic information about the model such as the owner and permissioning.



## cancelFineTune

> cancelFineTune(cancelFineTuneRequest): ApiRequest[FineTune]

Immediately cancel a fine-tune job. 

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

    val apiInvoker = ApiInvoker()
    val apiInstance = OpenAIApi("https://api.openai.com/v1")
    val fineTuneId: String = ft-AF1WoRqd3aJAHsqc9NY7iL8F // String | The ID of the fine-tune job to cancel 
    
    val request = apiInstance.cancelFineTune(fineTuneId)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling OpenAIApi#cancelFineTune")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling OpenAIApi#cancelFineTune")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fineTuneId** | **String**| The ID of the fine-tune job to cancel  |

### Return type

ApiRequest[[**FineTune**](FineTune.md)]


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## createChatCompletion

> createChatCompletion(createChatCompletionRequest): ApiRequest[CreateChatCompletionResponse]

Creates a model response for the given chat conversation.

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

    val apiInvoker = ApiInvoker()
    val apiInstance = OpenAIApi("https://api.openai.com/v1")
    val createChatCompletionRequest: CreateChatCompletionRequest =  // CreateChatCompletionRequest | 
    
    val request = apiInstance.createChatCompletion(createChatCompletionRequest)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling OpenAIApi#createChatCompletion")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling OpenAIApi#createChatCompletion")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createChatCompletionRequest** | [**CreateChatCompletionRequest**](CreateChatCompletionRequest.md)|  |

### Return type

ApiRequest[[**CreateChatCompletionResponse**](CreateChatCompletionResponse.md)]


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## createCompletion

> createCompletion(createCompletionRequest): ApiRequest[CreateCompletionResponse]

Creates a completion for the provided prompt and parameters.

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

    val apiInvoker = ApiInvoker()
    val apiInstance = OpenAIApi("https://api.openai.com/v1")
    val createCompletionRequest: CreateCompletionRequest =  // CreateCompletionRequest | 
    
    val request = apiInstance.createCompletion(createCompletionRequest)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling OpenAIApi#createCompletion")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling OpenAIApi#createCompletion")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createCompletionRequest** | [**CreateCompletionRequest**](CreateCompletionRequest.md)|  |

### Return type

ApiRequest[[**CreateCompletionResponse**](CreateCompletionResponse.md)]


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## createEdit

> createEdit(createEditRequest): ApiRequest[CreateEditResponse]

Creates a new edit for the provided input, instruction, and parameters.

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

    val apiInvoker = ApiInvoker()
    val apiInstance = OpenAIApi("https://api.openai.com/v1")
    val createEditRequest: CreateEditRequest =  // CreateEditRequest | 
    
    val request = apiInstance.createEdit(createEditRequest)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling OpenAIApi#createEdit")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling OpenAIApi#createEdit")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createEditRequest** | [**CreateEditRequest**](CreateEditRequest.md)|  |

### Return type

ApiRequest[[**CreateEditResponse**](CreateEditResponse.md)]


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## createEmbedding

> createEmbedding(createEmbeddingRequest): ApiRequest[CreateEmbeddingResponse]

Creates an embedding vector representing the input text.

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

    val apiInvoker = ApiInvoker()
    val apiInstance = OpenAIApi("https://api.openai.com/v1")
    val createEmbeddingRequest: CreateEmbeddingRequest =  // CreateEmbeddingRequest | 
    
    val request = apiInstance.createEmbedding(createEmbeddingRequest)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling OpenAIApi#createEmbedding")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling OpenAIApi#createEmbedding")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createEmbeddingRequest** | [**CreateEmbeddingRequest**](CreateEmbeddingRequest.md)|  |

### Return type

ApiRequest[[**CreateEmbeddingResponse**](CreateEmbeddingResponse.md)]


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## createFile

> createFile(createFileRequest): ApiRequest[OpenAIFile]

Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 

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

    val apiInvoker = ApiInvoker()
    val apiInstance = OpenAIApi("https://api.openai.com/v1")
    val file: File = BINARY_DATA_HERE // File | Name of the [JSON Lines](https://jsonlines.readthedocs.io/en/latest/) file to be uploaded.  If the `purpose` is set to \\\"fine-tune\\\", each line is a JSON record with \\\"prompt\\\" and \\\"completion\\\" fields representing your [training examples](/docs/guides/fine-tuning/prepare-training-data). 

    val purpose: String = purpose_example // String | The intended purpose of the uploaded documents.  Use \\\"fine-tune\\\" for [Fine-tuning](/docs/api-reference/fine-tunes). This allows us to validate the format of the uploaded file. 
    
    val request = apiInstance.createFile(file, purpose)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling OpenAIApi#createFile")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling OpenAIApi#createFile")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **File**| Name of the [JSON Lines](https://jsonlines.readthedocs.io/en/latest/) file to be uploaded.  If the &#x60;purpose&#x60; is set to \\\&quot;fine-tune\\\&quot;, each line is a JSON record with \\\&quot;prompt\\\&quot; and \\\&quot;completion\\\&quot; fields representing your [training examples](/docs/guides/fine-tuning/prepare-training-data).  |
 **purpose** | **String**| The intended purpose of the uploaded documents.  Use \\\&quot;fine-tune\\\&quot; for [Fine-tuning](/docs/api-reference/fine-tunes). This allows us to validate the format of the uploaded file.  |

### Return type

ApiRequest[[**OpenAIFile**](OpenAIFile.md)]


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## createFineTune

> createFineTune(createFineTuneRequest): ApiRequest[FineTune]

Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 

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

    val apiInvoker = ApiInvoker()
    val apiInstance = OpenAIApi("https://api.openai.com/v1")
    val createFineTuneRequest: CreateFineTuneRequest =  // CreateFineTuneRequest | 
    
    val request = apiInstance.createFineTune(createFineTuneRequest)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling OpenAIApi#createFineTune")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling OpenAIApi#createFineTune")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createFineTuneRequest** | [**CreateFineTuneRequest**](CreateFineTuneRequest.md)|  |

### Return type

ApiRequest[[**FineTune**](FineTune.md)]


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## createImage

> createImage(createImageRequest): ApiRequest[ImagesResponse]

Creates an image given a prompt.

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

    val apiInvoker = ApiInvoker()
    val apiInstance = OpenAIApi("https://api.openai.com/v1")
    val createImageRequest: CreateImageRequest =  // CreateImageRequest | 
    
    val request = apiInstance.createImage(createImageRequest)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling OpenAIApi#createImage")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling OpenAIApi#createImage")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createImageRequest** | [**CreateImageRequest**](CreateImageRequest.md)|  |

### Return type

ApiRequest[[**ImagesResponse**](ImagesResponse.md)]


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## createImageEdit

> createImageEdit(createImageEditRequest): ApiRequest[ImagesResponse]

Creates an edited or extended image given an original image and a prompt.

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

    val apiInvoker = ApiInvoker()
    val apiInstance = OpenAIApi("https://api.openai.com/v1")
    val image: File = BINARY_DATA_HERE // File | The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask.

    val prompt: String = prompt_example // String | A text description of the desired image(s). The maximum length is 1000 characters.

    val mask: File = BINARY_DATA_HERE // File | An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where `image` should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as `image`.

    val `n`: Int = 56 // Int | The number of images to generate. Must be between 1 and 10.

    val size: String = size_example // String | The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.

    val responseFormat: String = responseFormat_example // String | The format in which the generated images are returned. Must be one of `url` or `b64_json`.

    val user: String = user_example // String | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
    
    val request = apiInstance.createImageEdit(image, prompt, mask, `n`, size, responseFormat, user)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling OpenAIApi#createImageEdit")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling OpenAIApi#createImageEdit")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **image** | **File**| The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask. |
 **prompt** | **String**| A text description of the desired image(s). The maximum length is 1000 characters. |
 **mask** | **File**| An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where &#x60;image&#x60; should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as &#x60;image&#x60;. | [optional]
 **`n`** | **Int**| The number of images to generate. Must be between 1 and 10. | [optional]
 **size** | **String**| The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. | [optional] [enum: 256x256, 512x512, 1024x1024]
 **responseFormat** | **String**| The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. | [optional] [enum: url, b64_json]
 **user** | **String**| A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  | [optional]

### Return type

ApiRequest[[**ImagesResponse**](ImagesResponse.md)]


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## createImageVariation

> createImageVariation(createImageVariationRequest): ApiRequest[ImagesResponse]

Creates a variation of a given image.

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

    val apiInvoker = ApiInvoker()
    val apiInstance = OpenAIApi("https://api.openai.com/v1")
    val image: File = BINARY_DATA_HERE // File | The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square.

    val `n`: Int = 56 // Int | The number of images to generate. Must be between 1 and 10.

    val size: String = size_example // String | The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.

    val responseFormat: String = responseFormat_example // String | The format in which the generated images are returned. Must be one of `url` or `b64_json`.

    val user: String = user_example // String | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
    
    val request = apiInstance.createImageVariation(image, `n`, size, responseFormat, user)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling OpenAIApi#createImageVariation")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling OpenAIApi#createImageVariation")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **image** | **File**| The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square. |
 **`n`** | **Int**| The number of images to generate. Must be between 1 and 10. | [optional]
 **size** | **String**| The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. | [optional] [enum: 256x256, 512x512, 1024x1024]
 **responseFormat** | **String**| The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. | [optional] [enum: url, b64_json]
 **user** | **String**| A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  | [optional]

### Return type

ApiRequest[[**ImagesResponse**](ImagesResponse.md)]


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## createModeration

> createModeration(createModerationRequest): ApiRequest[CreateModerationResponse]

Classifies if text violates OpenAI&#39;s Content Policy

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

    val apiInvoker = ApiInvoker()
    val apiInstance = OpenAIApi("https://api.openai.com/v1")
    val createModerationRequest: CreateModerationRequest =  // CreateModerationRequest | 
    
    val request = apiInstance.createModeration(createModerationRequest)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling OpenAIApi#createModeration")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling OpenAIApi#createModeration")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createModerationRequest** | [**CreateModerationRequest**](CreateModerationRequest.md)|  |

### Return type

ApiRequest[[**CreateModerationResponse**](CreateModerationResponse.md)]


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## createTranscription

> createTranscription(createTranscriptionRequest): ApiRequest[CreateTranscriptionResponse]

Transcribes audio into the input language.

### Example

```scala
// Import classes:
import 
import 
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

    val apiInvoker = ApiInvoker()
    val apiInstance = OpenAIApi("https://api.openai.com/v1")
    val file: File = BINARY_DATA_HERE // File | The audio file object (not file name) to transcribe, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm. 

    val model: CreateTranscriptionRequestModel =  // CreateTranscriptionRequestModel | 

    val prompt: String = prompt_example // String | An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language. 

    val responseFormat: String = responseFormat_example // String | The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt. 

    val temperature: BigDecimal = 8.14 // BigDecimal | The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. 

    val language: String = language_example // String | The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency. 
    
    val request = apiInstance.createTranscription(file, model, prompt, responseFormat, temperature, language)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling OpenAIApi#createTranscription")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling OpenAIApi#createTranscription")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **File**| The audio file object (not file name) to transcribe, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm.  |
 **model** | [**CreateTranscriptionRequestModel**](CreateTranscriptionRequestModel.md)|  |
 **prompt** | **String**| An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language.  | [optional]
 **responseFormat** | **String**| The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt.  | [optional]
 **temperature** | **BigDecimal**| The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  | [optional]
 **language** | **String**| The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency.  | [optional]

### Return type

ApiRequest[[**CreateTranscriptionResponse**](CreateTranscriptionResponse.md)]


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## createTranslation

> createTranslation(createTranslationRequest): ApiRequest[CreateTranslationResponse]

Translates audio into English.

### Example

```scala
// Import classes:
import 
import 
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

    val apiInvoker = ApiInvoker()
    val apiInstance = OpenAIApi("https://api.openai.com/v1")
    val file: File = BINARY_DATA_HERE // File | The audio file object (not file name) translate, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm. 

    val model: CreateTranscriptionRequestModel =  // CreateTranscriptionRequestModel | 

    val prompt: String = prompt_example // String | An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English. 

    val responseFormat: String = responseFormat_example // String | The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt. 

    val temperature: BigDecimal = 8.14 // BigDecimal | The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. 
    
    val request = apiInstance.createTranslation(file, model, prompt, responseFormat, temperature)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling OpenAIApi#createTranslation")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling OpenAIApi#createTranslation")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **File**| The audio file object (not file name) translate, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm.  |
 **model** | [**CreateTranscriptionRequestModel**](CreateTranscriptionRequestModel.md)|  |
 **prompt** | **String**| An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English.  | [optional]
 **responseFormat** | **String**| The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt.  | [optional]
 **temperature** | **BigDecimal**| The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  | [optional]

### Return type

ApiRequest[[**CreateTranslationResponse**](CreateTranslationResponse.md)]


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## deleteFile

> deleteFile(deleteFileRequest): ApiRequest[DeleteFileResponse]

Delete a file.

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

    val apiInvoker = ApiInvoker()
    val apiInstance = OpenAIApi("https://api.openai.com/v1")
    val fileId: String = fileId_example // String | The ID of the file to use for this request
    
    val request = apiInstance.deleteFile(fileId)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling OpenAIApi#deleteFile")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling OpenAIApi#deleteFile")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileId** | **String**| The ID of the file to use for this request |

### Return type

ApiRequest[[**DeleteFileResponse**](DeleteFileResponse.md)]


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## deleteModel

> deleteModel(deleteModelRequest): ApiRequest[DeleteModelResponse]

Delete a fine-tuned model. You must have the Owner role in your organization.

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

    val apiInvoker = ApiInvoker()
    val apiInstance = OpenAIApi("https://api.openai.com/v1")
    val model: String = curie:ft-acmeco-2021-03-03-21-44-20 // String | The model to delete
    
    val request = apiInstance.deleteModel(model)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling OpenAIApi#deleteModel")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling OpenAIApi#deleteModel")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | **String**| The model to delete |

### Return type

ApiRequest[[**DeleteModelResponse**](DeleteModelResponse.md)]


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## downloadFile

> downloadFile(downloadFileRequest): ApiRequest[String]

Returns the contents of the specified file

### Example

```scala
// Import classes:
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import akka.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher

    val apiInvoker = ApiInvoker()
    val apiInstance = OpenAIApi("https://api.openai.com/v1")
    val fileId: String = fileId_example // String | The ID of the file to use for this request
    
    val request = apiInstance.downloadFile(fileId)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling OpenAIApi#downloadFile")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling OpenAIApi#downloadFile")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileId** | **String**| The ID of the file to use for this request |

### Return type

ApiRequest[**String**]


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## listFiles

> listFiles(): ApiRequest[ListFilesResponse]

Returns a list of files that belong to the user&#39;s organization.

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

    val apiInvoker = ApiInvoker()
    val apiInstance = OpenAIApi("https://api.openai.com/v1")    
    val request = apiInstance.listFiles()
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling OpenAIApi#listFiles")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling OpenAIApi#listFiles")
            exception.printStackTrace();
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

ApiRequest[[**ListFilesResponse**](ListFilesResponse.md)]


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## listFineTuneEvents

> listFineTuneEvents(listFineTuneEventsRequest): ApiRequest[ListFineTuneEventsResponse]

Get fine-grained status updates for a fine-tune job. 

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

    val apiInvoker = ApiInvoker()
    val apiInstance = OpenAIApi("https://api.openai.com/v1")
    val fineTuneId: String = ft-AF1WoRqd3aJAHsqc9NY7iL8F // String | The ID of the fine-tune job to get events for. 

    val stream: Boolean = true // Boolean | Whether to stream events for the fine-tune job. If set to true, events will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available. The stream will terminate with a `data: [DONE]` message when the job is finished (succeeded, cancelled, or failed).  If set to false, only events generated so far will be returned. 
    
    val request = apiInstance.listFineTuneEvents(fineTuneId, stream)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling OpenAIApi#listFineTuneEvents")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling OpenAIApi#listFineTuneEvents")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fineTuneId** | **String**| The ID of the fine-tune job to get events for.  |
 **stream** | **Boolean**| Whether to stream events for the fine-tune job. If set to true, events will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available. The stream will terminate with a &#x60;data: [DONE]&#x60; message when the job is finished (succeeded, cancelled, or failed).  If set to false, only events generated so far will be returned.  | [optional]

### Return type

ApiRequest[[**ListFineTuneEventsResponse**](ListFineTuneEventsResponse.md)]


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## listFineTunes

> listFineTunes(): ApiRequest[ListFineTunesResponse]

List your organization&#39;s fine-tuning jobs 

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

    val apiInvoker = ApiInvoker()
    val apiInstance = OpenAIApi("https://api.openai.com/v1")    
    val request = apiInstance.listFineTunes()
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling OpenAIApi#listFineTunes")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling OpenAIApi#listFineTunes")
            exception.printStackTrace();
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

ApiRequest[[**ListFineTunesResponse**](ListFineTunesResponse.md)]


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## listModels

> listModels(): ApiRequest[ListModelsResponse]

Lists the currently available models, and provides basic information about each one such as the owner and availability.

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

    val apiInvoker = ApiInvoker()
    val apiInstance = OpenAIApi("https://api.openai.com/v1")    
    val request = apiInstance.listModels()
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling OpenAIApi#listModels")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling OpenAIApi#listModels")
            exception.printStackTrace();
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

ApiRequest[[**ListModelsResponse**](ListModelsResponse.md)]


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveFile

> retrieveFile(retrieveFileRequest): ApiRequest[OpenAIFile]

Returns information about a specific file.

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

    val apiInvoker = ApiInvoker()
    val apiInstance = OpenAIApi("https://api.openai.com/v1")
    val fileId: String = fileId_example // String | The ID of the file to use for this request
    
    val request = apiInstance.retrieveFile(fileId)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling OpenAIApi#retrieveFile")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling OpenAIApi#retrieveFile")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileId** | **String**| The ID of the file to use for this request |

### Return type

ApiRequest[[**OpenAIFile**](OpenAIFile.md)]


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveFineTune

> retrieveFineTune(retrieveFineTuneRequest): ApiRequest[FineTune]

Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 

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

    val apiInvoker = ApiInvoker()
    val apiInstance = OpenAIApi("https://api.openai.com/v1")
    val fineTuneId: String = ft-AF1WoRqd3aJAHsqc9NY7iL8F // String | The ID of the fine-tune job 
    
    val request = apiInstance.retrieveFineTune(fineTuneId)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling OpenAIApi#retrieveFineTune")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling OpenAIApi#retrieveFineTune")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fineTuneId** | **String**| The ID of the fine-tune job  |

### Return type

ApiRequest[[**FineTune**](FineTune.md)]


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveModel

> retrieveModel(retrieveModelRequest): ApiRequest[Model]

Retrieves a model instance, providing basic information about the model such as the owner and permissioning.

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

    val apiInvoker = ApiInvoker()
    val apiInstance = OpenAIApi("https://api.openai.com/v1")
    val model: String = text-davinci-001 // String | The ID of the model to use for this request
    
    val request = apiInstance.retrieveModel(model)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling OpenAIApi#retrieveModel")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling OpenAIApi#retrieveModel")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | **String**| The ID of the model to use for this request |

### Return type

ApiRequest[[**Model**](Model.md)]


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

