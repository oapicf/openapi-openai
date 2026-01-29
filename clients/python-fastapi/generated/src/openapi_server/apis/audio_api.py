# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.audio_api_base import BaseAudioApi
import openapi_server.impl

from fastapi import (  # noqa: F401
    APIRouter,
    Body,
    Cookie,
    Depends,
    Form,
    Header,
    HTTPException,
    Path,
    Query,
    Response,
    Security,
    status,
)

from openapi_server.models.extra_models import TokenModel  # noqa: F401
from pydantic import Field, StrictBytes, StrictFloat, StrictInt, StrictStr, field_validator
from typing import List, Optional, Tuple, Union
from typing_extensions import Annotated
from openapi_server.models.create_speech_request import CreateSpeechRequest
from openapi_server.models.create_transcription200_response import CreateTranscription200Response
from openapi_server.models.create_transcription_request_model import CreateTranscriptionRequestModel
from openapi_server.models.create_translation200_response import CreateTranslation200Response
from openapi_server.security_api import get_token_ApiKeyAuth

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.post(
    "/audio/speech",
    responses={
        200: {"model": file, "description": "OK"},
    },
    tags=["Audio"],
    summary="Generates audio from the input text.",
    response_model_by_alias=True,
)
async def create_speech(
    create_speech_request: CreateSpeechRequest = Body(None, description=""),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> file:
    if not BaseAudioApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAudioApi.subclasses[0]().create_speech(create_speech_request)


@router.post(
    "/audio/transcriptions",
    responses={
        200: {"model": CreateTranscription200Response, "description": "OK"},
    },
    tags=["Audio"],
    summary="Transcribes audio into the input language.",
    response_model_by_alias=True,
)
async def create_transcription(
    file: Annotated[Union[StrictBytes, StrictStr, Tuple[StrictStr, StrictBytes]], Field(description="The audio file object (not file name) to transcribe, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. ")] = Form(None, description="The audio file object (not file name) to transcribe, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. "),
    model: CreateTranscriptionRequestModel = Form(None, description=""),
    language: Annotated[Optional[StrictStr], Field(description="The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency. ")] = Form(None, description="The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency. "),
    prompt: Annotated[Optional[StrictStr], Field(description="An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language. ")] = Form(None, description="An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language. "),
    response_format: Annotated[Optional[StrictStr], Field(description="The format of the transcript output, in one of these options: `json`, `text`, `srt`, `verbose_json`, or `vtt`. ")] = Form(json, description="The format of the transcript output, in one of these options: &#x60;json&#x60;, &#x60;text&#x60;, &#x60;srt&#x60;, &#x60;verbose_json&#x60;, or &#x60;vtt&#x60;. "),
    temperature: Annotated[Optional[Union[StrictFloat, StrictInt]], Field(description="The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. ")] = Form(0, description="The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. "),
    timestamp_granularities: Annotated[Optional[List[StrictStr]], Field(description="The timestamp granularities to populate for this transcription. `response_format` must be set `verbose_json` to use timestamp granularities. Either or both of these options are supported: `word`, or `segment`. Note: There is no additional latency for segment timestamps, but generating word timestamps incurs additional latency. ")] = Form(None, description="The timestamp granularities to populate for this transcription. &#x60;response_format&#x60; must be set &#x60;verbose_json&#x60; to use timestamp granularities. Either or both of these options are supported: &#x60;word&#x60;, or &#x60;segment&#x60;. Note: There is no additional latency for segment timestamps, but generating word timestamps incurs additional latency. "),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> CreateTranscription200Response:
    if not BaseAudioApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAudioApi.subclasses[0]().create_transcription(file, model, language, prompt, response_format, temperature, timestamp_granularities)


@router.post(
    "/audio/translations",
    responses={
        200: {"model": CreateTranslation200Response, "description": "OK"},
    },
    tags=["Audio"],
    summary="Translates audio into English.",
    response_model_by_alias=True,
)
async def create_translation(
    file: Annotated[Union[StrictBytes, StrictStr, Tuple[StrictStr, StrictBytes]], Field(description="The audio file object (not file name) translate, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. ")] = Form(None, description="The audio file object (not file name) translate, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. "),
    model: CreateTranscriptionRequestModel = Form(None, description=""),
    prompt: Annotated[Optional[StrictStr], Field(description="An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English. ")] = Form(None, description="An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English. "),
    response_format: Annotated[Optional[StrictStr], Field(description="The format of the transcript output, in one of these options: `json`, `text`, `srt`, `verbose_json`, or `vtt`. ")] = Form('json', description="The format of the transcript output, in one of these options: &#x60;json&#x60;, &#x60;text&#x60;, &#x60;srt&#x60;, &#x60;verbose_json&#x60;, or &#x60;vtt&#x60;. "),
    temperature: Annotated[Optional[Union[StrictFloat, StrictInt]], Field(description="The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. ")] = Form(0, description="The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. "),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> CreateTranslation200Response:
    if not BaseAudioApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseAudioApi.subclasses[0]().create_translation(file, model, prompt, response_format, temperature)
