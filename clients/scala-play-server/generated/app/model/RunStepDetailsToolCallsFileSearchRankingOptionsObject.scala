package model

import play.api.libs.json._

/**
  * The ranking options for the file search.
  * @param ranker The ranker used for the file search.
  * @param scoreThreshold The score threshold for the file search. All values must be a floating point number between 0 and 1.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class RunStepDetailsToolCallsFileSearchRankingOptionsObject(
  ranker: RunStepDetailsToolCallsFileSearchRankingOptionsObject.Ranker.Value,
  scoreThreshold: BigDecimal
)

object RunStepDetailsToolCallsFileSearchRankingOptionsObject {
  implicit lazy val runStepDetailsToolCallsFileSearchRankingOptionsObjectJsonFormat: Format[RunStepDetailsToolCallsFileSearchRankingOptionsObject] = Json.format[RunStepDetailsToolCallsFileSearchRankingOptionsObject]

  // noinspection TypeAnnotation
  object Ranker extends Enumeration {
    val Default20240821 = Value("default_2024_08_21")

    type Ranker = Value
    implicit lazy val RankerJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

