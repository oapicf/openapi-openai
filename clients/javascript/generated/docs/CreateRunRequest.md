# OpenapiOpenai.CreateRunRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assistantId** | **String** | The ID of the [assistant](/docs/api-reference/assistants) to use to execute this run. | 
**model** | **String** |  | [optional] 
**instructions** | **String** | Overrides the [instructions](/docs/api-reference/assistants/createAssistant) of the assistant. This is useful for modifying the behavior on a per-run basis. | [optional] 
**additionalInstructions** | **String** | Appends additional instructions at the end of the instructions for the run. This is useful for modifying the behavior on a per-run basis without overriding other instructions. | [optional] 
**additionalMessages** | [**[CreateMessageRequest]**](CreateMessageRequest.md) | Adds additional messages to the thread before creating the run. | [optional] 
**tools** | [**[AssistantObjectToolsInner]**](AssistantObjectToolsInner.md) | Override the tools the assistant can use for this run. This is useful for modifying the behavior on a per-run basis. | [optional] 
**metadata** | **Object** | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  | [optional] 
**temperature** | **Number** | What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  | [optional] [default to 1]
**topP** | **Number** | An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both.  | [optional] [default to 1]
**stream** | **Boolean** | If &#x60;true&#x60;, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a &#x60;data: [DONE]&#x60; message.  | [optional] 
**maxPromptTokens** | **Number** | The maximum number of prompt tokens that may be used over the course of the run. The run will make a best effort to use only the number of prompt tokens specified, across multiple turns of the run. If the run exceeds the number of prompt tokens specified, the run will end with status &#x60;incomplete&#x60;. See &#x60;incomplete_details&#x60; for more info.  | [optional] 
**maxCompletionTokens** | **Number** | The maximum number of completion tokens that may be used over the course of the run. The run will make a best effort to use only the number of completion tokens specified, across multiple turns of the run. If the run exceeds the number of completion tokens specified, the run will end with status &#x60;incomplete&#x60;. See &#x60;incomplete_details&#x60; for more info.  | [optional] 
**truncationStrategy** | [**TruncationObject**](TruncationObject.md) |  | [optional] 
**toolChoice** | [**AssistantsApiToolChoiceOption**](AssistantsApiToolChoiceOption.md) |  | [optional] 
**parallelToolCalls** | **Boolean** | Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use. | [optional] [default to true]
**responseFormat** | [**AssistantsApiResponseFormatOption**](AssistantsApiResponseFormatOption.md) |  | [optional] 



## Enum: ModelEnum


* `gpt-4o` (value: `"gpt-4o"`)

* `gpt-4o-2024-11-20` (value: `"gpt-4o-2024-11-20"`)

* `gpt-4o-2024-08-06` (value: `"gpt-4o-2024-08-06"`)

* `gpt-4o-2024-05-13` (value: `"gpt-4o-2024-05-13"`)

* `gpt-4o-mini` (value: `"gpt-4o-mini"`)

* `gpt-4o-mini-2024-07-18` (value: `"gpt-4o-mini-2024-07-18"`)

* `gpt-4-turbo` (value: `"gpt-4-turbo"`)

* `gpt-4-turbo-2024-04-09` (value: `"gpt-4-turbo-2024-04-09"`)

* `gpt-4-0125-preview` (value: `"gpt-4-0125-preview"`)

* `gpt-4-turbo-preview` (value: `"gpt-4-turbo-preview"`)

* `gpt-4-1106-preview` (value: `"gpt-4-1106-preview"`)

* `gpt-4-vision-preview` (value: `"gpt-4-vision-preview"`)

* `gpt-4` (value: `"gpt-4"`)

* `gpt-4-0314` (value: `"gpt-4-0314"`)

* `gpt-4-0613` (value: `"gpt-4-0613"`)

* `gpt-4-32k` (value: `"gpt-4-32k"`)

* `gpt-4-32k-0314` (value: `"gpt-4-32k-0314"`)

* `gpt-4-32k-0613` (value: `"gpt-4-32k-0613"`)

* `gpt-3.5-turbo` (value: `"gpt-3.5-turbo"`)

* `gpt-3.5-turbo-16k` (value: `"gpt-3.5-turbo-16k"`)

* `gpt-3.5-turbo-0613` (value: `"gpt-3.5-turbo-0613"`)

* `gpt-3.5-turbo-1106` (value: `"gpt-3.5-turbo-1106"`)

* `gpt-3.5-turbo-0125` (value: `"gpt-3.5-turbo-0125"`)

* `gpt-3.5-turbo-16k-0613` (value: `"gpt-3.5-turbo-16k-0613"`)




