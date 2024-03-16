# OpenAIAPI

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**OpenAIAPI_cancelFineTune**](OpenAIAPI.md#OpenAIAPI_cancelFineTune) | **POST** /fine-tunes/{fine_tune_id}/cancel | Immediately cancel a fine-tune job. 
[**OpenAIAPI_createChatCompletion**](OpenAIAPI.md#OpenAIAPI_createChatCompletion) | **POST** /chat/completions | Creates a model response for the given chat conversation.
[**OpenAIAPI_createCompletion**](OpenAIAPI.md#OpenAIAPI_createCompletion) | **POST** /completions | Creates a completion for the provided prompt and parameters.
[**OpenAIAPI_createEdit**](OpenAIAPI.md#OpenAIAPI_createEdit) | **POST** /edits | Creates a new edit for the provided input, instruction, and parameters.
[**OpenAIAPI_createEmbedding**](OpenAIAPI.md#OpenAIAPI_createEmbedding) | **POST** /embeddings | Creates an embedding vector representing the input text.
[**OpenAIAPI_createFile**](OpenAIAPI.md#OpenAIAPI_createFile) | **POST** /files | Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 
[**OpenAIAPI_createFineTune**](OpenAIAPI.md#OpenAIAPI_createFineTune) | **POST** /fine-tunes | Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
[**OpenAIAPI_createImage**](OpenAIAPI.md#OpenAIAPI_createImage) | **POST** /images/generations | Creates an image given a prompt.
[**OpenAIAPI_createImageEdit**](OpenAIAPI.md#OpenAIAPI_createImageEdit) | **POST** /images/edits | Creates an edited or extended image given an original image and a prompt.
[**OpenAIAPI_createImageVariation**](OpenAIAPI.md#OpenAIAPI_createImageVariation) | **POST** /images/variations | Creates a variation of a given image.
[**OpenAIAPI_createModeration**](OpenAIAPI.md#OpenAIAPI_createModeration) | **POST** /moderations | Classifies if text violates OpenAI&#39;s Content Policy
[**OpenAIAPI_createTranscription**](OpenAIAPI.md#OpenAIAPI_createTranscription) | **POST** /audio/transcriptions | Transcribes audio into the input language.
[**OpenAIAPI_createTranslation**](OpenAIAPI.md#OpenAIAPI_createTranslation) | **POST** /audio/translations | Translates audio into English.
[**OpenAIAPI_deleteFile**](OpenAIAPI.md#OpenAIAPI_deleteFile) | **DELETE** /files/{file_id} | Delete a file.
[**OpenAIAPI_deleteModel**](OpenAIAPI.md#OpenAIAPI_deleteModel) | **DELETE** /models/{model} | Delete a fine-tuned model. You must have the Owner role in your organization.
[**OpenAIAPI_downloadFile**](OpenAIAPI.md#OpenAIAPI_downloadFile) | **GET** /files/{file_id}/content | Returns the contents of the specified file
[**OpenAIAPI_listFiles**](OpenAIAPI.md#OpenAIAPI_listFiles) | **GET** /files | Returns a list of files that belong to the user&#39;s organization.
[**OpenAIAPI_listFineTuneEvents**](OpenAIAPI.md#OpenAIAPI_listFineTuneEvents) | **GET** /fine-tunes/{fine_tune_id}/events | Get fine-grained status updates for a fine-tune job. 
[**OpenAIAPI_listFineTunes**](OpenAIAPI.md#OpenAIAPI_listFineTunes) | **GET** /fine-tunes | List your organization&#39;s fine-tuning jobs 
[**OpenAIAPI_listModels**](OpenAIAPI.md#OpenAIAPI_listModels) | **GET** /models | Lists the currently available models, and provides basic information about each one such as the owner and availability.
[**OpenAIAPI_retrieveFile**](OpenAIAPI.md#OpenAIAPI_retrieveFile) | **GET** /files/{file_id} | Returns information about a specific file.
[**OpenAIAPI_retrieveFineTune**](OpenAIAPI.md#OpenAIAPI_retrieveFineTune) | **GET** /fine-tunes/{fine_tune_id} | Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
[**OpenAIAPI_retrieveModel**](OpenAIAPI.md#OpenAIAPI_retrieveModel) | **GET** /models/{model} | Retrieves a model instance, providing basic information about the model such as the owner and permissioning.


# **OpenAIAPI_cancelFineTune**
```c
// Immediately cancel a fine-tune job. 
//
fine_tune_t* OpenAIAPI_cancelFineTune(apiClient_t *apiClient, char *fine_tune_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**fine_tune_id** | **char \*** | The ID of the fine-tune job to cancel  | 

### Return type

[fine_tune_t](fine_tune.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **OpenAIAPI_createChatCompletion**
```c
// Creates a model response for the given chat conversation.
//
create_chat_completion_response_t* OpenAIAPI_createChatCompletion(apiClient_t *apiClient, create_chat_completion_request_t *create_chat_completion_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**create_chat_completion_request** | **[create_chat_completion_request_t](create_chat_completion_request.md) \*** |  | 

### Return type

[create_chat_completion_response_t](create_chat_completion_response.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **OpenAIAPI_createCompletion**
```c
// Creates a completion for the provided prompt and parameters.
//
create_completion_response_t* OpenAIAPI_createCompletion(apiClient_t *apiClient, create_completion_request_t *create_completion_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**create_completion_request** | **[create_completion_request_t](create_completion_request.md) \*** |  | 

### Return type

[create_completion_response_t](create_completion_response.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **OpenAIAPI_createEdit**
```c
// Creates a new edit for the provided input, instruction, and parameters.
//
create_edit_response_t* OpenAIAPI_createEdit(apiClient_t *apiClient, create_edit_request_t *create_edit_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**create_edit_request** | **[create_edit_request_t](create_edit_request.md) \*** |  | 

### Return type

[create_edit_response_t](create_edit_response.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **OpenAIAPI_createEmbedding**
```c
// Creates an embedding vector representing the input text.
//
create_embedding_response_t* OpenAIAPI_createEmbedding(apiClient_t *apiClient, create_embedding_request_t *create_embedding_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**create_embedding_request** | **[create_embedding_request_t](create_embedding_request.md) \*** |  | 

### Return type

[create_embedding_response_t](create_embedding_response.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **OpenAIAPI_createFile**
```c
// Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 
//
open_ai_file_t* OpenAIAPI_createFile(apiClient_t *apiClient, binary_t* file, char *purpose);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**file** | **binary_t*** | Name of the [JSON Lines](https://jsonlines.readthedocs.io/en/latest/) file to be uploaded.  If the &#x60;purpose&#x60; is set to \\\&quot;fine-tune\\\&quot;, each line is a JSON record with \\\&quot;prompt\\\&quot; and \\\&quot;completion\\\&quot; fields representing your [training examples](/docs/guides/fine-tuning/prepare-training-data).  | 
**purpose** | **char \*** | The intended purpose of the uploaded documents.  Use \\\&quot;fine-tune\\\&quot; for [Fine-tuning](/docs/api-reference/fine-tunes). This allows us to validate the format of the uploaded file.  | 

### Return type

[open_ai_file_t](open_ai_file.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **OpenAIAPI_createFineTune**
```c
// Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
//
fine_tune_t* OpenAIAPI_createFineTune(apiClient_t *apiClient, create_fine_tune_request_t *create_fine_tune_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**create_fine_tune_request** | **[create_fine_tune_request_t](create_fine_tune_request.md) \*** |  | 

### Return type

[fine_tune_t](fine_tune.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **OpenAIAPI_createImage**
```c
// Creates an image given a prompt.
//
images_response_t* OpenAIAPI_createImage(apiClient_t *apiClient, create_image_request_t *create_image_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**create_image_request** | **[create_image_request_t](create_image_request.md) \*** |  | 

### Return type

[images_response_t](images_response.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **OpenAIAPI_createImageEdit**
```c
// Creates an edited or extended image given an original image and a prompt.
//
images_response_t* OpenAIAPI_createImageEdit(apiClient_t *apiClient, binary_t* image, char *prompt, binary_t* mask, int *n, openai_api_createImageEdit_size_e size, openai_api_createImageEdit_response_format_e response_format, char *user);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**image** | **binary_t*** | The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask. | 
**prompt** | **char \*** | A text description of the desired image(s). The maximum length is 1000 characters. | 
**mask** | **binary_t*** | An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where &#x60;image&#x60; should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as &#x60;image&#x60;. | [optional] 
**n** | **int \*** | The number of images to generate. Must be between 1 and 10. | [optional] [default to 1]
**size** | **openai_api_createImageEdit_size_e** | The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. | [optional] [default to &#39;1024x1024&#39;]
**response_format** | **openai_api_createImageEdit_response_format_e** | The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. | [optional] [default to &#39;url&#39;]
**user** | **char \*** | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  | [optional] 

### Return type

[images_response_t](images_response.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **OpenAIAPI_createImageVariation**
```c
// Creates a variation of a given image.
//
images_response_t* OpenAIAPI_createImageVariation(apiClient_t *apiClient, binary_t* image, int *n, openai_api_createImageVariation_size_e size, openai_api_createImageVariation_response_format_e response_format, char *user);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**image** | **binary_t*** | The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square. | 
**n** | **int \*** | The number of images to generate. Must be between 1 and 10. | [optional] [default to 1]
**size** | **openai_api_createImageVariation_size_e** | The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. | [optional] [default to &#39;1024x1024&#39;]
**response_format** | **openai_api_createImageVariation_response_format_e** | The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. | [optional] [default to &#39;url&#39;]
**user** | **char \*** | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  | [optional] 

### Return type

[images_response_t](images_response.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **OpenAIAPI_createModeration**
```c
// Classifies if text violates OpenAI's Content Policy
//
create_moderation_response_t* OpenAIAPI_createModeration(apiClient_t *apiClient, create_moderation_request_t *create_moderation_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**create_moderation_request** | **[create_moderation_request_t](create_moderation_request.md) \*** |  | 

### Return type

[create_moderation_response_t](create_moderation_response.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **OpenAIAPI_createTranscription**
```c
// Transcribes audio into the input language.
//
create_transcription_response_t* OpenAIAPI_createTranscription(apiClient_t *apiClient, binary_t* file, create_transcription_request_model_t *model, char *prompt, char *response_format, double temperature, char *language);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**file** | **binary_t*** | The audio file object (not file name) to transcribe, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm.  | 
**model** | **[create_transcription_request_model_t](create_transcription_request_model.md) \*** |  | 
**prompt** | **char \*** | An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language.  | [optional] 
**response_format** | **char \*** | The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt.  | [optional] [default to &#39;json&#39;]
**temperature** | **double** | The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  | [optional] [default to 0]
**language** | **char \*** | The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency.  | [optional] 

### Return type

[create_transcription_response_t](create_transcription_response.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **OpenAIAPI_createTranslation**
```c
// Translates audio into English.
//
create_translation_response_t* OpenAIAPI_createTranslation(apiClient_t *apiClient, binary_t* file, create_transcription_request_model_t *model, char *prompt, char *response_format, double temperature);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**file** | **binary_t*** | The audio file object (not file name) translate, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm.  | 
**model** | **[create_transcription_request_model_t](create_transcription_request_model.md) \*** |  | 
**prompt** | **char \*** | An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English.  | [optional] 
**response_format** | **char \*** | The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt.  | [optional] [default to &#39;json&#39;]
**temperature** | **double** | The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  | [optional] [default to 0]

### Return type

[create_translation_response_t](create_translation_response.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **OpenAIAPI_deleteFile**
```c
// Delete a file.
//
delete_file_response_t* OpenAIAPI_deleteFile(apiClient_t *apiClient, char *file_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**file_id** | **char \*** | The ID of the file to use for this request | 

### Return type

[delete_file_response_t](delete_file_response.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **OpenAIAPI_deleteModel**
```c
// Delete a fine-tuned model. You must have the Owner role in your organization.
//
delete_model_response_t* OpenAIAPI_deleteModel(apiClient_t *apiClient, char *model);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**model** | **char \*** | The model to delete | 

### Return type

[delete_model_response_t](delete_model_response.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **OpenAIAPI_downloadFile**
```c
// Returns the contents of the specified file
//
char* OpenAIAPI_downloadFile(apiClient_t *apiClient, char *file_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**file_id** | **char \*** | The ID of the file to use for this request | 

### Return type

char*



### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **OpenAIAPI_listFiles**
```c
// Returns a list of files that belong to the user's organization.
//
list_files_response_t* OpenAIAPI_listFiles(apiClient_t *apiClient);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |

### Return type

[list_files_response_t](list_files_response.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **OpenAIAPI_listFineTuneEvents**
```c
// Get fine-grained status updates for a fine-tune job. 
//
list_fine_tune_events_response_t* OpenAIAPI_listFineTuneEvents(apiClient_t *apiClient, char *fine_tune_id, int *stream);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**fine_tune_id** | **char \*** | The ID of the fine-tune job to get events for.  | 
**stream** | **int \*** | Whether to stream events for the fine-tune job. If set to true, events will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available. The stream will terminate with a &#x60;data: [DONE]&#x60; message when the job is finished (succeeded, cancelled, or failed).  If set to false, only events generated so far will be returned.  | [optional] [default to false]

### Return type

[list_fine_tune_events_response_t](list_fine_tune_events_response.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **OpenAIAPI_listFineTunes**
```c
// List your organization's fine-tuning jobs 
//
list_fine_tunes_response_t* OpenAIAPI_listFineTunes(apiClient_t *apiClient);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |

### Return type

[list_fine_tunes_response_t](list_fine_tunes_response.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **OpenAIAPI_listModels**
```c
// Lists the currently available models, and provides basic information about each one such as the owner and availability.
//
list_models_response_t* OpenAIAPI_listModels(apiClient_t *apiClient);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |

### Return type

[list_models_response_t](list_models_response.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **OpenAIAPI_retrieveFile**
```c
// Returns information about a specific file.
//
open_ai_file_t* OpenAIAPI_retrieveFile(apiClient_t *apiClient, char *file_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**file_id** | **char \*** | The ID of the file to use for this request | 

### Return type

[open_ai_file_t](open_ai_file.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **OpenAIAPI_retrieveFineTune**
```c
// Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
//
fine_tune_t* OpenAIAPI_retrieveFineTune(apiClient_t *apiClient, char *fine_tune_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**fine_tune_id** | **char \*** | The ID of the fine-tune job  | 

### Return type

[fine_tune_t](fine_tune.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **OpenAIAPI_retrieveModel**
```c
// Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
//
model_t* OpenAIAPI_retrieveModel(apiClient_t *apiClient, char *model);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**model** | **char \*** | The ID of the model to use for this request | 

### Return type

[model_t](model.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

