# CreateModerationResponseResultsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**flagged** | **bool** |  | 
**categories** | [**CreateModerationResponseResultsInnerCategories**](CreateModerationResponseResultsInnerCategories.md) |  | 
**category_scores** | [**CreateModerationResponseResultsInnerCategoryScores**](CreateModerationResponseResultsInnerCategoryScores.md) |  | 

## Example

```python
from openapiopenai.models.create_moderation_response_results_inner import CreateModerationResponseResultsInner

# TODO update the JSON string below
json = "{}"
# create an instance of CreateModerationResponseResultsInner from a JSON string
create_moderation_response_results_inner_instance = CreateModerationResponseResultsInner.from_json(json)
# print the JSON string representation of the object
print(CreateModerationResponseResultsInner.to_json())

# convert the object into a dict
create_moderation_response_results_inner_dict = create_moderation_response_results_inner_instance.to_dict()
# create an instance of CreateModerationResponseResultsInner from a dict
create_moderation_response_results_inner_form_dict = create_moderation_response_results_inner.from_dict(create_moderation_response_results_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


