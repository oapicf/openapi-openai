# AssistantToolsFunction


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** | The type of tool being defined: &#x60;function&#x60; | 
**function** | [**FunctionObject**](FunctionObject.md) |  | 

## Example

```python
from openapiopenai.models.assistant_tools_function import AssistantToolsFunction

# TODO update the JSON string below
json = "{}"
# create an instance of AssistantToolsFunction from a JSON string
assistant_tools_function_instance = AssistantToolsFunction.from_json(json)
# print the JSON string representation of the object
print(AssistantToolsFunction.to_json())

# convert the object into a dict
assistant_tools_function_dict = assistant_tools_function_instance.to_dict()
# create an instance of AssistantToolsFunction from a dict
assistant_tools_function_from_dict = AssistantToolsFunction.from_dict(assistant_tools_function_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


