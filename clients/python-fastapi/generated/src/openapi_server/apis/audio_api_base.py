# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from pydantic import Field, StrictBytes, StrictFloat, StrictInt, StrictStr, field_validator
from typing import List, Optional, Tuple, Union
from typing_extensions import Annotated
from openapi_server.models.audio_response_format import AudioResponseFormat
from openapi_server.models.create_speech_request import CreateSpeechRequest
from openapi_server.models.create_transcription200_response import CreateTranscription200Response
from openapi_server.models.create_transcription_request_model import CreateTranscriptionRequestModel
from openapi_server.models.create_translation200_response import CreateTranslation200Response
from openapi_server.security_api import get_token_ApiKeyAuth

class BaseAudioApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseAudioApi.subclasses = BaseAudioApi.subclasses + (cls,)
    async def create_speech(
        self,
        create_speech_request: CreateSpeechRequest,
    ) -> file:
        ...


    async def create_transcription(
        self,
        file: Annotated[Union[StrictBytes, StrictStr, Tuple[StrictStr, StrictBytes]], Field(description="The audio file object (not file name) to transcribe, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. ")],
        model: CreateTranscriptionRequestModel,
        language: Annotated[Optional[StrictStr], Field(description="The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency. ")],
        prompt: Annotated[Optional[StrictStr], Field(description="An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text#prompting) should match the audio language. ")],
        response_format: Optional[AudioResponseFormat],
        temperature: Annotated[Optional[Union[StrictFloat, StrictInt]], Field(description="The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. ")],
        timestamp_granularities: Annotated[Optional[List[StrictStr]], Field(description="The timestamp granularities to populate for this transcription. `response_format` must be set `verbose_json` to use timestamp granularities. Either or both of these options are supported: `word`, or `segment`. Note: There is no additional latency for segment timestamps, but generating word timestamps incurs additional latency. ")],
    ) -> CreateTranscription200Response:
        ...


    async def create_translation(
        self,
        file: Annotated[Union[StrictBytes, StrictStr, Tuple[StrictStr, StrictBytes]], Field(description="The audio file object (not file name) translate, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. ")],
        model: CreateTranscriptionRequestModel,
        prompt: Annotated[Optional[StrictStr], Field(description="An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text#prompting) should be in English. ")],
        response_format: Optional[AudioResponseFormat],
        temperature: Annotated[Optional[Union[StrictFloat, StrictInt]], Field(description="The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. ")],
    ) -> CreateTranslation200Response:
        ...
