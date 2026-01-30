
# RealtimeServerEventResponseOutputItemAdded

Returned when a new Item is created during Response generation.

## Properties

Name | Type
------------ | -------------
`eventId` | string
`type` | string
`responseId` | string
`outputIndex` | number
`item` | [RealtimeConversationItem](RealtimeConversationItem.md)

## Example

```typescript
import type { RealtimeServerEventResponseOutputItemAdded } from ''

// TODO: Update the object below with actual values
const example = {
  "eventId": null,
  "type": null,
  "responseId": null,
  "outputIndex": null,
  "item": null,
} satisfies RealtimeServerEventResponseOutputItemAdded

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as RealtimeServerEventResponseOutputItemAdded
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


