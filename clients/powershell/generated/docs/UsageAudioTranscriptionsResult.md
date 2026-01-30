# UsageAudioTranscriptionsResult
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Object** | **String** |  | 
**Seconds** | **Int32** | The number of seconds processed. | 
**NumModelRequests** | **Int32** | The count of requests made to the model. | 
**ProjectId** | **String** | When &#x60;group_by&#x3D;project_id&#x60;, this field provides the project ID of the grouped usage result. | [optional] 
**UserId** | **String** | When &#x60;group_by&#x3D;user_id&#x60;, this field provides the user ID of the grouped usage result. | [optional] 
**ApiKeyId** | **String** | When &#x60;group_by&#x3D;api_key_id&#x60;, this field provides the API key ID of the grouped usage result. | [optional] 
**Model** | **String** | When &#x60;group_by&#x3D;model&#x60;, this field provides the model name of the grouped usage result. | [optional] 

## Examples

- Prepare the resource
```powershell
$UsageAudioTranscriptionsResult = Initialize-PSOpenAPIToolsUsageAudioTranscriptionsResult  -Object null `
 -Seconds null `
 -NumModelRequests null `
 -ProjectId null `
 -UserId null `
 -ApiKeyId null `
 -Model null
```

- Convert the resource to JSON
```powershell
$UsageAudioTranscriptionsResult | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

