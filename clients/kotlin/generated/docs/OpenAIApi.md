# OpenAIApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelFineTune**](OpenAIApi.md#cancelFineTune) | **POST** /fine-tunes/{fine_tune_id}/cancel | Immediately cancel a fine-tune job. 
[**createChatCompletion**](OpenAIApi.md#createChatCompletion) | **POST** /chat/completions | Creates a model response for the given chat conversation.
[**createCompletion**](OpenAIApi.md#createCompletion) | **POST** /completions | Creates a completion for the provided prompt and parameters.
[**createEdit**](OpenAIApi.md#createEdit) | **POST** /edits | Creates a new edit for the provided input, instruction, and parameters.
[**createEmbedding**](OpenAIApi.md#createEmbedding) | **POST** /embeddings | Creates an embedding vector representing the input text.
[**createFile**](OpenAIApi.md#createFile) | **POST** /files | Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 
[**createFineTune**](OpenAIApi.md#createFineTune) | **POST** /fine-tunes | Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
[**createImage**](OpenAIApi.md#createImage) | **POST** /images/generations | Creates an image given a prompt.
[**createImageEdit**](OpenAIApi.md#createImageEdit) | **POST** /images/edits | Creates an edited or extended image given an original image and a prompt.
[**createImageVariation**](OpenAIApi.md#createImageVariation) | **POST** /images/variations | Creates a variation of a given image.
[**createModeration**](OpenAIApi.md#createModeration) | **POST** /moderations | Classifies if text violates OpenAI&#39;s Content Policy
[**createTranscription**](OpenAIApi.md#createTranscription) | **POST** /audio/transcriptions | Transcribes audio into the input language.
[**createTranslation**](OpenAIApi.md#createTranslation) | **POST** /audio/translations | Translates audio into English.
[**deleteFile**](OpenAIApi.md#deleteFile) | **DELETE** /files/{file_id} | Delete a file.
[**deleteModel**](OpenAIApi.md#deleteModel) | **DELETE** /models/{model} | Delete a fine-tuned model. You must have the Owner role in your organization.
[**downloadFile**](OpenAIApi.md#downloadFile) | **GET** /files/{file_id}/content | Returns the contents of the specified file
[**listFiles**](OpenAIApi.md#listFiles) | **GET** /files | Returns a list of files that belong to the user&#39;s organization.
[**listFineTuneEvents**](OpenAIApi.md#listFineTuneEvents) | **GET** /fine-tunes/{fine_tune_id}/events | Get fine-grained status updates for a fine-tune job. 
[**listFineTunes**](OpenAIApi.md#listFineTunes) | **GET** /fine-tunes | List your organization&#39;s fine-tuning jobs 
[**listModels**](OpenAIApi.md#listModels) | **GET** /models | Lists the currently available models, and provides basic information about each one such as the owner and availability.
[**retrieveFile**](OpenAIApi.md#retrieveFile) | **GET** /files/{file_id} | Returns information about a specific file.
[**retrieveFineTune**](OpenAIApi.md#retrieveFineTune) | **GET** /fine-tunes/{fine_tune_id} | Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
[**retrieveModel**](OpenAIApi.md#retrieveModel) | **GET** /models/{model} | Retrieves a model instance, providing basic information about the model such as the owner and permissioning.


<a id="cancelFineTune"></a>
# **cancelFineTune**
> FineTune cancelFineTune(fineTuneId)

Immediately cancel a fine-tune job. 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OpenAIApi()
val fineTuneId : kotlin.String = ft-AF1WoRqd3aJAHsqc9NY7iL8F // kotlin.String | The ID of the fine-tune job to cancel 
try {
    val result : FineTune = apiInstance.cancelFineTune(fineTuneId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OpenAIApi#cancelFineTune")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OpenAIApi#cancelFineTune")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fineTuneId** | **kotlin.String**| The ID of the fine-tune job to cancel  |

### Return type

[**FineTune**](FineTune.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="createChatCompletion"></a>
# **createChatCompletion**
> CreateChatCompletionResponse createChatCompletion(createChatCompletionRequest)

Creates a model response for the given chat conversation.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OpenAIApi()
val createChatCompletionRequest : CreateChatCompletionRequest =  // CreateChatCompletionRequest | 
try {
    val result : CreateChatCompletionResponse = apiInstance.createChatCompletion(createChatCompletionRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OpenAIApi#createChatCompletion")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OpenAIApi#createChatCompletion")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createChatCompletionRequest** | [**CreateChatCompletionRequest**](CreateChatCompletionRequest.md)|  |

### Return type

[**CreateChatCompletionResponse**](CreateChatCompletionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createCompletion"></a>
# **createCompletion**
> CreateCompletionResponse createCompletion(createCompletionRequest)

Creates a completion for the provided prompt and parameters.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OpenAIApi()
val createCompletionRequest : CreateCompletionRequest =  // CreateCompletionRequest | 
try {
    val result : CreateCompletionResponse = apiInstance.createCompletion(createCompletionRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OpenAIApi#createCompletion")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OpenAIApi#createCompletion")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createCompletionRequest** | [**CreateCompletionRequest**](CreateCompletionRequest.md)|  |

### Return type

[**CreateCompletionResponse**](CreateCompletionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createEdit"></a>
# **createEdit**
> CreateEditResponse createEdit(createEditRequest)

Creates a new edit for the provided input, instruction, and parameters.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OpenAIApi()
val createEditRequest : CreateEditRequest =  // CreateEditRequest | 
try {
    val result : CreateEditResponse = apiInstance.createEdit(createEditRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OpenAIApi#createEdit")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OpenAIApi#createEdit")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createEditRequest** | [**CreateEditRequest**](CreateEditRequest.md)|  |

### Return type

[**CreateEditResponse**](CreateEditResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createEmbedding"></a>
# **createEmbedding**
> CreateEmbeddingResponse createEmbedding(createEmbeddingRequest)

Creates an embedding vector representing the input text.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OpenAIApi()
val createEmbeddingRequest : CreateEmbeddingRequest =  // CreateEmbeddingRequest | 
try {
    val result : CreateEmbeddingResponse = apiInstance.createEmbedding(createEmbeddingRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OpenAIApi#createEmbedding")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OpenAIApi#createEmbedding")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createEmbeddingRequest** | [**CreateEmbeddingRequest**](CreateEmbeddingRequest.md)|  |

### Return type

[**CreateEmbeddingResponse**](CreateEmbeddingResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createFile"></a>
# **createFile**
> OpenAIFile createFile(file, purpose)

Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OpenAIApi()
val file : java.io.File = BINARY_DATA_HERE // java.io.File | Name of the [JSON Lines](https://jsonlines.readthedocs.io/en/latest/) file to be uploaded.  If the `purpose` is set to \\\"fine-tune\\\", each line is a JSON record with \\\"prompt\\\" and \\\"completion\\\" fields representing your [training examples](/docs/guides/fine-tuning/prepare-training-data). 
val purpose : kotlin.String = purpose_example // kotlin.String | The intended purpose of the uploaded documents.  Use \\\"fine-tune\\\" for [Fine-tuning](/docs/api-reference/fine-tunes). This allows us to validate the format of the uploaded file. 
try {
    val result : OpenAIFile = apiInstance.createFile(file, purpose)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OpenAIApi#createFile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OpenAIApi#createFile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **java.io.File**| Name of the [JSON Lines](https://jsonlines.readthedocs.io/en/latest/) file to be uploaded.  If the &#x60;purpose&#x60; is set to \\\&quot;fine-tune\\\&quot;, each line is a JSON record with \\\&quot;prompt\\\&quot; and \\\&quot;completion\\\&quot; fields representing your [training examples](/docs/guides/fine-tuning/prepare-training-data).  |
 **purpose** | **kotlin.String**| The intended purpose of the uploaded documents.  Use \\\&quot;fine-tune\\\&quot; for [Fine-tuning](/docs/api-reference/fine-tunes). This allows us to validate the format of the uploaded file.  |

### Return type

[**OpenAIFile**](OpenAIFile.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a id="createFineTune"></a>
# **createFineTune**
> FineTune createFineTune(createFineTuneRequest)

Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OpenAIApi()
val createFineTuneRequest : CreateFineTuneRequest =  // CreateFineTuneRequest | 
try {
    val result : FineTune = apiInstance.createFineTune(createFineTuneRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OpenAIApi#createFineTune")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OpenAIApi#createFineTune")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createFineTuneRequest** | [**CreateFineTuneRequest**](CreateFineTuneRequest.md)|  |

### Return type

[**FineTune**](FineTune.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createImage"></a>
# **createImage**
> ImagesResponse createImage(createImageRequest)

Creates an image given a prompt.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OpenAIApi()
val createImageRequest : CreateImageRequest =  // CreateImageRequest | 
try {
    val result : ImagesResponse = apiInstance.createImage(createImageRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OpenAIApi#createImage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OpenAIApi#createImage")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createImageRequest** | [**CreateImageRequest**](CreateImageRequest.md)|  |

### Return type

[**ImagesResponse**](ImagesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createImageEdit"></a>
# **createImageEdit**
> ImagesResponse createImageEdit(image, prompt, mask, n, size, responseFormat, user)

Creates an edited or extended image given an original image and a prompt.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OpenAIApi()
val image : java.io.File = BINARY_DATA_HERE // java.io.File | The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask.
val prompt : kotlin.String = prompt_example // kotlin.String | A text description of the desired image(s). The maximum length is 1000 characters.
val mask : java.io.File = BINARY_DATA_HERE // java.io.File | An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where `image` should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as `image`.
val n : kotlin.Int = 56 // kotlin.Int | The number of images to generate. Must be between 1 and 10.
val size : kotlin.String = size_example // kotlin.String | The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.
val responseFormat : kotlin.String = responseFormat_example // kotlin.String | The format in which the generated images are returned. Must be one of `url` or `b64_json`.
val user : kotlin.String = user_example // kotlin.String | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
try {
    val result : ImagesResponse = apiInstance.createImageEdit(image, prompt, mask, n, size, responseFormat, user)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OpenAIApi#createImageEdit")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OpenAIApi#createImageEdit")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **image** | **java.io.File**| The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask. |
 **prompt** | **kotlin.String**| A text description of the desired image(s). The maximum length is 1000 characters. |
 **mask** | **java.io.File**| An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where &#x60;image&#x60; should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as &#x60;image&#x60;. | [optional]
 **n** | **kotlin.Int**| The number of images to generate. Must be between 1 and 10. | [optional] [default to 1]
 **size** | **kotlin.String**| The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. | [optional] [default to 1024x1024] [enum: 256x256, 512x512, 1024x1024]
 **responseFormat** | **kotlin.String**| The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. | [optional] [default to url] [enum: url, b64_json]
 **user** | **kotlin.String**| A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  | [optional]

### Return type

[**ImagesResponse**](ImagesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a id="createImageVariation"></a>
# **createImageVariation**
> ImagesResponse createImageVariation(image, n, size, responseFormat, user)

Creates a variation of a given image.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OpenAIApi()
val image : java.io.File = BINARY_DATA_HERE // java.io.File | The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square.
val n : kotlin.Int = 56 // kotlin.Int | The number of images to generate. Must be between 1 and 10.
val size : kotlin.String = size_example // kotlin.String | The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.
val responseFormat : kotlin.String = responseFormat_example // kotlin.String | The format in which the generated images are returned. Must be one of `url` or `b64_json`.
val user : kotlin.String = user_example // kotlin.String | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
try {
    val result : ImagesResponse = apiInstance.createImageVariation(image, n, size, responseFormat, user)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OpenAIApi#createImageVariation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OpenAIApi#createImageVariation")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **image** | **java.io.File**| The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square. |
 **n** | **kotlin.Int**| The number of images to generate. Must be between 1 and 10. | [optional] [default to 1]
 **size** | **kotlin.String**| The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. | [optional] [default to 1024x1024] [enum: 256x256, 512x512, 1024x1024]
 **responseFormat** | **kotlin.String**| The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. | [optional] [default to url] [enum: url, b64_json]
 **user** | **kotlin.String**| A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  | [optional]

### Return type

[**ImagesResponse**](ImagesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a id="createModeration"></a>
# **createModeration**
> CreateModerationResponse createModeration(createModerationRequest)

Classifies if text violates OpenAI&#39;s Content Policy

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OpenAIApi()
val createModerationRequest : CreateModerationRequest =  // CreateModerationRequest | 
try {
    val result : CreateModerationResponse = apiInstance.createModeration(createModerationRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OpenAIApi#createModeration")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OpenAIApi#createModeration")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createModerationRequest** | [**CreateModerationRequest**](CreateModerationRequest.md)|  |

### Return type

[**CreateModerationResponse**](CreateModerationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createTranscription"></a>
# **createTranscription**
> CreateTranscriptionResponse createTranscription(file, model, prompt, responseFormat, temperature, language)

Transcribes audio into the input language.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OpenAIApi()
val file : java.io.File = BINARY_DATA_HERE // java.io.File | The audio file object (not file name) to transcribe, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm. 
val model : CreateTranscriptionRequestModel =  // CreateTranscriptionRequestModel | 
val prompt : kotlin.String = prompt_example // kotlin.String | An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language. 
val responseFormat : kotlin.String = responseFormat_example // kotlin.String | The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt. 
val temperature : java.math.BigDecimal = 8.14 // java.math.BigDecimal | The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. 
val language : kotlin.String = language_example // kotlin.String | The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency. 
try {
    val result : CreateTranscriptionResponse = apiInstance.createTranscription(file, model, prompt, responseFormat, temperature, language)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OpenAIApi#createTranscription")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OpenAIApi#createTranscription")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **java.io.File**| The audio file object (not file name) to transcribe, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm.  |
 **model** | [**CreateTranscriptionRequestModel**](CreateTranscriptionRequestModel.md)|  |
 **prompt** | **kotlin.String**| An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language.  | [optional]
 **responseFormat** | **kotlin.String**| The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt.  | [optional] [default to &quot;json&quot;]
 **temperature** | **java.math.BigDecimal**| The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  | [optional] [default to 0]
 **language** | **kotlin.String**| The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency.  | [optional]

### Return type

[**CreateTranscriptionResponse**](CreateTranscriptionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a id="createTranslation"></a>
# **createTranslation**
> CreateTranslationResponse createTranslation(file, model, prompt, responseFormat, temperature)

Translates audio into English.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OpenAIApi()
val file : java.io.File = BINARY_DATA_HERE // java.io.File | The audio file object (not file name) translate, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm. 
val model : CreateTranscriptionRequestModel =  // CreateTranscriptionRequestModel | 
val prompt : kotlin.String = prompt_example // kotlin.String | An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English. 
val responseFormat : kotlin.String = responseFormat_example // kotlin.String | The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt. 
val temperature : java.math.BigDecimal = 8.14 // java.math.BigDecimal | The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. 
try {
    val result : CreateTranslationResponse = apiInstance.createTranslation(file, model, prompt, responseFormat, temperature)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OpenAIApi#createTranslation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OpenAIApi#createTranslation")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **java.io.File**| The audio file object (not file name) translate, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm.  |
 **model** | [**CreateTranscriptionRequestModel**](CreateTranscriptionRequestModel.md)|  |
 **prompt** | **kotlin.String**| An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English.  | [optional]
 **responseFormat** | **kotlin.String**| The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt.  | [optional] [default to &quot;json&quot;]
 **temperature** | **java.math.BigDecimal**| The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  | [optional] [default to 0]

### Return type

[**CreateTranslationResponse**](CreateTranslationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a id="deleteFile"></a>
# **deleteFile**
> DeleteFileResponse deleteFile(fileId)

Delete a file.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OpenAIApi()
val fileId : kotlin.String = fileId_example // kotlin.String | The ID of the file to use for this request
try {
    val result : DeleteFileResponse = apiInstance.deleteFile(fileId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OpenAIApi#deleteFile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OpenAIApi#deleteFile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileId** | **kotlin.String**| The ID of the file to use for this request |

### Return type

[**DeleteFileResponse**](DeleteFileResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="deleteModel"></a>
# **deleteModel**
> DeleteModelResponse deleteModel(model)

Delete a fine-tuned model. You must have the Owner role in your organization.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OpenAIApi()
val model : kotlin.String = curie:ft-acmeco-2021-03-03-21-44-20 // kotlin.String | The model to delete
try {
    val result : DeleteModelResponse = apiInstance.deleteModel(model)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OpenAIApi#deleteModel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OpenAIApi#deleteModel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | **kotlin.String**| The model to delete |

### Return type

[**DeleteModelResponse**](DeleteModelResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="downloadFile"></a>
# **downloadFile**
> kotlin.String downloadFile(fileId)

Returns the contents of the specified file

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OpenAIApi()
val fileId : kotlin.String = fileId_example // kotlin.String | The ID of the file to use for this request
try {
    val result : kotlin.String = apiInstance.downloadFile(fileId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OpenAIApi#downloadFile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OpenAIApi#downloadFile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileId** | **kotlin.String**| The ID of the file to use for this request |

### Return type

**kotlin.String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="listFiles"></a>
# **listFiles**
> ListFilesResponse listFiles()

Returns a list of files that belong to the user&#39;s organization.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OpenAIApi()
try {
    val result : ListFilesResponse = apiInstance.listFiles()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OpenAIApi#listFiles")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OpenAIApi#listFiles")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListFilesResponse**](ListFilesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="listFineTuneEvents"></a>
# **listFineTuneEvents**
> ListFineTuneEventsResponse listFineTuneEvents(fineTuneId, stream)

Get fine-grained status updates for a fine-tune job. 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OpenAIApi()
val fineTuneId : kotlin.String = ft-AF1WoRqd3aJAHsqc9NY7iL8F // kotlin.String | The ID of the fine-tune job to get events for. 
val stream : kotlin.Boolean = true // kotlin.Boolean | Whether to stream events for the fine-tune job. If set to true, events will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available. The stream will terminate with a `data: [DONE]` message when the job is finished (succeeded, cancelled, or failed).  If set to false, only events generated so far will be returned. 
try {
    val result : ListFineTuneEventsResponse = apiInstance.listFineTuneEvents(fineTuneId, stream)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OpenAIApi#listFineTuneEvents")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OpenAIApi#listFineTuneEvents")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fineTuneId** | **kotlin.String**| The ID of the fine-tune job to get events for.  |
 **stream** | **kotlin.Boolean**| Whether to stream events for the fine-tune job. If set to true, events will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available. The stream will terminate with a &#x60;data: [DONE]&#x60; message when the job is finished (succeeded, cancelled, or failed).  If set to false, only events generated so far will be returned.  | [optional] [default to false]

### Return type

[**ListFineTuneEventsResponse**](ListFineTuneEventsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="listFineTunes"></a>
# **listFineTunes**
> ListFineTunesResponse listFineTunes()

List your organization&#39;s fine-tuning jobs 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OpenAIApi()
try {
    val result : ListFineTunesResponse = apiInstance.listFineTunes()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OpenAIApi#listFineTunes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OpenAIApi#listFineTunes")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListFineTunesResponse**](ListFineTunesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="listModels"></a>
# **listModels**
> ListModelsResponse listModels()

Lists the currently available models, and provides basic information about each one such as the owner and availability.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OpenAIApi()
try {
    val result : ListModelsResponse = apiInstance.listModels()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OpenAIApi#listModels")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OpenAIApi#listModels")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListModelsResponse**](ListModelsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="retrieveFile"></a>
# **retrieveFile**
> OpenAIFile retrieveFile(fileId)

Returns information about a specific file.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OpenAIApi()
val fileId : kotlin.String = fileId_example // kotlin.String | The ID of the file to use for this request
try {
    val result : OpenAIFile = apiInstance.retrieveFile(fileId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OpenAIApi#retrieveFile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OpenAIApi#retrieveFile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileId** | **kotlin.String**| The ID of the file to use for this request |

### Return type

[**OpenAIFile**](OpenAIFile.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="retrieveFineTune"></a>
# **retrieveFineTune**
> FineTune retrieveFineTune(fineTuneId)

Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OpenAIApi()
val fineTuneId : kotlin.String = ft-AF1WoRqd3aJAHsqc9NY7iL8F // kotlin.String | The ID of the fine-tune job 
try {
    val result : FineTune = apiInstance.retrieveFineTune(fineTuneId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OpenAIApi#retrieveFineTune")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OpenAIApi#retrieveFineTune")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fineTuneId** | **kotlin.String**| The ID of the fine-tune job  |

### Return type

[**FineTune**](FineTune.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="retrieveModel"></a>
# **retrieveModel**
> Model retrieveModel(model)

Retrieves a model instance, providing basic information about the model such as the owner and permissioning.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OpenAIApi()
val model : kotlin.String = text-davinci-001 // kotlin.String | The ID of the model to use for this request
try {
    val result : Model = apiInstance.retrieveModel(model)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OpenAIApi#retrieveModel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OpenAIApi#retrieveModel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | **kotlin.String**| The ID of the model to use for this request |

### Return type

[**Model**](Model.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

