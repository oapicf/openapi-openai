# openapi::FineTunePreferenceRequestInput

The per-line training example of a fine-tuning input file for chat models using the dpo method.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**input** | [**FineTunePreferenceRequestInputInput**](FineTunePreferenceRequestInput_input.md) |  | [optional] 
**preferred_completion** | [**array[FineTunePreferenceRequestInputPreferredCompletionInner]**](FineTunePreferenceRequestInput_preferred_completion_inner.md) | The preferred completion message for the output. | [optional] [Max. items: 1] 
**non_preferred_completion** | [**array[FineTunePreferenceRequestInputPreferredCompletionInner]**](FineTunePreferenceRequestInput_preferred_completion_inner.md) | The non-preferred completion message for the output. | [optional] [Max. items: 1] 


