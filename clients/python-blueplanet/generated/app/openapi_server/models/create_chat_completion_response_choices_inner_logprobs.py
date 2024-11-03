# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.openapi_server.models.base_model import Model
from app.openapi_server.models.chat_completion_token_logprob import ChatCompletionTokenLogprob  # noqa: F401,E501
from openapi_server import util


class CreateChatCompletionResponseChoicesInnerLogprobs(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, content: List[ChatCompletionTokenLogprob]=None):  # noqa: E501
        """CreateChatCompletionResponseChoicesInnerLogprobs - a model defined in Swagger

        :param content: The content of this CreateChatCompletionResponseChoicesInnerLogprobs.  # noqa: E501
        :type content: List[ChatCompletionTokenLogprob]
        """
        self.swagger_types = {
            'content': List[ChatCompletionTokenLogprob]
        }

        self.attribute_map = {
            'content': 'content'
        }

        self._content = content

    @classmethod
    def from_dict(cls, dikt) -> 'CreateChatCompletionResponseChoicesInnerLogprobs':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The CreateChatCompletionResponse_choices_inner_logprobs of this CreateChatCompletionResponseChoicesInnerLogprobs.  # noqa: E501
        :rtype: CreateChatCompletionResponseChoicesInnerLogprobs
        """
        return util.deserialize_model(dikt, cls)

    @property
    def content(self) -> List[ChatCompletionTokenLogprob]:
        """Gets the content of this CreateChatCompletionResponseChoicesInnerLogprobs.

        A list of message content tokens with log probability information.  # noqa: E501

        :return: The content of this CreateChatCompletionResponseChoicesInnerLogprobs.
        :rtype: List[ChatCompletionTokenLogprob]
        """
        return self._content

    @content.setter
    def content(self, content: List[ChatCompletionTokenLogprob]):
        """Sets the content of this CreateChatCompletionResponseChoicesInnerLogprobs.

        A list of message content tokens with log probability information.  # noqa: E501

        :param content: The content of this CreateChatCompletionResponseChoicesInnerLogprobs.
        :type content: List[ChatCompletionTokenLogprob]
        """
        if content is None:
            raise ValueError("Invalid value for `content`, must not be `None`")  # noqa: E501

        self._content = content
