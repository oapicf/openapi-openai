# VectorStoreExpirationAfter

The expiration policy for a vector store.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**anchor** | **str** | Anchor timestamp after which the expiration policy applies. Supported anchors: &#x60;last_active_at&#x60;. | 
**days** | **int** | The number of days after the anchor time that the vector store will expire. | 

## Example

```python
from openapiopenai.models.vector_store_expiration_after import VectorStoreExpirationAfter

# TODO update the JSON string below
json = "{}"
# create an instance of VectorStoreExpirationAfter from a JSON string
vector_store_expiration_after_instance = VectorStoreExpirationAfter.from_json(json)
# print the JSON string representation of the object
print(VectorStoreExpirationAfter.to_json())

# convert the object into a dict
vector_store_expiration_after_dict = vector_store_expiration_after_instance.to_dict()
# create an instance of VectorStoreExpirationAfter from a dict
vector_store_expiration_after_from_dict = VectorStoreExpirationAfter.from_dict(vector_store_expiration_after_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


