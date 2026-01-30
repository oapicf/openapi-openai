# MessageObject

Represents a message within a [thread](/docs/api-reference/threads).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | The identifier, which can be referenced in API endpoints. | 
**object** | **str** | The object type, which is always &#x60;thread.message&#x60;. | 
**created_at** | **int** | The Unix timestamp (in seconds) for when the message was created. | 
**thread_id** | **str** | The [thread](/docs/api-reference/threads) ID that this message belongs to. | 
**status** | **str** | The status of the message, which can be either &#x60;in_progress&#x60;, &#x60;incomplete&#x60;, or &#x60;completed&#x60;. | 
**incomplete_details** | [**MessageObjectIncompleteDetails**](MessageObjectIncompleteDetails.md) |  | 
**completed_at** | **int** | The Unix timestamp (in seconds) for when the message was completed. | 
**incomplete_at** | **int** | The Unix timestamp (in seconds) for when the message was marked as incomplete. | 
**role** | **str** | The entity that produced the message. One of &#x60;user&#x60; or &#x60;assistant&#x60;. | 
**content** | [**List[MessageObjectContentInner]**](MessageObjectContentInner.md) | The content of the message in array of text and/or images. | 
**assistant_id** | **str** | If applicable, the ID of the [assistant](/docs/api-reference/assistants) that authored this message. | 
**run_id** | **str** | The ID of the [run](/docs/api-reference/runs) associated with the creation of this message. Value is &#x60;null&#x60; when messages are created manually using the create message or create thread endpoints. | 
**attachments** | [**List[CreateMessageRequestAttachmentsInner]**](CreateMessageRequestAttachmentsInner.md) | A list of files attached to the message, and the tools they were added to. | 
**metadata** | **object** | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  | 

## Example

```python
from openapiopenai.models.message_object import MessageObject

# TODO update the JSON string below
json = "{}"
# create an instance of MessageObject from a JSON string
message_object_instance = MessageObject.from_json(json)
# print the JSON string representation of the object
print(MessageObject.to_json())

# convert the object into a dict
message_object_dict = message_object_instance.to_dict()
# create an instance of MessageObject from a dict
message_object_from_dict = MessageObject.from_dict(message_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


