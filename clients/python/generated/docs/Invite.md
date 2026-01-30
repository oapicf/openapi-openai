# Invite

Represents an individual `invite` to the organization.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **str** | The object type, which is always &#x60;organization.invite&#x60; | 
**id** | **str** | The identifier, which can be referenced in API endpoints | 
**email** | **str** | The email address of the individual to whom the invite was sent | 
**role** | **str** | &#x60;owner&#x60; or &#x60;reader&#x60; | 
**status** | **str** | &#x60;accepted&#x60;,&#x60;expired&#x60;, or &#x60;pending&#x60; | 
**invited_at** | **int** | The Unix timestamp (in seconds) of when the invite was sent. | 
**expires_at** | **int** | The Unix timestamp (in seconds) of when the invite expires. | 
**accepted_at** | **int** | The Unix timestamp (in seconds) of when the invite was accepted. | [optional] 
**projects** | [**List[InviteProjectsInner]**](InviteProjectsInner.md) | The projects that were granted membership upon acceptance of the invite. | [optional] 

## Example

```python
from openapiopenai.models.invite import Invite

# TODO update the JSON string below
json = "{}"
# create an instance of Invite from a JSON string
invite_instance = Invite.from_json(json)
# print the JSON string representation of the object
print(Invite.to_json())

# convert the object into a dict
invite_dict = invite_instance.to_dict()
# create an instance of Invite from a dict
invite_from_dict = Invite.from_dict(invite_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


