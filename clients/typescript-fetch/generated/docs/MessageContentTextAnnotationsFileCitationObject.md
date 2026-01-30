
# MessageContentTextAnnotationsFileCitationObject

A citation within the message that points to a specific quote from a specific File associated with the assistant or the message. Generated when the assistant uses the \"file_search\" tool to search files.

## Properties

Name | Type
------------ | -------------
`type` | string
`text` | string
`fileCitation` | [MessageContentTextAnnotationsFileCitationObjectFileCitation](MessageContentTextAnnotationsFileCitationObjectFileCitation.md)
`startIndex` | number
`endIndex` | number

## Example

```typescript
import type { MessageContentTextAnnotationsFileCitationObject } from ''

// TODO: Update the object below with actual values
const example = {
  "type": null,
  "text": null,
  "fileCitation": null,
  "startIndex": null,
  "endIndex": null,
} satisfies MessageContentTextAnnotationsFileCitationObject

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as MessageContentTextAnnotationsFileCitationObject
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


