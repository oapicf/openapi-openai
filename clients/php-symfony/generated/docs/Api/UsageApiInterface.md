# OpenAPI\Server\Api\UsageApiInterface

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**usageAudioSpeeches**](UsageApiInterface.md#usageAudioSpeeches) | **GET** /organization/usage/audio_speeches | Get audio speeches usage details for the organization.
[**usageAudioTranscriptions**](UsageApiInterface.md#usageAudioTranscriptions) | **GET** /organization/usage/audio_transcriptions | Get audio transcriptions usage details for the organization.
[**usageCodeInterpreterSessions**](UsageApiInterface.md#usageCodeInterpreterSessions) | **GET** /organization/usage/code_interpreter_sessions | Get code interpreter sessions usage details for the organization.
[**usageCompletions**](UsageApiInterface.md#usageCompletions) | **GET** /organization/usage/completions | Get completions usage details for the organization.
[**usageCosts**](UsageApiInterface.md#usageCosts) | **GET** /organization/costs | Get costs details for the organization.
[**usageEmbeddings**](UsageApiInterface.md#usageEmbeddings) | **GET** /organization/usage/embeddings | Get embeddings usage details for the organization.
[**usageImages**](UsageApiInterface.md#usageImages) | **GET** /organization/usage/images | Get images usage details for the organization.
[**usageModerations**](UsageApiInterface.md#usageModerations) | **GET** /organization/usage/moderations | Get moderations usage details for the organization.
[**usageVectorStores**](UsageApiInterface.md#usageVectorStores) | **GET** /organization/usage/vector_stores | Get vector stores usage details for the organization.


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\UsageApi:
        tags:
            - { name: "open_api_server.api", api: "usage" }
    # ...
```

## **usageAudioSpeeches**
> OpenAPI\Server\Model\UsageResponse usageAudioSpeeches($startTime, $endTime, $bucketWidth, $projectIds, $userIds, $apiKeyIds, $models, $groupBy, $limit, $page)

Get audio speeches usage details for the organization.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/UsageApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\UsageApiInterface;

class UsageApi implements UsageApiInterface
{

    // ...

    /**
     * Implementation of UsageApiInterface#usageAudioSpeeches
     */
    public function usageAudioSpeeches(int $startTime, ?int $endTime, string $bucketWidth, ?array $projectIds, ?array $userIds, ?array $apiKeyIds, ?array $models, ?array $groupBy, ?int $limit, ?string $page, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startTime** | **int**| Start time (Unix seconds) of the query time range, inclusive. |
 **endTime** | **int**| End time (Unix seconds) of the query time range, exclusive. | [optional]
 **bucketWidth** | **string**| Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to &#39;1d&#39;]
 **projectIds** | [**string**](../Model/string.md)| Return only usage for these projects. | [optional]
 **userIds** | [**string**](../Model/string.md)| Return only usage for these users. | [optional]
 **apiKeyIds** | [**string**](../Model/string.md)| Return only usage for these API keys. | [optional]
 **models** | [**string**](../Model/string.md)| Return only usage for these models. | [optional]
 **groupBy** | [**string**](../Model/string.md)| Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. | [optional]
 **limit** | **int**| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 | [optional]
 **page** | **string**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional]

### Return type

[**OpenAPI\Server\Model\UsageResponse**](../Model/UsageResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **usageAudioTranscriptions**
> OpenAPI\Server\Model\UsageResponse usageAudioTranscriptions($startTime, $endTime, $bucketWidth, $projectIds, $userIds, $apiKeyIds, $models, $groupBy, $limit, $page)

Get audio transcriptions usage details for the organization.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/UsageApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\UsageApiInterface;

class UsageApi implements UsageApiInterface
{

    // ...

    /**
     * Implementation of UsageApiInterface#usageAudioTranscriptions
     */
    public function usageAudioTranscriptions(int $startTime, ?int $endTime, string $bucketWidth, ?array $projectIds, ?array $userIds, ?array $apiKeyIds, ?array $models, ?array $groupBy, ?int $limit, ?string $page, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startTime** | **int**| Start time (Unix seconds) of the query time range, inclusive. |
 **endTime** | **int**| End time (Unix seconds) of the query time range, exclusive. | [optional]
 **bucketWidth** | **string**| Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to &#39;1d&#39;]
 **projectIds** | [**string**](../Model/string.md)| Return only usage for these projects. | [optional]
 **userIds** | [**string**](../Model/string.md)| Return only usage for these users. | [optional]
 **apiKeyIds** | [**string**](../Model/string.md)| Return only usage for these API keys. | [optional]
 **models** | [**string**](../Model/string.md)| Return only usage for these models. | [optional]
 **groupBy** | [**string**](../Model/string.md)| Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. | [optional]
 **limit** | **int**| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 | [optional]
 **page** | **string**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional]

### Return type

[**OpenAPI\Server\Model\UsageResponse**](../Model/UsageResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **usageCodeInterpreterSessions**
> OpenAPI\Server\Model\UsageResponse usageCodeInterpreterSessions($startTime, $endTime, $bucketWidth, $projectIds, $groupBy, $limit, $page)

Get code interpreter sessions usage details for the organization.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/UsageApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\UsageApiInterface;

class UsageApi implements UsageApiInterface
{

    // ...

    /**
     * Implementation of UsageApiInterface#usageCodeInterpreterSessions
     */
    public function usageCodeInterpreterSessions(int $startTime, ?int $endTime, string $bucketWidth, ?array $projectIds, ?array $groupBy, ?int $limit, ?string $page, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startTime** | **int**| Start time (Unix seconds) of the query time range, inclusive. |
 **endTime** | **int**| End time (Unix seconds) of the query time range, exclusive. | [optional]
 **bucketWidth** | **string**| Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to &#39;1d&#39;]
 **projectIds** | [**string**](../Model/string.md)| Return only usage for these projects. | [optional]
 **groupBy** | [**string**](../Model/string.md)| Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;. | [optional]
 **limit** | **int**| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 | [optional]
 **page** | **string**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional]

### Return type

[**OpenAPI\Server\Model\UsageResponse**](../Model/UsageResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **usageCompletions**
> OpenAPI\Server\Model\UsageResponse usageCompletions($startTime, $endTime, $bucketWidth, $projectIds, $userIds, $apiKeyIds, $models, $batch, $groupBy, $limit, $page)

Get completions usage details for the organization.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/UsageApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\UsageApiInterface;

class UsageApi implements UsageApiInterface
{

    // ...

    /**
     * Implementation of UsageApiInterface#usageCompletions
     */
    public function usageCompletions(int $startTime, ?int $endTime, string $bucketWidth, ?array $projectIds, ?array $userIds, ?array $apiKeyIds, ?array $models, ?bool $batch, ?array $groupBy, ?int $limit, ?string $page, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startTime** | **int**| Start time (Unix seconds) of the query time range, inclusive. |
 **endTime** | **int**| End time (Unix seconds) of the query time range, exclusive. | [optional]
 **bucketWidth** | **string**| Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to &#39;1d&#39;]
 **projectIds** | [**string**](../Model/string.md)| Return only usage for these projects. | [optional]
 **userIds** | [**string**](../Model/string.md)| Return only usage for these users. | [optional]
 **apiKeyIds** | [**string**](../Model/string.md)| Return only usage for these API keys. | [optional]
 **models** | [**string**](../Model/string.md)| Return only usage for these models. | [optional]
 **batch** | **bool**| If &#x60;true&#x60;, return batch jobs only. If &#x60;false&#x60;, return non-batch jobs only. By default, return both. | [optional]
 **groupBy** | [**string**](../Model/string.md)| Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60;, &#x60;batch&#x60; or any combination of them. | [optional]
 **limit** | **int**| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 | [optional]
 **page** | **string**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional]

### Return type

[**OpenAPI\Server\Model\UsageResponse**](../Model/UsageResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **usageCosts**
> OpenAPI\Server\Model\UsageResponse usageCosts($startTime, $endTime, $bucketWidth, $projectIds, $groupBy, $limit, $page)

Get costs details for the organization.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/UsageApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\UsageApiInterface;

class UsageApi implements UsageApiInterface
{

    // ...

    /**
     * Implementation of UsageApiInterface#usageCosts
     */
    public function usageCosts(int $startTime, ?int $endTime, string $bucketWidth, ?array $projectIds, ?array $groupBy, int $limit, ?string $page, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startTime** | **int**| Start time (Unix seconds) of the query time range, inclusive. |
 **endTime** | **int**| End time (Unix seconds) of the query time range, exclusive. | [optional]
 **bucketWidth** | **string**| Width of each time bucket in response. Currently only &#x60;1d&#x60; is supported, default to &#x60;1d&#x60;. | [optional] [default to &#39;1d&#39;]
 **projectIds** | [**string**](../Model/string.md)| Return only costs for these projects. | [optional]
 **groupBy** | [**string**](../Model/string.md)| Group the costs by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;line_item&#x60; and any combination of them. | [optional]
 **limit** | **int**| A limit on the number of buckets to be returned. Limit can range between 1 and 180, and the default is 7. | [optional] [default to 7]
 **page** | **string**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional]

### Return type

[**OpenAPI\Server\Model\UsageResponse**](../Model/UsageResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **usageEmbeddings**
> OpenAPI\Server\Model\UsageResponse usageEmbeddings($startTime, $endTime, $bucketWidth, $projectIds, $userIds, $apiKeyIds, $models, $groupBy, $limit, $page)

Get embeddings usage details for the organization.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/UsageApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\UsageApiInterface;

class UsageApi implements UsageApiInterface
{

    // ...

    /**
     * Implementation of UsageApiInterface#usageEmbeddings
     */
    public function usageEmbeddings(int $startTime, ?int $endTime, string $bucketWidth, ?array $projectIds, ?array $userIds, ?array $apiKeyIds, ?array $models, ?array $groupBy, ?int $limit, ?string $page, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startTime** | **int**| Start time (Unix seconds) of the query time range, inclusive. |
 **endTime** | **int**| End time (Unix seconds) of the query time range, exclusive. | [optional]
 **bucketWidth** | **string**| Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to &#39;1d&#39;]
 **projectIds** | [**string**](../Model/string.md)| Return only usage for these projects. | [optional]
 **userIds** | [**string**](../Model/string.md)| Return only usage for these users. | [optional]
 **apiKeyIds** | [**string**](../Model/string.md)| Return only usage for these API keys. | [optional]
 **models** | [**string**](../Model/string.md)| Return only usage for these models. | [optional]
 **groupBy** | [**string**](../Model/string.md)| Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. | [optional]
 **limit** | **int**| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 | [optional]
 **page** | **string**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional]

### Return type

[**OpenAPI\Server\Model\UsageResponse**](../Model/UsageResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **usageImages**
> OpenAPI\Server\Model\UsageResponse usageImages($startTime, $endTime, $bucketWidth, $sources, $sizes, $projectIds, $userIds, $apiKeyIds, $models, $groupBy, $limit, $page)

Get images usage details for the organization.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/UsageApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\UsageApiInterface;

class UsageApi implements UsageApiInterface
{

    // ...

    /**
     * Implementation of UsageApiInterface#usageImages
     */
    public function usageImages(int $startTime, ?int $endTime, string $bucketWidth, ?array $sources, ?array $sizes, ?array $projectIds, ?array $userIds, ?array $apiKeyIds, ?array $models, ?array $groupBy, ?int $limit, ?string $page, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startTime** | **int**| Start time (Unix seconds) of the query time range, inclusive. |
 **endTime** | **int**| End time (Unix seconds) of the query time range, exclusive. | [optional]
 **bucketWidth** | **string**| Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to &#39;1d&#39;]
 **sources** | [**string**](../Model/string.md)| Return only usages for these sources. Possible values are &#x60;image.generation&#x60;, &#x60;image.edit&#x60;, &#x60;image.variation&#x60; or any combination of them. | [optional]
 **sizes** | [**string**](../Model/string.md)| Return only usages for these image sizes. Possible values are &#x60;256x256&#x60;, &#x60;512x512&#x60;, &#x60;1024x1024&#x60;, &#x60;1792x1792&#x60;, &#x60;1024x1792&#x60; or any combination of them. | [optional]
 **projectIds** | [**string**](../Model/string.md)| Return only usage for these projects. | [optional]
 **userIds** | [**string**](../Model/string.md)| Return only usage for these users. | [optional]
 **apiKeyIds** | [**string**](../Model/string.md)| Return only usage for these API keys. | [optional]
 **models** | [**string**](../Model/string.md)| Return only usage for these models. | [optional]
 **groupBy** | [**string**](../Model/string.md)| Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60;, &#x60;size&#x60;, &#x60;source&#x60; or any combination of them. | [optional]
 **limit** | **int**| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 | [optional]
 **page** | **string**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional]

### Return type

[**OpenAPI\Server\Model\UsageResponse**](../Model/UsageResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **usageModerations**
> OpenAPI\Server\Model\UsageResponse usageModerations($startTime, $endTime, $bucketWidth, $projectIds, $userIds, $apiKeyIds, $models, $groupBy, $limit, $page)

Get moderations usage details for the organization.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/UsageApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\UsageApiInterface;

class UsageApi implements UsageApiInterface
{

    // ...

    /**
     * Implementation of UsageApiInterface#usageModerations
     */
    public function usageModerations(int $startTime, ?int $endTime, string $bucketWidth, ?array $projectIds, ?array $userIds, ?array $apiKeyIds, ?array $models, ?array $groupBy, ?int $limit, ?string $page, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startTime** | **int**| Start time (Unix seconds) of the query time range, inclusive. |
 **endTime** | **int**| End time (Unix seconds) of the query time range, exclusive. | [optional]
 **bucketWidth** | **string**| Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to &#39;1d&#39;]
 **projectIds** | [**string**](../Model/string.md)| Return only usage for these projects. | [optional]
 **userIds** | [**string**](../Model/string.md)| Return only usage for these users. | [optional]
 **apiKeyIds** | [**string**](../Model/string.md)| Return only usage for these API keys. | [optional]
 **models** | [**string**](../Model/string.md)| Return only usage for these models. | [optional]
 **groupBy** | [**string**](../Model/string.md)| Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. | [optional]
 **limit** | **int**| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 | [optional]
 **page** | **string**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional]

### Return type

[**OpenAPI\Server\Model\UsageResponse**](../Model/UsageResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **usageVectorStores**
> OpenAPI\Server\Model\UsageResponse usageVectorStores($startTime, $endTime, $bucketWidth, $projectIds, $groupBy, $limit, $page)

Get vector stores usage details for the organization.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/UsageApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\UsageApiInterface;

class UsageApi implements UsageApiInterface
{

    // ...

    /**
     * Implementation of UsageApiInterface#usageVectorStores
     */
    public function usageVectorStores(int $startTime, ?int $endTime, string $bucketWidth, ?array $projectIds, ?array $groupBy, ?int $limit, ?string $page, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startTime** | **int**| Start time (Unix seconds) of the query time range, inclusive. |
 **endTime** | **int**| End time (Unix seconds) of the query time range, exclusive. | [optional]
 **bucketWidth** | **string**| Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to &#39;1d&#39;]
 **projectIds** | [**string**](../Model/string.md)| Return only usage for these projects. | [optional]
 **groupBy** | [**string**](../Model/string.md)| Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;. | [optional]
 **limit** | **int**| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 | [optional]
 **page** | **string**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional]

### Return type

[**OpenAPI\Server\Model\UsageResponse**](../Model/UsageResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

