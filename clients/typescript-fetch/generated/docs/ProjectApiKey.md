
# ProjectApiKey

Represents an individual API key in a project.

## Properties

Name | Type
------------ | -------------
`object` | string
`redactedValue` | string
`name` | string
`createdAt` | number
`id` | string
`owner` | [ProjectApiKeyOwner](ProjectApiKeyOwner.md)

## Example

```typescript
import type { ProjectApiKey } from ''

// TODO: Update the object below with actual values
const example = {
  "object": null,
  "redactedValue": null,
  "name": null,
  "createdAt": null,
  "id": null,
  "owner": null,
} satisfies ProjectApiKey

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ProjectApiKey
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


