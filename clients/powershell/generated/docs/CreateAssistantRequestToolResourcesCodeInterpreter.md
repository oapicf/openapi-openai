# CreateAssistantRequestToolResourcesCodeInterpreter
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FileIds** | **String[]** | A list of [file](/docs/api-reference/files) IDs made available to the &#x60;code_interpreter&#x60; tool. There can be a maximum of 20 files associated with the tool.  | [optional] 

## Examples

- Prepare the resource
```powershell
$CreateAssistantRequestToolResourcesCodeInterpreter = Initialize-PSOpenAPIToolsCreateAssistantRequestToolResourcesCodeInterpreter  -FileIds null
```

- Convert the resource to JSON
```powershell
$CreateAssistantRequestToolResourcesCodeInterpreter | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

