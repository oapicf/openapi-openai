# FileSearchRankingOptions
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Ranker** | **String** | The ranker to use for the file search. If not specified will use the &#x60;auto&#x60; ranker. | [optional] 
**ScoreThreshold** | **Decimal** | The score threshold for the file search. All values must be a floating point number between 0 and 1. | 

## Examples

- Prepare the resource
```powershell
$FileSearchRankingOptions = Initialize-PSOpenAPIToolsFileSearchRankingOptions  -Ranker null `
 -ScoreThreshold null
```

- Convert the resource to JSON
```powershell
$FileSearchRankingOptions | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

