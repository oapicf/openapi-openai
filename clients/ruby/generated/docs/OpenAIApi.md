# OpenApiOpenAIClient::OpenAIApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**cancel_fine_tune**](OpenAIApi.md#cancel_fine_tune) | **POST** /fine-tunes/{fine_tune_id}/cancel | Immediately cancel a fine-tune job.  |
| [**create_chat_completion**](OpenAIApi.md#create_chat_completion) | **POST** /chat/completions | Creates a model response for the given chat conversation. |
| [**create_completion**](OpenAIApi.md#create_completion) | **POST** /completions | Creates a completion for the provided prompt and parameters. |
| [**create_edit**](OpenAIApi.md#create_edit) | **POST** /edits | Creates a new edit for the provided input, instruction, and parameters. |
| [**create_embedding**](OpenAIApi.md#create_embedding) | **POST** /embeddings | Creates an embedding vector representing the input text. |
| [**create_file**](OpenAIApi.md#create_file) | **POST** /files | Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit.  |
| [**create_fine_tune**](OpenAIApi.md#create_fine_tune) | **POST** /fine-tunes | Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning)  |
| [**create_image**](OpenAIApi.md#create_image) | **POST** /images/generations | Creates an image given a prompt. |
| [**create_image_edit**](OpenAIApi.md#create_image_edit) | **POST** /images/edits | Creates an edited or extended image given an original image and a prompt. |
| [**create_image_variation**](OpenAIApi.md#create_image_variation) | **POST** /images/variations | Creates a variation of a given image. |
| [**create_moderation**](OpenAIApi.md#create_moderation) | **POST** /moderations | Classifies if text violates OpenAI&#39;s Content Policy |
| [**create_transcription**](OpenAIApi.md#create_transcription) | **POST** /audio/transcriptions | Transcribes audio into the input language. |
| [**create_translation**](OpenAIApi.md#create_translation) | **POST** /audio/translations | Translates audio into English. |
| [**delete_file**](OpenAIApi.md#delete_file) | **DELETE** /files/{file_id} | Delete a file. |
| [**delete_model**](OpenAIApi.md#delete_model) | **DELETE** /models/{model} | Delete a fine-tuned model. You must have the Owner role in your organization. |
| [**download_file**](OpenAIApi.md#download_file) | **GET** /files/{file_id}/content | Returns the contents of the specified file |
| [**list_files**](OpenAIApi.md#list_files) | **GET** /files | Returns a list of files that belong to the user&#39;s organization. |
| [**list_fine_tune_events**](OpenAIApi.md#list_fine_tune_events) | **GET** /fine-tunes/{fine_tune_id}/events | Get fine-grained status updates for a fine-tune job.  |
| [**list_fine_tunes**](OpenAIApi.md#list_fine_tunes) | **GET** /fine-tunes | List your organization&#39;s fine-tuning jobs  |
| [**list_models**](OpenAIApi.md#list_models) | **GET** /models | Lists the currently available models, and provides basic information about each one such as the owner and availability. |
| [**retrieve_file**](OpenAIApi.md#retrieve_file) | **GET** /files/{file_id} | Returns information about a specific file. |
| [**retrieve_fine_tune**](OpenAIApi.md#retrieve_fine_tune) | **GET** /fine-tunes/{fine_tune_id} | Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning)  |
| [**retrieve_model**](OpenAIApi.md#retrieve_model) | **GET** /models/{model} | Retrieves a model instance, providing basic information about the model such as the owner and permissioning. |


## cancel_fine_tune

> <FineTune> cancel_fine_tune(fine_tune_id)

Immediately cancel a fine-tune job. 

### Examples

```ruby
require 'time'
require 'openapi_openai'

api_instance = OpenApiOpenAIClient::OpenAIApi.new
fine_tune_id = 'ft-AF1WoRqd3aJAHsqc9NY7iL8F' # String | The ID of the fine-tune job to cancel 

begin
  # Immediately cancel a fine-tune job. 
  result = api_instance.cancel_fine_tune(fine_tune_id)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling OpenAIApi->cancel_fine_tune: #{e}"
end
```

#### Using the cancel_fine_tune_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<FineTune>, Integer, Hash)> cancel_fine_tune_with_http_info(fine_tune_id)

```ruby
begin
  # Immediately cancel a fine-tune job. 
  data, status_code, headers = api_instance.cancel_fine_tune_with_http_info(fine_tune_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <FineTune>
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling OpenAIApi->cancel_fine_tune_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **fine_tune_id** | **String** | The ID of the fine-tune job to cancel  |  |

### Return type

[**FineTune**](FineTune.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## create_chat_completion

> <CreateChatCompletionResponse> create_chat_completion(create_chat_completion_request)

Creates a model response for the given chat conversation.

### Examples

```ruby
require 'time'
require 'openapi_openai'

api_instance = OpenApiOpenAIClient::OpenAIApi.new
create_chat_completion_request = OpenApiOpenAIClient::CreateChatCompletionRequest.new({model: nil, messages: [OpenApiOpenAIClient::ChatCompletionRequestMessage.new({role: 'system'})]}) # CreateChatCompletionRequest | 

begin
  # Creates a model response for the given chat conversation.
  result = api_instance.create_chat_completion(create_chat_completion_request)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling OpenAIApi->create_chat_completion: #{e}"
end
```

#### Using the create_chat_completion_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CreateChatCompletionResponse>, Integer, Hash)> create_chat_completion_with_http_info(create_chat_completion_request)

```ruby
begin
  # Creates a model response for the given chat conversation.
  data, status_code, headers = api_instance.create_chat_completion_with_http_info(create_chat_completion_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CreateChatCompletionResponse>
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling OpenAIApi->create_chat_completion_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **create_chat_completion_request** | [**CreateChatCompletionRequest**](CreateChatCompletionRequest.md) |  |  |

### Return type

[**CreateChatCompletionResponse**](CreateChatCompletionResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## create_completion

> <CreateCompletionResponse> create_completion(create_completion_request)

Creates a completion for the provided prompt and parameters.

### Examples

```ruby
require 'time'
require 'openapi_openai'

api_instance = OpenApiOpenAIClient::OpenAIApi.new
create_completion_request = OpenApiOpenAIClient::CreateCompletionRequest.new({model: nil, prompt: nil}) # CreateCompletionRequest | 

begin
  # Creates a completion for the provided prompt and parameters.
  result = api_instance.create_completion(create_completion_request)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling OpenAIApi->create_completion: #{e}"
end
```

#### Using the create_completion_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CreateCompletionResponse>, Integer, Hash)> create_completion_with_http_info(create_completion_request)

```ruby
begin
  # Creates a completion for the provided prompt and parameters.
  data, status_code, headers = api_instance.create_completion_with_http_info(create_completion_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CreateCompletionResponse>
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling OpenAIApi->create_completion_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **create_completion_request** | [**CreateCompletionRequest**](CreateCompletionRequest.md) |  |  |

### Return type

[**CreateCompletionResponse**](CreateCompletionResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## create_edit

> <CreateEditResponse> create_edit(create_edit_request)

Creates a new edit for the provided input, instruction, and parameters.

### Examples

```ruby
require 'time'
require 'openapi_openai'

api_instance = OpenApiOpenAIClient::OpenAIApi.new
create_edit_request = OpenApiOpenAIClient::CreateEditRequest.new({model: nil, instruction: 'Fix the spelling mistakes.'}) # CreateEditRequest | 

begin
  # Creates a new edit for the provided input, instruction, and parameters.
  result = api_instance.create_edit(create_edit_request)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling OpenAIApi->create_edit: #{e}"
end
```

#### Using the create_edit_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CreateEditResponse>, Integer, Hash)> create_edit_with_http_info(create_edit_request)

```ruby
begin
  # Creates a new edit for the provided input, instruction, and parameters.
  data, status_code, headers = api_instance.create_edit_with_http_info(create_edit_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CreateEditResponse>
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling OpenAIApi->create_edit_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **create_edit_request** | [**CreateEditRequest**](CreateEditRequest.md) |  |  |

### Return type

[**CreateEditResponse**](CreateEditResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## create_embedding

> <CreateEmbeddingResponse> create_embedding(create_embedding_request)

Creates an embedding vector representing the input text.

### Examples

```ruby
require 'time'
require 'openapi_openai'

api_instance = OpenApiOpenAIClient::OpenAIApi.new
create_embedding_request = OpenApiOpenAIClient::CreateEmbeddingRequest.new({model: nil, input: nil}) # CreateEmbeddingRequest | 

begin
  # Creates an embedding vector representing the input text.
  result = api_instance.create_embedding(create_embedding_request)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling OpenAIApi->create_embedding: #{e}"
end
```

#### Using the create_embedding_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CreateEmbeddingResponse>, Integer, Hash)> create_embedding_with_http_info(create_embedding_request)

```ruby
begin
  # Creates an embedding vector representing the input text.
  data, status_code, headers = api_instance.create_embedding_with_http_info(create_embedding_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CreateEmbeddingResponse>
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling OpenAIApi->create_embedding_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **create_embedding_request** | [**CreateEmbeddingRequest**](CreateEmbeddingRequest.md) |  |  |

### Return type

[**CreateEmbeddingResponse**](CreateEmbeddingResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## create_file

> <OpenAIFile> create_file(file, purpose)

Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 

### Examples

```ruby
require 'time'
require 'openapi_openai'

api_instance = OpenApiOpenAIClient::OpenAIApi.new
file = File.new('/path/to/some/file') # File | Name of the [JSON Lines](https://jsonlines.readthedocs.io/en/latest/) file to be uploaded.  If the `purpose` is set to \\\"fine-tune\\\", each line is a JSON record with \\\"prompt\\\" and \\\"completion\\\" fields representing your [training examples](/docs/guides/fine-tuning/prepare-training-data). 
purpose = 'purpose_example' # String | The intended purpose of the uploaded documents.  Use \\\"fine-tune\\\" for [Fine-tuning](/docs/api-reference/fine-tunes). This allows us to validate the format of the uploaded file. 

begin
  # Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 
  result = api_instance.create_file(file, purpose)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling OpenAIApi->create_file: #{e}"
end
```

#### Using the create_file_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<OpenAIFile>, Integer, Hash)> create_file_with_http_info(file, purpose)

```ruby
begin
  # Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 
  data, status_code, headers = api_instance.create_file_with_http_info(file, purpose)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <OpenAIFile>
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling OpenAIApi->create_file_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **file** | **File** | Name of the [JSON Lines](https://jsonlines.readthedocs.io/en/latest/) file to be uploaded.  If the &#x60;purpose&#x60; is set to \\\&quot;fine-tune\\\&quot;, each line is a JSON record with \\\&quot;prompt\\\&quot; and \\\&quot;completion\\\&quot; fields representing your [training examples](/docs/guides/fine-tuning/prepare-training-data).  |  |
| **purpose** | **String** | The intended purpose of the uploaded documents.  Use \\\&quot;fine-tune\\\&quot; for [Fine-tuning](/docs/api-reference/fine-tunes). This allows us to validate the format of the uploaded file.  |  |

### Return type

[**OpenAIFile**](OpenAIFile.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json


## create_fine_tune

> <FineTune> create_fine_tune(create_fine_tune_request)

Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 

### Examples

```ruby
require 'time'
require 'openapi_openai'

api_instance = OpenApiOpenAIClient::OpenAIApi.new
create_fine_tune_request = OpenApiOpenAIClient::CreateFineTuneRequest.new({training_file: 'file-ajSREls59WBbvgSzJSVWxMCB'}) # CreateFineTuneRequest | 

begin
  # Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
  result = api_instance.create_fine_tune(create_fine_tune_request)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling OpenAIApi->create_fine_tune: #{e}"
end
```

#### Using the create_fine_tune_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<FineTune>, Integer, Hash)> create_fine_tune_with_http_info(create_fine_tune_request)

```ruby
begin
  # Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
  data, status_code, headers = api_instance.create_fine_tune_with_http_info(create_fine_tune_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <FineTune>
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling OpenAIApi->create_fine_tune_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **create_fine_tune_request** | [**CreateFineTuneRequest**](CreateFineTuneRequest.md) |  |  |

### Return type

[**FineTune**](FineTune.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## create_image

> <ImagesResponse> create_image(create_image_request)

Creates an image given a prompt.

### Examples

```ruby
require 'time'
require 'openapi_openai'

api_instance = OpenApiOpenAIClient::OpenAIApi.new
create_image_request = OpenApiOpenAIClient::CreateImageRequest.new({prompt: 'A cute baby sea otter'}) # CreateImageRequest | 

begin
  # Creates an image given a prompt.
  result = api_instance.create_image(create_image_request)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling OpenAIApi->create_image: #{e}"
end
```

#### Using the create_image_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ImagesResponse>, Integer, Hash)> create_image_with_http_info(create_image_request)

```ruby
begin
  # Creates an image given a prompt.
  data, status_code, headers = api_instance.create_image_with_http_info(create_image_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ImagesResponse>
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling OpenAIApi->create_image_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **create_image_request** | [**CreateImageRequest**](CreateImageRequest.md) |  |  |

### Return type

[**ImagesResponse**](ImagesResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## create_image_edit

> <ImagesResponse> create_image_edit(image, prompt, opts)

Creates an edited or extended image given an original image and a prompt.

### Examples

```ruby
require 'time'
require 'openapi_openai'

api_instance = OpenApiOpenAIClient::OpenAIApi.new
image = File.new('/path/to/some/file') # File | The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask.
prompt = 'prompt_example' # String | A text description of the desired image(s). The maximum length is 1000 characters.
opts = {
  mask: File.new('/path/to/some/file'), # File | An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where `image` should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as `image`.
  n: 56, # Integer | The number of images to generate. Must be between 1 and 10.
  size: '256x256', # String | The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.
  response_format: 'url', # String | The format in which the generated images are returned. Must be one of `url` or `b64_json`.
  user: 'user_example' # String | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
}

begin
  # Creates an edited or extended image given an original image and a prompt.
  result = api_instance.create_image_edit(image, prompt, opts)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling OpenAIApi->create_image_edit: #{e}"
end
```

#### Using the create_image_edit_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ImagesResponse>, Integer, Hash)> create_image_edit_with_http_info(image, prompt, opts)

```ruby
begin
  # Creates an edited or extended image given an original image and a prompt.
  data, status_code, headers = api_instance.create_image_edit_with_http_info(image, prompt, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ImagesResponse>
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling OpenAIApi->create_image_edit_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **image** | **File** | The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask. |  |
| **prompt** | **String** | A text description of the desired image(s). The maximum length is 1000 characters. |  |
| **mask** | **File** | An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where &#x60;image&#x60; should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as &#x60;image&#x60;. | [optional] |
| **n** | **Integer** | The number of images to generate. Must be between 1 and 10. | [optional][default to 1] |
| **size** | **String** | The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. | [optional][default to &#39;1024x1024&#39;] |
| **response_format** | **String** | The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. | [optional][default to &#39;url&#39;] |
| **user** | **String** | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  | [optional] |

### Return type

[**ImagesResponse**](ImagesResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json


## create_image_variation

> <ImagesResponse> create_image_variation(image, opts)

Creates a variation of a given image.

### Examples

```ruby
require 'time'
require 'openapi_openai'

api_instance = OpenApiOpenAIClient::OpenAIApi.new
image = File.new('/path/to/some/file') # File | The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square.
opts = {
  n: 56, # Integer | The number of images to generate. Must be between 1 and 10.
  size: '256x256', # String | The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.
  response_format: 'url', # String | The format in which the generated images are returned. Must be one of `url` or `b64_json`.
  user: 'user_example' # String | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
}

begin
  # Creates a variation of a given image.
  result = api_instance.create_image_variation(image, opts)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling OpenAIApi->create_image_variation: #{e}"
end
```

#### Using the create_image_variation_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ImagesResponse>, Integer, Hash)> create_image_variation_with_http_info(image, opts)

```ruby
begin
  # Creates a variation of a given image.
  data, status_code, headers = api_instance.create_image_variation_with_http_info(image, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ImagesResponse>
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling OpenAIApi->create_image_variation_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **image** | **File** | The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square. |  |
| **n** | **Integer** | The number of images to generate. Must be between 1 and 10. | [optional][default to 1] |
| **size** | **String** | The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. | [optional][default to &#39;1024x1024&#39;] |
| **response_format** | **String** | The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. | [optional][default to &#39;url&#39;] |
| **user** | **String** | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  | [optional] |

### Return type

[**ImagesResponse**](ImagesResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json


## create_moderation

> <CreateModerationResponse> create_moderation(create_moderation_request)

Classifies if text violates OpenAI's Content Policy

### Examples

```ruby
require 'time'
require 'openapi_openai'

api_instance = OpenApiOpenAIClient::OpenAIApi.new
create_moderation_request = OpenApiOpenAIClient::CreateModerationRequest.new({input: nil}) # CreateModerationRequest | 

begin
  # Classifies if text violates OpenAI's Content Policy
  result = api_instance.create_moderation(create_moderation_request)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling OpenAIApi->create_moderation: #{e}"
end
```

#### Using the create_moderation_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CreateModerationResponse>, Integer, Hash)> create_moderation_with_http_info(create_moderation_request)

```ruby
begin
  # Classifies if text violates OpenAI's Content Policy
  data, status_code, headers = api_instance.create_moderation_with_http_info(create_moderation_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CreateModerationResponse>
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling OpenAIApi->create_moderation_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **create_moderation_request** | [**CreateModerationRequest**](CreateModerationRequest.md) |  |  |

### Return type

[**CreateModerationResponse**](CreateModerationResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## create_transcription

> <CreateTranscriptionResponse> create_transcription(file, model, opts)

Transcribes audio into the input language.

### Examples

```ruby
require 'time'
require 'openapi_openai'

api_instance = OpenApiOpenAIClient::OpenAIApi.new
file = File.new('/path/to/some/file') # File | The audio file object (not file name) to transcribe, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm. 
model = nil # CreateTranscriptionRequestModel | 
opts = {
  prompt: 'prompt_example', # String | An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language. 
  response_format: 'response_format_example', # String | The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt. 
  temperature: 8.14, # Float | The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. 
  language: 'language_example' # String | The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency. 
}

begin
  # Transcribes audio into the input language.
  result = api_instance.create_transcription(file, model, opts)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling OpenAIApi->create_transcription: #{e}"
end
```

#### Using the create_transcription_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CreateTranscriptionResponse>, Integer, Hash)> create_transcription_with_http_info(file, model, opts)

```ruby
begin
  # Transcribes audio into the input language.
  data, status_code, headers = api_instance.create_transcription_with_http_info(file, model, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CreateTranscriptionResponse>
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling OpenAIApi->create_transcription_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **file** | **File** | The audio file object (not file name) to transcribe, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm.  |  |
| **model** | [**CreateTranscriptionRequestModel**](CreateTranscriptionRequestModel.md) |  |  |
| **prompt** | **String** | An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language.  | [optional] |
| **response_format** | **String** | The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt.  | [optional][default to &#39;json&#39;] |
| **temperature** | **Float** | The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  | [optional][default to 0] |
| **language** | **String** | The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency.  | [optional] |

### Return type

[**CreateTranscriptionResponse**](CreateTranscriptionResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json


## create_translation

> <CreateTranslationResponse> create_translation(file, model, opts)

Translates audio into English.

### Examples

```ruby
require 'time'
require 'openapi_openai'

api_instance = OpenApiOpenAIClient::OpenAIApi.new
file = File.new('/path/to/some/file') # File | The audio file object (not file name) translate, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm. 
model = nil # CreateTranscriptionRequestModel | 
opts = {
  prompt: 'prompt_example', # String | An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English. 
  response_format: 'response_format_example', # String | The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt. 
  temperature: 8.14 # Float | The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. 
}

begin
  # Translates audio into English.
  result = api_instance.create_translation(file, model, opts)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling OpenAIApi->create_translation: #{e}"
end
```

#### Using the create_translation_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CreateTranslationResponse>, Integer, Hash)> create_translation_with_http_info(file, model, opts)

```ruby
begin
  # Translates audio into English.
  data, status_code, headers = api_instance.create_translation_with_http_info(file, model, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CreateTranslationResponse>
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling OpenAIApi->create_translation_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **file** | **File** | The audio file object (not file name) translate, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm.  |  |
| **model** | [**CreateTranscriptionRequestModel**](CreateTranscriptionRequestModel.md) |  |  |
| **prompt** | **String** | An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English.  | [optional] |
| **response_format** | **String** | The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt.  | [optional][default to &#39;json&#39;] |
| **temperature** | **Float** | The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  | [optional][default to 0] |

### Return type

[**CreateTranslationResponse**](CreateTranslationResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json


## delete_file

> <DeleteFileResponse> delete_file(file_id)

Delete a file.

### Examples

```ruby
require 'time'
require 'openapi_openai'

api_instance = OpenApiOpenAIClient::OpenAIApi.new
file_id = 'file_id_example' # String | The ID of the file to use for this request

begin
  # Delete a file.
  result = api_instance.delete_file(file_id)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling OpenAIApi->delete_file: #{e}"
end
```

#### Using the delete_file_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DeleteFileResponse>, Integer, Hash)> delete_file_with_http_info(file_id)

```ruby
begin
  # Delete a file.
  data, status_code, headers = api_instance.delete_file_with_http_info(file_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DeleteFileResponse>
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling OpenAIApi->delete_file_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **file_id** | **String** | The ID of the file to use for this request |  |

### Return type

[**DeleteFileResponse**](DeleteFileResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## delete_model

> <DeleteModelResponse> delete_model(model)

Delete a fine-tuned model. You must have the Owner role in your organization.

### Examples

```ruby
require 'time'
require 'openapi_openai'

api_instance = OpenApiOpenAIClient::OpenAIApi.new
model = 'curie:ft-acmeco-2021-03-03-21-44-20' # String | The model to delete

begin
  # Delete a fine-tuned model. You must have the Owner role in your organization.
  result = api_instance.delete_model(model)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling OpenAIApi->delete_model: #{e}"
end
```

#### Using the delete_model_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DeleteModelResponse>, Integer, Hash)> delete_model_with_http_info(model)

```ruby
begin
  # Delete a fine-tuned model. You must have the Owner role in your organization.
  data, status_code, headers = api_instance.delete_model_with_http_info(model)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DeleteModelResponse>
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling OpenAIApi->delete_model_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **model** | **String** | The model to delete |  |

### Return type

[**DeleteModelResponse**](DeleteModelResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## download_file

> String download_file(file_id)

Returns the contents of the specified file

### Examples

```ruby
require 'time'
require 'openapi_openai'

api_instance = OpenApiOpenAIClient::OpenAIApi.new
file_id = 'file_id_example' # String | The ID of the file to use for this request

begin
  # Returns the contents of the specified file
  result = api_instance.download_file(file_id)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling OpenAIApi->download_file: #{e}"
end
```

#### Using the download_file_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(String, Integer, Hash)> download_file_with_http_info(file_id)

```ruby
begin
  # Returns the contents of the specified file
  data, status_code, headers = api_instance.download_file_with_http_info(file_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => String
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling OpenAIApi->download_file_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **file_id** | **String** | The ID of the file to use for this request |  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## list_files

> <ListFilesResponse> list_files

Returns a list of files that belong to the user's organization.

### Examples

```ruby
require 'time'
require 'openapi_openai'

api_instance = OpenApiOpenAIClient::OpenAIApi.new

begin
  # Returns a list of files that belong to the user's organization.
  result = api_instance.list_files
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling OpenAIApi->list_files: #{e}"
end
```

#### Using the list_files_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ListFilesResponse>, Integer, Hash)> list_files_with_http_info

```ruby
begin
  # Returns a list of files that belong to the user's organization.
  data, status_code, headers = api_instance.list_files_with_http_info
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ListFilesResponse>
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling OpenAIApi->list_files_with_http_info: #{e}"
end
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


## list_fine_tune_events

> <ListFineTuneEventsResponse> list_fine_tune_events(fine_tune_id, opts)

Get fine-grained status updates for a fine-tune job. 

### Examples

```ruby
require 'time'
require 'openapi_openai'

api_instance = OpenApiOpenAIClient::OpenAIApi.new
fine_tune_id = 'ft-AF1WoRqd3aJAHsqc9NY7iL8F' # String | The ID of the fine-tune job to get events for. 
opts = {
  stream: true # Boolean | Whether to stream events for the fine-tune job. If set to true, events will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available. The stream will terminate with a `data: [DONE]` message when the job is finished (succeeded, cancelled, or failed).  If set to false, only events generated so far will be returned. 
}

begin
  # Get fine-grained status updates for a fine-tune job. 
  result = api_instance.list_fine_tune_events(fine_tune_id, opts)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling OpenAIApi->list_fine_tune_events: #{e}"
end
```

#### Using the list_fine_tune_events_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ListFineTuneEventsResponse>, Integer, Hash)> list_fine_tune_events_with_http_info(fine_tune_id, opts)

```ruby
begin
  # Get fine-grained status updates for a fine-tune job. 
  data, status_code, headers = api_instance.list_fine_tune_events_with_http_info(fine_tune_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ListFineTuneEventsResponse>
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling OpenAIApi->list_fine_tune_events_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **fine_tune_id** | **String** | The ID of the fine-tune job to get events for.  |  |
| **stream** | **Boolean** | Whether to stream events for the fine-tune job. If set to true, events will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available. The stream will terminate with a &#x60;data: [DONE]&#x60; message when the job is finished (succeeded, cancelled, or failed).  If set to false, only events generated so far will be returned.  | [optional][default to false] |

### Return type

[**ListFineTuneEventsResponse**](ListFineTuneEventsResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## list_fine_tunes

> <ListFineTunesResponse> list_fine_tunes

List your organization's fine-tuning jobs 

### Examples

```ruby
require 'time'
require 'openapi_openai'

api_instance = OpenApiOpenAIClient::OpenAIApi.new

begin
  # List your organization's fine-tuning jobs 
  result = api_instance.list_fine_tunes
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling OpenAIApi->list_fine_tunes: #{e}"
end
```

#### Using the list_fine_tunes_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ListFineTunesResponse>, Integer, Hash)> list_fine_tunes_with_http_info

```ruby
begin
  # List your organization's fine-tuning jobs 
  data, status_code, headers = api_instance.list_fine_tunes_with_http_info
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ListFineTunesResponse>
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling OpenAIApi->list_fine_tunes_with_http_info: #{e}"
end
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


## list_models

> <ListModelsResponse> list_models

Lists the currently available models, and provides basic information about each one such as the owner and availability.

### Examples

```ruby
require 'time'
require 'openapi_openai'

api_instance = OpenApiOpenAIClient::OpenAIApi.new

begin
  # Lists the currently available models, and provides basic information about each one such as the owner and availability.
  result = api_instance.list_models
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling OpenAIApi->list_models: #{e}"
end
```

#### Using the list_models_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ListModelsResponse>, Integer, Hash)> list_models_with_http_info

```ruby
begin
  # Lists the currently available models, and provides basic information about each one such as the owner and availability.
  data, status_code, headers = api_instance.list_models_with_http_info
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ListModelsResponse>
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling OpenAIApi->list_models_with_http_info: #{e}"
end
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


## retrieve_file

> <OpenAIFile> retrieve_file(file_id)

Returns information about a specific file.

### Examples

```ruby
require 'time'
require 'openapi_openai'

api_instance = OpenApiOpenAIClient::OpenAIApi.new
file_id = 'file_id_example' # String | The ID of the file to use for this request

begin
  # Returns information about a specific file.
  result = api_instance.retrieve_file(file_id)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling OpenAIApi->retrieve_file: #{e}"
end
```

#### Using the retrieve_file_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<OpenAIFile>, Integer, Hash)> retrieve_file_with_http_info(file_id)

```ruby
begin
  # Returns information about a specific file.
  data, status_code, headers = api_instance.retrieve_file_with_http_info(file_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <OpenAIFile>
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling OpenAIApi->retrieve_file_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **file_id** | **String** | The ID of the file to use for this request |  |

### Return type

[**OpenAIFile**](OpenAIFile.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## retrieve_fine_tune

> <FineTune> retrieve_fine_tune(fine_tune_id)

Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 

### Examples

```ruby
require 'time'
require 'openapi_openai'

api_instance = OpenApiOpenAIClient::OpenAIApi.new
fine_tune_id = 'ft-AF1WoRqd3aJAHsqc9NY7iL8F' # String | The ID of the fine-tune job 

begin
  # Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
  result = api_instance.retrieve_fine_tune(fine_tune_id)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling OpenAIApi->retrieve_fine_tune: #{e}"
end
```

#### Using the retrieve_fine_tune_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<FineTune>, Integer, Hash)> retrieve_fine_tune_with_http_info(fine_tune_id)

```ruby
begin
  # Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
  data, status_code, headers = api_instance.retrieve_fine_tune_with_http_info(fine_tune_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <FineTune>
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling OpenAIApi->retrieve_fine_tune_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **fine_tune_id** | **String** | The ID of the fine-tune job  |  |

### Return type

[**FineTune**](FineTune.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## retrieve_model

> <Model> retrieve_model(model)

Retrieves a model instance, providing basic information about the model such as the owner and permissioning.

### Examples

```ruby
require 'time'
require 'openapi_openai'

api_instance = OpenApiOpenAIClient::OpenAIApi.new
model = 'text-davinci-001' # String | The ID of the model to use for this request

begin
  # Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
  result = api_instance.retrieve_model(model)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling OpenAIApi->retrieve_model: #{e}"
end
```

#### Using the retrieve_model_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Model>, Integer, Hash)> retrieve_model_with_http_info(model)

```ruby
begin
  # Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
  data, status_code, headers = api_instance.retrieve_model_with_http_info(model)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Model>
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling OpenAIApi->retrieve_model_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **model** | **String** | The ID of the model to use for this request |  |

### Return type

[**Model**](Model.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

