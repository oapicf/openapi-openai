
# RealtimeServerEventSessionUpdated

Returned when a session is updated with a `session.update` event, unless  there is an error. 

## Properties

Name | Type
------------ | -------------
`eventId` | string
`type` | string
`session` | [RealtimeSession](RealtimeSession.md)

## Example

```typescript
import type { RealtimeServerEventSessionUpdated } from ''

// TODO: Update the object below with actual values
const example = {
  "eventId": null,
  "type": null,
  "session": null,
} satisfies RealtimeServerEventSessionUpdated

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as RealtimeServerEventSessionUpdated
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


