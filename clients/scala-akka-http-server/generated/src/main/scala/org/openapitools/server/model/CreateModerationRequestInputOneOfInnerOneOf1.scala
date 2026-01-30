package org.openapitools.server.model


/**
 * An object describing text to classify.
 *
 * @param `type` Always `text`. for example: ''null''
 * @param text A string of text to classify. for example: ''I want to kill them''
*/
final case class CreateModerationRequestInputOneOfInnerOneOf1 (
  `type`: String,
  text: String
)

