# \OpenAiApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancel_fine_tune**](OpenAiApi.md#cancel_fine_tune) | **POST** /fine-tunes/{fine_tune_id}/cancel | Immediately cancel a fine-tune job. 
[**create_chat_completion**](OpenAiApi.md#create_chat_completion) | **POST** /chat/completions | Creates a model response for the given chat conversation.
[**create_completion**](OpenAiApi.md#create_completion) | **POST** /completions | Creates a completion for the provided prompt and parameters.
[**create_edit**](OpenAiApi.md#create_edit) | **POST** /edits | Creates a new edit for the provided input, instruction, and parameters.
[**create_embedding**](OpenAiApi.md#create_embedding) | **POST** /embeddings | Creates an embedding vector representing the input text.
[**create_file**](OpenAiApi.md#create_file) | **POST** /files | Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 
[**create_fine_tune**](OpenAiApi.md#create_fine_tune) | **POST** /fine-tunes | Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
[**create_image**](OpenAiApi.md#create_image) | **POST** /images/generations | Creates an image given a prompt.
[**create_image_edit**](OpenAiApi.md#create_image_edit) | **POST** /images/edits | Creates an edited or extended image given an original image and a prompt.
[**create_image_variation**](OpenAiApi.md#create_image_variation) | **POST** /images/variations | Creates a variation of a given image.
[**create_moderation**](OpenAiApi.md#create_moderation) | **POST** /moderations | Classifies if text violates OpenAI's Content Policy
[**create_transcription**](OpenAiApi.md#create_transcription) | **POST** /audio/transcriptions | Transcribes audio into the input language.
[**create_translation**](OpenAiApi.md#create_translation) | **POST** /audio/translations | Translates audio into English.
[**delete_file**](OpenAiApi.md#delete_file) | **DELETE** /files/{file_id} | Delete a file.
[**delete_model**](OpenAiApi.md#delete_model) | **DELETE** /models/{model} | Delete a fine-tuned model. You must have the Owner role in your organization.
[**download_file**](OpenAiApi.md#download_file) | **GET** /files/{file_id}/content | Returns the contents of the specified file
[**list_files**](OpenAiApi.md#list_files) | **GET** /files | Returns a list of files that belong to the user's organization.
[**list_fine_tune_events**](OpenAiApi.md#list_fine_tune_events) | **GET** /fine-tunes/{fine_tune_id}/events | Get fine-grained status updates for a fine-tune job. 
[**list_fine_tunes**](OpenAiApi.md#list_fine_tunes) | **GET** /fine-tunes | List your organization's fine-tuning jobs 
[**list_models**](OpenAiApi.md#list_models) | **GET** /models | Lists the currently available models, and provides basic information about each one such as the owner and availability.
[**retrieve_file**](OpenAiApi.md#retrieve_file) | **GET** /files/{file_id} | Returns information about a specific file.
[**retrieve_fine_tune**](OpenAiApi.md#retrieve_fine_tune) | **GET** /fine-tunes/{fine_tune_id} | Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
[**retrieve_model**](OpenAiApi.md#retrieve_model) | **GET** /models/{model} | Retrieves a model instance, providing basic information about the model such as the owner and permissioning.



## cancel_fine_tune

> models::FineTune cancel_fine_tune(fine_tune_id)
Immediately cancel a fine-tune job. 

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**fine_tune_id** | **String** | The ID of the fine-tune job to cancel  | [required] |

### Return type

[**models::FineTune**](FineTune.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## create_chat_completion

> models::CreateChatCompletionResponse create_chat_completion(create_chat_completion_request)
Creates a model response for the given chat conversation.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**create_chat_completion_request** | [**CreateChatCompletionRequest**](CreateChatCompletionRequest.md) |  | [required] |

### Return type

[**models::CreateChatCompletionResponse**](CreateChatCompletionResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## create_completion

> models::CreateCompletionResponse create_completion(create_completion_request)
Creates a completion for the provided prompt and parameters.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**create_completion_request** | [**CreateCompletionRequest**](CreateCompletionRequest.md) |  | [required] |

### Return type

[**models::CreateCompletionResponse**](CreateCompletionResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## create_edit

> models::CreateEditResponse create_edit(create_edit_request)
Creates a new edit for the provided input, instruction, and parameters.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**create_edit_request** | [**CreateEditRequest**](CreateEditRequest.md) |  | [required] |

### Return type

[**models::CreateEditResponse**](CreateEditResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## create_embedding

> models::CreateEmbeddingResponse create_embedding(create_embedding_request)
Creates an embedding vector representing the input text.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**create_embedding_request** | [**CreateEmbeddingRequest**](CreateEmbeddingRequest.md) |  | [required] |

### Return type

[**models::CreateEmbeddingResponse**](CreateEmbeddingResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## create_file

> models::OpenAiFile create_file(file, purpose)
Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**file** | **std::path::PathBuf** | Name of the [JSON Lines](https://jsonlines.readthedocs.io/en/latest/) file to be uploaded.  If the `purpose` is set to \\\"fine-tune\\\", each line is a JSON record with \\\"prompt\\\" and \\\"completion\\\" fields representing your [training examples](/docs/guides/fine-tuning/prepare-training-data).  | [required] |
**purpose** | **String** | The intended purpose of the uploaded documents.  Use \\\"fine-tune\\\" for [Fine-tuning](/docs/api-reference/fine-tunes). This allows us to validate the format of the uploaded file.  | [required] |

### Return type

[**models::OpenAiFile**](OpenAIFile.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## create_fine_tune

> models::FineTune create_fine_tune(create_fine_tune_request)
Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**create_fine_tune_request** | [**CreateFineTuneRequest**](CreateFineTuneRequest.md) |  | [required] |

### Return type

[**models::FineTune**](FineTune.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## create_image

> models::ImagesResponse create_image(create_image_request)
Creates an image given a prompt.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**create_image_request** | [**CreateImageRequest**](CreateImageRequest.md) |  | [required] |

### Return type

[**models::ImagesResponse**](ImagesResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## create_image_edit

> models::ImagesResponse create_image_edit(image, prompt, mask, n, size, response_format, user)
Creates an edited or extended image given an original image and a prompt.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**image** | **std::path::PathBuf** | The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask. | [required] |
**prompt** | **String** | A text description of the desired image(s). The maximum length is 1000 characters. | [required] |
**mask** | Option<**std::path::PathBuf**> | An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where `image` should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as `image`. |  |
**n** | Option<**i32**> | The number of images to generate. Must be between 1 and 10. |  |[default to 1]
**size** | Option<**String**> | The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`. |  |[default to 1024x1024]
**response_format** | Option<**String**> | The format in which the generated images are returned. Must be one of `url` or `b64_json`. |  |[default to url]
**user** | Option<**String**> | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  |  |

### Return type

[**models::ImagesResponse**](ImagesResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## create_image_variation

> models::ImagesResponse create_image_variation(image, n, size, response_format, user)
Creates a variation of a given image.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**image** | **std::path::PathBuf** | The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square. | [required] |
**n** | Option<**i32**> | The number of images to generate. Must be between 1 and 10. |  |[default to 1]
**size** | Option<**String**> | The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`. |  |[default to 1024x1024]
**response_format** | Option<**String**> | The format in which the generated images are returned. Must be one of `url` or `b64_json`. |  |[default to url]
**user** | Option<**String**> | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  |  |

### Return type

[**models::ImagesResponse**](ImagesResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## create_moderation

> models::CreateModerationResponse create_moderation(create_moderation_request)
Classifies if text violates OpenAI's Content Policy

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**create_moderation_request** | [**CreateModerationRequest**](CreateModerationRequest.md) |  | [required] |

### Return type

[**models::CreateModerationResponse**](CreateModerationResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## create_transcription

> models::CreateTranscriptionResponse create_transcription(file, model, prompt, response_format, temperature, language)
Transcribes audio into the input language.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**file** | **std::path::PathBuf** | The audio file object (not file name) to transcribe, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm.  | [required] |
**model** | [**models::CreateTranscriptionRequestModel**](CreateTranscriptionRequest_model.md) |  | [required] |
**prompt** | Option<**String**> | An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language.  |  |
**response_format** | Option<**String**> | The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt.  |  |[default to json]
**temperature** | Option<**f64**> | The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  |  |[default to 0]
**language** | Option<**String**> | The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency.  |  |

### Return type

[**models::CreateTranscriptionResponse**](CreateTranscriptionResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## create_translation

> models::CreateTranslationResponse create_translation(file, model, prompt, response_format, temperature)
Translates audio into English.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**file** | **std::path::PathBuf** | The audio file object (not file name) translate, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm.  | [required] |
**model** | [**models::CreateTranscriptionRequestModel**](CreateTranscriptionRequest_model.md) |  | [required] |
**prompt** | Option<**String**> | An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English.  |  |
**response_format** | Option<**String**> | The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt.  |  |[default to json]
**temperature** | Option<**f64**> | The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  |  |[default to 0]

### Return type

[**models::CreateTranslationResponse**](CreateTranslationResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## delete_file

> models::DeleteFileResponse delete_file(file_id)
Delete a file.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**file_id** | **String** | The ID of the file to use for this request | [required] |

### Return type

[**models::DeleteFileResponse**](DeleteFileResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## delete_model

> models::DeleteModelResponse delete_model(model)
Delete a fine-tuned model. You must have the Owner role in your organization.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**model** | **String** | The model to delete | [required] |

### Return type

[**models::DeleteModelResponse**](DeleteModelResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## download_file

> String download_file(file_id)
Returns the contents of the specified file

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**file_id** | **String** | The ID of the file to use for this request | [required] |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## list_files

> models::ListFilesResponse list_files()
Returns a list of files that belong to the user's organization.

### Parameters

This endpoint does not need any parameter.

### Return type

[**models::ListFilesResponse**](ListFilesResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## list_fine_tune_events

> models::ListFineTuneEventsResponse list_fine_tune_events(fine_tune_id, stream)
Get fine-grained status updates for a fine-tune job. 

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**fine_tune_id** | **String** | The ID of the fine-tune job to get events for.  | [required] |
**stream** | Option<**bool**> | Whether to stream events for the fine-tune job. If set to true, events will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available. The stream will terminate with a `data: [DONE]` message when the job is finished (succeeded, cancelled, or failed).  If set to false, only events generated so far will be returned.  |  |[default to false]

### Return type

[**models::ListFineTuneEventsResponse**](ListFineTuneEventsResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## list_fine_tunes

> models::ListFineTunesResponse list_fine_tunes()
List your organization's fine-tuning jobs 

### Parameters

This endpoint does not need any parameter.

### Return type

[**models::ListFineTunesResponse**](ListFineTunesResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## list_models

> models::ListModelsResponse list_models()
Lists the currently available models, and provides basic information about each one such as the owner and availability.

### Parameters

This endpoint does not need any parameter.

### Return type

[**models::ListModelsResponse**](ListModelsResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## retrieve_file

> models::OpenAiFile retrieve_file(file_id)
Returns information about a specific file.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**file_id** | **String** | The ID of the file to use for this request | [required] |

### Return type

[**models::OpenAiFile**](OpenAIFile.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## retrieve_fine_tune

> models::FineTune retrieve_fine_tune(fine_tune_id)
Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**fine_tune_id** | **String** | The ID of the fine-tune job  | [required] |

### Return type

[**models::FineTune**](FineTune.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## retrieve_model

> models::Model retrieve_model(model)
Retrieves a model instance, providing basic information about the model such as the owner and permissioning.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**model** | **String** | The ID of the model to use for this request | [required] |

### Return type

[**models::Model**](Model.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

