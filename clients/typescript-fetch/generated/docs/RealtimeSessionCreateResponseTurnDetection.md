
# RealtimeSessionCreateResponseTurnDetection

Configuration for turn detection. Can be set to `null` to turn off. Server  VAD means that the model will detect the start and end of speech based on  audio volume and respond at the end of user speech. 

## Properties

Name | Type
------------ | -------------
`type` | string
`threshold` | number
`prefixPaddingMs` | number
`silenceDurationMs` | number

## Example

```typescript
import type { RealtimeSessionCreateResponseTurnDetection } from ''

// TODO: Update the object below with actual values
const example = {
  "type": null,
  "threshold": null,
  "prefixPaddingMs": null,
  "silenceDurationMs": null,
} satisfies RealtimeSessionCreateResponseTurnDetection

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as RealtimeSessionCreateResponseTurnDetection
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


