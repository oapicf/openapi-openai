
# RealtimeClientEventSessionUpdate

Send this event to update the session’s default configuration. The client may  send this event at any time to update the session configuration, and any  field may be updated at any time, except for \"voice\". The server will respond  with a `session.updated` event that shows the full effective configuration.  Only fields that are present are updated, thus the correct way to clear a  field like \"instructions\" is to pass an empty string. 

## Properties

Name | Type
------------ | -------------
`eventId` | string
`type` | string
`session` | [RealtimeSessionCreateRequest](RealtimeSessionCreateRequest.md)

## Example

```typescript
import type { RealtimeClientEventSessionUpdate } from ''

// TODO: Update the object below with actual values
const example = {
  "eventId": null,
  "type": null,
  "session": null,
} satisfies RealtimeClientEventSessionUpdate

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as RealtimeClientEventSessionUpdate
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


