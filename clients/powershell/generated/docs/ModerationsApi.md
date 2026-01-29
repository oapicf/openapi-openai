# PSOpenAPITools.PSOpenAPITools\Api.ModerationsApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**New-Moderation**](ModerationsApi.md#New-Moderation) | **POST** /moderations | Classifies if text is potentially harmful.


<a id="New-Moderation"></a>
# **New-Moderation**
> CreateModerationResponse New-Moderation<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CreateModerationRequest] <PSCustomObject><br>

Classifies if text is potentially harmful.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$CreateModerationRequestInput = Initialize-CreateModerationRequestInput 
$CreateModerationRequestModel = Initialize-CreateModerationRequestModel 
$CreateModerationRequest = Initialize-CreateModerationRequest -VarInput $CreateModerationRequestInput -Model $CreateModerationRequestModel # CreateModerationRequest | 

# Classifies if text is potentially harmful.
try {
    $Result = New-Moderation -CreateModerationRequest $CreateModerationRequest
} catch {
    Write-Host ("Exception occurred when calling New-Moderation: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **CreateModerationRequest** | [**CreateModerationRequest**](CreateModerationRequest.md)|  | 

### Return type

[**CreateModerationResponse**](CreateModerationResponse.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

