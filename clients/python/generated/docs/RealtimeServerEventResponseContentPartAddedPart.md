# RealtimeServerEventResponseContentPartAddedPart

The content part that was added.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** | The content type (\&quot;text\&quot;, \&quot;audio\&quot;). | [optional] 
**text** | **str** | The text content (if type is \&quot;text\&quot;). | [optional] 
**audio** | **str** | Base64-encoded audio data (if type is \&quot;audio\&quot;). | [optional] 
**transcript** | **str** | The transcript of the audio (if type is \&quot;audio\&quot;). | [optional] 

## Example

```python
from openapiopenai.models.realtime_server_event_response_content_part_added_part import RealtimeServerEventResponseContentPartAddedPart

# TODO update the JSON string below
json = "{}"
# create an instance of RealtimeServerEventResponseContentPartAddedPart from a JSON string
realtime_server_event_response_content_part_added_part_instance = RealtimeServerEventResponseContentPartAddedPart.from_json(json)
# print the JSON string representation of the object
print(RealtimeServerEventResponseContentPartAddedPart.to_json())

# convert the object into a dict
realtime_server_event_response_content_part_added_part_dict = realtime_server_event_response_content_part_added_part_instance.to_dict()
# create an instance of RealtimeServerEventResponseContentPartAddedPart from a dict
realtime_server_event_response_content_part_added_part_from_dict = RealtimeServerEventResponseContentPartAddedPart.from_dict(realtime_server_event_response_content_part_added_part_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


