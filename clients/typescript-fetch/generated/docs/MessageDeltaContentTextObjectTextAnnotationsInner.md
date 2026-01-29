
# MessageDeltaContentTextObjectTextAnnotationsInner


## Properties

Name | Type
------------ | -------------
`index` | number
`type` | string
`text` | string
`fileCitation` | [MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation](MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation.md)
`startIndex` | number
`endIndex` | number
`filePath` | [MessageDeltaContentTextAnnotationsFilePathObjectFilePath](MessageDeltaContentTextAnnotationsFilePathObjectFilePath.md)

## Example

```typescript
import type { MessageDeltaContentTextObjectTextAnnotationsInner } from ''

// TODO: Update the object below with actual values
const example = {
  "index": null,
  "type": null,
  "text": null,
  "fileCitation": null,
  "startIndex": null,
  "endIndex": null,
  "filePath": null,
} satisfies MessageDeltaContentTextObjectTextAnnotationsInner

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as MessageDeltaContentTextObjectTextAnnotationsInner
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


