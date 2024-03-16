# OpenAIApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CancelFineTune**](OpenAIApi.md#CancelFineTune) | **POST** /fine-tunes/{fine_tune_id}/cancel | Immediately cancel a fine-tune job. 
[**CreateChatCompletion**](OpenAIApi.md#CreateChatCompletion) | **POST** /chat/completions | Creates a model response for the given chat conversation.
[**CreateCompletion**](OpenAIApi.md#CreateCompletion) | **POST** /completions | Creates a completion for the provided prompt and parameters.
[**CreateEdit**](OpenAIApi.md#CreateEdit) | **POST** /edits | Creates a new edit for the provided input, instruction, and parameters.
[**CreateEmbedding**](OpenAIApi.md#CreateEmbedding) | **POST** /embeddings | Creates an embedding vector representing the input text.
[**CreateFile**](OpenAIApi.md#CreateFile) | **POST** /files | Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 
[**CreateFineTune**](OpenAIApi.md#CreateFineTune) | **POST** /fine-tunes | Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
[**CreateImage**](OpenAIApi.md#CreateImage) | **POST** /images/generations | Creates an image given a prompt.
[**CreateImageEdit**](OpenAIApi.md#CreateImageEdit) | **POST** /images/edits | Creates an edited or extended image given an original image and a prompt.
[**CreateImageVariation**](OpenAIApi.md#CreateImageVariation) | **POST** /images/variations | Creates a variation of a given image.
[**CreateModeration**](OpenAIApi.md#CreateModeration) | **POST** /moderations | Classifies if text violates OpenAI&#39;s Content Policy
[**CreateTranscription**](OpenAIApi.md#CreateTranscription) | **POST** /audio/transcriptions | Transcribes audio into the input language.
[**CreateTranslation**](OpenAIApi.md#CreateTranslation) | **POST** /audio/translations | Translates audio into English.
[**DeleteFile**](OpenAIApi.md#DeleteFile) | **DELETE** /files/{file_id} | Delete a file.
[**DeleteModel**](OpenAIApi.md#DeleteModel) | **DELETE** /models/{model} | Delete a fine-tuned model. You must have the Owner role in your organization.
[**DownloadFile**](OpenAIApi.md#DownloadFile) | **GET** /files/{file_id}/content | Returns the contents of the specified file
[**ListFiles**](OpenAIApi.md#ListFiles) | **GET** /files | Returns a list of files that belong to the user&#39;s organization.
[**ListFineTuneEvents**](OpenAIApi.md#ListFineTuneEvents) | **GET** /fine-tunes/{fine_tune_id}/events | Get fine-grained status updates for a fine-tune job. 
[**ListFineTunes**](OpenAIApi.md#ListFineTunes) | **GET** /fine-tunes | List your organization&#39;s fine-tuning jobs 
[**ListModels**](OpenAIApi.md#ListModels) | **GET** /models | Lists the currently available models, and provides basic information about each one such as the owner and availability.
[**RetrieveFile**](OpenAIApi.md#RetrieveFile) | **GET** /files/{file_id} | Returns information about a specific file.
[**RetrieveFineTune**](OpenAIApi.md#RetrieveFineTune) | **GET** /fine-tunes/{fine_tune_id} | Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
[**RetrieveModel**](OpenAIApi.md#RetrieveModel) | **GET** /models/{model} | Retrieves a model instance, providing basic information about the model such as the owner and permissioning.


# **CancelFineTune**
> FineTune CancelFineTune(fine_tune_id)

Immediately cancel a fine-tune job. 

### Example
```R
library(openapi)

# Immediately cancel a fine-tune job. 
#
# prepare function argument(s)
var_fine_tune_id <- "ft-AF1WoRqd3aJAHsqc9NY7iL8F" # character | The ID of the fine-tune job to cancel 

api_instance <- OpenAIApi$new()
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CancelFineTune(var_fine_tune_iddata_file = "result.txt")
result <- api_instance$CancelFineTune(var_fine_tune_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fine_tune_id** | **character**| The ID of the fine-tune job to cancel  | 

### Return type

[**FineTune**](FineTune.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

# **CreateChatCompletion**
> CreateChatCompletionResponse CreateChatCompletion(create_chat_completion_request)

Creates a model response for the given chat conversation.

### Example
```R
library(openapi)

# Creates a model response for the given chat conversation.
#
# prepare function argument(s)
var_create_chat_completion_request <- CreateChatCompletionRequest$new(CreateChatCompletionRequest_model$new(), c(ChatCompletionRequestMessage$new("system", "content_example", "name_example", ChatCompletionRequestMessage_function_call$new("name_example", "arguments_example"))), c(ChatCompletionFunctions$new("name_example", "description_example", c(key = TODO))), CreateChatCompletionRequest_function_call$new("name_example"), 123, 123, 123, "stream_example", CreateChatCompletionRequest_stop$new(), 123, 123, 123, 123, "user_example") # CreateChatCompletionRequest | 

api_instance <- OpenAIApi$new()
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CreateChatCompletion(var_create_chat_completion_requestdata_file = "result.txt")
result <- api_instance$CreateChatCompletion(var_create_chat_completion_request)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_chat_completion_request** | [**CreateChatCompletionRequest**](CreateChatCompletionRequest.md)|  | 

### Return type

[**CreateChatCompletionResponse**](CreateChatCompletionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

# **CreateCompletion**
> CreateCompletionResponse CreateCompletion(create_completion_request)

Creates a completion for the provided prompt and parameters.

### Example
```R
library(openapi)

# Creates a completion for the provided prompt and parameters.
#
# prepare function argument(s)
var_create_completion_request <- CreateCompletionRequest$new(CreateCompletionRequest_model$new(), CreateCompletionRequest_prompt$new(), "suffix_example", 123, 123, 123, 123, "stream_example", 123, "echo_example", CreateCompletionRequest_stop$new(), 123, 123, 123, 123, "user_example") # CreateCompletionRequest | 

api_instance <- OpenAIApi$new()
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CreateCompletion(var_create_completion_requestdata_file = "result.txt")
result <- api_instance$CreateCompletion(var_create_completion_request)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_completion_request** | [**CreateCompletionRequest**](CreateCompletionRequest.md)|  | 

### Return type

[**CreateCompletionResponse**](CreateCompletionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

# **CreateEdit**
> CreateEditResponse CreateEdit(create_edit_request)

Creates a new edit for the provided input, instruction, and parameters.

### Example
```R
library(openapi)

# Creates a new edit for the provided input, instruction, and parameters.
#
# prepare function argument(s)
var_create_edit_request <- CreateEditRequest$new(CreateEditRequest_model$new(), "instruction_example", "input_example", 123, 123, 123) # CreateEditRequest | 

api_instance <- OpenAIApi$new()
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CreateEdit(var_create_edit_requestdata_file = "result.txt")
result <- api_instance$CreateEdit(var_create_edit_request)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_edit_request** | [**CreateEditRequest**](CreateEditRequest.md)|  | 

### Return type

[**CreateEditResponse**](CreateEditResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

# **CreateEmbedding**
> CreateEmbeddingResponse CreateEmbedding(create_embedding_request)

Creates an embedding vector representing the input text.

### Example
```R
library(openapi)

# Creates an embedding vector representing the input text.
#
# prepare function argument(s)
var_create_embedding_request <- CreateEmbeddingRequest$new(CreateEmbeddingRequest_model$new(), CreateEmbeddingRequest_input$new(), "user_example") # CreateEmbeddingRequest | 

api_instance <- OpenAIApi$new()
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CreateEmbedding(var_create_embedding_requestdata_file = "result.txt")
result <- api_instance$CreateEmbedding(var_create_embedding_request)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_embedding_request** | [**CreateEmbeddingRequest**](CreateEmbeddingRequest.md)|  | 

### Return type

[**CreateEmbeddingResponse**](CreateEmbeddingResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

# **CreateFile**
> OpenAIFile CreateFile(file, purpose)

Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 

### Example
```R
library(openapi)

# Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 
#
# prepare function argument(s)
var_file <- File.new('/path/to/file') # data.frame | Name of the [JSON Lines](https://jsonlines.readthedocs.io/en/latest/) file to be uploaded.  If the `purpose` is set to \\\"fine-tune\\\", each line is a JSON record with \\\"prompt\\\" and \\\"completion\\\" fields representing your [training examples](/docs/guides/fine-tuning/prepare-training-data). 
var_purpose <- "purpose_example" # character | The intended purpose of the uploaded documents.  Use \\\"fine-tune\\\" for [Fine-tuning](/docs/api-reference/fine-tunes). This allows us to validate the format of the uploaded file. 

api_instance <- OpenAIApi$new()
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CreateFile(var_file, var_purposedata_file = "result.txt")
result <- api_instance$CreateFile(var_file, var_purpose)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **data.frame**| Name of the [JSON Lines](https://jsonlines.readthedocs.io/en/latest/) file to be uploaded.  If the &#x60;purpose&#x60; is set to \\\&quot;fine-tune\\\&quot;, each line is a JSON record with \\\&quot;prompt\\\&quot; and \\\&quot;completion\\\&quot; fields representing your [training examples](/docs/guides/fine-tuning/prepare-training-data).  | 
 **purpose** | **character**| The intended purpose of the uploaded documents.  Use \\\&quot;fine-tune\\\&quot; for [Fine-tuning](/docs/api-reference/fine-tunes). This allows us to validate the format of the uploaded file.  | 

### Return type

[**OpenAIFile**](OpenAIFile.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

# **CreateFineTune**
> FineTune CreateFineTune(create_fine_tune_request)

Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 

### Example
```R
library(openapi)

# Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
#
# prepare function argument(s)
var_create_fine_tune_request <- CreateFineTuneRequest$new("training_file_example", "validation_file_example", CreateFineTuneRequest_model$new(), 123, 123, 123, 123, "compute_classification_metrics_example", 123, "classification_positive_class_example", c(123), "suffix_example") # CreateFineTuneRequest | 

api_instance <- OpenAIApi$new()
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CreateFineTune(var_create_fine_tune_requestdata_file = "result.txt")
result <- api_instance$CreateFineTune(var_create_fine_tune_request)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_fine_tune_request** | [**CreateFineTuneRequest**](CreateFineTuneRequest.md)|  | 

### Return type

[**FineTune**](FineTune.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

# **CreateImage**
> ImagesResponse CreateImage(create_image_request)

Creates an image given a prompt.

### Example
```R
library(openapi)

# Creates an image given a prompt.
#
# prepare function argument(s)
var_create_image_request <- CreateImageRequest$new("prompt_example", 123, "256x256", "url", "user_example") # CreateImageRequest | 

api_instance <- OpenAIApi$new()
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CreateImage(var_create_image_requestdata_file = "result.txt")
result <- api_instance$CreateImage(var_create_image_request)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_image_request** | [**CreateImageRequest**](CreateImageRequest.md)|  | 

### Return type

[**ImagesResponse**](ImagesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

# **CreateImageEdit**
> ImagesResponse CreateImageEdit(image, prompt, mask = var.mask, n = 1, size = "1024x1024", response_format = "url", user = var.user)

Creates an edited or extended image given an original image and a prompt.

### Example
```R
library(openapi)

# Creates an edited or extended image given an original image and a prompt.
#
# prepare function argument(s)
var_image <- File.new('/path/to/file') # data.frame | The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask.
var_prompt <- "prompt_example" # character | A text description of the desired image(s). The maximum length is 1000 characters.
var_mask <- File.new('/path/to/file') # data.frame | An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where `image` should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as `image`. (Optional)
var_n <- 1 # integer | The number of images to generate. Must be between 1 and 10. (Optional)
var_size <- "1024x1024" # character | The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`. (Optional)
var_response_format <- "url" # character | The format in which the generated images are returned. Must be one of `url` or `b64_json`. (Optional)
var_user <- "user_example" # character | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  (Optional)

api_instance <- OpenAIApi$new()
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CreateImageEdit(var_image, var_prompt, mask = var_mask, n = var_n, size = var_size, response_format = var_response_format, user = var_userdata_file = "result.txt")
result <- api_instance$CreateImageEdit(var_image, var_prompt, mask = var_mask, n = var_n, size = var_size, response_format = var_response_format, user = var_user)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **image** | **data.frame**| The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask. | 
 **prompt** | **character**| A text description of the desired image(s). The maximum length is 1000 characters. | 
 **mask** | **data.frame**| An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where &#x60;image&#x60; should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as &#x60;image&#x60;. | [optional] 
 **n** | **integer**| The number of images to generate. Must be between 1 and 10. | [optional] [default to 1]
 **size** | Enum [256x256, 512x512, 1024x1024] | The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. | [optional] [default to &quot;1024x1024&quot;]
 **response_format** | Enum [url, b64_json] | The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. | [optional] [default to &quot;url&quot;]
 **user** | **character**| A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  | [optional] 

### Return type

[**ImagesResponse**](ImagesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

# **CreateImageVariation**
> ImagesResponse CreateImageVariation(image, n = 1, size = "1024x1024", response_format = "url", user = var.user)

Creates a variation of a given image.

### Example
```R
library(openapi)

# Creates a variation of a given image.
#
# prepare function argument(s)
var_image <- File.new('/path/to/file') # data.frame | The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square.
var_n <- 1 # integer | The number of images to generate. Must be between 1 and 10. (Optional)
var_size <- "1024x1024" # character | The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`. (Optional)
var_response_format <- "url" # character | The format in which the generated images are returned. Must be one of `url` or `b64_json`. (Optional)
var_user <- "user_example" # character | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  (Optional)

api_instance <- OpenAIApi$new()
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CreateImageVariation(var_image, n = var_n, size = var_size, response_format = var_response_format, user = var_userdata_file = "result.txt")
result <- api_instance$CreateImageVariation(var_image, n = var_n, size = var_size, response_format = var_response_format, user = var_user)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **image** | **data.frame**| The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square. | 
 **n** | **integer**| The number of images to generate. Must be between 1 and 10. | [optional] [default to 1]
 **size** | Enum [256x256, 512x512, 1024x1024] | The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. | [optional] [default to &quot;1024x1024&quot;]
 **response_format** | Enum [url, b64_json] | The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. | [optional] [default to &quot;url&quot;]
 **user** | **character**| A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  | [optional] 

### Return type

[**ImagesResponse**](ImagesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

# **CreateModeration**
> CreateModerationResponse CreateModeration(create_moderation_request)

Classifies if text violates OpenAI's Content Policy

### Example
```R
library(openapi)

# Classifies if text violates OpenAI's Content Policy
#
# prepare function argument(s)
var_create_moderation_request <- CreateModerationRequest$new(CreateModerationRequest_input$new(), CreateModerationRequest_model$new()) # CreateModerationRequest | 

api_instance <- OpenAIApi$new()
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CreateModeration(var_create_moderation_requestdata_file = "result.txt")
result <- api_instance$CreateModeration(var_create_moderation_request)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_moderation_request** | [**CreateModerationRequest**](CreateModerationRequest.md)|  | 

### Return type

[**CreateModerationResponse**](CreateModerationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

# **CreateTranscription**
> CreateTranscriptionResponse CreateTranscription(file, model, prompt = var.prompt, response_format = "json", temperature = 0, language = var.language)

Transcribes audio into the input language.

### Example
```R
library(openapi)

# Transcribes audio into the input language.
#
# prepare function argument(s)
var_file <- File.new('/path/to/file') # data.frame | The audio file object (not file name) to transcribe, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm. 
var_model <- CreateTranscriptionRequest_model$new() # CreateTranscriptionRequestModel | 
var_prompt <- "prompt_example" # character | An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language.  (Optional)
var_response_format <- "json" # character | The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt.  (Optional)
var_temperature <- 0 # numeric | The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  (Optional)
var_language <- "language_example" # character | The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency.  (Optional)

api_instance <- OpenAIApi$new()
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CreateTranscription(var_file, var_model, prompt = var_prompt, response_format = var_response_format, temperature = var_temperature, language = var_languagedata_file = "result.txt")
result <- api_instance$CreateTranscription(var_file, var_model, prompt = var_prompt, response_format = var_response_format, temperature = var_temperature, language = var_language)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **data.frame**| The audio file object (not file name) to transcribe, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm.  | 
 **model** | [**CreateTranscriptionRequestModel**](CreateTranscriptionRequest_model.md)|  | 
 **prompt** | **character**| An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language.  | [optional] 
 **response_format** | **character**| The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt.  | [optional] [default to &quot;json&quot;]
 **temperature** | **numeric**| The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  | [optional] [default to 0]
 **language** | **character**| The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency.  | [optional] 

### Return type

[**CreateTranscriptionResponse**](CreateTranscriptionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

# **CreateTranslation**
> CreateTranslationResponse CreateTranslation(file, model, prompt = var.prompt, response_format = "json", temperature = 0)

Translates audio into English.

### Example
```R
library(openapi)

# Translates audio into English.
#
# prepare function argument(s)
var_file <- File.new('/path/to/file') # data.frame | The audio file object (not file name) translate, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm. 
var_model <- CreateTranscriptionRequest_model$new() # CreateTranscriptionRequestModel | 
var_prompt <- "prompt_example" # character | An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English.  (Optional)
var_response_format <- "json" # character | The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt.  (Optional)
var_temperature <- 0 # numeric | The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  (Optional)

api_instance <- OpenAIApi$new()
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CreateTranslation(var_file, var_model, prompt = var_prompt, response_format = var_response_format, temperature = var_temperaturedata_file = "result.txt")
result <- api_instance$CreateTranslation(var_file, var_model, prompt = var_prompt, response_format = var_response_format, temperature = var_temperature)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **data.frame**| The audio file object (not file name) translate, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm.  | 
 **model** | [**CreateTranscriptionRequestModel**](CreateTranscriptionRequest_model.md)|  | 
 **prompt** | **character**| An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English.  | [optional] 
 **response_format** | **character**| The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt.  | [optional] [default to &quot;json&quot;]
 **temperature** | **numeric**| The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  | [optional] [default to 0]

### Return type

[**CreateTranslationResponse**](CreateTranslationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

# **DeleteFile**
> DeleteFileResponse DeleteFile(file_id)

Delete a file.

### Example
```R
library(openapi)

# Delete a file.
#
# prepare function argument(s)
var_file_id <- "file_id_example" # character | The ID of the file to use for this request

api_instance <- OpenAIApi$new()
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$DeleteFile(var_file_iddata_file = "result.txt")
result <- api_instance$DeleteFile(var_file_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file_id** | **character**| The ID of the file to use for this request | 

### Return type

[**DeleteFileResponse**](DeleteFileResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

# **DeleteModel**
> DeleteModelResponse DeleteModel(model)

Delete a fine-tuned model. You must have the Owner role in your organization.

### Example
```R
library(openapi)

# Delete a fine-tuned model. You must have the Owner role in your organization.
#
# prepare function argument(s)
var_model <- "curie:ft-acmeco-2021-03-03-21-44-20" # character | The model to delete

api_instance <- OpenAIApi$new()
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$DeleteModel(var_modeldata_file = "result.txt")
result <- api_instance$DeleteModel(var_model)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | **character**| The model to delete | 

### Return type

[**DeleteModelResponse**](DeleteModelResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

# **DownloadFile**
> character DownloadFile(file_id)

Returns the contents of the specified file

### Example
```R
library(openapi)

# Returns the contents of the specified file
#
# prepare function argument(s)
var_file_id <- "file_id_example" # character | The ID of the file to use for this request

api_instance <- OpenAIApi$new()
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$DownloadFile(var_file_iddata_file = "result.txt")
result <- api_instance$DownloadFile(var_file_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file_id** | **character**| The ID of the file to use for this request | 

### Return type

**character**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

# **ListFiles**
> ListFilesResponse ListFiles()

Returns a list of files that belong to the user's organization.

### Example
```R
library(openapi)

# Returns a list of files that belong to the user's organization.
#

api_instance <- OpenAIApi$new()
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$ListFiles(data_file = "result.txt")
result <- api_instance$ListFiles()
dput(result)
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

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

# **ListFineTuneEvents**
> ListFineTuneEventsResponse ListFineTuneEvents(fine_tune_id, stream = FALSE)

Get fine-grained status updates for a fine-tune job. 

### Example
```R
library(openapi)

# Get fine-grained status updates for a fine-tune job. 
#
# prepare function argument(s)
var_fine_tune_id <- "ft-AF1WoRqd3aJAHsqc9NY7iL8F" # character | The ID of the fine-tune job to get events for. 
var_stream <- FALSE # character | Whether to stream events for the fine-tune job. If set to true, events will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available. The stream will terminate with a `data: [DONE]` message when the job is finished (succeeded, cancelled, or failed).  If set to false, only events generated so far will be returned.  (Optional)

api_instance <- OpenAIApi$new()
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$ListFineTuneEvents(var_fine_tune_id, stream = var_streamdata_file = "result.txt")
result <- api_instance$ListFineTuneEvents(var_fine_tune_id, stream = var_stream)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fine_tune_id** | **character**| The ID of the fine-tune job to get events for.  | 
 **stream** | **character**| Whether to stream events for the fine-tune job. If set to true, events will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available. The stream will terminate with a &#x60;data: [DONE]&#x60; message when the job is finished (succeeded, cancelled, or failed).  If set to false, only events generated so far will be returned.  | [optional] [default to FALSE]

### Return type

[**ListFineTuneEventsResponse**](ListFineTuneEventsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

# **ListFineTunes**
> ListFineTunesResponse ListFineTunes()

List your organization's fine-tuning jobs 

### Example
```R
library(openapi)

# List your organization's fine-tuning jobs 
#

api_instance <- OpenAIApi$new()
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$ListFineTunes(data_file = "result.txt")
result <- api_instance$ListFineTunes()
dput(result)
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

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

# **ListModels**
> ListModelsResponse ListModels()

Lists the currently available models, and provides basic information about each one such as the owner and availability.

### Example
```R
library(openapi)

# Lists the currently available models, and provides basic information about each one such as the owner and availability.
#

api_instance <- OpenAIApi$new()
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$ListModels(data_file = "result.txt")
result <- api_instance$ListModels()
dput(result)
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

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

# **RetrieveFile**
> OpenAIFile RetrieveFile(file_id)

Returns information about a specific file.

### Example
```R
library(openapi)

# Returns information about a specific file.
#
# prepare function argument(s)
var_file_id <- "file_id_example" # character | The ID of the file to use for this request

api_instance <- OpenAIApi$new()
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$RetrieveFile(var_file_iddata_file = "result.txt")
result <- api_instance$RetrieveFile(var_file_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file_id** | **character**| The ID of the file to use for this request | 

### Return type

[**OpenAIFile**](OpenAIFile.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

# **RetrieveFineTune**
> FineTune RetrieveFineTune(fine_tune_id)

Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 

### Example
```R
library(openapi)

# Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
#
# prepare function argument(s)
var_fine_tune_id <- "ft-AF1WoRqd3aJAHsqc9NY7iL8F" # character | The ID of the fine-tune job 

api_instance <- OpenAIApi$new()
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$RetrieveFineTune(var_fine_tune_iddata_file = "result.txt")
result <- api_instance$RetrieveFineTune(var_fine_tune_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fine_tune_id** | **character**| The ID of the fine-tune job  | 

### Return type

[**FineTune**](FineTune.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

# **RetrieveModel**
> Model RetrieveModel(model)

Retrieves a model instance, providing basic information about the model such as the owner and permissioning.

### Example
```R
library(openapi)

# Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
#
# prepare function argument(s)
var_model <- "text-davinci-001" # character | The ID of the model to use for this request

api_instance <- OpenAIApi$new()
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$RetrieveModel(var_modeldata_file = "result.txt")
result <- api_instance$RetrieveModel(var_model)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | **character**| The ID of the model to use for this request | 

### Return type

[**Model**](Model.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

