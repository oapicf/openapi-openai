
# ProjectUser

Represents an individual user in a project.

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
import type { ProjectUser } from ''

// TODO: Update the object below with actual values
const example = {
  "object": null,
  "id": null,
  "name": null,
  "email": null,
  "role": null,
  "addedAt": null,
} satisfies ProjectUser

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ProjectUser
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


