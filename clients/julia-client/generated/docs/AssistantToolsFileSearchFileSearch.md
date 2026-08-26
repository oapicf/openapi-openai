# AssistantToolsFileSearchFileSearch


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`max_num_results`** | **`Int64`** | The maximum number of results the file search tool should output. The default is 20 for &#x60;gpt-4*&#x60; models and 5 for &#x60;gpt-3.5-turbo&#x60;. This number should be between 1 and 50 inclusive.  Note that the file search tool may output fewer than &#x60;max_num_results&#x60; results. See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.  | [optional] [default to nothing]
**`ranking_options`** | [**`*FileSearchRankingOptions`**](FileSearchRankingOptions.md) |  | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


