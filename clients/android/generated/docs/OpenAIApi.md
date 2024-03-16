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



## cancelFineTune

> FineTune cancelFineTune(fineTuneId)

Immediately cancel a fine-tune job. 

### Example

```java
// Import classes:
//import org.openapitools.client.api.OpenAIApi;

OpenAIApi apiInstance = new OpenAIApi();
String fineTuneId = ft-AF1WoRqd3aJAHsqc9NY7iL8F; // String | The ID of the fine-tune job to cancel 
try {
    FineTune result = apiInstance.cancelFineTune(fineTuneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OpenAIApi#cancelFineTune");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fineTuneId** | **String**| The ID of the fine-tune job to cancel  | [default to null]

### Return type

[**FineTune**](FineTune.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## createChatCompletion

> CreateChatCompletionResponse createChatCompletion(createChatCompletionRequest)

Creates a model response for the given chat conversation.

### Example

```java
// Import classes:
//import org.openapitools.client.api.OpenAIApi;

OpenAIApi apiInstance = new OpenAIApi();
CreateChatCompletionRequest createChatCompletionRequest = new CreateChatCompletionRequest(); // CreateChatCompletionRequest | 
try {
    CreateChatCompletionResponse result = apiInstance.createChatCompletion(createChatCompletionRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OpenAIApi#createChatCompletion");
    e.printStackTrace();
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


## createCompletion

> CreateCompletionResponse createCompletion(createCompletionRequest)

Creates a completion for the provided prompt and parameters.

### Example

```java
// Import classes:
//import org.openapitools.client.api.OpenAIApi;

OpenAIApi apiInstance = new OpenAIApi();
CreateCompletionRequest createCompletionRequest = new CreateCompletionRequest(); // CreateCompletionRequest | 
try {
    CreateCompletionResponse result = apiInstance.createCompletion(createCompletionRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OpenAIApi#createCompletion");
    e.printStackTrace();
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


## createEdit

> CreateEditResponse createEdit(createEditRequest)

Creates a new edit for the provided input, instruction, and parameters.

### Example

```java
// Import classes:
//import org.openapitools.client.api.OpenAIApi;

OpenAIApi apiInstance = new OpenAIApi();
CreateEditRequest createEditRequest = new CreateEditRequest(); // CreateEditRequest | 
try {
    CreateEditResponse result = apiInstance.createEdit(createEditRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OpenAIApi#createEdit");
    e.printStackTrace();
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


## createEmbedding

> CreateEmbeddingResponse createEmbedding(createEmbeddingRequest)

Creates an embedding vector representing the input text.

### Example

```java
// Import classes:
//import org.openapitools.client.api.OpenAIApi;

OpenAIApi apiInstance = new OpenAIApi();
CreateEmbeddingRequest createEmbeddingRequest = new CreateEmbeddingRequest(); // CreateEmbeddingRequest | 
try {
    CreateEmbeddingResponse result = apiInstance.createEmbedding(createEmbeddingRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OpenAIApi#createEmbedding");
    e.printStackTrace();
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


## createFile

> OpenAIFile createFile(file, purpose)

Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 

### Example

```java
// Import classes:
//import org.openapitools.client.api.OpenAIApi;

OpenAIApi apiInstance = new OpenAIApi();
File file = null; // File | Name of the [JSON Lines](https://jsonlines.readthedocs.io/en/latest/) file to be uploaded.  If the `purpose` is set to \\\"fine-tune\\\", each line is a JSON record with \\\"prompt\\\" and \\\"completion\\\" fields representing your [training examples](/docs/guides/fine-tuning/prepare-training-data). 
String purpose = null; // String | The intended purpose of the uploaded documents.  Use \\\"fine-tune\\\" for [Fine-tuning](/docs/api-reference/fine-tunes). This allows us to validate the format of the uploaded file. 
try {
    OpenAIFile result = apiInstance.createFile(file, purpose);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OpenAIApi#createFile");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **File**| Name of the [JSON Lines](https://jsonlines.readthedocs.io/en/latest/) file to be uploaded.  If the &#x60;purpose&#x60; is set to \\\&quot;fine-tune\\\&quot;, each line is a JSON record with \\\&quot;prompt\\\&quot; and \\\&quot;completion\\\&quot; fields representing your [training examples](/docs/guides/fine-tuning/prepare-training-data).  | [default to null]
 **purpose** | **String**| The intended purpose of the uploaded documents.  Use \\\&quot;fine-tune\\\&quot; for [Fine-tuning](/docs/api-reference/fine-tunes). This allows us to validate the format of the uploaded file.  | [default to null]

### Return type

[**OpenAIFile**](OpenAIFile.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json


## createFineTune

> FineTune createFineTune(createFineTuneRequest)

Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 

### Example

```java
// Import classes:
//import org.openapitools.client.api.OpenAIApi;

OpenAIApi apiInstance = new OpenAIApi();
CreateFineTuneRequest createFineTuneRequest = new CreateFineTuneRequest(); // CreateFineTuneRequest | 
try {
    FineTune result = apiInstance.createFineTune(createFineTuneRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OpenAIApi#createFineTune");
    e.printStackTrace();
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


## createImage

> ImagesResponse createImage(createImageRequest)

Creates an image given a prompt.

### Example

```java
// Import classes:
//import org.openapitools.client.api.OpenAIApi;

OpenAIApi apiInstance = new OpenAIApi();
CreateImageRequest createImageRequest = new CreateImageRequest(); // CreateImageRequest | 
try {
    ImagesResponse result = apiInstance.createImage(createImageRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OpenAIApi#createImage");
    e.printStackTrace();
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


## createImageEdit

> ImagesResponse createImageEdit(image, prompt, mask, n, size, responseFormat, user)

Creates an edited or extended image given an original image and a prompt.

### Example

```java
// Import classes:
//import org.openapitools.client.api.OpenAIApi;

OpenAIApi apiInstance = new OpenAIApi();
File image = null; // File | The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask.
String prompt = null; // String | A text description of the desired image(s). The maximum length is 1000 characters.
File mask = null; // File | An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where `image` should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as `image`.
Integer n = 1; // Integer | The number of images to generate. Must be between 1 and 10.
String size = 1024x1024; // String | The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.
String responseFormat = url; // String | The format in which the generated images are returned. Must be one of `url` or `b64_json`.
String user = null; // String | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
try {
    ImagesResponse result = apiInstance.createImageEdit(image, prompt, mask, n, size, responseFormat, user);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OpenAIApi#createImageEdit");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **image** | **File**| The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask. | [default to null]
 **prompt** | **String**| A text description of the desired image(s). The maximum length is 1000 characters. | [default to null]
 **mask** | **File**| An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where &#x60;image&#x60; should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as &#x60;image&#x60;. | [optional] [default to null]
 **n** | **Integer**| The number of images to generate. Must be between 1 and 10. | [optional] [default to 1]
 **size** | **String**| The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. | [optional] [default to 1024x1024] [enum: 256x256, 512x512, 1024x1024]
 **responseFormat** | **String**| The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. | [optional] [default to url] [enum: url, b64_json]
 **user** | **String**| A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  | [optional] [default to null]

### Return type

[**ImagesResponse**](ImagesResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json


## createImageVariation

> ImagesResponse createImageVariation(image, n, size, responseFormat, user)

Creates a variation of a given image.

### Example

```java
// Import classes:
//import org.openapitools.client.api.OpenAIApi;

OpenAIApi apiInstance = new OpenAIApi();
File image = null; // File | The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square.
Integer n = 1; // Integer | The number of images to generate. Must be between 1 and 10.
String size = 1024x1024; // String | The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.
String responseFormat = url; // String | The format in which the generated images are returned. Must be one of `url` or `b64_json`.
String user = null; // String | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
try {
    ImagesResponse result = apiInstance.createImageVariation(image, n, size, responseFormat, user);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OpenAIApi#createImageVariation");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **image** | **File**| The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square. | [default to null]
 **n** | **Integer**| The number of images to generate. Must be between 1 and 10. | [optional] [default to 1]
 **size** | **String**| The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. | [optional] [default to 1024x1024] [enum: 256x256, 512x512, 1024x1024]
 **responseFormat** | **String**| The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. | [optional] [default to url] [enum: url, b64_json]
 **user** | **String**| A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  | [optional] [default to null]

### Return type

[**ImagesResponse**](ImagesResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json


## createModeration

> CreateModerationResponse createModeration(createModerationRequest)

Classifies if text violates OpenAI&#39;s Content Policy

### Example

```java
// Import classes:
//import org.openapitools.client.api.OpenAIApi;

OpenAIApi apiInstance = new OpenAIApi();
CreateModerationRequest createModerationRequest = new CreateModerationRequest(); // CreateModerationRequest | 
try {
    CreateModerationResponse result = apiInstance.createModeration(createModerationRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OpenAIApi#createModeration");
    e.printStackTrace();
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


## createTranscription

> CreateTranscriptionResponse createTranscription(file, model, prompt, responseFormat, temperature, language)

Transcribes audio into the input language.

### Example

```java
// Import classes:
//import org.openapitools.client.api.OpenAIApi;

OpenAIApi apiInstance = new OpenAIApi();
File file = null; // File | The audio file object (not file name) to transcribe, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm. 
CreateTranscriptionRequestModel model = null; // CreateTranscriptionRequestModel | 
String prompt = null; // String | An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language. 
String responseFormat = json; // String | The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt. 
BigDecimal temperature = 0; // BigDecimal | The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. 
String language = null; // String | The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency. 
try {
    CreateTranscriptionResponse result = apiInstance.createTranscription(file, model, prompt, responseFormat, temperature, language);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OpenAIApi#createTranscription");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **File**| The audio file object (not file name) to transcribe, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm.  | [default to null]
 **model** | [**CreateTranscriptionRequestModel**](CreateTranscriptionRequestModel.md)|  | [default to null]
 **prompt** | **String**| An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language.  | [optional] [default to null]
 **responseFormat** | **String**| The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt.  | [optional] [default to json]
 **temperature** | **BigDecimal**| The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  | [optional] [default to 0]
 **language** | **String**| The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency.  | [optional] [default to null]

### Return type

[**CreateTranscriptionResponse**](CreateTranscriptionResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json


## createTranslation

> CreateTranslationResponse createTranslation(file, model, prompt, responseFormat, temperature)

Translates audio into English.

### Example

```java
// Import classes:
//import org.openapitools.client.api.OpenAIApi;

OpenAIApi apiInstance = new OpenAIApi();
File file = null; // File | The audio file object (not file name) translate, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm. 
CreateTranscriptionRequestModel model = null; // CreateTranscriptionRequestModel | 
String prompt = null; // String | An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English. 
String responseFormat = json; // String | The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt. 
BigDecimal temperature = 0; // BigDecimal | The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. 
try {
    CreateTranslationResponse result = apiInstance.createTranslation(file, model, prompt, responseFormat, temperature);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OpenAIApi#createTranslation");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **File**| The audio file object (not file name) translate, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm.  | [default to null]
 **model** | [**CreateTranscriptionRequestModel**](CreateTranscriptionRequestModel.md)|  | [default to null]
 **prompt** | **String**| An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English.  | [optional] [default to null]
 **responseFormat** | **String**| The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt.  | [optional] [default to json]
 **temperature** | **BigDecimal**| The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  | [optional] [default to 0]

### Return type

[**CreateTranslationResponse**](CreateTranslationResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json


## deleteFile

> DeleteFileResponse deleteFile(fileId)

Delete a file.

### Example

```java
// Import classes:
//import org.openapitools.client.api.OpenAIApi;

OpenAIApi apiInstance = new OpenAIApi();
String fileId = null; // String | The ID of the file to use for this request
try {
    DeleteFileResponse result = apiInstance.deleteFile(fileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OpenAIApi#deleteFile");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileId** | **String**| The ID of the file to use for this request | [default to null]

### Return type

[**DeleteFileResponse**](DeleteFileResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## deleteModel

> DeleteModelResponse deleteModel(model)

Delete a fine-tuned model. You must have the Owner role in your organization.

### Example

```java
// Import classes:
//import org.openapitools.client.api.OpenAIApi;

OpenAIApi apiInstance = new OpenAIApi();
String model = curie:ft-acmeco-2021-03-03-21-44-20; // String | The model to delete
try {
    DeleteModelResponse result = apiInstance.deleteModel(model);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OpenAIApi#deleteModel");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | **String**| The model to delete | [default to null]

### Return type

[**DeleteModelResponse**](DeleteModelResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## downloadFile

> String downloadFile(fileId)

Returns the contents of the specified file

### Example

```java
// Import classes:
//import org.openapitools.client.api.OpenAIApi;

OpenAIApi apiInstance = new OpenAIApi();
String fileId = null; // String | The ID of the file to use for this request
try {
    String result = apiInstance.downloadFile(fileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OpenAIApi#downloadFile");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileId** | **String**| The ID of the file to use for this request | [default to null]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## listFiles

> ListFilesResponse listFiles()

Returns a list of files that belong to the user&#39;s organization.

### Example

```java
// Import classes:
//import org.openapitools.client.api.OpenAIApi;

OpenAIApi apiInstance = new OpenAIApi();
try {
    ListFilesResponse result = apiInstance.listFiles();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OpenAIApi#listFiles");
    e.printStackTrace();
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


## listFineTuneEvents

> ListFineTuneEventsResponse listFineTuneEvents(fineTuneId, stream)

Get fine-grained status updates for a fine-tune job. 

### Example

```java
// Import classes:
//import org.openapitools.client.api.OpenAIApi;

OpenAIApi apiInstance = new OpenAIApi();
String fineTuneId = ft-AF1WoRqd3aJAHsqc9NY7iL8F; // String | The ID of the fine-tune job to get events for. 
Boolean stream = false; // Boolean | Whether to stream events for the fine-tune job. If set to true, events will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available. The stream will terminate with a `data: [DONE]` message when the job is finished (succeeded, cancelled, or failed).  If set to false, only events generated so far will be returned. 
try {
    ListFineTuneEventsResponse result = apiInstance.listFineTuneEvents(fineTuneId, stream);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OpenAIApi#listFineTuneEvents");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fineTuneId** | **String**| The ID of the fine-tune job to get events for.  | [default to null]
 **stream** | **Boolean**| Whether to stream events for the fine-tune job. If set to true, events will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available. The stream will terminate with a &#x60;data: [DONE]&#x60; message when the job is finished (succeeded, cancelled, or failed).  If set to false, only events generated so far will be returned.  | [optional] [default to false]

### Return type

[**ListFineTuneEventsResponse**](ListFineTuneEventsResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## listFineTunes

> ListFineTunesResponse listFineTunes()

List your organization&#39;s fine-tuning jobs 

### Example

```java
// Import classes:
//import org.openapitools.client.api.OpenAIApi;

OpenAIApi apiInstance = new OpenAIApi();
try {
    ListFineTunesResponse result = apiInstance.listFineTunes();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OpenAIApi#listFineTunes");
    e.printStackTrace();
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


## listModels

> ListModelsResponse listModels()

Lists the currently available models, and provides basic information about each one such as the owner and availability.

### Example

```java
// Import classes:
//import org.openapitools.client.api.OpenAIApi;

OpenAIApi apiInstance = new OpenAIApi();
try {
    ListModelsResponse result = apiInstance.listModels();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OpenAIApi#listModels");
    e.printStackTrace();
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


## retrieveFile

> OpenAIFile retrieveFile(fileId)

Returns information about a specific file.

### Example

```java
// Import classes:
//import org.openapitools.client.api.OpenAIApi;

OpenAIApi apiInstance = new OpenAIApi();
String fileId = null; // String | The ID of the file to use for this request
try {
    OpenAIFile result = apiInstance.retrieveFile(fileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OpenAIApi#retrieveFile");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileId** | **String**| The ID of the file to use for this request | [default to null]

### Return type

[**OpenAIFile**](OpenAIFile.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## retrieveFineTune

> FineTune retrieveFineTune(fineTuneId)

Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 

### Example

```java
// Import classes:
//import org.openapitools.client.api.OpenAIApi;

OpenAIApi apiInstance = new OpenAIApi();
String fineTuneId = ft-AF1WoRqd3aJAHsqc9NY7iL8F; // String | The ID of the fine-tune job 
try {
    FineTune result = apiInstance.retrieveFineTune(fineTuneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OpenAIApi#retrieveFineTune");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fineTuneId** | **String**| The ID of the fine-tune job  | [default to null]

### Return type

[**FineTune**](FineTune.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## retrieveModel

> Model retrieveModel(model)

Retrieves a model instance, providing basic information about the model such as the owner and permissioning.

### Example

```java
// Import classes:
//import org.openapitools.client.api.OpenAIApi;

OpenAIApi apiInstance = new OpenAIApi();
String model = text-davinci-001; // String | The ID of the model to use for this request
try {
    Model result = apiInstance.retrieveModel(model);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OpenAIApi#retrieveModel");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | **String**| The ID of the model to use for this request | [default to null]

### Return type

[**Model**](Model.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

