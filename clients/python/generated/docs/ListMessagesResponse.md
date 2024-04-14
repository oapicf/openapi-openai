# ListMessagesResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **str** |  | 
**data** | [**List[MessageObject]**](MessageObject.md) |  | 
**first_id** | **str** |  | 
**last_id** | **str** |  | 
**has_more** | **bool** |  | 

## Example

```python
from openapiopenai.models.list_messages_response import ListMessagesResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ListMessagesResponse from a JSON string
list_messages_response_instance = ListMessagesResponse.from_json(json)
# print the JSON string representation of the object
print(ListMessagesResponse.to_json())

# convert the object into a dict
list_messages_response_dict = list_messages_response_instance.to_dict()
# create an instance of ListMessagesResponse from a dict
list_messages_response_form_dict = list_messages_response.from_dict(list_messages_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


