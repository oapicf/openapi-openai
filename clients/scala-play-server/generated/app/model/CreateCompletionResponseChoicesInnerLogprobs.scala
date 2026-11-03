package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CreateCompletionResponse_choices_inner_logprobs.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class CreateCompletionResponseChoicesInnerLogprobs(
  textOffset: Option[List[Int]],
  tokenLogprobs: Option[List[BigDecimal]],
  tokens: Option[List[String]],
  topLogprobs: Option[List[Map[String, BigDecimal]]]
)

object CreateCompletionResponseChoicesInnerLogprobs {
  implicit lazy val createCompletionResponseChoicesInnerLogprobsJsonFormat: Format[CreateCompletionResponseChoicesInnerLogprobs] = Json.format[CreateCompletionResponseChoicesInnerLogprobs]
}

