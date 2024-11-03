# OpenApiOpenAIClient::CreateModerationResponseResultsInnerCategories

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **hate** | **Boolean** | Content that expresses, incites, or promotes hate based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste. Hateful content aimed at non-protected groups (e.g., chess players) is harassment. |  |
| **hate_threatening** | **Boolean** | Hateful content that also includes violence or serious harm towards the targeted group based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste. |  |
| **harassment** | **Boolean** | Content that expresses, incites, or promotes harassing language towards any target. |  |
| **harassment_threatening** | **Boolean** | Harassment content that also includes violence or serious harm towards any target. |  |
| **self_harm** | **Boolean** | Content that promotes, encourages, or depicts acts of self-harm, such as suicide, cutting, and eating disorders. |  |
| **self_harm_intent** | **Boolean** | Content where the speaker expresses that they are engaging or intend to engage in acts of self-harm, such as suicide, cutting, and eating disorders. |  |
| **self_harm_instructions** | **Boolean** | Content that encourages performing acts of self-harm, such as suicide, cutting, and eating disorders, or that gives instructions or advice on how to commit such acts. |  |
| **sexual** | **Boolean** | Content meant to arouse sexual excitement, such as the description of sexual activity, or that promotes sexual services (excluding sex education and wellness). |  |
| **sexual_minors** | **Boolean** | Sexual content that includes an individual who is under 18 years old. |  |
| **violence** | **Boolean** | Content that depicts death, violence, or physical injury. |  |
| **violence_graphic** | **Boolean** | Content that depicts death, violence, or physical injury in graphic detail. |  |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::CreateModerationResponseResultsInnerCategories.new(
  hate: null,
  hate_threatening: null,
  harassment: null,
  harassment_threatening: null,
  self_harm: null,
  self_harm_intent: null,
  self_harm_instructions: null,
  sexual: null,
  sexual_minors: null,
  violence: null,
  violence_graphic: null
)
```

