# FineTuningJob


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`id`** | **`String`** | The object identifier, which can be referenced in the API endpoints. | [default to nothing]
**`created_at`** | **`Int64`** | The Unix timestamp (in seconds) for when the fine-tuning job was created. | [default to nothing]
**`error`** | [**`*FineTuningJobError`**](FineTuningJobError.md) |  | [default to nothing]
**`fine_tuned_model`** | **`String`** | The name of the fine-tuned model that is being created. The value will be null if the fine-tuning job is still running. | [default to nothing]
**`finished_at`** | **`Int64`** | The Unix timestamp (in seconds) for when the fine-tuning job was finished. The value will be null if the fine-tuning job is still running. | [default to nothing]
**`hyperparameters`** | [**`*FineTuningJobHyperparameters`**](FineTuningJobHyperparameters.md) |  | [default to nothing]
**`model`** | **`String`** | The base model that is being fine-tuned. | [default to nothing]
**`object`** | **`String`** | The object type, which is always \&quot;fine_tuning.job\&quot;. | [default to nothing]
**`organization_id`** | **`String`** | The organization that owns the fine-tuning job. | [default to nothing]
**`result_files`** | **`Vector{String}`** | The compiled results file ID(s) for the fine-tuning job. You can retrieve the results with the [Files API](/docs/api-reference/files/retrieve-contents). | [default to nothing]
**`status`** | **`String`** | The current status of the fine-tuning job, which can be either &#x60;validating_files&#x60;, &#x60;queued&#x60;, &#x60;running&#x60;, &#x60;succeeded&#x60;, &#x60;failed&#x60;, or &#x60;cancelled&#x60;. | [default to nothing]
**`trained_tokens`** | **`Int64`** | The total number of billable tokens processed by this fine-tuning job. The value will be null if the fine-tuning job is still running. | [default to nothing]
**`training_file`** | **`String`** | The file ID used for training. You can retrieve the training data with the [Files API](/docs/api-reference/files/retrieve-contents). | [default to nothing]
**`validation_file`** | **`String`** | The file ID used for validation. You can retrieve the validation results with the [Files API](/docs/api-reference/files/retrieve-contents). | [default to nothing]
**`integrations`** | [**`Vector{FineTuningJobIntegrationsInner}`**](FineTuningJobIntegrationsInner.md) | A list of integrations to enable for this fine-tuning job. | [optional] [default to nothing]
**`seed`** | **`Int64`** | The seed used for the fine-tuning job. | [default to nothing]
**`estimated_finish`** | **`Int64`** | The Unix timestamp (in seconds) for when the fine-tuning job is estimated to finish. The value will be null if the fine-tuning job is not running. | [optional] [default to nothing]
**`method`** | [**`*FineTuneMethod`**](FineTuneMethod.md) |  | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


