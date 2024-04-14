# OpenApiOpenAIClient::FineTuningJobCheckpoint

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | The checkpoint identifier, which can be referenced in the API endpoints. |  |
| **created_at** | **Integer** | The Unix timestamp (in seconds) for when the checkpoint was created. |  |
| **fine_tuned_model_checkpoint** | **String** | The name of the fine-tuned checkpoint model that is created. |  |
| **step_number** | **Integer** | The step number that the checkpoint was created at. |  |
| **metrics** | [**FineTuningJobCheckpointMetrics**](FineTuningJobCheckpointMetrics.md) |  |  |
| **fine_tuning_job_id** | **String** | The name of the fine-tuning job that this checkpoint was created from. |  |
| **object** | **String** | The object type, which is always \&quot;fine_tuning.job.checkpoint\&quot;. |  |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::FineTuningJobCheckpoint.new(
  id: null,
  created_at: null,
  fine_tuned_model_checkpoint: null,
  step_number: null,
  metrics: null,
  fine_tuning_job_id: null,
  object: null
)
```

