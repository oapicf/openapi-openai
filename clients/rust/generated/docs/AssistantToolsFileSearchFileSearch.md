# AssistantToolsFileSearchFileSearch

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**max_num_results** | Option<**i32**> | The maximum number of results the file search tool should output. The default is 20 for `gpt-4*` models and 5 for `gpt-3.5-turbo`. This number should be between 1 and 50 inclusive.  Note that the file search tool may output fewer than `max_num_results` results. See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.  | [optional]
**ranking_options** | Option<[**models::FileSearchRankingOptions**](FileSearchRankingOptions.md)> |  | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


