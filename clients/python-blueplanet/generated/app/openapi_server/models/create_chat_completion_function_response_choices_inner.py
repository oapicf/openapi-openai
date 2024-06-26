# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.openapi_server.models.base_model import Model
from app.openapi_server.models.chat_completion_response_message import ChatCompletionResponseMessage  # noqa: F401,E501
from openapi_server import util


class CreateChatCompletionFunctionResponseChoicesInner(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, finish_reason: str=None, index: int=None, message: ChatCompletionResponseMessage=None):  # noqa: E501
        """CreateChatCompletionFunctionResponseChoicesInner - a model defined in Swagger

        :param finish_reason: The finish_reason of this CreateChatCompletionFunctionResponseChoicesInner.  # noqa: E501
        :type finish_reason: str
        :param index: The index of this CreateChatCompletionFunctionResponseChoicesInner.  # noqa: E501
        :type index: int
        :param message: The message of this CreateChatCompletionFunctionResponseChoicesInner.  # noqa: E501
        :type message: ChatCompletionResponseMessage
        """
        self.swagger_types = {
            'finish_reason': str,
            'index': int,
            'message': ChatCompletionResponseMessage
        }

        self.attribute_map = {
            'finish_reason': 'finish_reason',
            'index': 'index',
            'message': 'message'
        }

        self._finish_reason = finish_reason
        self._index = index
        self._message = message

    @classmethod
    def from_dict(cls, dikt) -> 'CreateChatCompletionFunctionResponseChoicesInner':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The CreateChatCompletionFunctionResponse_choices_inner of this CreateChatCompletionFunctionResponseChoicesInner.  # noqa: E501
        :rtype: CreateChatCompletionFunctionResponseChoicesInner
        """
        return util.deserialize_model(dikt, cls)

    @property
    def finish_reason(self) -> str:
        """Gets the finish_reason of this CreateChatCompletionFunctionResponseChoicesInner.

        The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, or `function_call` if the model called a function.   # noqa: E501

        :return: The finish_reason of this CreateChatCompletionFunctionResponseChoicesInner.
        :rtype: str
        """
        return self._finish_reason

    @finish_reason.setter
    def finish_reason(self, finish_reason: str):
        """Sets the finish_reason of this CreateChatCompletionFunctionResponseChoicesInner.

        The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, or `function_call` if the model called a function.   # noqa: E501

        :param finish_reason: The finish_reason of this CreateChatCompletionFunctionResponseChoicesInner.
        :type finish_reason: str
        """
        allowed_values = ["stop", "length", "function_call", "content_filter"]  # noqa: E501
        if finish_reason not in allowed_values:
            raise ValueError(
                "Invalid value for `finish_reason` ({0}), must be one of {1}"
                .format(finish_reason, allowed_values)
            )

        self._finish_reason = finish_reason

    @property
    def index(self) -> int:
        """Gets the index of this CreateChatCompletionFunctionResponseChoicesInner.

        The index of the choice in the list of choices.  # noqa: E501

        :return: The index of this CreateChatCompletionFunctionResponseChoicesInner.
        :rtype: int
        """
        return self._index

    @index.setter
    def index(self, index: int):
        """Sets the index of this CreateChatCompletionFunctionResponseChoicesInner.

        The index of the choice in the list of choices.  # noqa: E501

        :param index: The index of this CreateChatCompletionFunctionResponseChoicesInner.
        :type index: int
        """
        if index is None:
            raise ValueError("Invalid value for `index`, must not be `None`")  # noqa: E501

        self._index = index

    @property
    def message(self) -> ChatCompletionResponseMessage:
        """Gets the message of this CreateChatCompletionFunctionResponseChoicesInner.


        :return: The message of this CreateChatCompletionFunctionResponseChoicesInner.
        :rtype: ChatCompletionResponseMessage
        """
        return self._message

    @message.setter
    def message(self, message: ChatCompletionResponseMessage):
        """Sets the message of this CreateChatCompletionFunctionResponseChoicesInner.


        :param message: The message of this CreateChatCompletionFunctionResponseChoicesInner.
        :type message: ChatCompletionResponseMessage
        """
        if message is None:
            raise ValueError("Invalid value for `message`, must not be `None`")  # noqa: E501

        self._message = message
