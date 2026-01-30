# FineTuneCompletionRequestInput

The per-line training example of a fine-tuning input file for completions models

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**prompt** | **str** | The input prompt for this training example. | [optional] 
**completion** | **str** | The desired completion for this training example. | [optional] 

## Example

```python
from openapiopenai.models.fine_tune_completion_request_input import FineTuneCompletionRequestInput

# TODO update the JSON string below
json = "{}"
# create an instance of FineTuneCompletionRequestInput from a JSON string
fine_tune_completion_request_input_instance = FineTuneCompletionRequestInput.from_json(json)
# print the JSON string representation of the object
print(FineTuneCompletionRequestInput.to_json())

# convert the object into a dict
fine_tune_completion_request_input_dict = fine_tune_completion_request_input_instance.to_dict()
# create an instance of FineTuneCompletionRequestInput from a dict
fine_tune_completion_request_input_from_dict = FineTuneCompletionRequestInput.from_dict(fine_tune_completion_request_input_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


