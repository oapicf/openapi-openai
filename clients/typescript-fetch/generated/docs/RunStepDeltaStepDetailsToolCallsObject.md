
# RunStepDeltaStepDetailsToolCallsObject

Details of the tool call.

## Properties

Name | Type
------------ | -------------
`type` | string
`toolCalls` | [Array&lt;RunStepDeltaStepDetailsToolCallsObjectToolCallsInner&gt;](RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.md)

## Example

```typescript
import type { RunStepDeltaStepDetailsToolCallsObject } from ''

// TODO: Update the object below with actual values
const example = {
  "type": null,
  "toolCalls": null,
} satisfies RunStepDeltaStepDetailsToolCallsObject

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as RunStepDeltaStepDetailsToolCallsObject
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


