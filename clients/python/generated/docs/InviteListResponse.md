# InviteListResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **str** | The object type, which is always &#x60;list&#x60; | 
**data** | [**List[Invite]**](Invite.md) |  | 
**first_id** | **str** | The first &#x60;invite_id&#x60; in the retrieved &#x60;list&#x60; | [optional] 
**last_id** | **str** | The last &#x60;invite_id&#x60; in the retrieved &#x60;list&#x60; | [optional] 
**has_more** | **bool** | The &#x60;has_more&#x60; property is used for pagination to indicate there are additional results. | [optional] 

## Example

```python
from openapiopenai.models.invite_list_response import InviteListResponse

# TODO update the JSON string below
json = "{}"
# create an instance of InviteListResponse from a JSON string
invite_list_response_instance = InviteListResponse.from_json(json)
# print the JSON string representation of the object
print(InviteListResponse.to_json())

# convert the object into a dict
invite_list_response_dict = invite_list_response_instance.to_dict()
# create an instance of InviteListResponse from a dict
invite_list_response_from_dict = InviteListResponse.from_dict(invite_list_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


