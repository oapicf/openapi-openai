
# RealtimeServerEventInputAudioBufferCommitted

Returned when an input audio buffer is committed, either by the client or  automatically in server VAD mode. The `item_id` property is the ID of the user message item that will be created, thus a `conversation.item.created` event  will also be sent to the client. 

## Properties

Name | Type
------------ | -------------
`eventId` | string
`type` | string
`previousItemId` | string
`itemId` | string

## Example

```typescript
import type { RealtimeServerEventInputAudioBufferCommitted } from ''

// TODO: Update the object below with actual values
const example = {
  "eventId": null,
  "type": null,
  "previousItemId": null,
  "itemId": null,
} satisfies RealtimeServerEventInputAudioBufferCommitted

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as RealtimeServerEventInputAudioBufferCommitted
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


