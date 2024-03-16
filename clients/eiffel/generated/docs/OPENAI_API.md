# OPENAI_API

All URIs are relative to *https://api.openai.com/v1*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**cancel_fine_tune**](OPENAI_API.md#cancel_fine_tune) | **Post** /fine-tunes/{fine_tune_id}/cancel | Immediately cancel a fine-tune job. 
[**create_chat_completion**](OPENAI_API.md#create_chat_completion) | **Post** /chat/completions | Creates a model response for the given chat conversation.
[**create_completion**](OPENAI_API.md#create_completion) | **Post** /completions | Creates a completion for the provided prompt and parameters.
[**create_edit**](OPENAI_API.md#create_edit) | **Post** /edits | Creates a new edit for the provided input, instruction, and parameters.
[**create_embedding**](OPENAI_API.md#create_embedding) | **Post** /embeddings | Creates an embedding vector representing the input text.
[**create_file**](OPENAI_API.md#create_file) | **Post** /files | Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 
[**create_fine_tune**](OPENAI_API.md#create_fine_tune) | **Post** /fine-tunes | Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
[**create_image**](OPENAI_API.md#create_image) | **Post** /images/generations | Creates an image given a prompt.
[**create_image_edit**](OPENAI_API.md#create_image_edit) | **Post** /images/edits | Creates an edited or extended image given an original image and a prompt.
[**create_image_variation**](OPENAI_API.md#create_image_variation) | **Post** /images/variations | Creates a variation of a given image.
[**create_moderation**](OPENAI_API.md#create_moderation) | **Post** /moderations | Classifies if text violates OpenAI&#39;s Content Policy
[**create_transcription**](OPENAI_API.md#create_transcription) | **Post** /audio/transcriptions | Transcribes audio into the input language.
[**create_translation**](OPENAI_API.md#create_translation) | **Post** /audio/translations | Translates audio into English.
[**delete_file**](OPENAI_API.md#delete_file) | **Delete** /files/{file_id} | Delete a file.
[**delete_model**](OPENAI_API.md#delete_model) | **Delete** /models/{model} | Delete a fine-tuned model. You must have the Owner role in your organization.
[**download_file**](OPENAI_API.md#download_file) | **Get** /files/{file_id}/content | Returns the contents of the specified file
[**list_files**](OPENAI_API.md#list_files) | **Get** /files | Returns a list of files that belong to the user&#39;s organization.
[**list_fine_tune_events**](OPENAI_API.md#list_fine_tune_events) | **Get** /fine-tunes/{fine_tune_id}/events | Get fine-grained status updates for a fine-tune job. 
[**list_fine_tunes**](OPENAI_API.md#list_fine_tunes) | **Get** /fine-tunes | List your organization&#39;s fine-tuning jobs 
[**list_models**](OPENAI_API.md#list_models) | **Get** /models | Lists the currently available models, and provides basic information about each one such as the owner and availability.
[**retrieve_file**](OPENAI_API.md#retrieve_file) | **Get** /files/{file_id} | Returns information about a specific file.
[**retrieve_fine_tune**](OPENAI_API.md#retrieve_fine_tune) | **Get** /fine-tunes/{fine_tune_id} | Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
[**retrieve_model**](OPENAI_API.md#retrieve_model) | **Get** /models/{model} | Retrieves a model instance, providing basic information about the model such as the owner and permissioning.


# **cancel_fine_tune**
> cancel_fine_tune (fine_tune_id: STRING_32 ): detachable FINE_TUNE


Immediately cancel a fine-tune job. 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fine_tune_id** | **STRING_32**| The ID of the fine-tune job to cancel  | [default to null]

### Return type

[**FINE_TUNE**](FineTune.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_chat_completion**
> create_chat_completion (create_chat_completion_request: CREATE_CHAT_COMPLETION_REQUEST ): detachable CREATE_CHAT_COMPLETION_RESPONSE


Creates a model response for the given chat conversation.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_chat_completion_request** | [**CREATE_CHAT_COMPLETION_REQUEST**](CREATE_CHAT_COMPLETION_REQUEST.md)|  | 

### Return type

[**CREATE_CHAT_COMPLETION_RESPONSE**](CreateChatCompletionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_completion**
> create_completion (create_completion_request: CREATE_COMPLETION_REQUEST ): detachable CREATE_COMPLETION_RESPONSE


Creates a completion for the provided prompt and parameters.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_completion_request** | [**CREATE_COMPLETION_REQUEST**](CREATE_COMPLETION_REQUEST.md)|  | 

### Return type

[**CREATE_COMPLETION_RESPONSE**](CreateCompletionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_edit**
> create_edit (create_edit_request: CREATE_EDIT_REQUEST ): detachable CREATE_EDIT_RESPONSE


Creates a new edit for the provided input, instruction, and parameters.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_edit_request** | [**CREATE_EDIT_REQUEST**](CREATE_EDIT_REQUEST.md)|  | 

### Return type

[**CREATE_EDIT_RESPONSE**](CreateEditResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_embedding**
> create_embedding (create_embedding_request: CREATE_EMBEDDING_REQUEST ): detachable CREATE_EMBEDDING_RESPONSE


Creates an embedding vector representing the input text.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_embedding_request** | [**CREATE_EMBEDDING_REQUEST**](CREATE_EMBEDDING_REQUEST.md)|  | 

### Return type

[**CREATE_EMBEDDING_RESPONSE**](CreateEmbeddingResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_file**
> create_file (file: FILE ; purpose: STRING_32 ): detachable OPEN_AI_FILE


Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **FILE**| Name of the [JSON Lines](https://jsonlines.readthedocs.io/en/latest/) file to be uploaded.  If the &#x60;purpose&#x60; is set to \\\&quot;fine-tune\\\&quot;, each line is a JSON record with \\\&quot;prompt\\\&quot; and \\\&quot;completion\\\&quot; fields representing your [training examples](/docs/guides/fine-tuning/prepare-training-data).  | [default to null]
 **purpose** | **STRING_32**| The intended purpose of the uploaded documents.  Use \\\&quot;fine-tune\\\&quot; for [Fine-tuning](/docs/api-reference/fine-tunes). This allows us to validate the format of the uploaded file.  | [default to null]

### Return type

[**OPEN_AI_FILE**](OpenAIFile.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_fine_tune**
> create_fine_tune (create_fine_tune_request: CREATE_FINE_TUNE_REQUEST ): detachable FINE_TUNE


Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_fine_tune_request** | [**CREATE_FINE_TUNE_REQUEST**](CREATE_FINE_TUNE_REQUEST.md)|  | 

### Return type

[**FINE_TUNE**](FineTune.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_image**
> create_image (create_image_request: CREATE_IMAGE_REQUEST ): detachable IMAGES_RESPONSE


Creates an image given a prompt.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_image_request** | [**CREATE_IMAGE_REQUEST**](CREATE_IMAGE_REQUEST.md)|  | 

### Return type

[**IMAGES_RESPONSE**](ImagesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_image_edit**
> create_image_edit (image: FILE ; prompt: STRING_32 ; mask:  detachable FILE ; n:  detachable INTEGER_32 ; size:  detachable STRING_32 ; response_format:  detachable STRING_32 ; user:  detachable STRING_32 ): detachable IMAGES_RESPONSE


Creates an edited or extended image given an original image and a prompt.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **image** | **FILE**| The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask. | [default to null]
 **prompt** | **STRING_32**| A text description of the desired image(s). The maximum length is 1000 characters. | [default to null]
 **mask** | **FILE**| An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where &#x60;image&#x60; should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as &#x60;image&#x60;. | [optional] [default to null]
 **n** | **INTEGER_32**| The number of images to generate. Must be between 1 and 10. | [optional] [default to 1]
 **size** | **STRING_32**| The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. | [optional] [default to 1024x1024]
 **response_format** | **STRING_32**| The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. | [optional] [default to url]
 **user** | **STRING_32**| A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  | [optional] [default to null]

### Return type

[**IMAGES_RESPONSE**](ImagesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_image_variation**
> create_image_variation (image: FILE ; n:  detachable INTEGER_32 ; size:  detachable STRING_32 ; response_format:  detachable STRING_32 ; user:  detachable STRING_32 ): detachable IMAGES_RESPONSE


Creates a variation of a given image.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **image** | **FILE**| The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square. | [default to null]
 **n** | **INTEGER_32**| The number of images to generate. Must be between 1 and 10. | [optional] [default to 1]
 **size** | **STRING_32**| The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. | [optional] [default to 1024x1024]
 **response_format** | **STRING_32**| The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. | [optional] [default to url]
 **user** | **STRING_32**| A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  | [optional] [default to null]

### Return type

[**IMAGES_RESPONSE**](ImagesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_moderation**
> create_moderation (create_moderation_request: CREATE_MODERATION_REQUEST ): detachable CREATE_MODERATION_RESPONSE


Classifies if text violates OpenAI's Content Policy


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_moderation_request** | [**CREATE_MODERATION_REQUEST**](CREATE_MODERATION_REQUEST.md)|  | 

### Return type

[**CREATE_MODERATION_RESPONSE**](CreateModerationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_transcription**
> create_transcription (file: FILE ; model: CREATE_TRANSCRIPTION_REQUEST_MODEL ; prompt:  detachable STRING_32 ; response_format:  detachable STRING_32 ; temperature:  detachable REAL_32 ; language:  detachable STRING_32 ): detachable CREATE_TRANSCRIPTION_RESPONSE


Transcribes audio into the input language.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **FILE**| The audio file object (not file name) to transcribe, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm.  | [default to null]
 **model** | [**CREATE_TRANSCRIPTION_REQUEST_MODEL**](CreateTranscriptionRequest_model.md)|  | [default to null]
 **prompt** | **STRING_32**| An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language.  | [optional] [default to null]
 **response_format** | **STRING_32**| The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt.  | [optional] [default to json]
 **temperature** | **REAL_32**| The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  | [optional] [default to 0]
 **language** | **STRING_32**| The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency.  | [optional] [default to null]

### Return type

[**CREATE_TRANSCRIPTION_RESPONSE**](CreateTranscriptionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_translation**
> create_translation (file: FILE ; model: CREATE_TRANSCRIPTION_REQUEST_MODEL ; prompt:  detachable STRING_32 ; response_format:  detachable STRING_32 ; temperature:  detachable REAL_32 ): detachable CREATE_TRANSLATION_RESPONSE


Translates audio into English.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **FILE**| The audio file object (not file name) translate, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm.  | [default to null]
 **model** | [**CREATE_TRANSCRIPTION_REQUEST_MODEL**](CreateTranscriptionRequest_model.md)|  | [default to null]
 **prompt** | **STRING_32**| An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English.  | [optional] [default to null]
 **response_format** | **STRING_32**| The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt.  | [optional] [default to json]
 **temperature** | **REAL_32**| The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  | [optional] [default to 0]

### Return type

[**CREATE_TRANSLATION_RESPONSE**](CreateTranslationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_file**
> delete_file (file_id: STRING_32 ): detachable DELETE_FILE_RESPONSE


Delete a file.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file_id** | **STRING_32**| The ID of the file to use for this request | [default to null]

### Return type

[**DELETE_FILE_RESPONSE**](DeleteFileResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_model**
> delete_model (model: STRING_32 ): detachable DELETE_MODEL_RESPONSE


Delete a fine-tuned model. You must have the Owner role in your organization.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | **STRING_32**| The model to delete | [default to null]

### Return type

[**DELETE_MODEL_RESPONSE**](DeleteModelResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **download_file**
> download_file (file_id: STRING_32 ): detachable STRING_32


Returns the contents of the specified file


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file_id** | **STRING_32**| The ID of the file to use for this request | [default to null]

### Return type

[**STRING_32**](STRING_32.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_files**
> list_files : detachable LIST_FILES_RESPONSE


Returns a list of files that belong to the user's organization.


### Parameters
This endpoint does not need any parameter.

### Return type

[**LIST_FILES_RESPONSE**](ListFilesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_fine_tune_events**
> list_fine_tune_events (fine_tune_id: STRING_32 ; stream:  detachable BOOLEAN ): detachable LIST_FINE_TUNE_EVENTS_RESPONSE


Get fine-grained status updates for a fine-tune job. 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fine_tune_id** | **STRING_32**| The ID of the fine-tune job to get events for.  | [default to null]
 **stream** | **BOOLEAN**| Whether to stream events for the fine-tune job. If set to true, events will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available. The stream will terminate with a &#x60;data: [DONE]&#x60; message when the job is finished (succeeded, cancelled, or failed).  If set to false, only events generated so far will be returned.  | [optional] [default to false]

### Return type

[**LIST_FINE_TUNE_EVENTS_RESPONSE**](ListFineTuneEventsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_fine_tunes**
> list_fine_tunes : detachable LIST_FINE_TUNES_RESPONSE


List your organization's fine-tuning jobs 


### Parameters
This endpoint does not need any parameter.

### Return type

[**LIST_FINE_TUNES_RESPONSE**](ListFineTunesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_models**
> list_models : detachable LIST_MODELS_RESPONSE


Lists the currently available models, and provides basic information about each one such as the owner and availability.


### Parameters
This endpoint does not need any parameter.

### Return type

[**LIST_MODELS_RESPONSE**](ListModelsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **retrieve_file**
> retrieve_file (file_id: STRING_32 ): detachable OPEN_AI_FILE


Returns information about a specific file.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file_id** | **STRING_32**| The ID of the file to use for this request | [default to null]

### Return type

[**OPEN_AI_FILE**](OpenAIFile.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **retrieve_fine_tune**
> retrieve_fine_tune (fine_tune_id: STRING_32 ): detachable FINE_TUNE


Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fine_tune_id** | **STRING_32**| The ID of the fine-tune job  | [default to null]

### Return type

[**FINE_TUNE**](FineTune.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **retrieve_model**
> retrieve_model (model: STRING_32 ): detachable MODEL


Retrieves a model instance, providing basic information about the model such as the owner and permissioning.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | **STRING_32**| The ID of the model to use for this request | [default to null]

### Return type

[**MODEL**](Model.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

