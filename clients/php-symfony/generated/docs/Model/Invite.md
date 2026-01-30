# Invite

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **string** | The object type, which is always &#x60;organization.invite&#x60; | 
**id** | **string** | The identifier, which can be referenced in API endpoints | 
**email** | **string** | The email address of the individual to whom the invite was sent | 
**role** | **string** | &#x60;owner&#x60; or &#x60;reader&#x60; | 
**status** | **string** | &#x60;accepted&#x60;,&#x60;expired&#x60;, or &#x60;pending&#x60; | 
**invitedAt** | **int** | The Unix timestamp (in seconds) of when the invite was sent. | 
**expiresAt** | **int** | The Unix timestamp (in seconds) of when the invite expires. | 
**acceptedAt** | **int** | The Unix timestamp (in seconds) of when the invite was accepted. | [optional] 
**projects** | [**OpenAPI\Server\Model\InviteProjectsInner**](InviteProjectsInner.md) | The projects that were granted membership upon acceptance of the invite. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


