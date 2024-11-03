# AssistantsApiToolChoiceOption
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **String** | The type of the tool. If type is &#x60;function&#x60;, the function name must be set | 
**VarFunction** | [**ChatCompletionNamedToolChoiceFunction**](ChatCompletionNamedToolChoiceFunction.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$AssistantsApiToolChoiceOption = Initialize-PSOpenAPIToolsAssistantsApiToolChoiceOption  -Type null `
 -VarFunction null
```

- Convert the resource to JSON
```powershell
$AssistantsApiToolChoiceOption | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

