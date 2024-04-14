# images_api

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
**createImage**](images_api.md#createImage) | **POST** /images/generations | Creates an image given a prompt.
**createImageEdit**](images_api.md#createImageEdit) | **POST** /images/edits | Creates an edited or extended image given an original image and a prompt.
**createImageVariation**](images_api.md#createImageVariation) | **POST** /images/variations | Creates a variation of a given image.


# **createImage**
> models::ImagesResponse createImage(ctx, create_image_request)
Creates an image given a prompt.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **create_image_request** | [**CreateImageRequest**](CreateImageRequest.md)|  | 

### Return type

[**models::ImagesResponse**](ImagesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createImageEdit**
> models::ImagesResponse createImageEdit(ctx, image, prompt, optional)
Creates an edited or extended image given an original image and a prompt.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
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
 **model** | [**CreateImageEditRequest_model**](CreateImageEditRequest_model.md)|  | 
 **n** | **i32**| The number of images to generate. Must be between 1 and 10. | [default to swagger::Nullable::Present(1)]
 **size** | **String**| The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`. | [default to swagger::Nullable::Present("1024x1024".to_string())]
 **response_format** | **String**| The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated. | [default to swagger::Nullable::Present("url".to_string())]
 **user** | **String**| A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  | 

### Return type

[**models::ImagesResponse**](ImagesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createImageVariation**
> models::ImagesResponse createImageVariation(ctx, image, optional)
Creates a variation of a given image.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **image** | **swagger::ByteArray**| The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **image** | **swagger::ByteArray**| The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square. | 
 **model** | [**CreateImageEditRequest_model**](CreateImageEditRequest_model.md)|  | 
 **n** | **i32**| The number of images to generate. Must be between 1 and 10. For `dall-e-3`, only `n=1` is supported. | [default to swagger::Nullable::Present(1)]
 **response_format** | **String**| The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated. | [default to swagger::Nullable::Present("url".to_string())]
 **size** | **String**| The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`. | [default to swagger::Nullable::Present("1024x1024".to_string())]
 **user** | **String**| A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  | 

### Return type

[**models::ImagesResponse**](ImagesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

