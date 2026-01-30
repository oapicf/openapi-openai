# FineTuningJobHyperparameters

The hyperparameters used for the fine-tuning job. This value will only be returned when running `supervised` jobs.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**batch_size** | [**CreateFineTuningJobRequestHyperparametersBatchSize**](CreateFineTuningJobRequestHyperparametersBatchSize.md) |  | [optional] 
**learning_rate_multiplier** | [**CreateFineTuningJobRequestHyperparametersLearningRateMultiplier**](CreateFineTuningJobRequestHyperparametersLearningRateMultiplier.md) |  | [optional] 
**n_epochs** | [**CreateFineTuningJobRequestHyperparametersNEpochs**](CreateFineTuningJobRequestHyperparametersNEpochs.md) |  | [optional] 

## Example

```python
from openapiopenai.models.fine_tuning_job_hyperparameters import FineTuningJobHyperparameters

# TODO update the JSON string below
json = "{}"
# create an instance of FineTuningJobHyperparameters from a JSON string
fine_tuning_job_hyperparameters_instance = FineTuningJobHyperparameters.from_json(json)
# print the JSON string representation of the object
print(FineTuningJobHyperparameters.to_json())

# convert the object into a dict
fine_tuning_job_hyperparameters_dict = fine_tuning_job_hyperparameters_instance.to_dict()
# create an instance of FineTuningJobHyperparameters from a dict
fine_tuning_job_hyperparameters_from_dict = FineTuningJobHyperparameters.from_dict(fine_tuning_job_hyperparameters_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


