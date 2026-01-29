# AssistantToolsRetrieval


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** | The type of tool being defined: &#x60;retrieval&#x60; | 

## Example

```python
from openapiopenai.models.assistant_tools_retrieval import AssistantToolsRetrieval

# TODO update the JSON string below
json = "{}"
# create an instance of AssistantToolsRetrieval from a JSON string
assistant_tools_retrieval_instance = AssistantToolsRetrieval.from_json(json)
# print the JSON string representation of the object
print(AssistantToolsRetrieval.to_json())

# convert the object into a dict
assistant_tools_retrieval_dict = assistant_tools_retrieval_instance.to_dict()
# create an instance of AssistantToolsRetrieval from a dict
assistant_tools_retrieval_from_dict = AssistantToolsRetrieval.from_dict(assistant_tools_retrieval_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


