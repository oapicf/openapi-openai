
# Table `MessageDeltaContentTextObject`
(mapped from: MessageDeltaContentTextObject)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**index** | index | int NOT NULL |  | **kotlin.Int** | The index of the content part in the message. | 
**type** | type | text NOT NULL |  | [**type**](#Type) | Always &#x60;text&#x60;. | 
**text** | text | long |  | [**MessageDeltaContentTextObjectText**](MessageDeltaContentTextObjectText.md) |  |  [optional] [foreignkey]





