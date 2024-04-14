# RunStepDeltaStepDetailsToolCallsCodeOutputImageObject
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Index** | **Int32** | The index of the output in the outputs array. | 
**Type** | **String** | Always &#x60;image&#x60;. | 
**Image** | [**RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage**](RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$RunStepDeltaStepDetailsToolCallsCodeOutputImageObject = Initialize-PSOpenAPIToolsRunStepDeltaStepDetailsToolCallsCodeOutputImageObject  -Index null `
 -Type null `
 -Image null
```

- Convert the resource to JSON
```powershell
$RunStepDeltaStepDetailsToolCallsCodeOutputImageObject | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

