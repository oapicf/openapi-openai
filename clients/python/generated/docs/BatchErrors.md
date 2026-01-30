# BatchErrors


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **str** | The object type, which is always &#x60;list&#x60;. | [optional] 
**data** | [**List[BatchErrorsDataInner]**](BatchErrorsDataInner.md) |  | [optional] 

## Example

```python
from openapiopenai.models.batch_errors import BatchErrors

# TODO update the JSON string below
json = "{}"
# create an instance of BatchErrors from a JSON string
batch_errors_instance = BatchErrors.from_json(json)
# print the JSON string representation of the object
print(BatchErrors.to_json())

# convert the object into a dict
batch_errors_dict = batch_errors_instance.to_dict()
# create an instance of BatchErrors from a dict
batch_errors_from_dict = BatchErrors.from_dict(batch_errors_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


