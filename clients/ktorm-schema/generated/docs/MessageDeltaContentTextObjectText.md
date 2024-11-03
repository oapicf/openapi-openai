
# Table `MessageDeltaContentTextObject_text`
(mapped from: MessageDeltaContentTextObjectText)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**value** | value | text |  | **kotlin.String** | The data that makes up the text. |  [optional]
**annotations** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;MessageDeltaContentTextObjectTextAnnotationsInner&gt;**](MessageDeltaContentTextObjectTextAnnotationsInner.md) |  |  [optional]



# **Table `MessageDeltaContentTextObjectTextMessageDeltaContentTextObjectTextAnnotationsInner`**
(mapped from: MessageDeltaContentTextObjectTextMessageDeltaContentTextObjectTextAnnotationsInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
messageDeltaContentTextObjectText | messageDeltaContentTextObjectText | long | | kotlin.Long | Primary Key | *one*
messageDeltaContentTextObjectTextAnnotationsInner | messageDeltaContentTextObjectTextAnnotationsInner | long | | kotlin.Long | Foreign Key | *many*



