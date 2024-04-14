import connexion

from app.openapi_server.models.create_speech_request import CreateSpeechRequest  # noqa: E501
from app.openapi_server.models.create_transcription200_response import CreateTranscription200Response  # noqa: E501
from app.openapi_server.models.create_transcription_request_model import CreateTranscriptionRequestModel  # noqa: E501
from app.openapi_server.models.create_translation200_response import CreateTranslation200Response  # noqa: E501
from openapi_server import util


def create_speech(body):  # noqa: E501
    """Generates audio from the input text.

     # noqa: E501

    :param body: 
    :type body: dict | bytes

    :rtype: file
    """
    if connexion.request.is_json:
        body = CreateSpeechRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def create_transcription(file, model, language=None, prompt=None, response_format=None, temperature=None, timestamp_granularities=None):  # noqa: E501
    """Transcribes audio into the input language.

     # noqa: E501

    :param file: The audio file object (not file name) to transcribe, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. 
    :type file: str
    :param model: 
    :type model: dict | bytes
    :param language: The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency. 
    :type language: str
    :param prompt: An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language. 
    :type prompt: str
    :param response_format: The format of the transcript output, in one of these options: &#x60;json&#x60;, &#x60;text&#x60;, &#x60;srt&#x60;, &#x60;verbose_json&#x60;, or &#x60;vtt&#x60;. 
    :type response_format: str
    :param temperature: The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. 
    :type temperature: 
    :param timestamp_granularities: The timestamp granularities to populate for this transcription. &#x60;response_format&#x60; must be set &#x60;verbose_json&#x60; to use timestamp granularities. Either or both of these options are supported: &#x60;word&#x60;, or &#x60;segment&#x60;. Note: There is no additional latency for segment timestamps, but generating word timestamps incurs additional latency. 
    :type timestamp_granularities: List[str]

    :rtype: CreateTranscription200Response
    """
    if connexion.request.is_json:
        model = CreateTranscriptionRequestModel.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def create_translation(file, model, prompt=None, response_format=None, temperature=None):  # noqa: E501
    """Translates audio into English.

     # noqa: E501

    :param file: The audio file object (not file name) translate, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. 
    :type file: str
    :param model: 
    :type model: dict | bytes
    :param prompt: An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English. 
    :type prompt: str
    :param response_format: The format of the transcript output, in one of these options: &#x60;json&#x60;, &#x60;text&#x60;, &#x60;srt&#x60;, &#x60;verbose_json&#x60;, or &#x60;vtt&#x60;. 
    :type response_format: str
    :param temperature: The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. 
    :type temperature: 

    :rtype: CreateTranslation200Response
    """
    if connexion.request.is_json:
        model = CreateTranscriptionRequestModel.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
