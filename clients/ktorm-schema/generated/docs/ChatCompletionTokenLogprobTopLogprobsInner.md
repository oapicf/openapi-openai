
# Table `ChatCompletionTokenLogprob_top_logprobs_inner`
(mapped from: ChatCompletionTokenLogprobTopLogprobsInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**token** | token | text NOT NULL |  | **kotlin.String** | The token. | 
**logprob** | logprob | decimal NOT NULL |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The log probability of this token, if it is within the top 20 most likely tokens. Otherwise, the value &#x60;-9999.0&#x60; is used to signify that the token is very unlikely. | 
**bytes** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.Int&gt;** | A list of integers representing the UTF-8 bytes representation of the token. Useful in instances where characters are represented by multiple tokens and their byte representations must be combined to generate the correct text representation. Can be &#x60;null&#x60; if there is no bytes representation for the token. | 




# **Table `ChatCompletionTokenLogprobTopLogprobsInnerBytes`**
(mapped from: ChatCompletionTokenLogprobTopLogprobsInnerBytes)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
chatCompletionTokenLogprobTopLogprobsInner | chatCompletionTokenLogprobTopLogprobsInner | long | | kotlin.Long | Primary Key | *one*
bytes | bytes | int | | kotlin.Int | Foreign Key | *many*



