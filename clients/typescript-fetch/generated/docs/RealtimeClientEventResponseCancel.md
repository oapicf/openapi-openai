
# RealtimeClientEventResponseCancel

Send this event to cancel an in-progress response. The server will respond  with a `response.cancelled` event or an error if there is no response to  cancel. 

## Properties

Name | Type
------------ | -------------
`eventId` | string
`type` | string
`responseId` | string

## Example

```typescript
import type { RealtimeClientEventResponseCancel } from ''

// TODO: Update the object below with actual values
const example = {
  "eventId": null,
  "type": null,
  "responseId": null,
} satisfies RealtimeClientEventResponseCancel

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as RealtimeClientEventResponseCancel
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


