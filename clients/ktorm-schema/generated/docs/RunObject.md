
# Table `RunObject`
(mapped from: RunObject)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | text NOT NULL PRIMARY KEY |  | **kotlin.String** | The identifier, which can be referenced in API endpoints. | 
**object** | object | text NOT NULL |  | [**object**](#Object) | The object type, which is always &#x60;thread.run&#x60;. | 
**createdAt** | created_at | int NOT NULL |  | **kotlin.Int** | The Unix timestamp (in seconds) for when the run was created. | 
**threadId** | thread_id | text NOT NULL |  | **kotlin.String** | The ID of the [thread](/docs/api-reference/threads) that was executed on as a part of this run. | 
**assistantId** | assistant_id | text NOT NULL |  | **kotlin.String** | The ID of the [assistant](/docs/api-reference/assistants) used for execution of this run. | 
**status** | status | text NOT NULL |  | [**status**](#Status) | The status of the run, which can be either &#x60;queued&#x60;, &#x60;in_progress&#x60;, &#x60;requires_action&#x60;, &#x60;cancelling&#x60;, &#x60;cancelled&#x60;, &#x60;failed&#x60;, &#x60;completed&#x60;, or &#x60;expired&#x60;. | 
**requiredAction** | required_action | long NOT NULL |  | [**RunObjectRequiredAction**](RunObjectRequiredAction.md) |  |  [foreignkey]
**lastError** | last_error | long NOT NULL |  | [**RunObjectLastError**](RunObjectLastError.md) |  |  [foreignkey]
**expiresAt** | expires_at | int NOT NULL |  | **kotlin.Int** | The Unix timestamp (in seconds) for when the run will expire. | 
**startedAt** | started_at | int NOT NULL |  | **kotlin.Int** | The Unix timestamp (in seconds) for when the run was started. | 
**cancelledAt** | cancelled_at | int NOT NULL |  | **kotlin.Int** | The Unix timestamp (in seconds) for when the run was cancelled. | 
**failedAt** | failed_at | int NOT NULL |  | **kotlin.Int** | The Unix timestamp (in seconds) for when the run failed. | 
**completedAt** | completed_at | int NOT NULL |  | **kotlin.Int** | The Unix timestamp (in seconds) for when the run was completed. | 
**incompleteDetails** | incomplete_details | long NOT NULL |  | [**RunObjectIncompleteDetails**](RunObjectIncompleteDetails.md) |  |  [foreignkey]
**model** | model | text NOT NULL |  | **kotlin.String** | The model that the [assistant](/docs/api-reference/assistants) used for this run. | 
**instructions** | instructions | text NOT NULL |  | **kotlin.String** | The instructions that the [assistant](/docs/api-reference/assistants) used for this run. | 
**tools** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AssistantObjectToolsInner&gt;**](AssistantObjectToolsInner.md) | The list of tools that the [assistant](/docs/api-reference/assistants) used for this run. | 
**fileIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | The list of [File](/docs/api-reference/files) IDs the [assistant](/docs/api-reference/assistants) used for this run. | 
**metadata** | metadata | blob NOT NULL |  | [**kotlin.Any**](.md) | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  | 
**usage** | usage | long NOT NULL |  | [**RunCompletionUsage**](RunCompletionUsage.md) |  |  [foreignkey]
**maxPromptTokens** | max_prompt_tokens | int UNSIGNED NOT NULL |  | **kotlin.Int** | The maximum number of prompt tokens specified to have been used over the course of the run.  | 
**maxCompletionTokens** | max_completion_tokens | int UNSIGNED NOT NULL |  | **kotlin.Int** | The maximum number of completion tokens specified to have been used over the course of the run.  | 
**truncationStrategy** | truncation_strategy | long NOT NULL |  | [**TruncationObject**](TruncationObject.md) |  |  [foreignkey]
**toolChoice** | tool_choice | long NOT NULL |  | [**AssistantsApiToolChoiceOption**](AssistantsApiToolChoiceOption.md) |  |  [foreignkey]
**responseFormat** | response_format | long NOT NULL |  | [**AssistantsApiResponseFormatOption**](AssistantsApiResponseFormatOption.md) |  |  [foreignkey]
**temperature** | temperature | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The sampling temperature used for this run. If not set, defaults to 1. |  [optional]


















# **Table `RunObjectAssistantObjectToolsInner`**
(mapped from: RunObjectAssistantObjectToolsInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
runObject | runObject | long | | kotlin.Long | Primary Key | *one*
assistantObjectToolsInner | assistantObjectToolsInner | long | | kotlin.Long | Foreign Key | *many*



# **Table `RunObjectFileIds`**
(mapped from: RunObjectFileIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
runObject | runObject | long | | kotlin.Long | Primary Key | *one*
fileIds | fileIds | text | | kotlin.String | Foreign Key | *many*











