# CreateEmbeddingRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**model** | [**CreateEmbeddingRequestModel**](CreateEmbeddingRequestModel.md) |  | 
**input** | [**CreateEmbeddingRequestInput**](CreateEmbeddingRequestInput.md) |  | 
**user** | **str** | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  | [optional] 

## Example

```python
from openapiopenai.models.create_embedding_request import CreateEmbeddingRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CreateEmbeddingRequest from a JSON string
create_embedding_request_instance = CreateEmbeddingRequest.from_json(json)
# print the JSON string representation of the object
print(CreateEmbeddingRequest.to_json())

# convert the object into a dict
create_embedding_request_dict = create_embedding_request_instance.to_dict()
# create an instance of CreateEmbeddingRequest from a dict
create_embedding_request_form_dict = create_embedding_request.from_dict(create_embedding_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


