
# RealtimeServerEventError

Returned when an error occurs, which could be a client problem or a server  problem. Most errors are recoverable and the session will stay open, we  recommend to implementors to monitor and log error messages by default. 

## Properties

Name | Type
------------ | -------------
`eventId` | string
`type` | string
`error` | [RealtimeServerEventErrorError](RealtimeServerEventErrorError.md)

## Example

```typescript
import type { RealtimeServerEventError } from ''

// TODO: Update the object below with actual values
const example = {
  "eventId": null,
  "type": null,
  "error": null,
} satisfies RealtimeServerEventError

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as RealtimeServerEventError
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


