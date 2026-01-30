
# UsageTimeBucket


## Properties

Name | Type
------------ | -------------
`object` | string
`startTime` | number
`endTime` | number
`result` | [Array&lt;UsageTimeBucketResultInner&gt;](UsageTimeBucketResultInner.md)

## Example

```typescript
import type { UsageTimeBucket } from ''

// TODO: Update the object below with actual values
const example = {
  "object": null,
  "startTime": null,
  "endTime": null,
  "result": null,
} satisfies UsageTimeBucket

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as UsageTimeBucket
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


