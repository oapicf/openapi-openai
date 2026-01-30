
# MessageContentImageUrlObject

References an image URL in the content of a message.

## Properties

Name | Type
------------ | -------------
`type` | string
`imageUrl` | [MessageContentImageUrlObjectImageUrl](MessageContentImageUrlObjectImageUrl.md)

## Example

```typescript
import type { MessageContentImageUrlObject } from ''

// TODO: Update the object below with actual values
const example = {
  "type": null,
  "imageUrl": null,
} satisfies MessageContentImageUrlObject

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as MessageContentImageUrlObject
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


