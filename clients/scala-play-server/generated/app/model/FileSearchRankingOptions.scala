package model

import play.api.libs.json._

/**
  * The ranking options for the file search. If not specified, the file search tool will use the `auto` ranker and a score_threshold of 0.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. 
  * @param ranker The ranker to use for the file search. If not specified will use the `auto` ranker.
  * @param scoreThreshold The score threshold for the file search. All values must be a floating point number between 0 and 1.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class FileSearchRankingOptions(
  ranker: Option[FileSearchRankingOptions.Ranker.Value],
  scoreThreshold: BigDecimal
)

object FileSearchRankingOptions {
  implicit lazy val fileSearchRankingOptionsJsonFormat: Format[FileSearchRankingOptions] = Json.format[FileSearchRankingOptions]

  // noinspection TypeAnnotation
  object Ranker extends Enumeration {
    val Auto = Value("auto")
    val Default20240821 = Value("default_2024_08_21")

    type Ranker = Value
    implicit lazy val RankerJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

