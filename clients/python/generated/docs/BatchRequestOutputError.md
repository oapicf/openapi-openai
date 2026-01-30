# BatchRequestOutputError

For requests that failed with a non-HTTP error, this will contain more information on the cause of the failure.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **str** | A machine-readable error code. | [optional] 
**message** | **str** | A human-readable error message. | [optional] 

## Example

```python
from openapiopenai.models.batch_request_output_error import BatchRequestOutputError

# TODO update the JSON string below
json = "{}"
# create an instance of BatchRequestOutputError from a JSON string
batch_request_output_error_instance = BatchRequestOutputError.from_json(json)
# print the JSON string representation of the object
print(BatchRequestOutputError.to_json())

# convert the object into a dict
batch_request_output_error_dict = batch_request_output_error_instance.to_dict()
# create an instance of BatchRequestOutputError from a dict
batch_request_output_error_from_dict = BatchRequestOutputError.from_dict(batch_request_output_error_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


