
# RunObjectRequiredAction

Details on the action required to continue the run. Will be `null` if no action is required.

## Properties

Name | Type
------------ | -------------
`type` | string
`submitToolOutputs` | [RunObjectRequiredActionSubmitToolOutputs](RunObjectRequiredActionSubmitToolOutputs.md)

## Example

```typescript
import type { RunObjectRequiredAction } from ''

// TODO: Update the object below with actual values
const example = {
  "type": null,
  "submitToolOutputs": null,
} satisfies RunObjectRequiredAction

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as RunObjectRequiredAction
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


