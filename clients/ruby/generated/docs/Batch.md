# OpenApiOpenAIClient::Batch

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** |  |  |
| **object** | **String** | The object type, which is always &#x60;batch&#x60;. |  |
| **endpoint** | **String** | The OpenAI API endpoint used by the batch. |  |
| **errors** | [**BatchErrors**](BatchErrors.md) |  | [optional] |
| **input_file_id** | **String** | The ID of the input file for the batch. |  |
| **completion_window** | **String** | The time frame within which the batch should be processed. |  |
| **status** | **String** | The current status of the batch. |  |
| **output_file_id** | **String** | The ID of the file containing the outputs of successfully executed requests. | [optional] |
| **error_file_id** | **String** | The ID of the file containing the outputs of requests with errors. | [optional] |
| **created_at** | **Integer** | The Unix timestamp (in seconds) for when the batch was created. |  |
| **in_progress_at** | **Integer** | The Unix timestamp (in seconds) for when the batch started processing. | [optional] |
| **expires_at** | **Integer** | The Unix timestamp (in seconds) for when the batch will expire. | [optional] |
| **finalizing_at** | **Integer** | The Unix timestamp (in seconds) for when the batch started finalizing. | [optional] |
| **completed_at** | **Integer** | The Unix timestamp (in seconds) for when the batch was completed. | [optional] |
| **failed_at** | **Integer** | The Unix timestamp (in seconds) for when the batch failed. | [optional] |
| **expired_at** | **Integer** | The Unix timestamp (in seconds) for when the batch expired. | [optional] |
| **cancelling_at** | **Integer** | The Unix timestamp (in seconds) for when the batch started cancelling. | [optional] |
| **cancelled_at** | **Integer** | The Unix timestamp (in seconds) for when the batch was cancelled. | [optional] |
| **request_counts** | [**BatchRequestCounts**](BatchRequestCounts.md) |  | [optional] |
| **metadata** | **Object** | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  | [optional] |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::Batch.new(
  id: null,
  object: null,
  endpoint: null,
  errors: null,
  input_file_id: null,
  completion_window: null,
  status: null,
  output_file_id: null,
  error_file_id: null,
  created_at: null,
  in_progress_at: null,
  expires_at: null,
  finalizing_at: null,
  completed_at: null,
  failed_at: null,
  expired_at: null,
  cancelling_at: null,
  cancelled_at: null,
  request_counts: null,
  metadata: null
)
```

