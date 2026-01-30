
# CreateRunRequest

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **assistantId** | **kotlin.String** | The ID of the [assistant](/docs/api-reference/assistants) to use to execute this run. |  |
| **model** | [**CreateRunRequestModel**](CreateRunRequestModel.md) |  |  [optional] |
| **instructions** | **kotlin.String** | Overrides the [instructions](/docs/api-reference/assistants/createAssistant) of the assistant. This is useful for modifying the behavior on a per-run basis. |  [optional] |
| **additionalInstructions** | **kotlin.String** | Appends additional instructions at the end of the instructions for the run. This is useful for modifying the behavior on a per-run basis without overriding other instructions. |  [optional] |
| **additionalMessages** | [**kotlin.collections.List&lt;CreateMessageRequest&gt;**](CreateMessageRequest.md) | Adds additional messages to the thread before creating the run. |  [optional] |
| **tools** | [**kotlin.collections.List&lt;AssistantObjectToolsInner&gt;**](AssistantObjectToolsInner.md) | Override the tools the assistant can use for this run. This is useful for modifying the behavior on a per-run basis. |  [optional] |
| **metadata** | [**kotlin.Any**](.md) | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  |  [optional] |
| **temperature** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  |  [optional] |
| **topP** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both.  |  [optional] |
| **stream** | **kotlin.Boolean** | If &#x60;true&#x60;, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a &#x60;data: [DONE]&#x60; message.  |  [optional] |
| **maxPromptTokens** | **kotlin.Int** | The maximum number of prompt tokens that may be used over the course of the run. The run will make a best effort to use only the number of prompt tokens specified, across multiple turns of the run. If the run exceeds the number of prompt tokens specified, the run will end with status &#x60;incomplete&#x60;. See &#x60;incomplete_details&#x60; for more info.  |  [optional] |
| **maxCompletionTokens** | **kotlin.Int** | The maximum number of completion tokens that may be used over the course of the run. The run will make a best effort to use only the number of completion tokens specified, across multiple turns of the run. If the run exceeds the number of completion tokens specified, the run will end with status &#x60;incomplete&#x60;. See &#x60;incomplete_details&#x60; for more info.  |  [optional] |
| **truncationStrategy** | [**TruncationObject**](TruncationObject.md) |  |  [optional] |
| **toolChoice** | [**AssistantsApiToolChoiceOption**](AssistantsApiToolChoiceOption.md) |  |  [optional] |
| **parallelToolCalls** | **kotlin.Boolean** | Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use. |  [optional] |
| **responseFormat** | [**AssistantsApiResponseFormatOption**](AssistantsApiResponseFormatOption.md) |  |  [optional] |



