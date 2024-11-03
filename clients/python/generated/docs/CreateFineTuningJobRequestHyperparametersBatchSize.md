# CreateFineTuningJobRequestHyperparametersBatchSize

Number of examples in each batch. A larger batch size means that model parameters are updated less frequently, but with lower variance. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------

## Example

```python
from openapiopenai.models.create_fine_tuning_job_request_hyperparameters_batch_size import CreateFineTuningJobRequestHyperparametersBatchSize

# TODO update the JSON string below
json = "{}"
# create an instance of CreateFineTuningJobRequestHyperparametersBatchSize from a JSON string
create_fine_tuning_job_request_hyperparameters_batch_size_instance = CreateFineTuningJobRequestHyperparametersBatchSize.from_json(json)
# print the JSON string representation of the object
print(CreateFineTuningJobRequestHyperparametersBatchSize.to_json())

# convert the object into a dict
create_fine_tuning_job_request_hyperparameters_batch_size_dict = create_fine_tuning_job_request_hyperparameters_batch_size_instance.to_dict()
# create an instance of CreateFineTuningJobRequestHyperparametersBatchSize from a dict
create_fine_tuning_job_request_hyperparameters_batch_size_from_dict = CreateFineTuningJobRequestHyperparametersBatchSize.from_dict(create_fine_tuning_job_request_hyperparameters_batch_size_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


