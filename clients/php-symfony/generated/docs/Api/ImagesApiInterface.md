# OpenAPI\Server\Api\ImagesApiInterface

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createImage**](ImagesApiInterface.md#createImage) | **POST** /images/generations | Creates an image given a prompt.
[**createImageEdit**](ImagesApiInterface.md#createImageEdit) | **POST** /images/edits | Creates an edited or extended image given an original image and a prompt.
[**createImageVariation**](ImagesApiInterface.md#createImageVariation) | **POST** /images/variations | Creates a variation of a given image.


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\ImagesApi:
        tags:
            - { name: "open_api_server.api", api: "images" }
    # ...
```

## **createImage**
> OpenAPI\Server\Model\ImagesResponse createImage($createImageRequest)

Creates an image given a prompt.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ImagesApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ImagesApiInterface;

class ImagesApi implements ImagesApiInterface
{

    // ...

    /**
     * Implementation of ImagesApiInterface#createImage
     */
    public function createImage(CreateImageRequest $createImageRequest, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createImageRequest** | [**OpenAPI\Server\Model\CreateImageRequest**](../Model/CreateImageRequest.md)|  |

### Return type

[**OpenAPI\Server\Model\ImagesResponse**](../Model/ImagesResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **createImageEdit**
> OpenAPI\Server\Model\ImagesResponse createImageEdit($image, $prompt, $mask, $model, $n, $size, $responseFormat, $user)

Creates an edited or extended image given an original image and a prompt.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ImagesApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ImagesApiInterface;

class ImagesApi implements ImagesApiInterface
{

    // ...

    /**
     * Implementation of ImagesApiInterface#createImageEdit
     */
    public function createImageEdit(UploadedFile $image, string $prompt, ?UploadedFile $mask, ?CreateImageEditRequestModel $model, int $n, string $size, string $responseFormat, ?string $user, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **image** | **UploadedFile****UploadedFile**| The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask. |
 **prompt** | **string**| A text description of the desired image(s). The maximum length is 1000 characters. |
 **mask** | **UploadedFile****UploadedFile**| An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where &#x60;image&#x60; should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as &#x60;image&#x60;. | [optional]
 **model** | [**OpenAPI\Server\Model\CreateImageEditRequestModel**](../Model/CreateImageEditRequestModel.md)|  | [optional]
 **n** | **int**| The number of images to generate. Must be between 1 and 10. | [optional] [default to 1]
 **size** | **string**| The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. | [optional] [default to &#39;1024x1024&#39;]
 **responseFormat** | **string**| The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. URLs are only valid for 60 minutes after the image has been generated. | [optional] [default to &#39;url&#39;]
 **user** | **string**| A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids). | [optional]

### Return type

[**OpenAPI\Server\Model\ImagesResponse**](../Model/ImagesResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **createImageVariation**
> OpenAPI\Server\Model\ImagesResponse createImageVariation($image, $model, $n, $responseFormat, $size, $user)

Creates a variation of a given image.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ImagesApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ImagesApiInterface;

class ImagesApi implements ImagesApiInterface
{

    // ...

    /**
     * Implementation of ImagesApiInterface#createImageVariation
     */
    public function createImageVariation(UploadedFile $image, ?CreateImageEditRequestModel $model, int $n, string $responseFormat, string $size, ?string $user, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **image** | **UploadedFile****UploadedFile**| The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square. |
 **model** | [**OpenAPI\Server\Model\CreateImageEditRequestModel**](../Model/CreateImageEditRequestModel.md)|  | [optional]
 **n** | **int**| The number of images to generate. Must be between 1 and 10. For &#x60;dall-e-3&#x60;, only &#x60;n&#x3D;1&#x60; is supported. | [optional] [default to 1]
 **responseFormat** | **string**| The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. URLs are only valid for 60 minutes after the image has been generated. | [optional] [default to &#39;url&#39;]
 **size** | **string**| The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. | [optional] [default to &#39;1024x1024&#39;]
 **user** | **string**| A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids). | [optional]

### Return type

[**OpenAPI\Server\Model\ImagesResponse**](../Model/ImagesResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

