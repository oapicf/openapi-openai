# CreateFineTuningJobRequestIntegrationsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**CreateFineTuningJobRequestIntegrationsInnerType**](CreateFineTuningJobRequestIntegrationsInnerType.md) |  | 
**wandb** | [**CreateFineTuningJobRequestIntegrationsInnerWandb**](CreateFineTuningJobRequestIntegrationsInnerWandb.md) |  | 

## Example

```python
from openapiopenai.models.create_fine_tuning_job_request_integrations_inner import CreateFineTuningJobRequestIntegrationsInner

# TODO update the JSON string below
json = "{}"
# create an instance of CreateFineTuningJobRequestIntegrationsInner from a JSON string
create_fine_tuning_job_request_integrations_inner_instance = CreateFineTuningJobRequestIntegrationsInner.from_json(json)
# print the JSON string representation of the object
print(CreateFineTuningJobRequestIntegrationsInner.to_json())

# convert the object into a dict
create_fine_tuning_job_request_integrations_inner_dict = create_fine_tuning_job_request_integrations_inner_instance.to_dict()
# create an instance of CreateFineTuningJobRequestIntegrationsInner from a dict
create_fine_tuning_job_request_integrations_inner_from_dict = CreateFineTuningJobRequestIntegrationsInner.from_dict(create_fine_tuning_job_request_integrations_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


