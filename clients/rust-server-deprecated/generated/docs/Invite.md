# Invite

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | [***models::InviteObject**](Invite_object.md) |  | 
**id** | **String** | The identifier, which can be referenced in API endpoints | 
**email** | **String** | The email address of the individual to whom the invite was sent | 
**role** | [***models::InviteRole**](Invite_role.md) |  | 
**status** | [***models::InviteStatus**](Invite_status.md) |  | 
**invited_at** | **i32** | The Unix timestamp (in seconds) of when the invite was sent. | 
**expires_at** | **i32** | The Unix timestamp (in seconds) of when the invite expires. | 
**accepted_at** | **i32** | The Unix timestamp (in seconds) of when the invite was accepted. | [optional] [default to None]
**projects** | [**Vec<models::InviteProjectsInner>**](Invite_projects_inner.md) | The projects that were granted membership upon acceptance of the invite. | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


