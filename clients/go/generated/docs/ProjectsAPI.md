# \ProjectsAPI

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ArchiveProject**](ProjectsAPI.md#ArchiveProject) | **Post** /organization/projects/{project_id}/archive | Archives a project in the organization. Archived projects cannot be used or updated.
[**CreateProject**](ProjectsAPI.md#CreateProject) | **Post** /organization/projects | Create a new project in the organization. Projects can be created and archived, but cannot be deleted.
[**CreateProjectServiceAccount**](ProjectsAPI.md#CreateProjectServiceAccount) | **Post** /organization/projects/{project_id}/service_accounts | Creates a new service account in the project. This also returns an unredacted API key for the service account.
[**CreateProjectUser**](ProjectsAPI.md#CreateProjectUser) | **Post** /organization/projects/{project_id}/users | Adds a user to the project. Users must already be members of the organization to be added to a project.
[**DeleteProjectApiKey**](ProjectsAPI.md#DeleteProjectApiKey) | **Delete** /organization/projects/{project_id}/api_keys/{key_id} | Deletes an API key from the project.
[**DeleteProjectServiceAccount**](ProjectsAPI.md#DeleteProjectServiceAccount) | **Delete** /organization/projects/{project_id}/service_accounts/{service_account_id} | Deletes a service account from the project.
[**DeleteProjectUser**](ProjectsAPI.md#DeleteProjectUser) | **Delete** /organization/projects/{project_id}/users/{user_id} | Deletes a user from the project.
[**ListProjectApiKeys**](ProjectsAPI.md#ListProjectApiKeys) | **Get** /organization/projects/{project_id}/api_keys | Returns a list of API keys in the project.
[**ListProjectRateLimits**](ProjectsAPI.md#ListProjectRateLimits) | **Get** /organization/projects/{project_id}/rate_limits | Returns the rate limits per model for a project.
[**ListProjectServiceAccounts**](ProjectsAPI.md#ListProjectServiceAccounts) | **Get** /organization/projects/{project_id}/service_accounts | Returns a list of service accounts in the project.
[**ListProjectUsers**](ProjectsAPI.md#ListProjectUsers) | **Get** /organization/projects/{project_id}/users | Returns a list of users in the project.
[**ListProjects**](ProjectsAPI.md#ListProjects) | **Get** /organization/projects | Returns a list of projects.
[**ModifyProject**](ProjectsAPI.md#ModifyProject) | **Post** /organization/projects/{project_id} | Modifies a project in the organization.
[**ModifyProjectUser**](ProjectsAPI.md#ModifyProjectUser) | **Post** /organization/projects/{project_id}/users/{user_id} | Modifies a user&#39;s role in the project.
[**RetrieveProject**](ProjectsAPI.md#RetrieveProject) | **Get** /organization/projects/{project_id} | Retrieves a project.
[**RetrieveProjectApiKey**](ProjectsAPI.md#RetrieveProjectApiKey) | **Get** /organization/projects/{project_id}/api_keys/{key_id} | Retrieves an API key in the project.
[**RetrieveProjectServiceAccount**](ProjectsAPI.md#RetrieveProjectServiceAccount) | **Get** /organization/projects/{project_id}/service_accounts/{service_account_id} | Retrieves a service account in the project.
[**RetrieveProjectUser**](ProjectsAPI.md#RetrieveProjectUser) | **Get** /organization/projects/{project_id}/users/{user_id} | Retrieves a user in the project.
[**UpdateProjectRateLimits**](ProjectsAPI.md#UpdateProjectRateLimits) | **Post** /organization/projects/{project_id}/rate_limits/{rate_limit_id} | Updates a project rate limit.



## ArchiveProject

> Project ArchiveProject(ctx, projectId).Execute()

Archives a project in the organization. Archived projects cannot be used or updated.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/openapi-openai"
)

func main() {
	projectId := "projectId_example" // string | The ID of the project.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ProjectsAPI.ArchiveProject(context.Background(), projectId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ProjectsAPI.ArchiveProject``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ArchiveProject`: Project
	fmt.Fprintf(os.Stdout, "Response from `ProjectsAPI.ArchiveProject`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**projectId** | **string** | The ID of the project. | 

### Other Parameters

Other parameters are passed through a pointer to a apiArchiveProjectRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**Project**](Project.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CreateProject

> Project CreateProject(ctx).ProjectCreateRequest(projectCreateRequest).Execute()

Create a new project in the organization. Projects can be created and archived, but cannot be deleted.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/openapi-openai"
)

func main() {
	projectCreateRequest := *openapiclient.NewProjectCreateRequest("Name_example") // ProjectCreateRequest | The project create request payload.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ProjectsAPI.CreateProject(context.Background()).ProjectCreateRequest(projectCreateRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ProjectsAPI.CreateProject``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CreateProject`: Project
	fmt.Fprintf(os.Stdout, "Response from `ProjectsAPI.CreateProject`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCreateProjectRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectCreateRequest** | [**ProjectCreateRequest**](ProjectCreateRequest.md) | The project create request payload. | 

### Return type

[**Project**](Project.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CreateProjectServiceAccount

> ProjectServiceAccountCreateResponse CreateProjectServiceAccount(ctx, projectId).ProjectServiceAccountCreateRequest(projectServiceAccountCreateRequest).Execute()

Creates a new service account in the project. This also returns an unredacted API key for the service account.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/openapi-openai"
)

func main() {
	projectId := "projectId_example" // string | The ID of the project.
	projectServiceAccountCreateRequest := *openapiclient.NewProjectServiceAccountCreateRequest("Name_example") // ProjectServiceAccountCreateRequest | The project service account create request payload.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ProjectsAPI.CreateProjectServiceAccount(context.Background(), projectId).ProjectServiceAccountCreateRequest(projectServiceAccountCreateRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ProjectsAPI.CreateProjectServiceAccount``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CreateProjectServiceAccount`: ProjectServiceAccountCreateResponse
	fmt.Fprintf(os.Stdout, "Response from `ProjectsAPI.CreateProjectServiceAccount`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**projectId** | **string** | The ID of the project. | 

### Other Parameters

Other parameters are passed through a pointer to a apiCreateProjectServiceAccountRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **projectServiceAccountCreateRequest** | [**ProjectServiceAccountCreateRequest**](ProjectServiceAccountCreateRequest.md) | The project service account create request payload. | 

### Return type

[**ProjectServiceAccountCreateResponse**](ProjectServiceAccountCreateResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CreateProjectUser

> ProjectUser CreateProjectUser(ctx, projectId).ProjectUserCreateRequest(projectUserCreateRequest).Execute()

Adds a user to the project. Users must already be members of the organization to be added to a project.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/openapi-openai"
)

func main() {
	projectId := "projectId_example" // string | The ID of the project.
	projectUserCreateRequest := *openapiclient.NewProjectUserCreateRequest("UserId_example", "Role_example") // ProjectUserCreateRequest | The project user create request payload.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ProjectsAPI.CreateProjectUser(context.Background(), projectId).ProjectUserCreateRequest(projectUserCreateRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ProjectsAPI.CreateProjectUser``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CreateProjectUser`: ProjectUser
	fmt.Fprintf(os.Stdout, "Response from `ProjectsAPI.CreateProjectUser`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**projectId** | **string** | The ID of the project. | 

### Other Parameters

Other parameters are passed through a pointer to a apiCreateProjectUserRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **projectUserCreateRequest** | [**ProjectUserCreateRequest**](ProjectUserCreateRequest.md) | The project user create request payload. | 

### Return type

[**ProjectUser**](ProjectUser.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## DeleteProjectApiKey

> ProjectApiKeyDeleteResponse DeleteProjectApiKey(ctx, projectId, keyId).Execute()

Deletes an API key from the project.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/openapi-openai"
)

func main() {
	projectId := "projectId_example" // string | The ID of the project.
	keyId := "keyId_example" // string | The ID of the API key.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ProjectsAPI.DeleteProjectApiKey(context.Background(), projectId, keyId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ProjectsAPI.DeleteProjectApiKey``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `DeleteProjectApiKey`: ProjectApiKeyDeleteResponse
	fmt.Fprintf(os.Stdout, "Response from `ProjectsAPI.DeleteProjectApiKey`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**projectId** | **string** | The ID of the project. | 
**keyId** | **string** | The ID of the API key. | 

### Other Parameters

Other parameters are passed through a pointer to a apiDeleteProjectApiKeyRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



### Return type

[**ProjectApiKeyDeleteResponse**](ProjectApiKeyDeleteResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## DeleteProjectServiceAccount

> ProjectServiceAccountDeleteResponse DeleteProjectServiceAccount(ctx, projectId, serviceAccountId).Execute()

Deletes a service account from the project.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/openapi-openai"
)

func main() {
	projectId := "projectId_example" // string | The ID of the project.
	serviceAccountId := "serviceAccountId_example" // string | The ID of the service account.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ProjectsAPI.DeleteProjectServiceAccount(context.Background(), projectId, serviceAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ProjectsAPI.DeleteProjectServiceAccount``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `DeleteProjectServiceAccount`: ProjectServiceAccountDeleteResponse
	fmt.Fprintf(os.Stdout, "Response from `ProjectsAPI.DeleteProjectServiceAccount`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**projectId** | **string** | The ID of the project. | 
**serviceAccountId** | **string** | The ID of the service account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiDeleteProjectServiceAccountRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



### Return type

[**ProjectServiceAccountDeleteResponse**](ProjectServiceAccountDeleteResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## DeleteProjectUser

> ProjectUserDeleteResponse DeleteProjectUser(ctx, projectId, userId).Execute()

Deletes a user from the project.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/openapi-openai"
)

func main() {
	projectId := "projectId_example" // string | The ID of the project.
	userId := "userId_example" // string | The ID of the user.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ProjectsAPI.DeleteProjectUser(context.Background(), projectId, userId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ProjectsAPI.DeleteProjectUser``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `DeleteProjectUser`: ProjectUserDeleteResponse
	fmt.Fprintf(os.Stdout, "Response from `ProjectsAPI.DeleteProjectUser`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**projectId** | **string** | The ID of the project. | 
**userId** | **string** | The ID of the user. | 

### Other Parameters

Other parameters are passed through a pointer to a apiDeleteProjectUserRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



### Return type

[**ProjectUserDeleteResponse**](ProjectUserDeleteResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ListProjectApiKeys

> ProjectApiKeyListResponse ListProjectApiKeys(ctx, projectId).Limit(limit).After(after).Execute()

Returns a list of API keys in the project.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/openapi-openai"
)

func main() {
	projectId := "projectId_example" // string | The ID of the project.
	limit := int32(56) // int32 | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional) (default to 20)
	after := "after_example" // string | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ProjectsAPI.ListProjectApiKeys(context.Background(), projectId).Limit(limit).After(after).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ProjectsAPI.ListProjectApiKeys``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ListProjectApiKeys`: ProjectApiKeyListResponse
	fmt.Fprintf(os.Stdout, "Response from `ProjectsAPI.ListProjectApiKeys`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**projectId** | **string** | The ID of the project. | 

### Other Parameters

Other parameters are passed through a pointer to a apiListProjectApiKeysRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **limit** | **int32** | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [default to 20]
 **after** | **string** | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | 

### Return type

[**ProjectApiKeyListResponse**](ProjectApiKeyListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ListProjectRateLimits

> ProjectRateLimitListResponse ListProjectRateLimits(ctx, projectId).Limit(limit).After(after).Before(before).Execute()

Returns the rate limits per model for a project.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/openapi-openai"
)

func main() {
	projectId := "projectId_example" // string | The ID of the project.
	limit := int32(56) // int32 | A limit on the number of objects to be returned. The default is 100.  (optional) (default to 100)
	after := "after_example" // string | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
	before := "before_example" // string | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, beginning with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ProjectsAPI.ListProjectRateLimits(context.Background(), projectId).Limit(limit).After(after).Before(before).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ProjectsAPI.ListProjectRateLimits``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ListProjectRateLimits`: ProjectRateLimitListResponse
	fmt.Fprintf(os.Stdout, "Response from `ProjectsAPI.ListProjectRateLimits`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**projectId** | **string** | The ID of the project. | 

### Other Parameters

Other parameters are passed through a pointer to a apiListProjectRateLimitsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **limit** | **int32** | A limit on the number of objects to be returned. The default is 100.  | [default to 100]
 **after** | **string** | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | 
 **before** | **string** | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, beginning with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | 

### Return type

[**ProjectRateLimitListResponse**](ProjectRateLimitListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ListProjectServiceAccounts

> ProjectServiceAccountListResponse ListProjectServiceAccounts(ctx, projectId).Limit(limit).After(after).Execute()

Returns a list of service accounts in the project.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/openapi-openai"
)

func main() {
	projectId := "projectId_example" // string | The ID of the project.
	limit := int32(56) // int32 | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional) (default to 20)
	after := "after_example" // string | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ProjectsAPI.ListProjectServiceAccounts(context.Background(), projectId).Limit(limit).After(after).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ProjectsAPI.ListProjectServiceAccounts``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ListProjectServiceAccounts`: ProjectServiceAccountListResponse
	fmt.Fprintf(os.Stdout, "Response from `ProjectsAPI.ListProjectServiceAccounts`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**projectId** | **string** | The ID of the project. | 

### Other Parameters

Other parameters are passed through a pointer to a apiListProjectServiceAccountsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **limit** | **int32** | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [default to 20]
 **after** | **string** | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | 

### Return type

[**ProjectServiceAccountListResponse**](ProjectServiceAccountListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ListProjectUsers

> ProjectUserListResponse ListProjectUsers(ctx, projectId).Limit(limit).After(after).Execute()

Returns a list of users in the project.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/openapi-openai"
)

func main() {
	projectId := "projectId_example" // string | The ID of the project.
	limit := int32(56) // int32 | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional) (default to 20)
	after := "after_example" // string | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ProjectsAPI.ListProjectUsers(context.Background(), projectId).Limit(limit).After(after).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ProjectsAPI.ListProjectUsers``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ListProjectUsers`: ProjectUserListResponse
	fmt.Fprintf(os.Stdout, "Response from `ProjectsAPI.ListProjectUsers`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**projectId** | **string** | The ID of the project. | 

### Other Parameters

Other parameters are passed through a pointer to a apiListProjectUsersRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **limit** | **int32** | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [default to 20]
 **after** | **string** | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | 

### Return type

[**ProjectUserListResponse**](ProjectUserListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ListProjects

> ProjectListResponse ListProjects(ctx).Limit(limit).After(after).IncludeArchived(includeArchived).Execute()

Returns a list of projects.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/openapi-openai"
)

func main() {
	limit := int32(56) // int32 | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional) (default to 20)
	after := "after_example" // string | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
	includeArchived := true // bool | If `true` returns all projects including those that have been `archived`. Archived projects are not included by default. (optional) (default to false)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ProjectsAPI.ListProjects(context.Background()).Limit(limit).After(after).IncludeArchived(includeArchived).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ProjectsAPI.ListProjects``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ListProjects`: ProjectListResponse
	fmt.Fprintf(os.Stdout, "Response from `ProjectsAPI.ListProjects`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiListProjectsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int32** | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [default to 20]
 **after** | **string** | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | 
 **includeArchived** | **bool** | If &#x60;true&#x60; returns all projects including those that have been &#x60;archived&#x60;. Archived projects are not included by default. | [default to false]

### Return type

[**ProjectListResponse**](ProjectListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModifyProject

> Project ModifyProject(ctx, projectId).ProjectUpdateRequest(projectUpdateRequest).Execute()

Modifies a project in the organization.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/openapi-openai"
)

func main() {
	projectId := "projectId_example" // string | The ID of the project.
	projectUpdateRequest := *openapiclient.NewProjectUpdateRequest("Name_example") // ProjectUpdateRequest | The project update request payload.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ProjectsAPI.ModifyProject(context.Background(), projectId).ProjectUpdateRequest(projectUpdateRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ProjectsAPI.ModifyProject``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModifyProject`: Project
	fmt.Fprintf(os.Stdout, "Response from `ProjectsAPI.ModifyProject`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**projectId** | **string** | The ID of the project. | 

### Other Parameters

Other parameters are passed through a pointer to a apiModifyProjectRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **projectUpdateRequest** | [**ProjectUpdateRequest**](ProjectUpdateRequest.md) | The project update request payload. | 

### Return type

[**Project**](Project.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ModifyProjectUser

> ProjectUser ModifyProjectUser(ctx, projectId, userId).ProjectUserUpdateRequest(projectUserUpdateRequest).Execute()

Modifies a user's role in the project.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/openapi-openai"
)

func main() {
	projectId := "projectId_example" // string | The ID of the project.
	userId := "userId_example" // string | The ID of the user.
	projectUserUpdateRequest := *openapiclient.NewProjectUserUpdateRequest("Role_example") // ProjectUserUpdateRequest | The project user update request payload.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ProjectsAPI.ModifyProjectUser(context.Background(), projectId, userId).ProjectUserUpdateRequest(projectUserUpdateRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ProjectsAPI.ModifyProjectUser``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ModifyProjectUser`: ProjectUser
	fmt.Fprintf(os.Stdout, "Response from `ProjectsAPI.ModifyProjectUser`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**projectId** | **string** | The ID of the project. | 
**userId** | **string** | The ID of the user. | 

### Other Parameters

Other parameters are passed through a pointer to a apiModifyProjectUserRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **projectUserUpdateRequest** | [**ProjectUserUpdateRequest**](ProjectUserUpdateRequest.md) | The project user update request payload. | 

### Return type

[**ProjectUser**](ProjectUser.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## RetrieveProject

> Project RetrieveProject(ctx, projectId).Execute()

Retrieves a project.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/openapi-openai"
)

func main() {
	projectId := "projectId_example" // string | The ID of the project.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ProjectsAPI.RetrieveProject(context.Background(), projectId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ProjectsAPI.RetrieveProject``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `RetrieveProject`: Project
	fmt.Fprintf(os.Stdout, "Response from `ProjectsAPI.RetrieveProject`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**projectId** | **string** | The ID of the project. | 

### Other Parameters

Other parameters are passed through a pointer to a apiRetrieveProjectRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**Project**](Project.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## RetrieveProjectApiKey

> ProjectApiKey RetrieveProjectApiKey(ctx, projectId, keyId).Execute()

Retrieves an API key in the project.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/openapi-openai"
)

func main() {
	projectId := "projectId_example" // string | The ID of the project.
	keyId := "keyId_example" // string | The ID of the API key.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ProjectsAPI.RetrieveProjectApiKey(context.Background(), projectId, keyId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ProjectsAPI.RetrieveProjectApiKey``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `RetrieveProjectApiKey`: ProjectApiKey
	fmt.Fprintf(os.Stdout, "Response from `ProjectsAPI.RetrieveProjectApiKey`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**projectId** | **string** | The ID of the project. | 
**keyId** | **string** | The ID of the API key. | 

### Other Parameters

Other parameters are passed through a pointer to a apiRetrieveProjectApiKeyRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



### Return type

[**ProjectApiKey**](ProjectApiKey.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## RetrieveProjectServiceAccount

> ProjectServiceAccount RetrieveProjectServiceAccount(ctx, projectId, serviceAccountId).Execute()

Retrieves a service account in the project.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/openapi-openai"
)

func main() {
	projectId := "projectId_example" // string | The ID of the project.
	serviceAccountId := "serviceAccountId_example" // string | The ID of the service account.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ProjectsAPI.RetrieveProjectServiceAccount(context.Background(), projectId, serviceAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ProjectsAPI.RetrieveProjectServiceAccount``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `RetrieveProjectServiceAccount`: ProjectServiceAccount
	fmt.Fprintf(os.Stdout, "Response from `ProjectsAPI.RetrieveProjectServiceAccount`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**projectId** | **string** | The ID of the project. | 
**serviceAccountId** | **string** | The ID of the service account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiRetrieveProjectServiceAccountRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



### Return type

[**ProjectServiceAccount**](ProjectServiceAccount.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## RetrieveProjectUser

> ProjectUser RetrieveProjectUser(ctx, projectId, userId).Execute()

Retrieves a user in the project.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/openapi-openai"
)

func main() {
	projectId := "projectId_example" // string | The ID of the project.
	userId := "userId_example" // string | The ID of the user.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ProjectsAPI.RetrieveProjectUser(context.Background(), projectId, userId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ProjectsAPI.RetrieveProjectUser``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `RetrieveProjectUser`: ProjectUser
	fmt.Fprintf(os.Stdout, "Response from `ProjectsAPI.RetrieveProjectUser`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**projectId** | **string** | The ID of the project. | 
**userId** | **string** | The ID of the user. | 

### Other Parameters

Other parameters are passed through a pointer to a apiRetrieveProjectUserRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



### Return type

[**ProjectUser**](ProjectUser.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## UpdateProjectRateLimits

> ProjectRateLimit UpdateProjectRateLimits(ctx, projectId, rateLimitId).ProjectRateLimitUpdateRequest(projectRateLimitUpdateRequest).Execute()

Updates a project rate limit.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/openapi-openai"
)

func main() {
	projectId := "projectId_example" // string | The ID of the project.
	rateLimitId := "rateLimitId_example" // string | The ID of the rate limit.
	projectRateLimitUpdateRequest := *openapiclient.NewProjectRateLimitUpdateRequest() // ProjectRateLimitUpdateRequest | The project rate limit update request payload.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ProjectsAPI.UpdateProjectRateLimits(context.Background(), projectId, rateLimitId).ProjectRateLimitUpdateRequest(projectRateLimitUpdateRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ProjectsAPI.UpdateProjectRateLimits``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `UpdateProjectRateLimits`: ProjectRateLimit
	fmt.Fprintf(os.Stdout, "Response from `ProjectsAPI.UpdateProjectRateLimits`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**projectId** | **string** | The ID of the project. | 
**rateLimitId** | **string** | The ID of the rate limit. | 

### Other Parameters

Other parameters are passed through a pointer to a apiUpdateProjectRateLimitsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **projectRateLimitUpdateRequest** | [**ProjectRateLimitUpdateRequest**](ProjectRateLimitUpdateRequest.md) | The project rate limit update request payload. | 

### Return type

[**ProjectRateLimit**](ProjectRateLimit.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

