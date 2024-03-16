# CreateModerationResponseResultsInnerCategoryScores


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hate** | **float** |  | 
**hate_threatening** | **float** |  | 
**self_harm** | **float** |  | 
**sexual** | **float** |  | 
**sexual_minors** | **float** |  | 
**violence** | **float** |  | 
**violence_graphic** | **float** |  | 

## Example

```python
from openapiopenai.models.create_moderation_response_results_inner_category_scores import CreateModerationResponseResultsInnerCategoryScores

# TODO update the JSON string below
json = "{}"
# create an instance of CreateModerationResponseResultsInnerCategoryScores from a JSON string
create_moderation_response_results_inner_category_scores_instance = CreateModerationResponseResultsInnerCategoryScores.from_json(json)
# print the JSON string representation of the object
print(CreateModerationResponseResultsInnerCategoryScores.to_json())

# convert the object into a dict
create_moderation_response_results_inner_category_scores_dict = create_moderation_response_results_inner_category_scores_instance.to_dict()
# create an instance of CreateModerationResponseResultsInnerCategoryScores from a dict
create_moderation_response_results_inner_category_scores_form_dict = create_moderation_response_results_inner_category_scores.from_dict(create_moderation_response_results_inner_category_scores_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


