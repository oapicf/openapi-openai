

# FineTuneChatRequestInput

The per-line training example of a fine-tuning input file for chat models using the supervised method.

The class is defined in **[FineTuneChatRequestInput.java](../../src/main/java/org/openapitools/model/FineTuneChatRequestInput.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**messages** | [`List&lt;FineTuneChatRequestInputMessagesInner&gt;`](FineTuneChatRequestInputMessagesInner.md) |  |  [optional property]
**tools** | [`List&lt;ChatCompletionTool&gt;`](ChatCompletionTool.md) | A list of tools the model may generate JSON inputs for. |  [optional property]
**parallelToolCalls** | `Boolean` | Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use. |  [optional property]
**functions** | [`List&lt;ChatCompletionFunctions&gt;`](ChatCompletionFunctions.md) | A list of functions the model may generate JSON inputs for. |  [optional property]






