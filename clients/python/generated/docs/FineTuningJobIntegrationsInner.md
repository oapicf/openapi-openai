# FineTuningJobIntegrationsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** | The type of the integration being enabled for the fine-tuning job | 
**wandb** | [**CreateFineTuningJobRequestIntegrationsInnerWandb**](CreateFineTuningJobRequestIntegrationsInnerWandb.md) |  | 

## Example

```python
from openapiopenai.models.fine_tuning_job_integrations_inner import FineTuningJobIntegrationsInner

# TODO update the JSON string below
json = "{}"
# create an instance of FineTuningJobIntegrationsInner from a JSON string
fine_tuning_job_integrations_inner_instance = FineTuningJobIntegrationsInner.from_json(json)
# print the JSON string representation of the object
print(FineTuningJobIntegrationsInner.to_json())

# convert the object into a dict
fine_tuning_job_integrations_inner_dict = fine_tuning_job_integrations_inner_instance.to_dict()
# create an instance of FineTuningJobIntegrationsInner from a dict
fine_tuning_job_integrations_inner_form_dict = fine_tuning_job_integrations_inner.from_dict(fine_tuning_job_integrations_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


