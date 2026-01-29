
# MessageDeltaObjectDeltaContentInner


## Properties

Name | Type
------------ | -------------
`index` | number
`type` | string
`imageFile` | [MessageDeltaContentImageFileObjectImageFile](MessageDeltaContentImageFileObjectImageFile.md)
`text` | [MessageDeltaContentTextObjectText](MessageDeltaContentTextObjectText.md)

## Example

```typescript
import type { MessageDeltaObjectDeltaContentInner } from ''

// TODO: Update the object below with actual values
const example = {
  "index": null,
  "type": null,
  "imageFile": null,
  "text": null,
} satisfies MessageDeltaObjectDeltaContentInner

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as MessageDeltaObjectDeltaContentInner
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


