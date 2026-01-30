# OpenAPI\Client\InvitesApi



All URIs are relative to https://api.openai.com/v1, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**deleteInvite()**](InvitesApi.md#deleteInvite) | **DELETE** /organization/invites/{invite_id} | Delete an invite. If the invite has already been accepted, it cannot be deleted. |
| [**inviteUser()**](InvitesApi.md#inviteUser) | **POST** /organization/invites | Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization. |
| [**listInvites()**](InvitesApi.md#listInvites) | **GET** /organization/invites | Returns a list of invites in the organization. |
| [**retrieveInvite()**](InvitesApi.md#retrieveInvite) | **GET** /organization/invites/{invite_id} | Retrieves an invite. |


## `deleteInvite()`

```php
deleteInvite($invite_id): \OpenAPI\Client\Model\InviteDeleteResponse
```

Delete an invite. If the invite has already been accepted, it cannot be deleted.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\InvitesApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$invite_id = 'invite_id_example'; // string | The ID of the invite to delete.

try {
    $result = $apiInstance->deleteInvite($invite_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling InvitesApi->deleteInvite: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **invite_id** | **string**| The ID of the invite to delete. | |

### Return type

[**\OpenAPI\Client\Model\InviteDeleteResponse**](../Model/InviteDeleteResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `inviteUser()`

```php
inviteUser($invite_request): \OpenAPI\Client\Model\Invite
```

Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\InvitesApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$invite_request = new \OpenAPI\Client\Model\InviteRequest(); // \OpenAPI\Client\Model\InviteRequest | The invite request payload.

try {
    $result = $apiInstance->inviteUser($invite_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling InvitesApi->inviteUser: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **invite_request** | [**\OpenAPI\Client\Model\InviteRequest**](../Model/InviteRequest.md)| The invite request payload. | |

### Return type

[**\OpenAPI\Client\Model\Invite**](../Model/Invite.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `listInvites()`

```php
listInvites($limit, $after): \OpenAPI\Client\Model\InviteListResponse
```

Returns a list of invites in the organization.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\InvitesApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$limit = 20; // int | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.
$after = 'after_example'; // string | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.

try {
    $result = $apiInstance->listInvites($limit, $after);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling InvitesApi->listInvites: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **limit** | **int**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. | [optional] [default to 20] |
| **after** | **string**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. | [optional] |

### Return type

[**\OpenAPI\Client\Model\InviteListResponse**](../Model/InviteListResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `retrieveInvite()`

```php
retrieveInvite($invite_id): \OpenAPI\Client\Model\Invite
```

Retrieves an invite.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\InvitesApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$invite_id = 'invite_id_example'; // string | The ID of the invite to retrieve.

try {
    $result = $apiInstance->retrieveInvite($invite_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling InvitesApi->retrieveInvite: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **invite_id** | **string**| The ID of the invite to retrieve. | |

### Return type

[**\OpenAPI\Client\Model\Invite**](../Model/Invite.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
