
# RealtimeServerEventRateLimitsUpdated

Emitted at the beginning of a Response to indicate the updated rate limits.  When a Response is created some tokens will be \"reserved\" for the output  tokens, the rate limits shown here reflect that reservation, which is then  adjusted accordingly once the Response is completed. 

## Properties

Name | Type
------------ | -------------
`eventId` | string
`type` | string
`rateLimits` | [Array&lt;RealtimeServerEventRateLimitsUpdatedRateLimitsInner&gt;](RealtimeServerEventRateLimitsUpdatedRateLimitsInner.md)

## Example

```typescript
import type { RealtimeServerEventRateLimitsUpdated } from ''

// TODO: Update the object below with actual values
const example = {
  "eventId": null,
  "type": null,
  "rateLimits": null,
} satisfies RealtimeServerEventRateLimitsUpdated

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as RealtimeServerEventRateLimitsUpdated
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


