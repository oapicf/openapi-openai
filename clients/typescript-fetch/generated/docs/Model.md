
# Model

Describes an OpenAI model offering that can be used with the API.

## Properties

Name | Type
------------ | -------------
`id` | string
`created` | number
`object` | string
`ownedBy` | string

## Example

```typescript
import type { Model } from ''

// TODO: Update the object below with actual values
const example = {
  "id": null,
  "created": null,
  "object": null,
  "ownedBy": null,
} satisfies Model

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as Model
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


