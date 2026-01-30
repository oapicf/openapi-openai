
# MessageObject

Represents a message within a [thread](/docs/api-reference/threads).

## Properties

Name | Type
------------ | -------------
`id` | string
`object` | string
`createdAt` | number
`threadId` | string
`status` | string
`incompleteDetails` | [MessageObjectIncompleteDetails](MessageObjectIncompleteDetails.md)
`completedAt` | number
`incompleteAt` | number
`role` | string
`content` | [Array&lt;MessageObjectContentInner&gt;](MessageObjectContentInner.md)
`assistantId` | string
`runId` | string
`attachments` | [Array&lt;CreateMessageRequestAttachmentsInner&gt;](CreateMessageRequestAttachmentsInner.md)
`metadata` | object

## Example

```typescript
import type { MessageObject } from ''

// TODO: Update the object below with actual values
const example = {
  "id": null,
  "object": null,
  "createdAt": null,
  "threadId": null,
  "status": null,
  "incompleteDetails": null,
  "completedAt": null,
  "incompleteAt": null,
  "role": null,
  "content": null,
  "assistantId": null,
  "runId": null,
  "attachments": null,
  "metadata": null,
} satisfies MessageObject

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as MessageObject
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


