# \ImagesApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_image**](ImagesApi.md#create_image) | **POST** /images/generations | Creates an image given a prompt.
[**create_image_edit**](ImagesApi.md#create_image_edit) | **POST** /images/edits | Creates an edited or extended image given an original image and a prompt.
[**create_image_variation**](ImagesApi.md#create_image_variation) | **POST** /images/variations | Creates a variation of a given image.



## create_image

> models::ImagesResponse create_image(create_image_request)
Creates an image given a prompt.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**create_image_request** | [**CreateImageRequest**](CreateImageRequest.md) |  | [required] |

### Return type

[**models::ImagesResponse**](ImagesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## create_image_edit

> models::ImagesResponse create_image_edit(image, prompt, mask, model, n, size, response_format, user)
Creates an edited or extended image given an original image and a prompt.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**image** | **std::path::PathBuf** | The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask. | [required] |
**prompt** | **String** | A text description of the desired image(s). The maximum length is 1000 characters. | [required] |
**mask** | Option<**std::path::PathBuf**> | An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where `image` should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as `image`. |  |
**model** | Option<[**models::CreateImageEditRequestModel**](CreateImageEditRequest_model.md)> |  |  |
**n** | Option<**i32**> | The number of images to generate. Must be between 1 and 10. |  |[default to 1]
**size** | Option<**String**> | The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`. |  |[default to 1024x1024]
**response_format** | Option<**String**> | The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated. |  |[default to url]
**user** | Option<**String**> | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  |  |

### Return type

[**models::ImagesResponse**](ImagesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## create_image_variation

> models::ImagesResponse create_image_variation(image, model, n, response_format, size, user)
Creates a variation of a given image.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**image** | **std::path::PathBuf** | The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square. | [required] |
**model** | Option<[**models::CreateImageEditRequestModel**](CreateImageEditRequest_model.md)> |  |  |
**n** | Option<**i32**> | The number of images to generate. Must be between 1 and 10. For `dall-e-3`, only `n=1` is supported. |  |[default to 1]
**response_format** | Option<**String**> | The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated. |  |[default to url]
**size** | Option<**String**> | The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`. |  |[default to 1024x1024]
**user** | Option<**String**> | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  |  |

### Return type

[**models::ImagesResponse**](ImagesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

