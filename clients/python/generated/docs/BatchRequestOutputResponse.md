# BatchRequestOutputResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status_code** | **int** | The HTTP status code of the response | [optional] 
**request_id** | **str** | An unique identifier for the OpenAI API request. Please include this request ID when contacting support. | [optional] 
**body** | **object** | The JSON body of the response | [optional] 

## Example

```python
from openapiopenai.models.batch_request_output_response import BatchRequestOutputResponse

# TODO update the JSON string below
json = "{}"
# create an instance of BatchRequestOutputResponse from a JSON string
batch_request_output_response_instance = BatchRequestOutputResponse.from_json(json)
# print the JSON string representation of the object
print(BatchRequestOutputResponse.to_json())

# convert the object into a dict
batch_request_output_response_dict = batch_request_output_response_instance.to_dict()
# create an instance of BatchRequestOutputResponse from a dict
batch_request_output_response_from_dict = BatchRequestOutputResponse.from_dict(batch_request_output_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


