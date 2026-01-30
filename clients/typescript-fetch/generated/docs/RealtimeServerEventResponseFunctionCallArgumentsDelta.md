
# RealtimeServerEventResponseFunctionCallArgumentsDelta

Returned when the model-generated function call arguments are updated. 

## Properties

Name | Type
------------ | -------------
`eventId` | string
`type` | string
`responseId` | string
`itemId` | string
`outputIndex` | number
`callId` | string
`delta` | string

## Example

```typescript
import type { RealtimeServerEventResponseFunctionCallArgumentsDelta } from ''

// TODO: Update the object below with actual values
const example = {
  "eventId": null,
  "type": null,
  "responseId": null,
  "itemId": null,
  "outputIndex": null,
  "callId": null,
  "delta": null,
} satisfies RealtimeServerEventResponseFunctionCallArgumentsDelta

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as RealtimeServerEventResponseFunctionCallArgumentsDelta
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


