# IMAGES_API

All URIs are relative to *https://api.openai.com/v1*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**create_image**](IMAGES_API.md#create_image) | **Post** /images/generations | Creates an image given a prompt.
[**create_image_edit**](IMAGES_API.md#create_image_edit) | **Post** /images/edits | Creates an edited or extended image given an original image and a prompt.
[**create_image_variation**](IMAGES_API.md#create_image_variation) | **Post** /images/variations | Creates a variation of a given image.


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

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_image_edit**
> create_image_edit (image: FILE ; prompt: STRING_32 ; mask:  detachable FILE ; model:  detachable CREATE_IMAGE_EDIT_REQUEST_MODEL ; n:  detachable INTEGER_32 ; size:  detachable STRING_32 ; response_format:  detachable STRING_32 ; user:  detachable STRING_32 ): detachable IMAGES_RESPONSE


Creates an edited or extended image given an original image and a prompt.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **image** | **FILE**| The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask. | [default to null]
 **prompt** | **STRING_32**| A text description of the desired image(s). The maximum length is 1000 characters. | [default to null]
 **mask** | **FILE**| An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where &#x60;image&#x60; should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as &#x60;image&#x60;. | [optional] [default to null]
 **model** | [**CREATE_IMAGE_EDIT_REQUEST_MODEL**](CreateImageEditRequest_model.md)|  | [optional] [default to null]
 **n** | **INTEGER_32**| The number of images to generate. Must be between 1 and 10. | [optional] [default to 1]
 **size** | **STRING_32**| The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. | [optional] [default to 1024x1024]
 **response_format** | **STRING_32**| The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. URLs are only valid for 60 minutes after the image has been generated. | [optional] [default to url]
 **user** | **STRING_32**| A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids).  | [optional] [default to null]

### Return type

[**IMAGES_RESPONSE**](ImagesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_image_variation**
> create_image_variation (image: FILE ; model:  detachable CREATE_IMAGE_EDIT_REQUEST_MODEL ; n:  detachable INTEGER_32 ; response_format:  detachable STRING_32 ; size:  detachable STRING_32 ; user:  detachable STRING_32 ): detachable IMAGES_RESPONSE


Creates a variation of a given image.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **image** | **FILE**| The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square. | [default to null]
 **model** | [**CREATE_IMAGE_EDIT_REQUEST_MODEL**](CreateImageEditRequest_model.md)|  | [optional] [default to null]
 **n** | **INTEGER_32**| The number of images to generate. Must be between 1 and 10. For &#x60;dall-e-3&#x60;, only &#x60;n&#x3D;1&#x60; is supported. | [optional] [default to 1]
 **response_format** | **STRING_32**| The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. URLs are only valid for 60 minutes after the image has been generated. | [optional] [default to url]
 **size** | **STRING_32**| The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. | [optional] [default to 1024x1024]
 **user** | **STRING_32**| A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids).  | [optional] [default to null]

### Return type

[**IMAGES_RESPONSE**](ImagesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

