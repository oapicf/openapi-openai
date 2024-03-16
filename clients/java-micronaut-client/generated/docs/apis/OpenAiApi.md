# OpenAiApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelFineTune**](OpenAiApi.md#cancelFineTune) | **POST** /fine-tunes/{fine_tune_id}/cancel | Immediately cancel a fine-tune job.  |
| [**createChatCompletion**](OpenAiApi.md#createChatCompletion) | **POST** /chat/completions | Creates a model response for the given chat conversation. |
| [**createCompletion**](OpenAiApi.md#createCompletion) | **POST** /completions | Creates a completion for the provided prompt and parameters. |
| [**createEdit**](OpenAiApi.md#createEdit) | **POST** /edits | Creates a new edit for the provided input, instruction, and parameters. |
| [**createEmbedding**](OpenAiApi.md#createEmbedding) | **POST** /embeddings | Creates an embedding vector representing the input text. |
| [**createFile**](OpenAiApi.md#createFile) | **POST** /files | Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit.  |
| [**createFineTune**](OpenAiApi.md#createFineTune) | **POST** /fine-tunes | Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning)  |
| [**createImage**](OpenAiApi.md#createImage) | **POST** /images/generations | Creates an image given a prompt. |
| [**createImageEdit**](OpenAiApi.md#createImageEdit) | **POST** /images/edits | Creates an edited or extended image given an original image and a prompt. |
| [**createImageVariation**](OpenAiApi.md#createImageVariation) | **POST** /images/variations | Creates a variation of a given image. |
| [**createModeration**](OpenAiApi.md#createModeration) | **POST** /moderations | Classifies if text violates OpenAI&#39;s Content Policy |
| [**createTranscription**](OpenAiApi.md#createTranscription) | **POST** /audio/transcriptions | Transcribes audio into the input language. |
| [**createTranslation**](OpenAiApi.md#createTranslation) | **POST** /audio/translations | Translates audio into English. |
| [**deleteFile**](OpenAiApi.md#deleteFile) | **DELETE** /files/{file_id} | Delete a file. |
| [**deleteModel**](OpenAiApi.md#deleteModel) | **DELETE** /models/{model} | Delete a fine-tuned model. You must have the Owner role in your organization. |
| [**downloadFile**](OpenAiApi.md#downloadFile) | **GET** /files/{file_id}/content | Returns the contents of the specified file |
| [**listFiles**](OpenAiApi.md#listFiles) | **GET** /files | Returns a list of files that belong to the user&#39;s organization. |
| [**listFineTuneEvents**](OpenAiApi.md#listFineTuneEvents) | **GET** /fine-tunes/{fine_tune_id}/events | Get fine-grained status updates for a fine-tune job.  |
| [**listFineTunes**](OpenAiApi.md#listFineTunes) | **GET** /fine-tunes | List your organization&#39;s fine-tuning jobs  |
| [**listModels**](OpenAiApi.md#listModels) | **GET** /models | Lists the currently available models, and provides basic information about each one such as the owner and availability. |
| [**retrieveFile**](OpenAiApi.md#retrieveFile) | **GET** /files/{file_id} | Returns information about a specific file. |
| [**retrieveFineTune**](OpenAiApi.md#retrieveFineTune) | **GET** /fine-tunes/{fine_tune_id} | Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning)  |
| [**retrieveModel**](OpenAiApi.md#retrieveModel) | **GET** /models/{model} | Retrieves a model instance, providing basic information about the model such as the owner and permissioning. |


## Creating OpenAiApi

To initiate an instance of `OpenAiApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import org.openapitools.api.OpenAiApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(OpenAiApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    OpenAiApi openAiApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a id="cancelFineTune"></a>
# **cancelFineTune**
```java
Mono<FineTune> OpenAiApi.cancelFineTune(fineTuneId)
```

Immediately cancel a fine-tune job. 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fineTuneId** | `String`| The ID of the fine-tune job to cancel  | |


### Return type
[**FineTune**](FineTune.md)



### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="createChatCompletion"></a>
# **createChatCompletion**
```java
Mono<CreateChatCompletionResponse> OpenAiApi.createChatCompletion(createChatCompletionRequest)
```

Creates a model response for the given chat conversation.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createChatCompletionRequest** | [**CreateChatCompletionRequest**](CreateChatCompletionRequest.md)|  | |


### Return type
[**CreateChatCompletionResponse**](CreateChatCompletionResponse.md)



### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="createCompletion"></a>
# **createCompletion**
```java
Mono<CreateCompletionResponse> OpenAiApi.createCompletion(createCompletionRequest)
```

Creates a completion for the provided prompt and parameters.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createCompletionRequest** | [**CreateCompletionRequest**](CreateCompletionRequest.md)|  | |


### Return type
[**CreateCompletionResponse**](CreateCompletionResponse.md)



### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="createEdit"></a>
# **createEdit**
```java
Mono<CreateEditResponse> OpenAiApi.createEdit(createEditRequest)
```

Creates a new edit for the provided input, instruction, and parameters.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createEditRequest** | [**CreateEditRequest**](CreateEditRequest.md)|  | |


### Return type
[**CreateEditResponse**](CreateEditResponse.md)



### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="createEmbedding"></a>
# **createEmbedding**
```java
Mono<CreateEmbeddingResponse> OpenAiApi.createEmbedding(createEmbeddingRequest)
```

Creates an embedding vector representing the input text.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createEmbeddingRequest** | [**CreateEmbeddingRequest**](CreateEmbeddingRequest.md)|  | |


### Return type
[**CreateEmbeddingResponse**](CreateEmbeddingResponse.md)



### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="createFile"></a>
# **createFile**
```java
Mono<OpenAIFile> OpenAiApi.createFile(_filepurpose)
```

Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_file** | `File`| Name of the [JSON Lines](https://jsonlines.readthedocs.io/en/latest/) file to be uploaded.  If the &#x60;purpose&#x60; is set to \\\&quot;fine-tune\\\&quot;, each line is a JSON record with \\\&quot;prompt\\\&quot; and \\\&quot;completion\\\&quot; fields representing your [training examples](/docs/guides/fine-tuning/prepare-training-data).  | |
| **purpose** | `String`| The intended purpose of the uploaded documents.  Use \\\&quot;fine-tune\\\&quot; for [Fine-tuning](/docs/api-reference/fine-tunes). This allows us to validate the format of the uploaded file.  | |


### Return type
[**OpenAIFile**](OpenAIFile.md)



### HTTP request headers
 - **Content-Type**: `multipart/form-data`
 - **Accept**: `application/json`

<a id="createFineTune"></a>
# **createFineTune**
```java
Mono<FineTune> OpenAiApi.createFineTune(createFineTuneRequest)
```

Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createFineTuneRequest** | [**CreateFineTuneRequest**](CreateFineTuneRequest.md)|  | |


### Return type
[**FineTune**](FineTune.md)



### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="createImage"></a>
# **createImage**
```java
Mono<ImagesResponse> OpenAiApi.createImage(createImageRequest)
```

Creates an image given a prompt.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createImageRequest** | [**CreateImageRequest**](CreateImageRequest.md)|  | |


### Return type
[**ImagesResponse**](ImagesResponse.md)



### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="createImageEdit"></a>
# **createImageEdit**
```java
Mono<ImagesResponse> OpenAiApi.createImageEdit(imagepromptmasknsizeresponseFormatuser)
```

Creates an edited or extended image given an original image and a prompt.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **image** | `File`| The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask. | |
| **prompt** | `String`| A text description of the desired image(s). The maximum length is 1000 characters. | |
| **mask** | `File`| An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where &#x60;image&#x60; should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as &#x60;image&#x60;. | [optional parameter] |
| **n** | `Integer`| The number of images to generate. Must be between 1 and 10. | [optional parameter] [default to `1`] |
| **size** | `String`| The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. | [optional parameter] [default to `1024x1024`] [enum: `256x256`, `512x512`, `1024x1024`] |
| **responseFormat** | `String`| The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. | [optional parameter] [default to `url`] [enum: `url`, `b64_json`] |
| **user** | `String`| A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  | [optional parameter] |


### Return type
[**ImagesResponse**](ImagesResponse.md)



### HTTP request headers
 - **Content-Type**: `multipart/form-data`
 - **Accept**: `application/json`

<a id="createImageVariation"></a>
# **createImageVariation**
```java
Mono<ImagesResponse> OpenAiApi.createImageVariation(imagensizeresponseFormatuser)
```

Creates a variation of a given image.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **image** | `File`| The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square. | |
| **n** | `Integer`| The number of images to generate. Must be between 1 and 10. | [optional parameter] [default to `1`] |
| **size** | `String`| The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. | [optional parameter] [default to `1024x1024`] [enum: `256x256`, `512x512`, `1024x1024`] |
| **responseFormat** | `String`| The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. | [optional parameter] [default to `url`] [enum: `url`, `b64_json`] |
| **user** | `String`| A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  | [optional parameter] |


### Return type
[**ImagesResponse**](ImagesResponse.md)



### HTTP request headers
 - **Content-Type**: `multipart/form-data`
 - **Accept**: `application/json`

<a id="createModeration"></a>
# **createModeration**
```java
Mono<CreateModerationResponse> OpenAiApi.createModeration(createModerationRequest)
```

Classifies if text violates OpenAI&#39;s Content Policy

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createModerationRequest** | [**CreateModerationRequest**](CreateModerationRequest.md)|  | |


### Return type
[**CreateModerationResponse**](CreateModerationResponse.md)



### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="createTranscription"></a>
# **createTranscription**
```java
Mono<CreateTranscriptionResponse> OpenAiApi.createTranscription(_filemodelpromptresponseFormattemperaturelanguage)
```

Transcribes audio into the input language.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_file** | `File`| The audio file object (not file name) to transcribe, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm.  | |
| **model** | [**CreateTranscriptionRequestModel**](CreateTranscriptionRequestModel.md)|  | |
| **prompt** | `String`| An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language.  | [optional parameter] |
| **responseFormat** | `String`| The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt.  | [optional parameter] [default to `json`] |
| **temperature** | `BigDecimal`| The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  | [optional parameter] [default to `0`] |
| **language** | `String`| The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency.  | [optional parameter] |


### Return type
[**CreateTranscriptionResponse**](CreateTranscriptionResponse.md)



### HTTP request headers
 - **Content-Type**: `multipart/form-data`
 - **Accept**: `application/json`

<a id="createTranslation"></a>
# **createTranslation**
```java
Mono<CreateTranslationResponse> OpenAiApi.createTranslation(_filemodelpromptresponseFormattemperature)
```

Translates audio into English.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_file** | `File`| The audio file object (not file name) translate, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm.  | |
| **model** | [**CreateTranscriptionRequestModel**](CreateTranscriptionRequestModel.md)|  | |
| **prompt** | `String`| An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English.  | [optional parameter] |
| **responseFormat** | `String`| The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt.  | [optional parameter] [default to `json`] |
| **temperature** | `BigDecimal`| The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  | [optional parameter] [default to `0`] |


### Return type
[**CreateTranslationResponse**](CreateTranslationResponse.md)



### HTTP request headers
 - **Content-Type**: `multipart/form-data`
 - **Accept**: `application/json`

<a id="deleteFile"></a>
# **deleteFile**
```java
Mono<DeleteFileResponse> OpenAiApi.deleteFile(fileId)
```

Delete a file.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fileId** | `String`| The ID of the file to use for this request | |


### Return type
[**DeleteFileResponse**](DeleteFileResponse.md)



### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="deleteModel"></a>
# **deleteModel**
```java
Mono<DeleteModelResponse> OpenAiApi.deleteModel(model)
```

Delete a fine-tuned model. You must have the Owner role in your organization.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **model** | `String`| The model to delete | |


### Return type
[**DeleteModelResponse**](DeleteModelResponse.md)



### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="downloadFile"></a>
# **downloadFile**
```java
Mono<String> OpenAiApi.downloadFile(fileId)
```

Returns the contents of the specified file

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fileId** | `String`| The ID of the file to use for this request | |


### Return type
`String`



### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="listFiles"></a>
# **listFiles**
```java
Mono<ListFilesResponse> OpenAiApi.listFiles()
```

Returns a list of files that belong to the user&#39;s organization.



### Return type
[**ListFilesResponse**](ListFilesResponse.md)



### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="listFineTuneEvents"></a>
# **listFineTuneEvents**
```java
Mono<ListFineTuneEventsResponse> OpenAiApi.listFineTuneEvents(fineTuneIdstream)
```

Get fine-grained status updates for a fine-tune job. 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fineTuneId** | `String`| The ID of the fine-tune job to get events for.  | |
| **stream** | `Boolean`| Whether to stream events for the fine-tune job. If set to true, events will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available. The stream will terminate with a &#x60;data: [DONE]&#x60; message when the job is finished (succeeded, cancelled, or failed).  If set to false, only events generated so far will be returned.  | [optional parameter] [default to `false`] |


### Return type
[**ListFineTuneEventsResponse**](ListFineTuneEventsResponse.md)



### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="listFineTunes"></a>
# **listFineTunes**
```java
Mono<ListFineTunesResponse> OpenAiApi.listFineTunes()
```

List your organization&#39;s fine-tuning jobs 



### Return type
[**ListFineTunesResponse**](ListFineTunesResponse.md)



### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="listModels"></a>
# **listModels**
```java
Mono<ListModelsResponse> OpenAiApi.listModels()
```

Lists the currently available models, and provides basic information about each one such as the owner and availability.



### Return type
[**ListModelsResponse**](ListModelsResponse.md)



### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="retrieveFile"></a>
# **retrieveFile**
```java
Mono<OpenAIFile> OpenAiApi.retrieveFile(fileId)
```

Returns information about a specific file.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fileId** | `String`| The ID of the file to use for this request | |


### Return type
[**OpenAIFile**](OpenAIFile.md)



### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="retrieveFineTune"></a>
# **retrieveFineTune**
```java
Mono<FineTune> OpenAiApi.retrieveFineTune(fineTuneId)
```

Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fineTuneId** | `String`| The ID of the fine-tune job  | |


### Return type
[**FineTune**](FineTune.md)



### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="retrieveModel"></a>
# **retrieveModel**
```java
Mono<Model> OpenAiApi.retrieveModel(model)
```

Retrieves a model instance, providing basic information about the model such as the owner and permissioning.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **model** | `String`| The ID of the model to use for this request | |


### Return type
[**Model**](Model.md)



### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

