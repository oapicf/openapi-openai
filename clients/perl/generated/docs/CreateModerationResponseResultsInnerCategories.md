# WWW::OpenAPIClient::Object::CreateModerationResponseResultsInnerCategories

## Load the model package
```perl
use WWW::OpenAPIClient::Object::CreateModerationResponseResultsInnerCategories;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hate** | **boolean** | Content that expresses, incites, or promotes hate based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste. Hateful content aimed at non-protected groups (e.g., chess players) is harassment. | 
**hate/threatening** | **boolean** | Hateful content that also includes violence or serious harm towards the targeted group based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste. | 
**harassment** | **boolean** | Content that expresses, incites, or promotes harassing language towards any target. | 
**harassment/threatening** | **boolean** | Harassment content that also includes violence or serious harm towards any target. | 
**illicit** | **boolean** | Content that includes instructions or advice that facilitate the planning or execution of wrongdoing, or that gives advice or instruction on how to commit illicit acts. For example, \&quot;how to shoplift\&quot; would fit this category. | 
**illicit/violent** | **boolean** | Content that includes instructions or advice that facilitate the planning or execution of wrongdoing that also includes violence, or that gives advice or instruction on the procurement of any weapon. | 
**self_harm** | **boolean** | Content that promotes, encourages, or depicts acts of self-harm, such as suicide, cutting, and eating disorders. | 
**self_harm/intent** | **boolean** | Content where the speaker expresses that they are engaging or intend to engage in acts of self-harm, such as suicide, cutting, and eating disorders. | 
**self_harm/instructions** | **boolean** | Content that encourages performing acts of self-harm, such as suicide, cutting, and eating disorders, or that gives instructions or advice on how to commit such acts. | 
**sexual** | **boolean** | Content meant to arouse sexual excitement, such as the description of sexual activity, or that promotes sexual services (excluding sex education and wellness). | 
**sexual/minors** | **boolean** | Sexual content that includes an individual who is under 18 years old. | 
**violence** | **boolean** | Content that depicts death, violence, or physical injury. | 
**violence/graphic** | **boolean** | Content that depicts death, violence, or physical injury in graphic detail. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


