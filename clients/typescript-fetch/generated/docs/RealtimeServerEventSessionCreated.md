
# RealtimeServerEventSessionCreated

Returned when a Session is created. Emitted automatically when a new  connection is established as the first server event. This event will contain  the default Session configuration. 

## Properties

Name | Type
------------ | -------------
`eventId` | string
`type` | string
`session` | [RealtimeSession](RealtimeSession.md)

## Example

```typescript
import type { RealtimeServerEventSessionCreated } from ''

// TODO: Update the object below with actual values
const example = {
  "eventId": null,
  "type": null,
  "session": null,
} satisfies RealtimeServerEventSessionCreated

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as RealtimeServerEventSessionCreated
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


