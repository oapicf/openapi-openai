# WWW::OpenAPIClient::Object::FineTunePreferenceRequestInputInput

## Load the model package
```perl
use WWW::OpenAPIClient::Object::FineTunePreferenceRequestInputInput;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**messages** | [**ARRAY[FineTuneChatRequestInputMessagesInner]**](FineTuneChatRequestInputMessagesInner.md) |  | [optional] 
**tools** | [**ARRAY[ChatCompletionTool]**](ChatCompletionTool.md) | A list of tools the model may generate JSON inputs for. | [optional] 
**parallel_tool_calls** | **boolean** | Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use. | [optional] [default to true]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


