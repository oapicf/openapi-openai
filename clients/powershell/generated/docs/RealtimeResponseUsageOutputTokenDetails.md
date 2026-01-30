# RealtimeResponseUsageOutputTokenDetails
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**TextTokens** | **Int32** | The number of text tokens used in the Response. | [optional] 
**AudioTokens** | **Int32** | The number of audio tokens used in the Response. | [optional] 

## Examples

- Prepare the resource
```powershell
$RealtimeResponseUsageOutputTokenDetails = Initialize-PSOpenAPIToolsRealtimeResponseUsageOutputTokenDetails  -TextTokens null `
 -AudioTokens null
```

- Convert the resource to JSON
```powershell
$RealtimeResponseUsageOutputTokenDetails | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

