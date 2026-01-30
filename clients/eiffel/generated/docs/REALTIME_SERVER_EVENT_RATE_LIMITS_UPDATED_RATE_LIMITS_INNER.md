# REALTIME_SERVER_EVENT_RATE_LIMITS_UPDATED_RATE_LIMITS_INNER

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | [**STRING_32**](STRING_32.md) | The name of the rate limit (&#x60;requests&#x60;, &#x60;tokens&#x60;).  | [optional] [default to null]
**limit** | **INTEGER_32** | The maximum allowed value for the rate limit. | [optional] [default to null]
**remaining** | **INTEGER_32** | The remaining value before the limit is reached. | [optional] [default to null]
**reset_seconds** | **REAL_32** | Seconds until the rate limit resets. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


