# ImagesAPI

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ImagesAPI_createImage**](ImagesAPI.md#ImagesAPI_createImage) | **POST** /images/generations | Creates an image given a prompt.
[**ImagesAPI_createImageEdit**](ImagesAPI.md#ImagesAPI_createImageEdit) | **POST** /images/edits | Creates an edited or extended image given an original image and a prompt.
[**ImagesAPI_createImageVariation**](ImagesAPI.md#ImagesAPI_createImageVariation) | **POST** /images/variations | Creates a variation of a given image.


# **ImagesAPI_createImage**
```c
// Creates an image given a prompt.
//
images_response_t* ImagesAPI_createImage(apiClient_t *apiClient, create_image_request_t *create_image_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**create_image_request** | **[create_image_request_t](create_image_request.md) \*** |  | 

### Return type

[images_response_t](images_response.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ImagesAPI_createImageEdit**
```c
// Creates an edited or extended image given an original image and a prompt.
//
images_response_t* ImagesAPI_createImageEdit(apiClient_t *apiClient, binary_t* image, char *prompt, binary_t* mask, create_image_edit_request_model_t *model, int *n, openai_api_createImageEdit_size_e size, openai_api_createImageEdit_response_format_e response_format, char *user);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**image** | **binary_t*** | The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask. | 
**prompt** | **char \*** | A text description of the desired image(s). The maximum length is 1000 characters. | 
**mask** | **binary_t*** | An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where &#x60;image&#x60; should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as &#x60;image&#x60;. | [optional] 
**model** | **[create_image_edit_request_model_t](create_image_edit_request_model.md) \*** |  | [optional] 
**n** | **int \*** | The number of images to generate. Must be between 1 and 10. | [optional] [default to 1]
**size** | **openai_api_createImageEdit_size_e** | The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. | [optional] [default to &#39;1024x1024&#39;]
**response_format** | **openai_api_createImageEdit_response_format_e** | The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. URLs are only valid for 60 minutes after the image has been generated. | [optional] [default to &#39;url&#39;]
**user** | **char \*** | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  | [optional] 

### Return type

[images_response_t](images_response.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ImagesAPI_createImageVariation**
```c
// Creates a variation of a given image.
//
images_response_t* ImagesAPI_createImageVariation(apiClient_t *apiClient, binary_t* image, create_image_edit_request_model_t *model, int *n, openai_api_createImageVariation_response_format_e response_format, openai_api_createImageVariation_size_e size, char *user);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**image** | **binary_t*** | The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square. | 
**model** | **[create_image_edit_request_model_t](create_image_edit_request_model.md) \*** |  | [optional] 
**n** | **int \*** | The number of images to generate. Must be between 1 and 10. For &#x60;dall-e-3&#x60;, only &#x60;n&#x3D;1&#x60; is supported. | [optional] [default to 1]
**response_format** | **openai_api_createImageVariation_response_format_e** | The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. URLs are only valid for 60 minutes after the image has been generated. | [optional] [default to &#39;url&#39;]
**size** | **openai_api_createImageVariation_size_e** | The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. | [optional] [default to &#39;1024x1024&#39;]
**user** | **char \*** | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  | [optional] 

### Return type

[images_response_t](images_response.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

