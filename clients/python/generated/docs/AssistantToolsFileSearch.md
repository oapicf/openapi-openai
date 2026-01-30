# AssistantToolsFileSearch


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** | The type of tool being defined: &#x60;file_search&#x60; | 
**file_search** | [**AssistantToolsFileSearchFileSearch**](AssistantToolsFileSearchFileSearch.md) |  | [optional] 

## Example

```python
from openapiopenai.models.assistant_tools_file_search import AssistantToolsFileSearch

# TODO update the JSON string below
json = "{}"
# create an instance of AssistantToolsFileSearch from a JSON string
assistant_tools_file_search_instance = AssistantToolsFileSearch.from_json(json)
# print the JSON string representation of the object
print(AssistantToolsFileSearch.to_json())

# convert the object into a dict
assistant_tools_file_search_dict = assistant_tools_file_search_instance.to_dict()
# create an instance of AssistantToolsFileSearch from a dict
assistant_tools_file_search_from_dict = AssistantToolsFileSearch.from_dict(assistant_tools_file_search_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


