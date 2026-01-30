# InviteRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Email** | **String** | Send an email to this address | 
**Role** | **String** | &#x60;owner&#x60; or &#x60;reader&#x60; | 
**Projects** | [**InviteRequestProjectsInner[]**](InviteRequestProjectsInner.md) | An array of projects to which membership is granted at the same time the org invite is accepted. If omitted, the user will be invited to the default project for compatibility with legacy behavior. | [optional] 

## Examples

- Prepare the resource
```powershell
$InviteRequest = Initialize-PSOpenAPIToolsInviteRequest  -Email null `
 -Role null `
 -Projects null
```

- Convert the resource to JSON
```powershell
$InviteRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

