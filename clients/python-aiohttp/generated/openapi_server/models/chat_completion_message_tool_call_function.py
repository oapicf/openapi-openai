# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model import Model
from openapi_server import util


class ChatCompletionMessageToolCallFunction(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, name: str=None, arguments: str=None):
        """ChatCompletionMessageToolCallFunction - a model defined in OpenAPI

        :param name: The name of this ChatCompletionMessageToolCallFunction.
        :param arguments: The arguments of this ChatCompletionMessageToolCallFunction.
        """
        self.openapi_types = {
            'name': str,
            'arguments': str
        }

        self.attribute_map = {
            'name': 'name',
            'arguments': 'arguments'
        }

        self._name = name
        self._arguments = arguments

    @classmethod
    def from_dict(cls, dikt: dict) -> 'ChatCompletionMessageToolCallFunction':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The ChatCompletionMessageToolCall_function of this ChatCompletionMessageToolCallFunction.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def name(self):
        """Gets the name of this ChatCompletionMessageToolCallFunction.

        The name of the function to call.

        :return: The name of this ChatCompletionMessageToolCallFunction.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this ChatCompletionMessageToolCallFunction.

        The name of the function to call.

        :param name: The name of this ChatCompletionMessageToolCallFunction.
        :type name: str
        """
        if name is None:
            raise ValueError("Invalid value for `name`, must not be `None`")

        self._name = name

    @property
    def arguments(self):
        """Gets the arguments of this ChatCompletionMessageToolCallFunction.

        The arguments to call the function with, as generated by the model in JSON format. Note that the model does not always generate valid JSON, and may hallucinate parameters not defined by your function schema. Validate the arguments in your code before calling your function.

        :return: The arguments of this ChatCompletionMessageToolCallFunction.
        :rtype: str
        """
        return self._arguments

    @arguments.setter
    def arguments(self, arguments):
        """Sets the arguments of this ChatCompletionMessageToolCallFunction.

        The arguments to call the function with, as generated by the model in JSON format. Note that the model does not always generate valid JSON, and may hallucinate parameters not defined by your function schema. Validate the arguments in your code before calling your function.

        :param arguments: The arguments of this ChatCompletionMessageToolCallFunction.
        :type arguments: str
        """
        if arguments is None:
            raise ValueError("Invalid value for `arguments`, must not be `None`")

        self._arguments = arguments