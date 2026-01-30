# RealtimeServerEventRateLimitsUpdated

Emitted at the beginning of a Response to indicate the updated rate limits.  When a Response is created some tokens will be \"reserved\" for the output  tokens, the rate limits shown here reflect that reservation, which is then  adjusted accordingly once the Response is completed. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **str** | The unique ID of the server event. | 
**type** | **str** | The event type, must be &#x60;rate_limits.updated&#x60;. | 
**rate_limits** | [**List[RealtimeServerEventRateLimitsUpdatedRateLimitsInner]**](RealtimeServerEventRateLimitsUpdatedRateLimitsInner.md) | List of rate limit information. | 

## Example

```python
from openapiopenai.models.realtime_server_event_rate_limits_updated import RealtimeServerEventRateLimitsUpdated

# TODO update the JSON string below
json = "{}"
# create an instance of RealtimeServerEventRateLimitsUpdated from a JSON string
realtime_server_event_rate_limits_updated_instance = RealtimeServerEventRateLimitsUpdated.from_json(json)
# print the JSON string representation of the object
print(RealtimeServerEventRateLimitsUpdated.to_json())

# convert the object into a dict
realtime_server_event_rate_limits_updated_dict = realtime_server_event_rate_limits_updated_instance.to_dict()
# create an instance of RealtimeServerEventRateLimitsUpdated from a dict
realtime_server_event_rate_limits_updated_from_dict = RealtimeServerEventRateLimitsUpdated.from_dict(realtime_server_event_rate_limits_updated_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


