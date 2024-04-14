# FineTuningJobHyperparametersNEpochs

The number of epochs to train the model for. An epoch refers to one full cycle through the training dataset. \"auto\" decides the optimal number of epochs based on the size of the dataset. If setting the number manually, we support any number between 1 and 50 epochs.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------

## Example

```python
from openapiopenai.models.fine_tuning_job_hyperparameters_n_epochs import FineTuningJobHyperparametersNEpochs

# TODO update the JSON string below
json = "{}"
# create an instance of FineTuningJobHyperparametersNEpochs from a JSON string
fine_tuning_job_hyperparameters_n_epochs_instance = FineTuningJobHyperparametersNEpochs.from_json(json)
# print the JSON string representation of the object
print(FineTuningJobHyperparametersNEpochs.to_json())

# convert the object into a dict
fine_tuning_job_hyperparameters_n_epochs_dict = fine_tuning_job_hyperparameters_n_epochs_instance.to_dict()
# create an instance of FineTuningJobHyperparametersNEpochs from a dict
fine_tuning_job_hyperparameters_n_epochs_form_dict = fine_tuning_job_hyperparameters_n_epochs.from_dict(fine_tuning_job_hyperparameters_n_epochs_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


