
# Table `MessageContentTextObject_text`
(mapped from: MessageContentTextObjectText)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**value** | value | text NOT NULL |  | **kotlin.String** | The data that makes up the text. | 
**annotations** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;MessageContentTextObjectTextAnnotationsInner&gt;**](MessageContentTextObjectTextAnnotationsInner.md) |  | 



# **Table `MessageContentTextObjectTextMessageContentTextObjectTextAnnotationsInner`**
(mapped from: MessageContentTextObjectTextMessageContentTextObjectTextAnnotationsInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
messageContentTextObjectText | messageContentTextObjectText | long | | kotlin.Long | Primary Key | *one*
messageContentTextObjectTextAnnotationsInner | messageContentTextObjectTextAnnotationsInner | long | | kotlin.Long | Foreign Key | *many*



