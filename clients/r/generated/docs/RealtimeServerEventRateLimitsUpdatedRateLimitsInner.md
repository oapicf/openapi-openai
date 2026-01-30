# openapi::RealtimeServerEventRateLimitsUpdatedRateLimitsInner


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **character** | The name of the rate limit (&#x60;requests&#x60;, &#x60;tokens&#x60;).  | [optional] [Enum: [requests, tokens]] 
**limit** | **integer** | The maximum allowed value for the rate limit. | [optional] 
**remaining** | **integer** | The remaining value before the limit is reached. | [optional] 
**reset_seconds** | **numeric** | Seconds until the rate limit resets. | [optional] 


