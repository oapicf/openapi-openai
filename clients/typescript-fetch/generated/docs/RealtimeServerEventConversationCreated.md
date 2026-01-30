
# RealtimeServerEventConversationCreated

Returned when a conversation is created. Emitted right after session creation. 

## Properties

Name | Type
------------ | -------------
`eventId` | string
`type` | string
`conversation` | [RealtimeServerEventConversationCreatedConversation](RealtimeServerEventConversationCreatedConversation.md)

## Example

```typescript
import type { RealtimeServerEventConversationCreated } from ''

// TODO: Update the object below with actual values
const example = {
  "eventId": null,
  "type": null,
  "conversation": null,
} satisfies RealtimeServerEventConversationCreated

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as RealtimeServerEventConversationCreated
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


