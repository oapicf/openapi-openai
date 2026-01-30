
# RealtimeServerEventConversationItemTruncated

Returned when an earlier assistant audio message item is truncated by the  client with a `conversation.item.truncate` event. This event is used to  synchronize the server\'s understanding of the audio with the client\'s playback.  This action will truncate the audio and remove the server-side text transcript  to ensure there is no text in the context that hasn\'t been heard by the user. 

## Properties

Name | Type
------------ | -------------
`eventId` | string
`type` | string
`itemId` | string
`contentIndex` | number
`audioEndMs` | number

## Example

```typescript
import type { RealtimeServerEventConversationItemTruncated } from ''

// TODO: Update the object below with actual values
const example = {
  "eventId": null,
  "type": null,
  "itemId": null,
  "contentIndex": null,
  "audioEndMs": null,
} satisfies RealtimeServerEventConversationItemTruncated

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as RealtimeServerEventConversationItemTruncated
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


