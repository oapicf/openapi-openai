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

import model_run_object
import model_run_stream_event_one_of
import model_run_stream_event_one_of1
import model_run_stream_event_one_of2
import model_run_stream_event_one_of3
import model_run_stream_event_one_of4
import model_run_stream_event_one_of5
import model_run_stream_event_one_of6
import model_run_stream_event_one_of7
import model_run_stream_event_one_of8

type Event* {.pure.} = enum
  ThreadRunExpired

type RunStreamEvent* = object
  ## 
  event*: Event
  data*: RunObject

func `%`*(v: Event): JsonNode =
  let str = case v:
    of Event.ThreadRunExpired: "thread.run.expired"

  JsonNode(kind: JString, str: str)

func `$`*(v: Event): string =
  result = case v:
    of Event.ThreadRunExpired: "thread.run.expired"
