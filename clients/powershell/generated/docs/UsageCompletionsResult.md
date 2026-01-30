# UsageCompletionsResult
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Object** | **String** |  | 
**InputTokens** | **Int32** | The aggregated number of text input tokens used, including cached tokens. For customers subscribe to scale tier, this includes scale tier tokens. | 
**InputCachedTokens** | **Int32** | The aggregated number of text input tokens that has been cached from previous requests. For customers subscribe to scale tier, this includes scale tier tokens. | [optional] 
**OutputTokens** | **Int32** | The aggregated number of text output tokens used. For customers subscribe to scale tier, this includes scale tier tokens. | 
**InputAudioTokens** | **Int32** | The aggregated number of audio input tokens used, including cached tokens. | [optional] 
**OutputAudioTokens** | **Int32** | The aggregated number of audio output tokens used. | [optional] 
**NumModelRequests** | **Int32** | The count of requests made to the model. | 
**ProjectId** | **String** | When &#x60;group_by&#x3D;project_id&#x60;, this field provides the project ID of the grouped usage result. | [optional] 
**UserId** | **String** | When &#x60;group_by&#x3D;user_id&#x60;, this field provides the user ID of the grouped usage result. | [optional] 
**ApiKeyId** | **String** | When &#x60;group_by&#x3D;api_key_id&#x60;, this field provides the API key ID of the grouped usage result. | [optional] 
**Model** | **String** | When &#x60;group_by&#x3D;model&#x60;, this field provides the model name of the grouped usage result. | [optional] 
**Batch** | **Boolean** | When &#x60;group_by&#x3D;batch&#x60;, this field tells whether the grouped usage result is batch or not. | [optional] 

## Examples

- Prepare the resource
```powershell
$UsageCompletionsResult = Initialize-PSOpenAPIToolsUsageCompletionsResult  -Object null `
 -InputTokens null `
 -InputCachedTokens null `
 -OutputTokens null `
 -InputAudioTokens null `
 -OutputAudioTokens null `
 -NumModelRequests null `
 -ProjectId null `
 -UserId null `
 -ApiKeyId null `
 -Model null `
 -Batch null
```

- Convert the resource to JSON
```powershell
$UsageCompletionsResult | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

