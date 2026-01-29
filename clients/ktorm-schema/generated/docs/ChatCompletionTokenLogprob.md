
# Table `ChatCompletionTokenLogprob`
(mapped from: ChatCompletionTokenLogprob)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**token** | token | text NOT NULL |  | **kotlin.String** | The token. | 
**logprob** | logprob | decimal NOT NULL |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The log probability of this token, if it is within the top 20 most likely tokens. Otherwise, the value &#x60;-9999.0&#x60; is used to signify that the token is very unlikely. | 
**bytes** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.Int&gt;** | A list of integers representing the UTF-8 bytes representation of the token. Useful in instances where characters are represented by multiple tokens and their byte representations must be combined to generate the correct text representation. Can be &#x60;null&#x60; if there is no bytes representation for the token. | 
**topLogprobs** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ChatCompletionTokenLogprobTopLogprobsInner&gt;**](ChatCompletionTokenLogprobTopLogprobsInner.md) | List of the most likely tokens and their log probability, at this token position. In rare cases, there may be fewer than the number of requested &#x60;top_logprobs&#x60; returned. | 




# **Table `ChatCompletionTokenLogprobBytes`**
(mapped from: ChatCompletionTokenLogprobBytes)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
chatCompletionTokenLogprob | chatCompletionTokenLogprob | long | | kotlin.Long | Primary Key | *one*
bytes | bytes | int | | kotlin.Int | Foreign Key | *many*



# **Table `ChatCompletionTokenLogprobChatCompletionTokenLogprobTopLogprobsInner`**
(mapped from: ChatCompletionTokenLogprobChatCompletionTokenLogprobTopLogprobsInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
chatCompletionTokenLogprob | chatCompletionTokenLogprob | long | | kotlin.Long | Primary Key | *one*
chatCompletionTokenLogprobTopLogprobsInner | chatCompletionTokenLogprobTopLogprobsInner | long | | kotlin.Long | Foreign Key | *many*



