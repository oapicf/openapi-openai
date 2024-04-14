# CREATE_MODERATION_RESPONSE_RESULTS_INNER_CATEGORIES

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hate** | **BOOLEAN** | Content that expresses, incites, or promotes hate based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste. Hateful content aimed at non-protected groups (e.g., chess players) is harassment. | [default to null]
**hate_threatening** | **BOOLEAN** | Hateful content that also includes violence or serious harm towards the targeted group based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste. | [default to null]
**harassment** | **BOOLEAN** | Content that expresses, incites, or promotes harassing language towards any target. | [default to null]
**harassment_threatening** | **BOOLEAN** | Harassment content that also includes violence or serious harm towards any target. | [default to null]
**self_harm** | **BOOLEAN** | Content that promotes, encourages, or depicts acts of self-harm, such as suicide, cutting, and eating disorders. | [default to null]
**self_harm_intent** | **BOOLEAN** | Content where the speaker expresses that they are engaging or intend to engage in acts of self-harm, such as suicide, cutting, and eating disorders. | [default to null]
**self_harm_instructions** | **BOOLEAN** | Content that encourages performing acts of self-harm, such as suicide, cutting, and eating disorders, or that gives instructions or advice on how to commit such acts. | [default to null]
**sexual** | **BOOLEAN** | Content meant to arouse sexual excitement, such as the description of sexual activity, or that promotes sexual services (excluding sex education and wellness). | [default to null]
**sexual_minors** | **BOOLEAN** | Sexual content that includes an individual who is under 18 years old. | [default to null]
**violence** | **BOOLEAN** | Content that depicts death, violence, or physical injury. | [default to null]
**violence_graphic** | **BOOLEAN** | Content that depicts death, violence, or physical injury in graphic detail. | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


