
# RealtimeServerEventResponseFunctionCallArgumentsDone

Returned when the model-generated function call arguments are done streaming. Also emitted when a Response is interrupted, incomplete, or cancelled. 

## Properties

Name | Type
------------ | -------------
`eventId` | string
`type` | string
`responseId` | string
`itemId` | string
`outputIndex` | number
`callId` | string
`arguments` | string

## Example

```typescript
import type { RealtimeServerEventResponseFunctionCallArgumentsDone } from ''

// TODO: Update the object below with actual values
const example = {
  "eventId": null,
  "type": null,
  "responseId": null,
  "itemId": null,
  "outputIndex": null,
  "callId": null,
  "arguments": null,
} satisfies RealtimeServerEventResponseFunctionCallArgumentsDone

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as RealtimeServerEventResponseFunctionCallArgumentsDone
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


