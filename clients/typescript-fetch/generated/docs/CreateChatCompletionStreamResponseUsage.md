
# CreateChatCompletionStreamResponseUsage

An optional field that will only be present when you set `stream_options: {\"include_usage\": true}` in your request. When present, it contains a null value except for the last chunk which contains the token usage statistics for the entire request. 

## Properties

Name | Type
------------ | -------------
`completionTokens` | number
`promptTokens` | number
`totalTokens` | number

## Example

```typescript
import type { CreateChatCompletionStreamResponseUsage } from ''

// TODO: Update the object below with actual values
const example = {
  "completionTokens": null,
  "promptTokens": null,
  "totalTokens": null,
} satisfies CreateChatCompletionStreamResponseUsage

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CreateChatCompletionStreamResponseUsage
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


