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


type Reason* {.pure.} = enum
  ContentFilter
  MaxTokens
  RunCancelled
  RunExpired
  RunFailed

type MessageObjectIncompleteDetails* = object
  ## On an incomplete message, details about why the message is incomplete.
  reason*: Reason ## The reason the message is incomplete.

func `%`*(v: Reason): JsonNode =
  let str = case v:
    of Reason.ContentFilter: "content_filter"
    of Reason.MaxTokens: "max_tokens"
    of Reason.RunCancelled: "run_cancelled"
    of Reason.RunExpired: "run_expired"
    of Reason.RunFailed: "run_failed"

  JsonNode(kind: JString, str: str)

func `$`*(v: Reason): string =
  result = case v:
    of Reason.ContentFilter: "content_filter"
    of Reason.MaxTokens: "max_tokens"
    of Reason.RunCancelled: "run_cancelled"
    of Reason.RunExpired: "run_expired"
    of Reason.RunFailed: "run_failed"