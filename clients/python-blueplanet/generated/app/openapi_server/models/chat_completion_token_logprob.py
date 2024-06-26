# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.openapi_server.models.base_model import Model
from app.openapi_server.models.chat_completion_token_logprob_top_logprobs_inner import ChatCompletionTokenLogprobTopLogprobsInner  # noqa: F401,E501
from openapi_server import util


class ChatCompletionTokenLogprob(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, token: str=None, logprob: float=None, bytes: List[int]=None, top_logprobs: List[ChatCompletionTokenLogprobTopLogprobsInner]=None):  # noqa: E501
        """ChatCompletionTokenLogprob - a model defined in Swagger

        :param token: The token of this ChatCompletionTokenLogprob.  # noqa: E501
        :type token: str
        :param logprob: The logprob of this ChatCompletionTokenLogprob.  # noqa: E501
        :type logprob: float
        :param bytes: The bytes of this ChatCompletionTokenLogprob.  # noqa: E501
        :type bytes: List[int]
        :param top_logprobs: The top_logprobs of this ChatCompletionTokenLogprob.  # noqa: E501
        :type top_logprobs: List[ChatCompletionTokenLogprobTopLogprobsInner]
        """
        self.swagger_types = {
            'token': str,
            'logprob': float,
            'bytes': List[int],
            'top_logprobs': List[ChatCompletionTokenLogprobTopLogprobsInner]
        }

        self.attribute_map = {
            'token': 'token',
            'logprob': 'logprob',
            'bytes': 'bytes',
            'top_logprobs': 'top_logprobs'
        }

        self._token = token
        self._logprob = logprob
        self._bytes = bytes
        self._top_logprobs = top_logprobs

    @classmethod
    def from_dict(cls, dikt) -> 'ChatCompletionTokenLogprob':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ChatCompletionTokenLogprob of this ChatCompletionTokenLogprob.  # noqa: E501
        :rtype: ChatCompletionTokenLogprob
        """
        return util.deserialize_model(dikt, cls)

    @property
    def token(self) -> str:
        """Gets the token of this ChatCompletionTokenLogprob.

        The token.  # noqa: E501

        :return: The token of this ChatCompletionTokenLogprob.
        :rtype: str
        """
        return self._token

    @token.setter
    def token(self, token: str):
        """Sets the token of this ChatCompletionTokenLogprob.

        The token.  # noqa: E501

        :param token: The token of this ChatCompletionTokenLogprob.
        :type token: str
        """
        if token is None:
            raise ValueError("Invalid value for `token`, must not be `None`")  # noqa: E501

        self._token = token

    @property
    def logprob(self) -> float:
        """Gets the logprob of this ChatCompletionTokenLogprob.

        The log probability of this token, if it is within the top 20 most likely tokens. Otherwise, the value `-9999.0` is used to signify that the token is very unlikely.  # noqa: E501

        :return: The logprob of this ChatCompletionTokenLogprob.
        :rtype: float
        """
        return self._logprob

    @logprob.setter
    def logprob(self, logprob: float):
        """Sets the logprob of this ChatCompletionTokenLogprob.

        The log probability of this token, if it is within the top 20 most likely tokens. Otherwise, the value `-9999.0` is used to signify that the token is very unlikely.  # noqa: E501

        :param logprob: The logprob of this ChatCompletionTokenLogprob.
        :type logprob: float
        """
        if logprob is None:
            raise ValueError("Invalid value for `logprob`, must not be `None`")  # noqa: E501

        self._logprob = logprob

    @property
    def bytes(self) -> List[int]:
        """Gets the bytes of this ChatCompletionTokenLogprob.

        A list of integers representing the UTF-8 bytes representation of the token. Useful in instances where characters are represented by multiple tokens and their byte representations must be combined to generate the correct text representation. Can be `null` if there is no bytes representation for the token.  # noqa: E501

        :return: The bytes of this ChatCompletionTokenLogprob.
        :rtype: List[int]
        """
        return self._bytes

    @bytes.setter
    def bytes(self, bytes: List[int]):
        """Sets the bytes of this ChatCompletionTokenLogprob.

        A list of integers representing the UTF-8 bytes representation of the token. Useful in instances where characters are represented by multiple tokens and their byte representations must be combined to generate the correct text representation. Can be `null` if there is no bytes representation for the token.  # noqa: E501

        :param bytes: The bytes of this ChatCompletionTokenLogprob.
        :type bytes: List[int]
        """
        if bytes is None:
            raise ValueError("Invalid value for `bytes`, must not be `None`")  # noqa: E501

        self._bytes = bytes

    @property
    def top_logprobs(self) -> List[ChatCompletionTokenLogprobTopLogprobsInner]:
        """Gets the top_logprobs of this ChatCompletionTokenLogprob.

        List of the most likely tokens and their log probability, at this token position. In rare cases, there may be fewer than the number of requested `top_logprobs` returned.  # noqa: E501

        :return: The top_logprobs of this ChatCompletionTokenLogprob.
        :rtype: List[ChatCompletionTokenLogprobTopLogprobsInner]
        """
        return self._top_logprobs

    @top_logprobs.setter
    def top_logprobs(self, top_logprobs: List[ChatCompletionTokenLogprobTopLogprobsInner]):
        """Sets the top_logprobs of this ChatCompletionTokenLogprob.

        List of the most likely tokens and their log probability, at this token position. In rare cases, there may be fewer than the number of requested `top_logprobs` returned.  # noqa: E501

        :param top_logprobs: The top_logprobs of this ChatCompletionTokenLogprob.
        :type top_logprobs: List[ChatCompletionTokenLogprobTopLogprobsInner]
        """
        if top_logprobs is None:
            raise ValueError("Invalid value for `top_logprobs`, must not be `None`")  # noqa: E501

        self._top_logprobs = top_logprobs
