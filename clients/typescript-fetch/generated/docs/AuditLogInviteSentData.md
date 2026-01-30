
# AuditLogInviteSentData

The payload used to create the invite.

## Properties

Name | Type
------------ | -------------
`email` | string
`role` | string

## Example

```typescript
import type { AuditLogInviteSentData } from ''

// TODO: Update the object below with actual values
const example = {
  "email": null,
  "role": null,
} satisfies AuditLogInviteSentData

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as AuditLogInviteSentData
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


