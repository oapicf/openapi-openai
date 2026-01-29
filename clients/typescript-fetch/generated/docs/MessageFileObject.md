
# MessageFileObject

A list of files attached to a `message`.

## Properties

Name | Type
------------ | -------------
`id` | string
`object` | string
`createdAt` | number
`messageId` | string

## Example

```typescript
import type { MessageFileObject } from ''

// TODO: Update the object below with actual values
const example = {
  "id": null,
  "object": null,
  "createdAt": null,
  "messageId": null,
} satisfies MessageFileObject

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as MessageFileObject
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


