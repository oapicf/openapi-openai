# AssistantObjectToolsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** | The type of tool being defined: &#x60;code_interpreter&#x60; | 
**function** | [**FunctionObject**](FunctionObject.md) |  | 

## Example

```python
from openapiopenai.models.assistant_object_tools_inner import AssistantObjectToolsInner

# TODO update the JSON string below
json = "{}"
# create an instance of AssistantObjectToolsInner from a JSON string
assistant_object_tools_inner_instance = AssistantObjectToolsInner.from_json(json)
# print the JSON string representation of the object
print(AssistantObjectToolsInner.to_json())

# convert the object into a dict
assistant_object_tools_inner_dict = assistant_object_tools_inner_instance.to_dict()
# create an instance of AssistantObjectToolsInner from a dict
assistant_object_tools_inner_form_dict = assistant_object_tools_inner.from_dict(assistant_object_tools_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


