# CreateModerationResponseResultsInnerCategoryScores

A list of the categories along with their scores as predicted by model.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hate** | **float** | The score for the category &#39;hate&#39;. | 
**hate_threatening** | **float** | The score for the category &#39;hate/threatening&#39;. | 
**harassment** | **float** | The score for the category &#39;harassment&#39;. | 
**harassment_threatening** | **float** | The score for the category &#39;harassment/threatening&#39;. | 
**illicit** | **float** | The score for the category &#39;illicit&#39;. | 
**illicit_violent** | **float** | The score for the category &#39;illicit/violent&#39;. | 
**self_harm** | **float** | The score for the category &#39;self-harm&#39;. | 
**self_harm_intent** | **float** | The score for the category &#39;self-harm/intent&#39;. | 
**self_harm_instructions** | **float** | The score for the category &#39;self-harm/instructions&#39;. | 
**sexual** | **float** | The score for the category &#39;sexual&#39;. | 
**sexual_minors** | **float** | The score for the category &#39;sexual/minors&#39;. | 
**violence** | **float** | The score for the category &#39;violence&#39;. | 
**violence_graphic** | **float** | The score for the category &#39;violence/graphic&#39;. | 

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
create_moderation_response_results_inner_category_scores_from_dict = CreateModerationResponseResultsInnerCategoryScores.from_dict(create_moderation_response_results_inner_category_scores_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


