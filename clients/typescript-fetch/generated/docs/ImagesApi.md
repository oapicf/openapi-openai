# ImagesApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createImage**](ImagesApi.md#createimageoperation) | **POST** /images/generations | Creates an image given a prompt. |
| [**createImageEdit**](ImagesApi.md#createimageedit) | **POST** /images/edits | Creates an edited or extended image given an original image and a prompt. |
| [**createImageVariation**](ImagesApi.md#createimagevariation) | **POST** /images/variations | Creates a variation of a given image. |



## createImage

> ImagesResponse createImage(createImageRequest)

Creates an image given a prompt.

### Example

```ts
import {
  Configuration,
  ImagesApi,
} from '';
import type { CreateImageOperationRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new ImagesApi(config);

  const body = {
    // CreateImageRequest
    createImageRequest: ...,
  } satisfies CreateImageOperationRequest;

  try {
    const data = await api.createImage(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createImageRequest** | [CreateImageRequest](CreateImageRequest.md) |  | |

### Return type

[**ImagesResponse**](ImagesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## createImageEdit

> ImagesResponse createImageEdit(image, prompt, mask, model, n, size, responseFormat, user)

Creates an edited or extended image given an original image and a prompt.

### Example

```ts
import {
  Configuration,
  ImagesApi,
} from '';
import type { CreateImageEditRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new ImagesApi(config);

  const body = {
    // Blob | The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask.
    image: BINARY_DATA_HERE,
    // string | A text description of the desired image(s). The maximum length is 1000 characters.
    prompt: prompt_example,
    // Blob | An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where `image` should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as `image`. (optional)
    mask: BINARY_DATA_HERE,
    // CreateImageEditRequestModel (optional)
    model: ...,
    // number | The number of images to generate. Must be between 1 and 10. (optional)
    n: 56,
    // string | The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`. (optional)
    size: size_example,
    // string | The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated. (optional)
    responseFormat: responseFormat_example,
    // string | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  (optional)
    user: user_example,
  } satisfies CreateImageEditRequest;

  try {
    const data = await api.createImageEdit(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **image** | `Blob` | The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask. | [Defaults to `undefined`] |
| **prompt** | `string` | A text description of the desired image(s). The maximum length is 1000 characters. | [Defaults to `undefined`] |
| **mask** | `Blob` | An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where &#x60;image&#x60; should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as &#x60;image&#x60;. | [Optional] [Defaults to `undefined`] |
| **model** | [CreateImageEditRequestModel](CreateImageEditRequestModel.md) |  | [Optional] [Defaults to `undefined`] |
| **n** | `number` | The number of images to generate. Must be between 1 and 10. | [Optional] [Defaults to `1`] |
| **size** | `256x256`, `512x512`, `1024x1024` | The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. | [Optional] [Defaults to `&#39;1024x1024&#39;`] [Enum: 256x256, 512x512, 1024x1024] |
| **responseFormat** | `url`, `b64_json` | The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. URLs are only valid for 60 minutes after the image has been generated. | [Optional] [Defaults to `&#39;url&#39;`] [Enum: url, b64_json] |
| **user** | `string` | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  | [Optional] [Defaults to `undefined`] |

### Return type

[**ImagesResponse**](ImagesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: `multipart/form-data`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## createImageVariation

> ImagesResponse createImageVariation(image, model, n, responseFormat, size, user)

Creates a variation of a given image.

### Example

```ts
import {
  Configuration,
  ImagesApi,
} from '';
import type { CreateImageVariationRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new ImagesApi(config);

  const body = {
    // Blob | The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square.
    image: BINARY_DATA_HERE,
    // CreateImageEditRequestModel (optional)
    model: ...,
    // number | The number of images to generate. Must be between 1 and 10. For `dall-e-3`, only `n=1` is supported. (optional)
    n: 56,
    // string | The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated. (optional)
    responseFormat: responseFormat_example,
    // string | The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`. (optional)
    size: size_example,
    // string | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  (optional)
    user: user_example,
  } satisfies CreateImageVariationRequest;

  try {
    const data = await api.createImageVariation(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **image** | `Blob` | The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square. | [Defaults to `undefined`] |
| **model** | [CreateImageEditRequestModel](CreateImageEditRequestModel.md) |  | [Optional] [Defaults to `undefined`] |
| **n** | `number` | The number of images to generate. Must be between 1 and 10. For &#x60;dall-e-3&#x60;, only &#x60;n&#x3D;1&#x60; is supported. | [Optional] [Defaults to `1`] |
| **responseFormat** | `url`, `b64_json` | The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. URLs are only valid for 60 minutes after the image has been generated. | [Optional] [Defaults to `&#39;url&#39;`] [Enum: url, b64_json] |
| **size** | `256x256`, `512x512`, `1024x1024` | The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. | [Optional] [Defaults to `&#39;1024x1024&#39;`] [Enum: 256x256, 512x512, 1024x1024] |
| **user** | `string` | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  | [Optional] [Defaults to `undefined`] |

### Return type

[**ImagesResponse**](ImagesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: `multipart/form-data`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

