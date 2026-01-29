
# MessageContentTextObject

The text content that is part of a message.

## Properties

Name | Type
------------ | -------------
`type` | string
`text` | [MessageContentTextObjectText](MessageContentTextObjectText.md)

## Example

```typescript
import type { MessageContentTextObject } from ''

// TODO: Update the object below with actual values
const example = {
  "type": null,
  "text": null,
} satisfies MessageContentTextObject

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as MessageContentTextObject
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


