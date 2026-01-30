# InviteRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**email** | **String** | Send an email to this address | 
**role** | **String** | `owner` or `reader` | 
**projects** | Option<[**Vec<models::InviteRequestProjectsInner>**](InviteRequest_projects_inner.md)> | An array of projects to which membership is granted at the same time the org invite is accepted. If omitted, the user will be invited to the default project for compatibility with legacy behavior. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


