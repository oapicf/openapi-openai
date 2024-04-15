# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model import Model
from openapi_server import util


class FunctionObject(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, description: str=None, name: str=None, parameters: Dict[str, object]=None):
        """FunctionObject - a model defined in OpenAPI

        :param description: The description of this FunctionObject.
        :param name: The name of this FunctionObject.
        :param parameters: The parameters of this FunctionObject.
        """
        self.openapi_types = {
            'description': str,
            'name': str,
            'parameters': Dict[str, object]
        }

        self.attribute_map = {
            'description': 'description',
            'name': 'name',
            'parameters': 'parameters'
        }

        self._description = description
        self._name = name
        self._parameters = parameters

    @classmethod
    def from_dict(cls, dikt: dict) -> 'FunctionObject':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The FunctionObject of this FunctionObject.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def description(self):
        """Gets the description of this FunctionObject.

        A description of what the function does, used by the model to choose when and how to call the function.

        :return: The description of this FunctionObject.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """Sets the description of this FunctionObject.

        A description of what the function does, used by the model to choose when and how to call the function.

        :param description: The description of this FunctionObject.
        :type description: str
        """

        self._description = description

    @property
    def name(self):
        """Gets the name of this FunctionObject.

        The name of the function to be called. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64.

        :return: The name of this FunctionObject.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this FunctionObject.

        The name of the function to be called. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64.

        :param name: The name of this FunctionObject.
        :type name: str
        """
        if name is None:
            raise ValueError("Invalid value for `name`, must not be `None`")

        self._name = name

    @property
    def parameters(self):
        """Gets the parameters of this FunctionObject.

        The parameters the functions accepts, described as a JSON Schema object. See the [guide](/docs/guides/text-generation/function-calling) for examples, and the [JSON Schema reference](https://json-schema.org/understanding-json-schema/) for documentation about the format.   Omitting `parameters` defines a function with an empty parameter list.

        :return: The parameters of this FunctionObject.
        :rtype: Dict[str, object]
        """
        return self._parameters

    @parameters.setter
    def parameters(self, parameters):
        """Sets the parameters of this FunctionObject.

        The parameters the functions accepts, described as a JSON Schema object. See the [guide](/docs/guides/text-generation/function-calling) for examples, and the [JSON Schema reference](https://json-schema.org/understanding-json-schema/) for documentation about the format.   Omitting `parameters` defines a function with an empty parameter list.

        :param parameters: The parameters of this FunctionObject.
        :type parameters: Dict[str, object]
        """

        self._parameters = parameters