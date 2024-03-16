
# Table `CreateEmbeddingRequest`
(mapped from: CreateEmbeddingRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**model** | model | long NOT NULL |  | [**CreateEmbeddingRequestModel**](CreateEmbeddingRequestModel.md) |  |  [foreignkey]
**input** | input | long NOT NULL |  | [**CreateEmbeddingRequestInput**](CreateEmbeddingRequestInput.md) |  |  [foreignkey]
**user** | user | text |  | **kotlin.String** | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  |  [optional]





