package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CreateCompletionResponse_choices_inner_logprobs.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-16T01:17:28.392125286Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class CreateCompletionResponseChoicesInnerLogprobs(
  tokens: Option[List[String]],
  tokenLogprobs: Option[List[BigDecimal]],
  topLogprobs: Option[List[JsObject]],
  textOffset: Option[List[Int]]
)

object CreateCompletionResponseChoicesInnerLogprobs {
  implicit lazy val createCompletionResponseChoicesInnerLogprobsJsonFormat: Format[CreateCompletionResponseChoicesInnerLogprobs] = Json.format[CreateCompletionResponseChoicesInnerLogprobs]
}

