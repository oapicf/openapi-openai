# .ImagesApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createImage**](ImagesApi.md#createImage) | **POST** /images/generations | Creates an image given a prompt.
[**createImageEdit**](ImagesApi.md#createImageEdit) | **POST** /images/edits | Creates an edited or extended image given an original image and a prompt.
[**createImageVariation**](ImagesApi.md#createImageVariation) | **POST** /images/variations | Creates a variation of a given image.


# **createImage**
> ImagesResponse createImage(createImageRequest)


### Example


```typescript
import { createConfiguration, ImagesApi } from '';
import type { ImagesApiCreateImageRequest } from '';

const configuration = createConfiguration();
const apiInstance = new ImagesApi(configuration);

const request: ImagesApiCreateImageRequest = {
  
  createImageRequest: {
    prompt: "A cute baby sea otter",
    model: null,
    n: 1,
    quality: "standard",
    responseFormat: "url",
    size: "1024x1024",
    style: "vivid",
    user: "user-1234",
  },
};

const data = await apiInstance.createImage(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createImageRequest** | **CreateImageRequest**|  |


### Return type

**ImagesResponse**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **createImageEdit**
> ImagesResponse createImageEdit()


### Example


```typescript
import { createConfiguration, ImagesApi } from '';
import type { ImagesApiCreateImageEditRequest } from '';

const configuration = createConfiguration();
const apiInstance = new ImagesApi(configuration);

const request: ImagesApiCreateImageEditRequest = {
    // The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask.
  image: { data: Buffer.from(fs.readFileSync('/path/to/file', 'utf-8')), name: '/path/to/file' },
    // A text description of the desired image(s). The maximum length is 1000 characters.
  prompt: "A cute baby sea otter wearing a beret",
    // An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where `image` should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as `image`. (optional)
  mask: { data: Buffer.from(fs.readFileSync('/path/to/file', 'utf-8')), name: '/path/to/file' },
  
  model: null,
    // The number of images to generate. Must be between 1 and 10. (optional)
  n: 1,
    // The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`. (optional)
  size: "1024x1024",
    // The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated. (optional)
  responseFormat: "url",
    // A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids).  (optional)
  user: "user-1234",
};

const data = await apiInstance.createImageEdit(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **image** | [**HttpFile**] | The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask. | defaults to undefined
 **prompt** | [**string**] | A text description of the desired image(s). The maximum length is 1000 characters. | defaults to undefined
 **mask** | [**HttpFile**] | An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where &#x60;image&#x60; should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as &#x60;image&#x60;. | (optional) defaults to undefined
 **model** | **CreateImageEditRequestModel** |  | (optional) defaults to undefined
 **n** | [**number**] | The number of images to generate. Must be between 1 and 10. | (optional) defaults to 1
 **size** | [**string**]**Array<&#39;256x256&#39; &#124; &#39;512x512&#39; &#124; &#39;1024x1024&#39;>** | The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. | (optional) defaults to '1024x1024'
 **responseFormat** | [**string**]**Array<&#39;url&#39; &#124; &#39;b64_json&#39;>** | The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. URLs are only valid for 60 minutes after the image has been generated. | (optional) defaults to 'url'
 **user** | [**string**] | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids).  | (optional) defaults to undefined


### Return type

**ImagesResponse**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **createImageVariation**
> ImagesResponse createImageVariation()


### Example


```typescript
import { createConfiguration, ImagesApi } from '';
import type { ImagesApiCreateImageVariationRequest } from '';

const configuration = createConfiguration();
const apiInstance = new ImagesApi(configuration);

const request: ImagesApiCreateImageVariationRequest = {
    // The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square.
  image: { data: Buffer.from(fs.readFileSync('/path/to/file', 'utf-8')), name: '/path/to/file' },
  
  model: null,
    // The number of images to generate. Must be between 1 and 10. For `dall-e-3`, only `n=1` is supported. (optional)
  n: 1,
    // The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated. (optional)
  responseFormat: "url",
    // The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`. (optional)
  size: "1024x1024",
    // A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids).  (optional)
  user: "user-1234",
};

const data = await apiInstance.createImageVariation(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **image** | [**HttpFile**] | The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square. | defaults to undefined
 **model** | **CreateImageEditRequestModel** |  | (optional) defaults to undefined
 **n** | [**number**] | The number of images to generate. Must be between 1 and 10. For &#x60;dall-e-3&#x60;, only &#x60;n&#x3D;1&#x60; is supported. | (optional) defaults to 1
 **responseFormat** | [**string**]**Array<&#39;url&#39; &#124; &#39;b64_json&#39;>** | The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. URLs are only valid for 60 minutes after the image has been generated. | (optional) defaults to 'url'
 **size** | [**string**]**Array<&#39;256x256&#39; &#124; &#39;512x512&#39; &#124; &#39;1024x1024&#39;>** | The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. | (optional) defaults to '1024x1024'
 **user** | [**string**] | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids).  | (optional) defaults to undefined


### Return type

**ImagesResponse**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


