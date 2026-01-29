
# RunStepObject

Represents a step in execution of a run. 

## Properties

Name | Type
------------ | -------------
`id` | string
`object` | string
`createdAt` | number
`assistantId` | string
`threadId` | string
`runId` | string
`type` | string
`status` | string
`stepDetails` | [RunStepObjectStepDetails](RunStepObjectStepDetails.md)
`lastError` | [RunStepObjectLastError](RunStepObjectLastError.md)
`expiredAt` | number
`cancelledAt` | number
`failedAt` | number
`completedAt` | number
`metadata` | object
`usage` | [RunStepCompletionUsage](RunStepCompletionUsage.md)

## Example

```typescript
import type { RunStepObject } from ''

// TODO: Update the object below with actual values
const example = {
  "id": null,
  "object": null,
  "createdAt": null,
  "assistantId": null,
  "threadId": null,
  "runId": null,
  "type": null,
  "status": null,
  "stepDetails": null,
  "lastError": null,
  "expiredAt": null,
  "cancelledAt": null,
  "failedAt": null,
  "completedAt": null,
  "metadata": null,
  "usage": null,
} satisfies RunStepObject

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as RunStepObject
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


