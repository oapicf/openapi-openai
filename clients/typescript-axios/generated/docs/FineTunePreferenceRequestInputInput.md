# FineTunePreferenceRequestInputInput


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**messages** | [**Array&lt;FineTuneChatRequestInputMessagesInner&gt;**](FineTuneChatRequestInputMessagesInner.md) |  | [optional] [default to undefined]
**tools** | [**Array&lt;ChatCompletionTool&gt;**](ChatCompletionTool.md) | A list of tools the model may generate JSON inputs for. | [optional] [default to undefined]
**parallel_tool_calls** | **boolean** | Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use. | [optional] [default to true]

## Example

```typescript
import { FineTunePreferenceRequestInputInput } from './api';

const instance: FineTunePreferenceRequestInputInput = {
    messages,
    tools,
    parallel_tool_calls,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
