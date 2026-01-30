# AssistantObjectToolsInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **String** | The type of tool being defined: &#x60;code_interpreter&#x60; | 
**FileSearch** | [**AssistantToolsFileSearchFileSearch**](AssistantToolsFileSearchFileSearch.md) |  | [optional] 
**VarFunction** | [**FunctionObject**](FunctionObject.md) |  | 

## Examples

- Prepare the resource
```powershell
$AssistantObjectToolsInner = Initialize-PSOpenAPIToolsAssistantObjectToolsInner  -Type null `
 -FileSearch null `
 -VarFunction null
```

- Convert the resource to JSON
```powershell
$AssistantObjectToolsInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

