# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model import Model
from openapi_server.models.transcription_segment import TranscriptionSegment
from openapi_server.models.transcription_word import TranscriptionWord
from openapi_server import util


class CreateTranscriptionResponseVerboseJson(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, language: str=None, duration: str=None, text: str=None, words: List[TranscriptionWord]=None, segments: List[TranscriptionSegment]=None):
        """CreateTranscriptionResponseVerboseJson - a model defined in OpenAPI

        :param language: The language of this CreateTranscriptionResponseVerboseJson.
        :param duration: The duration of this CreateTranscriptionResponseVerboseJson.
        :param text: The text of this CreateTranscriptionResponseVerboseJson.
        :param words: The words of this CreateTranscriptionResponseVerboseJson.
        :param segments: The segments of this CreateTranscriptionResponseVerboseJson.
        """
        self.openapi_types = {
            'language': str,
            'duration': str,
            'text': str,
            'words': List[TranscriptionWord],
            'segments': List[TranscriptionSegment]
        }

        self.attribute_map = {
            'language': 'language',
            'duration': 'duration',
            'text': 'text',
            'words': 'words',
            'segments': 'segments'
        }

        self._language = language
        self._duration = duration
        self._text = text
        self._words = words
        self._segments = segments

    @classmethod
    def from_dict(cls, dikt: dict) -> 'CreateTranscriptionResponseVerboseJson':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The CreateTranscriptionResponseVerboseJson of this CreateTranscriptionResponseVerboseJson.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def language(self):
        """Gets the language of this CreateTranscriptionResponseVerboseJson.

        The language of the input audio.

        :return: The language of this CreateTranscriptionResponseVerboseJson.
        :rtype: str
        """
        return self._language

    @language.setter
    def language(self, language):
        """Sets the language of this CreateTranscriptionResponseVerboseJson.

        The language of the input audio.

        :param language: The language of this CreateTranscriptionResponseVerboseJson.
        :type language: str
        """
        if language is None:
            raise ValueError("Invalid value for `language`, must not be `None`")

        self._language = language

    @property
    def duration(self):
        """Gets the duration of this CreateTranscriptionResponseVerboseJson.

        The duration of the input audio.

        :return: The duration of this CreateTranscriptionResponseVerboseJson.
        :rtype: str
        """
        return self._duration

    @duration.setter
    def duration(self, duration):
        """Sets the duration of this CreateTranscriptionResponseVerboseJson.

        The duration of the input audio.

        :param duration: The duration of this CreateTranscriptionResponseVerboseJson.
        :type duration: str
        """
        if duration is None:
            raise ValueError("Invalid value for `duration`, must not be `None`")

        self._duration = duration

    @property
    def text(self):
        """Gets the text of this CreateTranscriptionResponseVerboseJson.

        The transcribed text.

        :return: The text of this CreateTranscriptionResponseVerboseJson.
        :rtype: str
        """
        return self._text

    @text.setter
    def text(self, text):
        """Sets the text of this CreateTranscriptionResponseVerboseJson.

        The transcribed text.

        :param text: The text of this CreateTranscriptionResponseVerboseJson.
        :type text: str
        """
        if text is None:
            raise ValueError("Invalid value for `text`, must not be `None`")

        self._text = text

    @property
    def words(self):
        """Gets the words of this CreateTranscriptionResponseVerboseJson.

        Extracted words and their corresponding timestamps.

        :return: The words of this CreateTranscriptionResponseVerboseJson.
        :rtype: List[TranscriptionWord]
        """
        return self._words

    @words.setter
    def words(self, words):
        """Sets the words of this CreateTranscriptionResponseVerboseJson.

        Extracted words and their corresponding timestamps.

        :param words: The words of this CreateTranscriptionResponseVerboseJson.
        :type words: List[TranscriptionWord]
        """

        self._words = words

    @property
    def segments(self):
        """Gets the segments of this CreateTranscriptionResponseVerboseJson.

        Segments of the transcribed text and their corresponding details.

        :return: The segments of this CreateTranscriptionResponseVerboseJson.
        :rtype: List[TranscriptionSegment]
        """
        return self._segments

    @segments.setter
    def segments(self, segments):
        """Sets the segments of this CreateTranscriptionResponseVerboseJson.

        Segments of the transcribed text and their corresponding details.

        :param segments: The segments of this CreateTranscriptionResponseVerboseJson.
        :type segments: List[TranscriptionSegment]
        """

        self._segments = segments