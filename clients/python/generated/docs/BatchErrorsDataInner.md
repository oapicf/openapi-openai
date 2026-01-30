# BatchErrorsDataInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **str** | An error code identifying the error type. | [optional] 
**message** | **str** | A human-readable message providing more details about the error. | [optional] 
**param** | **str** | The name of the parameter that caused the error, if applicable. | [optional] 
**line** | **int** | The line number of the input file where the error occurred, if applicable. | [optional] 

## Example

```python
from openapiopenai.models.batch_errors_data_inner import BatchErrorsDataInner

# TODO update the JSON string below
json = "{}"
# create an instance of BatchErrorsDataInner from a JSON string
batch_errors_data_inner_instance = BatchErrorsDataInner.from_json(json)
# print the JSON string representation of the object
print(BatchErrorsDataInner.to_json())

# convert the object into a dict
batch_errors_data_inner_dict = batch_errors_data_inner_instance.to_dict()
# create an instance of BatchErrorsDataInner from a dict
batch_errors_data_inner_from_dict = BatchErrorsDataInner.from_dict(batch_errors_data_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


