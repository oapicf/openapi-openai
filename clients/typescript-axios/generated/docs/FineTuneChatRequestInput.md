# FineTuneChatRequestInput

The per-line training example of a fine-tuning input file for chat models using the supervised method.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**messages** | [**Array&lt;FineTuneChatRequestInputMessagesInner&gt;**](FineTuneChatRequestInputMessagesInner.md) |  | [optional] [default to undefined]
**tools** | [**Array&lt;ChatCompletionTool&gt;**](ChatCompletionTool.md) | A list of tools the model may generate JSON inputs for. | [optional] [default to undefined]
**parallel_tool_calls** | **boolean** | Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use. | [optional] [default to true]
**functions** | [**Array&lt;ChatCompletionFunctions&gt;**](ChatCompletionFunctions.md) | A list of functions the model may generate JSON inputs for. | [optional] [default to undefined]

## Example

```typescript
import { FineTuneChatRequestInput } from './api';

const instance: FineTuneChatRequestInput = {
    messages,
    tools,
    parallel_tool_calls,
    functions,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
