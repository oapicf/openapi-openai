# ModifyAssistantRequestToolResources
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CodeInterpreter** | [**ModifyAssistantRequestToolResourcesCodeInterpreter**](ModifyAssistantRequestToolResourcesCodeInterpreter.md) |  | [optional] 
**FileSearch** | [**ModifyAssistantRequestToolResourcesFileSearch**](ModifyAssistantRequestToolResourcesFileSearch.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ModifyAssistantRequestToolResources = Initialize-PSOpenAPIToolsModifyAssistantRequestToolResources  -CodeInterpreter null `
 -FileSearch null
```

- Convert the resource to JSON
```powershell
$ModifyAssistantRequestToolResources | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

