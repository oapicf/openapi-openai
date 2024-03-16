# OpenapiOpenai.OpenAIApi

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

```javascript
import OpenapiOpenai from 'openapi_openai';

let apiInstance = new OpenapiOpenai.OpenAIApi();
let fineTuneId = ft-AF1WoRqd3aJAHsqc9NY7iL8F; // String | The ID of the fine-tune job to cancel 
apiInstance.cancelFineTune(fineTuneId, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fineTuneId** | **String**| The ID of the fine-tune job to cancel  | 

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

```javascript
import OpenapiOpenai from 'openapi_openai';

let apiInstance = new OpenapiOpenai.OpenAIApi();
let createChatCompletionRequest = new OpenapiOpenai.CreateChatCompletionRequest(); // CreateChatCompletionRequest | 
apiInstance.createChatCompletion(createChatCompletionRequest, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
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

```javascript
import OpenapiOpenai from 'openapi_openai';

let apiInstance = new OpenapiOpenai.OpenAIApi();
let createCompletionRequest = new OpenapiOpenai.CreateCompletionRequest(); // CreateCompletionRequest | 
apiInstance.createCompletion(createCompletionRequest, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
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

```javascript
import OpenapiOpenai from 'openapi_openai';

let apiInstance = new OpenapiOpenai.OpenAIApi();
let createEditRequest = new OpenapiOpenai.CreateEditRequest(); // CreateEditRequest | 
apiInstance.createEdit(createEditRequest, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
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

```javascript
import OpenapiOpenai from 'openapi_openai';

let apiInstance = new OpenapiOpenai.OpenAIApi();
let createEmbeddingRequest = new OpenapiOpenai.CreateEmbeddingRequest(); // CreateEmbeddingRequest | 
apiInstance.createEmbedding(createEmbeddingRequest, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
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

```javascript
import OpenapiOpenai from 'openapi_openai';

let apiInstance = new OpenapiOpenai.OpenAIApi();
let file = "/path/to/file"; // File | Name of the [JSON Lines](https://jsonlines.readthedocs.io/en/latest/) file to be uploaded.  If the `purpose` is set to \\\"fine-tune\\\", each line is a JSON record with \\\"prompt\\\" and \\\"completion\\\" fields representing your [training examples](/docs/guides/fine-tuning/prepare-training-data). 
let purpose = "purpose_example"; // String | The intended purpose of the uploaded documents.  Use \\\"fine-tune\\\" for [Fine-tuning](/docs/api-reference/fine-tunes). This allows us to validate the format of the uploaded file. 
apiInstance.createFile(file, purpose, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **File**| Name of the [JSON Lines](https://jsonlines.readthedocs.io/en/latest/) file to be uploaded.  If the &#x60;purpose&#x60; is set to \\\&quot;fine-tune\\\&quot;, each line is a JSON record with \\\&quot;prompt\\\&quot; and \\\&quot;completion\\\&quot; fields representing your [training examples](/docs/guides/fine-tuning/prepare-training-data).  | 
 **purpose** | **String**| The intended purpose of the uploaded documents.  Use \\\&quot;fine-tune\\\&quot; for [Fine-tuning](/docs/api-reference/fine-tunes). This allows us to validate the format of the uploaded file.  | 

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

```javascript
import OpenapiOpenai from 'openapi_openai';

let apiInstance = new OpenapiOpenai.OpenAIApi();
let createFineTuneRequest = new OpenapiOpenai.CreateFineTuneRequest(); // CreateFineTuneRequest | 
apiInstance.createFineTune(createFineTuneRequest, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
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

```javascript
import OpenapiOpenai from 'openapi_openai';

let apiInstance = new OpenapiOpenai.OpenAIApi();
let createImageRequest = new OpenapiOpenai.CreateImageRequest(); // CreateImageRequest | 
apiInstance.createImage(createImageRequest, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
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

> ImagesResponse createImageEdit(image, prompt, opts)

Creates an edited or extended image given an original image and a prompt.

### Example

```javascript
import OpenapiOpenai from 'openapi_openai';

let apiInstance = new OpenapiOpenai.OpenAIApi();
let image = "/path/to/file"; // File | The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask.
let prompt = "prompt_example"; // String | A text description of the desired image(s). The maximum length is 1000 characters.
let opts = {
  'mask': "/path/to/file", // File | An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where `image` should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as `image`.
  'n': 1, // Number | The number of images to generate. Must be between 1 and 10.
  'size': "'1024x1024'", // String | The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.
  'responseFormat': "'url'", // String | The format in which the generated images are returned. Must be one of `url` or `b64_json`.
  'user': "user_example" // String | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
};
apiInstance.createImageEdit(image, prompt, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **image** | **File**| The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask. | 
 **prompt** | **String**| A text description of the desired image(s). The maximum length is 1000 characters. | 
 **mask** | **File**| An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where &#x60;image&#x60; should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as &#x60;image&#x60;. | [optional] 
 **n** | **Number**| The number of images to generate. Must be between 1 and 10. | [optional] [default to 1]
 **size** | **String**| The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. | [optional] [default to &#39;1024x1024&#39;]
 **responseFormat** | **String**| The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. | [optional] [default to &#39;url&#39;]
 **user** | **String**| A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  | [optional] 

### Return type

[**ImagesResponse**](ImagesResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json


## createImageVariation

> ImagesResponse createImageVariation(image, opts)

Creates a variation of a given image.

### Example

```javascript
import OpenapiOpenai from 'openapi_openai';

let apiInstance = new OpenapiOpenai.OpenAIApi();
let image = "/path/to/file"; // File | The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square.
let opts = {
  'n': 1, // Number | The number of images to generate. Must be between 1 and 10.
  'size': "'1024x1024'", // String | The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.
  'responseFormat': "'url'", // String | The format in which the generated images are returned. Must be one of `url` or `b64_json`.
  'user': "user_example" // String | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
};
apiInstance.createImageVariation(image, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **image** | **File**| The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square. | 
 **n** | **Number**| The number of images to generate. Must be between 1 and 10. | [optional] [default to 1]
 **size** | **String**| The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. | [optional] [default to &#39;1024x1024&#39;]
 **responseFormat** | **String**| The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. | [optional] [default to &#39;url&#39;]
 **user** | **String**| A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  | [optional] 

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

```javascript
import OpenapiOpenai from 'openapi_openai';

let apiInstance = new OpenapiOpenai.OpenAIApi();
let createModerationRequest = new OpenapiOpenai.CreateModerationRequest(); // CreateModerationRequest | 
apiInstance.createModeration(createModerationRequest, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
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

> CreateTranscriptionResponse createTranscription(file, model, opts)

Transcribes audio into the input language.

### Example

```javascript
import OpenapiOpenai from 'openapi_openai';

let apiInstance = new OpenapiOpenai.OpenAIApi();
let file = "/path/to/file"; // File | The audio file object (not file name) to transcribe, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm. 
let model = new OpenapiOpenai.CreateTranscriptionRequestModel(); // CreateTranscriptionRequestModel | 
let opts = {
  'prompt': "prompt_example", // String | An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language. 
  'responseFormat': "'json'", // String | The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt. 
  'temperature': 0, // Number | The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. 
  'language': "language_example" // String | The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency. 
};
apiInstance.createTranscription(file, model, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **File**| The audio file object (not file name) to transcribe, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm.  | 
 **model** | [**CreateTranscriptionRequestModel**](CreateTranscriptionRequestModel.md)|  | 
 **prompt** | **String**| An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language.  | [optional] 
 **responseFormat** | **String**| The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt.  | [optional] [default to &#39;json&#39;]
 **temperature** | **Number**| The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  | [optional] [default to 0]
 **language** | **String**| The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency.  | [optional] 

### Return type

[**CreateTranscriptionResponse**](CreateTranscriptionResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json


## createTranslation

> CreateTranslationResponse createTranslation(file, model, opts)

Translates audio into English.

### Example

```javascript
import OpenapiOpenai from 'openapi_openai';

let apiInstance = new OpenapiOpenai.OpenAIApi();
let file = "/path/to/file"; // File | The audio file object (not file name) translate, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm. 
let model = new OpenapiOpenai.CreateTranscriptionRequestModel(); // CreateTranscriptionRequestModel | 
let opts = {
  'prompt': "prompt_example", // String | An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English. 
  'responseFormat': "'json'", // String | The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt. 
  'temperature': 0 // Number | The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. 
};
apiInstance.createTranslation(file, model, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **File**| The audio file object (not file name) translate, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm.  | 
 **model** | [**CreateTranscriptionRequestModel**](CreateTranscriptionRequestModel.md)|  | 
 **prompt** | **String**| An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English.  | [optional] 
 **responseFormat** | **String**| The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt.  | [optional] [default to &#39;json&#39;]
 **temperature** | **Number**| The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  | [optional] [default to 0]

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

```javascript
import OpenapiOpenai from 'openapi_openai';

let apiInstance = new OpenapiOpenai.OpenAIApi();
let fileId = "fileId_example"; // String | The ID of the file to use for this request
apiInstance.deleteFile(fileId, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileId** | **String**| The ID of the file to use for this request | 

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

```javascript
import OpenapiOpenai from 'openapi_openai';

let apiInstance = new OpenapiOpenai.OpenAIApi();
let model = curie:ft-acmeco-2021-03-03-21-44-20; // String | The model to delete
apiInstance.deleteModel(model, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | **String**| The model to delete | 

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

```javascript
import OpenapiOpenai from 'openapi_openai';

let apiInstance = new OpenapiOpenai.OpenAIApi();
let fileId = "fileId_example"; // String | The ID of the file to use for this request
apiInstance.downloadFile(fileId, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileId** | **String**| The ID of the file to use for this request | 

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

```javascript
import OpenapiOpenai from 'openapi_openai';

let apiInstance = new OpenapiOpenai.OpenAIApi();
apiInstance.listFiles((error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
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

> ListFineTuneEventsResponse listFineTuneEvents(fineTuneId, opts)

Get fine-grained status updates for a fine-tune job. 

### Example

```javascript
import OpenapiOpenai from 'openapi_openai';

let apiInstance = new OpenapiOpenai.OpenAIApi();
let fineTuneId = ft-AF1WoRqd3aJAHsqc9NY7iL8F; // String | The ID of the fine-tune job to get events for. 
let opts = {
  'stream': false // Boolean | Whether to stream events for the fine-tune job. If set to true, events will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available. The stream will terminate with a `data: [DONE]` message when the job is finished (succeeded, cancelled, or failed).  If set to false, only events generated so far will be returned. 
};
apiInstance.listFineTuneEvents(fineTuneId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fineTuneId** | **String**| The ID of the fine-tune job to get events for.  | 
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

```javascript
import OpenapiOpenai from 'openapi_openai';

let apiInstance = new OpenapiOpenai.OpenAIApi();
apiInstance.listFineTunes((error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
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

```javascript
import OpenapiOpenai from 'openapi_openai';

let apiInstance = new OpenapiOpenai.OpenAIApi();
apiInstance.listModels((error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
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

```javascript
import OpenapiOpenai from 'openapi_openai';

let apiInstance = new OpenapiOpenai.OpenAIApi();
let fileId = "fileId_example"; // String | The ID of the file to use for this request
apiInstance.retrieveFile(fileId, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileId** | **String**| The ID of the file to use for this request | 

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

```javascript
import OpenapiOpenai from 'openapi_openai';

let apiInstance = new OpenapiOpenai.OpenAIApi();
let fineTuneId = ft-AF1WoRqd3aJAHsqc9NY7iL8F; // String | The ID of the fine-tune job 
apiInstance.retrieveFineTune(fineTuneId, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fineTuneId** | **String**| The ID of the fine-tune job  | 

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

```javascript
import OpenapiOpenai from 'openapi_openai';

let apiInstance = new OpenapiOpenai.OpenAIApi();
let model = text-davinci-001; // String | The ID of the model to use for this request
apiInstance.retrieveModel(model, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | **String**| The ID of the model to use for this request | 

### Return type

[**Model**](Model.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

