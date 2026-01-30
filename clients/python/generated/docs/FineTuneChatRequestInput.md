# FineTuneChatRequestInput

The per-line training example of a fine-tuning input file for chat models using the supervised method.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**messages** | [**List[FineTuneChatRequestInputMessagesInner]**](FineTuneChatRequestInputMessagesInner.md) |  | [optional] 
**tools** | [**List[ChatCompletionTool]**](ChatCompletionTool.md) | A list of tools the model may generate JSON inputs for. | [optional] 
**parallel_tool_calls** | **bool** | Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use. | [optional] [default to True]
**functions** | [**List[ChatCompletionFunctions]**](ChatCompletionFunctions.md) | A list of functions the model may generate JSON inputs for. | [optional] 

## Example

```python
from openapiopenai.models.fine_tune_chat_request_input import FineTuneChatRequestInput

# TODO update the JSON string below
json = "{}"
# create an instance of FineTuneChatRequestInput from a JSON string
fine_tune_chat_request_input_instance = FineTuneChatRequestInput.from_json(json)
# print the JSON string representation of the object
print(FineTuneChatRequestInput.to_json())

# convert the object into a dict
fine_tune_chat_request_input_dict = fine_tune_chat_request_input_instance.to_dict()
# create an instance of FineTuneChatRequestInput from a dict
fine_tune_chat_request_input_from_dict = FineTuneChatRequestInput.from_dict(fine_tune_chat_request_input_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


