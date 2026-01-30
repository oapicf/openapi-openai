
# RealtimeServerEventRateLimitsUpdatedRateLimitsInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | [**inline**](#Name) | The name of the rate limit (&#x60;requests&#x60;, &#x60;tokens&#x60;).  |  [optional] |
| **limit** | **kotlin.Int** | The maximum allowed value for the rate limit. |  [optional] |
| **remaining** | **kotlin.Int** | The remaining value before the limit is reached. |  [optional] |
| **resetSeconds** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Seconds until the rate limit resets. |  [optional] |


<a id="Name"></a>
## Enum: name
| Name | Value |
| ---- | ----- |
| name | requests, tokens |



