from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.create_speech_request_model import CreateSpeechRequestModel
from openapi_server import util

from openapi_server.models.create_speech_request_model import CreateSpeechRequestModel  # noqa: E501

class CreateSpeechRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, model=None, input=None, voice=None, response_format='mp3', speed=1.0):  # noqa: E501
        """CreateSpeechRequest - a model defined in OpenAPI

        :param model: The model of this CreateSpeechRequest.  # noqa: E501
        :type model: CreateSpeechRequestModel
        :param input: The input of this CreateSpeechRequest.  # noqa: E501
        :type input: str
        :param voice: The voice of this CreateSpeechRequest.  # noqa: E501
        :type voice: str
        :param response_format: The response_format of this CreateSpeechRequest.  # noqa: E501
        :type response_format: str
        :param speed: The speed of this CreateSpeechRequest.  # noqa: E501
        :type speed: float
        """
        self.openapi_types = {
            'model': CreateSpeechRequestModel,
            'input': str,
            'voice': str,
            'response_format': str,
            'speed': float
        }

        self.attribute_map = {
            'model': 'model',
            'input': 'input',
            'voice': 'voice',
            'response_format': 'response_format',
            'speed': 'speed'
        }

        self._model = model
        self._input = input
        self._voice = voice
        self._response_format = response_format
        self._speed = speed

    @classmethod
    def from_dict(cls, dikt) -> 'CreateSpeechRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The CreateSpeechRequest of this CreateSpeechRequest.  # noqa: E501
        :rtype: CreateSpeechRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def model(self) -> CreateSpeechRequestModel:
        """Gets the model of this CreateSpeechRequest.


        :return: The model of this CreateSpeechRequest.
        :rtype: CreateSpeechRequestModel
        """
        return self._model

    @model.setter
    def model(self, model: CreateSpeechRequestModel):
        """Sets the model of this CreateSpeechRequest.


        :param model: The model of this CreateSpeechRequest.
        :type model: CreateSpeechRequestModel
        """
        if model is None:
            raise ValueError("Invalid value for `model`, must not be `None`")  # noqa: E501

        self._model = model

    @property
    def input(self) -> str:
        """Gets the input of this CreateSpeechRequest.

        The text to generate audio for. The maximum length is 4096 characters.  # noqa: E501

        :return: The input of this CreateSpeechRequest.
        :rtype: str
        """
        return self._input

    @input.setter
    def input(self, input: str):
        """Sets the input of this CreateSpeechRequest.

        The text to generate audio for. The maximum length is 4096 characters.  # noqa: E501

        :param input: The input of this CreateSpeechRequest.
        :type input: str
        """
        if input is None:
            raise ValueError("Invalid value for `input`, must not be `None`")  # noqa: E501
        if input is not None and len(input) > 4096:
            raise ValueError("Invalid value for `input`, length must be less than or equal to `4096`")  # noqa: E501

        self._input = input

    @property
    def voice(self) -> str:
        """Gets the voice of this CreateSpeechRequest.

        The voice to use when generating the audio. Supported voices are `alloy`, `echo`, `fable`, `onyx`, `nova`, and `shimmer`. Previews of the voices are available in the [Text to speech guide](/docs/guides/text-to-speech/voice-options).  # noqa: E501

        :return: The voice of this CreateSpeechRequest.
        :rtype: str
        """
        return self._voice

    @voice.setter
    def voice(self, voice: str):
        """Sets the voice of this CreateSpeechRequest.

        The voice to use when generating the audio. Supported voices are `alloy`, `echo`, `fable`, `onyx`, `nova`, and `shimmer`. Previews of the voices are available in the [Text to speech guide](/docs/guides/text-to-speech/voice-options).  # noqa: E501

        :param voice: The voice of this CreateSpeechRequest.
        :type voice: str
        """
        allowed_values = ["alloy", "echo", "fable", "onyx", "nova", "shimmer"]  # noqa: E501
        if voice not in allowed_values:
            raise ValueError(
                "Invalid value for `voice` ({0}), must be one of {1}"
                .format(voice, allowed_values)
            )

        self._voice = voice

    @property
    def response_format(self) -> str:
        """Gets the response_format of this CreateSpeechRequest.

        The format to audio in. Supported formats are `mp3`, `opus`, `aac`, `flac`, `wav`, and `pcm`.  # noqa: E501

        :return: The response_format of this CreateSpeechRequest.
        :rtype: str
        """
        return self._response_format

    @response_format.setter
    def response_format(self, response_format: str):
        """Sets the response_format of this CreateSpeechRequest.

        The format to audio in. Supported formats are `mp3`, `opus`, `aac`, `flac`, `wav`, and `pcm`.  # noqa: E501

        :param response_format: The response_format of this CreateSpeechRequest.
        :type response_format: str
        """
        allowed_values = ["mp3", "opus", "aac", "flac", "wav", "pcm"]  # noqa: E501
        if response_format not in allowed_values:
            raise ValueError(
                "Invalid value for `response_format` ({0}), must be one of {1}"
                .format(response_format, allowed_values)
            )

        self._response_format = response_format

    @property
    def speed(self) -> float:
        """Gets the speed of this CreateSpeechRequest.

        The speed of the generated audio. Select a value from `0.25` to `4.0`. `1.0` is the default.  # noqa: E501

        :return: The speed of this CreateSpeechRequest.
        :rtype: float
        """
        return self._speed

    @speed.setter
    def speed(self, speed: float):
        """Sets the speed of this CreateSpeechRequest.

        The speed of the generated audio. Select a value from `0.25` to `4.0`. `1.0` is the default.  # noqa: E501

        :param speed: The speed of this CreateSpeechRequest.
        :type speed: float
        """
        if speed is not None and speed > 4.0:  # noqa: E501
            raise ValueError("Invalid value for `speed`, must be a value less than or equal to `4.0`")  # noqa: E501
        if speed is not None and speed < 0.25:  # noqa: E501
            raise ValueError("Invalid value for `speed`, must be a value greater than or equal to `0.25`")  # noqa: E501

        self._speed = speed
