# ImagesAPI

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createImage**](ImagesAPI.md#createimage) | **POST** /images/generations | Creates an image given a prompt.
[**createImageEdit**](ImagesAPI.md#createimageedit) | **POST** /images/edits | Creates an edited or extended image given an original image and a prompt.
[**createImageVariation**](ImagesAPI.md#createimagevariation) | **POST** /images/variations | Creates a variation of a given image.


# **createImage**
```swift
    open class func createImage(createImageRequest: CreateImageRequest, completion: @escaping (_ data: ImagesResponse?, _ error: Error?) -> Void)
```

Creates an image given a prompt.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let createImageRequest = CreateImageRequest(prompt: "prompt_example", model: CreateImageRequest_model(), n: 123, quality: "quality_example", responseFormat: "responseFormat_example", size: "size_example", style: "style_example", user: "user_example") // CreateImageRequest | 

// Creates an image given a prompt.
ImagesAPI.createImage(createImageRequest: createImageRequest) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
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

# **createImageEdit**
```swift
    open class func createImageEdit(image: URL, prompt: String, mask: URL? = nil, model: CreateImageEditRequestModel? = nil, n: Int? = nil, size: Size_createImageEdit? = nil, responseFormat: ResponseFormat_createImageEdit? = nil, user: String? = nil, completion: @escaping (_ data: ImagesResponse?, _ error: Error?) -> Void)
```

Creates an edited or extended image given an original image and a prompt.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let image = URL(string: "https://example.com")! // URL | The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask.
let prompt = "prompt_example" // String | A text description of the desired image(s). The maximum length is 1000 characters.
let mask = URL(string: "https://example.com")! // URL | An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where `image` should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as `image`. (optional)
let model = CreateImageEditRequest_model() // CreateImageEditRequestModel |  (optional)
let n = 987 // Int | The number of images to generate. Must be between 1 and 10. (optional) (default to 1)
let size = "size_example" // String | The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`. (optional) (default to ._1024x1024)
let responseFormat = "responseFormat_example" // String | The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated. (optional) (default to .url)
let user = "user_example" // String | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids).  (optional)

// Creates an edited or extended image given an original image and a prompt.
ImagesAPI.createImageEdit(image: image, prompt: prompt, mask: mask, model: model, n: n, size: size, responseFormat: responseFormat, user: user) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **image** | **URL** | The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask. | 
 **prompt** | **String** | A text description of the desired image(s). The maximum length is 1000 characters. | 
 **mask** | **URL** | An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where &#x60;image&#x60; should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as &#x60;image&#x60;. | [optional] 
 **model** | [**CreateImageEditRequestModel**](CreateImageEditRequestModel.md) |  | [optional] 
 **n** | **Int** | The number of images to generate. Must be between 1 and 10. | [optional] [default to 1]
 **size** | **String** | The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. | [optional] [default to ._1024x1024]
 **responseFormat** | **String** | The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. URLs are only valid for 60 minutes after the image has been generated. | [optional] [default to .url]
 **user** | **String** | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids).  | [optional] 

### Return type

[**ImagesResponse**](ImagesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createImageVariation**
```swift
    open class func createImageVariation(image: URL, model: CreateImageEditRequestModel? = nil, n: Int? = nil, responseFormat: ResponseFormat_createImageVariation? = nil, size: Size_createImageVariation? = nil, user: String? = nil, completion: @escaping (_ data: ImagesResponse?, _ error: Error?) -> Void)
```

Creates a variation of a given image.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let image = URL(string: "https://example.com")! // URL | The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square.
let model = CreateImageEditRequest_model() // CreateImageEditRequestModel |  (optional)
let n = 987 // Int | The number of images to generate. Must be between 1 and 10. For `dall-e-3`, only `n=1` is supported. (optional) (default to 1)
let responseFormat = "responseFormat_example" // String | The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated. (optional) (default to .url)
let size = "size_example" // String | The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`. (optional) (default to ._1024x1024)
let user = "user_example" // String | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids).  (optional)

// Creates a variation of a given image.
ImagesAPI.createImageVariation(image: image, model: model, n: n, responseFormat: responseFormat, size: size, user: user) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **image** | **URL** | The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square. | 
 **model** | [**CreateImageEditRequestModel**](CreateImageEditRequestModel.md) |  | [optional] 
 **n** | **Int** | The number of images to generate. Must be between 1 and 10. For &#x60;dall-e-3&#x60;, only &#x60;n&#x3D;1&#x60; is supported. | [optional] [default to 1]
 **responseFormat** | **String** | The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. URLs are only valid for 60 minutes after the image has been generated. | [optional] [default to .url]
 **size** | **String** | The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. | [optional] [default to ._1024x1024]
 **user** | **String** | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids).  | [optional] 

### Return type

[**ImagesResponse**](ImagesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

