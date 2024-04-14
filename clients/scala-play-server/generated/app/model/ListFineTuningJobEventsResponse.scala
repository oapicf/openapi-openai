package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ListFineTuningJobEventsResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-04-14T13:53:34.453725706Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class ListFineTuningJobEventsResponse(
  data: List[FineTuningJobEvent],
  `object`: ListFineTuningJobEventsResponse.Object.Value
)

object ListFineTuningJobEventsResponse {
  implicit lazy val listFineTuningJobEventsResponseJsonFormat: Format[ListFineTuningJobEventsResponse] = Json.format[ListFineTuningJobEventsResponse]

  // noinspection TypeAnnotation
  object Object extends Enumeration {
    val List = Value("list")

    type Object = Value
    implicit lazy val ObjectJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

