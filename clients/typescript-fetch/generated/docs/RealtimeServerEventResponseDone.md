
# RealtimeServerEventResponseDone

Returned when a Response is done streaming. Always emitted, no matter the  final state. The Response object included in the `response.done` event will  include all output Items in the Response but will omit the raw audio data. 

## Properties

Name | Type
------------ | -------------
`eventId` | string
`type` | string
`response` | [RealtimeResponse](RealtimeResponse.md)

## Example

```typescript
import type { RealtimeServerEventResponseDone } from ''

// TODO: Update the object below with actual values
const example = {
  "eventId": null,
  "type": null,
  "response": null,
} satisfies RealtimeServerEventResponseDone

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as RealtimeServerEventResponseDone
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


