# Invite

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **Object** | The object type, which is always `organization.invite` (enum: organization.invite) | 
**id** | **String** | The identifier, which can be referenced in API endpoints | 
**email** | **String** | The email address of the individual to whom the invite was sent | 
**role** | **Role** | `owner` or `reader` (enum: owner, reader) | 
**status** | **Status** | `accepted`,`expired`, or `pending` (enum: accepted, expired, pending) | 
**invited_at** | **i32** | The Unix timestamp (in seconds) of when the invite was sent. | 
**expires_at** | **i32** | The Unix timestamp (in seconds) of when the invite expires. | 
**accepted_at** | Option<**i32**> | The Unix timestamp (in seconds) of when the invite was accepted. | [optional]
**projects** | Option<[**Vec<models::InviteProjectsInner>**](InviteProjectsInner.md)> | The projects that were granted membership upon acceptance of the invite. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


