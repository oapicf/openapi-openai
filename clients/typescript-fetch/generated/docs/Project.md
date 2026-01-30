
# Project

Represents an individual project.

## Properties

Name | Type
------------ | -------------
`id` | string
`object` | string
`name` | string
`createdAt` | number
`archivedAt` | number
`status` | string

## Example

```typescript
import type { Project } from ''

// TODO: Update the object below with actual values
const example = {
  "id": null,
  "object": null,
  "name": null,
  "createdAt": null,
  "archivedAt": null,
  "status": null,
} satisfies Project

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as Project
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


