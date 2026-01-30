
# UploadPart

The upload Part represents a chunk of bytes we can add to an Upload object. 

## Properties

Name | Type
------------ | -------------
`id` | string
`createdAt` | number
`uploadId` | string
`object` | string

## Example

```typescript
import type { UploadPart } from ''

// TODO: Update the object below with actual values
const example = {
  "id": null,
  "createdAt": null,
  "uploadId": null,
  "object": null,
} satisfies UploadPart

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as UploadPart
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


