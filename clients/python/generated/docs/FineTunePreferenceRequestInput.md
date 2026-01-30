# FineTunePreferenceRequestInput

The per-line training example of a fine-tuning input file for chat models using the dpo method.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**input** | [**FineTunePreferenceRequestInputInput**](FineTunePreferenceRequestInputInput.md) |  | [optional] 
**preferred_completion** | [**List[FineTunePreferenceRequestInputPreferredCompletionInner]**](FineTunePreferenceRequestInputPreferredCompletionInner.md) | The preferred completion message for the output. | [optional] 
**non_preferred_completion** | [**List[FineTunePreferenceRequestInputPreferredCompletionInner]**](FineTunePreferenceRequestInputPreferredCompletionInner.md) | The non-preferred completion message for the output. | [optional] 

## Example

```python
from openapiopenai.models.fine_tune_preference_request_input import FineTunePreferenceRequestInput

# TODO update the JSON string below
json = "{}"
# create an instance of FineTunePreferenceRequestInput from a JSON string
fine_tune_preference_request_input_instance = FineTunePreferenceRequestInput.from_json(json)
# print the JSON string representation of the object
print(FineTunePreferenceRequestInput.to_json())

# convert the object into a dict
fine_tune_preference_request_input_dict = fine_tune_preference_request_input_instance.to_dict()
# create an instance of FineTunePreferenceRequestInput from a dict
fine_tune_preference_request_input_from_dict = FineTunePreferenceRequestInput.from_dict(fine_tune_preference_request_input_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


