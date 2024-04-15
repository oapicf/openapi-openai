# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model import Model
from openapi_server.models.transcription_segment import TranscriptionSegment
from openapi_server import util


class CreateTranslationResponseVerboseJson(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, language: str=None, duration: str=None, text: str=None, segments: List[TranscriptionSegment]=None):
        """CreateTranslationResponseVerboseJson - a model defined in OpenAPI

        :param language: The language of this CreateTranslationResponseVerboseJson.
        :param duration: The duration of this CreateTranslationResponseVerboseJson.
        :param text: The text of this CreateTranslationResponseVerboseJson.
        :param segments: The segments of this CreateTranslationResponseVerboseJson.
        """
        self.openapi_types = {
            'language': str,
            'duration': str,
            'text': str,
            'segments': List[TranscriptionSegment]
        }

        self.attribute_map = {
            'language': 'language',
            'duration': 'duration',
            'text': 'text',
            'segments': 'segments'
        }

        self._language = language
        self._duration = duration
        self._text = text
        self._segments = segments

    @classmethod
    def from_dict(cls, dikt: dict) -> 'CreateTranslationResponseVerboseJson':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The CreateTranslationResponseVerboseJson of this CreateTranslationResponseVerboseJson.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def language(self):
        """Gets the language of this CreateTranslationResponseVerboseJson.

        The language of the output translation (always `english`).

        :return: The language of this CreateTranslationResponseVerboseJson.
        :rtype: str
        """
        return self._language

    @language.setter
    def language(self, language):
        """Sets the language of this CreateTranslationResponseVerboseJson.

        The language of the output translation (always `english`).

        :param language: The language of this CreateTranslationResponseVerboseJson.
        :type language: str
        """
        if language is None:
            raise ValueError("Invalid value for `language`, must not be `None`")

        self._language = language

    @property
    def duration(self):
        """Gets the duration of this CreateTranslationResponseVerboseJson.

        The duration of the input audio.

        :return: The duration of this CreateTranslationResponseVerboseJson.
        :rtype: str
        """
        return self._duration

    @duration.setter
    def duration(self, duration):
        """Sets the duration of this CreateTranslationResponseVerboseJson.

        The duration of the input audio.

        :param duration: The duration of this CreateTranslationResponseVerboseJson.
        :type duration: str
        """
        if duration is None:
            raise ValueError("Invalid value for `duration`, must not be `None`")

        self._duration = duration

    @property
    def text(self):
        """Gets the text of this CreateTranslationResponseVerboseJson.

        The translated text.

        :return: The text of this CreateTranslationResponseVerboseJson.
        :rtype: str
        """
        return self._text

    @text.setter
    def text(self, text):
        """Sets the text of this CreateTranslationResponseVerboseJson.

        The translated text.

        :param text: The text of this CreateTranslationResponseVerboseJson.
        :type text: str
        """
        if text is None:
            raise ValueError("Invalid value for `text`, must not be `None`")

        self._text = text

    @property
    def segments(self):
        """Gets the segments of this CreateTranslationResponseVerboseJson.

        Segments of the translated text and their corresponding details.

        :return: The segments of this CreateTranslationResponseVerboseJson.
        :rtype: List[TranscriptionSegment]
        """
        return self._segments

    @segments.setter
    def segments(self, segments):
        """Sets the segments of this CreateTranslationResponseVerboseJson.

        Segments of the translated text and their corresponding details.

        :param segments: The segments of this CreateTranslationResponseVerboseJson.
        :type segments: List[TranscriptionSegment]
        """

        self._segments = segments