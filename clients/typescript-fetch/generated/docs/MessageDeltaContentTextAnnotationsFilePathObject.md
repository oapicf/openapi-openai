
# MessageDeltaContentTextAnnotationsFilePathObject

A URL for the file that\'s generated when the assistant used the `code_interpreter` tool to generate a file.

## Properties

Name | Type
------------ | -------------
`index` | number
`type` | string
`text` | string
`filePath` | [MessageDeltaContentTextAnnotationsFilePathObjectFilePath](MessageDeltaContentTextAnnotationsFilePathObjectFilePath.md)
`startIndex` | number
`endIndex` | number

## Example

```typescript
import type { MessageDeltaContentTextAnnotationsFilePathObject } from ''

// TODO: Update the object below with actual values
const example = {
  "index": null,
  "type": null,
  "text": null,
  "filePath": null,
  "startIndex": null,
  "endIndex": null,
} satisfies MessageDeltaContentTextAnnotationsFilePathObject

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as MessageDeltaContentTextAnnotationsFilePathObject
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


