
# RealtimeServerEventConversationItemDeleted

Returned when an item in the conversation is deleted by the client with a  `conversation.item.delete` event. This event is used to synchronize the  server\'s understanding of the conversation history with the client\'s view. 

## Properties

Name | Type
------------ | -------------
`eventId` | string
`type` | string
`itemId` | string

## Example

```typescript
import type { RealtimeServerEventConversationItemDeleted } from ''

// TODO: Update the object below with actual values
const example = {
  "eventId": null,
  "type": null,
  "itemId": null,
} satisfies RealtimeServerEventConversationItemDeleted

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as RealtimeServerEventConversationItemDeleted
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


