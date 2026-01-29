# OpenAPI\Client\ImagesApi

Given a prompt and/or an input image, the model will generate a new image.

All URIs are relative to https://api.openai.com/v1, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createImage()**](ImagesApi.md#createImage) | **POST** /images/generations | Creates an image given a prompt. |
| [**createImageEdit()**](ImagesApi.md#createImageEdit) | **POST** /images/edits | Creates an edited or extended image given an original image and a prompt. |
| [**createImageVariation()**](ImagesApi.md#createImageVariation) | **POST** /images/variations | Creates a variation of a given image. |


## `createImage()`

```php
createImage($create_image_request): \OpenAPI\Client\Model\ImagesResponse
```

Creates an image given a prompt.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ImagesApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$create_image_request = new \OpenAPI\Client\Model\CreateImageRequest(); // \OpenAPI\Client\Model\CreateImageRequest

try {
    $result = $apiInstance->createImage($create_image_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ImagesApi->createImage: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **create_image_request** | [**\OpenAPI\Client\Model\CreateImageRequest**](../Model/CreateImageRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ImagesResponse**](../Model/ImagesResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `createImageEdit()`

```php
createImageEdit($image, $prompt, $mask, $model, $n, $size, $response_format, $user): \OpenAPI\Client\Model\ImagesResponse
```

Creates an edited or extended image given an original image and a prompt.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ImagesApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$image = '/path/to/file.txt'; // \SplFileObject | The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask.
$prompt = 'prompt_example'; // string | A text description of the desired image(s). The maximum length is 1000 characters.
$mask = '/path/to/file.txt'; // \SplFileObject | An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where `image` should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as `image`.
$model = new \OpenAPI\Client\Model\CreateImageEditRequestModel(); // \OpenAPI\Client\Model\CreateImageEditRequestModel
$n = 1; // int | The number of images to generate. Must be between 1 and 10.
$size = '1024x1024'; // string | The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.
$response_format = 'url'; // string | The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated.
$user = 'user_example'; // string | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).

try {
    $result = $apiInstance->createImageEdit($image, $prompt, $mask, $model, $n, $size, $response_format, $user);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ImagesApi->createImageEdit: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **image** | **\SplFileObject****\SplFileObject**| The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask. | |
| **prompt** | **string**| A text description of the desired image(s). The maximum length is 1000 characters. | |
| **mask** | **\SplFileObject****\SplFileObject**| An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where &#x60;image&#x60; should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as &#x60;image&#x60;. | [optional] |
| **model** | [**\OpenAPI\Client\Model\CreateImageEditRequestModel**](../Model/CreateImageEditRequestModel.md)|  | [optional] |
| **n** | **int**| The number of images to generate. Must be between 1 and 10. | [optional] [default to 1] |
| **size** | **string**| The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. | [optional] [default to &#39;1024x1024&#39;] |
| **response_format** | **string**| The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. URLs are only valid for 60 minutes after the image has been generated. | [optional] [default to &#39;url&#39;] |
| **user** | **string**| A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). | [optional] |

### Return type

[**\OpenAPI\Client\Model\ImagesResponse**](../Model/ImagesResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: `multipart/form-data`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `createImageVariation()`

```php
createImageVariation($image, $model, $n, $response_format, $size, $user): \OpenAPI\Client\Model\ImagesResponse
```

Creates a variation of a given image.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ImagesApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$image = '/path/to/file.txt'; // \SplFileObject | The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square.
$model = new \OpenAPI\Client\Model\CreateImageEditRequestModel(); // \OpenAPI\Client\Model\CreateImageEditRequestModel
$n = 1; // int | The number of images to generate. Must be between 1 and 10. For `dall-e-3`, only `n=1` is supported.
$response_format = 'url'; // string | The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated.
$size = '1024x1024'; // string | The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.
$user = 'user_example'; // string | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).

try {
    $result = $apiInstance->createImageVariation($image, $model, $n, $response_format, $size, $user);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ImagesApi->createImageVariation: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **image** | **\SplFileObject****\SplFileObject**| The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square. | |
| **model** | [**\OpenAPI\Client\Model\CreateImageEditRequestModel**](../Model/CreateImageEditRequestModel.md)|  | [optional] |
| **n** | **int**| The number of images to generate. Must be between 1 and 10. For &#x60;dall-e-3&#x60;, only &#x60;n&#x3D;1&#x60; is supported. | [optional] [default to 1] |
| **response_format** | **string**| The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. URLs are only valid for 60 minutes after the image has been generated. | [optional] [default to &#39;url&#39;] |
| **size** | **string**| The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. | [optional] [default to &#39;1024x1024&#39;] |
| **user** | **string**| A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). | [optional] |

### Return type

[**\OpenAPI\Client\Model\ImagesResponse**](../Model/ImagesResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: `multipart/form-data`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
