# FineTuneDPOMethod

Configuration for the DPO fine-tuning method.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hyperparameters** | [**FineTuneDPOMethodHyperparameters**](FineTuneDPOMethodHyperparameters.md) |  | [optional] 

## Example

```python
from openapiopenai.models.fine_tune_dpo_method import FineTuneDPOMethod

# TODO update the JSON string below
json = "{}"
# create an instance of FineTuneDPOMethod from a JSON string
fine_tune_dpo_method_instance = FineTuneDPOMethod.from_json(json)
# print the JSON string representation of the object
print(FineTuneDPOMethod.to_json())

# convert the object into a dict
fine_tune_dpo_method_dict = fine_tune_dpo_method_instance.to_dict()
# create an instance of FineTuneDPOMethod from a dict
fine_tune_dpo_method_from_dict = FineTuneDPOMethod.from_dict(fine_tune_dpo_method_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


