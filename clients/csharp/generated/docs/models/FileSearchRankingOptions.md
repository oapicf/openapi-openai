# Org.OpenAPITools.Model.FileSearchRankingOptions
The ranking options for the file search. If not specified, the file search tool will use the `auto` ranker and a score_threshold of 0.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ScoreThreshold** | **decimal** | The score threshold for the file search. All values must be a floating point number between 0 and 1. | 
**Ranker** | **string** | The ranker to use for the file search. If not specified will use the &#x60;auto&#x60; ranker. | [optional] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

