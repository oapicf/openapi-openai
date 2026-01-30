

# AssistantToolsFileSearchFileSearch

Overrides for the file search tool.

The class is defined in **[AssistantToolsFileSearchFileSearch.java](../../src/main/java/org/openapitools/model/AssistantToolsFileSearchFileSearch.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**maxNumResults** | `Integer` | The maximum number of results the file search tool should output. The default is 20 for &#x60;gpt-4*&#x60; models and 5 for &#x60;gpt-3.5-turbo&#x60;. This number should be between 1 and 50 inclusive.  Note that the file search tool may output fewer than &#x60;max_num_results&#x60; results. See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.  |  [optional property]
**rankingOptions** | [`FileSearchRankingOptions`](FileSearchRankingOptions.md) |  |  [optional property]




