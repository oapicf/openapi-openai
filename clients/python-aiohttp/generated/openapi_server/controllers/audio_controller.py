from typing import List, Dict
from aiohttp import web

from openapi_server.models.audio_response_format import AudioResponseFormat
from openapi_server.models.create_speech_request import CreateSpeechRequest
from openapi_server.models.create_transcription200_response import CreateTranscription200Response
from openapi_server.models.create_transcription_request_model import CreateTranscriptionRequestModel
from openapi_server.models.create_translation200_response import CreateTranslation200Response
from openapi_server import util


async def create_speech(request: web.Request, body) -> web.Response:
    """Generates audio from the input text.

    

    :param body: 
    :type body: dict | bytes

    """
    body = CreateSpeechRequest.from_dict(body)
    return web.Response(status=200)


async def create_transcription(request: web.Request, file, model, language=None, prompt=None, response_format=None, temperature=None, timestamp_granularities=None) -> web.Response:
    """Transcribes audio into the input language.

    

    :param file: The audio file object (not file name) to transcribe, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. 
    :type file: str
    :param model: 
    :type model: dict | bytes
    :param language: The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency. 
    :type language: str
    :param prompt: An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text#prompting) should match the audio language. 
    :type prompt: str
    :param response_format: 
    :type response_format: dict | bytes
    :param temperature: The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. 
    :type temperature: 
    :param timestamp_granularities: The timestamp granularities to populate for this transcription. &#x60;response_format&#x60; must be set &#x60;verbose_json&#x60; to use timestamp granularities. Either or both of these options are supported: &#x60;word&#x60;, or &#x60;segment&#x60;. Note: There is no additional latency for segment timestamps, but generating word timestamps incurs additional latency. 
    :type timestamp_granularities: List[str]

    """
    model = CreateTranscriptionRequestModel.from_dict(model)
    response_format = AudioResponseFormat.from_dict(response_format)
    return web.Response(status=200)


async def create_translation(request: web.Request, file, model, prompt=None, response_format=None, temperature=None) -> web.Response:
    """Translates audio into English.

    

    :param file: The audio file object (not file name) translate, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. 
    :type file: str
    :param model: 
    :type model: dict | bytes
    :param prompt: An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text#prompting) should be in English. 
    :type prompt: str
    :param response_format: 
    :type response_format: dict | bytes
    :param temperature: The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. 
    :type temperature: 

    """
    model = CreateTranscriptionRequestModel.from_dict(model)
    response_format = AudioResponseFormat.from_dict(response_format)
    return web.Response(status=200)
