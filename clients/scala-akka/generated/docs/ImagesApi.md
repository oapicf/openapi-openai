# ImagesApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createImage**](ImagesApi.md#createImage) | **POST** /images/generations | Creates an image given a prompt.
[**createImageWithHttpInfo**](ImagesApi.md#createImageWithHttpInfo) | **POST** /images/generations | Creates an image given a prompt.
[**createImageEdit**](ImagesApi.md#createImageEdit) | **POST** /images/edits | Creates an edited or extended image given an original image and a prompt.
[**createImageEditWithHttpInfo**](ImagesApi.md#createImageEditWithHttpInfo) | **POST** /images/edits | Creates an edited or extended image given an original image and a prompt.
[**createImageVariation**](ImagesApi.md#createImageVariation) | **POST** /images/variations | Creates a variation of a given image.
[**createImageVariationWithHttpInfo**](ImagesApi.md#createImageVariationWithHttpInfo) | **POST** /images/variations | Creates a variation of a given image.



## createImage

> createImage(createImageRequest): ApiRequest[ImagesResponse]

Creates an image given a prompt.

### Example

```scala
// Import classes:
import 
import 
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import akka.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher
    
    // Configure HTTP bearer authorization: ApiKeyAuth
    implicit val ApiKeyAuth: BearerToken = BearerToken("BEARER TOKEN")

    val apiInvoker = ApiInvoker()
    val apiInstance = ImagesApi("https://api.openai.com/v1")
    val createImageRequest: CreateImageRequest =  // CreateImageRequest | 
    
    val request = apiInstance.createImage(createImageRequest)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling ImagesApi#createImage")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling ImagesApi#createImage")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createImageRequest** | [**CreateImageRequest**](CreateImageRequest.md)|  |

### Return type

ApiRequest[[**ImagesResponse**](ImagesResponse.md)]


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## createImageEdit

> createImageEdit(createImageEditRequest): ApiRequest[ImagesResponse]

Creates an edited or extended image given an original image and a prompt.

### Example

```scala
// Import classes:
import 
import 
import 
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import akka.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher
    
    // Configure HTTP bearer authorization: ApiKeyAuth
    implicit val ApiKeyAuth: BearerToken = BearerToken("BEARER TOKEN")

    val apiInvoker = ApiInvoker()
    val apiInstance = ImagesApi("https://api.openai.com/v1")
    val image: File = BINARY_DATA_HERE // File | The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask.

    val prompt: String = prompt_example // String | A text description of the desired image(s). The maximum length is 1000 characters.

    val mask: File = BINARY_DATA_HERE // File | An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where `image` should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as `image`.

    val model: CreateImageEditRequestModel =  // CreateImageEditRequestModel | 

    val `n`: Int = 56 // Int | The number of images to generate. Must be between 1 and 10.

    val size: String = size_example // String | The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.

    val responseFormat: String = responseFormat_example // String | The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated.

    val user: String = user_example // String | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids). 
    
    val request = apiInstance.createImageEdit(image, prompt, mask, model, `n`, size, responseFormat, user)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling ImagesApi#createImageEdit")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling ImagesApi#createImageEdit")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **image** | **File**| The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask. |
 **prompt** | **String**| A text description of the desired image(s). The maximum length is 1000 characters. |
 **mask** | **File**| An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where &#x60;image&#x60; should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as &#x60;image&#x60;. | [optional]
 **model** | [**CreateImageEditRequestModel**](CreateImageEditRequestModel.md)|  | [optional]
 **`n`** | **Int**| The number of images to generate. Must be between 1 and 10. | [optional]
 **size** | **String**| The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. | [optional] [enum: 256x256, 512x512, 1024x1024]
 **responseFormat** | **String**| The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. URLs are only valid for 60 minutes after the image has been generated. | [optional] [enum: url, b64_json]
 **user** | **String**| A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids).  | [optional]

### Return type

ApiRequest[[**ImagesResponse**](ImagesResponse.md)]


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## createImageVariation

> createImageVariation(createImageVariationRequest): ApiRequest[ImagesResponse]

Creates a variation of a given image.

### Example

```scala
// Import classes:
import 
import 
import 
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import akka.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher
    
    // Configure HTTP bearer authorization: ApiKeyAuth
    implicit val ApiKeyAuth: BearerToken = BearerToken("BEARER TOKEN")

    val apiInvoker = ApiInvoker()
    val apiInstance = ImagesApi("https://api.openai.com/v1")
    val image: File = BINARY_DATA_HERE // File | The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square.

    val model: CreateImageEditRequestModel =  // CreateImageEditRequestModel | 

    val `n`: Int = 56 // Int | The number of images to generate. Must be between 1 and 10. For `dall-e-3`, only `n=1` is supported.

    val responseFormat: String = responseFormat_example // String | The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated.

    val size: String = size_example // String | The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.

    val user: String = user_example // String | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids). 
    
    val request = apiInstance.createImageVariation(image, model, `n`, responseFormat, size, user)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling ImagesApi#createImageVariation")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling ImagesApi#createImageVariation")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **image** | **File**| The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square. |
 **model** | [**CreateImageEditRequestModel**](CreateImageEditRequestModel.md)|  | [optional]
 **`n`** | **Int**| The number of images to generate. Must be between 1 and 10. For &#x60;dall-e-3&#x60;, only &#x60;n&#x3D;1&#x60; is supported. | [optional]
 **responseFormat** | **String**| The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. URLs are only valid for 60 minutes after the image has been generated. | [optional] [enum: url, b64_json]
 **size** | **String**| The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. | [optional] [enum: 256x256, 512x512, 1024x1024]
 **user** | **String**| A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids).  | [optional]

### Return type

ApiRequest[[**ImagesResponse**](ImagesResponse.md)]


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

