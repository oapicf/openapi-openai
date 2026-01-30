# OpenAPI\Client\ModerationsApi

Given text and/or image inputs, classifies if those inputs are potentially harmful.

All URIs are relative to https://api.openai.com/v1, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createModeration()**](ModerationsApi.md#createModeration) | **POST** /moderations | Classifies if text and/or image inputs are potentially harmful. Learn more in the [moderation guide](/docs/guides/moderation). |


## `createModeration()`

```php
createModeration($create_moderation_request): \OpenAPI\Client\Model\CreateModerationResponse
```

Classifies if text and/or image inputs are potentially harmful. Learn more in the [moderation guide](/docs/guides/moderation).

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ModerationsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$create_moderation_request = new \OpenAPI\Client\Model\CreateModerationRequest(); // \OpenAPI\Client\Model\CreateModerationRequest

try {
    $result = $apiInstance->createModeration($create_moderation_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ModerationsApi->createModeration: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **create_moderation_request** | [**\OpenAPI\Client\Model\CreateModerationRequest**](../Model/CreateModerationRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CreateModerationResponse**](../Model/CreateModerationResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
