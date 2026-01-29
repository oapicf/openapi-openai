
# CreateSpeechRequest


## Properties

Name | Type
------------ | -------------
`model` | [CreateSpeechRequestModel](CreateSpeechRequestModel.md)
`input` | string
`voice` | string
`responseFormat` | string
`speed` | number

## Example

```typescript
import type { CreateSpeechRequest } from ''

// TODO: Update the object below with actual values
const example = {
  "model": null,
  "input": null,
  "voice": null,
  "responseFormat": null,
  "speed": null,
} satisfies CreateSpeechRequest

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CreateSpeechRequest
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


