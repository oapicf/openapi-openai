# OpenapiOpenai.RealtimeServerEventRateLimitsUpdatedRateLimitsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name of the rate limit (&#x60;requests&#x60;, &#x60;tokens&#x60;).  | [optional] 
**limit** | **Number** | The maximum allowed value for the rate limit. | [optional] 
**remaining** | **Number** | The remaining value before the limit is reached. | [optional] 
**resetSeconds** | **Number** | Seconds until the rate limit resets. | [optional] 



## Enum: NameEnum


* `requests` (value: `"requests"`)

* `tokens` (value: `"tokens"`)




