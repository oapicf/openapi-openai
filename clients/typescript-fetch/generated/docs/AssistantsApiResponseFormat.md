
# AssistantsApiResponseFormat

An object describing the expected output of the model. If `json_object` only `function` type `tools` are allowed to be passed to the Run. If `text` the model can return text or any value needed. 

## Properties

Name | Type
------------ | -------------
`type` | string

## Example

```typescript
import type { AssistantsApiResponseFormat } from ''

// TODO: Update the object below with actual values
const example = {
  "type": json_object,
} satisfies AssistantsApiResponseFormat

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as AssistantsApiResponseFormat
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


