# FineTuningIntegration


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** | The type of the integration being enabled for the fine-tuning job | 
**wandb** | [**CreateFineTuningJobRequestIntegrationsInnerWandb**](CreateFineTuningJobRequestIntegrationsInnerWandb.md) |  | 

## Example

```python
from openapiopenai.models.fine_tuning_integration import FineTuningIntegration

# TODO update the JSON string below
json = "{}"
# create an instance of FineTuningIntegration from a JSON string
fine_tuning_integration_instance = FineTuningIntegration.from_json(json)
# print the JSON string representation of the object
print(FineTuningIntegration.to_json())

# convert the object into a dict
fine_tuning_integration_dict = fine_tuning_integration_instance.to_dict()
# create an instance of FineTuningIntegration from a dict
fine_tuning_integration_form_dict = fine_tuning_integration.from_dict(fine_tuning_integration_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


