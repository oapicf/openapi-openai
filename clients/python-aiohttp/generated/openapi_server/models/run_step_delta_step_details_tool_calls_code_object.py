# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model import Model
from openapi_server.models.run_step_delta_step_details_tool_calls_code_object_code_interpreter import RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter
from openapi_server import util


class RunStepDeltaStepDetailsToolCallsCodeObject(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, index: int=None, id: str=None, type: str=None, code_interpreter: RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter=None):
        """RunStepDeltaStepDetailsToolCallsCodeObject - a model defined in OpenAPI

        :param index: The index of this RunStepDeltaStepDetailsToolCallsCodeObject.
        :param id: The id of this RunStepDeltaStepDetailsToolCallsCodeObject.
        :param type: The type of this RunStepDeltaStepDetailsToolCallsCodeObject.
        :param code_interpreter: The code_interpreter of this RunStepDeltaStepDetailsToolCallsCodeObject.
        """
        self.openapi_types = {
            'index': int,
            'id': str,
            'type': str,
            'code_interpreter': RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter
        }

        self.attribute_map = {
            'index': 'index',
            'id': 'id',
            'type': 'type',
            'code_interpreter': 'code_interpreter'
        }

        self._index = index
        self._id = id
        self._type = type
        self._code_interpreter = code_interpreter

    @classmethod
    def from_dict(cls, dikt: dict) -> 'RunStepDeltaStepDetailsToolCallsCodeObject':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The RunStepDeltaStepDetailsToolCallsCodeObject of this RunStepDeltaStepDetailsToolCallsCodeObject.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def index(self):
        """Gets the index of this RunStepDeltaStepDetailsToolCallsCodeObject.

        The index of the tool call in the tool calls array.

        :return: The index of this RunStepDeltaStepDetailsToolCallsCodeObject.
        :rtype: int
        """
        return self._index

    @index.setter
    def index(self, index):
        """Sets the index of this RunStepDeltaStepDetailsToolCallsCodeObject.

        The index of the tool call in the tool calls array.

        :param index: The index of this RunStepDeltaStepDetailsToolCallsCodeObject.
        :type index: int
        """
        if index is None:
            raise ValueError("Invalid value for `index`, must not be `None`")

        self._index = index

    @property
    def id(self):
        """Gets the id of this RunStepDeltaStepDetailsToolCallsCodeObject.

        The ID of the tool call.

        :return: The id of this RunStepDeltaStepDetailsToolCallsCodeObject.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this RunStepDeltaStepDetailsToolCallsCodeObject.

        The ID of the tool call.

        :param id: The id of this RunStepDeltaStepDetailsToolCallsCodeObject.
        :type id: str
        """

        self._id = id

    @property
    def type(self):
        """Gets the type of this RunStepDeltaStepDetailsToolCallsCodeObject.

        The type of tool call. This is always going to be `code_interpreter` for this type of tool call.

        :return: The type of this RunStepDeltaStepDetailsToolCallsCodeObject.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """Sets the type of this RunStepDeltaStepDetailsToolCallsCodeObject.

        The type of tool call. This is always going to be `code_interpreter` for this type of tool call.

        :param type: The type of this RunStepDeltaStepDetailsToolCallsCodeObject.
        :type type: str
        """
        allowed_values = ["code_interpreter"]  # noqa: E501
        if type not in allowed_values:
            raise ValueError(
                "Invalid value for `type` ({0}), must be one of {1}"
                .format(type, allowed_values)
            )

        self._type = type

    @property
    def code_interpreter(self):
        """Gets the code_interpreter of this RunStepDeltaStepDetailsToolCallsCodeObject.


        :return: The code_interpreter of this RunStepDeltaStepDetailsToolCallsCodeObject.
        :rtype: RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter
        """
        return self._code_interpreter

    @code_interpreter.setter
    def code_interpreter(self, code_interpreter):
        """Sets the code_interpreter of this RunStepDeltaStepDetailsToolCallsCodeObject.


        :param code_interpreter: The code_interpreter of this RunStepDeltaStepDetailsToolCallsCodeObject.
        :type code_interpreter: RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter
        """

        self._code_interpreter = code_interpreter
