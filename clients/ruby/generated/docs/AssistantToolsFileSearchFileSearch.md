# OpenApiOpenAIClient::AssistantToolsFileSearchFileSearch

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **max_num_results** | **Integer** | The maximum number of results the file search tool should output. The default is 20 for &#x60;gpt-4*&#x60; models and 5 for &#x60;gpt-3.5-turbo&#x60;. This number should be between 1 and 50 inclusive.  Note that the file search tool may output fewer than &#x60;max_num_results&#x60; results. See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.  | [optional] |
| **ranking_options** | [**FileSearchRankingOptions**](FileSearchRankingOptions.md) |  | [optional] |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::AssistantToolsFileSearchFileSearch.new(
  max_num_results: null,
  ranking_options: null
)
```

