# ImagesApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateImage**](ImagesApi.md#CreateImage) | **POST** /images/generations | Creates an image given a prompt.
[**CreateImageEdit**](ImagesApi.md#CreateImageEdit) | **POST** /images/edits | Creates an edited or extended image given an original image and a prompt.
[**CreateImageVariation**](ImagesApi.md#CreateImageVariation) | **POST** /images/variations | Creates a variation of a given image.


# **CreateImage**
> ImagesResponse CreateImage(create_image_request)

Creates an image given a prompt.

### Example
```R
library(openapi)

# Creates an image given a prompt.
#
# prepare function argument(s)
var_create_image_request <- CreateImageRequest$new("prompt_example", CreateImageRequest_model$new(), 123, "standard", "url", "256x256", "vivid", "user_example") # CreateImageRequest | 

api_instance <- ImagesApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
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

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

# **CreateImageEdit**
> ImagesResponse CreateImageEdit(image, prompt, mask = var.mask, model = var.model, n = 1, size = "1024x1024", response_format = "url", user = var.user)

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
var_model <- CreateImageEditRequest_model$new() # CreateImageEditRequestModel |  (Optional)
var_n <- 1 # integer | The number of images to generate. Must be between 1 and 10. (Optional)
var_size <- "1024x1024" # character | The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`. (Optional)
var_response_format <- "url" # character | The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated. (Optional)
var_user <- "user_example" # character | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  (Optional)

api_instance <- ImagesApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CreateImageEdit(var_image, var_prompt, mask = var_mask, model = var_model, n = var_n, size = var_size, response_format = var_response_format, user = var_userdata_file = "result.txt")
result <- api_instance$CreateImageEdit(var_image, var_prompt, mask = var_mask, model = var_model, n = var_n, size = var_size, response_format = var_response_format, user = var_user)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **image** | **data.frame**| The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask. | 
 **prompt** | **character**| A text description of the desired image(s). The maximum length is 1000 characters. | 
 **mask** | **data.frame**| An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where &#x60;image&#x60; should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as &#x60;image&#x60;. | [optional] 
 **model** | [**CreateImageEditRequestModel**](CreateImageEditRequest_model.md)|  | [optional] 
 **n** | **integer**| The number of images to generate. Must be between 1 and 10. | [optional] [default to 1]
 **size** | Enum [256x256, 512x512, 1024x1024] | The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. | [optional] [default to &quot;1024x1024&quot;]
 **response_format** | Enum [url, b64_json] | The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. URLs are only valid for 60 minutes after the image has been generated. | [optional] [default to &quot;url&quot;]
 **user** | **character**| A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  | [optional] 

### Return type

[**ImagesResponse**](ImagesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

# **CreateImageVariation**
> ImagesResponse CreateImageVariation(image, model = var.model, n = 1, response_format = "url", size = "1024x1024", user = var.user)

Creates a variation of a given image.

### Example
```R
library(openapi)

# Creates a variation of a given image.
#
# prepare function argument(s)
var_image <- File.new('/path/to/file') # data.frame | The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square.
var_model <- CreateImageEditRequest_model$new() # CreateImageEditRequestModel |  (Optional)
var_n <- 1 # integer | The number of images to generate. Must be between 1 and 10. For `dall-e-3`, only `n=1` is supported. (Optional)
var_response_format <- "url" # character | The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated. (Optional)
var_size <- "1024x1024" # character | The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`. (Optional)
var_user <- "user_example" # character | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  (Optional)

api_instance <- ImagesApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CreateImageVariation(var_image, model = var_model, n = var_n, response_format = var_response_format, size = var_size, user = var_userdata_file = "result.txt")
result <- api_instance$CreateImageVariation(var_image, model = var_model, n = var_n, response_format = var_response_format, size = var_size, user = var_user)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **image** | **data.frame**| The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square. | 
 **model** | [**CreateImageEditRequestModel**](CreateImageEditRequest_model.md)|  | [optional] 
 **n** | **integer**| The number of images to generate. Must be between 1 and 10. For &#x60;dall-e-3&#x60;, only &#x60;n&#x3D;1&#x60; is supported. | [optional] [default to 1]
 **response_format** | Enum [url, b64_json] | The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. URLs are only valid for 60 minutes after the image has been generated. | [optional] [default to &quot;url&quot;]
 **size** | Enum [256x256, 512x512, 1024x1024] | The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. | [optional] [default to &quot;1024x1024&quot;]
 **user** | **character**| A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  | [optional] 

### Return type

[**ImagesResponse**](ImagesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

