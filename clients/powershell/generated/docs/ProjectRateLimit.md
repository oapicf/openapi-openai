# ProjectRateLimit
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Object** | **String** | The object type, which is always &#x60;project.rate_limit&#x60; | 
**Id** | **String** | The identifier, which can be referenced in API endpoints. | 
**Model** | **String** | The model this rate limit applies to. | 
**MaxRequestsPer1Minute** | **Int32** | The maximum requests per minute. | 
**MaxTokensPer1Minute** | **Int32** | The maximum tokens per minute. | 
**MaxImagesPer1Minute** | **Int32** | The maximum images per minute. Only present for relevant models. | [optional] 
**MaxAudioMegabytesPer1Minute** | **Int32** | The maximum audio megabytes per minute. Only present for relevant models. | [optional] 
**MaxRequestsPer1Day** | **Int32** | The maximum requests per day. Only present for relevant models. | [optional] 
**Batch1DayMaxInputTokens** | **Int32** | The maximum batch input tokens per day. Only present for relevant models. | [optional] 

## Examples

- Prepare the resource
```powershell
$ProjectRateLimit = Initialize-PSOpenAPIToolsProjectRateLimit  -Object null `
 -Id null `
 -Model null `
 -MaxRequestsPer1Minute null `
 -MaxTokensPer1Minute null `
 -MaxImagesPer1Minute null `
 -MaxAudioMegabytesPer1Minute null `
 -MaxRequestsPer1Day null `
 -Batch1DayMaxInputTokens null
```

- Convert the resource to JSON
```powershell
$ProjectRateLimit | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

