# FineTune


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** |  | 
**object** | **str** |  | 
**created_at** | **int** |  | 
**updated_at** | **int** |  | 
**model** | **str** |  | 
**fine_tuned_model** | **str** |  | 
**organization_id** | **str** |  | 
**status** | **str** |  | 
**hyperparams** | **object** |  | 
**training_files** | [**List[OpenAIFile]**](OpenAIFile.md) |  | 
**validation_files** | [**List[OpenAIFile]**](OpenAIFile.md) |  | 
**result_files** | [**List[OpenAIFile]**](OpenAIFile.md) |  | 
**events** | [**List[FineTuneEvent]**](FineTuneEvent.md) |  | [optional] 

## Example

```python
from openapiopenai.models.fine_tune import FineTune

# TODO update the JSON string below
json = "{}"
# create an instance of FineTune from a JSON string
fine_tune_instance = FineTune.from_json(json)
# print the JSON string representation of the object
print(FineTune.to_json())

# convert the object into a dict
fine_tune_dict = fine_tune_instance.to_dict()
# create an instance of FineTune from a dict
fine_tune_form_dict = fine_tune.from_dict(fine_tune_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


