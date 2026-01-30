# WWW::OpenAPIClient::Object::FineTuneChatRequestInput

## Load the model package
```perl
use WWW::OpenAPIClient::Object::FineTuneChatRequestInput;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**messages** | [**ARRAY[FineTuneChatRequestInputMessagesInner]**](FineTuneChatRequestInputMessagesInner.md) |  | [optional] 
**tools** | [**ARRAY[ChatCompletionTool]**](ChatCompletionTool.md) | A list of tools the model may generate JSON inputs for. | [optional] 
**parallel_tool_calls** | **boolean** | Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use. | [optional] [default to true]
**functions** | [**ARRAY[ChatCompletionFunctions]**](ChatCompletionFunctions.md) | A list of functions the model may generate JSON inputs for. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


