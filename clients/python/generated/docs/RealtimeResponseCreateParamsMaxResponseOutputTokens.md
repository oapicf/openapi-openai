# RealtimeResponseCreateParamsMaxResponseOutputTokens

Maximum number of output tokens for a single assistant response, inclusive of tool calls. Provide an integer between 1 and 4096 to limit output tokens, or `inf` for the maximum available tokens for a given model. Defaults to `inf`. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------

## Example

```python
from openapiopenai.models.realtime_response_create_params_max_response_output_tokens import RealtimeResponseCreateParamsMaxResponseOutputTokens

# TODO update the JSON string below
json = "{}"
# create an instance of RealtimeResponseCreateParamsMaxResponseOutputTokens from a JSON string
realtime_response_create_params_max_response_output_tokens_instance = RealtimeResponseCreateParamsMaxResponseOutputTokens.from_json(json)
# print the JSON string representation of the object
print(RealtimeResponseCreateParamsMaxResponseOutputTokens.to_json())

# convert the object into a dict
realtime_response_create_params_max_response_output_tokens_dict = realtime_response_create_params_max_response_output_tokens_instance.to_dict()
# create an instance of RealtimeResponseCreateParamsMaxResponseOutputTokens from a dict
realtime_response_create_params_max_response_output_tokens_from_dict = RealtimeResponseCreateParamsMaxResponseOutputTokens.from_dict(realtime_response_create_params_max_response_output_tokens_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


