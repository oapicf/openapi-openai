# BatchRequestInput

The per-line object of the batch input file

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**custom_id** | **str** | A developer-provided per-request id that will be used to match outputs to inputs. Must be unique for each request in a batch. | [optional] 
**method** | **str** | The HTTP method to be used for the request. Currently only &#x60;POST&#x60; is supported. | [optional] 
**url** | **str** | The OpenAI API relative URL to be used for the request. Currently &#x60;/v1/chat/completions&#x60;, &#x60;/v1/embeddings&#x60;, and &#x60;/v1/completions&#x60; are supported. | [optional] 

## Example

```python
from openapiopenai.models.batch_request_input import BatchRequestInput

# TODO update the JSON string below
json = "{}"
# create an instance of BatchRequestInput from a JSON string
batch_request_input_instance = BatchRequestInput.from_json(json)
# print the JSON string representation of the object
print(BatchRequestInput.to_json())

# convert the object into a dict
batch_request_input_dict = batch_request_input_instance.to_dict()
# create an instance of BatchRequestInput from a dict
batch_request_input_from_dict = BatchRequestInput.from_dict(batch_request_input_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


