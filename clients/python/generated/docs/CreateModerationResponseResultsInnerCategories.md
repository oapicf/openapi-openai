# CreateModerationResponseResultsInnerCategories


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hate** | **bool** |  | 
**hate_threatening** | **bool** |  | 
**self_harm** | **bool** |  | 
**sexual** | **bool** |  | 
**sexual_minors** | **bool** |  | 
**violence** | **bool** |  | 
**violence_graphic** | **bool** |  | 

## Example

```python
from openapiopenai.models.create_moderation_response_results_inner_categories import CreateModerationResponseResultsInnerCategories

# TODO update the JSON string below
json = "{}"
# create an instance of CreateModerationResponseResultsInnerCategories from a JSON string
create_moderation_response_results_inner_categories_instance = CreateModerationResponseResultsInnerCategories.from_json(json)
# print the JSON string representation of the object
print(CreateModerationResponseResultsInnerCategories.to_json())

# convert the object into a dict
create_moderation_response_results_inner_categories_dict = create_moderation_response_results_inner_categories_instance.to_dict()
# create an instance of CreateModerationResponseResultsInnerCategories from a dict
create_moderation_response_results_inner_categories_form_dict = create_moderation_response_results_inner_categories.from_dict(create_moderation_response_results_inner_categories_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


