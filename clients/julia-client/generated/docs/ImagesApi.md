# ImagesApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_image**](ImagesApi.md#create_image) | **POST** /images/generations | Creates an image given a prompt.
[**create_image_edit**](ImagesApi.md#create_image_edit) | **POST** /images/edits | Creates an edited or extended image given an original image and a prompt.
[**create_image_variation**](ImagesApi.md#create_image_variation) | **POST** /images/variations | Creates a variation of a given image.


# **create_image**
> `create_image`(_api::`ImagesApi`, `create_image_request`::`CreateImageRequest`; _mediaType=nothing) -> `ImagesResponse`, `OpenAPI.Clients.ApiResponse` <br/>
> `create_image`(_api::`ImagesApi`, response_stream::`Channel`, `create_image_request`::`CreateImageRequest`; _mediaType=nothing) -> `Channel`{ `ImagesResponse` }, `OpenAPI.Clients.ApiResponse`

Creates an image given a prompt.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`ImagesApi`** | API context | 
**`create_image_request`** | [**`CreateImageRequest`**](CreateImageRequest.md) |  |

### Return type

[**`ImagesResponse`**](ImagesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **create_image_edit**
> `create_image_edit`(_api::`ImagesApi`, `image`::`String`, `prompt`::`String`; `mask`=nothing, `model`=nothing, `n`=nothing, `size`=nothing, `response_format`=nothing, `user`=nothing, _mediaType=nothing) -> `ImagesResponse`, `OpenAPI.Clients.ApiResponse` <br/>
> `create_image_edit`(_api::`ImagesApi`, response_stream::`Channel`, `image`::`String`, `prompt`::`String`; `mask`=nothing, `model`=nothing, `n`=nothing, `size`=nothing, `response_format`=nothing, `user`=nothing, _mediaType=nothing) -> `Channel`{ `ImagesResponse` }, `OpenAPI.Clients.ApiResponse`

Creates an edited or extended image given an original image and a prompt.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`ImagesApi`** | API context | 
**`image`** | **`String`** | The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask. |
**`prompt`** | **`String`** | A text description of the desired image(s). The maximum length is 1000 characters. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`mask`** | **`String`** | An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where &#x60;image&#x60; should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as &#x60;image&#x60;. | 
 **`model`** | [**`CreateImageEditRequestModel`**](CreateImageEditRequestModel.md) |  | [default to nothing]
 **`n`** | **`Int64`** | The number of images to generate. Must be between 1 and 10. | [default to 1]
 **`size`** | **`String`** | The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. | [default to &quot;1024x1024&quot;]
 **`response_format`** | **`String`** | The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. URLs are only valid for 60 minutes after the image has been generated. | [default to &quot;url&quot;]
 **`user`** | **`String`** | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids).  | [default to nothing]

### Return type

[**`ImagesResponse`**](ImagesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **create_image_variation**
> `create_image_variation`(_api::`ImagesApi`, `image`::`String`; `model`=nothing, `n`=nothing, `response_format`=nothing, `size`=nothing, `user`=nothing, _mediaType=nothing) -> `ImagesResponse`, `OpenAPI.Clients.ApiResponse` <br/>
> `create_image_variation`(_api::`ImagesApi`, response_stream::`Channel`, `image`::`String`; `model`=nothing, `n`=nothing, `response_format`=nothing, `size`=nothing, `user`=nothing, _mediaType=nothing) -> `Channel`{ `ImagesResponse` }, `OpenAPI.Clients.ApiResponse`

Creates a variation of a given image.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`ImagesApi`** | API context | 
**`image`** | **`String`** | The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`model`** | [**`CreateImageEditRequestModel`**](CreateImageEditRequestModel.md) |  | [default to nothing]
 **`n`** | **`Int64`** | The number of images to generate. Must be between 1 and 10. For &#x60;dall-e-3&#x60;, only &#x60;n&#x3D;1&#x60; is supported. | [default to 1]
 **`response_format`** | **`String`** | The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. URLs are only valid for 60 minutes after the image has been generated. | [default to &quot;url&quot;]
 **`size`** | **`String`** | The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. | [default to &quot;1024x1024&quot;]
 **`user`** | **`String`** | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids).  | [default to nothing]

### Return type

[**`ImagesResponse`**](ImagesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

