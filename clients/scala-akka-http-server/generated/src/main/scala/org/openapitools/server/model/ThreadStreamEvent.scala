package org.openapitools.server.model


/**
 * Occurs when a new [thread](/docs/api-reference/threads/object) is created.
 *
 * @param enabled Whether to enable input audio transcription. for example: ''null''
 * @param event  for example: ''null''
 * @param data  for example: ''null''
*/
final case class ThreadStreamEvent (
  enabled: Option[Boolean] = None,
  event: String,
  data: ThreadObject
)

