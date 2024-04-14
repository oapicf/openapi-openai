# ImagesController

All URIs are relative to `"/v1"`

The controller class is defined in **[ImagesController.java](../../src/main/java/org/openapitools/controller/ImagesController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**createImage**](#createImage) | **POST** /images/generations | Creates an image given a prompt.
[**createImageEdit**](#createImageEdit) | **POST** /images/edits | Creates an edited or extended image given an original image and a prompt.
[**createImageVariation**](#createImageVariation) | **POST** /images/variations | Creates a variation of a given image.

<a id="createImage"></a>
# **createImage**
```java
Mono<ImagesResponse> ImagesController.createImage(createImageRequest)
```

Creates an image given a prompt.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**createImageRequest** | [**CreateImageRequest**](../../docs/models/CreateImageRequest.md) |  |

### Return type
[**ImagesResponse**](../../docs/models/ImagesResponse.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="createImageEdit"></a>
# **createImageEdit**
```java
Mono<ImagesResponse> ImagesController.createImageEdit(imagepromptmaskmodelnsizeresponseFormatuser)
```

Creates an edited or extended image given an original image and a prompt.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**image** | `CompletedFileUpload` | The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask. |
**prompt** | `String` | A text description of the desired image(s). The maximum length is 1000 characters. |
**mask** | `CompletedFileUpload` | An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where &#x60;image&#x60; should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as &#x60;image&#x60;. | [optional parameter]
**model** | [**CreateImageEditRequestModel**](../../docs/models/CreateImageEditRequestModel.md) |  | [optional parameter] [default to `dall-e-2`]
**n** | `Integer` | The number of images to generate. Must be between 1 and 10. | [optional parameter] [default to `1`]
**size** | `String` | The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. | [optional parameter] [default to `1024x1024`] [enum: `256x256`, `512x512`, `1024x1024`]
**responseFormat** | `String` | The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. URLs are only valid for 60 minutes after the image has been generated. | [optional parameter] [default to `url`] [enum: `url`, `b64_json`]
**user** | `String` | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  | [optional parameter]

### Return type
[**ImagesResponse**](../../docs/models/ImagesResponse.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: `multipart/form-data`
 - **Produces Content-Type**: `application/json`

<a id="createImageVariation"></a>
# **createImageVariation**
```java
Mono<ImagesResponse> ImagesController.createImageVariation(imagemodelnresponseFormatsizeuser)
```

Creates a variation of a given image.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**image** | `CompletedFileUpload` | The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square. |
**model** | [**CreateImageEditRequestModel**](../../docs/models/CreateImageEditRequestModel.md) |  | [optional parameter] [default to `dall-e-2`]
**n** | `Integer` | The number of images to generate. Must be between 1 and 10. For &#x60;dall-e-3&#x60;, only &#x60;n&#x3D;1&#x60; is supported. | [optional parameter] [default to `1`]
**responseFormat** | `String` | The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. URLs are only valid for 60 minutes after the image has been generated. | [optional parameter] [default to `url`] [enum: `url`, `b64_json`]
**size** | `String` | The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. | [optional parameter] [default to `1024x1024`] [enum: `256x256`, `512x512`, `1024x1024`]
**user** | `String` | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  | [optional parameter]

### Return type
[**ImagesResponse**](../../docs/models/ImagesResponse.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: `multipart/form-data`
 - **Produces Content-Type**: `application/json`

