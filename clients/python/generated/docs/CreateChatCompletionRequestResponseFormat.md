# CreateChatCompletionRequestResponseFormat

An object specifying the format that the model must output.  Setting to `{ \"type\": \"json_schema\", \"json_schema\": {...} }` enables Structured Outputs which ensures the model will match your supplied JSON schema. Learn more in the [Structured Outputs guide](/docs/guides/structured-outputs).  Setting to `{ \"type\": \"json_object\" }` enables JSON mode, which ensures the message the model generates is valid JSON.  **Important:** when using JSON mode, you **must** also instruct the model to produce JSON yourself via a system or user message. Without this, the model may generate an unending stream of whitespace until the generation reaches the token limit, resulting in a long-running and seemingly \"stuck\" request. Also note that the message content may be partially cut off if `finish_reason=\"length\"`, which indicates the generation exceeded `max_tokens` or the conversation exceeded the max context length. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** | The type of response format being defined: &#x60;text&#x60; | 
**json_schema** | [**ResponseFormatJsonSchemaJsonSchema**](ResponseFormatJsonSchemaJsonSchema.md) |  | 

## Example

```python
from openapiopenai.models.create_chat_completion_request_response_format import CreateChatCompletionRequestResponseFormat

# TODO update the JSON string below
json = "{}"
# create an instance of CreateChatCompletionRequestResponseFormat from a JSON string
create_chat_completion_request_response_format_instance = CreateChatCompletionRequestResponseFormat.from_json(json)
# print the JSON string representation of the object
print(CreateChatCompletionRequestResponseFormat.to_json())

# convert the object into a dict
create_chat_completion_request_response_format_dict = create_chat_completion_request_response_format_instance.to_dict()
# create an instance of CreateChatCompletionRequestResponseFormat from a dict
create_chat_completion_request_response_format_from_dict = CreateChatCompletionRequestResponseFormat.from_dict(create_chat_completion_request_response_format_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


