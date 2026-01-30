# CreateModerationResponseResultsInnerCategoryAppliedInputTypes

A list of the categories along with the input type(s) that the score applies to.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hate** | **List[str]** | The applied input type(s) for the category &#39;hate&#39;. | 
**hate_threatening** | **List[str]** | The applied input type(s) for the category &#39;hate/threatening&#39;. | 
**harassment** | **List[str]** | The applied input type(s) for the category &#39;harassment&#39;. | 
**harassment_threatening** | **List[str]** | The applied input type(s) for the category &#39;harassment/threatening&#39;. | 
**illicit** | **List[str]** | The applied input type(s) for the category &#39;illicit&#39;. | 
**illicit_violent** | **List[str]** | The applied input type(s) for the category &#39;illicit/violent&#39;. | 
**self_harm** | **List[str]** | The applied input type(s) for the category &#39;self-harm&#39;. | 
**self_harm_intent** | **List[str]** | The applied input type(s) for the category &#39;self-harm/intent&#39;. | 
**self_harm_instructions** | **List[str]** | The applied input type(s) for the category &#39;self-harm/instructions&#39;. | 
**sexual** | **List[str]** | The applied input type(s) for the category &#39;sexual&#39;. | 
**sexual_minors** | **List[str]** | The applied input type(s) for the category &#39;sexual/minors&#39;. | 
**violence** | **List[str]** | The applied input type(s) for the category &#39;violence&#39;. | 
**violence_graphic** | **List[str]** | The applied input type(s) for the category &#39;violence/graphic&#39;. | 

## Example

```python
from openapiopenai.models.create_moderation_response_results_inner_category_applied_input_types import CreateModerationResponseResultsInnerCategoryAppliedInputTypes

# TODO update the JSON string below
json = "{}"
# create an instance of CreateModerationResponseResultsInnerCategoryAppliedInputTypes from a JSON string
create_moderation_response_results_inner_category_applied_input_types_instance = CreateModerationResponseResultsInnerCategoryAppliedInputTypes.from_json(json)
# print the JSON string representation of the object
print(CreateModerationResponseResultsInnerCategoryAppliedInputTypes.to_json())

# convert the object into a dict
create_moderation_response_results_inner_category_applied_input_types_dict = create_moderation_response_results_inner_category_applied_input_types_instance.to_dict()
# create an instance of CreateModerationResponseResultsInnerCategoryAppliedInputTypes from a dict
create_moderation_response_results_inner_category_applied_input_types_from_dict = CreateModerationResponseResultsInnerCategoryAppliedInputTypes.from_dict(create_moderation_response_results_inner_category_applied_input_types_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


