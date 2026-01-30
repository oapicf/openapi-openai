# OpenAPI\Server\Api\ProjectsApiInterface

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**archiveProject**](ProjectsApiInterface.md#archiveProject) | **POST** /organization/projects/{project_id}/archive | Archives a project in the organization. Archived projects cannot be used or updated.
[**createProject**](ProjectsApiInterface.md#createProject) | **POST** /organization/projects | Create a new project in the organization. Projects can be created and archived, but cannot be deleted.
[**createProjectServiceAccount**](ProjectsApiInterface.md#createProjectServiceAccount) | **POST** /organization/projects/{project_id}/service_accounts | Creates a new service account in the project. This also returns an unredacted API key for the service account.
[**createProjectUser**](ProjectsApiInterface.md#createProjectUser) | **POST** /organization/projects/{project_id}/users | Adds a user to the project. Users must already be members of the organization to be added to a project.
[**deleteProjectApiKey**](ProjectsApiInterface.md#deleteProjectApiKey) | **DELETE** /organization/projects/{project_id}/api_keys/{key_id} | Deletes an API key from the project.
[**deleteProjectServiceAccount**](ProjectsApiInterface.md#deleteProjectServiceAccount) | **DELETE** /organization/projects/{project_id}/service_accounts/{service_account_id} | Deletes a service account from the project.
[**deleteProjectUser**](ProjectsApiInterface.md#deleteProjectUser) | **DELETE** /organization/projects/{project_id}/users/{user_id} | Deletes a user from the project.
[**listProjectApiKeys**](ProjectsApiInterface.md#listProjectApiKeys) | **GET** /organization/projects/{project_id}/api_keys | Returns a list of API keys in the project.
[**listProjectRateLimits**](ProjectsApiInterface.md#listProjectRateLimits) | **GET** /organization/projects/{project_id}/rate_limits | Returns the rate limits per model for a project.
[**listProjectServiceAccounts**](ProjectsApiInterface.md#listProjectServiceAccounts) | **GET** /organization/projects/{project_id}/service_accounts | Returns a list of service accounts in the project.
[**listProjectUsers**](ProjectsApiInterface.md#listProjectUsers) | **GET** /organization/projects/{project_id}/users | Returns a list of users in the project.
[**listProjects**](ProjectsApiInterface.md#listProjects) | **GET** /organization/projects | Returns a list of projects.
[**modifyProject**](ProjectsApiInterface.md#modifyProject) | **POST** /organization/projects/{project_id} | Modifies a project in the organization.
[**modifyProjectUser**](ProjectsApiInterface.md#modifyProjectUser) | **POST** /organization/projects/{project_id}/users/{user_id} | Modifies a user&#39;s role in the project.
[**retrieveProject**](ProjectsApiInterface.md#retrieveProject) | **GET** /organization/projects/{project_id} | Retrieves a project.
[**retrieveProjectApiKey**](ProjectsApiInterface.md#retrieveProjectApiKey) | **GET** /organization/projects/{project_id}/api_keys/{key_id} | Retrieves an API key in the project.
[**retrieveProjectServiceAccount**](ProjectsApiInterface.md#retrieveProjectServiceAccount) | **GET** /organization/projects/{project_id}/service_accounts/{service_account_id} | Retrieves a service account in the project.
[**retrieveProjectUser**](ProjectsApiInterface.md#retrieveProjectUser) | **GET** /organization/projects/{project_id}/users/{user_id} | Retrieves a user in the project.
[**updateProjectRateLimits**](ProjectsApiInterface.md#updateProjectRateLimits) | **POST** /organization/projects/{project_id}/rate_limits/{rate_limit_id} | Updates a project rate limit.


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\ProjectsApi:
        tags:
            - { name: "open_api_server.api", api: "projects" }
    # ...
```

## **archiveProject**
> OpenAPI\Server\Model\Project archiveProject($projectId)

Archives a project in the organization. Archived projects cannot be used or updated.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ProjectsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ProjectsApiInterface;

class ProjectsApi implements ProjectsApiInterface
{

    // ...

    /**
     * Implementation of ProjectsApiInterface#archiveProject
     */
    public function archiveProject(string $projectId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **string**| The ID of the project. |

### Return type

[**OpenAPI\Server\Model\Project**](../Model/Project.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **createProject**
> OpenAPI\Server\Model\Project createProject($projectCreateRequest)

Create a new project in the organization. Projects can be created and archived, but cannot be deleted.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ProjectsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ProjectsApiInterface;

class ProjectsApi implements ProjectsApiInterface
{

    // ...

    /**
     * Implementation of ProjectsApiInterface#createProject
     */
    public function createProject(ProjectCreateRequest $projectCreateRequest, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectCreateRequest** | [**OpenAPI\Server\Model\ProjectCreateRequest**](../Model/ProjectCreateRequest.md)| The project create request payload. |

### Return type

[**OpenAPI\Server\Model\Project**](../Model/Project.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **createProjectServiceAccount**
> OpenAPI\Server\Model\ProjectServiceAccountCreateResponse createProjectServiceAccount($projectId, $projectServiceAccountCreateRequest)

Creates a new service account in the project. This also returns an unredacted API key for the service account.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ProjectsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ProjectsApiInterface;

class ProjectsApi implements ProjectsApiInterface
{

    // ...

    /**
     * Implementation of ProjectsApiInterface#createProjectServiceAccount
     */
    public function createProjectServiceAccount(string $projectId, ProjectServiceAccountCreateRequest $projectServiceAccountCreateRequest, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **string**| The ID of the project. |
 **projectServiceAccountCreateRequest** | [**OpenAPI\Server\Model\ProjectServiceAccountCreateRequest**](../Model/ProjectServiceAccountCreateRequest.md)| The project service account create request payload. |

### Return type

[**OpenAPI\Server\Model\ProjectServiceAccountCreateResponse**](../Model/ProjectServiceAccountCreateResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **createProjectUser**
> OpenAPI\Server\Model\ProjectUser createProjectUser($projectId, $projectUserCreateRequest)

Adds a user to the project. Users must already be members of the organization to be added to a project.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ProjectsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ProjectsApiInterface;

class ProjectsApi implements ProjectsApiInterface
{

    // ...

    /**
     * Implementation of ProjectsApiInterface#createProjectUser
     */
    public function createProjectUser(string $projectId, ProjectUserCreateRequest $projectUserCreateRequest, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **string**| The ID of the project. |
 **projectUserCreateRequest** | [**OpenAPI\Server\Model\ProjectUserCreateRequest**](../Model/ProjectUserCreateRequest.md)| The project user create request payload. |

### Return type

[**OpenAPI\Server\Model\ProjectUser**](../Model/ProjectUser.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **deleteProjectApiKey**
> OpenAPI\Server\Model\ProjectApiKeyDeleteResponse deleteProjectApiKey($projectId, $keyId)

Deletes an API key from the project.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ProjectsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ProjectsApiInterface;

class ProjectsApi implements ProjectsApiInterface
{

    // ...

    /**
     * Implementation of ProjectsApiInterface#deleteProjectApiKey
     */
    public function deleteProjectApiKey(string $projectId, string $keyId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **string**| The ID of the project. |
 **keyId** | **string**| The ID of the API key. |

### Return type

[**OpenAPI\Server\Model\ProjectApiKeyDeleteResponse**](../Model/ProjectApiKeyDeleteResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **deleteProjectServiceAccount**
> OpenAPI\Server\Model\ProjectServiceAccountDeleteResponse deleteProjectServiceAccount($projectId, $serviceAccountId)

Deletes a service account from the project.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ProjectsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ProjectsApiInterface;

class ProjectsApi implements ProjectsApiInterface
{

    // ...

    /**
     * Implementation of ProjectsApiInterface#deleteProjectServiceAccount
     */
    public function deleteProjectServiceAccount(string $projectId, string $serviceAccountId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **string**| The ID of the project. |
 **serviceAccountId** | **string**| The ID of the service account. |

### Return type

[**OpenAPI\Server\Model\ProjectServiceAccountDeleteResponse**](../Model/ProjectServiceAccountDeleteResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **deleteProjectUser**
> OpenAPI\Server\Model\ProjectUserDeleteResponse deleteProjectUser($projectId, $userId)

Deletes a user from the project.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ProjectsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ProjectsApiInterface;

class ProjectsApi implements ProjectsApiInterface
{

    // ...

    /**
     * Implementation of ProjectsApiInterface#deleteProjectUser
     */
    public function deleteProjectUser(string $projectId, string $userId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **string**| The ID of the project. |
 **userId** | **string**| The ID of the user. |

### Return type

[**OpenAPI\Server\Model\ProjectUserDeleteResponse**](../Model/ProjectUserDeleteResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **listProjectApiKeys**
> OpenAPI\Server\Model\ProjectApiKeyListResponse listProjectApiKeys($projectId, $limit, $after)

Returns a list of API keys in the project.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ProjectsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ProjectsApiInterface;

class ProjectsApi implements ProjectsApiInterface
{

    // ...

    /**
     * Implementation of ProjectsApiInterface#listProjectApiKeys
     */
    public function listProjectApiKeys(string $projectId, int $limit, ?string $after, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **string**| The ID of the project. |
 **limit** | **int**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. | [optional] [default to 20]
 **after** | **string**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. | [optional]

### Return type

[**OpenAPI\Server\Model\ProjectApiKeyListResponse**](../Model/ProjectApiKeyListResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **listProjectRateLimits**
> OpenAPI\Server\Model\ProjectRateLimitListResponse listProjectRateLimits($projectId, $limit, $after, $before)

Returns the rate limits per model for a project.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ProjectsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ProjectsApiInterface;

class ProjectsApi implements ProjectsApiInterface
{

    // ...

    /**
     * Implementation of ProjectsApiInterface#listProjectRateLimits
     */
    public function listProjectRateLimits(string $projectId, int $limit, ?string $after, ?string $before, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **string**| The ID of the project. |
 **limit** | **int**| A limit on the number of objects to be returned. The default is 100. | [optional] [default to 100]
 **after** | **string**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. | [optional]
 **before** | **string**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, beginning with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. | [optional]

### Return type

[**OpenAPI\Server\Model\ProjectRateLimitListResponse**](../Model/ProjectRateLimitListResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **listProjectServiceAccounts**
> OpenAPI\Server\Model\ProjectServiceAccountListResponse listProjectServiceAccounts($projectId, $limit, $after)

Returns a list of service accounts in the project.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ProjectsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ProjectsApiInterface;

class ProjectsApi implements ProjectsApiInterface
{

    // ...

    /**
     * Implementation of ProjectsApiInterface#listProjectServiceAccounts
     */
    public function listProjectServiceAccounts(string $projectId, int $limit, ?string $after, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **string**| The ID of the project. |
 **limit** | **int**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. | [optional] [default to 20]
 **after** | **string**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. | [optional]

### Return type

[**OpenAPI\Server\Model\ProjectServiceAccountListResponse**](../Model/ProjectServiceAccountListResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **listProjectUsers**
> OpenAPI\Server\Model\ProjectUserListResponse listProjectUsers($projectId, $limit, $after)

Returns a list of users in the project.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ProjectsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ProjectsApiInterface;

class ProjectsApi implements ProjectsApiInterface
{

    // ...

    /**
     * Implementation of ProjectsApiInterface#listProjectUsers
     */
    public function listProjectUsers(string $projectId, int $limit, ?string $after, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **string**| The ID of the project. |
 **limit** | **int**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. | [optional] [default to 20]
 **after** | **string**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. | [optional]

### Return type

[**OpenAPI\Server\Model\ProjectUserListResponse**](../Model/ProjectUserListResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **listProjects**
> OpenAPI\Server\Model\ProjectListResponse listProjects($limit, $after, $includeArchived)

Returns a list of projects.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ProjectsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ProjectsApiInterface;

class ProjectsApi implements ProjectsApiInterface
{

    // ...

    /**
     * Implementation of ProjectsApiInterface#listProjects
     */
    public function listProjects(int $limit, ?string $after, bool $includeArchived, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. | [optional] [default to 20]
 **after** | **string**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. | [optional]
 **includeArchived** | **bool**| If &#x60;true&#x60; returns all projects including those that have been &#x60;archived&#x60;. Archived projects are not included by default. | [optional] [default to false]

### Return type

[**OpenAPI\Server\Model\ProjectListResponse**](../Model/ProjectListResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **modifyProject**
> OpenAPI\Server\Model\Project modifyProject($projectId, $projectUpdateRequest)

Modifies a project in the organization.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ProjectsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ProjectsApiInterface;

class ProjectsApi implements ProjectsApiInterface
{

    // ...

    /**
     * Implementation of ProjectsApiInterface#modifyProject
     */
    public function modifyProject(string $projectId, ProjectUpdateRequest $projectUpdateRequest, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **string**| The ID of the project. |
 **projectUpdateRequest** | [**OpenAPI\Server\Model\ProjectUpdateRequest**](../Model/ProjectUpdateRequest.md)| The project update request payload. |

### Return type

[**OpenAPI\Server\Model\Project**](../Model/Project.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **modifyProjectUser**
> OpenAPI\Server\Model\ProjectUser modifyProjectUser($projectId, $userId, $projectUserUpdateRequest)

Modifies a user's role in the project.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ProjectsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ProjectsApiInterface;

class ProjectsApi implements ProjectsApiInterface
{

    // ...

    /**
     * Implementation of ProjectsApiInterface#modifyProjectUser
     */
    public function modifyProjectUser(string $projectId, string $userId, ProjectUserUpdateRequest $projectUserUpdateRequest, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **string**| The ID of the project. |
 **userId** | **string**| The ID of the user. |
 **projectUserUpdateRequest** | [**OpenAPI\Server\Model\ProjectUserUpdateRequest**](../Model/ProjectUserUpdateRequest.md)| The project user update request payload. |

### Return type

[**OpenAPI\Server\Model\ProjectUser**](../Model/ProjectUser.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **retrieveProject**
> OpenAPI\Server\Model\Project retrieveProject($projectId)

Retrieves a project.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ProjectsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ProjectsApiInterface;

class ProjectsApi implements ProjectsApiInterface
{

    // ...

    /**
     * Implementation of ProjectsApiInterface#retrieveProject
     */
    public function retrieveProject(string $projectId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **string**| The ID of the project. |

### Return type

[**OpenAPI\Server\Model\Project**](../Model/Project.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **retrieveProjectApiKey**
> OpenAPI\Server\Model\ProjectApiKey retrieveProjectApiKey($projectId, $keyId)

Retrieves an API key in the project.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ProjectsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ProjectsApiInterface;

class ProjectsApi implements ProjectsApiInterface
{

    // ...

    /**
     * Implementation of ProjectsApiInterface#retrieveProjectApiKey
     */
    public function retrieveProjectApiKey(string $projectId, string $keyId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **string**| The ID of the project. |
 **keyId** | **string**| The ID of the API key. |

### Return type

[**OpenAPI\Server\Model\ProjectApiKey**](../Model/ProjectApiKey.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **retrieveProjectServiceAccount**
> OpenAPI\Server\Model\ProjectServiceAccount retrieveProjectServiceAccount($projectId, $serviceAccountId)

Retrieves a service account in the project.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ProjectsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ProjectsApiInterface;

class ProjectsApi implements ProjectsApiInterface
{

    // ...

    /**
     * Implementation of ProjectsApiInterface#retrieveProjectServiceAccount
     */
    public function retrieveProjectServiceAccount(string $projectId, string $serviceAccountId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **string**| The ID of the project. |
 **serviceAccountId** | **string**| The ID of the service account. |

### Return type

[**OpenAPI\Server\Model\ProjectServiceAccount**](../Model/ProjectServiceAccount.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **retrieveProjectUser**
> OpenAPI\Server\Model\ProjectUser retrieveProjectUser($projectId, $userId)

Retrieves a user in the project.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ProjectsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ProjectsApiInterface;

class ProjectsApi implements ProjectsApiInterface
{

    // ...

    /**
     * Implementation of ProjectsApiInterface#retrieveProjectUser
     */
    public function retrieveProjectUser(string $projectId, string $userId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **string**| The ID of the project. |
 **userId** | **string**| The ID of the user. |

### Return type

[**OpenAPI\Server\Model\ProjectUser**](../Model/ProjectUser.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **updateProjectRateLimits**
> OpenAPI\Server\Model\ProjectRateLimit updateProjectRateLimits($projectId, $rateLimitId, $projectRateLimitUpdateRequest)

Updates a project rate limit.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ProjectsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ProjectsApiInterface;

class ProjectsApi implements ProjectsApiInterface
{

    // ...

    /**
     * Implementation of ProjectsApiInterface#updateProjectRateLimits
     */
    public function updateProjectRateLimits(string $projectId, string $rateLimitId, ProjectRateLimitUpdateRequest $projectRateLimitUpdateRequest, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **string**| The ID of the project. |
 **rateLimitId** | **string**| The ID of the rate limit. |
 **projectRateLimitUpdateRequest** | [**OpenAPI\Server\Model\ProjectRateLimitUpdateRequest**](../Model/ProjectRateLimitUpdateRequest.md)| The project rate limit update request payload. |

### Return type

[**OpenAPI\Server\Model\ProjectRateLimit**](../Model/ProjectRateLimit.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

