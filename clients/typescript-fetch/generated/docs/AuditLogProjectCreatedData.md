
# AuditLogProjectCreatedData

The payload used to create the project.

## Properties

Name | Type
------------ | -------------
`name` | string
`title` | string

## Example

```typescript
import type { AuditLogProjectCreatedData } from ''

// TODO: Update the object below with actual values
const example = {
  "name": null,
  "title": null,
} satisfies AuditLogProjectCreatedData

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as AuditLogProjectCreatedData
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


