# CreateEditResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **str** |  | 
**created** | **int** |  | 
**choices** | [**List[CreateEditResponseChoicesInner]**](CreateEditResponseChoicesInner.md) |  | 
**usage** | [**CreateCompletionResponseUsage**](CreateCompletionResponseUsage.md) |  | 

## Example

```python
from openapiopenai.models.create_edit_response import CreateEditResponse

# TODO update the JSON string below
json = "{}"
# create an instance of CreateEditResponse from a JSON string
create_edit_response_instance = CreateEditResponse.from_json(json)
# print the JSON string representation of the object
print(CreateEditResponse.to_json())

# convert the object into a dict
create_edit_response_dict = create_edit_response_instance.to_dict()
# create an instance of CreateEditResponse from a dict
create_edit_response_form_dict = create_edit_response.from_dict(create_edit_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


