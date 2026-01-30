
# FineTuneChatRequestInput

The per-line training example of a fine-tuning input file for chat models using the supervised method.

## Properties

Name | Type
------------ | -------------
`messages` | [Array&lt;FineTuneChatRequestInputMessagesInner&gt;](FineTuneChatRequestInputMessagesInner.md)
`tools` | [Array&lt;ChatCompletionTool&gt;](ChatCompletionTool.md)
`parallelToolCalls` | boolean
`functions` | [Array&lt;ChatCompletionFunctions&gt;](ChatCompletionFunctions.md)

## Example

```typescript
import type { FineTuneChatRequestInput } from ''

// TODO: Update the object below with actual values
const example = {
  "messages": null,
  "tools": null,
  "parallelToolCalls": null,
  "functions": null,
} satisfies FineTuneChatRequestInput

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as FineTuneChatRequestInput
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


