# Org.OpenAPITools.Api.ImagesApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**CreateImage**](ImagesApi.md#createimage) | **POST** /images/generations | Creates an image given a prompt. |
| [**CreateImageEdit**](ImagesApi.md#createimageedit) | **POST** /images/edits | Creates an edited or extended image given an original image and a prompt. |
| [**CreateImageVariation**](ImagesApi.md#createimagevariation) | **POST** /images/variations | Creates a variation of a given image. |

<a id="createimage"></a>
# **CreateImage**
> ImagesResponse CreateImage (CreateImageRequest createImageRequest)

Creates an image given a prompt.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **createImageRequest** | [**CreateImageRequest**](CreateImageRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="createimageedit"></a>
# **CreateImageEdit**
> ImagesResponse CreateImageEdit (System.IO.Stream image, string prompt, System.IO.Stream mask = null, CreateImageEditRequestModel model = null, int n = null, string size = null, string responseFormat = null, string user = null)

Creates an edited or extended image given an original image and a prompt.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **image** | **System.IO.Stream****System.IO.Stream** | The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask. |  |
| **prompt** | **string** | A text description of the desired image(s). The maximum length is 1000 characters. |  |
| **mask** | **System.IO.Stream****System.IO.Stream** | An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where &#x60;image&#x60; should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as &#x60;image&#x60;. | [optional]  |
| **model** | [**CreateImageEditRequestModel**](CreateImageEditRequestModel.md) |  | [optional]  |
| **n** | **int** | The number of images to generate. Must be between 1 and 10. | [optional] [default to 1] |
| **size** | **string** | The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. | [optional] [default to 1024x1024] |
| **responseFormat** | **string** | The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. URLs are only valid for 60 minutes after the image has been generated. | [optional] [default to url] |
| **user** | **string** | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  | [optional]  |

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

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="createimagevariation"></a>
# **CreateImageVariation**
> ImagesResponse CreateImageVariation (System.IO.Stream image, CreateImageEditRequestModel model = null, int n = null, string responseFormat = null, string size = null, string user = null)

Creates a variation of a given image.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **image** | **System.IO.Stream****System.IO.Stream** | The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square. |  |
| **model** | [**CreateImageEditRequestModel**](CreateImageEditRequestModel.md) |  | [optional]  |
| **n** | **int** | The number of images to generate. Must be between 1 and 10. For &#x60;dall-e-3&#x60;, only &#x60;n&#x3D;1&#x60; is supported. | [optional] [default to 1] |
| **responseFormat** | **string** | The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. URLs are only valid for 60 minutes after the image has been generated. | [optional] [default to url] |
| **size** | **string** | The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. | [optional] [default to 1024x1024] |
| **user** | **string** | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  | [optional]  |

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

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

