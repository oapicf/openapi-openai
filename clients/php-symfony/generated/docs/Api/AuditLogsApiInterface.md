# OpenAPI\Server\Api\AuditLogsApiInterface

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listAuditLogs**](AuditLogsApiInterface.md#listAuditLogs) | **GET** /organization/audit_logs | List user actions and configuration changes within this organization.


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\AuditLogsApi:
        tags:
            - { name: "open_api_server.api", api: "auditLogs" }
    # ...
```

## **listAuditLogs**
> OpenAPI\Server\Model\ListAuditLogsResponse listAuditLogs($effectiveAt, $projectIds, $eventTypes, $actorIds, $actorEmails, $resourceIds, $limit, $after, $before)

List user actions and configuration changes within this organization.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/AuditLogsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\AuditLogsApiInterface;

class AuditLogsApi implements AuditLogsApiInterface
{

    // ...

    /**
     * Implementation of AuditLogsApiInterface#listAuditLogs
     */
    public function listAuditLogs(?ListAuditLogsEffectiveAtParameter $effectiveAt, ?array $projectIds, ?array $eventTypes, ?array $actorIds, ?array $actorEmails, ?array $resourceIds, int $limit, ?string $after, ?string $before, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **effectiveAt** | [**OpenAPI\Server\Model\ListAuditLogsEffectiveAtParameter**](../Model/.md)| Return only events whose &#x60;effective_at&#x60; (Unix seconds) is in this range. | [optional]
 **projectIds** | [**string**](../Model/string.md)| Return only events for these projects. | [optional]
 **eventTypes** | [**OpenAPI\Server\Model\AuditLogEventType**](../Model/OpenAPI\Server\Model\AuditLogEventType.md)| Return only events with a &#x60;type&#x60; in one of these values. For example, &#x60;project.created&#x60;. For all options, see the documentation for the [audit log object](/docs/api-reference/audit-logs/object). | [optional]
 **actorIds** | [**string**](../Model/string.md)| Return only events performed by these actors. Can be a user ID, a service account ID, or an api key tracking ID. | [optional]
 **actorEmails** | [**string**](../Model/string.md)| Return only events performed by users with these emails. | [optional]
 **resourceIds** | [**string**](../Model/string.md)| Return only events performed on these targets. For example, a project ID updated. | [optional]
 **limit** | **int**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. | [optional] [default to 20]
 **after** | **string**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. | [optional]
 **before** | **string**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. | [optional]

### Return type

[**OpenAPI\Server\Model\ListAuditLogsResponse**](../Model/ListAuditLogsResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

