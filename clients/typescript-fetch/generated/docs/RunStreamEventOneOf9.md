
# RunStreamEventOneOf9

Occurs when a [run](/docs/api-reference/runs/object) expires.

## Properties

Name | Type
------------ | -------------
`event` | string
`data` | [RunObject](RunObject.md)

## Example

```typescript
import type { RunStreamEventOneOf9 } from ''

// TODO: Update the object below with actual values
const example = {
  "event": null,
  "data": null,
} satisfies RunStreamEventOneOf9

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as RunStreamEventOneOf9
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


