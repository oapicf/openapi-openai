
# CreateRunRequest


## Properties

Name | Type
------------ | -------------
`assistantId` | string
`model` | [CreateRunRequestModel](CreateRunRequestModel.md)
`instructions` | string
`additionalInstructions` | string
`additionalMessages` | [Array&lt;CreateMessageRequest&gt;](CreateMessageRequest.md)
`tools` | [Array&lt;AssistantObjectToolsInner&gt;](AssistantObjectToolsInner.md)
`metadata` | object
`temperature` | number
`topP` | number
`stream` | boolean
`maxPromptTokens` | number
`maxCompletionTokens` | number
`truncationStrategy` | [TruncationObject](TruncationObject.md)
`toolChoice` | [AssistantsApiToolChoiceOption](AssistantsApiToolChoiceOption.md)
`parallelToolCalls` | boolean
`responseFormat` | [AssistantsApiResponseFormatOption](AssistantsApiResponseFormatOption.md)

## Example

```typescript
import type { CreateRunRequest } from ''

// TODO: Update the object below with actual values
const example = {
  "assistantId": null,
  "model": null,
  "instructions": null,
  "additionalInstructions": null,
  "additionalMessages": null,
  "tools": null,
  "metadata": null,
  "temperature": 1,
  "topP": 1,
  "stream": null,
  "maxPromptTokens": null,
  "maxCompletionTokens": null,
  "truncationStrategy": null,
  "toolChoice": null,
  "parallelToolCalls": null,
  "responseFormat": null,
} satisfies CreateRunRequest

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CreateRunRequest
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


