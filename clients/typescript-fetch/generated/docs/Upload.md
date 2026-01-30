
# Upload

The Upload object can accept byte chunks in the form of Parts. 

## Properties

Name | Type
------------ | -------------
`id` | string
`createdAt` | number
`filename` | string
`bytes` | number
`purpose` | string
`status` | string
`expiresAt` | number
`object` | string
`file` | [OpenAIFile](OpenAIFile.md)

## Example

```typescript
import type { Upload } from ''

// TODO: Update the object below with actual values
const example = {
  "id": null,
  "createdAt": null,
  "filename": null,
  "bytes": null,
  "purpose": null,
  "status": null,
  "expiresAt": null,
  "object": null,
  "file": null,
} satisfies Upload

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as Upload
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


