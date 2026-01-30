
# RealtimeResponseCreateParamsMaxResponseOutputTokens

Maximum number of output tokens for a single assistant response, inclusive of tool calls. Provide an integer between 1 and 4096 to limit output tokens, or `inf` for the maximum available tokens for a given model. Defaults to `inf`. 

## Properties

Name | Type
------------ | -------------

## Example

```typescript
import type { RealtimeResponseCreateParamsMaxResponseOutputTokens } from ''

// TODO: Update the object below with actual values
const example = {
} satisfies RealtimeResponseCreateParamsMaxResponseOutputTokens

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as RealtimeResponseCreateParamsMaxResponseOutputTokens
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


