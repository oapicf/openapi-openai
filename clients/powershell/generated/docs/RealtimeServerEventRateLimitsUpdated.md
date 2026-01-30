# RealtimeServerEventRateLimitsUpdated
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EventId** | **String** | The unique ID of the server event. | 
**Type** | **String** | The event type, must be &#x60;rate_limits.updated&#x60;. | 
**RateLimits** | [**RealtimeServerEventRateLimitsUpdatedRateLimitsInner[]**](RealtimeServerEventRateLimitsUpdatedRateLimitsInner.md) | List of rate limit information. | 

## Examples

- Prepare the resource
```powershell
$RealtimeServerEventRateLimitsUpdated = Initialize-PSOpenAPIToolsRealtimeServerEventRateLimitsUpdated  -EventId null `
 -Type null `
 -RateLimits null
```

- Convert the resource to JSON
```powershell
$RealtimeServerEventRateLimitsUpdated | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

