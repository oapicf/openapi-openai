
# RunStepDetailsToolCallsFileSearchResultObject

A result instance of the file search.

## Properties

Name | Type
------------ | -------------
`fileId` | string
`fileName` | string
`score` | number
`content` | [Array&lt;RunStepDetailsToolCallsFileSearchResultObjectContentInner&gt;](RunStepDetailsToolCallsFileSearchResultObjectContentInner.md)

## Example

```typescript
import type { RunStepDetailsToolCallsFileSearchResultObject } from ''

// TODO: Update the object below with actual values
const example = {
  "fileId": null,
  "fileName": null,
  "score": null,
  "content": null,
} satisfies RunStepDetailsToolCallsFileSearchResultObject

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as RunStepDetailsToolCallsFileSearchResultObject
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


