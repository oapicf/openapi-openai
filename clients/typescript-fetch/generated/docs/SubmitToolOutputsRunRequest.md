
# SubmitToolOutputsRunRequest


## Properties

Name | Type
------------ | -------------
`toolOutputs` | [Array&lt;SubmitToolOutputsRunRequestToolOutputsInner&gt;](SubmitToolOutputsRunRequestToolOutputsInner.md)
`stream` | boolean

## Example

```typescript
import type { SubmitToolOutputsRunRequest } from ''

// TODO: Update the object below with actual values
const example = {
  "toolOutputs": null,
  "stream": null,
} satisfies SubmitToolOutputsRunRequest

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as SubmitToolOutputsRunRequest
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


