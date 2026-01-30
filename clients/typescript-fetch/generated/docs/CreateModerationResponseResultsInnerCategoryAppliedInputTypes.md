
# CreateModerationResponseResultsInnerCategoryAppliedInputTypes

A list of the categories along with the input type(s) that the score applies to.

## Properties

Name | Type
------------ | -------------
`hate` | Array&lt;string&gt;
`hateThreatening` | Array&lt;string&gt;
`harassment` | Array&lt;string&gt;
`harassmentThreatening` | Array&lt;string&gt;
`illicit` | Array&lt;string&gt;
`illicitViolent` | Array&lt;string&gt;
`selfHarm` | Array&lt;string&gt;
`selfHarmIntent` | Array&lt;string&gt;
`selfHarmInstructions` | Array&lt;string&gt;
`sexual` | Array&lt;string&gt;
`sexualMinors` | Array&lt;string&gt;
`violence` | Array&lt;string&gt;
`violenceGraphic` | Array&lt;string&gt;

## Example

```typescript
import type { CreateModerationResponseResultsInnerCategoryAppliedInputTypes } from ''

// TODO: Update the object below with actual values
const example = {
  "hate": null,
  "hateThreatening": null,
  "harassment": null,
  "harassmentThreatening": null,
  "illicit": null,
  "illicitViolent": null,
  "selfHarm": null,
  "selfHarmIntent": null,
  "selfHarmInstructions": null,
  "sexual": null,
  "sexualMinors": null,
  "violence": null,
  "violenceGraphic": null,
} satisfies CreateModerationResponseResultsInnerCategoryAppliedInputTypes

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CreateModerationResponseResultsInnerCategoryAppliedInputTypes
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


