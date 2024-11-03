# OpenApiOpenAIClient::ImagesApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**create_image**](ImagesApi.md#create_image) | **POST** /images/generations | Creates an image given a prompt. |
| [**create_image_edit**](ImagesApi.md#create_image_edit) | **POST** /images/edits | Creates an edited or extended image given an original image and a prompt. |
| [**create_image_variation**](ImagesApi.md#create_image_variation) | **POST** /images/variations | Creates a variation of a given image. |


## create_image

> <ImagesResponse> create_image(create_image_request)

Creates an image given a prompt.

### Examples

```ruby
require 'time'
require 'openapi_openai'
# setup authorization
OpenApiOpenAIClient.configure do |config|
  # Configure Bearer authorization: ApiKeyAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = OpenApiOpenAIClient::ImagesApi.new
create_image_request = OpenApiOpenAIClient::CreateImageRequest.new({prompt: 'A cute baby sea otter'}) # CreateImageRequest | 

begin
  # Creates an image given a prompt.
  result = api_instance.create_image(create_image_request)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling ImagesApi->create_image: #{e}"
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
  puts "Error when calling ImagesApi->create_image_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **create_image_request** | [**CreateImageRequest**](CreateImageRequest.md) |  |  |

### Return type

[**ImagesResponse**](ImagesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

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
# setup authorization
OpenApiOpenAIClient.configure do |config|
  # Configure Bearer authorization: ApiKeyAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = OpenApiOpenAIClient::ImagesApi.new
image = File.new('/path/to/some/file') # File | The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask.
prompt = 'prompt_example' # String | A text description of the desired image(s). The maximum length is 1000 characters.
opts = {
  mask: File.new('/path/to/some/file'), # File | An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where `image` should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as `image`.
  model: OpenApiOpenAIClient::CreateImageEditRequestModel.new, # CreateImageEditRequestModel | 
  n: 56, # Integer | The number of images to generate. Must be between 1 and 10.
  size: '256x256', # String | The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.
  response_format: 'url', # String | The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated.
  user: 'user_example' # String | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
}

begin
  # Creates an edited or extended image given an original image and a prompt.
  result = api_instance.create_image_edit(image, prompt, opts)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling ImagesApi->create_image_edit: #{e}"
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
  puts "Error when calling ImagesApi->create_image_edit_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **image** | **File** | The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask. |  |
| **prompt** | **String** | A text description of the desired image(s). The maximum length is 1000 characters. |  |
| **mask** | **File** | An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where &#x60;image&#x60; should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as &#x60;image&#x60;. | [optional] |
| **model** | [**CreateImageEditRequestModel**](CreateImageEditRequestModel.md) |  | [optional] |
| **n** | **Integer** | The number of images to generate. Must be between 1 and 10. | [optional][default to 1] |
| **size** | **String** | The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. | [optional][default to &#39;1024x1024&#39;] |
| **response_format** | **String** | The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. URLs are only valid for 60 minutes after the image has been generated. | [optional][default to &#39;url&#39;] |
| **user** | **String** | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  | [optional] |

### Return type

[**ImagesResponse**](ImagesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

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
# setup authorization
OpenApiOpenAIClient.configure do |config|
  # Configure Bearer authorization: ApiKeyAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = OpenApiOpenAIClient::ImagesApi.new
image = File.new('/path/to/some/file') # File | The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square.
opts = {
  model: OpenApiOpenAIClient::CreateImageEditRequestModel.new, # CreateImageEditRequestModel | 
  n: 56, # Integer | The number of images to generate. Must be between 1 and 10. For `dall-e-3`, only `n=1` is supported.
  response_format: 'url', # String | The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated.
  size: '256x256', # String | The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.
  user: 'user_example' # String | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
}

begin
  # Creates a variation of a given image.
  result = api_instance.create_image_variation(image, opts)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling ImagesApi->create_image_variation: #{e}"
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
  puts "Error when calling ImagesApi->create_image_variation_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **image** | **File** | The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square. |  |
| **model** | [**CreateImageEditRequestModel**](CreateImageEditRequestModel.md) |  | [optional] |
| **n** | **Integer** | The number of images to generate. Must be between 1 and 10. For &#x60;dall-e-3&#x60;, only &#x60;n&#x3D;1&#x60; is supported. | [optional][default to 1] |
| **response_format** | **String** | The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. URLs are only valid for 60 minutes after the image has been generated. | [optional][default to &#39;url&#39;] |
| **size** | **String** | The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. | [optional][default to &#39;1024x1024&#39;] |
| **user** | **String** | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  | [optional] |

### Return type

[**ImagesResponse**](ImagesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

