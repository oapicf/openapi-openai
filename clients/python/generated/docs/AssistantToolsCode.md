# AssistantToolsCode


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** | The type of tool being defined: &#x60;code_interpreter&#x60; | 

## Example

```python
from openapiopenai.models.assistant_tools_code import AssistantToolsCode

# TODO update the JSON string below
json = "{}"
# create an instance of AssistantToolsCode from a JSON string
assistant_tools_code_instance = AssistantToolsCode.from_json(json)
# print the JSON string representation of the object
print(AssistantToolsCode.to_json())

# convert the object into a dict
assistant_tools_code_dict = assistant_tools_code_instance.to_dict()
# create an instance of AssistantToolsCode from a dict
assistant_tools_code_from_dict = AssistantToolsCode.from_dict(assistant_tools_code_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


