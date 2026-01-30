
# AuditLogActor

The actor who performed the audit logged action.

## Properties

Name | Type
------------ | -------------
`type` | string
`session` | [AuditLogActorSession](.md)
`apiKey` | [AuditLogActorApiKey](.md)

## Example

```typescript
import type { AuditLogActor } from ''

// TODO: Update the object below with actual values
const example = {
  "type": null,
  "session": null,
  "apiKey": null,
} satisfies AuditLogActor

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as AuditLogActor
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


