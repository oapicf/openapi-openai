# RealtimeConversationItemContentInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** | The content type (&#x60;input_text&#x60;, &#x60;input_audio&#x60;, &#x60;item_reference&#x60;, &#x60;text&#x60;).  | [optional] 
**text** | **str** | The text content, used for &#x60;input_text&#x60; and &#x60;text&#x60; content types.  | [optional] 
**id** | **str** | ID of a previous conversation item to reference (for &#x60;item_reference&#x60; content types in &#x60;response.create&#x60; events). These can reference both client and server created items.  | [optional] 
**audio** | **str** | Base64-encoded audio bytes, used for &#x60;input_audio&#x60; content type.  | [optional] 
**transcript** | **str** | The transcript of the audio, used for &#x60;input_audio&#x60; content type.  | [optional] 

## Example

```python
from openapiopenai.models.realtime_conversation_item_content_inner import RealtimeConversationItemContentInner

# TODO update the JSON string below
json = "{}"
# create an instance of RealtimeConversationItemContentInner from a JSON string
realtime_conversation_item_content_inner_instance = RealtimeConversationItemContentInner.from_json(json)
# print the JSON string representation of the object
print(RealtimeConversationItemContentInner.to_json())

# convert the object into a dict
realtime_conversation_item_content_inner_dict = realtime_conversation_item_content_inner_instance.to_dict()
# create an instance of RealtimeConversationItemContentInner from a dict
realtime_conversation_item_content_inner_from_dict = RealtimeConversationItemContentInner.from_dict(realtime_conversation_item_content_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


