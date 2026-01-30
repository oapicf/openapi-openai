
# AuditLogOrganizationUpdatedChangesRequested

The payload used to update the organization settings.

## Properties

Name | Type
------------ | -------------
`title` | string
`description` | string
`name` | string
`settings` | [AuditLogOrganizationUpdatedChangesRequestedSettings](AuditLogOrganizationUpdatedChangesRequestedSettings.md)

## Example

```typescript
import type { AuditLogOrganizationUpdatedChangesRequested } from ''

// TODO: Update the object below with actual values
const example = {
  "title": null,
  "description": null,
  "name": null,
  "settings": null,
} satisfies AuditLogOrganizationUpdatedChangesRequested

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as AuditLogOrganizationUpdatedChangesRequested
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


