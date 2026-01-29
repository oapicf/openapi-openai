
# RunStreamEventOneOf

Occurs when a new [run](/docs/api-reference/runs/object) is created.

## Properties

Name | Type
------------ | -------------
`event` | string
`data` | [RunObject](RunObject.md)

## Example

```typescript
import type { RunStreamEventOneOf } from ''

// TODO: Update the object below with actual values
const example = {
  "event": null,
  "data": null,
} satisfies RunStreamEventOneOf

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as RunStreamEventOneOf
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


