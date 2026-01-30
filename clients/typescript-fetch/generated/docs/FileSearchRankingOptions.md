
# FileSearchRankingOptions

The ranking options for the file search. If not specified, the file search tool will use the `auto` ranker and a score_threshold of 0.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. 

## Properties

Name | Type
------------ | -------------
`ranker` | string
`scoreThreshold` | number

## Example

```typescript
import type { FileSearchRankingOptions } from ''

// TODO: Update the object below with actual values
const example = {
  "ranker": null,
  "scoreThreshold": null,
} satisfies FileSearchRankingOptions

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as FileSearchRankingOptions
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


