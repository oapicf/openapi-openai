# MessageObjectContentInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** | Always &#x60;image_file&#x60;. | 
**image_file** | [**MessageContentImageFileObjectImageFile**](MessageContentImageFileObjectImageFile.md) |  | 
**text** | [**MessageContentTextObjectText**](MessageContentTextObjectText.md) |  | 

## Example

```python
from openapiopenai.models.message_object_content_inner import MessageObjectContentInner

# TODO update the JSON string below
json = "{}"
# create an instance of MessageObjectContentInner from a JSON string
message_object_content_inner_instance = MessageObjectContentInner.from_json(json)
# print the JSON string representation of the object
print(MessageObjectContentInner.to_json())

# convert the object into a dict
message_object_content_inner_dict = message_object_content_inner_instance.to_dict()
# create an instance of MessageObjectContentInner from a dict
message_object_content_inner_form_dict = message_object_content_inner.from_dict(message_object_content_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


