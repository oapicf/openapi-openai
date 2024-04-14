package org.openapitools.server.model


/**
 * @param fileId A [File](/docs/api-reference/files) ID (with `purpose=\"assistants\"`) that the assistant should use. Useful for tools like `retrieval` and `code_interpreter` that can access files. for example: ''null''
*/
final case class CreateAssistantFileRequest (
  fileId: String
)

