package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CreateCompletionResponse_choices_inner_logprobs.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-04-14T13:53:34.453725706Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class CreateCompletionResponseChoicesInnerLogprobs(
  textOffset: Option[List[Int]],
  tokenLogprobs: Option[List[BigDecimal]],
  tokens: Option[List[String]],
  topLogprobs: Option[List[Map[String, BigDecimal]]]
)

object CreateCompletionResponseChoicesInnerLogprobs {
  implicit lazy val createCompletionResponseChoicesInnerLogprobsJsonFormat: Format[CreateCompletionResponseChoicesInnerLogprobs] = Json.format[CreateCompletionResponseChoicesInnerLogprobs]
}

