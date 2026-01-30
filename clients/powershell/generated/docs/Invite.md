# Invite
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Object** | **String** | The object type, which is always &#x60;organization.invite&#x60; | 
**Id** | **String** | The identifier, which can be referenced in API endpoints | 
**Email** | **String** | The email address of the individual to whom the invite was sent | 
**Role** | **String** | &#x60;owner&#x60; or &#x60;reader&#x60; | 
**Status** | **String** | &#x60;accepted&#x60;,&#x60;expired&#x60;, or &#x60;pending&#x60; | 
**InvitedAt** | **Int32** | The Unix timestamp (in seconds) of when the invite was sent. | 
**ExpiresAt** | **Int32** | The Unix timestamp (in seconds) of when the invite expires. | 
**AcceptedAt** | **Int32** | The Unix timestamp (in seconds) of when the invite was accepted. | [optional] 
**Projects** | [**InviteProjectsInner[]**](InviteProjectsInner.md) | The projects that were granted membership upon acceptance of the invite. | [optional] 

## Examples

- Prepare the resource
```powershell
$Invite = Initialize-PSOpenAPIToolsInvite  -Object null `
 -Id null `
 -Email null `
 -Role null `
 -Status null `
 -InvitedAt null `
 -ExpiresAt null `
 -AcceptedAt null `
 -Projects null
```

- Convert the resource to JSON
```powershell
$Invite | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

