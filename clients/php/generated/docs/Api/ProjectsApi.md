# OpenAPI\Client\ProjectsApi



All URIs are relative to https://api.openai.com/v1, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**archiveProject()**](ProjectsApi.md#archiveProject) | **POST** /organization/projects/{project_id}/archive | Archives a project in the organization. Archived projects cannot be used or updated. |
| [**createProject()**](ProjectsApi.md#createProject) | **POST** /organization/projects | Create a new project in the organization. Projects can be created and archived, but cannot be deleted. |
| [**createProjectServiceAccount()**](ProjectsApi.md#createProjectServiceAccount) | **POST** /organization/projects/{project_id}/service_accounts | Creates a new service account in the project. This also returns an unredacted API key for the service account. |
| [**createProjectUser()**](ProjectsApi.md#createProjectUser) | **POST** /organization/projects/{project_id}/users | Adds a user to the project. Users must already be members of the organization to be added to a project. |
| [**deleteProjectApiKey()**](ProjectsApi.md#deleteProjectApiKey) | **DELETE** /organization/projects/{project_id}/api_keys/{key_id} | Deletes an API key from the project. |
| [**deleteProjectServiceAccount()**](ProjectsApi.md#deleteProjectServiceAccount) | **DELETE** /organization/projects/{project_id}/service_accounts/{service_account_id} | Deletes a service account from the project. |
| [**deleteProjectUser()**](ProjectsApi.md#deleteProjectUser) | **DELETE** /organization/projects/{project_id}/users/{user_id} | Deletes a user from the project. |
| [**listProjectApiKeys()**](ProjectsApi.md#listProjectApiKeys) | **GET** /organization/projects/{project_id}/api_keys | Returns a list of API keys in the project. |
| [**listProjectRateLimits()**](ProjectsApi.md#listProjectRateLimits) | **GET** /organization/projects/{project_id}/rate_limits | Returns the rate limits per model for a project. |
| [**listProjectServiceAccounts()**](ProjectsApi.md#listProjectServiceAccounts) | **GET** /organization/projects/{project_id}/service_accounts | Returns a list of service accounts in the project. |
| [**listProjectUsers()**](ProjectsApi.md#listProjectUsers) | **GET** /organization/projects/{project_id}/users | Returns a list of users in the project. |
| [**listProjects()**](ProjectsApi.md#listProjects) | **GET** /organization/projects | Returns a list of projects. |
| [**modifyProject()**](ProjectsApi.md#modifyProject) | **POST** /organization/projects/{project_id} | Modifies a project in the organization. |
| [**modifyProjectUser()**](ProjectsApi.md#modifyProjectUser) | **POST** /organization/projects/{project_id}/users/{user_id} | Modifies a user&#39;s role in the project. |
| [**retrieveProject()**](ProjectsApi.md#retrieveProject) | **GET** /organization/projects/{project_id} | Retrieves a project. |
| [**retrieveProjectApiKey()**](ProjectsApi.md#retrieveProjectApiKey) | **GET** /organization/projects/{project_id}/api_keys/{key_id} | Retrieves an API key in the project. |
| [**retrieveProjectServiceAccount()**](ProjectsApi.md#retrieveProjectServiceAccount) | **GET** /organization/projects/{project_id}/service_accounts/{service_account_id} | Retrieves a service account in the project. |
| [**retrieveProjectUser()**](ProjectsApi.md#retrieveProjectUser) | **GET** /organization/projects/{project_id}/users/{user_id} | Retrieves a user in the project. |
| [**updateProjectRateLimits()**](ProjectsApi.md#updateProjectRateLimits) | **POST** /organization/projects/{project_id}/rate_limits/{rate_limit_id} | Updates a project rate limit. |


## `archiveProject()`

```php
archiveProject($project_id): \OpenAPI\Client\Model\Project
```

Archives a project in the organization. Archived projects cannot be used or updated.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ProjectsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$project_id = 'project_id_example'; // string | The ID of the project.

try {
    $result = $apiInstance->archiveProject($project_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ProjectsApi->archiveProject: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **project_id** | **string**| The ID of the project. | |

### Return type

[**\OpenAPI\Client\Model\Project**](../Model/Project.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `createProject()`

```php
createProject($project_create_request): \OpenAPI\Client\Model\Project
```

Create a new project in the organization. Projects can be created and archived, but cannot be deleted.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ProjectsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$project_create_request = new \OpenAPI\Client\Model\ProjectCreateRequest(); // \OpenAPI\Client\Model\ProjectCreateRequest | The project create request payload.

try {
    $result = $apiInstance->createProject($project_create_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ProjectsApi->createProject: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **project_create_request** | [**\OpenAPI\Client\Model\ProjectCreateRequest**](../Model/ProjectCreateRequest.md)| The project create request payload. | |

### Return type

[**\OpenAPI\Client\Model\Project**](../Model/Project.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `createProjectServiceAccount()`

```php
createProjectServiceAccount($project_id, $project_service_account_create_request): \OpenAPI\Client\Model\ProjectServiceAccountCreateResponse
```

Creates a new service account in the project. This also returns an unredacted API key for the service account.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ProjectsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$project_id = 'project_id_example'; // string | The ID of the project.
$project_service_account_create_request = new \OpenAPI\Client\Model\ProjectServiceAccountCreateRequest(); // \OpenAPI\Client\Model\ProjectServiceAccountCreateRequest | The project service account create request payload.

try {
    $result = $apiInstance->createProjectServiceAccount($project_id, $project_service_account_create_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ProjectsApi->createProjectServiceAccount: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **project_id** | **string**| The ID of the project. | |
| **project_service_account_create_request** | [**\OpenAPI\Client\Model\ProjectServiceAccountCreateRequest**](../Model/ProjectServiceAccountCreateRequest.md)| The project service account create request payload. | |

### Return type

[**\OpenAPI\Client\Model\ProjectServiceAccountCreateResponse**](../Model/ProjectServiceAccountCreateResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `createProjectUser()`

```php
createProjectUser($project_id, $project_user_create_request): \OpenAPI\Client\Model\ProjectUser
```

Adds a user to the project. Users must already be members of the organization to be added to a project.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ProjectsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$project_id = 'project_id_example'; // string | The ID of the project.
$project_user_create_request = new \OpenAPI\Client\Model\ProjectUserCreateRequest(); // \OpenAPI\Client\Model\ProjectUserCreateRequest | The project user create request payload.

try {
    $result = $apiInstance->createProjectUser($project_id, $project_user_create_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ProjectsApi->createProjectUser: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **project_id** | **string**| The ID of the project. | |
| **project_user_create_request** | [**\OpenAPI\Client\Model\ProjectUserCreateRequest**](../Model/ProjectUserCreateRequest.md)| The project user create request payload. | |

### Return type

[**\OpenAPI\Client\Model\ProjectUser**](../Model/ProjectUser.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `deleteProjectApiKey()`

```php
deleteProjectApiKey($project_id, $key_id): \OpenAPI\Client\Model\ProjectApiKeyDeleteResponse
```

Deletes an API key from the project.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ProjectsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$project_id = 'project_id_example'; // string | The ID of the project.
$key_id = 'key_id_example'; // string | The ID of the API key.

try {
    $result = $apiInstance->deleteProjectApiKey($project_id, $key_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ProjectsApi->deleteProjectApiKey: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **project_id** | **string**| The ID of the project. | |
| **key_id** | **string**| The ID of the API key. | |

### Return type

[**\OpenAPI\Client\Model\ProjectApiKeyDeleteResponse**](../Model/ProjectApiKeyDeleteResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `deleteProjectServiceAccount()`

```php
deleteProjectServiceAccount($project_id, $service_account_id): \OpenAPI\Client\Model\ProjectServiceAccountDeleteResponse
```

Deletes a service account from the project.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ProjectsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$project_id = 'project_id_example'; // string | The ID of the project.
$service_account_id = 'service_account_id_example'; // string | The ID of the service account.

try {
    $result = $apiInstance->deleteProjectServiceAccount($project_id, $service_account_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ProjectsApi->deleteProjectServiceAccount: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **project_id** | **string**| The ID of the project. | |
| **service_account_id** | **string**| The ID of the service account. | |

### Return type

[**\OpenAPI\Client\Model\ProjectServiceAccountDeleteResponse**](../Model/ProjectServiceAccountDeleteResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `deleteProjectUser()`

```php
deleteProjectUser($project_id, $user_id): \OpenAPI\Client\Model\ProjectUserDeleteResponse
```

Deletes a user from the project.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ProjectsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$project_id = 'project_id_example'; // string | The ID of the project.
$user_id = 'user_id_example'; // string | The ID of the user.

try {
    $result = $apiInstance->deleteProjectUser($project_id, $user_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ProjectsApi->deleteProjectUser: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **project_id** | **string**| The ID of the project. | |
| **user_id** | **string**| The ID of the user. | |

### Return type

[**\OpenAPI\Client\Model\ProjectUserDeleteResponse**](../Model/ProjectUserDeleteResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `listProjectApiKeys()`

```php
listProjectApiKeys($project_id, $limit, $after): \OpenAPI\Client\Model\ProjectApiKeyListResponse
```

Returns a list of API keys in the project.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ProjectsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$project_id = 'project_id_example'; // string | The ID of the project.
$limit = 20; // int | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.
$after = 'after_example'; // string | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.

try {
    $result = $apiInstance->listProjectApiKeys($project_id, $limit, $after);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ProjectsApi->listProjectApiKeys: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **project_id** | **string**| The ID of the project. | |
| **limit** | **int**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. | [optional] [default to 20] |
| **after** | **string**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. | [optional] |

### Return type

[**\OpenAPI\Client\Model\ProjectApiKeyListResponse**](../Model/ProjectApiKeyListResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `listProjectRateLimits()`

```php
listProjectRateLimits($project_id, $limit, $after, $before): \OpenAPI\Client\Model\ProjectRateLimitListResponse
```

Returns the rate limits per model for a project.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ProjectsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$project_id = 'project_id_example'; // string | The ID of the project.
$limit = 100; // int | A limit on the number of objects to be returned. The default is 100.
$after = 'after_example'; // string | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.
$before = 'before_example'; // string | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, beginning with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.

try {
    $result = $apiInstance->listProjectRateLimits($project_id, $limit, $after, $before);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ProjectsApi->listProjectRateLimits: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **project_id** | **string**| The ID of the project. | |
| **limit** | **int**| A limit on the number of objects to be returned. The default is 100. | [optional] [default to 100] |
| **after** | **string**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. | [optional] |
| **before** | **string**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, beginning with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. | [optional] |

### Return type

[**\OpenAPI\Client\Model\ProjectRateLimitListResponse**](../Model/ProjectRateLimitListResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `listProjectServiceAccounts()`

```php
listProjectServiceAccounts($project_id, $limit, $after): \OpenAPI\Client\Model\ProjectServiceAccountListResponse
```

Returns a list of service accounts in the project.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ProjectsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$project_id = 'project_id_example'; // string | The ID of the project.
$limit = 20; // int | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.
$after = 'after_example'; // string | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.

try {
    $result = $apiInstance->listProjectServiceAccounts($project_id, $limit, $after);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ProjectsApi->listProjectServiceAccounts: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **project_id** | **string**| The ID of the project. | |
| **limit** | **int**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. | [optional] [default to 20] |
| **after** | **string**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. | [optional] |

### Return type

[**\OpenAPI\Client\Model\ProjectServiceAccountListResponse**](../Model/ProjectServiceAccountListResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `listProjectUsers()`

```php
listProjectUsers($project_id, $limit, $after): \OpenAPI\Client\Model\ProjectUserListResponse
```

Returns a list of users in the project.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ProjectsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$project_id = 'project_id_example'; // string | The ID of the project.
$limit = 20; // int | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.
$after = 'after_example'; // string | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.

try {
    $result = $apiInstance->listProjectUsers($project_id, $limit, $after);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ProjectsApi->listProjectUsers: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **project_id** | **string**| The ID of the project. | |
| **limit** | **int**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. | [optional] [default to 20] |
| **after** | **string**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. | [optional] |

### Return type

[**\OpenAPI\Client\Model\ProjectUserListResponse**](../Model/ProjectUserListResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `listProjects()`

```php
listProjects($limit, $after, $include_archived): \OpenAPI\Client\Model\ProjectListResponse
```

Returns a list of projects.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ProjectsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$limit = 20; // int | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.
$after = 'after_example'; // string | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.
$include_archived = false; // bool | If `true` returns all projects including those that have been `archived`. Archived projects are not included by default.

try {
    $result = $apiInstance->listProjects($limit, $after, $include_archived);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ProjectsApi->listProjects: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **limit** | **int**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. | [optional] [default to 20] |
| **after** | **string**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. | [optional] |
| **include_archived** | **bool**| If &#x60;true&#x60; returns all projects including those that have been &#x60;archived&#x60;. Archived projects are not included by default. | [optional] [default to false] |

### Return type

[**\OpenAPI\Client\Model\ProjectListResponse**](../Model/ProjectListResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modifyProject()`

```php
modifyProject($project_id, $project_update_request): \OpenAPI\Client\Model\Project
```

Modifies a project in the organization.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ProjectsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$project_id = 'project_id_example'; // string | The ID of the project.
$project_update_request = new \OpenAPI\Client\Model\ProjectUpdateRequest(); // \OpenAPI\Client\Model\ProjectUpdateRequest | The project update request payload.

try {
    $result = $apiInstance->modifyProject($project_id, $project_update_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ProjectsApi->modifyProject: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **project_id** | **string**| The ID of the project. | |
| **project_update_request** | [**\OpenAPI\Client\Model\ProjectUpdateRequest**](../Model/ProjectUpdateRequest.md)| The project update request payload. | |

### Return type

[**\OpenAPI\Client\Model\Project**](../Model/Project.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modifyProjectUser()`

```php
modifyProjectUser($project_id, $user_id, $project_user_update_request): \OpenAPI\Client\Model\ProjectUser
```

Modifies a user's role in the project.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ProjectsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$project_id = 'project_id_example'; // string | The ID of the project.
$user_id = 'user_id_example'; // string | The ID of the user.
$project_user_update_request = new \OpenAPI\Client\Model\ProjectUserUpdateRequest(); // \OpenAPI\Client\Model\ProjectUserUpdateRequest | The project user update request payload.

try {
    $result = $apiInstance->modifyProjectUser($project_id, $user_id, $project_user_update_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ProjectsApi->modifyProjectUser: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **project_id** | **string**| The ID of the project. | |
| **user_id** | **string**| The ID of the user. | |
| **project_user_update_request** | [**\OpenAPI\Client\Model\ProjectUserUpdateRequest**](../Model/ProjectUserUpdateRequest.md)| The project user update request payload. | |

### Return type

[**\OpenAPI\Client\Model\ProjectUser**](../Model/ProjectUser.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `retrieveProject()`

```php
retrieveProject($project_id): \OpenAPI\Client\Model\Project
```

Retrieves a project.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ProjectsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$project_id = 'project_id_example'; // string | The ID of the project.

try {
    $result = $apiInstance->retrieveProject($project_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ProjectsApi->retrieveProject: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **project_id** | **string**| The ID of the project. | |

### Return type

[**\OpenAPI\Client\Model\Project**](../Model/Project.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `retrieveProjectApiKey()`

```php
retrieveProjectApiKey($project_id, $key_id): \OpenAPI\Client\Model\ProjectApiKey
```

Retrieves an API key in the project.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ProjectsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$project_id = 'project_id_example'; // string | The ID of the project.
$key_id = 'key_id_example'; // string | The ID of the API key.

try {
    $result = $apiInstance->retrieveProjectApiKey($project_id, $key_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ProjectsApi->retrieveProjectApiKey: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **project_id** | **string**| The ID of the project. | |
| **key_id** | **string**| The ID of the API key. | |

### Return type

[**\OpenAPI\Client\Model\ProjectApiKey**](../Model/ProjectApiKey.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `retrieveProjectServiceAccount()`

```php
retrieveProjectServiceAccount($project_id, $service_account_id): \OpenAPI\Client\Model\ProjectServiceAccount
```

Retrieves a service account in the project.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ProjectsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$project_id = 'project_id_example'; // string | The ID of the project.
$service_account_id = 'service_account_id_example'; // string | The ID of the service account.

try {
    $result = $apiInstance->retrieveProjectServiceAccount($project_id, $service_account_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ProjectsApi->retrieveProjectServiceAccount: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **project_id** | **string**| The ID of the project. | |
| **service_account_id** | **string**| The ID of the service account. | |

### Return type

[**\OpenAPI\Client\Model\ProjectServiceAccount**](../Model/ProjectServiceAccount.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `retrieveProjectUser()`

```php
retrieveProjectUser($project_id, $user_id): \OpenAPI\Client\Model\ProjectUser
```

Retrieves a user in the project.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ProjectsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$project_id = 'project_id_example'; // string | The ID of the project.
$user_id = 'user_id_example'; // string | The ID of the user.

try {
    $result = $apiInstance->retrieveProjectUser($project_id, $user_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ProjectsApi->retrieveProjectUser: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **project_id** | **string**| The ID of the project. | |
| **user_id** | **string**| The ID of the user. | |

### Return type

[**\OpenAPI\Client\Model\ProjectUser**](../Model/ProjectUser.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `updateProjectRateLimits()`

```php
updateProjectRateLimits($project_id, $rate_limit_id, $project_rate_limit_update_request): \OpenAPI\Client\Model\ProjectRateLimit
```

Updates a project rate limit.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ProjectsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$project_id = 'project_id_example'; // string | The ID of the project.
$rate_limit_id = 'rate_limit_id_example'; // string | The ID of the rate limit.
$project_rate_limit_update_request = new \OpenAPI\Client\Model\ProjectRateLimitUpdateRequest(); // \OpenAPI\Client\Model\ProjectRateLimitUpdateRequest | The project rate limit update request payload.

try {
    $result = $apiInstance->updateProjectRateLimits($project_id, $rate_limit_id, $project_rate_limit_update_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ProjectsApi->updateProjectRateLimits: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **project_id** | **string**| The ID of the project. | |
| **rate_limit_id** | **string**| The ID of the rate limit. | |
| **project_rate_limit_update_request** | [**\OpenAPI\Client\Model\ProjectRateLimitUpdateRequest**](../Model/ProjectRateLimitUpdateRequest.md)| The project rate limit update request payload. | |

### Return type

[**\OpenAPI\Client\Model\ProjectRateLimit**](../Model/ProjectRateLimit.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
