from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class RunStepDeltaStepDetailsToolCallsFunctionObjectFunction(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, name=None, arguments=None, output=None):  # noqa: E501
        """RunStepDeltaStepDetailsToolCallsFunctionObjectFunction - a model defined in OpenAPI

        :param name: The name of this RunStepDeltaStepDetailsToolCallsFunctionObjectFunction.  # noqa: E501
        :type name: str
        :param arguments: The arguments of this RunStepDeltaStepDetailsToolCallsFunctionObjectFunction.  # noqa: E501
        :type arguments: str
        :param output: The output of this RunStepDeltaStepDetailsToolCallsFunctionObjectFunction.  # noqa: E501
        :type output: str
        """
        self.openapi_types = {
            'name': str,
            'arguments': str,
            'output': str
        }

        self.attribute_map = {
            'name': 'name',
            'arguments': 'arguments',
            'output': 'output'
        }

        self._name = name
        self._arguments = arguments
        self._output = output

    @classmethod
    def from_dict(cls, dikt) -> 'RunStepDeltaStepDetailsToolCallsFunctionObjectFunction':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The RunStepDeltaStepDetailsToolCallsFunctionObject_function of this RunStepDeltaStepDetailsToolCallsFunctionObjectFunction.  # noqa: E501
        :rtype: RunStepDeltaStepDetailsToolCallsFunctionObjectFunction
        """
        return util.deserialize_model(dikt, cls)

    @property
    def name(self) -> str:
        """Gets the name of this RunStepDeltaStepDetailsToolCallsFunctionObjectFunction.

        The name of the function.  # noqa: E501

        :return: The name of this RunStepDeltaStepDetailsToolCallsFunctionObjectFunction.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this RunStepDeltaStepDetailsToolCallsFunctionObjectFunction.

        The name of the function.  # noqa: E501

        :param name: The name of this RunStepDeltaStepDetailsToolCallsFunctionObjectFunction.
        :type name: str
        """

        self._name = name

    @property
    def arguments(self) -> str:
        """Gets the arguments of this RunStepDeltaStepDetailsToolCallsFunctionObjectFunction.

        The arguments passed to the function.  # noqa: E501

        :return: The arguments of this RunStepDeltaStepDetailsToolCallsFunctionObjectFunction.
        :rtype: str
        """
        return self._arguments

    @arguments.setter
    def arguments(self, arguments: str):
        """Sets the arguments of this RunStepDeltaStepDetailsToolCallsFunctionObjectFunction.

        The arguments passed to the function.  # noqa: E501

        :param arguments: The arguments of this RunStepDeltaStepDetailsToolCallsFunctionObjectFunction.
        :type arguments: str
        """

        self._arguments = arguments

    @property
    def output(self) -> str:
        """Gets the output of this RunStepDeltaStepDetailsToolCallsFunctionObjectFunction.

        The output of the function. This will be `null` if the outputs have not been [submitted](/docs/api-reference/runs/submitToolOutputs) yet.  # noqa: E501

        :return: The output of this RunStepDeltaStepDetailsToolCallsFunctionObjectFunction.
        :rtype: str
        """
        return self._output

    @output.setter
    def output(self, output: str):
        """Sets the output of this RunStepDeltaStepDetailsToolCallsFunctionObjectFunction.

        The output of the function. This will be `null` if the outputs have not been [submitted](/docs/api-reference/runs/submitToolOutputs) yet.  # noqa: E501

        :param output: The output of this RunStepDeltaStepDetailsToolCallsFunctionObjectFunction.
        :type output: str
        """

        self._output = output
