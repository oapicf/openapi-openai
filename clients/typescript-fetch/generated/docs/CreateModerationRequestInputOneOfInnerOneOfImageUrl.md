
# CreateModerationRequestInputOneOfInnerOneOfImageUrl

Contains either an image URL or a data URL for a base64 encoded image.

## Properties

Name | Type
------------ | -------------
`url` | string

## Example

```typescript
import type { CreateModerationRequestInputOneOfInnerOneOfImageUrl } from ''

// TODO: Update the object below with actual values
const example = {
  "url": https://example.com/image.jpg,
} satisfies CreateModerationRequestInputOneOfInnerOneOfImageUrl

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CreateModerationRequestInputOneOfInnerOneOfImageUrl
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


