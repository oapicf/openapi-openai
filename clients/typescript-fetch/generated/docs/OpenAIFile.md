
# OpenAIFile

The `File` object represents a document that has been uploaded to OpenAI.

## Properties

Name | Type
------------ | -------------
`id` | string
`bytes` | number
`createdAt` | number
`filename` | string
`object` | string
`purpose` | string
`status` | string
`statusDetails` | string

## Example

```typescript
import type { OpenAIFile } from ''

// TODO: Update the object below with actual values
const example = {
  "id": null,
  "bytes": null,
  "createdAt": null,
  "filename": null,
  "object": null,
  "purpose": null,
  "status": null,
  "statusDetails": null,
} satisfies OpenAIFile

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as OpenAIFile
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


