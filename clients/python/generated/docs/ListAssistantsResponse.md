# ListAssistantsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **str** |  | 
**data** | [**List[AssistantObject]**](AssistantObject.md) |  | 
**first_id** | **str** |  | 
**last_id** | **str** |  | 
**has_more** | **bool** |  | 

## Example

```python
from openapiopenai.models.list_assistants_response import ListAssistantsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ListAssistantsResponse from a JSON string
list_assistants_response_instance = ListAssistantsResponse.from_json(json)
# print the JSON string representation of the object
print(ListAssistantsResponse.to_json())

# convert the object into a dict
list_assistants_response_dict = list_assistants_response_instance.to_dict()
# create an instance of ListAssistantsResponse from a dict
list_assistants_response_form_dict = list_assistants_response.from_dict(list_assistants_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


