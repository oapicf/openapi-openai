# CreateModerationResponseResultsInnerCategoryScores

A list of the categories along with their scores as predicted by model.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hate** | **number** | The score for the category \&#39;hate\&#39;. | [default to undefined]
**hate_threatening** | **number** | The score for the category \&#39;hate/threatening\&#39;. | [default to undefined]
**harassment** | **number** | The score for the category \&#39;harassment\&#39;. | [default to undefined]
**harassment_threatening** | **number** | The score for the category \&#39;harassment/threatening\&#39;. | [default to undefined]
**self_harm** | **number** | The score for the category \&#39;self-harm\&#39;. | [default to undefined]
**self_harm_intent** | **number** | The score for the category \&#39;self-harm/intent\&#39;. | [default to undefined]
**self_harm_instructions** | **number** | The score for the category \&#39;self-harm/instructions\&#39;. | [default to undefined]
**sexual** | **number** | The score for the category \&#39;sexual\&#39;. | [default to undefined]
**sexual_minors** | **number** | The score for the category \&#39;sexual/minors\&#39;. | [default to undefined]
**violence** | **number** | The score for the category \&#39;violence\&#39;. | [default to undefined]
**violence_graphic** | **number** | The score for the category \&#39;violence/graphic\&#39;. | [default to undefined]

## Example

```typescript
import { CreateModerationResponseResultsInnerCategoryScores } from './api';

const instance: CreateModerationResponseResultsInnerCategoryScores = {
    hate,
    hate_threatening,
    harassment,
    harassment_threatening,
    self_harm,
    self_harm_intent,
    self_harm_instructions,
    sexual,
    sexual_minors,
    violence,
    violence_graphic,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
