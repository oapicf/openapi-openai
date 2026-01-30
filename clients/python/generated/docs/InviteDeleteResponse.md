# InviteDeleteResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **str** | The object type, which is always &#x60;organization.invite.deleted&#x60; | 
**id** | **str** |  | 
**deleted** | **bool** |  | 

## Example

```python
from openapiopenai.models.invite_delete_response import InviteDeleteResponse

# TODO update the JSON string below
json = "{}"
# create an instance of InviteDeleteResponse from a JSON string
invite_delete_response_instance = InviteDeleteResponse.from_json(json)
# print the JSON string representation of the object
print(InviteDeleteResponse.to_json())

# convert the object into a dict
invite_delete_response_dict = invite_delete_response_instance.to_dict()
# create an instance of InviteDeleteResponse from a dict
invite_delete_response_from_dict = InviteDeleteResponse.from_dict(invite_delete_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


