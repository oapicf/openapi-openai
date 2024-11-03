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


type `Object`* {.pure.} = enum
  AssistantDeleted

type DeleteAssistantResponse* = object
  ## 
  id*: string
  deleted*: bool
  `object`*: `Object`

func `%`*(v: `Object`): JsonNode =
  let str = case v:
    of `Object`.AssistantDeleted: "assistant.deleted"

  JsonNode(kind: JString, str: str)

func `$`*(v: `Object`): string =
  result = case v:
    of `Object`.AssistantDeleted: "assistant.deleted"
