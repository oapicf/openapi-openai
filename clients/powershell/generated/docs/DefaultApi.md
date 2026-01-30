# PSOpenAPITools.PSOpenAPITools\Api.DefaultApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Invoke-AdminApiKeysCreate**](DefaultApi.md#Invoke-AdminApiKeysCreate) | **POST** /organization/admin_api_keys | Create an organization admin API key
[**Invoke-AdminApiKeysDelete**](DefaultApi.md#Invoke-AdminApiKeysDelete) | **DELETE** /organization/admin_api_keys/{key_id} | Delete an organization admin API key
[**Invoke-AdminApiKeysGet**](DefaultApi.md#Invoke-AdminApiKeysGet) | **GET** /organization/admin_api_keys/{key_id} | Retrieve a single organization API key
[**Invoke-AdminApiKeysList**](DefaultApi.md#Invoke-AdminApiKeysList) | **GET** /organization/admin_api_keys | List organization API keys


<a id="Invoke-AdminApiKeysCreate"></a>
# **Invoke-AdminApiKeysCreate**
> AdminApiKey Invoke-AdminApiKeysCreate<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdminApiKeysCreateRequest] <PSCustomObject><br>

Create an organization admin API key

Create a new admin-level API key for the organization.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$AdminApiKeysCreateRequest = Initialize-AdminApiKeysCreateRequest -Name "New Admin Key" # AdminApiKeysCreateRequest | 

# Create an organization admin API key
try {
    $Result = Invoke-AdminApiKeysCreate -AdminApiKeysCreateRequest $AdminApiKeysCreateRequest
} catch {
    Write-Host ("Exception occurred when calling Invoke-AdminApiKeysCreate: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdminApiKeysCreateRequest** | [**AdminApiKeysCreateRequest**](AdminApiKeysCreateRequest.md)|  | 

### Return type

[**AdminApiKey**](AdminApiKey.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-AdminApiKeysDelete"></a>
# **Invoke-AdminApiKeysDelete**
> AdminApiKeysDelete200Response Invoke-AdminApiKeysDelete<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-KeyId] <String><br>

Delete an organization admin API key

Delete the specified admin API key.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$KeyId = "MyKeyId" # String | 

# Delete an organization admin API key
try {
    $Result = Invoke-AdminApiKeysDelete -KeyId $KeyId
} catch {
    Write-Host ("Exception occurred when calling Invoke-AdminApiKeysDelete: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **KeyId** | **String**|  | 

### Return type

[**AdminApiKeysDelete200Response**](AdminApiKeysDelete200Response.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-AdminApiKeysGet"></a>
# **Invoke-AdminApiKeysGet**
> AdminApiKey Invoke-AdminApiKeysGet<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-KeyId] <String><br>

Retrieve a single organization API key

Get details for a specific organization API key by its ID.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$KeyId = "MyKeyId" # String | 

# Retrieve a single organization API key
try {
    $Result = Invoke-AdminApiKeysGet -KeyId $KeyId
} catch {
    Write-Host ("Exception occurred when calling Invoke-AdminApiKeysGet: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **KeyId** | **String**|  | 

### Return type

[**AdminApiKey**](AdminApiKey.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-AdminApiKeysList"></a>
# **Invoke-AdminApiKeysList**
> ApiKeyList Invoke-AdminApiKeysList<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-After] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Order] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Limit] <System.Nullable[Int32]><br>

List organization API keys

Retrieve a paginated list of organization admin API keys.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$After = "MyAfter" # String |  (optional)
$Order = "asc" # String |  (optional) (default to "asc")
$Limit = 56 # Int32 |  (optional) (default to 20)

# List organization API keys
try {
    $Result = Invoke-AdminApiKeysList -After $After -Order $Order -Limit $Limit
} catch {
    Write-Host ("Exception occurred when calling Invoke-AdminApiKeysList: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **After** | **String**|  | [optional] 
 **Order** | **String**|  | [optional] [default to &quot;asc&quot;]
 **Limit** | **Int32**|  | [optional] [default to 20]

### Return type

[**ApiKeyList**](ApiKeyList.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

