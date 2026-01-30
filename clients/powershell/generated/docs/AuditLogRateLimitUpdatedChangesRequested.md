# AuditLogRateLimitUpdatedChangesRequested
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MaxRequestsPer1Minute** | **Int32** | The maximum requests per minute. | [optional] 
**MaxTokensPer1Minute** | **Int32** | The maximum tokens per minute. | [optional] 
**MaxImagesPer1Minute** | **Int32** | The maximum images per minute. Only relevant for certain models. | [optional] 
**MaxAudioMegabytesPer1Minute** | **Int32** | The maximum audio megabytes per minute. Only relevant for certain models. | [optional] 
**MaxRequestsPer1Day** | **Int32** | The maximum requests per day. Only relevant for certain models. | [optional] 
**Batch1DayMaxInputTokens** | **Int32** | The maximum batch input tokens per day. Only relevant for certain models. | [optional] 

## Examples

- Prepare the resource
```powershell
$AuditLogRateLimitUpdatedChangesRequested = Initialize-PSOpenAPIToolsAuditLogRateLimitUpdatedChangesRequested  -MaxRequestsPer1Minute null `
 -MaxTokensPer1Minute null `
 -MaxImagesPer1Minute null `
 -MaxAudioMegabytesPer1Minute null `
 -MaxRequestsPer1Day null `
 -Batch1DayMaxInputTokens null
```

- Convert the resource to JSON
```powershell
$AuditLogRateLimitUpdatedChangesRequested | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

