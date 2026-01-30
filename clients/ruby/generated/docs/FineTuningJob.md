# OpenApiOpenAIClient::FineTuningJob

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | The object identifier, which can be referenced in the API endpoints. |  |
| **created_at** | **Integer** | The Unix timestamp (in seconds) for when the fine-tuning job was created. |  |
| **error** | [**FineTuningJobError**](FineTuningJobError.md) |  |  |
| **fine_tuned_model** | **String** | The name of the fine-tuned model that is being created. The value will be null if the fine-tuning job is still running. |  |
| **finished_at** | **Integer** | The Unix timestamp (in seconds) for when the fine-tuning job was finished. The value will be null if the fine-tuning job is still running. |  |
| **hyperparameters** | [**FineTuningJobHyperparameters**](FineTuningJobHyperparameters.md) |  |  |
| **model** | **String** | The base model that is being fine-tuned. |  |
| **object** | **String** | The object type, which is always \&quot;fine_tuning.job\&quot;. |  |
| **organization_id** | **String** | The organization that owns the fine-tuning job. |  |
| **result_files** | **Array&lt;String&gt;** | The compiled results file ID(s) for the fine-tuning job. You can retrieve the results with the [Files API](/docs/api-reference/files/retrieve-contents). |  |
| **status** | **String** | The current status of the fine-tuning job, which can be either &#x60;validating_files&#x60;, &#x60;queued&#x60;, &#x60;running&#x60;, &#x60;succeeded&#x60;, &#x60;failed&#x60;, or &#x60;cancelled&#x60;. |  |
| **trained_tokens** | **Integer** | The total number of billable tokens processed by this fine-tuning job. The value will be null if the fine-tuning job is still running. |  |
| **training_file** | **String** | The file ID used for training. You can retrieve the training data with the [Files API](/docs/api-reference/files/retrieve-contents). |  |
| **validation_file** | **String** | The file ID used for validation. You can retrieve the validation results with the [Files API](/docs/api-reference/files/retrieve-contents). |  |
| **integrations** | [**Array&lt;FineTuningJobIntegrationsInner&gt;**](FineTuningJobIntegrationsInner.md) | A list of integrations to enable for this fine-tuning job. | [optional] |
| **seed** | **Integer** | The seed used for the fine-tuning job. |  |
| **estimated_finish** | **Integer** | The Unix timestamp (in seconds) for when the fine-tuning job is estimated to finish. The value will be null if the fine-tuning job is not running. | [optional] |
| **method** | [**FineTuneMethod**](FineTuneMethod.md) |  | [optional] |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::FineTuningJob.new(
  id: null,
  created_at: null,
  error: null,
  fine_tuned_model: null,
  finished_at: null,
  hyperparameters: null,
  model: null,
  object: null,
  organization_id: null,
  result_files: null,
  status: null,
  trained_tokens: null,
  training_file: null,
  validation_file: null,
  integrations: null,
  seed: null,
  estimated_finish: null,
  method: null
)
```

