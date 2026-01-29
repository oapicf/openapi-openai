
# RunStepDeltaObject

Represents a run step delta i.e. any changed fields on a run step during streaming. 

## Properties

Name | Type
------------ | -------------
`id` | string
`object` | string
`delta` | [RunStepDeltaObjectDelta](RunStepDeltaObjectDelta.md)

## Example

```typescript
import type { RunStepDeltaObject } from ''

// TODO: Update the object below with actual values
const example = {
  "id": null,
  "object": null,
  "delta": null,
} satisfies RunStepDeltaObject

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as RunStepDeltaObject
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


