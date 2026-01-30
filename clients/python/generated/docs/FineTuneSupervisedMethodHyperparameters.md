# FineTuneSupervisedMethodHyperparameters

The hyperparameters used for the fine-tuning job.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**batch_size** | [**FineTuneDPOMethodHyperparametersBatchSize**](FineTuneDPOMethodHyperparametersBatchSize.md) |  | [optional] 
**learning_rate_multiplier** | [**FineTuneDPOMethodHyperparametersLearningRateMultiplier**](FineTuneDPOMethodHyperparametersLearningRateMultiplier.md) |  | [optional] 
**n_epochs** | [**FineTuneDPOMethodHyperparametersNEpochs**](FineTuneDPOMethodHyperparametersNEpochs.md) |  | [optional] 

## Example

```python
from openapiopenai.models.fine_tune_supervised_method_hyperparameters import FineTuneSupervisedMethodHyperparameters

# TODO update the JSON string below
json = "{}"
# create an instance of FineTuneSupervisedMethodHyperparameters from a JSON string
fine_tune_supervised_method_hyperparameters_instance = FineTuneSupervisedMethodHyperparameters.from_json(json)
# print the JSON string representation of the object
print(FineTuneSupervisedMethodHyperparameters.to_json())

# convert the object into a dict
fine_tune_supervised_method_hyperparameters_dict = fine_tune_supervised_method_hyperparameters_instance.to_dict()
# create an instance of FineTuneSupervisedMethodHyperparameters from a dict
fine_tune_supervised_method_hyperparameters_from_dict = FineTuneSupervisedMethodHyperparameters.from_dict(fine_tune_supervised_method_hyperparameters_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


