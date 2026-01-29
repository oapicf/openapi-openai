# FineTuningJobHyperparameters

The hyperparameters used for the fine-tuning job. See the [fine-tuning guide](/docs/guides/fine-tuning) for more details.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**n_epochs** | [**FineTuningJobHyperparametersNEpochs**](FineTuningJobHyperparametersNEpochs.md) |  | 

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


