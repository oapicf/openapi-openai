# MessageObjectIncompleteDetails

On an incomplete message, details about why the message is incomplete.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reason** | **str** | The reason the message is incomplete. | 

## Example

```python
from openapiopenai.models.message_object_incomplete_details import MessageObjectIncompleteDetails

# TODO update the JSON string below
json = "{}"
# create an instance of MessageObjectIncompleteDetails from a JSON string
message_object_incomplete_details_instance = MessageObjectIncompleteDetails.from_json(json)
# print the JSON string representation of the object
print(MessageObjectIncompleteDetails.to_json())

# convert the object into a dict
message_object_incomplete_details_dict = message_object_incomplete_details_instance.to_dict()
# create an instance of MessageObjectIncompleteDetails from a dict
message_object_incomplete_details_form_dict = message_object_incomplete_details.from_dict(message_object_incomplete_details_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


