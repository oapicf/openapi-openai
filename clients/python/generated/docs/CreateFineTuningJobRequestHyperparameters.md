# CreateFineTuningJobRequestHyperparameters

The hyperparameters used for the fine-tuning job.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**batch_size** | [**CreateFineTuningJobRequestHyperparametersBatchSize**](CreateFineTuningJobRequestHyperparametersBatchSize.md) |  | [optional] 
**learning_rate_multiplier** | [**CreateFineTuningJobRequestHyperparametersLearningRateMultiplier**](CreateFineTuningJobRequestHyperparametersLearningRateMultiplier.md) |  | [optional] 
**n_epochs** | [**CreateFineTuningJobRequestHyperparametersNEpochs**](CreateFineTuningJobRequestHyperparametersNEpochs.md) |  | [optional] 

## Example

```python
from openapiopenai.models.create_fine_tuning_job_request_hyperparameters import CreateFineTuningJobRequestHyperparameters

# TODO update the JSON string below
json = "{}"
# create an instance of CreateFineTuningJobRequestHyperparameters from a JSON string
create_fine_tuning_job_request_hyperparameters_instance = CreateFineTuningJobRequestHyperparameters.from_json(json)
# print the JSON string representation of the object
print(CreateFineTuningJobRequestHyperparameters.to_json())

# convert the object into a dict
create_fine_tuning_job_request_hyperparameters_dict = create_fine_tuning_job_request_hyperparameters_instance.to_dict()
# create an instance of CreateFineTuningJobRequestHyperparameters from a dict
create_fine_tuning_job_request_hyperparameters_form_dict = create_fine_tuning_job_request_hyperparameters.from_dict(create_fine_tuning_job_request_hyperparameters_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


