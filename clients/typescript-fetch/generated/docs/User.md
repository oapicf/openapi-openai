
# User

Represents an individual `user` within an organization.

## Properties

Name | Type
------------ | -------------
`object` | string
`id` | string
`name` | string
`email` | string
`role` | string
`addedAt` | number

## Example

```typescript
import type { User } from ''

// TODO: Update the object below with actual values
const example = {
  "object": null,
  "id": null,
  "name": null,
  "email": null,
  "role": null,
  "addedAt": null,
} satisfies User

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as User
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


