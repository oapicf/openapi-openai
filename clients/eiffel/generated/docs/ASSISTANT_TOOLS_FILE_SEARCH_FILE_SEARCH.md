# ASSISTANT_TOOLS_FILE_SEARCH_FILE_SEARCH

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**max_num_results** | **INTEGER_32** | The maximum number of results the file search tool should output. The default is 20 for &#x60;gpt-4*&#x60; models and 5 for &#x60;gpt-3.5-turbo&#x60;. This number should be between 1 and 50 inclusive.  Note that the file search tool may output fewer than &#x60;max_num_results&#x60; results. See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.  | [optional] [default to null]
**ranking_options** | [**FILE_SEARCH_RANKING_OPTIONS**](FileSearchRankingOptions.md) |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


