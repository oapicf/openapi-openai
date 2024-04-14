from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner import RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner
from openapi_server import util

from openapi_server.models.run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner import RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner  # noqa: E501

class RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, input=None, outputs=None):  # noqa: E501
        """RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter - a model defined in OpenAPI

        :param input: The input of this RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter.  # noqa: E501
        :type input: str
        :param outputs: The outputs of this RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter.  # noqa: E501
        :type outputs: List[RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner]
        """
        self.openapi_types = {
            'input': str,
            'outputs': List[RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner]
        }

        self.attribute_map = {
            'input': 'input',
            'outputs': 'outputs'
        }

        self._input = input
        self._outputs = outputs

    @classmethod
    def from_dict(cls, dikt) -> 'RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter of this RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter.  # noqa: E501
        :rtype: RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter
        """
        return util.deserialize_model(dikt, cls)

    @property
    def input(self) -> str:
        """Gets the input of this RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter.

        The input to the Code Interpreter tool call.  # noqa: E501

        :return: The input of this RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter.
        :rtype: str
        """
        return self._input

    @input.setter
    def input(self, input: str):
        """Sets the input of this RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter.

        The input to the Code Interpreter tool call.  # noqa: E501

        :param input: The input of this RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter.
        :type input: str
        """

        self._input = input

    @property
    def outputs(self) -> List[RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner]:
        """Gets the outputs of this RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter.

        The outputs from the Code Interpreter tool call. Code Interpreter can output one or more items, including text (`logs`) or images (`image`). Each of these are represented by a different object type.  # noqa: E501

        :return: The outputs of this RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter.
        :rtype: List[RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner]
        """
        return self._outputs

    @outputs.setter
    def outputs(self, outputs: List[RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner]):
        """Sets the outputs of this RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter.

        The outputs from the Code Interpreter tool call. Code Interpreter can output one or more items, including text (`logs`) or images (`image`). Each of these are represented by a different object type.  # noqa: E501

        :param outputs: The outputs of this RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter.
        :type outputs: List[RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner]
        """

        self._outputs = outputs
