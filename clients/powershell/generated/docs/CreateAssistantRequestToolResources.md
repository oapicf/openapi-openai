# CreateAssistantRequestToolResources
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CodeInterpreter** | [**CreateAssistantRequestToolResourcesCodeInterpreter**](CreateAssistantRequestToolResourcesCodeInterpreter.md) |  | [optional] 
**FileSearch** | [**CreateAssistantRequestToolResourcesFileSearch**](CreateAssistantRequestToolResourcesFileSearch.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$CreateAssistantRequestToolResources = Initialize-PSOpenAPIToolsCreateAssistantRequestToolResources  -CodeInterpreter null `
 -FileSearch null
```

- Convert the resource to JSON
```powershell
$CreateAssistantRequestToolResources | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

