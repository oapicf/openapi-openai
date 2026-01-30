
package org.openapitools.client.model


case class AssistantObject (
    /* The identifier, which can be referenced in API endpoints. */
    _id: String,
    /* The object type, which is always `assistant`. */
    _object: String,
    /* The Unix timestamp (in seconds) for when the assistant was created. */
    _createdAt: Integer,
    /* The name of the assistant. The maximum length is 256 characters.  */
    _name: String,
    /* The description of the assistant. The maximum length is 512 characters.  */
    _description: String,
    /* ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models) for descriptions of them.  */
    _model: String,
    /* The system instructions that the assistant uses. The maximum length is 256,000 characters.  */
    _instructions: String,
    /* A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `file_search`, or `function`.  */
    _tools: List[AssistantObjectToolsInner],
    _toolResources: Option[AssistantObjectToolResources],
    /* Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  */
    _metadata: Any,
    /* What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  */
    _temperature: Option[Number],
    /* An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both.  */
    _topP: Option[Number],
    _responseFormat: Option[AssistantsApiResponseFormatOption]
)
object AssistantObject {
    def toStringBody(var_id: Object, var_object: Object, var_createdAt: Object, var_name: Object, var_description: Object, var_model: Object, var_instructions: Object, var_tools: Object, var_toolResources: Object, var_metadata: Object, var_temperature: Object, var_topP: Object, var_responseFormat: Object) =
        s"""
        | {
        | "id":$var_id,"object":$var_object,"createdAt":$var_createdAt,"name":$var_name,"description":$var_description,"model":$var_model,"instructions":$var_instructions,"tools":$var_tools,"toolResources":$var_toolResources,"metadata":$var_metadata,"temperature":$var_temperature,"topP":$var_topP,"responseFormat":$var_responseFormat
        | }
        """.stripMargin
}
