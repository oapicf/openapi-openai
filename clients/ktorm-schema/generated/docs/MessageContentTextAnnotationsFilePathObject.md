
# Table `MessageContentTextAnnotationsFilePathObject`
(mapped from: MessageContentTextAnnotationsFilePathObject)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**type** | type | text NOT NULL |  | [**type**](#Type) | Always &#x60;file_path&#x60;. | 
**text** | text | text NOT NULL |  | **kotlin.String** | The text in the message content that needs to be replaced. | 
**filePath** | file_path | long NOT NULL |  | [**MessageContentTextAnnotationsFilePathObjectFilePath**](MessageContentTextAnnotationsFilePathObjectFilePath.md) |  |  [foreignkey]
**startIndex** | start_index | int UNSIGNED NOT NULL |  | **kotlin.Int** |  | 
**endIndex** | end_index | int UNSIGNED NOT NULL |  | **kotlin.Int** |  | 







