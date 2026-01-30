# InviteRequestProjectsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | Project&#39;s public ID | 
**role** | **str** | Project membership role | 

## Example

```python
from openapiopenai.models.invite_request_projects_inner import InviteRequestProjectsInner

# TODO update the JSON string below
json = "{}"
# create an instance of InviteRequestProjectsInner from a JSON string
invite_request_projects_inner_instance = InviteRequestProjectsInner.from_json(json)
# print the JSON string representation of the object
print(InviteRequestProjectsInner.to_json())

# convert the object into a dict
invite_request_projects_inner_dict = invite_request_projects_inner_instance.to_dict()
# create an instance of InviteRequestProjectsInner from a dict
invite_request_projects_inner_from_dict = InviteRequestProjectsInner.from_dict(invite_request_projects_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


