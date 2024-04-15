
# Table `CreateRunRequest`
(mapped from: CreateRunRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**assistantId** | assistant_id | text NOT NULL |  | **kotlin.String** | The ID of the [assistant](/docs/api-reference/assistants) to use to execute this run. | 
**model** | model | long |  | [**CreateRunRequestModel**](CreateRunRequestModel.md) |  |  [optional] [foreignkey]
**instructions** | instructions | text |  | **kotlin.String** | Overrides the [instructions](/docs/api-reference/assistants/createAssistant) of the assistant. This is useful for modifying the behavior on a per-run basis. |  [optional]
**additionalInstructions** | additional_instructions | text |  | **kotlin.String** | Appends additional instructions at the end of the instructions for the run. This is useful for modifying the behavior on a per-run basis without overriding other instructions. |  [optional]
**additionalMessages** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;CreateMessageRequest&gt;**](CreateMessageRequest.md) | Adds additional messages to the thread before creating the run. |  [optional]
**tools** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AssistantObjectToolsInner&gt;**](AssistantObjectToolsInner.md) | Override the tools the assistant can use for this run. This is useful for modifying the behavior on a per-run basis. |  [optional]
**metadata** | metadata | blob |  | [**kotlin.Any**](.md) | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  |  [optional]
**temperature** | temperature | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  |  [optional]
**stream** | stream | boolean |  | **kotlin.Boolean** | If &#x60;true&#x60;, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a &#x60;data: [DONE]&#x60; message.  |  [optional]
**maxPromptTokens** | max_prompt_tokens | int UNSIGNED |  | **kotlin.Int** | The maximum number of prompt tokens that may be used over the course of the run. The run will make a best effort to use only the number of prompt tokens specified, across multiple turns of the run. If the run exceeds the number of prompt tokens specified, the run will end with status &#x60;complete&#x60;. See &#x60;incomplete_details&#x60; for more info.  |  [optional]
**maxCompletionTokens** | max_completion_tokens | int UNSIGNED |  | **kotlin.Int** | The maximum number of completion tokens that may be used over the course of the run. The run will make a best effort to use only the number of completion tokens specified, across multiple turns of the run. If the run exceeds the number of completion tokens specified, the run will end with status &#x60;complete&#x60;. See &#x60;incomplete_details&#x60; for more info.  |  [optional]
**truncationStrategy** | truncation_strategy | long |  | [**TruncationObject**](TruncationObject.md) |  |  [optional] [foreignkey]
**toolChoice** | tool_choice | long |  | [**AssistantsApiToolChoiceOption**](AssistantsApiToolChoiceOption.md) |  |  [optional] [foreignkey]
**responseFormat** | response_format | long |  | [**AssistantsApiResponseFormatOption**](AssistantsApiResponseFormatOption.md) |  |  [optional] [foreignkey]






# **Table `CreateRunRequestCreateMessageRequest`**
(mapped from: CreateRunRequestCreateMessageRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
createRunRequest | createRunRequest | long | | kotlin.Long | Primary Key | *one*
createMessageRequest | createMessageRequest | long | | kotlin.Long | Foreign Key | *many*



# **Table `CreateRunRequestAssistantObjectToolsInner`**
(mapped from: CreateRunRequestAssistantObjectToolsInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
createRunRequest | createRunRequest | long | | kotlin.Long | Primary Key | *one*
assistantObjectToolsInner | assistantObjectToolsInner | long | | kotlin.Long | Foreign Key | *many*










