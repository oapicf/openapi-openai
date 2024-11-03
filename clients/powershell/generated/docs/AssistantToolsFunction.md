# AssistantToolsFunction
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **String** | The type of tool being defined: &#x60;function&#x60; | 
**VarFunction** | [**FunctionObject**](FunctionObject.md) |  | 

## Examples

- Prepare the resource
```powershell
$AssistantToolsFunction = Initialize-PSOpenAPIToolsAssistantToolsFunction  -Type null `
 -VarFunction null
```

- Convert the resource to JSON
```powershell
$AssistantToolsFunction | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

