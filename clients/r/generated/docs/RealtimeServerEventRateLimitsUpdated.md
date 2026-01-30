# openapi::RealtimeServerEventRateLimitsUpdated

Emitted at the beginning of a Response to indicate the updated rate limits.  When a Response is created some tokens will be \"reserved\" for the output  tokens, the rate limits shown here reflect that reservation, which is then  adjusted accordingly once the Response is completed. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **character** | The unique ID of the server event. | 
**type** | **character** | The event type, must be &#x60;rate_limits.updated&#x60;. | [Enum: [rate_limits.updated]] 
**rate_limits** | [**array[RealtimeServerEventRateLimitsUpdatedRateLimitsInner]**](RealtimeServerEventRateLimitsUpdated_rate_limits_inner.md) | List of rate limit information. | 


