# FineTuningJob

The `fine_tuning.job` object represents a fine-tuning job that has been created through the API. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | The object identifier, which can be referenced in the API endpoints. | 
**created_at** | **int** | The Unix timestamp (in seconds) for when the fine-tuning job was created. | 
**error** | [**FineTuningJobError**](FineTuningJobError.md) |  | 
**fine_tuned_model** | **str** | The name of the fine-tuned model that is being created. The value will be null if the fine-tuning job is still running. | 
**finished_at** | **int** | The Unix timestamp (in seconds) for when the fine-tuning job was finished. The value will be null if the fine-tuning job is still running. | 
**hyperparameters** | [**FineTuningJobHyperparameters**](FineTuningJobHyperparameters.md) |  | 
**model** | **str** | The base model that is being fine-tuned. | 
**object** | **str** | The object type, which is always \&quot;fine_tuning.job\&quot;. | 
**organization_id** | **str** | The organization that owns the fine-tuning job. | 
**result_files** | **List[str]** | The compiled results file ID(s) for the fine-tuning job. You can retrieve the results with the [Files API](/docs/api-reference/files/retrieve-contents). | 
**status** | **str** | The current status of the fine-tuning job, which can be either &#x60;validating_files&#x60;, &#x60;queued&#x60;, &#x60;running&#x60;, &#x60;succeeded&#x60;, &#x60;failed&#x60;, or &#x60;cancelled&#x60;. | 
**trained_tokens** | **int** | The total number of billable tokens processed by this fine-tuning job. The value will be null if the fine-tuning job is still running. | 
**training_file** | **str** | The file ID used for training. You can retrieve the training data with the [Files API](/docs/api-reference/files/retrieve-contents). | 
**validation_file** | **str** | The file ID used for validation. You can retrieve the validation results with the [Files API](/docs/api-reference/files/retrieve-contents). | 
**integrations** | [**List[FineTuningJobIntegrationsInner]**](FineTuningJobIntegrationsInner.md) | A list of integrations to enable for this fine-tuning job. | [optional] 
**seed** | **int** | The seed used for the fine-tuning job. | 
**estimated_finish** | **int** | The Unix timestamp (in seconds) for when the fine-tuning job is estimated to finish. The value will be null if the fine-tuning job is not running. | [optional] 
**method** | [**FineTuneMethod**](FineTuneMethod.md) |  | [optional] 

## Example

```python
from openapiopenai.models.fine_tuning_job import FineTuningJob

# TODO update the JSON string below
json = "{}"
# create an instance of FineTuningJob from a JSON string
fine_tuning_job_instance = FineTuningJob.from_json(json)
# print the JSON string representation of the object
print(FineTuningJob.to_json())

# convert the object into a dict
fine_tuning_job_dict = fine_tuning_job_instance.to_dict()
# create an instance of FineTuningJob from a dict
fine_tuning_job_from_dict = FineTuningJob.from_dict(fine_tuning_job_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


