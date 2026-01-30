# InviteRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**email** | **str** | Send an email to this address | 
**role** | **str** | &#x60;owner&#x60; or &#x60;reader&#x60; | 
**projects** | [**List[InviteRequestProjectsInner]**](InviteRequestProjectsInner.md) | An array of projects to which membership is granted at the same time the org invite is accepted. If omitted, the user will be invited to the default project for compatibility with legacy behavior. | [optional] 

## Example

```python
from openapiopenai.models.invite_request import InviteRequest

# TODO update the JSON string below
json = "{}"
# create an instance of InviteRequest from a JSON string
invite_request_instance = InviteRequest.from_json(json)
# print the JSON string representation of the object
print(InviteRequest.to_json())

# convert the object into a dict
invite_request_dict = invite_request_instance.to_dict()
# create an instance of InviteRequest from a dict
invite_request_from_dict = InviteRequest.from_dict(invite_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


