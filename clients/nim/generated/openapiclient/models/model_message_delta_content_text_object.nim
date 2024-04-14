#
# OpenAI API
# 
# The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
# The version of the OpenAPI document: 2.0.0
# Contact: blah+oapicf@cliffano.com
# Generated by: https://openapi-generator.tech
#

import json
import tables

import model_message_delta_content_text_object_text

type `Type`* {.pure.} = enum
  Text

type MessageDeltaContentTextObject* = object
  ## The text content that is part of a message.
  index*: int ## The index of the content part in the message.
  `type`*: `Type` ## Always `text`.
  text*: MessageDeltaContentTextObject_text

func `%`*(v: `Type`): JsonNode =
  let str = case v:
    of `Type`.Text: "text"

  JsonNode(kind: JString, str: str)

func `$`*(v: `Type`): string =
  result = case v:
    of `Type`.Text: "text"
