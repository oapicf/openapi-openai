
# CreateModerationResponseResultsInnerCategories

A list of the categories, and whether they are flagged or not.

## Properties

Name | Type
------------ | -------------
`hate` | boolean
`hateThreatening` | boolean
`harassment` | boolean
`harassmentThreatening` | boolean
`selfHarm` | boolean
`selfHarmIntent` | boolean
`selfHarmInstructions` | boolean
`sexual` | boolean
`sexualMinors` | boolean
`violence` | boolean
`violenceGraphic` | boolean

## Example

```typescript
import type { CreateModerationResponseResultsInnerCategories } from ''

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
} satisfies CreateModerationResponseResultsInnerCategories

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CreateModerationResponseResultsInnerCategories
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


