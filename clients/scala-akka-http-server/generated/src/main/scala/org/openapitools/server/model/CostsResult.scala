package org.openapitools.server.model


/**
 * The aggregated costs details of the specific time bucket.
 *
 * @param `object`  for example: ''null''
 * @param amount  for example: ''null''
 * @param lineItem When `group_by=line_item`, this field provides the line item of the grouped costs result. for example: ''null''
 * @param projectId When `group_by=project_id`, this field provides the project ID of the grouped costs result. for example: ''null''
*/
final case class CostsResult (
  `object`: String,
  amount: Option[CostsResultAmount] = None,
  lineItem: Option[String] = None,
  projectId: Option[String] = None
)

