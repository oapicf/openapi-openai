# Invite

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **String** | The object type, which is always &#x60;organization.invite&#x60; | 
**id** | **String** | The identifier, which can be referenced in API endpoints | 
**email** | **String** | The email address of the individual to whom the invite was sent | 
**role** | **String** | &#x60;owner&#x60; or &#x60;reader&#x60; | 
**status** | **String** | &#x60;accepted&#x60;,&#x60;expired&#x60;, or &#x60;pending&#x60; | 
**invitedAt** | **Int** | The Unix timestamp (in seconds) of when the invite was sent. | 
**expiresAt** | **Int** | The Unix timestamp (in seconds) of when the invite expires. | 
**acceptedAt** | **Int** | The Unix timestamp (in seconds) of when the invite was accepted. | [optional] 
**projects** | [InviteProjectsInner] | The projects that were granted membership upon acceptance of the invite. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


