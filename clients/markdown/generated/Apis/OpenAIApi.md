# OpenAIApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelFineTune**](OpenAIApi.md#cancelFineTune) | **POST** /fine-tunes/{fine_tune_id}/cancel | Immediately cancel a fine-tune job.  |
| [**createChatCompletion**](OpenAIApi.md#createChatCompletion) | **POST** /chat/completions | Creates a model response for the given chat conversation. |
| [**createCompletion**](OpenAIApi.md#createCompletion) | **POST** /completions | Creates a completion for the provided prompt and parameters. |
| [**createEdit**](OpenAIApi.md#createEdit) | **POST** /edits | Creates a new edit for the provided input, instruction, and parameters. |
| [**createEmbedding**](OpenAIApi.md#createEmbedding) | **POST** /embeddings | Creates an embedding vector representing the input text. |
| [**createFile**](OpenAIApi.md#createFile) | **POST** /files | Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit.  |
| [**createFineTune**](OpenAIApi.md#createFineTune) | **POST** /fine-tunes | Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning)  |
| [**createImage**](OpenAIApi.md#createImage) | **POST** /images/generations | Creates an image given a prompt. |
| [**createImageEdit**](OpenAIApi.md#createImageEdit) | **POST** /images/edits | Creates an edited or extended image given an original image and a prompt. |
| [**createImageVariation**](OpenAIApi.md#createImageVariation) | **POST** /images/variations | Creates a variation of a given image. |
| [**createModeration**](OpenAIApi.md#createModeration) | **POST** /moderations | Classifies if text violates OpenAI&#39;s Content Policy |
| [**createTranscription**](OpenAIApi.md#createTranscription) | **POST** /audio/transcriptions | Transcribes audio into the input language. |
| [**createTranslation**](OpenAIApi.md#createTranslation) | **POST** /audio/translations | Translates audio into English. |
| [**deleteFile**](OpenAIApi.md#deleteFile) | **DELETE** /files/{file_id} | Delete a file. |
| [**deleteModel**](OpenAIApi.md#deleteModel) | **DELETE** /models/{model} | Delete a fine-tuned model. You must have the Owner role in your organization. |
| [**downloadFile**](OpenAIApi.md#downloadFile) | **GET** /files/{file_id}/content | Returns the contents of the specified file |
| [**listFiles**](OpenAIApi.md#listFiles) | **GET** /files | Returns a list of files that belong to the user&#39;s organization. |
| [**listFineTuneEvents**](OpenAIApi.md#listFineTuneEvents) | **GET** /fine-tunes/{fine_tune_id}/events | Get fine-grained status updates for a fine-tune job.  |
| [**listFineTunes**](OpenAIApi.md#listFineTunes) | **GET** /fine-tunes | List your organization&#39;s fine-tuning jobs  |
| [**listModels**](OpenAIApi.md#listModels) | **GET** /models | Lists the currently available models, and provides basic information about each one such as the owner and availability. |
| [**retrieveFile**](OpenAIApi.md#retrieveFile) | **GET** /files/{file_id} | Returns information about a specific file. |
| [**retrieveFineTune**](OpenAIApi.md#retrieveFineTune) | **GET** /fine-tunes/{fine_tune_id} | Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning)  |
| [**retrieveModel**](OpenAIApi.md#retrieveModel) | **GET** /models/{model} | Retrieves a model instance, providing basic information about the model such as the owner and permissioning. |


<a name="cancelFineTune"></a>
# **cancelFineTune**
> FineTune cancelFineTune(fine\_tune\_id)

Immediately cancel a fine-tune job. 

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fine\_tune\_id** | **String**| The ID of the fine-tune job to cancel  | [default to null] |

### Return type

[**FineTune**](../Models/FineTune.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="createChatCompletion"></a>
# **createChatCompletion**
> CreateChatCompletionResponse createChatCompletion(CreateChatCompletionRequest)

Creates a model response for the given chat conversation.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **CreateChatCompletionRequest** | [**CreateChatCompletionRequest**](../Models/CreateChatCompletionRequest.md)|  | |

### Return type

[**CreateChatCompletionResponse**](../Models/CreateChatCompletionResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="createCompletion"></a>
# **createCompletion**
> CreateCompletionResponse createCompletion(CreateCompletionRequest)

Creates a completion for the provided prompt and parameters.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **CreateCompletionRequest** | [**CreateCompletionRequest**](../Models/CreateCompletionRequest.md)|  | |

### Return type

[**CreateCompletionResponse**](../Models/CreateCompletionResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="createEdit"></a>
# **createEdit**
> CreateEditResponse createEdit(CreateEditRequest)

Creates a new edit for the provided input, instruction, and parameters.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **CreateEditRequest** | [**CreateEditRequest**](../Models/CreateEditRequest.md)|  | |

### Return type

[**CreateEditResponse**](../Models/CreateEditResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="createEmbedding"></a>
# **createEmbedding**
> CreateEmbeddingResponse createEmbedding(CreateEmbeddingRequest)

Creates an embedding vector representing the input text.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **CreateEmbeddingRequest** | [**CreateEmbeddingRequest**](../Models/CreateEmbeddingRequest.md)|  | |

### Return type

[**CreateEmbeddingResponse**](../Models/CreateEmbeddingResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="createFile"></a>
# **createFile**
> OpenAIFile createFile(file, purpose)

Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **file** | **File**| Name of the [JSON Lines](https://jsonlines.readthedocs.io/en/latest/) file to be uploaded.  If the &#x60;purpose&#x60; is set to \\\&quot;fine-tune\\\&quot;, each line is a JSON record with \\\&quot;prompt\\\&quot; and \\\&quot;completion\\\&quot; fields representing your [training examples](/docs/guides/fine-tuning/prepare-training-data).  | [default to null] |
| **purpose** | **String**| The intended purpose of the uploaded documents.  Use \\\&quot;fine-tune\\\&quot; for [Fine-tuning](/docs/api-reference/fine-tunes). This allows us to validate the format of the uploaded file.  | [default to null] |

### Return type

[**OpenAIFile**](../Models/OpenAIFile.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

<a name="createFineTune"></a>
# **createFineTune**
> FineTune createFineTune(CreateFineTuneRequest)

Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **CreateFineTuneRequest** | [**CreateFineTuneRequest**](../Models/CreateFineTuneRequest.md)|  | |

### Return type

[**FineTune**](../Models/FineTune.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="createImage"></a>
# **createImage**
> ImagesResponse createImage(CreateImageRequest)

Creates an image given a prompt.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **CreateImageRequest** | [**CreateImageRequest**](../Models/CreateImageRequest.md)|  | |

### Return type

[**ImagesResponse**](../Models/ImagesResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="createImageEdit"></a>
# **createImageEdit**
> ImagesResponse createImageEdit(image, prompt, mask, n, size, response\_format, user)

Creates an edited or extended image given an original image and a prompt.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **image** | **File**| The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask. | [default to null] |
| **prompt** | **String**| A text description of the desired image(s). The maximum length is 1000 characters. | [default to null] |
| **mask** | **File**| An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where &#x60;image&#x60; should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as &#x60;image&#x60;. | [optional] [default to null] |
| **n** | **Integer**| The number of images to generate. Must be between 1 and 10. | [optional] [default to 1] |
| **size** | **String**| The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. | [optional] [default to 1024x1024] [enum: 256x256, 512x512, 1024x1024] |
| **response\_format** | **String**| The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. | [optional] [default to url] [enum: url, b64_json] |
| **user** | **String**| A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  | [optional] [default to null] |

### Return type

[**ImagesResponse**](../Models/ImagesResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

<a name="createImageVariation"></a>
# **createImageVariation**
> ImagesResponse createImageVariation(image, n, size, response\_format, user)

Creates a variation of a given image.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **image** | **File**| The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square. | [default to null] |
| **n** | **Integer**| The number of images to generate. Must be between 1 and 10. | [optional] [default to 1] |
| **size** | **String**| The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. | [optional] [default to 1024x1024] [enum: 256x256, 512x512, 1024x1024] |
| **response\_format** | **String**| The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. | [optional] [default to url] [enum: url, b64_json] |
| **user** | **String**| A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  | [optional] [default to null] |

### Return type

[**ImagesResponse**](../Models/ImagesResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

<a name="createModeration"></a>
# **createModeration**
> CreateModerationResponse createModeration(CreateModerationRequest)

Classifies if text violates OpenAI&#39;s Content Policy

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **CreateModerationRequest** | [**CreateModerationRequest**](../Models/CreateModerationRequest.md)|  | |

### Return type

[**CreateModerationResponse**](../Models/CreateModerationResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="createTranscription"></a>
# **createTranscription**
> CreateTranscriptionResponse createTranscription(file, model, prompt, response\_format, temperature, language)

Transcribes audio into the input language.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **file** | **File**| The audio file object (not file name) to transcribe, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm.  | [default to null] |
| **model** | [**CreateTranscriptionRequest_model**](../Models/CreateTranscriptionRequest_model.md)|  | [default to null] |
| **prompt** | **String**| An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language.  | [optional] [default to null] |
| **response\_format** | **String**| The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt.  | [optional] [default to json] |
| **temperature** | **BigDecimal**| The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  | [optional] [default to 0] |
| **language** | **String**| The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency.  | [optional] [default to null] |

### Return type

[**CreateTranscriptionResponse**](../Models/CreateTranscriptionResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

<a name="createTranslation"></a>
# **createTranslation**
> CreateTranslationResponse createTranslation(file, model, prompt, response\_format, temperature)

Translates audio into English.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **file** | **File**| The audio file object (not file name) translate, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm.  | [default to null] |
| **model** | [**CreateTranscriptionRequest_model**](../Models/CreateTranscriptionRequest_model.md)|  | [default to null] |
| **prompt** | **String**| An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English.  | [optional] [default to null] |
| **response\_format** | **String**| The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt.  | [optional] [default to json] |
| **temperature** | **BigDecimal**| The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  | [optional] [default to 0] |

### Return type

[**CreateTranslationResponse**](../Models/CreateTranslationResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

<a name="deleteFile"></a>
# **deleteFile**
> DeleteFileResponse deleteFile(file\_id)

Delete a file.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **file\_id** | **String**| The ID of the file to use for this request | [default to null] |

### Return type

[**DeleteFileResponse**](../Models/DeleteFileResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="deleteModel"></a>
# **deleteModel**
> DeleteModelResponse deleteModel(model)

Delete a fine-tuned model. You must have the Owner role in your organization.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **model** | **String**| The model to delete | [default to null] |

### Return type

[**DeleteModelResponse**](../Models/DeleteModelResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="downloadFile"></a>
# **downloadFile**
> String downloadFile(file\_id)

Returns the contents of the specified file

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **file\_id** | **String**| The ID of the file to use for this request | [default to null] |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="listFiles"></a>
# **listFiles**
> ListFilesResponse listFiles()

Returns a list of files that belong to the user&#39;s organization.

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListFilesResponse**](../Models/ListFilesResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="listFineTuneEvents"></a>
# **listFineTuneEvents**
> ListFineTuneEventsResponse listFineTuneEvents(fine\_tune\_id, stream)

Get fine-grained status updates for a fine-tune job. 

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fine\_tune\_id** | **String**| The ID of the fine-tune job to get events for.  | [default to null] |
| **stream** | **Boolean**| Whether to stream events for the fine-tune job. If set to true, events will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available. The stream will terminate with a &#x60;data: [DONE]&#x60; message when the job is finished (succeeded, cancelled, or failed).  If set to false, only events generated so far will be returned.  | [optional] [default to false] |

### Return type

[**ListFineTuneEventsResponse**](../Models/ListFineTuneEventsResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="listFineTunes"></a>
# **listFineTunes**
> ListFineTunesResponse listFineTunes()

List your organization&#39;s fine-tuning jobs 

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListFineTunesResponse**](../Models/ListFineTunesResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="listModels"></a>
# **listModels**
> ListModelsResponse listModels()

Lists the currently available models, and provides basic information about each one such as the owner and availability.

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListModelsResponse**](../Models/ListModelsResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="retrieveFile"></a>
# **retrieveFile**
> OpenAIFile retrieveFile(file\_id)

Returns information about a specific file.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **file\_id** | **String**| The ID of the file to use for this request | [default to null] |

### Return type

[**OpenAIFile**](../Models/OpenAIFile.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="retrieveFineTune"></a>
# **retrieveFineTune**
> FineTune retrieveFineTune(fine\_tune\_id)

Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fine\_tune\_id** | **String**| The ID of the fine-tune job  | [default to null] |

### Return type

[**FineTune**](../Models/FineTune.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="retrieveModel"></a>
# **retrieveModel**
> Model retrieveModel(model)

Retrieves a model instance, providing basic information about the model such as the owner and permissioning.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **model** | **String**| The ID of the model to use for this request | [default to null] |

### Return type

[**Model**](../Models/Model.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

