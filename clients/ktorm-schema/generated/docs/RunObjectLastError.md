
# Table `RunObject_last_error`
(mapped from: RunObjectLastError)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**code** | code | text NOT NULL |  | [**code**](#Code) | One of &#x60;server_error&#x60;, &#x60;rate_limit_exceeded&#x60;, or &#x60;invalid_prompt&#x60;. | 
**message** | message | text NOT NULL |  | **kotlin.String** | A human-readable description of the error. | 




