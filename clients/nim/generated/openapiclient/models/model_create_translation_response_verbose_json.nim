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

import model_transcription_segment

type CreateTranslationResponseVerboseJson* = object
  ## 
  language*: string ## The language of the output translation (always `english`).
  duration*: string ## The duration of the input audio.
  text*: string ## The translated text.
  segments*: seq[TranscriptionSegment] ## Segments of the translated text and their corresponding details.
