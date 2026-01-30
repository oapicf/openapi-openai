# ImagesApi

All URIs are relative to *https://api.openai.com/v1*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**createImage**](#createimage) | **POST** /images/generations | Creates an image given a prompt.|
|[**createImageEdit**](#createimageedit) | **POST** /images/edits | Creates an edited or extended image given an original image and a prompt.|
|[**createImageVariation**](#createimagevariation) | **POST** /images/variations | Creates a variation of a given image.|

# **createImage**
> ImagesResponse createImage(createImageRequest)


### Example

```typescript
import {
    ImagesApi,
    Configuration,
    CreateImageRequest
} from './api';

const configuration = new Configuration();
const apiInstance = new ImagesApi(configuration);

let createImageRequest: CreateImageRequest; //

const { status, data } = await apiInstance.createImage(
    createImageRequest
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **createImageRequest** | **CreateImageRequest**|  | |


### Return type

**ImagesResponse**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createImageEdit**
> ImagesResponse createImageEdit()


### Example

```typescript
import {
    ImagesApi,
    Configuration,
    CreateImageEditRequestModel
} from './api';

const configuration = new Configuration();
const apiInstance = new ImagesApi(configuration);

let image: File; //The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask. (default to undefined)
let prompt: string; //A text description of the desired image(s). The maximum length is 1000 characters. (default to undefined)
let mask: File; //An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where `image` should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as `image`. (optional) (default to undefined)
let model: CreateImageEditRequestModel; // (optional) (default to undefined)
let n: number; //The number of images to generate. Must be between 1 and 10. (optional) (default to 1)
let size: string; //The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`. (optional) (default to '1024x1024')
let responseFormat: string; //The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated. (optional) (default to 'url')
let user: string; //A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids).  (optional) (default to undefined)

const { status, data } = await apiInstance.createImageEdit(
    image,
    prompt,
    mask,
    model,
    n,
    size,
    responseFormat,
    user
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **image** | [**File**] | The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask. | defaults to undefined|
| **prompt** | [**string**] | A text description of the desired image(s). The maximum length is 1000 characters. | defaults to undefined|
| **mask** | [**File**] | An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where &#x60;image&#x60; should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as &#x60;image&#x60;. | (optional) defaults to undefined|
| **model** | **CreateImageEditRequestModel** |  | (optional) defaults to undefined|
| **n** | [**number**] | The number of images to generate. Must be between 1 and 10. | (optional) defaults to 1|
| **size** | [**string**]**Array<&#39;256x256&#39; &#124; &#39;512x512&#39; &#124; &#39;1024x1024&#39;>** | The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. | (optional) defaults to '1024x1024'|
| **responseFormat** | [**string**]**Array<&#39;url&#39; &#124; &#39;b64_json&#39;>** | The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. URLs are only valid for 60 minutes after the image has been generated. | (optional) defaults to 'url'|
| **user** | [**string**] | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids).  | (optional) defaults to undefined|


### Return type

**ImagesResponse**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createImageVariation**
> ImagesResponse createImageVariation()


### Example

```typescript
import {
    ImagesApi,
    Configuration,
    CreateImageEditRequestModel
} from './api';

const configuration = new Configuration();
const apiInstance = new ImagesApi(configuration);

let image: File; //The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square. (default to undefined)
let model: CreateImageEditRequestModel; // (optional) (default to undefined)
let n: number; //The number of images to generate. Must be between 1 and 10. For `dall-e-3`, only `n=1` is supported. (optional) (default to 1)
let responseFormat: string; //The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated. (optional) (default to 'url')
let size: string; //The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`. (optional) (default to '1024x1024')
let user: string; //A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids).  (optional) (default to undefined)

const { status, data } = await apiInstance.createImageVariation(
    image,
    model,
    n,
    responseFormat,
    size,
    user
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **image** | [**File**] | The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square. | defaults to undefined|
| **model** | **CreateImageEditRequestModel** |  | (optional) defaults to undefined|
| **n** | [**number**] | The number of images to generate. Must be between 1 and 10. For &#x60;dall-e-3&#x60;, only &#x60;n&#x3D;1&#x60; is supported. | (optional) defaults to 1|
| **responseFormat** | [**string**]**Array<&#39;url&#39; &#124; &#39;b64_json&#39;>** | The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. URLs are only valid for 60 minutes after the image has been generated. | (optional) defaults to 'url'|
| **size** | [**string**]**Array<&#39;256x256&#39; &#124; &#39;512x512&#39; &#124; &#39;1024x1024&#39;>** | The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. | (optional) defaults to '1024x1024'|
| **user** | [**string**] | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids).  | (optional) defaults to undefined|


### Return type

**ImagesResponse**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

