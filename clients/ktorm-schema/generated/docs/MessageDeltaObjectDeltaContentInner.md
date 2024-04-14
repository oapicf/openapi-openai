
# Table `MessageDeltaObject_delta_content_inner`
(mapped from: MessageDeltaObjectDeltaContentInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**index** | index | int NOT NULL |  | **kotlin.Int** | The index of the content part in the message. | 
**type** | type | text NOT NULL |  | [**type**](#Type) | Always &#x60;image_file&#x60;. | 
**imageFile** | image_file | long |  | [**MessageDeltaContentImageFileObjectImageFile**](MessageDeltaContentImageFileObjectImageFile.md) |  |  [optional] [foreignkey]
**text** | text | long |  | [**MessageDeltaContentTextObjectText**](MessageDeltaContentTextObjectText.md) |  |  [optional] [foreignkey]






