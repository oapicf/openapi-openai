
# RealtimeClientEventConversationItemDelete

Send this event when you want to remove any item from the conversation  history. The server will respond with a `conversation.item.deleted` event,  unless the item does not exist in the conversation history, in which case the  server will respond with an error. 

## Properties

Name | Type
------------ | -------------
`eventId` | string
`type` | string
`itemId` | string

## Example

```typescript
import type { RealtimeClientEventConversationItemDelete } from ''

// TODO: Update the object below with actual values
const example = {
  "eventId": null,
  "type": null,
  "itemId": null,
} satisfies RealtimeClientEventConversationItemDelete

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as RealtimeClientEventConversationItemDelete
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


