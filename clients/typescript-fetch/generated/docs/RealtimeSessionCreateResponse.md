
# RealtimeSessionCreateResponse

A new Realtime session configuration, with an ephermeral key. Default TTL for keys is one minute. 

## Properties

Name | Type
------------ | -------------
`clientSecret` | [RealtimeSessionCreateResponseClientSecret](RealtimeSessionCreateResponseClientSecret.md)
`modalities` | Array&lt;string&gt;
`instructions` | string
`voice` | string
`inputAudioFormat` | string
`outputAudioFormat` | string
`inputAudioTranscription` | [RealtimeSessionInputAudioTranscription](RealtimeSessionInputAudioTranscription.md)
`turnDetection` | [RealtimeSessionCreateResponseTurnDetection](RealtimeSessionCreateResponseTurnDetection.md)
`tools` | [Array&lt;RealtimeResponseCreateParamsToolsInner&gt;](RealtimeResponseCreateParamsToolsInner.md)
`toolChoice` | string
`temperature` | number
`maxResponseOutputTokens` | [RealtimeResponseCreateParamsMaxResponseOutputTokens](RealtimeResponseCreateParamsMaxResponseOutputTokens.md)

## Example

```typescript
import type { RealtimeSessionCreateResponse } from ''

// TODO: Update the object below with actual values
const example = {
  "clientSecret": null,
  "modalities": null,
  "instructions": null,
  "voice": null,
  "inputAudioFormat": null,
  "outputAudioFormat": null,
  "inputAudioTranscription": null,
  "turnDetection": null,
  "tools": null,
  "toolChoice": null,
  "temperature": null,
  "maxResponseOutputTokens": null,
} satisfies RealtimeSessionCreateResponse

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as RealtimeSessionCreateResponse
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


