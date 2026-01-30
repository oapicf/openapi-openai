# AssistantToolsFileSearch
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **String** | The type of tool being defined: &#x60;file_search&#x60; | 
**FileSearch** | [**AssistantToolsFileSearchFileSearch**](AssistantToolsFileSearchFileSearch.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$AssistantToolsFileSearch = Initialize-PSOpenAPIToolsAssistantToolsFileSearch  -Type null `
 -FileSearch null
```

- Convert the resource to JSON
```powershell
$AssistantToolsFileSearch | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

