# RealtimeResponseCreateParamsConversation

Controls which conversation the response is added to. Currently supports `auto` and `none`, with `auto` as the default value. The `auto` value means that the contents of the response will be added to the default conversation. Set this to `none` to create an out-of-band response which  will not add items to default conversation. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------

## Example

```python
from openapiopenai.models.realtime_response_create_params_conversation import RealtimeResponseCreateParamsConversation

# TODO update the JSON string below
json = "{}"
# create an instance of RealtimeResponseCreateParamsConversation from a JSON string
realtime_response_create_params_conversation_instance = RealtimeResponseCreateParamsConversation.from_json(json)
# print the JSON string representation of the object
print(RealtimeResponseCreateParamsConversation.to_json())

# convert the object into a dict
realtime_response_create_params_conversation_dict = realtime_response_create_params_conversation_instance.to_dict()
# create an instance of RealtimeResponseCreateParamsConversation from a dict
realtime_response_create_params_conversation_from_dict = RealtimeResponseCreateParamsConversation.from_dict(realtime_response_create_params_conversation_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


