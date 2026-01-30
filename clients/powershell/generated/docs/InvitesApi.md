# PSOpenAPITools.PSOpenAPITools\Api.InvitesApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Invoke-DeleteInvite**](InvitesApi.md#Invoke-DeleteInvite) | **DELETE** /organization/invites/{invite_id} | Delete an invite. If the invite has already been accepted, it cannot be deleted.
[**ConvertTo-viteUser**](InvitesApi.md#ConvertTo-viteUser) | **POST** /organization/invites | Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.
[**Invoke-ListInvites**](InvitesApi.md#Invoke-ListInvites) | **GET** /organization/invites | Returns a list of invites in the organization.
[**Invoke-RetrieveInvite**](InvitesApi.md#Invoke-RetrieveInvite) | **GET** /organization/invites/{invite_id} | Retrieves an invite.


<a id="Invoke-DeleteInvite"></a>
# **Invoke-DeleteInvite**
> InviteDeleteResponse Invoke-DeleteInvite<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-InviteId] <String><br>

Delete an invite. If the invite has already been accepted, it cannot be deleted.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$InviteId = "MyInviteId" # String | The ID of the invite to delete.

# Delete an invite. If the invite has already been accepted, it cannot be deleted.
try {
    $Result = Invoke-DeleteInvite -InviteId $InviteId
} catch {
    Write-Host ("Exception occurred when calling Invoke-DeleteInvite: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **InviteId** | **String**| The ID of the invite to delete. | 

### Return type

[**InviteDeleteResponse**](InviteDeleteResponse.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="ConvertTo-viteUser"></a>
# **ConvertTo-viteUser**
> Invite ConvertTo-viteUser<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-InviteRequest] <PSCustomObject><br>

Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$InviteRequestProjectsInner = Initialize-InviteRequestProjectsInner -Id "MyId" -Role "member"
$InviteRequest = Initialize-InviteRequest -Email "MyEmail" -Role "reader" -Projects $InviteRequestProjectsInner # InviteRequest | The invite request payload.

# Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.
try {
    $Result = ConvertTo-viteUser -InviteRequest $InviteRequest
} catch {
    Write-Host ("Exception occurred when calling ConvertTo-viteUser: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **InviteRequest** | [**InviteRequest**](InviteRequest.md)| The invite request payload. | 

### Return type

[**Invite**](Invite.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-ListInvites"></a>
# **Invoke-ListInvites**
> InviteListResponse Invoke-ListInvites<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Limit] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-After] <String><br>

Returns a list of invites in the organization.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$Limit = 56 # Int32 | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional) (default to 20)
$After = "MyAfter" # String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)

# Returns a list of invites in the organization.
try {
    $Result = Invoke-ListInvites -Limit $Limit -After $After
} catch {
    Write-Host ("Exception occurred when calling Invoke-ListInvites: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Limit** | **Int32**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
 **After** | **String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 

### Return type

[**InviteListResponse**](InviteListResponse.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-RetrieveInvite"></a>
# **Invoke-RetrieveInvite**
> Invite Invoke-RetrieveInvite<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-InviteId] <String><br>

Retrieves an invite.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$InviteId = "MyInviteId" # String | The ID of the invite to retrieve.

# Retrieves an invite.
try {
    $Result = Invoke-RetrieveInvite -InviteId $InviteId
} catch {
    Write-Host ("Exception occurred when calling Invoke-RetrieveInvite: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **InviteId** | **String**| The ID of the invite to retrieve. | 

### Return type

[**Invite**](Invite.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

