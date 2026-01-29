# RunStepDetailsToolCallsObjectToolCallsInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | The ID of the tool call object. | 
**Type** | **String** | The type of tool call. This is always going to be &#x60;code_interpreter&#x60; for this type of tool call. | 
**CodeInterpreter** | [**RunStepDetailsToolCallsCodeObjectCodeInterpreter**](RunStepDetailsToolCallsCodeObjectCodeInterpreter.md) |  | 
**Retrieval** | [**SystemCollectionsHashtable**](.md) | For now, this is always going to be an empty object. | 
**VarFunction** | [**RunStepDetailsToolCallsFunctionObjectFunction**](RunStepDetailsToolCallsFunctionObjectFunction.md) |  | 

## Examples

- Prepare the resource
```powershell
$RunStepDetailsToolCallsObjectToolCallsInner = Initialize-PSOpenAPIToolsRunStepDetailsToolCallsObjectToolCallsInner  -Id null `
 -Type null `
 -CodeInterpreter null `
 -Retrieval null `
 -VarFunction null
```

- Convert the resource to JSON
```powershell
$RunStepDetailsToolCallsObjectToolCallsInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

