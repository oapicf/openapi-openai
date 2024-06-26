from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.transcription_segment import TranscriptionSegment
from openapi_server.models.transcription_word import TranscriptionWord
from openapi_server import util

from openapi_server.models.transcription_segment import TranscriptionSegment  # noqa: E501
from openapi_server.models.transcription_word import TranscriptionWord  # noqa: E501

class CreateTranscriptionResponseVerboseJson(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, language=None, duration=None, text=None, words=None, segments=None):  # noqa: E501
        """CreateTranscriptionResponseVerboseJson - a model defined in OpenAPI

        :param language: The language of this CreateTranscriptionResponseVerboseJson.  # noqa: E501
        :type language: str
        :param duration: The duration of this CreateTranscriptionResponseVerboseJson.  # noqa: E501
        :type duration: str
        :param text: The text of this CreateTranscriptionResponseVerboseJson.  # noqa: E501
        :type text: str
        :param words: The words of this CreateTranscriptionResponseVerboseJson.  # noqa: E501
        :type words: List[TranscriptionWord]
        :param segments: The segments of this CreateTranscriptionResponseVerboseJson.  # noqa: E501
        :type segments: List[TranscriptionSegment]
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
    def from_dict(cls, dikt) -> 'CreateTranscriptionResponseVerboseJson':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The CreateTranscriptionResponseVerboseJson of this CreateTranscriptionResponseVerboseJson.  # noqa: E501
        :rtype: CreateTranscriptionResponseVerboseJson
        """
        return util.deserialize_model(dikt, cls)

    @property
    def language(self) -> str:
        """Gets the language of this CreateTranscriptionResponseVerboseJson.

        The language of the input audio.  # noqa: E501

        :return: The language of this CreateTranscriptionResponseVerboseJson.
        :rtype: str
        """
        return self._language

    @language.setter
    def language(self, language: str):
        """Sets the language of this CreateTranscriptionResponseVerboseJson.

        The language of the input audio.  # noqa: E501

        :param language: The language of this CreateTranscriptionResponseVerboseJson.
        :type language: str
        """
        if language is None:
            raise ValueError("Invalid value for `language`, must not be `None`")  # noqa: E501

        self._language = language

    @property
    def duration(self) -> str:
        """Gets the duration of this CreateTranscriptionResponseVerboseJson.

        The duration of the input audio.  # noqa: E501

        :return: The duration of this CreateTranscriptionResponseVerboseJson.
        :rtype: str
        """
        return self._duration

    @duration.setter
    def duration(self, duration: str):
        """Sets the duration of this CreateTranscriptionResponseVerboseJson.

        The duration of the input audio.  # noqa: E501

        :param duration: The duration of this CreateTranscriptionResponseVerboseJson.
        :type duration: str
        """
        if duration is None:
            raise ValueError("Invalid value for `duration`, must not be `None`")  # noqa: E501

        self._duration = duration

    @property
    def text(self) -> str:
        """Gets the text of this CreateTranscriptionResponseVerboseJson.

        The transcribed text.  # noqa: E501

        :return: The text of this CreateTranscriptionResponseVerboseJson.
        :rtype: str
        """
        return self._text

    @text.setter
    def text(self, text: str):
        """Sets the text of this CreateTranscriptionResponseVerboseJson.

        The transcribed text.  # noqa: E501

        :param text: The text of this CreateTranscriptionResponseVerboseJson.
        :type text: str
        """
        if text is None:
            raise ValueError("Invalid value for `text`, must not be `None`")  # noqa: E501

        self._text = text

    @property
    def words(self) -> List[TranscriptionWord]:
        """Gets the words of this CreateTranscriptionResponseVerboseJson.

        Extracted words and their corresponding timestamps.  # noqa: E501

        :return: The words of this CreateTranscriptionResponseVerboseJson.
        :rtype: List[TranscriptionWord]
        """
        return self._words

    @words.setter
    def words(self, words: List[TranscriptionWord]):
        """Sets the words of this CreateTranscriptionResponseVerboseJson.

        Extracted words and their corresponding timestamps.  # noqa: E501

        :param words: The words of this CreateTranscriptionResponseVerboseJson.
        :type words: List[TranscriptionWord]
        """

        self._words = words

    @property
    def segments(self) -> List[TranscriptionSegment]:
        """Gets the segments of this CreateTranscriptionResponseVerboseJson.

        Segments of the transcribed text and their corresponding details.  # noqa: E501

        :return: The segments of this CreateTranscriptionResponseVerboseJson.
        :rtype: List[TranscriptionSegment]
        """
        return self._segments

    @segments.setter
    def segments(self, segments: List[TranscriptionSegment]):
        """Sets the segments of this CreateTranscriptionResponseVerboseJson.

        Segments of the transcribed text and their corresponding details.  # noqa: E501

        :param segments: The segments of this CreateTranscriptionResponseVerboseJson.
        :type segments: List[TranscriptionSegment]
        """

        self._segments = segments
