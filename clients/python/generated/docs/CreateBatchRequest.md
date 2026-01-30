# CreateBatchRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**input_file_id** | **str** | The ID of an uploaded file that contains requests for the new batch.  See [upload file](/docs/api-reference/files/create) for how to upload a file.  Your input file must be formatted as a [JSONL file](/docs/api-reference/batch/request-input), and must be uploaded with the purpose &#x60;batch&#x60;. The file can contain up to 50,000 requests, and can be up to 200 MB in size.  | 
**endpoint** | **str** | The endpoint to be used for all requests in the batch. Currently &#x60;/v1/chat/completions&#x60;, &#x60;/v1/embeddings&#x60;, and &#x60;/v1/completions&#x60; are supported. Note that &#x60;/v1/embeddings&#x60; batches are also restricted to a maximum of 50,000 embedding inputs across all requests in the batch. | 
**completion_window** | **str** | The time frame within which the batch should be processed. Currently only &#x60;24h&#x60; is supported. | 
**metadata** | **Dict[str, str]** | Optional custom metadata for the batch. | [optional] 

## Example

```python
from openapiopenai.models.create_batch_request import CreateBatchRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CreateBatchRequest from a JSON string
create_batch_request_instance = CreateBatchRequest.from_json(json)
# print the JSON string representation of the object
print(CreateBatchRequest.to_json())

# convert the object into a dict
create_batch_request_dict = create_batch_request_instance.to_dict()
# create an instance of CreateBatchRequest from a dict
create_batch_request_from_dict = CreateBatchRequest.from_dict(create_batch_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


