# CreateThreadRequestToolResources
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CodeInterpreter** | [**CreateAssistantRequestToolResourcesCodeInterpreter**](CreateAssistantRequestToolResourcesCodeInterpreter.md) |  | [optional] 
**FileSearch** | [**CreateThreadRequestToolResourcesFileSearch**](CreateThreadRequestToolResourcesFileSearch.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$CreateThreadRequestToolResources = Initialize-PSOpenAPIToolsCreateThreadRequestToolResources  -CodeInterpreter null `
 -FileSearch null
```

- Convert the resource to JSON
```powershell
$CreateThreadRequestToolResources | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

