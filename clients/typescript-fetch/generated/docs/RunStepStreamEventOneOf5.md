
# RunStepStreamEventOneOf5

Occurs when a [run step](/docs/api-reference/runs/step-object) is cancelled.

## Properties

Name | Type
------------ | -------------
`event` | string
`data` | [RunStepObject](RunStepObject.md)

## Example

```typescript
import type { RunStepStreamEventOneOf5 } from ''

// TODO: Update the object below with actual values
const example = {
  "event": null,
  "data": null,
} satisfies RunStepStreamEventOneOf5

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as RunStepStreamEventOneOf5
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


