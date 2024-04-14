# DeleteAssistantFileResponse

Deletes the association between the assistant and the file, but does not delete the [File](/docs/api-reference/files) object itself.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** |  | 
**deleted** | **bool** |  | 
**object** | **str** |  | 

## Example

```python
from openapiopenai.models.delete_assistant_file_response import DeleteAssistantFileResponse

# TODO update the JSON string below
json = "{}"
# create an instance of DeleteAssistantFileResponse from a JSON string
delete_assistant_file_response_instance = DeleteAssistantFileResponse.from_json(json)
# print the JSON string representation of the object
print(DeleteAssistantFileResponse.to_json())

# convert the object into a dict
delete_assistant_file_response_dict = delete_assistant_file_response_instance.to_dict()
# create an instance of DeleteAssistantFileResponse from a dict
delete_assistant_file_response_form_dict = delete_assistant_file_response.from_dict(delete_assistant_file_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


