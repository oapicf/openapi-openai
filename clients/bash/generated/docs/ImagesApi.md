# ImagesApi

All URIs are relative to */v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createImage**](ImagesApi.md#createImage) | **POST** /images/generations | Creates an image given a prompt.
[**createImageEdit**](ImagesApi.md#createImageEdit) | **POST** /images/edits | Creates an edited or extended image given an original image and a prompt.
[**createImageVariation**](ImagesApi.md#createImageVariation) | **POST** /images/variations | Creates a variation of a given image.



## createImage

Creates an image given a prompt.

### Example

```bash
 createImage
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createImageRequest** | [**CreateImageRequest**](CreateImageRequest.md) |  |

### Return type

[**ImagesResponse**](ImagesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## createImageEdit

Creates an edited or extended image given an original image and a prompt.

### Example

```bash
 createImageEdit
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **image** | **binary** | The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask. | [default to null]
 **prompt** | **string** | A text description of the desired image(s). The maximum length is 1000 characters. | [default to null]
 **mask** | **binary** | An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where 'image' should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as 'image'. | [optional] [default to null]
 **model** | [**CreateImageEditRequestModel**](CreateImageEditRequestModel.md) |  | [optional] [default to null]
 **n** | **integer** | The number of images to generate. Must be between 1 and 10. | [optional] [default to 1]
 **size** | **string** | The size of the generated images. Must be one of '256x256', '512x512', or '1024x1024'. | [optional] [default to 1024x1024]
 **responseFormat** | **string** | The format in which the generated images are returned. Must be one of 'url' or 'b64_json'. URLs are only valid for 60 minutes after the image has been generated. | [optional] [default to url]
 **user** | **string** | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). | [optional] [default to null]

### Return type

[**ImagesResponse**](ImagesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## createImageVariation

Creates a variation of a given image.

### Example

```bash
 createImageVariation
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **image** | **binary** | The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square. | [default to null]
 **model** | [**CreateImageEditRequestModel**](CreateImageEditRequestModel.md) |  | [optional] [default to null]
 **n** | **integer** | The number of images to generate. Must be between 1 and 10. For 'dall-e-3', only 'n=1' is supported. | [optional] [default to 1]
 **responseFormat** | **string** | The format in which the generated images are returned. Must be one of 'url' or 'b64_json'. URLs are only valid for 60 minutes after the image has been generated. | [optional] [default to url]
 **size** | **string** | The size of the generated images. Must be one of '256x256', '512x512', or '1024x1024'. | [optional] [default to 1024x1024]
 **user** | **string** | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). | [optional] [default to null]

### Return type

[**ImagesResponse**](ImagesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

