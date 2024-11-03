
# Table `Image`
(mapped from: Image)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**b64Json** | b64_json | text |  | **kotlin.String** | The base64-encoded JSON of the generated image, if &#x60;response_format&#x60; is &#x60;b64_json&#x60;. |  [optional]
**url** | url | text |  | **kotlin.String** | The URL of the generated image, if &#x60;response_format&#x60; is &#x60;url&#x60; (default). |  [optional]
**revisedPrompt** | revised_prompt | text |  | **kotlin.String** | The prompt that was used to generate the image, if there was any revision to the prompt. |  [optional]





