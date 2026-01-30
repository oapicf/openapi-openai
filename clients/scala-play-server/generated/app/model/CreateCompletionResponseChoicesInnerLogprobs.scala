package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CreateCompletionResponse_choices_inner_logprobs.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CreateCompletionResponseChoicesInnerLogprobs(
  textOffset: Option[List[Int]],
  tokenLogprobs: Option[List[BigDecimal]],
  tokens: Option[List[String]],
  topLogprobs: Option[List[Map[String, BigDecimal]]]
)

object CreateCompletionResponseChoicesInnerLogprobs {
  implicit lazy val createCompletionResponseChoicesInnerLogprobsJsonFormat: Format[CreateCompletionResponseChoicesInnerLogprobs] = Json.format[CreateCompletionResponseChoicesInnerLogprobs]
}

