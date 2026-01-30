
# RunObject

Represents an execution run on a [thread](/docs/api-reference/threads).

## Properties

Name | Type
------------ | -------------
`id` | string
`object` | string
`createdAt` | number
`threadId` | string
`assistantId` | string
`status` | string
`requiredAction` | [RunObjectRequiredAction](RunObjectRequiredAction.md)
`lastError` | [RunObjectLastError](RunObjectLastError.md)
`expiresAt` | number
`startedAt` | number
`cancelledAt` | number
`failedAt` | number
`completedAt` | number
`incompleteDetails` | [RunObjectIncompleteDetails](RunObjectIncompleteDetails.md)
`model` | string
`instructions` | string
`tools` | [Array&lt;AssistantObjectToolsInner&gt;](AssistantObjectToolsInner.md)
`metadata` | object
`usage` | [RunCompletionUsage](RunCompletionUsage.md)
`temperature` | number
`topP` | number
`maxPromptTokens` | number
`maxCompletionTokens` | number
`truncationStrategy` | [TruncationObject](TruncationObject.md)
`toolChoice` | [AssistantsApiToolChoiceOption](AssistantsApiToolChoiceOption.md)
`parallelToolCalls` | boolean
`responseFormat` | [AssistantsApiResponseFormatOption](AssistantsApiResponseFormatOption.md)

## Example

```typescript
import type { RunObject } from ''

// TODO: Update the object below with actual values
const example = {
  "id": null,
  "object": null,
  "createdAt": null,
  "threadId": null,
  "assistantId": null,
  "status": null,
  "requiredAction": null,
  "lastError": null,
  "expiresAt": null,
  "startedAt": null,
  "cancelledAt": null,
  "failedAt": null,
  "completedAt": null,
  "incompleteDetails": null,
  "model": null,
  "instructions": null,
  "tools": null,
  "metadata": null,
  "usage": null,
  "temperature": null,
  "topP": null,
  "maxPromptTokens": null,
  "maxCompletionTokens": null,
  "truncationStrategy": null,
  "toolChoice": null,
  "parallelToolCalls": null,
  "responseFormat": null,
} satisfies RunObject

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as RunObject
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


