# OpenApiOpenAIClient::RunStepObject

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | The identifier of the run step, which can be referenced in API endpoints. |  |
| **object** | **String** | The object type, which is always &#x60;thread.run.step&#x60;. |  |
| **created_at** | **Integer** | The Unix timestamp (in seconds) for when the run step was created. |  |
| **assistant_id** | **String** | The ID of the [assistant](/docs/api-reference/assistants) associated with the run step. |  |
| **thread_id** | **String** | The ID of the [thread](/docs/api-reference/threads) that was run. |  |
| **run_id** | **String** | The ID of the [run](/docs/api-reference/runs) that this run step is a part of. |  |
| **type** | **String** | The type of run step, which can be either &#x60;message_creation&#x60; or &#x60;tool_calls&#x60;. |  |
| **status** | **String** | The status of the run step, which can be either &#x60;in_progress&#x60;, &#x60;cancelled&#x60;, &#x60;failed&#x60;, &#x60;completed&#x60;, or &#x60;expired&#x60;. |  |
| **step_details** | [**RunStepObjectStepDetails**](RunStepObjectStepDetails.md) |  |  |
| **last_error** | [**RunStepObjectLastError**](RunStepObjectLastError.md) |  |  |
| **expired_at** | **Integer** | The Unix timestamp (in seconds) for when the run step expired. A step is considered expired if the parent run is expired. |  |
| **cancelled_at** | **Integer** | The Unix timestamp (in seconds) for when the run step was cancelled. |  |
| **failed_at** | **Integer** | The Unix timestamp (in seconds) for when the run step failed. |  |
| **completed_at** | **Integer** | The Unix timestamp (in seconds) for when the run step completed. |  |
| **metadata** | **Object** | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  |  |
| **usage** | [**RunStepCompletionUsage**](RunStepCompletionUsage.md) |  |  |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::RunStepObject.new(
  id: null,
  object: null,
  created_at: null,
  assistant_id: null,
  thread_id: null,
  run_id: null,
  type: null,
  status: null,
  step_details: null,
  last_error: null,
  expired_at: null,
  cancelled_at: null,
  failed_at: null,
  completed_at: null,
  metadata: null,
  usage: null
)
```

