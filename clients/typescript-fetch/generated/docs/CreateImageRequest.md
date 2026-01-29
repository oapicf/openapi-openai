
# CreateImageRequest


## Properties

Name | Type
------------ | -------------
`prompt` | string
`model` | [CreateImageRequestModel](CreateImageRequestModel.md)
`n` | number
`quality` | string
`responseFormat` | string
`size` | string
`style` | string
`user` | string

## Example

```typescript
import type { CreateImageRequest } from ''

// TODO: Update the object below with actual values
const example = {
  "prompt": A cute baby sea otter,
  "model": null,
  "n": 1,
  "quality": standard,
  "responseFormat": url,
  "size": 1024x1024,
  "style": vivid,
  "user": user-1234,
} satisfies CreateImageRequest

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CreateImageRequest
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


