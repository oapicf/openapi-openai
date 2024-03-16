# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.openapi_server.models.base_model import Model
from openapi_server import util


class CreateChatCompletionRequestFunctionCallOneOf(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, name: str=None):  # noqa: E501
        """CreateChatCompletionRequestFunctionCallOneOf - a model defined in Swagger

        :param name: The name of this CreateChatCompletionRequestFunctionCallOneOf.  # noqa: E501
        :type name: str
        """
        self.swagger_types = {
            'name': str
        }

        self.attribute_map = {
            'name': 'name'
        }

        self._name = name

    @classmethod
    def from_dict(cls, dikt) -> 'CreateChatCompletionRequestFunctionCallOneOf':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The CreateChatCompletionRequest_function_call_oneOf of this CreateChatCompletionRequestFunctionCallOneOf.  # noqa: E501
        :rtype: CreateChatCompletionRequestFunctionCallOneOf
        """
        return util.deserialize_model(dikt, cls)

    @property
    def name(self) -> str:
        """Gets the name of this CreateChatCompletionRequestFunctionCallOneOf.

        The name of the function to call.  # noqa: E501

        :return: The name of this CreateChatCompletionRequestFunctionCallOneOf.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this CreateChatCompletionRequestFunctionCallOneOf.

        The name of the function to call.  # noqa: E501

        :param name: The name of this CreateChatCompletionRequestFunctionCallOneOf.
        :type name: str
        """
        if name is None:
            raise ValueError("Invalid value for `name`, must not be `None`")  # noqa: E501

        self._name = name
