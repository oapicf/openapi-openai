# Org.OpenAPITools.Model.FineTuneChatRequestInput
The per-line training example of a fine-tuning input file for chat models using the supervised method.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Messages** | [**List&lt;FineTuneChatRequestInputMessagesInner&gt;**](FineTuneChatRequestInputMessagesInner.md) |  | [optional] 
**Tools** | [**List&lt;ChatCompletionTool&gt;**](ChatCompletionTool.md) | A list of tools the model may generate JSON inputs for. | [optional] 
**ParallelToolCalls** | **bool** | Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use. | [optional] [default to true]
**Functions** | [**List&lt;ChatCompletionFunctions&gt;**](ChatCompletionFunctions.md) | A list of functions the model may generate JSON inputs for. | [optional] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

