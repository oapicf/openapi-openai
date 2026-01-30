# InviteDeleteResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Object** | **String** | The object type, which is always &#x60;organization.invite.deleted&#x60; | 
**Id** | **String** |  | 
**Deleted** | **Boolean** |  | 

## Examples

- Prepare the resource
```powershell
$InviteDeleteResponse = Initialize-PSOpenAPIToolsInviteDeleteResponse  -Object null `
 -Id null `
 -Deleted null
```

- Convert the resource to JSON
```powershell
$InviteDeleteResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

