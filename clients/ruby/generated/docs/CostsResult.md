# OpenApiOpenAIClient::CostsResult

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **object** | **String** |  |  |
| **amount** | [**CostsResultAmount**](CostsResultAmount.md) |  | [optional] |
| **line_item** | **String** | When &#x60;group_by&#x3D;line_item&#x60;, this field provides the line item of the grouped costs result. | [optional] |
| **project_id** | **String** | When &#x60;group_by&#x3D;project_id&#x60;, this field provides the project ID of the grouped costs result. | [optional] |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::CostsResult.new(
  object: null,
  amount: null,
  line_item: null,
  project_id: null
)
```

