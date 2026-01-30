
package org.openapitools.client.model


case class RunStepDetailsToolCallsFileSearchObject (
    /* The ID of the tool call object. */
    _id: String,
    /* The type of tool call. This is always going to be `file_search` for this type of tool call. */
    _type: String,
    _fileSearch: RunStepDetailsToolCallsFileSearchObjectFileSearch
)
object RunStepDetailsToolCallsFileSearchObject {
    def toStringBody(var_id: Object, var_type: Object, var_fileSearch: Object) =
        s"""
        | {
        | "id":$var_id,"type":$var_type,"fileSearch":$var_fileSearch
        | }
        """.stripMargin
}
