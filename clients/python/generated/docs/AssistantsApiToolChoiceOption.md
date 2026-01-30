# AssistantsApiToolChoiceOption

Controls which (if any) tool is called by the model. `none` means the model will not call any tools and instead generates a message. `auto` is the default value and means the model can pick between generating a message or calling one or more tools. `required` means the model must call one or more tools before responding to the user. Specifying a particular tool like `{\"type\": \"file_search\"}` or `{\"type\": \"function\", \"function\": {\"name\": \"my_function\"}}` forces the model to call that tool. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** | The type of the tool. If type is &#x60;function&#x60;, the function name must be set | 
**function** | [**AssistantsNamedToolChoiceFunction**](AssistantsNamedToolChoiceFunction.md) |  | [optional] 

## Example

```python
from openapiopenai.models.assistants_api_tool_choice_option import AssistantsApiToolChoiceOption

# TODO update the JSON string below
json = "{}"
# create an instance of AssistantsApiToolChoiceOption from a JSON string
assistants_api_tool_choice_option_instance = AssistantsApiToolChoiceOption.from_json(json)
# print the JSON string representation of the object
print(AssistantsApiToolChoiceOption.to_json())

# convert the object into a dict
assistants_api_tool_choice_option_dict = assistants_api_tool_choice_option_instance.to_dict()
# create an instance of AssistantsApiToolChoiceOption from a dict
assistants_api_tool_choice_option_from_dict = AssistantsApiToolChoiceOption.from_dict(assistants_api_tool_choice_option_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


