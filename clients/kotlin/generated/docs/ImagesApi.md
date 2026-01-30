# ImagesApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createImage**](ImagesApi.md#createImage) | **POST** /images/generations | Creates an image given a prompt. |
| [**createImageEdit**](ImagesApi.md#createImageEdit) | **POST** /images/edits | Creates an edited or extended image given an original image and a prompt. |
| [**createImageVariation**](ImagesApi.md#createImageVariation) | **POST** /images/variations | Creates a variation of a given image. |


<a id="createImage"></a>
# **createImage**
> ImagesResponse createImage(createImageRequest)

Creates an image given a prompt.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ImagesApi()
val createImageRequest : CreateImageRequest =  // CreateImageRequest | 
try {
    val result : ImagesResponse = apiInstance.createImage(createImageRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ImagesApi#createImage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ImagesApi#createImage")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createImageRequest** | [**CreateImageRequest**](CreateImageRequest.md)|  | |

### Return type

[**ImagesResponse**](ImagesResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createImageEdit"></a>
# **createImageEdit**
> ImagesResponse createImageEdit(image, prompt, mask, model, n, size, responseFormat, user)

Creates an edited or extended image given an original image and a prompt.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ImagesApi()
val image : java.io.File = BINARY_DATA_HERE // java.io.File | The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask.
val prompt : kotlin.String = prompt_example // kotlin.String | A text description of the desired image(s). The maximum length is 1000 characters.
val mask : java.io.File = BINARY_DATA_HERE // java.io.File | An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where `image` should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as `image`.
val model : CreateImageEditRequestModel =  // CreateImageEditRequestModel | 
val n : kotlin.Int = 56 // kotlin.Int | The number of images to generate. Must be between 1 and 10.
val size : kotlin.String = size_example // kotlin.String | The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.
val responseFormat : kotlin.String = responseFormat_example // kotlin.String | The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated.
val user : kotlin.String = user_example // kotlin.String | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids). 
try {
    val result : ImagesResponse = apiInstance.createImageEdit(image, prompt, mask, model, n, size, responseFormat, user)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ImagesApi#createImageEdit")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ImagesApi#createImageEdit")
    e.printStackTrace()
}
```

### Parameters
| **image** | **java.io.File**| The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask. | |
| **prompt** | **kotlin.String**| A text description of the desired image(s). The maximum length is 1000 characters. | |
| **mask** | **java.io.File**| An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where &#x60;image&#x60; should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as &#x60;image&#x60;. | [optional] |
| **model** | [**CreateImageEditRequestModel**](CreateImageEditRequestModel.md)|  | [optional] |
| **n** | **kotlin.Int**| The number of images to generate. Must be between 1 and 10. | [optional] [default to 1] |
| **size** | **kotlin.String**| The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. | [optional] [default to PropertySize._1024x1024] [enum: 256x256, 512x512, 1024x1024] |
| **responseFormat** | **kotlin.String**| The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. URLs are only valid for 60 minutes after the image has been generated. | [optional] [default to ResponseFormat.url] [enum: url, b64_json] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **user** | **kotlin.String**| A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids).  | [optional] |

### Return type

[**ImagesResponse**](ImagesResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a id="createImageVariation"></a>
# **createImageVariation**
> ImagesResponse createImageVariation(image, model, n, responseFormat, size, user)

Creates a variation of a given image.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ImagesApi()
val image : java.io.File = BINARY_DATA_HERE // java.io.File | The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square.
val model : CreateImageEditRequestModel =  // CreateImageEditRequestModel | 
val n : kotlin.Int = 56 // kotlin.Int | The number of images to generate. Must be between 1 and 10. For `dall-e-3`, only `n=1` is supported.
val responseFormat : kotlin.String = responseFormat_example // kotlin.String | The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated.
val size : kotlin.String = size_example // kotlin.String | The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.
val user : kotlin.String = user_example // kotlin.String | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids). 
try {
    val result : ImagesResponse = apiInstance.createImageVariation(image, model, n, responseFormat, size, user)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ImagesApi#createImageVariation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ImagesApi#createImageVariation")
    e.printStackTrace()
}
```

### Parameters
| **image** | **java.io.File**| The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square. | |
| **model** | [**CreateImageEditRequestModel**](CreateImageEditRequestModel.md)|  | [optional] |
| **n** | **kotlin.Int**| The number of images to generate. Must be between 1 and 10. For &#x60;dall-e-3&#x60;, only &#x60;n&#x3D;1&#x60; is supported. | [optional] [default to 1] |
| **responseFormat** | **kotlin.String**| The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. URLs are only valid for 60 minutes after the image has been generated. | [optional] [default to ResponseFormat.url] [enum: url, b64_json] |
| **size** | **kotlin.String**| The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. | [optional] [default to PropertySize._1024x1024] [enum: 256x256, 512x512, 1024x1024] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **user** | **kotlin.String**| A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids).  | [optional] |

### Return type

[**ImagesResponse**](ImagesResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

