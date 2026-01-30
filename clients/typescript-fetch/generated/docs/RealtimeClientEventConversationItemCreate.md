
# RealtimeClientEventConversationItemCreate

Add a new Item to the Conversation\'s context, including messages, function  calls, and function call responses. This event can be used both to populate a  \"history\" of the conversation and to add new items mid-stream, but has the  current limitation that it cannot populate assistant audio messages.  If successful, the server will respond with a `conversation.item.created`  event, otherwise an `error` event will be sent. 

## Properties

Name | Type
------------ | -------------
`eventId` | string
`type` | string
`previousItemId` | string
`item` | [RealtimeConversationItem](RealtimeConversationItem.md)

## Example

```typescript
import type { RealtimeClientEventConversationItemCreate } from ''

// TODO: Update the object below with actual values
const example = {
  "eventId": null,
  "type": null,
  "previousItemId": null,
  "item": null,
} satisfies RealtimeClientEventConversationItemCreate

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as RealtimeClientEventConversationItemCreate
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


