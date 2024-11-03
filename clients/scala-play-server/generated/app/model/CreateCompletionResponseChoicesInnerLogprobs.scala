package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CreateCompletionResponse_choices_inner_logprobs.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T11:15:39.331426426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CreateCompletionResponseChoicesInnerLogprobs(
  textOffset: Option[List[Int]],
  tokenLogprobs: Option[List[BigDecimal]],
  tokens: Option[List[String]],
  topLogprobs: Option[List[Map[String, BigDecimal]]]
)

object CreateCompletionResponseChoicesInnerLogprobs {
  implicit lazy val createCompletionResponseChoicesInnerLogprobsJsonFormat: Format[CreateCompletionResponseChoicesInnerLogprobs] = Json.format[CreateCompletionResponseChoicesInnerLogprobs]
}

