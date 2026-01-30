# RealtimeServerEventRateLimitsUpdatedRateLimitsInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **String** | The name of the rate limit (&#x60;requests&#x60;, &#x60;tokens&#x60;).  | [optional] 
**Limit** | **Int32** | The maximum allowed value for the rate limit. | [optional] 
**Remaining** | **Int32** | The remaining value before the limit is reached. | [optional] 
**ResetSeconds** | **Decimal** | Seconds until the rate limit resets. | [optional] 

## Examples

- Prepare the resource
```powershell
$RealtimeServerEventRateLimitsUpdatedRateLimitsInner = Initialize-PSOpenAPIToolsRealtimeServerEventRateLimitsUpdatedRateLimitsInner  -Name null `
 -Limit null `
 -Remaining null `
 -ResetSeconds null
```

- Convert the resource to JSON
```powershell
$RealtimeServerEventRateLimitsUpdatedRateLimitsInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

