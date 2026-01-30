# ModifyThreadRequestToolResources
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CodeInterpreter** | [**CreateAssistantRequestToolResourcesCodeInterpreter**](CreateAssistantRequestToolResourcesCodeInterpreter.md) |  | [optional] 
**FileSearch** | [**ModifyThreadRequestToolResourcesFileSearch**](ModifyThreadRequestToolResourcesFileSearch.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ModifyThreadRequestToolResources = Initialize-PSOpenAPIToolsModifyThreadRequestToolResources  -CodeInterpreter null `
 -FileSearch null
```

- Convert the resource to JSON
```powershell
$ModifyThreadRequestToolResources | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

