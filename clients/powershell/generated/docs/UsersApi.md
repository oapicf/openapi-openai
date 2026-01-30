# PSOpenAPITools.PSOpenAPITools\Api.UsersApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Invoke-DeleteUser**](UsersApi.md#Invoke-DeleteUser) | **DELETE** /organization/users/{user_id} | Deletes a user from the organization.
[**Invoke-ListUsers**](UsersApi.md#Invoke-ListUsers) | **GET** /organization/users | Lists all of the users in the organization.
[**Edit-User**](UsersApi.md#Edit-User) | **POST** /organization/users/{user_id} | Modifies a user&#39;s role in the organization.
[**Invoke-RetrieveUser**](UsersApi.md#Invoke-RetrieveUser) | **GET** /organization/users/{user_id} | Retrieves a user by their identifier.


<a id="Invoke-DeleteUser"></a>
# **Invoke-DeleteUser**
> UserDeleteResponse Invoke-DeleteUser<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-UserId] <String><br>

Deletes a user from the organization.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$UserId = "MyUserId" # String | The ID of the user.

# Deletes a user from the organization.
try {
    $Result = Invoke-DeleteUser -UserId $UserId
} catch {
    Write-Host ("Exception occurred when calling Invoke-DeleteUser: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **UserId** | **String**| The ID of the user. | 

### Return type

[**UserDeleteResponse**](UserDeleteResponse.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-ListUsers"></a>
# **Invoke-ListUsers**
> UserListResponse Invoke-ListUsers<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Limit] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-After] <String><br>

Lists all of the users in the organization.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$Limit = 56 # Int32 | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional) (default to 20)
$After = "MyAfter" # String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)

# Lists all of the users in the organization.
try {
    $Result = Invoke-ListUsers -Limit $Limit -After $After
} catch {
    Write-Host ("Exception occurred when calling Invoke-ListUsers: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Limit** | **Int32**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
 **After** | **String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 

### Return type

[**UserListResponse**](UserListResponse.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Edit-User"></a>
# **Edit-User**
> User Edit-User<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-UserId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-UserRoleUpdateRequest] <PSCustomObject><br>

Modifies a user's role in the organization.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$UserId = "MyUserId" # String | The ID of the user.
$UserRoleUpdateRequest = Initialize-UserRoleUpdateRequest -Role "owner" # UserRoleUpdateRequest | The new user role to modify. This must be one of `owner` or `member`.

# Modifies a user's role in the organization.
try {
    $Result = Edit-User -UserId $UserId -UserRoleUpdateRequest $UserRoleUpdateRequest
} catch {
    Write-Host ("Exception occurred when calling Edit-User: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **UserId** | **String**| The ID of the user. | 
 **UserRoleUpdateRequest** | [**UserRoleUpdateRequest**](UserRoleUpdateRequest.md)| The new user role to modify. This must be one of &#x60;owner&#x60; or &#x60;member&#x60;. | 

### Return type

[**User**](User.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-RetrieveUser"></a>
# **Invoke-RetrieveUser**
> User Invoke-RetrieveUser<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-UserId] <String><br>

Retrieves a user by their identifier.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$UserId = "MyUserId" # String | The ID of the user.

# Retrieves a user by their identifier.
try {
    $Result = Invoke-RetrieveUser -UserId $UserId
} catch {
    Write-Host ("Exception occurred when calling Invoke-RetrieveUser: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **UserId** | **String**| The ID of the user. | 

### Return type

[**User**](User.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

