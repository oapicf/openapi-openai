
package org.openapitools.client.model


case class RunStepDeltaStepDetailsToolCallsFileSearchObject (
    /* The index of the tool call in the tool calls array. */
    _index: Integer,
    /* The ID of the tool call object. */
    _id: Option[String],
    /* The type of tool call. This is always going to be `file_search` for this type of tool call. */
    _type: String,
    /* For now, this is always going to be an empty object. */
    _fileSearch: Any
)
object RunStepDeltaStepDetailsToolCallsFileSearchObject {
    def toStringBody(var_index: Object, var_id: Object, var_type: Object, var_fileSearch: Object) =
        s"""
        | {
        | "index":$var_index,"id":$var_id,"type":$var_type,"fileSearch":$var_fileSearch
        | }
        """.stripMargin
}
