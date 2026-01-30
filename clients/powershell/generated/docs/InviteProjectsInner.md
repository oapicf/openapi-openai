# InviteProjectsInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | Project&#39;s public ID | [optional] 
**Role** | **String** | Project membership role | [optional] 

## Examples

- Prepare the resource
```powershell
$InviteProjectsInner = Initialize-PSOpenAPIToolsInviteProjectsInner  -Id null `
 -Role null
```

- Convert the resource to JSON
```powershell
$InviteProjectsInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

