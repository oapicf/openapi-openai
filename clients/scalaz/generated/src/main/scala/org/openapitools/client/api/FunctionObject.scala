package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import FunctionObject._

case class FunctionObject (
  /* A description of what the function does, used by the model to choose when and how to call the function. */
  description: Option[String],
/* The name of the function to be called. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64. */
  name: String,
/* The parameters the functions accepts, described as a JSON Schema object. See the [guide](/docs/guides/function-calling) for examples, and the [JSON Schema reference](https://json-schema.org/understanding-json-schema/) for documentation about the format.   Omitting `parameters` defines a function with an empty parameter list. */
  parameters: Option[Map[String, AnyType]],
/* Whether to enable strict schema adherence when generating the function call. If set to true, the model will follow the exact schema defined in the `parameters` field. Only a subset of JSON Schema is supported when `strict` is `true`. Learn more about Structured Outputs in the [function calling guide](docs/guides/function-calling). */
  strict: Option[Boolean])

object FunctionObject {
  import DateTimeCodecs._

  implicit val FunctionObjectCodecJson: CodecJson[FunctionObject] = CodecJson.derive[FunctionObject]
  implicit val FunctionObjectDecoder: EntityDecoder[FunctionObject] = jsonOf[FunctionObject]
  implicit val FunctionObjectEncoder: EntityEncoder[FunctionObject] = jsonEncoderOf[FunctionObject]
}
