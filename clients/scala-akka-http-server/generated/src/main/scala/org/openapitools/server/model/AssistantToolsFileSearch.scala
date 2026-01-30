package org.openapitools.server.model


/**
 * = FileSearch tool =
 *
 * @param `type` The type of tool being defined: `file_search` for example: ''null''
 * @param fileSearch  for example: ''null''
*/
final case class AssistantToolsFileSearch (
  `type`: String,
  fileSearch: Option[AssistantToolsFileSearchFileSearch] = None
)

