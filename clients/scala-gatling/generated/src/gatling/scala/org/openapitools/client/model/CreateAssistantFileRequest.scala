
package org.openapitools.client.model


case class CreateAssistantFileRequest (
    /* A [File](/docs/api-reference/files) ID (with `purpose=\"assistants\"`) that the assistant should use. Useful for tools like `retrieval` and `code_interpreter` that can access files. */
    _fileId: String
)
object CreateAssistantFileRequest {
    def toStringBody(var_fileId: Object) =
        s"""
        | {
        | "fileId":$var_fileId
        | }
        """.stripMargin
}
