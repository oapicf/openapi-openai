# OpenApiOpenAIClient::CreateModerationResponseResultsInnerCategoryAppliedInputTypes

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **hate** | **Array&lt;String&gt;** | The applied input type(s) for the category &#39;hate&#39;. |  |
| **hate_threatening** | **Array&lt;String&gt;** | The applied input type(s) for the category &#39;hate/threatening&#39;. |  |
| **harassment** | **Array&lt;String&gt;** | The applied input type(s) for the category &#39;harassment&#39;. |  |
| **harassment_threatening** | **Array&lt;String&gt;** | The applied input type(s) for the category &#39;harassment/threatening&#39;. |  |
| **illicit** | **Array&lt;String&gt;** | The applied input type(s) for the category &#39;illicit&#39;. |  |
| **illicit_violent** | **Array&lt;String&gt;** | The applied input type(s) for the category &#39;illicit/violent&#39;. |  |
| **self_harm** | **Array&lt;String&gt;** | The applied input type(s) for the category &#39;self-harm&#39;. |  |
| **self_harm_intent** | **Array&lt;String&gt;** | The applied input type(s) for the category &#39;self-harm/intent&#39;. |  |
| **self_harm_instructions** | **Array&lt;String&gt;** | The applied input type(s) for the category &#39;self-harm/instructions&#39;. |  |
| **sexual** | **Array&lt;String&gt;** | The applied input type(s) for the category &#39;sexual&#39;. |  |
| **sexual_minors** | **Array&lt;String&gt;** | The applied input type(s) for the category &#39;sexual/minors&#39;. |  |
| **violence** | **Array&lt;String&gt;** | The applied input type(s) for the category &#39;violence&#39;. |  |
| **violence_graphic** | **Array&lt;String&gt;** | The applied input type(s) for the category &#39;violence/graphic&#39;. |  |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::CreateModerationResponseResultsInnerCategoryAppliedInputTypes.new(
  hate: null,
  hate_threatening: null,
  harassment: null,
  harassment_threatening: null,
  illicit: null,
  illicit_violent: null,
  self_harm: null,
  self_harm_intent: null,
  self_harm_instructions: null,
  sexual: null,
  sexual_minors: null,
  violence: null,
  violence_graphic: null
)
```

