# RunStepDetailsToolCallsFileSearchObjectFileSearch
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RankingOptions** | [**RunStepDetailsToolCallsFileSearchRankingOptionsObject**](RunStepDetailsToolCallsFileSearchRankingOptionsObject.md) |  | [optional] 
**Results** | [**RunStepDetailsToolCallsFileSearchResultObject[]**](RunStepDetailsToolCallsFileSearchResultObject.md) | The results of the file search. | [optional] 

## Examples

- Prepare the resource
```powershell
$RunStepDetailsToolCallsFileSearchObjectFileSearch = Initialize-PSOpenAPIToolsRunStepDetailsToolCallsFileSearchObjectFileSearch  -RankingOptions null `
 -Results null
```

- Convert the resource to JSON
```powershell
$RunStepDetailsToolCallsFileSearchObjectFileSearch | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

