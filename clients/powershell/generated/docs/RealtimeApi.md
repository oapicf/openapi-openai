# PSOpenAPITools.PSOpenAPITools\Api.RealtimeApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**New-RealtimeSession**](RealtimeApi.md#New-RealtimeSession) | **POST** /realtime/sessions | Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the &#x60;session.update&#x60; client event.  It responds with a session object, plus a &#x60;client_secret&#x60; key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API. 


<a id="New-RealtimeSession"></a>
# **New-RealtimeSession**
> RealtimeSessionCreateResponse New-RealtimeSession<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-RealtimeSessionCreateRequest] <PSCustomObject><br>

Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the `session.update` client event.  It responds with a session object, plus a `client_secret` key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API. 

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

"text"
$RealtimeSessionInputAudioTranscription = Initialize-RealtimeSessionInputAudioTranscription -Model "MyModel"
$RealtimeSessionCreateRequestTurnDetection = Initialize-RealtimeSessionCreateRequestTurnDetection -Type "MyType" -Threshold 0 -PrefixPaddingMs 0 -SilenceDurationMs 0 -CreateResponse $false
$RealtimeResponseCreateParamsToolsInner = Initialize-RealtimeResponseCreateParamsToolsInner -Type "function" -Name "MyName" -Description "MyDescription" -Parameters 
$RealtimeResponseCreateParamsMaxResponseOutputTokens = Initialize-RealtimeResponseCreateParamsMaxResponseOutputTokens 
$RealtimeSessionCreateRequest = Initialize-RealtimeSessionCreateRequest -Modalities "text" -Model "gpt-4o-realtime-preview" -Instructions "MyInstructions" -Voice "alloy" -InputAudioFormat "pcm16" -OutputAudioFormat "pcm16" -InputAudioTranscription $RealtimeSessionInputAudioTranscription -TurnDetection $RealtimeSessionCreateRequestTurnDetection -Tools $RealtimeResponseCreateParamsToolsInner -ToolChoice "MyToolChoice" -Temperature 0 -MaxResponseOutputTokens $RealtimeResponseCreateParamsMaxResponseOutputTokens # RealtimeSessionCreateRequest | Create an ephemeral API key with the given session configuration.

# Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the `session.update` client event.  It responds with a session object, plus a `client_secret` key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API. 
try {
    $Result = New-RealtimeSession -RealtimeSessionCreateRequest $RealtimeSessionCreateRequest
} catch {
    Write-Host ("Exception occurred when calling New-RealtimeSession: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **RealtimeSessionCreateRequest** | [**RealtimeSessionCreateRequest**](RealtimeSessionCreateRequest.md)| Create an ephemeral API key with the given session configuration. | 

### Return type

[**RealtimeSessionCreateResponse**](RealtimeSessionCreateResponse.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

