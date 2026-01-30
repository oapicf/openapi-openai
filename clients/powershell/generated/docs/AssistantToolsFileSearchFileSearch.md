# AssistantToolsFileSearchFileSearch
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MaxNumResults** | **Int32** | The maximum number of results the file search tool should output. The default is 20 for &#x60;gpt-4*&#x60; models and 5 for &#x60;gpt-3.5-turbo&#x60;. This number should be between 1 and 50 inclusive.  Note that the file search tool may output fewer than &#x60;max_num_results&#x60; results. See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.  | [optional] 
**RankingOptions** | [**FileSearchRankingOptions**](FileSearchRankingOptions.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$AssistantToolsFileSearchFileSearch = Initialize-PSOpenAPIToolsAssistantToolsFileSearchFileSearch  -MaxNumResults null `
 -RankingOptions null
```

- Convert the resource to JSON
```powershell
$AssistantToolsFileSearchFileSearch | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

