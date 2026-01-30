# FileSearchRankingOptions

The ranking options for the file search. If not specified, the file search tool will use the `auto` ranker and a score_threshold of 0.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ranker** | **str** | The ranker to use for the file search. If not specified will use the &#x60;auto&#x60; ranker. | [optional] 
**score_threshold** | **float** | The score threshold for the file search. All values must be a floating point number between 0 and 1. | 

## Example

```python
from openapiopenai.models.file_search_ranking_options import FileSearchRankingOptions

# TODO update the JSON string below
json = "{}"
# create an instance of FileSearchRankingOptions from a JSON string
file_search_ranking_options_instance = FileSearchRankingOptions.from_json(json)
# print the JSON string representation of the object
print(FileSearchRankingOptions.to_json())

# convert the object into a dict
file_search_ranking_options_dict = file_search_ranking_options_instance.to_dict()
# create an instance of FileSearchRankingOptions from a dict
file_search_ranking_options_from_dict = FileSearchRankingOptions.from_dict(file_search_ranking_options_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


