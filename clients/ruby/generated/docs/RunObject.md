# OpenApiOpenAIClient::RunObject

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | The identifier, which can be referenced in API endpoints. |  |
| **object** | **String** | The object type, which is always &#x60;thread.run&#x60;. |  |
| **created_at** | **Integer** | The Unix timestamp (in seconds) for when the run was created. |  |
| **thread_id** | **String** | The ID of the [thread](/docs/api-reference/threads) that was executed on as a part of this run. |  |
| **assistant_id** | **String** | The ID of the [assistant](/docs/api-reference/assistants) used for execution of this run. |  |
| **status** | **String** | The status of the run, which can be either &#x60;queued&#x60;, &#x60;in_progress&#x60;, &#x60;requires_action&#x60;, &#x60;cancelling&#x60;, &#x60;cancelled&#x60;, &#x60;failed&#x60;, &#x60;completed&#x60;, &#x60;incomplete&#x60;, or &#x60;expired&#x60;. |  |
| **required_action** | [**RunObjectRequiredAction**](RunObjectRequiredAction.md) |  |  |
| **last_error** | [**RunObjectLastError**](RunObjectLastError.md) |  |  |
| **expires_at** | **Integer** | The Unix timestamp (in seconds) for when the run will expire. |  |
| **started_at** | **Integer** | The Unix timestamp (in seconds) for when the run was started. |  |
| **cancelled_at** | **Integer** | The Unix timestamp (in seconds) for when the run was cancelled. |  |
| **failed_at** | **Integer** | The Unix timestamp (in seconds) for when the run failed. |  |
| **completed_at** | **Integer** | The Unix timestamp (in seconds) for when the run was completed. |  |
| **incomplete_details** | [**RunObjectIncompleteDetails**](RunObjectIncompleteDetails.md) |  |  |
| **model** | **String** | The model that the [assistant](/docs/api-reference/assistants) used for this run. |  |
| **instructions** | **String** | The instructions that the [assistant](/docs/api-reference/assistants) used for this run. |  |
| **tools** | [**Array&lt;AssistantObjectToolsInner&gt;**](AssistantObjectToolsInner.md) | The list of tools that the [assistant](/docs/api-reference/assistants) used for this run. |  |
| **metadata** | **Object** | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  |  |
| **usage** | [**RunCompletionUsage**](RunCompletionUsage.md) |  |  |
| **temperature** | **Float** | The sampling temperature used for this run. If not set, defaults to 1. | [optional] |
| **top_p** | **Float** | The nucleus sampling value used for this run. If not set, defaults to 1. | [optional] |
| **max_prompt_tokens** | **Integer** | The maximum number of prompt tokens specified to have been used over the course of the run.  |  |
| **max_completion_tokens** | **Integer** | The maximum number of completion tokens specified to have been used over the course of the run.  |  |
| **truncation_strategy** | [**TruncationObject**](TruncationObject.md) |  |  |
| **tool_choice** | [**AssistantsApiToolChoiceOption**](AssistantsApiToolChoiceOption.md) |  |  |
| **parallel_tool_calls** | **Boolean** | Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use. | [default to true] |
| **response_format** | [**AssistantsApiResponseFormatOption**](AssistantsApiResponseFormatOption.md) |  |  |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::RunObject.new(
  id: null,
  object: null,
  created_at: null,
  thread_id: null,
  assistant_id: null,
  status: null,
  required_action: null,
  last_error: null,
  expires_at: null,
  started_at: null,
  cancelled_at: null,
  failed_at: null,
  completed_at: null,
  incomplete_details: null,
  model: null,
  instructions: null,
  tools: null,
  metadata: null,
  usage: null,
  temperature: null,
  top_p: null,
  max_prompt_tokens: null,
  max_completion_tokens: null,
  truncation_strategy: null,
  tool_choice: null,
  parallel_tool_calls: null,
  response_format: null
)
```

