package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AssistantObject._

case class AssistantObject (
  /* The identifier, which can be referenced in API endpoints. */
  id: String,
/* The object type, which is always `assistant`. */
  `object`: `Object`,
/* The Unix timestamp (in seconds) for when the assistant was created. */
  createdAt: Integer,
/* The name of the assistant. The maximum length is 256 characters.  */
  name: String,
/* The description of the assistant. The maximum length is 512 characters.  */
  description: String,
/* ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models) for descriptions of them.  */
  model: String,
/* The system instructions that the assistant uses. The maximum length is 256,000 characters.  */
  instructions: String,
/* A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `file_search`, or `function`.  */
  tools: List[AssistantObjectToolsInner],
toolResources: Option[AssistantObjectToolResources],
/* Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  */
  metadata: Any,
/* What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  */
  temperature: Option[BigDecimal],
/* An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both.  */
  topP: Option[BigDecimal],
responseFormat: Option[AssistantsApiResponseFormatOption])

object AssistantObject {
  import DateTimeCodecs._
  sealed trait `Object`
  case object Assistant extends `Object`

  object `Object` {
    def to`Object`(s: String): Option[`Object`] = s match {
      case "Assistant" => Some(Assistant)
      case _ => None
    }

    def from`Object`(x: `Object`): String = x match {
      case Assistant => "Assistant"
    }
  }

  implicit val `Object`EnumEncoder: EncodeJson[`Object`] =
    EncodeJson[`Object`](is => StringEncodeJson(`Object`.from`Object`(is)))

  implicit val `Object`EnumDecoder: DecodeJson[`Object`] =
    DecodeJson.optionDecoder[`Object`](n => n.string.flatMap(jStr => `Object`.to`Object`(jStr)), "`Object` failed to de-serialize")

  implicit val AssistantObjectCodecJson: CodecJson[AssistantObject] = CodecJson.derive[AssistantObject]
  implicit val AssistantObjectDecoder: EntityDecoder[AssistantObject] = jsonOf[AssistantObject]
  implicit val AssistantObjectEncoder: EntityEncoder[AssistantObject] = jsonEncoderOf[AssistantObject]
}
