
package org.openapitools.client.model


case class RunStepDetailsToolCallsFileSearchResultObject (
    /* The ID of the file that result was found in. */
    _fileId: String,
    /* The name of the file that result was found in. */
    _fileName: String,
    /* The score of the result. All values must be a floating point number between 0 and 1. */
    _score: Number,
    /* The content of the result that was found. The content is only included if requested via the include query parameter. */
    _content: Option[List[RunStepDetailsToolCallsFileSearchResultObjectContentInner]]
)
object RunStepDetailsToolCallsFileSearchResultObject {
    def toStringBody(var_fileId: Object, var_fileName: Object, var_score: Object, var_content: Object) =
        s"""
        | {
        | "fileId":$var_fileId,"fileName":$var_fileName,"score":$var_score,"content":$var_content
        | }
        """.stripMargin
}
