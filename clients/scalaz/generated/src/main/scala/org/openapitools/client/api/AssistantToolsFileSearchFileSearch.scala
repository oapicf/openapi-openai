package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AssistantToolsFileSearchFileSearch._

case class AssistantToolsFileSearchFileSearch (
  /* The maximum number of results the file search tool should output. The default is 20 for `gpt-4*` models and 5 for `gpt-3.5-turbo`. This number should be between 1 and 50 inclusive.  Note that the file search tool may output fewer than `max_num_results` results. See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.  */
  maxNumResults: Option[Integer],
rankingOptions: Option[FileSearchRankingOptions])

object AssistantToolsFileSearchFileSearch {
  import DateTimeCodecs._

  implicit val AssistantToolsFileSearchFileSearchCodecJson: CodecJson[AssistantToolsFileSearchFileSearch] = CodecJson.derive[AssistantToolsFileSearchFileSearch]
  implicit val AssistantToolsFileSearchFileSearchDecoder: EntityDecoder[AssistantToolsFileSearchFileSearch] = jsonOf[AssistantToolsFileSearchFileSearch]
  implicit val AssistantToolsFileSearchFileSearchEncoder: EntityEncoder[AssistantToolsFileSearchFileSearch] = jsonEncoderOf[AssistantToolsFileSearchFileSearch]
}
