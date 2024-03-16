# .OpenAIApi

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
[**createModeration**](OpenAIApi.md#createModeration) | **POST** /moderations | Classifies if text violates OpenAI\&#39;s Content Policy
[**createTranscription**](OpenAIApi.md#createTranscription) | **POST** /audio/transcriptions | Transcribes audio into the input language.
[**createTranslation**](OpenAIApi.md#createTranslation) | **POST** /audio/translations | Translates audio into English.
[**deleteFile**](OpenAIApi.md#deleteFile) | **DELETE** /files/{file_id} | Delete a file.
[**deleteModel**](OpenAIApi.md#deleteModel) | **DELETE** /models/{model} | Delete a fine-tuned model. You must have the Owner role in your organization.
[**downloadFile**](OpenAIApi.md#downloadFile) | **GET** /files/{file_id}/content | Returns the contents of the specified file
[**listFiles**](OpenAIApi.md#listFiles) | **GET** /files | Returns a list of files that belong to the user\&#39;s organization.
[**listFineTuneEvents**](OpenAIApi.md#listFineTuneEvents) | **GET** /fine-tunes/{fine_tune_id}/events | Get fine-grained status updates for a fine-tune job. 
[**listFineTunes**](OpenAIApi.md#listFineTunes) | **GET** /fine-tunes | List your organization\&#39;s fine-tuning jobs 
[**listModels**](OpenAIApi.md#listModels) | **GET** /models | Lists the currently available models, and provides basic information about each one such as the owner and availability.
[**retrieveFile**](OpenAIApi.md#retrieveFile) | **GET** /files/{file_id} | Returns information about a specific file.
[**retrieveFineTune**](OpenAIApi.md#retrieveFineTune) | **GET** /fine-tunes/{fine_tune_id} | Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
[**retrieveModel**](OpenAIApi.md#retrieveModel) | **GET** /models/{model} | Retrieves a model instance, providing basic information about the model such as the owner and permissioning.


# **cancelFineTune**
> FineTune cancelFineTune()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .OpenAIApi(configuration);

let body:.OpenAIApiCancelFineTuneRequest = {
  // string | The ID of the fine-tune job to cancel 
  fineTuneId: "ft-AF1WoRqd3aJAHsqc9NY7iL8F",
};

apiInstance.cancelFineTune(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fineTuneId** | [**string**] | The ID of the fine-tune job to cancel  | defaults to undefined


### Return type

**FineTune**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **createChatCompletion**
> CreateChatCompletionResponse createChatCompletion(createChatCompletionRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .OpenAIApi(configuration);

let body:.OpenAIApiCreateChatCompletionRequest = {
  // CreateChatCompletionRequest
  createChatCompletionRequest: {
    model: null,
    messages: [
      {
        role: "system",
        content: "content_example",
        name: "name_example",
        functionCall: {
          name: "name_example",
          arguments: "arguments_example",
        },
      },
    ],
    functions: [
      {
        name: "name_example",
        description: "description_example",
        parameters: {},
      },
    ],
    functionCall: null,
    temperature: 1,
    topP: 1,
    n: 1,
    stream: false,
    stop: null,
    maxTokens: 1,
    presencePenalty: 0,
    frequencyPenalty: 0,
    logitBias: {},
    user: "user-1234",
  },
};

apiInstance.createChatCompletion(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createChatCompletionRequest** | **CreateChatCompletionRequest**|  |


### Return type

**CreateChatCompletionResponse**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **createCompletion**
> CreateCompletionResponse createCompletion(createCompletionRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .OpenAIApi(configuration);

let body:.OpenAIApiCreateCompletionRequest = {
  // CreateCompletionRequest
  createCompletionRequest: {
    model: null,
    prompt: null,
    suffix: "test.",
    maxTokens: 16,
    temperature: 1,
    topP: 1,
    n: 1,
    stream: false,
    logprobs: 0,
    echo: false,
    stop: null,
    presencePenalty: 0,
    frequencyPenalty: 0,
    bestOf: 1,
    logitBias: {},
    user: "user-1234",
  },
};

apiInstance.createCompletion(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createCompletionRequest** | **CreateCompletionRequest**|  |


### Return type

**CreateCompletionResponse**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **createEdit**
> CreateEditResponse createEdit(createEditRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .OpenAIApi(configuration);

let body:.OpenAIApiCreateEditRequest = {
  // CreateEditRequest
  createEditRequest: {
    model: "model_example",
    input: "What day of the wek is it?",
    instruction: "Fix the spelling mistakes.",
    n: 1,
    temperature: 1,
    topP: 1,
  },
};

apiInstance.createEdit(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createEditRequest** | **CreateEditRequest**|  |


### Return type

**CreateEditResponse**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **createEmbedding**
> CreateEmbeddingResponse createEmbedding(createEmbeddingRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .OpenAIApi(configuration);

let body:.OpenAIApiCreateEmbeddingRequest = {
  // CreateEmbeddingRequest
  createEmbeddingRequest: {
    model: null,
    input: null,
    user: "user-1234",
  },
};

apiInstance.createEmbedding(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createEmbeddingRequest** | **CreateEmbeddingRequest**|  |


### Return type

**CreateEmbeddingResponse**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **createFile**
> OpenAIFile createFile()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .OpenAIApi(configuration);

let body:.OpenAIApiCreateFileRequest = {
  // HttpFile | Name of the [JSON Lines](https://jsonlines.readthedocs.io/en/latest/) file to be uploaded.  If the `purpose` is set to \\\"fine-tune\\\", each line is a JSON record with \\\"prompt\\\" and \\\"completion\\\" fields representing your [training examples](/docs/guides/fine-tuning/prepare-training-data). 
  file: { data: Buffer.from(fs.readFileSync('/path/to/file', 'utf-8')), name: '/path/to/file' },
  // string | The intended purpose of the uploaded documents.  Use \\\"fine-tune\\\" for [Fine-tuning](/docs/api-reference/fine-tunes). This allows us to validate the format of the uploaded file. 
  purpose: "purpose_example",
};

apiInstance.createFile(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | [**HttpFile**] | Name of the [JSON Lines](https://jsonlines.readthedocs.io/en/latest/) file to be uploaded.  If the &#x60;purpose&#x60; is set to \\\&quot;fine-tune\\\&quot;, each line is a JSON record with \\\&quot;prompt\\\&quot; and \\\&quot;completion\\\&quot; fields representing your [training examples](/docs/guides/fine-tuning/prepare-training-data).  | defaults to undefined
 **purpose** | [**string**] | The intended purpose of the uploaded documents.  Use \\\&quot;fine-tune\\\&quot; for [Fine-tuning](/docs/api-reference/fine-tunes). This allows us to validate the format of the uploaded file.  | defaults to undefined


### Return type

**OpenAIFile**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **createFineTune**
> FineTune createFineTune(createFineTuneRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .OpenAIApi(configuration);

let body:.OpenAIApiCreateFineTuneRequest = {
  // CreateFineTuneRequest
  createFineTuneRequest: {
    trainingFile: "file-ajSREls59WBbvgSzJSVWxMCB",
    validationFile: "file-XjSREls59WBbvgSzJSVWxMCa",
    model: null,
    nEpochs: 4,
    batchSize: 1,
    learningRateMultiplier: 3.14,
    promptLossWeight: 0.01,
    computeClassificationMetrics: false,
    classificationNClasses: 1,
    classificationPositiveClass: "classificationPositiveClass_example",
    classificationBetas: [0.6,1,1.5,2],
    suffix: "suffix_example",
  },
};

apiInstance.createFineTune(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createFineTuneRequest** | **CreateFineTuneRequest**|  |


### Return type

**FineTune**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **createImage**
> ImagesResponse createImage(createImageRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .OpenAIApi(configuration);

let body:.OpenAIApiCreateImageRequest = {
  // CreateImageRequest
  createImageRequest: {
    prompt: "A cute baby sea otter",
    n: 1,
    size: "1024x1024",
    responseFormat: "url",
    user: "user-1234",
  },
};

apiInstance.createImage(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createImageRequest** | **CreateImageRequest**|  |


### Return type

**ImagesResponse**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **createImageEdit**
> ImagesResponse createImageEdit()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .OpenAIApi(configuration);

let body:.OpenAIApiCreateImageEditRequest = {
  // HttpFile | The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask.
  image: { data: Buffer.from(fs.readFileSync('/path/to/file', 'utf-8')), name: '/path/to/file' },
  // string | A text description of the desired image(s). The maximum length is 1000 characters.
  prompt: "A cute baby sea otter wearing a beret",
  // HttpFile | An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where `image` should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as `image`. (optional)
  mask: { data: Buffer.from(fs.readFileSync('/path/to/file', 'utf-8')), name: '/path/to/file' },
  // number | The number of images to generate. Must be between 1 and 10. (optional)
  n: 1,
  // string | The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`. (optional)
  size: "1024x1024",
  // string | The format in which the generated images are returned. Must be one of `url` or `b64_json`. (optional)
  responseFormat: "url",
  // string | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  (optional)
  user: "user-1234",
};

apiInstance.createImageEdit(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **image** | [**HttpFile**] | The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask. | defaults to undefined
 **prompt** | [**string**] | A text description of the desired image(s). The maximum length is 1000 characters. | defaults to undefined
 **mask** | [**HttpFile**] | An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where &#x60;image&#x60; should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as &#x60;image&#x60;. | (optional) defaults to undefined
 **n** | [**number**] | The number of images to generate. Must be between 1 and 10. | (optional) defaults to 1
 **size** | [**string**]**Array<&#39;256x256&#39; &#124; &#39;512x512&#39; &#124; &#39;1024x1024&#39;>** | The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. | (optional) defaults to '1024x1024'
 **responseFormat** | [**string**]**Array<&#39;url&#39; &#124; &#39;b64_json&#39;>** | The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. | (optional) defaults to 'url'
 **user** | [**string**] | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  | (optional) defaults to undefined


### Return type

**ImagesResponse**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **createImageVariation**
> ImagesResponse createImageVariation()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .OpenAIApi(configuration);

let body:.OpenAIApiCreateImageVariationRequest = {
  // HttpFile | The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square.
  image: { data: Buffer.from(fs.readFileSync('/path/to/file', 'utf-8')), name: '/path/to/file' },
  // number | The number of images to generate. Must be between 1 and 10. (optional)
  n: 1,
  // string | The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`. (optional)
  size: "1024x1024",
  // string | The format in which the generated images are returned. Must be one of `url` or `b64_json`. (optional)
  responseFormat: "url",
  // string | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  (optional)
  user: "user-1234",
};

apiInstance.createImageVariation(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **image** | [**HttpFile**] | The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square. | defaults to undefined
 **n** | [**number**] | The number of images to generate. Must be between 1 and 10. | (optional) defaults to 1
 **size** | [**string**]**Array<&#39;256x256&#39; &#124; &#39;512x512&#39; &#124; &#39;1024x1024&#39;>** | The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. | (optional) defaults to '1024x1024'
 **responseFormat** | [**string**]**Array<&#39;url&#39; &#124; &#39;b64_json&#39;>** | The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. | (optional) defaults to 'url'
 **user** | [**string**] | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  | (optional) defaults to undefined


### Return type

**ImagesResponse**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **createModeration**
> CreateModerationResponse createModeration(createModerationRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .OpenAIApi(configuration);

let body:.OpenAIApiCreateModerationRequest = {
  // CreateModerationRequest
  createModerationRequest: {
    input: null,
    model: null,
  },
};

apiInstance.createModeration(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createModerationRequest** | **CreateModerationRequest**|  |


### Return type

**CreateModerationResponse**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **createTranscription**
> CreateTranscriptionResponse createTranscription()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .OpenAIApi(configuration);

let body:.OpenAIApiCreateTranscriptionRequest = {
  // HttpFile | The audio file object (not file name) to transcribe, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm. 
  file: { data: Buffer.from(fs.readFileSync('/path/to/file', 'utf-8')), name: '/path/to/file' },
  // CreateTranscriptionRequestModel
  model: null,
  // string | An optional text to guide the model\\\'s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language.  (optional)
  prompt: "prompt_example",
  // string | The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt.  (optional)
  responseFormat: "json",
  // number | The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  (optional)
  temperature: 0,
  // string | The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency.  (optional)
  language: "language_example",
};

apiInstance.createTranscription(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | [**HttpFile**] | The audio file object (not file name) to transcribe, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm.  | defaults to undefined
 **model** | **CreateTranscriptionRequestModel** |  | defaults to undefined
 **prompt** | [**string**] | An optional text to guide the model\\\&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language.  | (optional) defaults to undefined
 **responseFormat** | [**string**] | The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt.  | (optional) defaults to 'json'
 **temperature** | [**number**] | The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  | (optional) defaults to 0
 **language** | [**string**] | The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency.  | (optional) defaults to undefined


### Return type

**CreateTranscriptionResponse**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **createTranslation**
> CreateTranslationResponse createTranslation()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .OpenAIApi(configuration);

let body:.OpenAIApiCreateTranslationRequest = {
  // HttpFile | The audio file object (not file name) translate, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm. 
  file: { data: Buffer.from(fs.readFileSync('/path/to/file', 'utf-8')), name: '/path/to/file' },
  // CreateTranscriptionRequestModel
  model: null,
  // string | An optional text to guide the model\\\'s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English.  (optional)
  prompt: "prompt_example",
  // string | The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt.  (optional)
  responseFormat: "json",
  // number | The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  (optional)
  temperature: 0,
};

apiInstance.createTranslation(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | [**HttpFile**] | The audio file object (not file name) translate, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm.  | defaults to undefined
 **model** | **CreateTranscriptionRequestModel** |  | defaults to undefined
 **prompt** | [**string**] | An optional text to guide the model\\\&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English.  | (optional) defaults to undefined
 **responseFormat** | [**string**] | The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt.  | (optional) defaults to 'json'
 **temperature** | [**number**] | The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  | (optional) defaults to 0


### Return type

**CreateTranslationResponse**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **deleteFile**
> DeleteFileResponse deleteFile()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .OpenAIApi(configuration);

let body:.OpenAIApiDeleteFileRequest = {
  // string | The ID of the file to use for this request
  fileId: "file_id_example",
};

apiInstance.deleteFile(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileId** | [**string**] | The ID of the file to use for this request | defaults to undefined


### Return type

**DeleteFileResponse**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **deleteModel**
> DeleteModelResponse deleteModel()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .OpenAIApi(configuration);

let body:.OpenAIApiDeleteModelRequest = {
  // string | The model to delete
  model: "curie:ft-acmeco-2021-03-03-21-44-20",
};

apiInstance.deleteModel(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | [**string**] | The model to delete | defaults to undefined


### Return type

**DeleteModelResponse**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **downloadFile**
> string downloadFile()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .OpenAIApi(configuration);

let body:.OpenAIApiDownloadFileRequest = {
  // string | The ID of the file to use for this request
  fileId: "file_id_example",
};

apiInstance.downloadFile(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileId** | [**string**] | The ID of the file to use for this request | defaults to undefined


### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **listFiles**
> ListFilesResponse listFiles()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .OpenAIApi(configuration);

let body:any = {};

apiInstance.listFiles(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**ListFilesResponse**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **listFineTuneEvents**
> ListFineTuneEventsResponse listFineTuneEvents()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .OpenAIApi(configuration);

let body:.OpenAIApiListFineTuneEventsRequest = {
  // string | The ID of the fine-tune job to get events for. 
  fineTuneId: "ft-AF1WoRqd3aJAHsqc9NY7iL8F",
  // boolean | Whether to stream events for the fine-tune job. If set to true, events will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available. The stream will terminate with a `data: [DONE]` message when the job is finished (succeeded, cancelled, or failed).  If set to false, only events generated so far will be returned.  (optional)
  stream: false,
};

apiInstance.listFineTuneEvents(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fineTuneId** | [**string**] | The ID of the fine-tune job to get events for.  | defaults to undefined
 **stream** | [**boolean**] | Whether to stream events for the fine-tune job. If set to true, events will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available. The stream will terminate with a &#x60;data: [DONE]&#x60; message when the job is finished (succeeded, cancelled, or failed).  If set to false, only events generated so far will be returned.  | (optional) defaults to false


### Return type

**ListFineTuneEventsResponse**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **listFineTunes**
> ListFineTunesResponse listFineTunes()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .OpenAIApi(configuration);

let body:any = {};

apiInstance.listFineTunes(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**ListFineTunesResponse**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **listModels**
> ListModelsResponse listModels()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .OpenAIApi(configuration);

let body:any = {};

apiInstance.listModels(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**ListModelsResponse**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **retrieveFile**
> OpenAIFile retrieveFile()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .OpenAIApi(configuration);

let body:.OpenAIApiRetrieveFileRequest = {
  // string | The ID of the file to use for this request
  fileId: "file_id_example",
};

apiInstance.retrieveFile(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileId** | [**string**] | The ID of the file to use for this request | defaults to undefined


### Return type

**OpenAIFile**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **retrieveFineTune**
> FineTune retrieveFineTune()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .OpenAIApi(configuration);

let body:.OpenAIApiRetrieveFineTuneRequest = {
  // string | The ID of the fine-tune job 
  fineTuneId: "ft-AF1WoRqd3aJAHsqc9NY7iL8F",
};

apiInstance.retrieveFineTune(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fineTuneId** | [**string**] | The ID of the fine-tune job  | defaults to undefined


### Return type

**FineTune**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **retrieveModel**
> Model retrieveModel()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .OpenAIApi(configuration);

let body:.OpenAIApiRetrieveModelRequest = {
  // string | The ID of the model to use for this request
  model: "text-davinci-001",
};

apiInstance.retrieveModel(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | [**string**] | The ID of the model to use for this request | defaults to undefined


### Return type

**Model**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


