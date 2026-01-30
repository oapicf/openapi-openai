# FineTuneSupervisedMethod

Configuration for the supervised fine-tuning method.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hyperparameters** | [**FineTuneSupervisedMethodHyperparameters**](FineTuneSupervisedMethodHyperparameters.md) |  | [optional] 

## Example

```python
from openapiopenai.models.fine_tune_supervised_method import FineTuneSupervisedMethod

# TODO update the JSON string below
json = "{}"
# create an instance of FineTuneSupervisedMethod from a JSON string
fine_tune_supervised_method_instance = FineTuneSupervisedMethod.from_json(json)
# print the JSON string representation of the object
print(FineTuneSupervisedMethod.to_json())

# convert the object into a dict
fine_tune_supervised_method_dict = fine_tune_supervised_method_instance.to_dict()
# create an instance of FineTuneSupervisedMethod from a dict
fine_tune_supervised_method_from_dict = FineTuneSupervisedMethod.from_dict(fine_tune_supervised_method_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


