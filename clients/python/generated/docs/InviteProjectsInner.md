# InviteProjectsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | Project&#39;s public ID | [optional] 
**role** | **str** | Project membership role | [optional] 

## Example

```python
from openapiopenai.models.invite_projects_inner import InviteProjectsInner

# TODO update the JSON string below
json = "{}"
# create an instance of InviteProjectsInner from a JSON string
invite_projects_inner_instance = InviteProjectsInner.from_json(json)
# print the JSON string representation of the object
print(InviteProjectsInner.to_json())

# convert the object into a dict
invite_projects_inner_dict = invite_projects_inner_instance.to_dict()
# create an instance of InviteProjectsInner from a dict
invite_projects_inner_from_dict = InviteProjectsInner.from_dict(invite_projects_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


