package org.openapitools.server.model


/**
 * = Static Content =
 *
 * Static predicted output content, such as the content of a text file that is being regenerated. 
 *
 * @param `type` The type of the predicted content you want to provide. This type is currently always `content`.  for example: ''null''
 * @param content  for example: ''null''
*/
final case class PredictionContent (
  `type`: String,
  content: PredictionContentContent
)

