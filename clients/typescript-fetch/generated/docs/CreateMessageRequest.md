
# CreateMessageRequest


## Properties

Name | Type
------------ | -------------
`role` | string
`content` | [CreateMessageRequestContent](CreateMessageRequestContent.md)
`attachments` | [Array&lt;CreateMessageRequestAttachmentsInner&gt;](CreateMessageRequestAttachmentsInner.md)
`metadata` | object

## Example

```typescript
import type { CreateMessageRequest } from ''

// TODO: Update the object below with actual values
const example = {
  "role": null,
  "content": null,
  "attachments": null,
  "metadata": null,
} satisfies CreateMessageRequest

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CreateMessageRequest
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


