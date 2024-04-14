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

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class CreateImageExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.openai.com/v1";
            // Configure Bearer token for authorization: ApiKeyAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            var apiInstance = new ImagesApi(config);
            var createImageRequest = new CreateImageRequest(); // CreateImageRequest | 

            try
            {
                // Creates an image given a prompt.
                ImagesResponse result = apiInstance.CreateImage(createImageRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ImagesApi.CreateImage: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CreateImageWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Creates an image given a prompt.
    ApiResponse<ImagesResponse> response = apiInstance.CreateImageWithHttpInfo(createImageRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ImagesApi.CreateImageWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="createimageedit"></a>
# **CreateImageEdit**
> ImagesResponse CreateImageEdit (System.IO.Stream image, string prompt, System.IO.Stream? mask = null, CreateImageEditRequestModel? model = null, int? n = null, string? size = null, string? responseFormat = null, string? user = null)

Creates an edited or extended image given an original image and a prompt.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class CreateImageEditExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.openai.com/v1";
            // Configure Bearer token for authorization: ApiKeyAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            var apiInstance = new ImagesApi(config);
            var image = new System.IO.MemoryStream(System.IO.File.ReadAllBytes("/path/to/file.txt"));  // System.IO.Stream | The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask.
            var prompt = "prompt_example";  // string | A text description of the desired image(s). The maximum length is 1000 characters.
            var mask = new System.IO.MemoryStream(System.IO.File.ReadAllBytes("/path/to/file.txt"));  // System.IO.Stream? | An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where `image` should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as `image`. (optional) 
            var model = new CreateImageEditRequestModel?(); // CreateImageEditRequestModel? |  (optional) 
            var n = 1;  // int? | The number of images to generate. Must be between 1 and 10. (optional)  (default to 1)
            var size = "256x256";  // string? | The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`. (optional)  (default to 1024x1024)
            var responseFormat = "url";  // string? | The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated. (optional)  (default to url)
            var user = "user_example";  // string? | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  (optional) 

            try
            {
                // Creates an edited or extended image given an original image and a prompt.
                ImagesResponse result = apiInstance.CreateImageEdit(image, prompt, mask, model, n, size, responseFormat, user);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ImagesApi.CreateImageEdit: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CreateImageEditWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Creates an edited or extended image given an original image and a prompt.
    ApiResponse<ImagesResponse> response = apiInstance.CreateImageEditWithHttpInfo(image, prompt, mask, model, n, size, responseFormat, user);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ImagesApi.CreateImageEditWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **image** | **System.IO.Stream****System.IO.Stream** | The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask. |  |
| **prompt** | **string** | A text description of the desired image(s). The maximum length is 1000 characters. |  |
| **mask** | **System.IO.Stream?****System.IO.Stream?** | An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where &#x60;image&#x60; should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as &#x60;image&#x60;. | [optional]  |
| **model** | [**CreateImageEditRequestModel?**](CreateImageEditRequestModel?.md) |  | [optional]  |
| **n** | **int?** | The number of images to generate. Must be between 1 and 10. | [optional] [default to 1] |
| **size** | **string?** | The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. | [optional] [default to 1024x1024] |
| **responseFormat** | **string?** | The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. URLs are only valid for 60 minutes after the image has been generated. | [optional] [default to url] |
| **user** | **string?** | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  | [optional]  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="createimagevariation"></a>
# **CreateImageVariation**
> ImagesResponse CreateImageVariation (System.IO.Stream image, CreateImageEditRequestModel? model = null, int? n = null, string? responseFormat = null, string? size = null, string? user = null)

Creates a variation of a given image.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class CreateImageVariationExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.openai.com/v1";
            // Configure Bearer token for authorization: ApiKeyAuth
            config.AccessToken = "YOUR_BEARER_TOKEN";

            var apiInstance = new ImagesApi(config);
            var image = new System.IO.MemoryStream(System.IO.File.ReadAllBytes("/path/to/file.txt"));  // System.IO.Stream | The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square.
            var model = new CreateImageEditRequestModel?(); // CreateImageEditRequestModel? |  (optional) 
            var n = 1;  // int? | The number of images to generate. Must be between 1 and 10. For `dall-e-3`, only `n=1` is supported. (optional)  (default to 1)
            var responseFormat = "url";  // string? | The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated. (optional)  (default to url)
            var size = "256x256";  // string? | The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`. (optional)  (default to 1024x1024)
            var user = "user_example";  // string? | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  (optional) 

            try
            {
                // Creates a variation of a given image.
                ImagesResponse result = apiInstance.CreateImageVariation(image, model, n, responseFormat, size, user);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ImagesApi.CreateImageVariation: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CreateImageVariationWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Creates a variation of a given image.
    ApiResponse<ImagesResponse> response = apiInstance.CreateImageVariationWithHttpInfo(image, model, n, responseFormat, size, user);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ImagesApi.CreateImageVariationWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **image** | **System.IO.Stream****System.IO.Stream** | The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square. |  |
| **model** | [**CreateImageEditRequestModel?**](CreateImageEditRequestModel?.md) |  | [optional]  |
| **n** | **int?** | The number of images to generate. Must be between 1 and 10. For &#x60;dall-e-3&#x60;, only &#x60;n&#x3D;1&#x60; is supported. | [optional] [default to 1] |
| **responseFormat** | **string?** | The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. URLs are only valid for 60 minutes after the image has been generated. | [optional] [default to url] |
| **size** | **string?** | The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. | [optional] [default to 1024x1024] |
| **user** | **string?** | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  | [optional]  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

