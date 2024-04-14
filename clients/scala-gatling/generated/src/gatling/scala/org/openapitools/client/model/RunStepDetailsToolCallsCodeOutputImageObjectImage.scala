
package org.openapitools.client.model


case class RunStepDetailsToolCallsCodeOutputImageObjectImage (
    /* The [file](/docs/api-reference/files) ID of the image. */
    _fileId: String
)
object RunStepDetailsToolCallsCodeOutputImageObjectImage {
    def toStringBody(var_fileId: Object) =
        s"""
        | {
        | "fileId":$var_fileId
        | }
        """.stripMargin
}
