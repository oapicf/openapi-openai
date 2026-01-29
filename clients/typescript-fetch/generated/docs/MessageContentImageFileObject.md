
# MessageContentImageFileObject

References an image [File](/docs/api-reference/files) in the content of a message.

## Properties

Name | Type
------------ | -------------
`type` | string
`imageFile` | [MessageContentImageFileObjectImageFile](MessageContentImageFileObjectImageFile.md)

## Example

```typescript
import type { MessageContentImageFileObject } from ''

// TODO: Update the object below with actual values
const example = {
  "type": null,
  "imageFile": null,
} satisfies MessageContentImageFileObject

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as MessageContentImageFileObject
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


