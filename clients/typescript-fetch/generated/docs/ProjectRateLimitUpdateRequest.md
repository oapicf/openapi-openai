
# ProjectRateLimitUpdateRequest


## Properties

Name | Type
------------ | -------------
`maxRequestsPer1Minute` | number
`maxTokensPer1Minute` | number
`maxImagesPer1Minute` | number
`maxAudioMegabytesPer1Minute` | number
`maxRequestsPer1Day` | number
`batch1DayMaxInputTokens` | number

## Example

```typescript
import type { ProjectRateLimitUpdateRequest } from ''

// TODO: Update the object below with actual values
const example = {
  "maxRequestsPer1Minute": null,
  "maxTokensPer1Minute": null,
  "maxImagesPer1Minute": null,
  "maxAudioMegabytesPer1Minute": null,
  "maxRequestsPer1Day": null,
  "batch1DayMaxInputTokens": null,
} satisfies ProjectRateLimitUpdateRequest

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ProjectRateLimitUpdateRequest
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


