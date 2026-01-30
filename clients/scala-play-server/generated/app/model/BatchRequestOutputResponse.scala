package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for BatchRequestOutput_response.
  * @param statusCode The HTTP status code of the response
  * @param requestId An unique identifier for the OpenAI API request. Please include this request ID when contacting support.
  * @param body The JSON body of the response
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class BatchRequestOutputResponse(
  statusCode: Option[Int],
  requestId: Option[String],
  body: Option[JsObject]
)

object BatchRequestOutputResponse {
  implicit lazy val batchRequestOutputResponseJsonFormat: Format[BatchRequestOutputResponse] = Json.format[BatchRequestOutputResponse]
}

