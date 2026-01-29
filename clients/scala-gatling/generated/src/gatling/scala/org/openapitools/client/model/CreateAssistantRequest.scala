
package org.openapitools.client.model


case class CreateAssistantRequest (
    _model: CreateAssistantRequestModel,
    /* The name of the assistant. The maximum length is 256 characters.  */
    _name: Option[String],
    /* The description of the assistant. The maximum length is 512 characters.  */
    _description: Option[String],
    /* The system instructions that the assistant uses. The maximum length is 256,000 characters.  */
    _instructions: Option[String],
    /* A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `retrieval`, or `function`.  */
    _tools: Option[List[AssistantObjectToolsInner]],
    /* A list of [file](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order.  */
    _fileIds: Option[List[String]],
    /* Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  */
    _metadata: Option[Any]
)
object CreateAssistantRequest {
    def toStringBody(var_model: Object, var_name: Object, var_description: Object, var_instructions: Object, var_tools: Object, var_fileIds: Object, var_metadata: Object) =
        s"""
        | {
        | "model":$var_model,"name":$var_name,"description":$var_description,"instructions":$var_instructions,"tools":$var_tools,"fileIds":$var_fileIds,"metadata":$var_metadata
        | }
        """.stripMargin
}
