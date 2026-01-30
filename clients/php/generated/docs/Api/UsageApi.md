# OpenAPI\Client\UsageApi



All URIs are relative to https://api.openai.com/v1, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**usageAudioSpeeches()**](UsageApi.md#usageAudioSpeeches) | **GET** /organization/usage/audio_speeches | Get audio speeches usage details for the organization. |
| [**usageAudioTranscriptions()**](UsageApi.md#usageAudioTranscriptions) | **GET** /organization/usage/audio_transcriptions | Get audio transcriptions usage details for the organization. |
| [**usageCodeInterpreterSessions()**](UsageApi.md#usageCodeInterpreterSessions) | **GET** /organization/usage/code_interpreter_sessions | Get code interpreter sessions usage details for the organization. |
| [**usageCompletions()**](UsageApi.md#usageCompletions) | **GET** /organization/usage/completions | Get completions usage details for the organization. |
| [**usageCosts()**](UsageApi.md#usageCosts) | **GET** /organization/costs | Get costs details for the organization. |
| [**usageEmbeddings()**](UsageApi.md#usageEmbeddings) | **GET** /organization/usage/embeddings | Get embeddings usage details for the organization. |
| [**usageImages()**](UsageApi.md#usageImages) | **GET** /organization/usage/images | Get images usage details for the organization. |
| [**usageModerations()**](UsageApi.md#usageModerations) | **GET** /organization/usage/moderations | Get moderations usage details for the organization. |
| [**usageVectorStores()**](UsageApi.md#usageVectorStores) | **GET** /organization/usage/vector_stores | Get vector stores usage details for the organization. |


## `usageAudioSpeeches()`

```php
usageAudioSpeeches($start_time, $end_time, $bucket_width, $project_ids, $user_ids, $api_key_ids, $models, $group_by, $limit, $page): \OpenAPI\Client\Model\UsageResponse
```

Get audio speeches usage details for the organization.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\UsageApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$start_time = 56; // int | Start time (Unix seconds) of the query time range, inclusive.
$end_time = 56; // int | End time (Unix seconds) of the query time range, exclusive.
$bucket_width = '1d'; // string | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
$project_ids = array('project_ids_example'); // string[] | Return only usage for these projects.
$user_ids = array('user_ids_example'); // string[] | Return only usage for these users.
$api_key_ids = array('api_key_ids_example'); // string[] | Return only usage for these API keys.
$models = array('models_example'); // string[] | Return only usage for these models.
$group_by = array('group_by_example'); // string[] | Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them.
$limit = 56; // int | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440
$page = 'page_example'; // string | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.

try {
    $result = $apiInstance->usageAudioSpeeches($start_time, $end_time, $bucket_width, $project_ids, $user_ids, $api_key_ids, $models, $group_by, $limit, $page);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UsageApi->usageAudioSpeeches: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **start_time** | **int**| Start time (Unix seconds) of the query time range, inclusive. | |
| **end_time** | **int**| End time (Unix seconds) of the query time range, exclusive. | [optional] |
| **bucket_width** | **string**| Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to &#39;1d&#39;] |
| **project_ids** | [**string[]**](../Model/string.md)| Return only usage for these projects. | [optional] |
| **user_ids** | [**string[]**](../Model/string.md)| Return only usage for these users. | [optional] |
| **api_key_ids** | [**string[]**](../Model/string.md)| Return only usage for these API keys. | [optional] |
| **models** | [**string[]**](../Model/string.md)| Return only usage for these models. | [optional] |
| **group_by** | [**string[]**](../Model/string.md)| Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. | [optional] |
| **limit** | **int**| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 | [optional] |
| **page** | **string**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] |

### Return type

[**\OpenAPI\Client\Model\UsageResponse**](../Model/UsageResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `usageAudioTranscriptions()`

```php
usageAudioTranscriptions($start_time, $end_time, $bucket_width, $project_ids, $user_ids, $api_key_ids, $models, $group_by, $limit, $page): \OpenAPI\Client\Model\UsageResponse
```

Get audio transcriptions usage details for the organization.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\UsageApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$start_time = 56; // int | Start time (Unix seconds) of the query time range, inclusive.
$end_time = 56; // int | End time (Unix seconds) of the query time range, exclusive.
$bucket_width = '1d'; // string | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
$project_ids = array('project_ids_example'); // string[] | Return only usage for these projects.
$user_ids = array('user_ids_example'); // string[] | Return only usage for these users.
$api_key_ids = array('api_key_ids_example'); // string[] | Return only usage for these API keys.
$models = array('models_example'); // string[] | Return only usage for these models.
$group_by = array('group_by_example'); // string[] | Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them.
$limit = 56; // int | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440
$page = 'page_example'; // string | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.

try {
    $result = $apiInstance->usageAudioTranscriptions($start_time, $end_time, $bucket_width, $project_ids, $user_ids, $api_key_ids, $models, $group_by, $limit, $page);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UsageApi->usageAudioTranscriptions: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **start_time** | **int**| Start time (Unix seconds) of the query time range, inclusive. | |
| **end_time** | **int**| End time (Unix seconds) of the query time range, exclusive. | [optional] |
| **bucket_width** | **string**| Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to &#39;1d&#39;] |
| **project_ids** | [**string[]**](../Model/string.md)| Return only usage for these projects. | [optional] |
| **user_ids** | [**string[]**](../Model/string.md)| Return only usage for these users. | [optional] |
| **api_key_ids** | [**string[]**](../Model/string.md)| Return only usage for these API keys. | [optional] |
| **models** | [**string[]**](../Model/string.md)| Return only usage for these models. | [optional] |
| **group_by** | [**string[]**](../Model/string.md)| Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. | [optional] |
| **limit** | **int**| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 | [optional] |
| **page** | **string**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] |

### Return type

[**\OpenAPI\Client\Model\UsageResponse**](../Model/UsageResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `usageCodeInterpreterSessions()`

```php
usageCodeInterpreterSessions($start_time, $end_time, $bucket_width, $project_ids, $group_by, $limit, $page): \OpenAPI\Client\Model\UsageResponse
```

Get code interpreter sessions usage details for the organization.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\UsageApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$start_time = 56; // int | Start time (Unix seconds) of the query time range, inclusive.
$end_time = 56; // int | End time (Unix seconds) of the query time range, exclusive.
$bucket_width = '1d'; // string | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
$project_ids = array('project_ids_example'); // string[] | Return only usage for these projects.
$group_by = array('group_by_example'); // string[] | Group the usage data by the specified fields. Support fields include `project_id`.
$limit = 56; // int | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440
$page = 'page_example'; // string | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.

try {
    $result = $apiInstance->usageCodeInterpreterSessions($start_time, $end_time, $bucket_width, $project_ids, $group_by, $limit, $page);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UsageApi->usageCodeInterpreterSessions: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **start_time** | **int**| Start time (Unix seconds) of the query time range, inclusive. | |
| **end_time** | **int**| End time (Unix seconds) of the query time range, exclusive. | [optional] |
| **bucket_width** | **string**| Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to &#39;1d&#39;] |
| **project_ids** | [**string[]**](../Model/string.md)| Return only usage for these projects. | [optional] |
| **group_by** | [**string[]**](../Model/string.md)| Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;. | [optional] |
| **limit** | **int**| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 | [optional] |
| **page** | **string**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] |

### Return type

[**\OpenAPI\Client\Model\UsageResponse**](../Model/UsageResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `usageCompletions()`

```php
usageCompletions($start_time, $end_time, $bucket_width, $project_ids, $user_ids, $api_key_ids, $models, $batch, $group_by, $limit, $page): \OpenAPI\Client\Model\UsageResponse
```

Get completions usage details for the organization.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\UsageApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$start_time = 56; // int | Start time (Unix seconds) of the query time range, inclusive.
$end_time = 56; // int | End time (Unix seconds) of the query time range, exclusive.
$bucket_width = '1d'; // string | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
$project_ids = array('project_ids_example'); // string[] | Return only usage for these projects.
$user_ids = array('user_ids_example'); // string[] | Return only usage for these users.
$api_key_ids = array('api_key_ids_example'); // string[] | Return only usage for these API keys.
$models = array('models_example'); // string[] | Return only usage for these models.
$batch = True; // bool | If `true`, return batch jobs only. If `false`, return non-batch jobs only. By default, return both.
$group_by = array('group_by_example'); // string[] | Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model`, `batch` or any combination of them.
$limit = 56; // int | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440
$page = 'page_example'; // string | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.

try {
    $result = $apiInstance->usageCompletions($start_time, $end_time, $bucket_width, $project_ids, $user_ids, $api_key_ids, $models, $batch, $group_by, $limit, $page);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UsageApi->usageCompletions: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **start_time** | **int**| Start time (Unix seconds) of the query time range, inclusive. | |
| **end_time** | **int**| End time (Unix seconds) of the query time range, exclusive. | [optional] |
| **bucket_width** | **string**| Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to &#39;1d&#39;] |
| **project_ids** | [**string[]**](../Model/string.md)| Return only usage for these projects. | [optional] |
| **user_ids** | [**string[]**](../Model/string.md)| Return only usage for these users. | [optional] |
| **api_key_ids** | [**string[]**](../Model/string.md)| Return only usage for these API keys. | [optional] |
| **models** | [**string[]**](../Model/string.md)| Return only usage for these models. | [optional] |
| **batch** | **bool**| If &#x60;true&#x60;, return batch jobs only. If &#x60;false&#x60;, return non-batch jobs only. By default, return both. | [optional] |
| **group_by** | [**string[]**](../Model/string.md)| Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60;, &#x60;batch&#x60; or any combination of them. | [optional] |
| **limit** | **int**| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 | [optional] |
| **page** | **string**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] |

### Return type

[**\OpenAPI\Client\Model\UsageResponse**](../Model/UsageResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `usageCosts()`

```php
usageCosts($start_time, $end_time, $bucket_width, $project_ids, $group_by, $limit, $page): \OpenAPI\Client\Model\UsageResponse
```

Get costs details for the organization.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\UsageApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$start_time = 56; // int | Start time (Unix seconds) of the query time range, inclusive.
$end_time = 56; // int | End time (Unix seconds) of the query time range, exclusive.
$bucket_width = '1d'; // string | Width of each time bucket in response. Currently only `1d` is supported, default to `1d`.
$project_ids = array('project_ids_example'); // string[] | Return only costs for these projects.
$group_by = array('group_by_example'); // string[] | Group the costs by the specified fields. Support fields include `project_id`, `line_item` and any combination of them.
$limit = 7; // int | A limit on the number of buckets to be returned. Limit can range between 1 and 180, and the default is 7.
$page = 'page_example'; // string | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.

try {
    $result = $apiInstance->usageCosts($start_time, $end_time, $bucket_width, $project_ids, $group_by, $limit, $page);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UsageApi->usageCosts: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **start_time** | **int**| Start time (Unix seconds) of the query time range, inclusive. | |
| **end_time** | **int**| End time (Unix seconds) of the query time range, exclusive. | [optional] |
| **bucket_width** | **string**| Width of each time bucket in response. Currently only &#x60;1d&#x60; is supported, default to &#x60;1d&#x60;. | [optional] [default to &#39;1d&#39;] |
| **project_ids** | [**string[]**](../Model/string.md)| Return only costs for these projects. | [optional] |
| **group_by** | [**string[]**](../Model/string.md)| Group the costs by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;line_item&#x60; and any combination of them. | [optional] |
| **limit** | **int**| A limit on the number of buckets to be returned. Limit can range between 1 and 180, and the default is 7. | [optional] [default to 7] |
| **page** | **string**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] |

### Return type

[**\OpenAPI\Client\Model\UsageResponse**](../Model/UsageResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `usageEmbeddings()`

```php
usageEmbeddings($start_time, $end_time, $bucket_width, $project_ids, $user_ids, $api_key_ids, $models, $group_by, $limit, $page): \OpenAPI\Client\Model\UsageResponse
```

Get embeddings usage details for the organization.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\UsageApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$start_time = 56; // int | Start time (Unix seconds) of the query time range, inclusive.
$end_time = 56; // int | End time (Unix seconds) of the query time range, exclusive.
$bucket_width = '1d'; // string | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
$project_ids = array('project_ids_example'); // string[] | Return only usage for these projects.
$user_ids = array('user_ids_example'); // string[] | Return only usage for these users.
$api_key_ids = array('api_key_ids_example'); // string[] | Return only usage for these API keys.
$models = array('models_example'); // string[] | Return only usage for these models.
$group_by = array('group_by_example'); // string[] | Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them.
$limit = 56; // int | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440
$page = 'page_example'; // string | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.

try {
    $result = $apiInstance->usageEmbeddings($start_time, $end_time, $bucket_width, $project_ids, $user_ids, $api_key_ids, $models, $group_by, $limit, $page);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UsageApi->usageEmbeddings: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **start_time** | **int**| Start time (Unix seconds) of the query time range, inclusive. | |
| **end_time** | **int**| End time (Unix seconds) of the query time range, exclusive. | [optional] |
| **bucket_width** | **string**| Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to &#39;1d&#39;] |
| **project_ids** | [**string[]**](../Model/string.md)| Return only usage for these projects. | [optional] |
| **user_ids** | [**string[]**](../Model/string.md)| Return only usage for these users. | [optional] |
| **api_key_ids** | [**string[]**](../Model/string.md)| Return only usage for these API keys. | [optional] |
| **models** | [**string[]**](../Model/string.md)| Return only usage for these models. | [optional] |
| **group_by** | [**string[]**](../Model/string.md)| Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. | [optional] |
| **limit** | **int**| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 | [optional] |
| **page** | **string**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] |

### Return type

[**\OpenAPI\Client\Model\UsageResponse**](../Model/UsageResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `usageImages()`

```php
usageImages($start_time, $end_time, $bucket_width, $sources, $sizes, $project_ids, $user_ids, $api_key_ids, $models, $group_by, $limit, $page): \OpenAPI\Client\Model\UsageResponse
```

Get images usage details for the organization.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\UsageApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$start_time = 56; // int | Start time (Unix seconds) of the query time range, inclusive.
$end_time = 56; // int | End time (Unix seconds) of the query time range, exclusive.
$bucket_width = '1d'; // string | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
$sources = array('sources_example'); // string[] | Return only usages for these sources. Possible values are `image.generation`, `image.edit`, `image.variation` or any combination of them.
$sizes = array('sizes_example'); // string[] | Return only usages for these image sizes. Possible values are `256x256`, `512x512`, `1024x1024`, `1792x1792`, `1024x1792` or any combination of them.
$project_ids = array('project_ids_example'); // string[] | Return only usage for these projects.
$user_ids = array('user_ids_example'); // string[] | Return only usage for these users.
$api_key_ids = array('api_key_ids_example'); // string[] | Return only usage for these API keys.
$models = array('models_example'); // string[] | Return only usage for these models.
$group_by = array('group_by_example'); // string[] | Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model`, `size`, `source` or any combination of them.
$limit = 56; // int | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440
$page = 'page_example'; // string | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.

try {
    $result = $apiInstance->usageImages($start_time, $end_time, $bucket_width, $sources, $sizes, $project_ids, $user_ids, $api_key_ids, $models, $group_by, $limit, $page);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UsageApi->usageImages: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **start_time** | **int**| Start time (Unix seconds) of the query time range, inclusive. | |
| **end_time** | **int**| End time (Unix seconds) of the query time range, exclusive. | [optional] |
| **bucket_width** | **string**| Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to &#39;1d&#39;] |
| **sources** | [**string[]**](../Model/string.md)| Return only usages for these sources. Possible values are &#x60;image.generation&#x60;, &#x60;image.edit&#x60;, &#x60;image.variation&#x60; or any combination of them. | [optional] |
| **sizes** | [**string[]**](../Model/string.md)| Return only usages for these image sizes. Possible values are &#x60;256x256&#x60;, &#x60;512x512&#x60;, &#x60;1024x1024&#x60;, &#x60;1792x1792&#x60;, &#x60;1024x1792&#x60; or any combination of them. | [optional] |
| **project_ids** | [**string[]**](../Model/string.md)| Return only usage for these projects. | [optional] |
| **user_ids** | [**string[]**](../Model/string.md)| Return only usage for these users. | [optional] |
| **api_key_ids** | [**string[]**](../Model/string.md)| Return only usage for these API keys. | [optional] |
| **models** | [**string[]**](../Model/string.md)| Return only usage for these models. | [optional] |
| **group_by** | [**string[]**](../Model/string.md)| Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60;, &#x60;size&#x60;, &#x60;source&#x60; or any combination of them. | [optional] |
| **limit** | **int**| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 | [optional] |
| **page** | **string**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] |

### Return type

[**\OpenAPI\Client\Model\UsageResponse**](../Model/UsageResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `usageModerations()`

```php
usageModerations($start_time, $end_time, $bucket_width, $project_ids, $user_ids, $api_key_ids, $models, $group_by, $limit, $page): \OpenAPI\Client\Model\UsageResponse
```

Get moderations usage details for the organization.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\UsageApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$start_time = 56; // int | Start time (Unix seconds) of the query time range, inclusive.
$end_time = 56; // int | End time (Unix seconds) of the query time range, exclusive.
$bucket_width = '1d'; // string | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
$project_ids = array('project_ids_example'); // string[] | Return only usage for these projects.
$user_ids = array('user_ids_example'); // string[] | Return only usage for these users.
$api_key_ids = array('api_key_ids_example'); // string[] | Return only usage for these API keys.
$models = array('models_example'); // string[] | Return only usage for these models.
$group_by = array('group_by_example'); // string[] | Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them.
$limit = 56; // int | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440
$page = 'page_example'; // string | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.

try {
    $result = $apiInstance->usageModerations($start_time, $end_time, $bucket_width, $project_ids, $user_ids, $api_key_ids, $models, $group_by, $limit, $page);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UsageApi->usageModerations: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **start_time** | **int**| Start time (Unix seconds) of the query time range, inclusive. | |
| **end_time** | **int**| End time (Unix seconds) of the query time range, exclusive. | [optional] |
| **bucket_width** | **string**| Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to &#39;1d&#39;] |
| **project_ids** | [**string[]**](../Model/string.md)| Return only usage for these projects. | [optional] |
| **user_ids** | [**string[]**](../Model/string.md)| Return only usage for these users. | [optional] |
| **api_key_ids** | [**string[]**](../Model/string.md)| Return only usage for these API keys. | [optional] |
| **models** | [**string[]**](../Model/string.md)| Return only usage for these models. | [optional] |
| **group_by** | [**string[]**](../Model/string.md)| Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. | [optional] |
| **limit** | **int**| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 | [optional] |
| **page** | **string**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] |

### Return type

[**\OpenAPI\Client\Model\UsageResponse**](../Model/UsageResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `usageVectorStores()`

```php
usageVectorStores($start_time, $end_time, $bucket_width, $project_ids, $group_by, $limit, $page): \OpenAPI\Client\Model\UsageResponse
```

Get vector stores usage details for the organization.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\UsageApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$start_time = 56; // int | Start time (Unix seconds) of the query time range, inclusive.
$end_time = 56; // int | End time (Unix seconds) of the query time range, exclusive.
$bucket_width = '1d'; // string | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
$project_ids = array('project_ids_example'); // string[] | Return only usage for these projects.
$group_by = array('group_by_example'); // string[] | Group the usage data by the specified fields. Support fields include `project_id`.
$limit = 56; // int | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440
$page = 'page_example'; // string | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.

try {
    $result = $apiInstance->usageVectorStores($start_time, $end_time, $bucket_width, $project_ids, $group_by, $limit, $page);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UsageApi->usageVectorStores: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **start_time** | **int**| Start time (Unix seconds) of the query time range, inclusive. | |
| **end_time** | **int**| End time (Unix seconds) of the query time range, exclusive. | [optional] |
| **bucket_width** | **string**| Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to &#39;1d&#39;] |
| **project_ids** | [**string[]**](../Model/string.md)| Return only usage for these projects. | [optional] |
| **group_by** | [**string[]**](../Model/string.md)| Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;. | [optional] |
| **limit** | **int**| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 | [optional] |
| **page** | **string**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] |

### Return type

[**\OpenAPI\Client\Model\UsageResponse**](../Model/UsageResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
