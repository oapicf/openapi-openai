# AssistantsNamedToolChoice
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **String** | The type of the tool. If type is &#x60;function&#x60;, the function name must be set | 
**VarFunction** | [**AssistantsNamedToolChoiceFunction**](AssistantsNamedToolChoiceFunction.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$AssistantsNamedToolChoice = Initialize-PSOpenAPIToolsAssistantsNamedToolChoice  -Type null `
 -VarFunction null
```

- Convert the resource to JSON
```powershell
$AssistantsNamedToolChoice | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

