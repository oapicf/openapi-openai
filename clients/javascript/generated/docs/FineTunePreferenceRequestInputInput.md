# OpenapiOpenai.FineTunePreferenceRequestInputInput

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**messages** | [**[FineTuneChatRequestInputMessagesInner]**](FineTuneChatRequestInputMessagesInner.md) |  | [optional] 
**tools** | [**[ChatCompletionTool]**](ChatCompletionTool.md) | A list of tools the model may generate JSON inputs for. | [optional] 
**parallelToolCalls** | **Boolean** | Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use. | [optional] [default to true]


