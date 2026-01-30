# INVITE_REQUEST

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**email** | [**STRING_32**](STRING_32.md) | Send an email to this address | [default to null]
**role** | [**STRING_32**](STRING_32.md) | &#x60;owner&#x60; or &#x60;reader&#x60; | [default to null]
**projects** | [**LIST [INVITE_REQUEST_PROJECTS_INNER]**](InviteRequest_projects_inner.md) | An array of projects to which membership is granted at the same time the org invite is accepted. If omitted, the user will be invited to the default project for compatibility with legacy behavior. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


