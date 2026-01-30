# CreateThreadAndRunRequestToolResources
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CodeInterpreter** | [**CreateAssistantRequestToolResourcesCodeInterpreter**](CreateAssistantRequestToolResourcesCodeInterpreter.md) |  | [optional] 
**FileSearch** | [**AssistantObjectToolResourcesFileSearch**](AssistantObjectToolResourcesFileSearch.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$CreateThreadAndRunRequestToolResources = Initialize-PSOpenAPIToolsCreateThreadAndRunRequestToolResources  -CodeInterpreter null `
 -FileSearch null
```

- Convert the resource to JSON
```powershell
$CreateThreadAndRunRequestToolResources | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

