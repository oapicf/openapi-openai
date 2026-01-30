# BatchRequestOutput

The per-line object of the batch output and error files

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** |  | [optional] 
**custom_id** | **str** | A developer-provided per-request id that will be used to match outputs to inputs. | [optional] 
**response** | [**BatchRequestOutputResponse**](BatchRequestOutputResponse.md) |  | [optional] 
**error** | [**BatchRequestOutputError**](BatchRequestOutputError.md) |  | [optional] 

## Example

```python
from openapiopenai.models.batch_request_output import BatchRequestOutput

# TODO update the JSON string below
json = "{}"
# create an instance of BatchRequestOutput from a JSON string
batch_request_output_instance = BatchRequestOutput.from_json(json)
# print the JSON string representation of the object
print(BatchRequestOutput.to_json())

# convert the object into a dict
batch_request_output_dict = batch_request_output_instance.to_dict()
# create an instance of BatchRequestOutput from a dict
batch_request_output_from_dict = BatchRequestOutput.from_dict(batch_request_output_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


