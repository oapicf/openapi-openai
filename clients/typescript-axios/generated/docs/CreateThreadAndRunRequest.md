# CreateThreadAndRunRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assistant_id** | **string** | The ID of the [assistant](/docs/api-reference/assistants) to use to execute this run. | [default to undefined]
**thread** | [**CreateThreadRequest**](CreateThreadRequest.md) |  | [optional] [default to undefined]
**model** | [**CreateRunRequestModel**](CreateRunRequestModel.md) |  | [optional] [default to undefined]
**instructions** | **string** | Override the default system message of the assistant. This is useful for modifying the behavior on a per-run basis. | [optional] [default to undefined]
**tools** | [**Array&lt;CreateThreadAndRunRequestToolsInner&gt;**](CreateThreadAndRunRequestToolsInner.md) | Override the tools the assistant can use for this run. This is useful for modifying the behavior on a per-run basis. | [optional] [default to undefined]
**tool_resources** | [**CreateThreadAndRunRequestToolResources**](CreateThreadAndRunRequestToolResources.md) |  | [optional] [default to undefined]
**metadata** | **object** | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  | [optional] [default to undefined]
**temperature** | **number** | What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  | [optional] [default to 1]
**top_p** | **number** | An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both.  | [optional] [default to 1]
**stream** | **boolean** | If &#x60;true&#x60;, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a &#x60;data: [DONE]&#x60; message.  | [optional] [default to undefined]
**max_prompt_tokens** | **number** | The maximum number of prompt tokens that may be used over the course of the run. The run will make a best effort to use only the number of prompt tokens specified, across multiple turns of the run. If the run exceeds the number of prompt tokens specified, the run will end with status &#x60;incomplete&#x60;. See &#x60;incomplete_details&#x60; for more info.  | [optional] [default to undefined]
**max_completion_tokens** | **number** | The maximum number of completion tokens that may be used over the course of the run. The run will make a best effort to use only the number of completion tokens specified, across multiple turns of the run. If the run exceeds the number of completion tokens specified, the run will end with status &#x60;incomplete&#x60;. See &#x60;incomplete_details&#x60; for more info.  | [optional] [default to undefined]
**truncation_strategy** | [**TruncationObject**](TruncationObject.md) |  | [optional] [default to undefined]
**tool_choice** | [**AssistantsApiToolChoiceOption**](AssistantsApiToolChoiceOption.md) |  | [optional] [default to undefined]
**parallel_tool_calls** | **boolean** | Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use. | [optional] [default to true]
**response_format** | [**AssistantsApiResponseFormatOption**](AssistantsApiResponseFormatOption.md) |  | [optional] [default to undefined]

## Example

```typescript
import { CreateThreadAndRunRequest } from './api';

const instance: CreateThreadAndRunRequest = {
    assistant_id,
    thread,
    model,
    instructions,
    tools,
    tool_resources,
    metadata,
    temperature,
    top_p,
    stream,
    max_prompt_tokens,
    max_completion_tokens,
    truncation_strategy,
    tool_choice,
    parallel_tool_calls,
    response_format,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
