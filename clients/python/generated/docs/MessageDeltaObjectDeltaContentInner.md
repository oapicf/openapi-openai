# MessageDeltaObjectDeltaContentInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**index** | **int** | The index of the content part in the message. | 
**type** | **str** | Always &#x60;image_file&#x60;. | 
**image_file** | [**MessageDeltaContentImageFileObjectImageFile**](MessageDeltaContentImageFileObjectImageFile.md) |  | [optional] 
**text** | [**MessageDeltaContentTextObjectText**](MessageDeltaContentTextObjectText.md) |  | [optional] 

## Example

```python
from openapiopenai.models.message_delta_object_delta_content_inner import MessageDeltaObjectDeltaContentInner

# TODO update the JSON string below
json = "{}"
# create an instance of MessageDeltaObjectDeltaContentInner from a JSON string
message_delta_object_delta_content_inner_instance = MessageDeltaObjectDeltaContentInner.from_json(json)
# print the JSON string representation of the object
print(MessageDeltaObjectDeltaContentInner.to_json())

# convert the object into a dict
message_delta_object_delta_content_inner_dict = message_delta_object_delta_content_inner_instance.to_dict()
# create an instance of MessageDeltaObjectDeltaContentInner from a dict
message_delta_object_delta_content_inner_form_dict = message_delta_object_delta_content_inner.from_dict(message_delta_object_delta_content_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


