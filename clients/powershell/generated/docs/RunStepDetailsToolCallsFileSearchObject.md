# RunStepDetailsToolCallsFileSearchObject
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | The ID of the tool call object. | 
**Type** | **String** | The type of tool call. This is always going to be &#x60;file_search&#x60; for this type of tool call. | 
**FileSearch** | [**RunStepDetailsToolCallsFileSearchObjectFileSearch**](RunStepDetailsToolCallsFileSearchObjectFileSearch.md) |  | 

## Examples

- Prepare the resource
```powershell
$RunStepDetailsToolCallsFileSearchObject = Initialize-PSOpenAPIToolsRunStepDetailsToolCallsFileSearchObject  -Id null `
 -Type null `
 -FileSearch null
```

- Convert the resource to JSON
```powershell
$RunStepDetailsToolCallsFileSearchObject | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

