# AssistantsNamedToolChoiceFunction


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | The name of the function to call. | 

## Example

```python
from openapiopenai.models.assistants_named_tool_choice_function import AssistantsNamedToolChoiceFunction

# TODO update the JSON string below
json = "{}"
# create an instance of AssistantsNamedToolChoiceFunction from a JSON string
assistants_named_tool_choice_function_instance = AssistantsNamedToolChoiceFunction.from_json(json)
# print the JSON string representation of the object
print(AssistantsNamedToolChoiceFunction.to_json())

# convert the object into a dict
assistants_named_tool_choice_function_dict = assistants_named_tool_choice_function_instance.to_dict()
# create an instance of AssistantsNamedToolChoiceFunction from a dict
assistants_named_tool_choice_function_from_dict = AssistantsNamedToolChoiceFunction.from_dict(assistants_named_tool_choice_function_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


