

# CreateRunRequest

The class is defined in **[CreateRunRequest.java](../../src/main/java/org/openapitools/model/CreateRunRequest.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assistantId** | `String` | The ID of the [assistant](/docs/api-reference/assistants) to use to execute this run. | 
**model** | [`CreateRunRequestModel`](CreateRunRequestModel.md) |  |  [optional property]
**instructions** | `String` | Overrides the [instructions](/docs/api-reference/assistants/createAssistant) of the assistant. This is useful for modifying the behavior on a per-run basis. |  [optional property]
**additionalInstructions** | `String` | Appends additional instructions at the end of the instructions for the run. This is useful for modifying the behavior on a per-run basis without overriding other instructions. |  [optional property]
**additionalMessages** | [`List&lt;CreateMessageRequest&gt;`](CreateMessageRequest.md) | Adds additional messages to the thread before creating the run. |  [optional property]
**tools** | [`List&lt;AssistantObjectToolsInner&gt;`](AssistantObjectToolsInner.md) | Override the tools the assistant can use for this run. This is useful for modifying the behavior on a per-run basis. |  [optional property]
**metadata** | `Object` | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  |  [optional property]
**temperature** | `BigDecimal` | What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  |  [optional property]
**stream** | `Boolean` | If &#x60;true&#x60;, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a &#x60;data: [DONE]&#x60; message.  |  [optional property]
**maxPromptTokens** | `Integer` | The maximum number of prompt tokens that may be used over the course of the run. The run will make a best effort to use only the number of prompt tokens specified, across multiple turns of the run. If the run exceeds the number of prompt tokens specified, the run will end with status &#x60;complete&#x60;. See &#x60;incomplete_details&#x60; for more info.  |  [optional property]
**maxCompletionTokens** | `Integer` | The maximum number of completion tokens that may be used over the course of the run. The run will make a best effort to use only the number of completion tokens specified, across multiple turns of the run. If the run exceeds the number of completion tokens specified, the run will end with status &#x60;complete&#x60;. See &#x60;incomplete_details&#x60; for more info.  |  [optional property]
**truncationStrategy** | [`TruncationObject`](TruncationObject.md) |  |  [optional property]
**toolChoice** | [`AssistantsApiToolChoiceOption`](AssistantsApiToolChoiceOption.md) |  |  [optional property]
**responseFormat** | [`AssistantsApiResponseFormatOption`](AssistantsApiResponseFormatOption.md) |  |  [optional property]
















