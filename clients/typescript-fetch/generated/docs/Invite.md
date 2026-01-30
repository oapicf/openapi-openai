
# Invite

Represents an individual `invite` to the organization.

## Properties

Name | Type
------------ | -------------
`object` | string
`id` | string
`email` | string
`role` | string
`status` | string
`invitedAt` | number
`expiresAt` | number
`acceptedAt` | number
`projects` | [Array&lt;InviteProjectsInner&gt;](InviteProjectsInner.md)

## Example

```typescript
import type { Invite } from ''

// TODO: Update the object below with actual values
const example = {
  "object": null,
  "id": null,
  "email": null,
  "role": null,
  "status": null,
  "invitedAt": null,
  "expiresAt": null,
  "acceptedAt": null,
  "projects": null,
} satisfies Invite

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as Invite
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


