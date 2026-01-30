# OpenapiOpenai.ProjectsApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**archiveProject**](ProjectsApi.md#archiveProject) | **POST** /organization/projects/{project_id}/archive | Archives a project in the organization. Archived projects cannot be used or updated.
[**createProject**](ProjectsApi.md#createProject) | **POST** /organization/projects | Create a new project in the organization. Projects can be created and archived, but cannot be deleted.
[**createProjectServiceAccount**](ProjectsApi.md#createProjectServiceAccount) | **POST** /organization/projects/{project_id}/service_accounts | Creates a new service account in the project. This also returns an unredacted API key for the service account.
[**createProjectUser**](ProjectsApi.md#createProjectUser) | **POST** /organization/projects/{project_id}/users | Adds a user to the project. Users must already be members of the organization to be added to a project.
[**deleteProjectApiKey**](ProjectsApi.md#deleteProjectApiKey) | **DELETE** /organization/projects/{project_id}/api_keys/{key_id} | Deletes an API key from the project.
[**deleteProjectServiceAccount**](ProjectsApi.md#deleteProjectServiceAccount) | **DELETE** /organization/projects/{project_id}/service_accounts/{service_account_id} | Deletes a service account from the project.
[**deleteProjectUser**](ProjectsApi.md#deleteProjectUser) | **DELETE** /organization/projects/{project_id}/users/{user_id} | Deletes a user from the project.
[**listProjectApiKeys**](ProjectsApi.md#listProjectApiKeys) | **GET** /organization/projects/{project_id}/api_keys | Returns a list of API keys in the project.
[**listProjectRateLimits**](ProjectsApi.md#listProjectRateLimits) | **GET** /organization/projects/{project_id}/rate_limits | Returns the rate limits per model for a project.
[**listProjectServiceAccounts**](ProjectsApi.md#listProjectServiceAccounts) | **GET** /organization/projects/{project_id}/service_accounts | Returns a list of service accounts in the project.
[**listProjectUsers**](ProjectsApi.md#listProjectUsers) | **GET** /organization/projects/{project_id}/users | Returns a list of users in the project.
[**listProjects**](ProjectsApi.md#listProjects) | **GET** /organization/projects | Returns a list of projects.
[**modifyProject**](ProjectsApi.md#modifyProject) | **POST** /organization/projects/{project_id} | Modifies a project in the organization.
[**modifyProjectUser**](ProjectsApi.md#modifyProjectUser) | **POST** /organization/projects/{project_id}/users/{user_id} | Modifies a user&#39;s role in the project.
[**retrieveProject**](ProjectsApi.md#retrieveProject) | **GET** /organization/projects/{project_id} | Retrieves a project.
[**retrieveProjectApiKey**](ProjectsApi.md#retrieveProjectApiKey) | **GET** /organization/projects/{project_id}/api_keys/{key_id} | Retrieves an API key in the project.
[**retrieveProjectServiceAccount**](ProjectsApi.md#retrieveProjectServiceAccount) | **GET** /organization/projects/{project_id}/service_accounts/{service_account_id} | Retrieves a service account in the project.
[**retrieveProjectUser**](ProjectsApi.md#retrieveProjectUser) | **GET** /organization/projects/{project_id}/users/{user_id} | Retrieves a user in the project.
[**updateProjectRateLimits**](ProjectsApi.md#updateProjectRateLimits) | **POST** /organization/projects/{project_id}/rate_limits/{rate_limit_id} | Updates a project rate limit.



## archiveProject

> Project archiveProject(projectId)

Archives a project in the organization. Archived projects cannot be used or updated.

### Example

```javascript
import OpenapiOpenai from 'openapi_openai';
let defaultClient = OpenapiOpenai.ApiClient.instance;
// Configure Bearer access token for authorization: ApiKeyAuth
let ApiKeyAuth = defaultClient.authentications['ApiKeyAuth'];
ApiKeyAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new OpenapiOpenai.ProjectsApi();
let projectId = "projectId_example"; // String | The ID of the project.
apiInstance.archiveProject(projectId, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| The ID of the project. | 

### Return type

[**Project**](Project.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## createProject

> Project createProject(projectCreateRequest)

Create a new project in the organization. Projects can be created and archived, but cannot be deleted.

### Example

```javascript
import OpenapiOpenai from 'openapi_openai';
let defaultClient = OpenapiOpenai.ApiClient.instance;
// Configure Bearer access token for authorization: ApiKeyAuth
let ApiKeyAuth = defaultClient.authentications['ApiKeyAuth'];
ApiKeyAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new OpenapiOpenai.ProjectsApi();
let projectCreateRequest = new OpenapiOpenai.ProjectCreateRequest(); // ProjectCreateRequest | The project create request payload.
apiInstance.createProject(projectCreateRequest, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectCreateRequest** | [**ProjectCreateRequest**](ProjectCreateRequest.md)| The project create request payload. | 

### Return type

[**Project**](Project.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## createProjectServiceAccount

> ProjectServiceAccountCreateResponse createProjectServiceAccount(projectId, projectServiceAccountCreateRequest)

Creates a new service account in the project. This also returns an unredacted API key for the service account.

### Example

```javascript
import OpenapiOpenai from 'openapi_openai';
let defaultClient = OpenapiOpenai.ApiClient.instance;
// Configure Bearer access token for authorization: ApiKeyAuth
let ApiKeyAuth = defaultClient.authentications['ApiKeyAuth'];
ApiKeyAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new OpenapiOpenai.ProjectsApi();
let projectId = "projectId_example"; // String | The ID of the project.
let projectServiceAccountCreateRequest = new OpenapiOpenai.ProjectServiceAccountCreateRequest(); // ProjectServiceAccountCreateRequest | The project service account create request payload.
apiInstance.createProjectServiceAccount(projectId, projectServiceAccountCreateRequest, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| The ID of the project. | 
 **projectServiceAccountCreateRequest** | [**ProjectServiceAccountCreateRequest**](ProjectServiceAccountCreateRequest.md)| The project service account create request payload. | 

### Return type

[**ProjectServiceAccountCreateResponse**](ProjectServiceAccountCreateResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## createProjectUser

> ProjectUser createProjectUser(projectId, projectUserCreateRequest)

Adds a user to the project. Users must already be members of the organization to be added to a project.

### Example

```javascript
import OpenapiOpenai from 'openapi_openai';
let defaultClient = OpenapiOpenai.ApiClient.instance;
// Configure Bearer access token for authorization: ApiKeyAuth
let ApiKeyAuth = defaultClient.authentications['ApiKeyAuth'];
ApiKeyAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new OpenapiOpenai.ProjectsApi();
let projectId = "projectId_example"; // String | The ID of the project.
let projectUserCreateRequest = new OpenapiOpenai.ProjectUserCreateRequest(); // ProjectUserCreateRequest | The project user create request payload.
apiInstance.createProjectUser(projectId, projectUserCreateRequest, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| The ID of the project. | 
 **projectUserCreateRequest** | [**ProjectUserCreateRequest**](ProjectUserCreateRequest.md)| The project user create request payload. | 

### Return type

[**ProjectUser**](ProjectUser.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## deleteProjectApiKey

> ProjectApiKeyDeleteResponse deleteProjectApiKey(projectId, keyId)

Deletes an API key from the project.

### Example

```javascript
import OpenapiOpenai from 'openapi_openai';
let defaultClient = OpenapiOpenai.ApiClient.instance;
// Configure Bearer access token for authorization: ApiKeyAuth
let ApiKeyAuth = defaultClient.authentications['ApiKeyAuth'];
ApiKeyAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new OpenapiOpenai.ProjectsApi();
let projectId = "projectId_example"; // String | The ID of the project.
let keyId = "keyId_example"; // String | The ID of the API key.
apiInstance.deleteProjectApiKey(projectId, keyId, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| The ID of the project. | 
 **keyId** | **String**| The ID of the API key. | 

### Return type

[**ProjectApiKeyDeleteResponse**](ProjectApiKeyDeleteResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## deleteProjectServiceAccount

> ProjectServiceAccountDeleteResponse deleteProjectServiceAccount(projectId, serviceAccountId)

Deletes a service account from the project.

### Example

```javascript
import OpenapiOpenai from 'openapi_openai';
let defaultClient = OpenapiOpenai.ApiClient.instance;
// Configure Bearer access token for authorization: ApiKeyAuth
let ApiKeyAuth = defaultClient.authentications['ApiKeyAuth'];
ApiKeyAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new OpenapiOpenai.ProjectsApi();
let projectId = "projectId_example"; // String | The ID of the project.
let serviceAccountId = "serviceAccountId_example"; // String | The ID of the service account.
apiInstance.deleteProjectServiceAccount(projectId, serviceAccountId, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| The ID of the project. | 
 **serviceAccountId** | **String**| The ID of the service account. | 

### Return type

[**ProjectServiceAccountDeleteResponse**](ProjectServiceAccountDeleteResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## deleteProjectUser

> ProjectUserDeleteResponse deleteProjectUser(projectId, userId)

Deletes a user from the project.

### Example

```javascript
import OpenapiOpenai from 'openapi_openai';
let defaultClient = OpenapiOpenai.ApiClient.instance;
// Configure Bearer access token for authorization: ApiKeyAuth
let ApiKeyAuth = defaultClient.authentications['ApiKeyAuth'];
ApiKeyAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new OpenapiOpenai.ProjectsApi();
let projectId = "projectId_example"; // String | The ID of the project.
let userId = "userId_example"; // String | The ID of the user.
apiInstance.deleteProjectUser(projectId, userId, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| The ID of the project. | 
 **userId** | **String**| The ID of the user. | 

### Return type

[**ProjectUserDeleteResponse**](ProjectUserDeleteResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## listProjectApiKeys

> ProjectApiKeyListResponse listProjectApiKeys(projectId, opts)

Returns a list of API keys in the project.

### Example

```javascript
import OpenapiOpenai from 'openapi_openai';
let defaultClient = OpenapiOpenai.ApiClient.instance;
// Configure Bearer access token for authorization: ApiKeyAuth
let ApiKeyAuth = defaultClient.authentications['ApiKeyAuth'];
ApiKeyAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new OpenapiOpenai.ProjectsApi();
let projectId = "projectId_example"; // String | The ID of the project.
let opts = {
  'limit': 20, // Number | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
  'after': "after_example" // String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
};
apiInstance.listProjectApiKeys(projectId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| The ID of the project. | 
 **limit** | **Number**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
 **after** | **String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 

### Return type

[**ProjectApiKeyListResponse**](ProjectApiKeyListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## listProjectRateLimits

> ProjectRateLimitListResponse listProjectRateLimits(projectId, opts)

Returns the rate limits per model for a project.

### Example

```javascript
import OpenapiOpenai from 'openapi_openai';
let defaultClient = OpenapiOpenai.ApiClient.instance;
// Configure Bearer access token for authorization: ApiKeyAuth
let ApiKeyAuth = defaultClient.authentications['ApiKeyAuth'];
ApiKeyAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new OpenapiOpenai.ProjectsApi();
let projectId = "projectId_example"; // String | The ID of the project.
let opts = {
  'limit': 100, // Number | A limit on the number of objects to be returned. The default is 100. 
  'after': "after_example", // String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
  'before': "before_example" // String | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, beginning with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
};
apiInstance.listProjectRateLimits(projectId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| The ID of the project. | 
 **limit** | **Number**| A limit on the number of objects to be returned. The default is 100.  | [optional] [default to 100]
 **after** | **String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 
 **before** | **String**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, beginning with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] 

### Return type

[**ProjectRateLimitListResponse**](ProjectRateLimitListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## listProjectServiceAccounts

> ProjectServiceAccountListResponse listProjectServiceAccounts(projectId, opts)

Returns a list of service accounts in the project.

### Example

```javascript
import OpenapiOpenai from 'openapi_openai';
let defaultClient = OpenapiOpenai.ApiClient.instance;
// Configure Bearer access token for authorization: ApiKeyAuth
let ApiKeyAuth = defaultClient.authentications['ApiKeyAuth'];
ApiKeyAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new OpenapiOpenai.ProjectsApi();
let projectId = "projectId_example"; // String | The ID of the project.
let opts = {
  'limit': 20, // Number | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
  'after': "after_example" // String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
};
apiInstance.listProjectServiceAccounts(projectId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| The ID of the project. | 
 **limit** | **Number**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
 **after** | **String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 

### Return type

[**ProjectServiceAccountListResponse**](ProjectServiceAccountListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## listProjectUsers

> ProjectUserListResponse listProjectUsers(projectId, opts)

Returns a list of users in the project.

### Example

```javascript
import OpenapiOpenai from 'openapi_openai';
let defaultClient = OpenapiOpenai.ApiClient.instance;
// Configure Bearer access token for authorization: ApiKeyAuth
let ApiKeyAuth = defaultClient.authentications['ApiKeyAuth'];
ApiKeyAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new OpenapiOpenai.ProjectsApi();
let projectId = "projectId_example"; // String | The ID of the project.
let opts = {
  'limit': 20, // Number | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
  'after': "after_example" // String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
};
apiInstance.listProjectUsers(projectId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| The ID of the project. | 
 **limit** | **Number**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
 **after** | **String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 

### Return type

[**ProjectUserListResponse**](ProjectUserListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## listProjects

> ProjectListResponse listProjects(opts)

Returns a list of projects.

### Example

```javascript
import OpenapiOpenai from 'openapi_openai';
let defaultClient = OpenapiOpenai.ApiClient.instance;
// Configure Bearer access token for authorization: ApiKeyAuth
let ApiKeyAuth = defaultClient.authentications['ApiKeyAuth'];
ApiKeyAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new OpenapiOpenai.ProjectsApi();
let opts = {
  'limit': 20, // Number | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
  'after': "after_example", // String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
  'includeArchived': false // Boolean | If `true` returns all projects including those that have been `archived`. Archived projects are not included by default.
};
apiInstance.listProjects(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Number**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
 **after** | **String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 
 **includeArchived** | **Boolean**| If &#x60;true&#x60; returns all projects including those that have been &#x60;archived&#x60;. Archived projects are not included by default. | [optional] [default to false]

### Return type

[**ProjectListResponse**](ProjectListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## modifyProject

> Project modifyProject(projectId, projectUpdateRequest)

Modifies a project in the organization.

### Example

```javascript
import OpenapiOpenai from 'openapi_openai';
let defaultClient = OpenapiOpenai.ApiClient.instance;
// Configure Bearer access token for authorization: ApiKeyAuth
let ApiKeyAuth = defaultClient.authentications['ApiKeyAuth'];
ApiKeyAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new OpenapiOpenai.ProjectsApi();
let projectId = "projectId_example"; // String | The ID of the project.
let projectUpdateRequest = new OpenapiOpenai.ProjectUpdateRequest(); // ProjectUpdateRequest | The project update request payload.
apiInstance.modifyProject(projectId, projectUpdateRequest, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| The ID of the project. | 
 **projectUpdateRequest** | [**ProjectUpdateRequest**](ProjectUpdateRequest.md)| The project update request payload. | 

### Return type

[**Project**](Project.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## modifyProjectUser

> ProjectUser modifyProjectUser(projectId, userId, projectUserUpdateRequest)

Modifies a user&#39;s role in the project.

### Example

```javascript
import OpenapiOpenai from 'openapi_openai';
let defaultClient = OpenapiOpenai.ApiClient.instance;
// Configure Bearer access token for authorization: ApiKeyAuth
let ApiKeyAuth = defaultClient.authentications['ApiKeyAuth'];
ApiKeyAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new OpenapiOpenai.ProjectsApi();
let projectId = "projectId_example"; // String | The ID of the project.
let userId = "userId_example"; // String | The ID of the user.
let projectUserUpdateRequest = new OpenapiOpenai.ProjectUserUpdateRequest(); // ProjectUserUpdateRequest | The project user update request payload.
apiInstance.modifyProjectUser(projectId, userId, projectUserUpdateRequest, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| The ID of the project. | 
 **userId** | **String**| The ID of the user. | 
 **projectUserUpdateRequest** | [**ProjectUserUpdateRequest**](ProjectUserUpdateRequest.md)| The project user update request payload. | 

### Return type

[**ProjectUser**](ProjectUser.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## retrieveProject

> Project retrieveProject(projectId)

Retrieves a project.

### Example

```javascript
import OpenapiOpenai from 'openapi_openai';
let defaultClient = OpenapiOpenai.ApiClient.instance;
// Configure Bearer access token for authorization: ApiKeyAuth
let ApiKeyAuth = defaultClient.authentications['ApiKeyAuth'];
ApiKeyAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new OpenapiOpenai.ProjectsApi();
let projectId = "projectId_example"; // String | The ID of the project.
apiInstance.retrieveProject(projectId, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| The ID of the project. | 

### Return type

[**Project**](Project.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## retrieveProjectApiKey

> ProjectApiKey retrieveProjectApiKey(projectId, keyId)

Retrieves an API key in the project.

### Example

```javascript
import OpenapiOpenai from 'openapi_openai';
let defaultClient = OpenapiOpenai.ApiClient.instance;
// Configure Bearer access token for authorization: ApiKeyAuth
let ApiKeyAuth = defaultClient.authentications['ApiKeyAuth'];
ApiKeyAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new OpenapiOpenai.ProjectsApi();
let projectId = "projectId_example"; // String | The ID of the project.
let keyId = "keyId_example"; // String | The ID of the API key.
apiInstance.retrieveProjectApiKey(projectId, keyId, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| The ID of the project. | 
 **keyId** | **String**| The ID of the API key. | 

### Return type

[**ProjectApiKey**](ProjectApiKey.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## retrieveProjectServiceAccount

> ProjectServiceAccount retrieveProjectServiceAccount(projectId, serviceAccountId)

Retrieves a service account in the project.

### Example

```javascript
import OpenapiOpenai from 'openapi_openai';
let defaultClient = OpenapiOpenai.ApiClient.instance;
// Configure Bearer access token for authorization: ApiKeyAuth
let ApiKeyAuth = defaultClient.authentications['ApiKeyAuth'];
ApiKeyAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new OpenapiOpenai.ProjectsApi();
let projectId = "projectId_example"; // String | The ID of the project.
let serviceAccountId = "serviceAccountId_example"; // String | The ID of the service account.
apiInstance.retrieveProjectServiceAccount(projectId, serviceAccountId, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| The ID of the project. | 
 **serviceAccountId** | **String**| The ID of the service account. | 

### Return type

[**ProjectServiceAccount**](ProjectServiceAccount.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## retrieveProjectUser

> ProjectUser retrieveProjectUser(projectId, userId)

Retrieves a user in the project.

### Example

```javascript
import OpenapiOpenai from 'openapi_openai';
let defaultClient = OpenapiOpenai.ApiClient.instance;
// Configure Bearer access token for authorization: ApiKeyAuth
let ApiKeyAuth = defaultClient.authentications['ApiKeyAuth'];
ApiKeyAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new OpenapiOpenai.ProjectsApi();
let projectId = "projectId_example"; // String | The ID of the project.
let userId = "userId_example"; // String | The ID of the user.
apiInstance.retrieveProjectUser(projectId, userId, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| The ID of the project. | 
 **userId** | **String**| The ID of the user. | 

### Return type

[**ProjectUser**](ProjectUser.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## updateProjectRateLimits

> ProjectRateLimit updateProjectRateLimits(projectId, rateLimitId, projectRateLimitUpdateRequest)

Updates a project rate limit.

### Example

```javascript
import OpenapiOpenai from 'openapi_openai';
let defaultClient = OpenapiOpenai.ApiClient.instance;
// Configure Bearer access token for authorization: ApiKeyAuth
let ApiKeyAuth = defaultClient.authentications['ApiKeyAuth'];
ApiKeyAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new OpenapiOpenai.ProjectsApi();
let projectId = "projectId_example"; // String | The ID of the project.
let rateLimitId = "rateLimitId_example"; // String | The ID of the rate limit.
let projectRateLimitUpdateRequest = new OpenapiOpenai.ProjectRateLimitUpdateRequest(); // ProjectRateLimitUpdateRequest | The project rate limit update request payload.
apiInstance.updateProjectRateLimits(projectId, rateLimitId, projectRateLimitUpdateRequest, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| The ID of the project. | 
 **rateLimitId** | **String**| The ID of the rate limit. | 
 **projectRateLimitUpdateRequest** | [**ProjectRateLimitUpdateRequest**](ProjectRateLimitUpdateRequest.md)| The project rate limit update request payload. | 

### Return type

[**ProjectRateLimit**](ProjectRateLimit.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

