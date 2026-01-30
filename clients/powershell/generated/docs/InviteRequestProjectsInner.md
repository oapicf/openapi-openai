# InviteRequestProjectsInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | Project&#39;s public ID | 
**Role** | **String** | Project membership role | 

## Examples

- Prepare the resource
```powershell
$InviteRequestProjectsInner = Initialize-PSOpenAPIToolsInviteRequestProjectsInner  -Id null `
 -Role null
```

- Convert the resource to JSON
```powershell
$InviteRequestProjectsInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

