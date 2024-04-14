package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ListFineTuningJobCheckpointsResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-04-14T13:53:34.453725706Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class ListFineTuningJobCheckpointsResponse(
  data: List[FineTuningJobCheckpoint],
  `object`: ListFineTuningJobCheckpointsResponse.Object.Value,
  firstId: Option[String],
  lastId: Option[String],
  hasMore: Boolean
)

object ListFineTuningJobCheckpointsResponse {
  implicit lazy val listFineTuningJobCheckpointsResponseJsonFormat: Format[ListFineTuningJobCheckpointsResponse] = Json.format[ListFineTuningJobCheckpointsResponse]

  // noinspection TypeAnnotation
  object Object extends Enumeration {
    val List = Value("list")

    type Object = Value
    implicit lazy val ObjectJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

