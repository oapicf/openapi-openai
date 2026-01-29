
# AssistantFileObject

A list of [Files](/docs/api-reference/files) attached to an `assistant`.

## Properties

Name | Type
------------ | -------------
`id` | string
`object` | string
`createdAt` | number
`assistantId` | string

## Example

```typescript
import type { AssistantFileObject } from ''

// TODO: Update the object below with actual values
const example = {
  "id": null,
  "object": null,
  "createdAt": null,
  "assistantId": null,
} satisfies AssistantFileObject

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as AssistantFileObject
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


