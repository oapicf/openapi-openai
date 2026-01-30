# Org.OpenAPITools.Model.MessageContentTextAnnotationsFileCitationObject
A citation within the message that points to a specific quote from a specific File associated with the assistant or the message. Generated when the assistant uses the \"file_search\" tool to search files.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **string** | Always &#x60;file_citation&#x60;. | 
**Text** | **string** | The text in the message content that needs to be replaced. | 
**FileCitation** | [**MessageContentTextAnnotationsFileCitationObjectFileCitation**](MessageContentTextAnnotationsFileCitationObjectFileCitation.md) |  | 
**StartIndex** | **int** |  | 
**EndIndex** | **int** |  | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

