# FineTuneMethod

The method used for fine-tuning.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** | The type of method. Is either &#x60;supervised&#x60; or &#x60;dpo&#x60;. | [optional] 
**supervised** | [**FineTuneSupervisedMethod**](.md) |  | [optional] 
**dpo** | [**FineTuneDPOMethod**](.md) |  | [optional] 

## Example

```python
from openapiopenai.models.fine_tune_method import FineTuneMethod

# TODO update the JSON string below
json = "{}"
# create an instance of FineTuneMethod from a JSON string
fine_tune_method_instance = FineTuneMethod.from_json(json)
# print the JSON string representation of the object
print(FineTuneMethod.to_json())

# convert the object into a dict
fine_tune_method_dict = fine_tune_method_instance.to_dict()
# create an instance of FineTuneMethod from a dict
fine_tune_method_from_dict = FineTuneMethod.from_dict(fine_tune_method_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


