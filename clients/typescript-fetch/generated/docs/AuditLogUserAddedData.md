
# AuditLogUserAddedData

The payload used to add the user to the project.

## Properties

Name | Type
------------ | -------------
`role` | string

## Example

```typescript
import type { AuditLogUserAddedData } from ''

// TODO: Update the object below with actual values
const example = {
  "role": null,
} satisfies AuditLogUserAddedData

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as AuditLogUserAddedData
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


