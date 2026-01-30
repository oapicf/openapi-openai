# CreateMessageRequestAttachmentsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**file_id** | **str** | The ID of the file to attach to the message. | [optional] 
**tools** | [**List[CreateMessageRequestAttachmentsInnerToolsInner]**](CreateMessageRequestAttachmentsInnerToolsInner.md) | The tools to add this file to. | [optional] 

## Example

```python
from openapiopenai.models.create_message_request_attachments_inner import CreateMessageRequestAttachmentsInner

# TODO update the JSON string below
json = "{}"
# create an instance of CreateMessageRequestAttachmentsInner from a JSON string
create_message_request_attachments_inner_instance = CreateMessageRequestAttachmentsInner.from_json(json)
# print the JSON string representation of the object
print(CreateMessageRequestAttachmentsInner.to_json())

# convert the object into a dict
create_message_request_attachments_inner_dict = create_message_request_attachments_inner_instance.to_dict()
# create an instance of CreateMessageRequestAttachmentsInner from a dict
create_message_request_attachments_inner_from_dict = CreateMessageRequestAttachmentsInner.from_dict(create_message_request_attachments_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


