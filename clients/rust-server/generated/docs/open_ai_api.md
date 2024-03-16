# open_ai_api

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
**cancelFineTune**](open_ai_api.md#cancelFineTune) | **POST** /fine-tunes/{fine_tune_id}/cancel | Immediately cancel a fine-tune job. 
**createChatCompletion**](open_ai_api.md#createChatCompletion) | **POST** /chat/completions | Creates a model response for the given chat conversation.
**createCompletion**](open_ai_api.md#createCompletion) | **POST** /completions | Creates a completion for the provided prompt and parameters.
**createEdit**](open_ai_api.md#createEdit) | **POST** /edits | Creates a new edit for the provided input, instruction, and parameters.
**createEmbedding**](open_ai_api.md#createEmbedding) | **POST** /embeddings | Creates an embedding vector representing the input text.
**createFile**](open_ai_api.md#createFile) | **POST** /files | Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 
**createFineTune**](open_ai_api.md#createFineTune) | **POST** /fine-tunes | Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
**createImage**](open_ai_api.md#createImage) | **POST** /images/generations | Creates an image given a prompt.
**createImageEdit**](open_ai_api.md#createImageEdit) | **POST** /images/edits | Creates an edited or extended image given an original image and a prompt.
**createImageVariation**](open_ai_api.md#createImageVariation) | **POST** /images/variations | Creates a variation of a given image.
**createModeration**](open_ai_api.md#createModeration) | **POST** /moderations | Classifies if text violates OpenAI's Content Policy
**createTranscription**](open_ai_api.md#createTranscription) | **POST** /audio/transcriptions | Transcribes audio into the input language.
**createTranslation**](open_ai_api.md#createTranslation) | **POST** /audio/translations | Translates audio into English.
**deleteFile**](open_ai_api.md#deleteFile) | **DELETE** /files/{file_id} | Delete a file.
**deleteModel**](open_ai_api.md#deleteModel) | **DELETE** /models/{model} | Delete a fine-tuned model. You must have the Owner role in your organization.
**downloadFile**](open_ai_api.md#downloadFile) | **GET** /files/{file_id}/content | Returns the contents of the specified file
**listFiles**](open_ai_api.md#listFiles) | **GET** /files | Returns a list of files that belong to the user's organization.
**listFineTuneEvents**](open_ai_api.md#listFineTuneEvents) | **GET** /fine-tunes/{fine_tune_id}/events | Get fine-grained status updates for a fine-tune job. 
**listFineTunes**](open_ai_api.md#listFineTunes) | **GET** /fine-tunes | List your organization's fine-tuning jobs 
**listModels**](open_ai_api.md#listModels) | **GET** /models | Lists the currently available models, and provides basic information about each one such as the owner and availability.
**retrieveFile**](open_ai_api.md#retrieveFile) | **GET** /files/{file_id} | Returns information about a specific file.
**retrieveFineTune**](open_ai_api.md#retrieveFineTune) | **GET** /fine-tunes/{fine_tune_id} | Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
**retrieveModel**](open_ai_api.md#retrieveModel) | **GET** /models/{model} | Retrieves a model instance, providing basic information about the model such as the owner and permissioning.


# **cancelFineTune**
> models::FineTune cancelFineTune(fine_tune_id)
Immediately cancel a fine-tune job. 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **fine_tune_id** | **String**| The ID of the fine-tune job to cancel  | 

### Return type

[**models::FineTune**](FineTune.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createChatCompletion**
> models::CreateChatCompletionResponse createChatCompletion(create_chat_completion_request)
Creates a model response for the given chat conversation.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **create_chat_completion_request** | [**CreateChatCompletionRequest**](CreateChatCompletionRequest.md)|  | 

### Return type

[**models::CreateChatCompletionResponse**](CreateChatCompletionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createCompletion**
> models::CreateCompletionResponse createCompletion(create_completion_request)
Creates a completion for the provided prompt and parameters.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **create_completion_request** | [**CreateCompletionRequest**](CreateCompletionRequest.md)|  | 

### Return type

[**models::CreateCompletionResponse**](CreateCompletionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createEdit**
> models::CreateEditResponse createEdit(create_edit_request)
Creates a new edit for the provided input, instruction, and parameters.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **create_edit_request** | [**CreateEditRequest**](CreateEditRequest.md)|  | 

### Return type

[**models::CreateEditResponse**](CreateEditResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createEmbedding**
> models::CreateEmbeddingResponse createEmbedding(create_embedding_request)
Creates an embedding vector representing the input text.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **create_embedding_request** | [**CreateEmbeddingRequest**](CreateEmbeddingRequest.md)|  | 

### Return type

[**models::CreateEmbeddingResponse**](CreateEmbeddingResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createFile**
> models::OpenAiFile createFile(file, purpose)
Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **file** | **swagger::ByteArray**| Name of the [JSON Lines](https://jsonlines.readthedocs.io/en/latest/) file to be uploaded.  If the `purpose` is set to \\\"fine-tune\\\", each line is a JSON record with \\\"prompt\\\" and \\\"completion\\\" fields representing your [training examples](/docs/guides/fine-tuning/prepare-training-data).  | 
  **purpose** | **String**| The intended purpose of the uploaded documents.  Use \\\"fine-tune\\\" for [Fine-tuning](/docs/api-reference/fine-tunes). This allows us to validate the format of the uploaded file.  | 

### Return type

[**models::OpenAiFile**](OpenAIFile.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createFineTune**
> models::FineTune createFineTune(create_fine_tune_request)
Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **create_fine_tune_request** | [**CreateFineTuneRequest**](CreateFineTuneRequest.md)|  | 

### Return type

[**models::FineTune**](FineTune.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createImage**
> models::ImagesResponse createImage(create_image_request)
Creates an image given a prompt.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **create_image_request** | [**CreateImageRequest**](CreateImageRequest.md)|  | 

### Return type

[**models::ImagesResponse**](ImagesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createImageEdit**
> models::ImagesResponse createImageEdit(image, prompt, optional)
Creates an edited or extended image given an original image and a prompt.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **image** | **swagger::ByteArray**| The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask. | 
  **prompt** | **String**| A text description of the desired image(s). The maximum length is 1000 characters. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **image** | **swagger::ByteArray**| The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask. | 
 **prompt** | **String**| A text description of the desired image(s). The maximum length is 1000 characters. | 
 **mask** | **swagger::ByteArray**| An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where `image` should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as `image`. | 
 **n** | **i32**| The number of images to generate. Must be between 1 and 10. | [default to swagger::Nullable::Present(1)]
 **size** | **String**| The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`. | [default to swagger::Nullable::Present("1024x1024".to_string())]
 **response_format** | **String**| The format in which the generated images are returned. Must be one of `url` or `b64_json`. | [default to swagger::Nullable::Present("url".to_string())]
 **user** | **String**| A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  | 

### Return type

[**models::ImagesResponse**](ImagesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createImageVariation**
> models::ImagesResponse createImageVariation(image, optional)
Creates a variation of a given image.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **image** | **swagger::ByteArray**| The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **image** | **swagger::ByteArray**| The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square. | 
 **n** | **i32**| The number of images to generate. Must be between 1 and 10. | [default to swagger::Nullable::Present(1)]
 **size** | **String**| The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`. | [default to swagger::Nullable::Present("1024x1024".to_string())]
 **response_format** | **String**| The format in which the generated images are returned. Must be one of `url` or `b64_json`. | [default to swagger::Nullable::Present("url".to_string())]
 **user** | **String**| A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  | 

### Return type

[**models::ImagesResponse**](ImagesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createModeration**
> models::CreateModerationResponse createModeration(create_moderation_request)
Classifies if text violates OpenAI's Content Policy

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **create_moderation_request** | [**CreateModerationRequest**](CreateModerationRequest.md)|  | 

### Return type

[**models::CreateModerationResponse**](CreateModerationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createTranscription**
> models::CreateTranscriptionResponse createTranscription(file, model, optional)
Transcribes audio into the input language.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **file** | **swagger::ByteArray**| The audio file object (not file name) to transcribe, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm.  | 
  **model** | [**CreateTranscriptionRequest_model**](CreateTranscriptionRequest_model.md)|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **swagger::ByteArray**| The audio file object (not file name) to transcribe, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm.  | 
 **model** | [**CreateTranscriptionRequest_model**](CreateTranscriptionRequest_model.md)|  | 
 **prompt** | **String**| An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language.  | 
 **response_format** | **String**| The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt.  | [default to "json".to_string()]
 **temperature** | **f64**| The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  | [default to 0]
 **language** | **String**| The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency.  | 

### Return type

[**models::CreateTranscriptionResponse**](CreateTranscriptionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createTranslation**
> models::CreateTranslationResponse createTranslation(file, model, optional)
Translates audio into English.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **file** | **swagger::ByteArray**| The audio file object (not file name) translate, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm.  | 
  **model** | [**CreateTranscriptionRequest_model**](CreateTranscriptionRequest_model.md)|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **swagger::ByteArray**| The audio file object (not file name) translate, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm.  | 
 **model** | [**CreateTranscriptionRequest_model**](CreateTranscriptionRequest_model.md)|  | 
 **prompt** | **String**| An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English.  | 
 **response_format** | **String**| The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt.  | [default to "json".to_string()]
 **temperature** | **f64**| The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  | [default to 0]

### Return type

[**models::CreateTranslationResponse**](CreateTranslationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteFile**
> models::DeleteFileResponse deleteFile(file_id)
Delete a file.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **file_id** | **String**| The ID of the file to use for this request | 

### Return type

[**models::DeleteFileResponse**](DeleteFileResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteModel**
> models::DeleteModelResponse deleteModel(model)
Delete a fine-tuned model. You must have the Owner role in your organization.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **model** | **String**| The model to delete | 

### Return type

[**models::DeleteModelResponse**](DeleteModelResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **downloadFile**
> String downloadFile(file_id)
Returns the contents of the specified file

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **file_id** | **String**| The ID of the file to use for this request | 

### Return type

[**String**](string.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listFiles**
> models::ListFilesResponse listFiles()
Returns a list of files that belong to the user's organization.

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**models::ListFilesResponse**](ListFilesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listFineTuneEvents**
> models::ListFineTuneEventsResponse listFineTuneEvents(fine_tune_id, optional)
Get fine-grained status updates for a fine-tune job. 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **fine_tune_id** | **String**| The ID of the fine-tune job to get events for.  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fine_tune_id** | **String**| The ID of the fine-tune job to get events for.  | 
 **stream** | **bool**| Whether to stream events for the fine-tune job. If set to true, events will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available. The stream will terminate with a `data: [DONE]` message when the job is finished (succeeded, cancelled, or failed).  If set to false, only events generated so far will be returned.  | [default to false]

### Return type

[**models::ListFineTuneEventsResponse**](ListFineTuneEventsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listFineTunes**
> models::ListFineTunesResponse listFineTunes()
List your organization's fine-tuning jobs 

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**models::ListFineTunesResponse**](ListFineTunesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listModels**
> models::ListModelsResponse listModels()
Lists the currently available models, and provides basic information about each one such as the owner and availability.

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**models::ListModelsResponse**](ListModelsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **retrieveFile**
> models::OpenAiFile retrieveFile(file_id)
Returns information about a specific file.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **file_id** | **String**| The ID of the file to use for this request | 

### Return type

[**models::OpenAiFile**](OpenAIFile.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **retrieveFineTune**
> models::FineTune retrieveFineTune(fine_tune_id)
Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **fine_tune_id** | **String**| The ID of the fine-tune job  | 

### Return type

[**models::FineTune**](FineTune.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **retrieveModel**
> models::Model retrieveModel(model)
Retrieves a model instance, providing basic information about the model such as the owner and permissioning.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **model** | **String**| The ID of the model to use for this request | 

### Return type

[**models::Model**](Model.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

