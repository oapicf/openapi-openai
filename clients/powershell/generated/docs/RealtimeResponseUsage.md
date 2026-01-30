# RealtimeResponseUsage
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**TotalTokens** | **Int32** | The total number of tokens in the Response including input and output  text and audio tokens.  | [optional] 
**InputTokens** | **Int32** | The number of input tokens used in the Response, including text and  audio tokens.  | [optional] 
**OutputTokens** | **Int32** | The number of output tokens sent in the Response, including text and  audio tokens.  | [optional] 
**InputTokenDetails** | [**RealtimeResponseUsageInputTokenDetails**](RealtimeResponseUsageInputTokenDetails.md) |  | [optional] 
**OutputTokenDetails** | [**RealtimeResponseUsageOutputTokenDetails**](RealtimeResponseUsageOutputTokenDetails.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$RealtimeResponseUsage = Initialize-PSOpenAPIToolsRealtimeResponseUsage  -TotalTokens null `
 -InputTokens null `
 -OutputTokens null `
 -InputTokenDetails null `
 -OutputTokenDetails null
```

- Convert the resource to JSON
```powershell
$RealtimeResponseUsage | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

