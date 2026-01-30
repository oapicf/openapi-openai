package org.openapitools.server.model


/**
 * @param `object` The object type, which is always `list`. for example: ''null''
 * @param data  for example: ''null''
*/
final case class BatchErrors (
  `object`: Option[String] = None,
  data: Option[Seq[BatchErrorsDataInner]] = None
)

