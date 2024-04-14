# ChatCompletionTool
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **String** | The type of the tool. Currently, only &#x60;function&#x60; is supported. | 
**VarFunction** | [**FunctionObject**](FunctionObject.md) |  | 

## Examples

- Prepare the resource
```powershell
$ChatCompletionTool = Initialize-PSOpenAPIToolsChatCompletionTool  -Type null `
 -VarFunction null
```

- Convert the resource to JSON
```powershell
$ChatCompletionTool | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

