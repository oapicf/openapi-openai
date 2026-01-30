# PSOpenAPITools.PSOpenAPITools\Api.ProjectsApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Invoke-ArchiveProject**](ProjectsApi.md#Invoke-ArchiveProject) | **POST** /organization/projects/{project_id}/archive | Archives a project in the organization. Archived projects cannot be used or updated.
[**New-Project**](ProjectsApi.md#New-Project) | **POST** /organization/projects | Create a new project in the organization. Projects can be created and archived, but cannot be deleted.
[**New-ProjectServiceAccount**](ProjectsApi.md#New-ProjectServiceAccount) | **POST** /organization/projects/{project_id}/service_accounts | Creates a new service account in the project. This also returns an unredacted API key for the service account.
[**New-ProjectUser**](ProjectsApi.md#New-ProjectUser) | **POST** /organization/projects/{project_id}/users | Adds a user to the project. Users must already be members of the organization to be added to a project.
[**Invoke-DeleteProjectApiKey**](ProjectsApi.md#Invoke-DeleteProjectApiKey) | **DELETE** /organization/projects/{project_id}/api_keys/{key_id} | Deletes an API key from the project.
[**Invoke-DeleteProjectServiceAccount**](ProjectsApi.md#Invoke-DeleteProjectServiceAccount) | **DELETE** /organization/projects/{project_id}/service_accounts/{service_account_id} | Deletes a service account from the project.
[**Invoke-DeleteProjectUser**](ProjectsApi.md#Invoke-DeleteProjectUser) | **DELETE** /organization/projects/{project_id}/users/{user_id} | Deletes a user from the project.
[**Invoke-ListProjectApiKeys**](ProjectsApi.md#Invoke-ListProjectApiKeys) | **GET** /organization/projects/{project_id}/api_keys | Returns a list of API keys in the project.
[**Invoke-ListProjectRateLimits**](ProjectsApi.md#Invoke-ListProjectRateLimits) | **GET** /organization/projects/{project_id}/rate_limits | Returns the rate limits per model for a project.
[**Invoke-ListProjectServiceAccounts**](ProjectsApi.md#Invoke-ListProjectServiceAccounts) | **GET** /organization/projects/{project_id}/service_accounts | Returns a list of service accounts in the project.
[**Invoke-ListProjectUsers**](ProjectsApi.md#Invoke-ListProjectUsers) | **GET** /organization/projects/{project_id}/users | Returns a list of users in the project.
[**Invoke-ListProjects**](ProjectsApi.md#Invoke-ListProjects) | **GET** /organization/projects | Returns a list of projects.
[**Edit-Project**](ProjectsApi.md#Edit-Project) | **POST** /organization/projects/{project_id} | Modifies a project in the organization.
[**Edit-ProjectUser**](ProjectsApi.md#Edit-ProjectUser) | **POST** /organization/projects/{project_id}/users/{user_id} | Modifies a user&#39;s role in the project.
[**Invoke-RetrieveProject**](ProjectsApi.md#Invoke-RetrieveProject) | **GET** /organization/projects/{project_id} | Retrieves a project.
[**Invoke-RetrieveProjectApiKey**](ProjectsApi.md#Invoke-RetrieveProjectApiKey) | **GET** /organization/projects/{project_id}/api_keys/{key_id} | Retrieves an API key in the project.
[**Invoke-RetrieveProjectServiceAccount**](ProjectsApi.md#Invoke-RetrieveProjectServiceAccount) | **GET** /organization/projects/{project_id}/service_accounts/{service_account_id} | Retrieves a service account in the project.
[**Invoke-RetrieveProjectUser**](ProjectsApi.md#Invoke-RetrieveProjectUser) | **GET** /organization/projects/{project_id}/users/{user_id} | Retrieves a user in the project.
[**Update-ProjectRateLimits**](ProjectsApi.md#Update-ProjectRateLimits) | **POST** /organization/projects/{project_id}/rate_limits/{rate_limit_id} | Updates a project rate limit.


<a id="Invoke-ArchiveProject"></a>
# **Invoke-ArchiveProject**
> Project Invoke-ArchiveProject<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ProjectId] <String><br>

Archives a project in the organization. Archived projects cannot be used or updated.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$ProjectId = "MyProjectId" # String | The ID of the project.

# Archives a project in the organization. Archived projects cannot be used or updated.
try {
    $Result = Invoke-ArchiveProject -ProjectId $ProjectId
} catch {
    Write-Host ("Exception occurred when calling Invoke-ArchiveProject: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ProjectId** | **String**| The ID of the project. | 

### Return type

[**Project**](Project.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="New-Project"></a>
# **New-Project**
> Project New-Project<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ProjectCreateRequest] <PSCustomObject><br>

Create a new project in the organization. Projects can be created and archived, but cannot be deleted.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$ProjectCreateRequest = Initialize-ProjectCreateRequest -Name "MyName" # ProjectCreateRequest | The project create request payload.

# Create a new project in the organization. Projects can be created and archived, but cannot be deleted.
try {
    $Result = New-Project -ProjectCreateRequest $ProjectCreateRequest
} catch {
    Write-Host ("Exception occurred when calling New-Project: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ProjectCreateRequest** | [**ProjectCreateRequest**](ProjectCreateRequest.md)| The project create request payload. | 

### Return type

[**Project**](Project.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="New-ProjectServiceAccount"></a>
# **New-ProjectServiceAccount**
> ProjectServiceAccountCreateResponse New-ProjectServiceAccount<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ProjectId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ProjectServiceAccountCreateRequest] <PSCustomObject><br>

Creates a new service account in the project. This also returns an unredacted API key for the service account.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$ProjectId = "MyProjectId" # String | The ID of the project.
$ProjectServiceAccountCreateRequest = Initialize-ProjectServiceAccountCreateRequest -Name "MyName" # ProjectServiceAccountCreateRequest | The project service account create request payload.

# Creates a new service account in the project. This also returns an unredacted API key for the service account.
try {
    $Result = New-ProjectServiceAccount -ProjectId $ProjectId -ProjectServiceAccountCreateRequest $ProjectServiceAccountCreateRequest
} catch {
    Write-Host ("Exception occurred when calling New-ProjectServiceAccount: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ProjectId** | **String**| The ID of the project. | 
 **ProjectServiceAccountCreateRequest** | [**ProjectServiceAccountCreateRequest**](ProjectServiceAccountCreateRequest.md)| The project service account create request payload. | 

### Return type

[**ProjectServiceAccountCreateResponse**](ProjectServiceAccountCreateResponse.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="New-ProjectUser"></a>
# **New-ProjectUser**
> ProjectUser New-ProjectUser<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ProjectId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ProjectUserCreateRequest] <PSCustomObject><br>

Adds a user to the project. Users must already be members of the organization to be added to a project.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$ProjectId = "MyProjectId" # String | The ID of the project.
$ProjectUserCreateRequest = Initialize-ProjectUserCreateRequest -UserId "MyUserId" -Role "owner" # ProjectUserCreateRequest | The project user create request payload.

# Adds a user to the project. Users must already be members of the organization to be added to a project.
try {
    $Result = New-ProjectUser -ProjectId $ProjectId -ProjectUserCreateRequest $ProjectUserCreateRequest
} catch {
    Write-Host ("Exception occurred when calling New-ProjectUser: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ProjectId** | **String**| The ID of the project. | 
 **ProjectUserCreateRequest** | [**ProjectUserCreateRequest**](ProjectUserCreateRequest.md)| The project user create request payload. | 

### Return type

[**ProjectUser**](ProjectUser.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-DeleteProjectApiKey"></a>
# **Invoke-DeleteProjectApiKey**
> ProjectApiKeyDeleteResponse Invoke-DeleteProjectApiKey<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ProjectId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-KeyId] <String><br>

Deletes an API key from the project.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$ProjectId = "MyProjectId" # String | The ID of the project.
$KeyId = "MyKeyId" # String | The ID of the API key.

# Deletes an API key from the project.
try {
    $Result = Invoke-DeleteProjectApiKey -ProjectId $ProjectId -KeyId $KeyId
} catch {
    Write-Host ("Exception occurred when calling Invoke-DeleteProjectApiKey: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ProjectId** | **String**| The ID of the project. | 
 **KeyId** | **String**| The ID of the API key. | 

### Return type

[**ProjectApiKeyDeleteResponse**](ProjectApiKeyDeleteResponse.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-DeleteProjectServiceAccount"></a>
# **Invoke-DeleteProjectServiceAccount**
> ProjectServiceAccountDeleteResponse Invoke-DeleteProjectServiceAccount<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ProjectId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ServiceAccountId] <String><br>

Deletes a service account from the project.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$ProjectId = "MyProjectId" # String | The ID of the project.
$ServiceAccountId = "MyServiceAccountId" # String | The ID of the service account.

# Deletes a service account from the project.
try {
    $Result = Invoke-DeleteProjectServiceAccount -ProjectId $ProjectId -ServiceAccountId $ServiceAccountId
} catch {
    Write-Host ("Exception occurred when calling Invoke-DeleteProjectServiceAccount: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ProjectId** | **String**| The ID of the project. | 
 **ServiceAccountId** | **String**| The ID of the service account. | 

### Return type

[**ProjectServiceAccountDeleteResponse**](ProjectServiceAccountDeleteResponse.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-DeleteProjectUser"></a>
# **Invoke-DeleteProjectUser**
> ProjectUserDeleteResponse Invoke-DeleteProjectUser<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ProjectId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-UserId] <String><br>

Deletes a user from the project.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$ProjectId = "MyProjectId" # String | The ID of the project.
$UserId = "MyUserId" # String | The ID of the user.

# Deletes a user from the project.
try {
    $Result = Invoke-DeleteProjectUser -ProjectId $ProjectId -UserId $UserId
} catch {
    Write-Host ("Exception occurred when calling Invoke-DeleteProjectUser: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ProjectId** | **String**| The ID of the project. | 
 **UserId** | **String**| The ID of the user. | 

### Return type

[**ProjectUserDeleteResponse**](ProjectUserDeleteResponse.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-ListProjectApiKeys"></a>
# **Invoke-ListProjectApiKeys**
> ProjectApiKeyListResponse Invoke-ListProjectApiKeys<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ProjectId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Limit] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-After] <String><br>

Returns a list of API keys in the project.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$ProjectId = "MyProjectId" # String | The ID of the project.
$Limit = 56 # Int32 | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional) (default to 20)
$After = "MyAfter" # String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)

# Returns a list of API keys in the project.
try {
    $Result = Invoke-ListProjectApiKeys -ProjectId $ProjectId -Limit $Limit -After $After
} catch {
    Write-Host ("Exception occurred when calling Invoke-ListProjectApiKeys: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ProjectId** | **String**| The ID of the project. | 
 **Limit** | **Int32**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
 **After** | **String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 

### Return type

[**ProjectApiKeyListResponse**](ProjectApiKeyListResponse.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-ListProjectRateLimits"></a>
# **Invoke-ListProjectRateLimits**
> ProjectRateLimitListResponse Invoke-ListProjectRateLimits<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ProjectId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Limit] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-After] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Before] <String><br>

Returns the rate limits per model for a project.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$ProjectId = "MyProjectId" # String | The ID of the project.
$Limit = 56 # Int32 | A limit on the number of objects to be returned. The default is 100.  (optional) (default to 100)
$After = "MyAfter" # String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
$Before = "MyBefore" # String | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, beginning with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (optional)

# Returns the rate limits per model for a project.
try {
    $Result = Invoke-ListProjectRateLimits -ProjectId $ProjectId -Limit $Limit -After $After -Before $Before
} catch {
    Write-Host ("Exception occurred when calling Invoke-ListProjectRateLimits: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ProjectId** | **String**| The ID of the project. | 
 **Limit** | **Int32**| A limit on the number of objects to be returned. The default is 100.  | [optional] [default to 100]
 **After** | **String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 
 **Before** | **String**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, beginning with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] 

### Return type

[**ProjectRateLimitListResponse**](ProjectRateLimitListResponse.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-ListProjectServiceAccounts"></a>
# **Invoke-ListProjectServiceAccounts**
> ProjectServiceAccountListResponse Invoke-ListProjectServiceAccounts<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ProjectId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Limit] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-After] <String><br>

Returns a list of service accounts in the project.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$ProjectId = "MyProjectId" # String | The ID of the project.
$Limit = 56 # Int32 | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional) (default to 20)
$After = "MyAfter" # String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)

# Returns a list of service accounts in the project.
try {
    $Result = Invoke-ListProjectServiceAccounts -ProjectId $ProjectId -Limit $Limit -After $After
} catch {
    Write-Host ("Exception occurred when calling Invoke-ListProjectServiceAccounts: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ProjectId** | **String**| The ID of the project. | 
 **Limit** | **Int32**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
 **After** | **String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 

### Return type

[**ProjectServiceAccountListResponse**](ProjectServiceAccountListResponse.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-ListProjectUsers"></a>
# **Invoke-ListProjectUsers**
> ProjectUserListResponse Invoke-ListProjectUsers<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ProjectId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Limit] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-After] <String><br>

Returns a list of users in the project.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$ProjectId = "MyProjectId" # String | The ID of the project.
$Limit = 56 # Int32 | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional) (default to 20)
$After = "MyAfter" # String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)

# Returns a list of users in the project.
try {
    $Result = Invoke-ListProjectUsers -ProjectId $ProjectId -Limit $Limit -After $After
} catch {
    Write-Host ("Exception occurred when calling Invoke-ListProjectUsers: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ProjectId** | **String**| The ID of the project. | 
 **Limit** | **Int32**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
 **After** | **String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 

### Return type

[**ProjectUserListResponse**](ProjectUserListResponse.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-ListProjects"></a>
# **Invoke-ListProjects**
> ProjectListResponse Invoke-ListProjects<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Limit] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-After] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-IncludeArchived] <System.Nullable[Boolean]><br>

Returns a list of projects.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$Limit = 56 # Int32 | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional) (default to 20)
$After = "MyAfter" # String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
$IncludeArchived = $true # Boolean | If `true` returns all projects including those that have been `archived`. Archived projects are not included by default. (optional) (default to $false)

# Returns a list of projects.
try {
    $Result = Invoke-ListProjects -Limit $Limit -After $After -IncludeArchived $IncludeArchived
} catch {
    Write-Host ("Exception occurred when calling Invoke-ListProjects: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Limit** | **Int32**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
 **After** | **String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 
 **IncludeArchived** | **Boolean**| If &#x60;true&#x60; returns all projects including those that have been &#x60;archived&#x60;. Archived projects are not included by default. | [optional] [default to $false]

### Return type

[**ProjectListResponse**](ProjectListResponse.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Edit-Project"></a>
# **Edit-Project**
> Project Edit-Project<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ProjectId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ProjectUpdateRequest] <PSCustomObject><br>

Modifies a project in the organization.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$ProjectId = "MyProjectId" # String | The ID of the project.
$ProjectUpdateRequest = Initialize-ProjectUpdateRequest -Name "MyName" # ProjectUpdateRequest | The project update request payload.

# Modifies a project in the organization.
try {
    $Result = Edit-Project -ProjectId $ProjectId -ProjectUpdateRequest $ProjectUpdateRequest
} catch {
    Write-Host ("Exception occurred when calling Edit-Project: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ProjectId** | **String**| The ID of the project. | 
 **ProjectUpdateRequest** | [**ProjectUpdateRequest**](ProjectUpdateRequest.md)| The project update request payload. | 

### Return type

[**Project**](Project.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Edit-ProjectUser"></a>
# **Edit-ProjectUser**
> ProjectUser Edit-ProjectUser<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ProjectId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-UserId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ProjectUserUpdateRequest] <PSCustomObject><br>

Modifies a user's role in the project.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$ProjectId = "MyProjectId" # String | The ID of the project.
$UserId = "MyUserId" # String | The ID of the user.
$ProjectUserUpdateRequest = Initialize-ProjectUserUpdateRequest -Role "owner" # ProjectUserUpdateRequest | The project user update request payload.

# Modifies a user's role in the project.
try {
    $Result = Edit-ProjectUser -ProjectId $ProjectId -UserId $UserId -ProjectUserUpdateRequest $ProjectUserUpdateRequest
} catch {
    Write-Host ("Exception occurred when calling Edit-ProjectUser: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ProjectId** | **String**| The ID of the project. | 
 **UserId** | **String**| The ID of the user. | 
 **ProjectUserUpdateRequest** | [**ProjectUserUpdateRequest**](ProjectUserUpdateRequest.md)| The project user update request payload. | 

### Return type

[**ProjectUser**](ProjectUser.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-RetrieveProject"></a>
# **Invoke-RetrieveProject**
> Project Invoke-RetrieveProject<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ProjectId] <String><br>

Retrieves a project.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$ProjectId = "MyProjectId" # String | The ID of the project.

# Retrieves a project.
try {
    $Result = Invoke-RetrieveProject -ProjectId $ProjectId
} catch {
    Write-Host ("Exception occurred when calling Invoke-RetrieveProject: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ProjectId** | **String**| The ID of the project. | 

### Return type

[**Project**](Project.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-RetrieveProjectApiKey"></a>
# **Invoke-RetrieveProjectApiKey**
> ProjectApiKey Invoke-RetrieveProjectApiKey<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ProjectId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-KeyId] <String><br>

Retrieves an API key in the project.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$ProjectId = "MyProjectId" # String | The ID of the project.
$KeyId = "MyKeyId" # String | The ID of the API key.

# Retrieves an API key in the project.
try {
    $Result = Invoke-RetrieveProjectApiKey -ProjectId $ProjectId -KeyId $KeyId
} catch {
    Write-Host ("Exception occurred when calling Invoke-RetrieveProjectApiKey: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ProjectId** | **String**| The ID of the project. | 
 **KeyId** | **String**| The ID of the API key. | 

### Return type

[**ProjectApiKey**](ProjectApiKey.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-RetrieveProjectServiceAccount"></a>
# **Invoke-RetrieveProjectServiceAccount**
> ProjectServiceAccount Invoke-RetrieveProjectServiceAccount<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ProjectId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ServiceAccountId] <String><br>

Retrieves a service account in the project.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$ProjectId = "MyProjectId" # String | The ID of the project.
$ServiceAccountId = "MyServiceAccountId" # String | The ID of the service account.

# Retrieves a service account in the project.
try {
    $Result = Invoke-RetrieveProjectServiceAccount -ProjectId $ProjectId -ServiceAccountId $ServiceAccountId
} catch {
    Write-Host ("Exception occurred when calling Invoke-RetrieveProjectServiceAccount: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ProjectId** | **String**| The ID of the project. | 
 **ServiceAccountId** | **String**| The ID of the service account. | 

### Return type

[**ProjectServiceAccount**](ProjectServiceAccount.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-RetrieveProjectUser"></a>
# **Invoke-RetrieveProjectUser**
> ProjectUser Invoke-RetrieveProjectUser<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ProjectId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-UserId] <String><br>

Retrieves a user in the project.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$ProjectId = "MyProjectId" # String | The ID of the project.
$UserId = "MyUserId" # String | The ID of the user.

# Retrieves a user in the project.
try {
    $Result = Invoke-RetrieveProjectUser -ProjectId $ProjectId -UserId $UserId
} catch {
    Write-Host ("Exception occurred when calling Invoke-RetrieveProjectUser: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ProjectId** | **String**| The ID of the project. | 
 **UserId** | **String**| The ID of the user. | 

### Return type

[**ProjectUser**](ProjectUser.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Update-ProjectRateLimits"></a>
# **Update-ProjectRateLimits**
> ProjectRateLimit Update-ProjectRateLimits<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ProjectId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-RateLimitId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ProjectRateLimitUpdateRequest] <PSCustomObject><br>

Updates a project rate limit.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$ProjectId = "MyProjectId" # String | The ID of the project.
$RateLimitId = "MyRateLimitId" # String | The ID of the rate limit.
$ProjectRateLimitUpdateRequest = Initialize-ProjectRateLimitUpdateRequest -MaxRequestsPer1Minute 0 -MaxTokensPer1Minute 0 -MaxImagesPer1Minute 0 -MaxAudioMegabytesPer1Minute 0 -MaxRequestsPer1Day 0 -Batch1DayMaxInputTokens 0 # ProjectRateLimitUpdateRequest | The project rate limit update request payload.

# Updates a project rate limit.
try {
    $Result = Update-ProjectRateLimits -ProjectId $ProjectId -RateLimitId $RateLimitId -ProjectRateLimitUpdateRequest $ProjectRateLimitUpdateRequest
} catch {
    Write-Host ("Exception occurred when calling Update-ProjectRateLimits: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ProjectId** | **String**| The ID of the project. | 
 **RateLimitId** | **String**| The ID of the rate limit. | 
 **ProjectRateLimitUpdateRequest** | [**ProjectRateLimitUpdateRequest**](ProjectRateLimitUpdateRequest.md)| The project rate limit update request payload. | 

### Return type

[**ProjectRateLimit**](ProjectRateLimit.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

