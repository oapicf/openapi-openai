
# Table `MessageContentTextAnnotationsFileCitationObject`
(mapped from: MessageContentTextAnnotationsFileCitationObject)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**type** | type | text NOT NULL |  | [**type**](#Type) | Always &#x60;file_citation&#x60;. | 
**text** | text | text NOT NULL |  | **kotlin.String** | The text in the message content that needs to be replaced. | 
**fileCitation** | file_citation | long NOT NULL |  | [**MessageContentTextAnnotationsFileCitationObjectFileCitation**](MessageContentTextAnnotationsFileCitationObjectFileCitation.md) |  |  [foreignkey]
**startIndex** | start_index | int UNSIGNED NOT NULL |  | **kotlin.Int** |  | 
**endIndex** | end_index | int UNSIGNED NOT NULL |  | **kotlin.Int** |  | 







