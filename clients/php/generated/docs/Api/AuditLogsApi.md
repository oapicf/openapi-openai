# OpenAPI\Client\AuditLogsApi



All URIs are relative to https://api.openai.com/v1, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**listAuditLogs()**](AuditLogsApi.md#listAuditLogs) | **GET** /organization/audit_logs | List user actions and configuration changes within this organization. |


## `listAuditLogs()`

```php
listAuditLogs($effective_at, $project_ids, $event_types, $actor_ids, $actor_emails, $resource_ids, $limit, $after, $before): \OpenAPI\Client\Model\ListAuditLogsResponse
```

List user actions and configuration changes within this organization.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AuditLogsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$effective_at = new \OpenAPI\Client\Model\\OpenAPI\Client\Model\ListAuditLogsEffectiveAtParameter(); // \OpenAPI\Client\Model\ListAuditLogsEffectiveAtParameter | Return only events whose `effective_at` (Unix seconds) is in this range.
$project_ids = array('project_ids_example'); // string[] | Return only events for these projects.
$event_types = array(new \OpenAPI\Client\Model\\OpenAPI\Client\Model\AuditLogEventType()); // \OpenAPI\Client\Model\AuditLogEventType[] | Return only events with a `type` in one of these values. For example, `project.created`. For all options, see the documentation for the [audit log object](/docs/api-reference/audit-logs/object).
$actor_ids = array('actor_ids_example'); // string[] | Return only events performed by these actors. Can be a user ID, a service account ID, or an api key tracking ID.
$actor_emails = array('actor_emails_example'); // string[] | Return only events performed by users with these emails.
$resource_ids = array('resource_ids_example'); // string[] | Return only events performed on these targets. For example, a project ID updated.
$limit = 20; // int | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.
$after = 'after_example'; // string | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.
$before = 'before_example'; // string | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.

try {
    $result = $apiInstance->listAuditLogs($effective_at, $project_ids, $event_types, $actor_ids, $actor_emails, $resource_ids, $limit, $after, $before);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AuditLogsApi->listAuditLogs: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **effective_at** | [**\OpenAPI\Client\Model\ListAuditLogsEffectiveAtParameter**](../Model/.md)| Return only events whose &#x60;effective_at&#x60; (Unix seconds) is in this range. | [optional] |
| **project_ids** | [**string[]**](../Model/string.md)| Return only events for these projects. | [optional] |
| **event_types** | [**\OpenAPI\Client\Model\AuditLogEventType[]**](../Model/\OpenAPI\Client\Model\AuditLogEventType.md)| Return only events with a &#x60;type&#x60; in one of these values. For example, &#x60;project.created&#x60;. For all options, see the documentation for the [audit log object](/docs/api-reference/audit-logs/object). | [optional] |
| **actor_ids** | [**string[]**](../Model/string.md)| Return only events performed by these actors. Can be a user ID, a service account ID, or an api key tracking ID. | [optional] |
| **actor_emails** | [**string[]**](../Model/string.md)| Return only events performed by users with these emails. | [optional] |
| **resource_ids** | [**string[]**](../Model/string.md)| Return only events performed on these targets. For example, a project ID updated. | [optional] |
| **limit** | **int**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. | [optional] [default to 20] |
| **after** | **string**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. | [optional] |
| **before** | **string**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. | [optional] |

### Return type

[**\OpenAPI\Client\Model\ListAuditLogsResponse**](../Model/ListAuditLogsResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
