# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.openapi_server.models.base_model import Model
from openapi_server import util


class TranscriptionSegment(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, id: int=None, seek: int=None, start: float=None, end: float=None, text: str=None, tokens: List[int]=None, temperature: float=None, avg_logprob: float=None, compression_ratio: float=None, no_speech_prob: float=None):  # noqa: E501
        """TranscriptionSegment - a model defined in Swagger

        :param id: The id of this TranscriptionSegment.  # noqa: E501
        :type id: int
        :param seek: The seek of this TranscriptionSegment.  # noqa: E501
        :type seek: int
        :param start: The start of this TranscriptionSegment.  # noqa: E501
        :type start: float
        :param end: The end of this TranscriptionSegment.  # noqa: E501
        :type end: float
        :param text: The text of this TranscriptionSegment.  # noqa: E501
        :type text: str
        :param tokens: The tokens of this TranscriptionSegment.  # noqa: E501
        :type tokens: List[int]
        :param temperature: The temperature of this TranscriptionSegment.  # noqa: E501
        :type temperature: float
        :param avg_logprob: The avg_logprob of this TranscriptionSegment.  # noqa: E501
        :type avg_logprob: float
        :param compression_ratio: The compression_ratio of this TranscriptionSegment.  # noqa: E501
        :type compression_ratio: float
        :param no_speech_prob: The no_speech_prob of this TranscriptionSegment.  # noqa: E501
        :type no_speech_prob: float
        """
        self.swagger_types = {
            'id': int,
            'seek': int,
            'start': float,
            'end': float,
            'text': str,
            'tokens': List[int],
            'temperature': float,
            'avg_logprob': float,
            'compression_ratio': float,
            'no_speech_prob': float
        }

        self.attribute_map = {
            'id': 'id',
            'seek': 'seek',
            'start': 'start',
            'end': 'end',
            'text': 'text',
            'tokens': 'tokens',
            'temperature': 'temperature',
            'avg_logprob': 'avg_logprob',
            'compression_ratio': 'compression_ratio',
            'no_speech_prob': 'no_speech_prob'
        }

        self._id = id
        self._seek = seek
        self._start = start
        self._end = end
        self._text = text
        self._tokens = tokens
        self._temperature = temperature
        self._avg_logprob = avg_logprob
        self._compression_ratio = compression_ratio
        self._no_speech_prob = no_speech_prob

    @classmethod
    def from_dict(cls, dikt) -> 'TranscriptionSegment':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The TranscriptionSegment of this TranscriptionSegment.  # noqa: E501
        :rtype: TranscriptionSegment
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self) -> int:
        """Gets the id of this TranscriptionSegment.

        Unique identifier of the segment.  # noqa: E501

        :return: The id of this TranscriptionSegment.
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id: int):
        """Sets the id of this TranscriptionSegment.

        Unique identifier of the segment.  # noqa: E501

        :param id: The id of this TranscriptionSegment.
        :type id: int
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")  # noqa: E501

        self._id = id

    @property
    def seek(self) -> int:
        """Gets the seek of this TranscriptionSegment.

        Seek offset of the segment.  # noqa: E501

        :return: The seek of this TranscriptionSegment.
        :rtype: int
        """
        return self._seek

    @seek.setter
    def seek(self, seek: int):
        """Sets the seek of this TranscriptionSegment.

        Seek offset of the segment.  # noqa: E501

        :param seek: The seek of this TranscriptionSegment.
        :type seek: int
        """
        if seek is None:
            raise ValueError("Invalid value for `seek`, must not be `None`")  # noqa: E501

        self._seek = seek

    @property
    def start(self) -> float:
        """Gets the start of this TranscriptionSegment.

        Start time of the segment in seconds.  # noqa: E501

        :return: The start of this TranscriptionSegment.
        :rtype: float
        """
        return self._start

    @start.setter
    def start(self, start: float):
        """Sets the start of this TranscriptionSegment.

        Start time of the segment in seconds.  # noqa: E501

        :param start: The start of this TranscriptionSegment.
        :type start: float
        """
        if start is None:
            raise ValueError("Invalid value for `start`, must not be `None`")  # noqa: E501

        self._start = start

    @property
    def end(self) -> float:
        """Gets the end of this TranscriptionSegment.

        End time of the segment in seconds.  # noqa: E501

        :return: The end of this TranscriptionSegment.
        :rtype: float
        """
        return self._end

    @end.setter
    def end(self, end: float):
        """Sets the end of this TranscriptionSegment.

        End time of the segment in seconds.  # noqa: E501

        :param end: The end of this TranscriptionSegment.
        :type end: float
        """
        if end is None:
            raise ValueError("Invalid value for `end`, must not be `None`")  # noqa: E501

        self._end = end

    @property
    def text(self) -> str:
        """Gets the text of this TranscriptionSegment.

        Text content of the segment.  # noqa: E501

        :return: The text of this TranscriptionSegment.
        :rtype: str
        """
        return self._text

    @text.setter
    def text(self, text: str):
        """Sets the text of this TranscriptionSegment.

        Text content of the segment.  # noqa: E501

        :param text: The text of this TranscriptionSegment.
        :type text: str
        """
        if text is None:
            raise ValueError("Invalid value for `text`, must not be `None`")  # noqa: E501

        self._text = text

    @property
    def tokens(self) -> List[int]:
        """Gets the tokens of this TranscriptionSegment.

        Array of token IDs for the text content.  # noqa: E501

        :return: The tokens of this TranscriptionSegment.
        :rtype: List[int]
        """
        return self._tokens

    @tokens.setter
    def tokens(self, tokens: List[int]):
        """Sets the tokens of this TranscriptionSegment.

        Array of token IDs for the text content.  # noqa: E501

        :param tokens: The tokens of this TranscriptionSegment.
        :type tokens: List[int]
        """
        if tokens is None:
            raise ValueError("Invalid value for `tokens`, must not be `None`")  # noqa: E501

        self._tokens = tokens

    @property
    def temperature(self) -> float:
        """Gets the temperature of this TranscriptionSegment.

        Temperature parameter used for generating the segment.  # noqa: E501

        :return: The temperature of this TranscriptionSegment.
        :rtype: float
        """
        return self._temperature

    @temperature.setter
    def temperature(self, temperature: float):
        """Sets the temperature of this TranscriptionSegment.

        Temperature parameter used for generating the segment.  # noqa: E501

        :param temperature: The temperature of this TranscriptionSegment.
        :type temperature: float
        """
        if temperature is None:
            raise ValueError("Invalid value for `temperature`, must not be `None`")  # noqa: E501

        self._temperature = temperature

    @property
    def avg_logprob(self) -> float:
        """Gets the avg_logprob of this TranscriptionSegment.

        Average logprob of the segment. If the value is lower than -1, consider the logprobs failed.  # noqa: E501

        :return: The avg_logprob of this TranscriptionSegment.
        :rtype: float
        """
        return self._avg_logprob

    @avg_logprob.setter
    def avg_logprob(self, avg_logprob: float):
        """Sets the avg_logprob of this TranscriptionSegment.

        Average logprob of the segment. If the value is lower than -1, consider the logprobs failed.  # noqa: E501

        :param avg_logprob: The avg_logprob of this TranscriptionSegment.
        :type avg_logprob: float
        """
        if avg_logprob is None:
            raise ValueError("Invalid value for `avg_logprob`, must not be `None`")  # noqa: E501

        self._avg_logprob = avg_logprob

    @property
    def compression_ratio(self) -> float:
        """Gets the compression_ratio of this TranscriptionSegment.

        Compression ratio of the segment. If the value is greater than 2.4, consider the compression failed.  # noqa: E501

        :return: The compression_ratio of this TranscriptionSegment.
        :rtype: float
        """
        return self._compression_ratio

    @compression_ratio.setter
    def compression_ratio(self, compression_ratio: float):
        """Sets the compression_ratio of this TranscriptionSegment.

        Compression ratio of the segment. If the value is greater than 2.4, consider the compression failed.  # noqa: E501

        :param compression_ratio: The compression_ratio of this TranscriptionSegment.
        :type compression_ratio: float
        """
        if compression_ratio is None:
            raise ValueError("Invalid value for `compression_ratio`, must not be `None`")  # noqa: E501

        self._compression_ratio = compression_ratio

    @property
    def no_speech_prob(self) -> float:
        """Gets the no_speech_prob of this TranscriptionSegment.

        Probability of no speech in the segment. If the value is higher than 1.0 and the `avg_logprob` is below -1, consider this segment silent.  # noqa: E501

        :return: The no_speech_prob of this TranscriptionSegment.
        :rtype: float
        """
        return self._no_speech_prob

    @no_speech_prob.setter
    def no_speech_prob(self, no_speech_prob: float):
        """Sets the no_speech_prob of this TranscriptionSegment.

        Probability of no speech in the segment. If the value is higher than 1.0 and the `avg_logprob` is below -1, consider this segment silent.  # noqa: E501

        :param no_speech_prob: The no_speech_prob of this TranscriptionSegment.
        :type no_speech_prob: float
        """
        if no_speech_prob is None:
            raise ValueError("Invalid value for `no_speech_prob`, must not be `None`")  # noqa: E501

        self._no_speech_prob = no_speech_prob