package org.openapitools.server.model


/**
 * Occurs when a new [thread](/docs/api-reference/threads/object) is created.
 *
 * @param event  for example: ''null''
 * @param data  for example: ''null''
*/
final case class ThreadStreamEvent (
  event: String,
  data: ThreadObject
)

