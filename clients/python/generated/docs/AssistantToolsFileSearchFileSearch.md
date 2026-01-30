# AssistantToolsFileSearchFileSearch

Overrides for the file search tool.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**max_num_results** | **int** | The maximum number of results the file search tool should output. The default is 20 for &#x60;gpt-4*&#x60; models and 5 for &#x60;gpt-3.5-turbo&#x60;. This number should be between 1 and 50 inclusive.  Note that the file search tool may output fewer than &#x60;max_num_results&#x60; results. See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.  | [optional] 
**ranking_options** | [**FileSearchRankingOptions**](FileSearchRankingOptions.md) |  | [optional] 

## Example

```python
from openapiopenai.models.assistant_tools_file_search_file_search import AssistantToolsFileSearchFileSearch

# TODO update the JSON string below
json = "{}"
# create an instance of AssistantToolsFileSearchFileSearch from a JSON string
assistant_tools_file_search_file_search_instance = AssistantToolsFileSearchFileSearch.from_json(json)
# print the JSON string representation of the object
print(AssistantToolsFileSearchFileSearch.to_json())

# convert the object into a dict
assistant_tools_file_search_file_search_dict = assistant_tools_file_search_file_search_instance.to_dict()
# create an instance of AssistantToolsFileSearchFileSearch from a dict
assistant_tools_file_search_file_search_from_dict = AssistantToolsFileSearchFileSearch.from_dict(assistant_tools_file_search_file_search_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


