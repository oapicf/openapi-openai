
# CreateModerationResponseResultsInnerCategoryScores

A list of the categories along with their scores as predicted by model.

## Properties

Name | Type
------------ | -------------
`hate` | number
`hateThreatening` | number
`harassment` | number
`harassmentThreatening` | number
`selfHarm` | number
`selfHarmIntent` | number
`selfHarmInstructions` | number
`sexual` | number
`sexualMinors` | number
`violence` | number
`violenceGraphic` | number

## Example

```typescript
import type { CreateModerationResponseResultsInnerCategoryScores } from ''

// TODO: Update the object below with actual values
const example = {
  "hate": null,
  "hateThreatening": null,
  "harassment": null,
  "harassmentThreatening": null,
  "selfHarm": null,
  "selfHarmIntent": null,
  "selfHarmInstructions": null,
  "sexual": null,
  "sexualMinors": null,
  "violence": null,
  "violenceGraphic": null,
} satisfies CreateModerationResponseResultsInnerCategoryScores

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CreateModerationResponseResultsInnerCategoryScores
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


