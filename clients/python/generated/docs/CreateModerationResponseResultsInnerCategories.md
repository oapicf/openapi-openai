# CreateModerationResponseResultsInnerCategories

A list of the categories, and whether they are flagged or not.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hate** | **bool** | Content that expresses, incites, or promotes hate based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste. Hateful content aimed at non-protected groups (e.g., chess players) is harassment. | 
**hate_threatening** | **bool** | Hateful content that also includes violence or serious harm towards the targeted group based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste. | 
**harassment** | **bool** | Content that expresses, incites, or promotes harassing language towards any target. | 
**harassment_threatening** | **bool** | Harassment content that also includes violence or serious harm towards any target. | 
**self_harm** | **bool** | Content that promotes, encourages, or depicts acts of self-harm, such as suicide, cutting, and eating disorders. | 
**self_harm_intent** | **bool** | Content where the speaker expresses that they are engaging or intend to engage in acts of self-harm, such as suicide, cutting, and eating disorders. | 
**self_harm_instructions** | **bool** | Content that encourages performing acts of self-harm, such as suicide, cutting, and eating disorders, or that gives instructions or advice on how to commit such acts. | 
**sexual** | **bool** | Content meant to arouse sexual excitement, such as the description of sexual activity, or that promotes sexual services (excluding sex education and wellness). | 
**sexual_minors** | **bool** | Sexual content that includes an individual who is under 18 years old. | 
**violence** | **bool** | Content that depicts death, violence, or physical injury. | 
**violence_graphic** | **bool** | Content that depicts death, violence, or physical injury in graphic detail. | 

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
create_moderation_response_results_inner_categories_from_dict = CreateModerationResponseResultsInnerCategories.from_dict(create_moderation_response_results_inner_categories_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


