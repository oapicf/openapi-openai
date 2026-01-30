

# RealtimeServerEventRateLimitsUpdated

Emitted at the beginning of a Response to indicate the updated rate limits.  When a Response is created some tokens will be \"reserved\" for the output  tokens, the rate limits shown here reflect that reservation, which is then  adjusted accordingly once the Response is completed. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**eventId** | **String** | The unique ID of the server event. |  |
|**type** | [**TypeEnum**](#TypeEnum) | The event type, must be &#x60;rate_limits.updated&#x60;. |  |
|**rateLimits** | [**List&lt;RealtimeServerEventRateLimitsUpdatedRateLimitsInner&gt;**](RealtimeServerEventRateLimitsUpdatedRateLimitsInner.md) | List of rate limit information. |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| RATE_LIMITS_UPDATED | &quot;rate_limits.updated&quot; |



