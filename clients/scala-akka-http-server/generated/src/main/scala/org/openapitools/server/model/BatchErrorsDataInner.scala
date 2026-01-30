package org.openapitools.server.model


/**
 * @param code An error code identifying the error type. for example: ''null''
 * @param message A human-readable message providing more details about the error. for example: ''null''
 * @param param The name of the parameter that caused the error, if applicable. for example: ''null''
 * @param line The line number of the input file where the error occurred, if applicable. for example: ''null''
*/
final case class BatchErrorsDataInner (
  code: Option[String] = None,
  message: Option[String] = None,
  param: Option[String] = None,
  line: Option[Int] = None
)

