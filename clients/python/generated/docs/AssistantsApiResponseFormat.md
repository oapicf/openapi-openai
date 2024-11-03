# AssistantsApiResponseFormat

An object describing the expected output of the model. If `json_object` only `function` type `tools` are allowed to be passed to the Run. If `text` the model can return text or any value needed. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** | Must be one of &#x60;text&#x60; or &#x60;json_object&#x60;. | [optional] [default to 'text']

## Example

```python
from openapiopenai.models.assistants_api_response_format import AssistantsApiResponseFormat

# TODO update the JSON string below
json = "{}"
# create an instance of AssistantsApiResponseFormat from a JSON string
assistants_api_response_format_instance = AssistantsApiResponseFormat.from_json(json)
# print the JSON string representation of the object
print(AssistantsApiResponseFormat.to_json())

# convert the object into a dict
assistants_api_response_format_dict = assistants_api_response_format_instance.to_dict()
# create an instance of AssistantsApiResponseFormat from a dict
assistants_api_response_format_from_dict = AssistantsApiResponseFormat.from_dict(assistants_api_response_format_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


