# RunStepDeltaStepDetailsToolCallsFileSearchObject
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Index** | **Int32** | The index of the tool call in the tool calls array. | 
**Id** | **String** | The ID of the tool call object. | [optional] 
**Type** | **String** | The type of tool call. This is always going to be &#x60;file_search&#x60; for this type of tool call. | 
**FileSearch** | [**SystemCollectionsHashtable**](.md) | For now, this is always going to be an empty object. | 

## Examples

- Prepare the resource
```powershell
$RunStepDeltaStepDetailsToolCallsFileSearchObject = Initialize-PSOpenAPIToolsRunStepDeltaStepDetailsToolCallsFileSearchObject  -Index null `
 -Id null `
 -Type null `
 -FileSearch null
```

- Convert the resource to JSON
```powershell
$RunStepDeltaStepDetailsToolCallsFileSearchObject | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

