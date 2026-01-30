# RunStepDetailsToolCallsFileSearchRankingOptionsObject
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Ranker** | **String** | The ranker used for the file search. | 
**ScoreThreshold** | **Decimal** | The score threshold for the file search. All values must be a floating point number between 0 and 1. | 

## Examples

- Prepare the resource
```powershell
$RunStepDetailsToolCallsFileSearchRankingOptionsObject = Initialize-PSOpenAPIToolsRunStepDetailsToolCallsFileSearchRankingOptionsObject  -Ranker null `
 -ScoreThreshold null
```

- Convert the resource to JSON
```powershell
$RunStepDetailsToolCallsFileSearchRankingOptionsObject | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

