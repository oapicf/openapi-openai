
# Table `CreateCompletionResponse_choices_inner_logprobs`
(mapped from: CreateCompletionResponseChoicesInnerLogprobs)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**textOffset** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.Int&gt;** |  |  [optional]
**tokenLogprobs** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;java.math.BigDecimal&gt;**](java.math.BigDecimal.md) |  |  [optional]
**tokens** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** |  |  [optional]
**topLogprobs** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.collections.Map&lt;kotlin.String, java.math.BigDecimal&gt;&gt;** |  |  [optional]


# **Table `CreateCompletionResponseChoicesInnerLogprobsTextOffset`**
(mapped from: CreateCompletionResponseChoicesInnerLogprobsTextOffset)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
createCompletionResponseChoicesInnerLogprobs | createCompletionResponseChoicesInnerLogprobs | long | | kotlin.Long | Primary Key | *one*
textOffset | textOffset | int | | kotlin.Int | Foreign Key | *many*



# **Table `CreateCompletionResponseChoicesInnerLogprobsTokenLogprobs`**
(mapped from: CreateCompletionResponseChoicesInnerLogprobsTokenLogprobs)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
createCompletionResponseChoicesInnerLogprobs | createCompletionResponseChoicesInnerLogprobs | long | | kotlin.Long | Primary Key | *one*
tokenLogprobs | tokenLogprobs | decimal | | java.math.BigDecimal | Foreign Key | *many*



# **Table `CreateCompletionResponseChoicesInnerLogprobsTokens`**
(mapped from: CreateCompletionResponseChoicesInnerLogprobsTokens)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
createCompletionResponseChoicesInnerLogprobs | createCompletionResponseChoicesInnerLogprobs | long | | kotlin.Long | Primary Key | *one*
tokens | tokens | text | | kotlin.String | Foreign Key | *many*



# **Table `CreateCompletionResponseChoicesInnerLogprobsTopLogprobs`**
(mapped from: CreateCompletionResponseChoicesInnerLogprobsTopLogprobs)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
createCompletionResponseChoicesInnerLogprobs | createCompletionResponseChoicesInnerLogprobs | long | | kotlin.Long | Primary Key | *one*
topLogprobs | topLogprobs | blob | | kotlin.collections.Map<kotlin.String, java.math.BigDecimal> | Foreign Key | *many*



