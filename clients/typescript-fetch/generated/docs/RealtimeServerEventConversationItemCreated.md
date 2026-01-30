
# RealtimeServerEventConversationItemCreated

Returned when a conversation item is created. There are several scenarios that  produce this event:   - The server is generating a Response, which if successful will produce      either one or two Items, which will be of type `message`      (role `assistant`) or type `function_call`.   - The input audio buffer has been committed, either by the client or the      server (in `server_vad` mode). The server will take the content of the      input audio buffer and add it to a new user message Item.   - The client has sent a `conversation.item.create` event to add a new Item      to the Conversation. 

## Properties

Name | Type
------------ | -------------
`eventId` | string
`type` | string
`previousItemId` | string
`item` | [RealtimeConversationItem](RealtimeConversationItem.md)

## Example

```typescript
import type { RealtimeServerEventConversationItemCreated } from ''

// TODO: Update the object below with actual values
const example = {
  "eventId": null,
  "type": null,
  "previousItemId": null,
  "item": null,
} satisfies RealtimeServerEventConversationItemCreated

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as RealtimeServerEventConversationItemCreated
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


