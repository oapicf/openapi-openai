
# CreateModerationResponseResultsInner


## Properties

Name | Type
------------ | -------------
`flagged` | boolean
`categories` | [CreateModerationResponseResultsInnerCategories](CreateModerationResponseResultsInnerCategories.md)
`categoryScores` | [CreateModerationResponseResultsInnerCategoryScores](CreateModerationResponseResultsInnerCategoryScores.md)
`categoryAppliedInputTypes` | [CreateModerationResponseResultsInnerCategoryAppliedInputTypes](CreateModerationResponseResultsInnerCategoryAppliedInputTypes.md)

## Example

```typescript
import type { CreateModerationResponseResultsInner } from ''

// TODO: Update the object below with actual values
const example = {
  "flagged": null,
  "categories": null,
  "categoryScores": null,
  "categoryAppliedInputTypes": null,
} satisfies CreateModerationResponseResultsInner

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CreateModerationResponseResultsInner
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


