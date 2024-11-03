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

import model_create_chat_completion_stream_response_choices_inner

type `Object`* {.pure.} = enum
  ChatCompletionChunk

type CreateChatCompletionStreamResponse* = object
  ## Represents a streamed chunk of a chat completion response returned by model, based on the provided input.
  id*: string ## A unique identifier for the chat completion. Each chunk has the same ID.
  choices*: seq[CreateChatCompletionStreamResponse_choices_inner] ## A list of chat completion choices. Can be more than one if `n` is greater than 1.
  created*: int ## The Unix timestamp (in seconds) of when the chat completion was created. Each chunk has the same timestamp.
  model*: string ## The model to generate the completion.
  systemFingerprint*: string ## This fingerprint represents the backend configuration that the model runs with. Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism. 
  `object`*: `Object` ## The object type, which is always `chat.completion.chunk`.

func `%`*(v: `Object`): JsonNode =
  let str = case v:
    of `Object`.ChatCompletionChunk: "chat.completion.chunk"

  JsonNode(kind: JString, str: str)

func `$`*(v: `Object`): string =
  result = case v:
    of `Object`.ChatCompletionChunk: "chat.completion.chunk"
