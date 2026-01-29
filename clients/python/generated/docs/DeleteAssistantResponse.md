# DeleteAssistantResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** |  | 
**deleted** | **bool** |  | 
**object** | **str** |  | 

## Example

```python
from openapiopenai.models.delete_assistant_response import DeleteAssistantResponse

# TODO update the JSON string below
json = "{}"
# create an instance of DeleteAssistantResponse from a JSON string
delete_assistant_response_instance = DeleteAssistantResponse.from_json(json)
# print the JSON string representation of the object
print(DeleteAssistantResponse.to_json())

# convert the object into a dict
delete_assistant_response_dict = delete_assistant_response_instance.to_dict()
# create an instance of DeleteAssistantResponse from a dict
delete_assistant_response_from_dict = DeleteAssistantResponse.from_dict(delete_assistant_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


