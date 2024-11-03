
package org.openapitools.client.model


case class RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage (
    /* The [file](/docs/api-reference/files) ID of the image. */
    _fileId: Option[String]
)
object RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage {
    def toStringBody(var_fileId: Object) =
        s"""
        | {
        | "fileId":$var_fileId
        | }
        """.stripMargin
}
