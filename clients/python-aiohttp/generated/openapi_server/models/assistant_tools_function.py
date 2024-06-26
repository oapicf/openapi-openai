# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model import Model
from openapi_server.models.function_object import FunctionObject
from openapi_server import util


class AssistantToolsFunction(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, type: str=None, function: FunctionObject=None):
        """AssistantToolsFunction - a model defined in OpenAPI

        :param type: The type of this AssistantToolsFunction.
        :param function: The function of this AssistantToolsFunction.
        """
        self.openapi_types = {
            'type': str,
            'function': FunctionObject
        }

        self.attribute_map = {
            'type': 'type',
            'function': 'function'
        }

        self._type = type
        self._function = function

    @classmethod
    def from_dict(cls, dikt: dict) -> 'AssistantToolsFunction':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The AssistantToolsFunction of this AssistantToolsFunction.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def type(self):
        """Gets the type of this AssistantToolsFunction.

        The type of tool being defined: `function`

        :return: The type of this AssistantToolsFunction.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """Sets the type of this AssistantToolsFunction.

        The type of tool being defined: `function`

        :param type: The type of this AssistantToolsFunction.
        :type type: str
        """
        allowed_values = ["function"]  # noqa: E501
        if type not in allowed_values:
            raise ValueError(
                "Invalid value for `type` ({0}), must be one of {1}"
                .format(type, allowed_values)
            )

        self._type = type

    @property
    def function(self):
        """Gets the function of this AssistantToolsFunction.


        :return: The function of this AssistantToolsFunction.
        :rtype: FunctionObject
        """
        return self._function

    @function.setter
    def function(self, function):
        """Sets the function of this AssistantToolsFunction.


        :param function: The function of this AssistantToolsFunction.
        :type function: FunctionObject
        """
        if function is None:
            raise ValueError("Invalid value for `function`, must not be `None`")

        self._function = function
