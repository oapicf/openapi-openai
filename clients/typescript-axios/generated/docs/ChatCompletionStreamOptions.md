# ChatCompletionStreamOptions

Options for streaming response. Only set this when you set `stream: true`. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**include_usage** | **boolean** | If set, an additional chunk will be streamed before the &#x60;data: [DONE]&#x60; message. The &#x60;usage&#x60; field on this chunk shows the token usage statistics for the entire request, and the &#x60;choices&#x60; field will always be an empty array. All other chunks will also include a &#x60;usage&#x60; field, but with a null value.  | [optional] [default to undefined]

## Example

```typescript
import { ChatCompletionStreamOptions } from './api';

const instance: ChatCompletionStreamOptions = {
    include_usage,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
