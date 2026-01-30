# AssistantObjectToolResources
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CodeInterpreter** | [**AssistantObjectToolResourcesCodeInterpreter**](AssistantObjectToolResourcesCodeInterpreter.md) |  | [optional] 
**FileSearch** | [**AssistantObjectToolResourcesFileSearch**](AssistantObjectToolResourcesFileSearch.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$AssistantObjectToolResources = Initialize-PSOpenAPIToolsAssistantObjectToolResources  -CodeInterpreter null `
 -FileSearch null
```

- Convert the resource to JSON
```powershell
$AssistantObjectToolResources | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

