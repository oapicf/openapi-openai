# AssistantsNamedToolChoice

Specifies a tool the model should use. Use to force the model to call a specific tool.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** | The type of the tool. If type is &#x60;function&#x60;, the function name must be set | 
**function** | [**AssistantsNamedToolChoiceFunction**](AssistantsNamedToolChoiceFunction.md) |  | [optional] 

## Example

```python
from openapiopenai.models.assistants_named_tool_choice import AssistantsNamedToolChoice

# TODO update the JSON string below
json = "{}"
# create an instance of AssistantsNamedToolChoice from a JSON string
assistants_named_tool_choice_instance = AssistantsNamedToolChoice.from_json(json)
# print the JSON string representation of the object
print(AssistantsNamedToolChoice.to_json())

# convert the object into a dict
assistants_named_tool_choice_dict = assistants_named_tool_choice_instance.to_dict()
# create an instance of AssistantsNamedToolChoice from a dict
assistants_named_tool_choice_from_dict = AssistantsNamedToolChoice.from_dict(assistants_named_tool_choice_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


