# OpenAIFile


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** |  | 
**object** | **str** |  | 
**bytes** | **int** |  | 
**created_at** | **int** |  | 
**filename** | **str** |  | 
**purpose** | **str** |  | 
**status** | **str** |  | [optional] 
**status_details** | **object** |  | [optional] 

## Example

```python
from openapiopenai.models.open_ai_file import OpenAIFile

# TODO update the JSON string below
json = "{}"
# create an instance of OpenAIFile from a JSON string
open_ai_file_instance = OpenAIFile.from_json(json)
# print the JSON string representation of the object
print(OpenAIFile.to_json())

# convert the object into a dict
open_ai_file_dict = open_ai_file_instance.to_dict()
# create an instance of OpenAIFile from a dict
open_ai_file_form_dict = open_ai_file.from_dict(open_ai_file_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


