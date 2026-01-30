# openapi::FineTuneChatRequestInput

The per-line training example of a fine-tuning input file for chat models using the supervised method.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**messages** | [**array[FineTuneChatRequestInputMessagesInner]**](FineTuneChatRequestInput_messages_inner.md) |  | [optional] [Min. items: 1] 
**tools** | [**array[ChatCompletionTool]**](ChatCompletionTool.md) | A list of tools the model may generate JSON inputs for. | [optional] 
**parallel_tool_calls** | **character** | Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use. | [optional] [default to TRUE] 
**functions** | [**array[ChatCompletionFunctions]**](ChatCompletionFunctions.md) | A list of functions the model may generate JSON inputs for. | [optional] [Max. items: 128] [Min. items: 1] 


