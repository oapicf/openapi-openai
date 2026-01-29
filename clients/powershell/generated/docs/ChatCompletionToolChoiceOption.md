# ChatCompletionToolChoiceOption
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **String** | The type of the tool. Currently, only &#x60;function&#x60; is supported. | 
**VarFunction** | [**ChatCompletionNamedToolChoiceFunction**](ChatCompletionNamedToolChoiceFunction.md) |  | 

## Examples

- Prepare the resource
```powershell
$ChatCompletionToolChoiceOption = Initialize-PSOpenAPIToolsChatCompletionToolChoiceOption  -Type null `
 -VarFunction null
```

- Convert the resource to JSON
```powershell
$ChatCompletionToolChoiceOption | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

