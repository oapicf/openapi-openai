package org.openapitools.server.model


/**
 * = OpenAIFile =
 *
 * The `File` object represents a document that has been uploaded to OpenAI.
 *
 * @param id The file identifier, which can be referenced in the API endpoints. for example: ''null''
 * @param bytes The size of the file, in bytes. for example: ''null''
 * @param createdAt The Unix timestamp (in seconds) for when the file was created. for example: ''null''
 * @param filename The name of the file. for example: ''null''
 * @param `object` The object type, which is always `file`. for example: ''null''
 * @param purpose The intended purpose of the file. Supported values are `fine-tune`, `fine-tune-results`, `assistants`, and `assistants_output`. for example: ''null''
 * @param status Deprecated. The current status of the file, which can be either `uploaded`, `processed`, or `error`. for example: ''null''
 * @param statusDetails Deprecated. For details on why a fine-tuning training file failed validation, see the `error` field on `fine_tuning.job`. for example: ''null''
*/
final case class OpenAIFile (
  id: String,
  bytes: Int,
  createdAt: Int,
  filename: String,
  `object`: String,
  purpose: String,
  status: String,
  statusDetails: Option[String] = None
)

