
# Table `CreateChatCompletionResponse_choices_inner_logprobs`
(mapped from: CreateChatCompletionResponseChoicesInnerLogprobs)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**content** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ChatCompletionTokenLogprob&gt;**](ChatCompletionTokenLogprob.md) | A list of message content tokens with log probability information. | 


# **Table `CreateChatCompletionResponseChoicesInnerLogprobsChatCompletionTokenLogprob`**
(mapped from: CreateChatCompletionResponseChoicesInnerLogprobsChatCompletionTokenLogprob)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
createChatCompletionResponseChoicesInnerLogprobs | createChatCompletionResponseChoicesInnerLogprobs | long | | kotlin.Long | Primary Key | *one*
chatCompletionTokenLogprob | chatCompletionTokenLogprob | long | | kotlin.Long | Foreign Key | *many*



