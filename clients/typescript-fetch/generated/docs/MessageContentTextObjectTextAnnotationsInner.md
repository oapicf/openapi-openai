
# MessageContentTextObjectTextAnnotationsInner


## Properties

Name | Type
------------ | -------------
`type` | string
`text` | string
`fileCitation` | [MessageContentTextAnnotationsFileCitationObjectFileCitation](MessageContentTextAnnotationsFileCitationObjectFileCitation.md)
`startIndex` | number
`endIndex` | number
`filePath` | [MessageContentTextAnnotationsFilePathObjectFilePath](MessageContentTextAnnotationsFilePathObjectFilePath.md)

## Example

```typescript
import type { MessageContentTextObjectTextAnnotationsInner } from ''

// TODO: Update the object below with actual values
const example = {
  "type": null,
  "text": null,
  "fileCitation": null,
  "startIndex": null,
  "endIndex": null,
  "filePath": null,
} satisfies MessageContentTextObjectTextAnnotationsInner

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as MessageContentTextObjectTextAnnotationsInner
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


