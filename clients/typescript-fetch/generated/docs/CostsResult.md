
# CostsResult

The aggregated costs details of the specific time bucket.

## Properties

Name | Type
------------ | -------------
`object` | string
`amount` | [CostsResultAmount](CostsResultAmount.md)
`lineItem` | string
`projectId` | string

## Example

```typescript
import type { CostsResult } from ''

// TODO: Update the object below with actual values
const example = {
  "object": null,
  "amount": null,
  "lineItem": null,
  "projectId": null,
} satisfies CostsResult

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CostsResult
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


