
# RealtimeClientEventConversationItemTruncate

Send this event to truncate a previous assistant message’s audio. The server  will produce audio faster than realtime, so this event is useful when the user  interrupts to truncate audio that has already been sent to the client but not  yet played. This will synchronize the server\'s understanding of the audio with  the client\'s playback.  Truncating audio will delete the server-side text transcript to ensure there  is not text in the context that hasn\'t been heard by the user.  If successful, the server will respond with a `conversation.item.truncated`  event.  

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
import type { RealtimeClientEventConversationItemTruncate } from ''

// TODO: Update the object below with actual values
const example = {
  "eventId": null,
  "type": null,
  "itemId": null,
  "contentIndex": null,
  "audioEndMs": null,
} satisfies RealtimeClientEventConversationItemTruncate

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as RealtimeClientEventConversationItemTruncate
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


