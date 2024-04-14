package org.openapitools.server.model


/**
 * Deletes the association between the assistant and the file, but does not delete the [File](/docs/api-reference/files) object itself.
 *
 * @param id  for example: ''null''
 * @param deleted  for example: ''null''
 * @param `object`  for example: ''null''
*/
final case class DeleteAssistantFileResponse (
  id: String,
  deleted: Boolean,
  `object`: String
)

