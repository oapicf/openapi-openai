
# TruncationObject

Controls for how a thread will be truncated prior to the run. Use this to control the intial context window of the run.

## Properties

Name | Type
------------ | -------------
`type` | string
`lastMessages` | number

## Example

```typescript
import type { TruncationObject } from ''

// TODO: Update the object below with actual values
const example = {
  "type": null,
  "lastMessages": null,
} satisfies TruncationObject

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as TruncationObject
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


