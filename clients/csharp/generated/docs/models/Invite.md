# Org.OpenAPITools.Model.Invite
Represents an individual `invite` to the organization.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Object** | **string** | The object type, which is always &#x60;organization.invite&#x60; | 
**Id** | **string** | The identifier, which can be referenced in API endpoints | 
**Email** | **string** | The email address of the individual to whom the invite was sent | 
**Role** | **string** | &#x60;owner&#x60; or &#x60;reader&#x60; | 
**Status** | **string** | &#x60;accepted&#x60;,&#x60;expired&#x60;, or &#x60;pending&#x60; | 
**InvitedAt** | **int** | The Unix timestamp (in seconds) of when the invite was sent. | 
**ExpiresAt** | **int** | The Unix timestamp (in seconds) of when the invite expires. | 
**AcceptedAt** | **int** | The Unix timestamp (in seconds) of when the invite was accepted. | [optional] 
**Projects** | [**List&lt;InviteProjectsInner&gt;**](InviteProjectsInner.md) | The projects that were granted membership upon acceptance of the invite. | [optional] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

