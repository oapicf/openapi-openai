# RealtimeServerEventRateLimitsUpdatedRateLimitsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | The name of the rate limit (&#x60;requests&#x60;, &#x60;tokens&#x60;).  | [optional] 
**limit** | **int** | The maximum allowed value for the rate limit. | [optional] 
**remaining** | **int** | The remaining value before the limit is reached. | [optional] 
**reset_seconds** | **float** | Seconds until the rate limit resets. | [optional] 

## Example

```python
from openapiopenai.models.realtime_server_event_rate_limits_updated_rate_limits_inner import RealtimeServerEventRateLimitsUpdatedRateLimitsInner

# TODO update the JSON string below
json = "{}"
# create an instance of RealtimeServerEventRateLimitsUpdatedRateLimitsInner from a JSON string
realtime_server_event_rate_limits_updated_rate_limits_inner_instance = RealtimeServerEventRateLimitsUpdatedRateLimitsInner.from_json(json)
# print the JSON string representation of the object
print(RealtimeServerEventRateLimitsUpdatedRateLimitsInner.to_json())

# convert the object into a dict
realtime_server_event_rate_limits_updated_rate_limits_inner_dict = realtime_server_event_rate_limits_updated_rate_limits_inner_instance.to_dict()
# create an instance of RealtimeServerEventRateLimitsUpdatedRateLimitsInner from a dict
realtime_server_event_rate_limits_updated_rate_limits_inner_from_dict = RealtimeServerEventRateLimitsUpdatedRateLimitsInner.from_dict(realtime_server_event_rate_limits_updated_rate_limits_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


