
# RunStepObjectStepDetails

The details of the run step.

## Properties

Name | Type
------------ | -------------
`type` | string
`messageCreation` | [RunStepDetailsMessageCreationObjectMessageCreation](RunStepDetailsMessageCreationObjectMessageCreation.md)
`toolCalls` | [Array&lt;RunStepDetailsToolCallsObjectToolCallsInner&gt;](RunStepDetailsToolCallsObjectToolCallsInner.md)

## Example

```typescript
import type { RunStepObjectStepDetails } from ''

// TODO: Update the object below with actual values
const example = {
  "type": null,
  "messageCreation": null,
  "toolCalls": null,
} satisfies RunStepObjectStepDetails

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as RunStepObjectStepDetails
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


