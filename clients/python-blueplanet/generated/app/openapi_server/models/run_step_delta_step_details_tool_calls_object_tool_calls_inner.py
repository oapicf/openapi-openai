# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.openapi_server.models.base_model import Model
from app.openapi_server.models.run_step_delta_step_details_tool_calls_code_object import RunStepDeltaStepDetailsToolCallsCodeObject  # noqa: F401,E501
from app.openapi_server.models.run_step_delta_step_details_tool_calls_code_object_code_interpreter import RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter  # noqa: F401,E501
from app.openapi_server.models.run_step_delta_step_details_tool_calls_function_object import RunStepDeltaStepDetailsToolCallsFunctionObject  # noqa: F401,E501
from app.openapi_server.models.run_step_delta_step_details_tool_calls_function_object_function import RunStepDeltaStepDetailsToolCallsFunctionObjectFunction  # noqa: F401,E501
from app.openapi_server.models.run_step_delta_step_details_tool_calls_retrieval_object import RunStepDeltaStepDetailsToolCallsRetrievalObject  # noqa: F401,E501
from openapi_server import util


class RunStepDeltaStepDetailsToolCallsObjectToolCallsInner(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, index: int=None, id: str=None, type: str=None, code_interpreter: RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter=None, retrieval: object=None, function: RunStepDeltaStepDetailsToolCallsFunctionObjectFunction=None):  # noqa: E501
        """RunStepDeltaStepDetailsToolCallsObjectToolCallsInner - a model defined in Swagger

        :param index: The index of this RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.  # noqa: E501
        :type index: int
        :param id: The id of this RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.  # noqa: E501
        :type id: str
        :param type: The type of this RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.  # noqa: E501
        :type type: str
        :param code_interpreter: The code_interpreter of this RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.  # noqa: E501
        :type code_interpreter: RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter
        :param retrieval: The retrieval of this RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.  # noqa: E501
        :type retrieval: object
        :param function: The function of this RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.  # noqa: E501
        :type function: RunStepDeltaStepDetailsToolCallsFunctionObjectFunction
        """
        self.swagger_types = {
            'index': int,
            'id': str,
            'type': str,
            'code_interpreter': RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter,
            'retrieval': object,
            'function': RunStepDeltaStepDetailsToolCallsFunctionObjectFunction
        }

        self.attribute_map = {
            'index': 'index',
            'id': 'id',
            'type': 'type',
            'code_interpreter': 'code_interpreter',
            'retrieval': 'retrieval',
            'function': 'function'
        }

        self._index = index
        self._id = id
        self._type = type
        self._code_interpreter = code_interpreter
        self._retrieval = retrieval
        self._function = function

    @classmethod
    def from_dict(cls, dikt) -> 'RunStepDeltaStepDetailsToolCallsObjectToolCallsInner':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner of this RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.  # noqa: E501
        :rtype: RunStepDeltaStepDetailsToolCallsObjectToolCallsInner
        """
        return util.deserialize_model(dikt, cls)

    @property
    def index(self) -> int:
        """Gets the index of this RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.

        The index of the tool call in the tool calls array.  # noqa: E501

        :return: The index of this RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.
        :rtype: int
        """
        return self._index

    @index.setter
    def index(self, index: int):
        """Sets the index of this RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.

        The index of the tool call in the tool calls array.  # noqa: E501

        :param index: The index of this RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.
        :type index: int
        """
        if index is None:
            raise ValueError("Invalid value for `index`, must not be `None`")  # noqa: E501

        self._index = index

    @property
    def id(self) -> str:
        """Gets the id of this RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.

        The ID of the tool call object.  # noqa: E501

        :return: The id of this RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.

        The ID of the tool call object.  # noqa: E501

        :param id: The id of this RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.
        :type id: str
        """

        self._id = id

    @property
    def type(self) -> str:
        """Gets the type of this RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.

        The type of tool call. This is always going to be `code_interpreter` for this type of tool call.  # noqa: E501

        :return: The type of this RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.

        The type of tool call. This is always going to be `code_interpreter` for this type of tool call.  # noqa: E501

        :param type: The type of this RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.
        :type type: str
        """
        allowed_values = ["code_interpreter", "retrieval", "function"]  # noqa: E501
        if type not in allowed_values:
            raise ValueError(
                "Invalid value for `type` ({0}), must be one of {1}"
                .format(type, allowed_values)
            )

        self._type = type

    @property
    def code_interpreter(self) -> RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter:
        """Gets the code_interpreter of this RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.


        :return: The code_interpreter of this RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.
        :rtype: RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter
        """
        return self._code_interpreter

    @code_interpreter.setter
    def code_interpreter(self, code_interpreter: RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter):
        """Sets the code_interpreter of this RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.


        :param code_interpreter: The code_interpreter of this RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.
        :type code_interpreter: RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter
        """

        self._code_interpreter = code_interpreter

    @property
    def retrieval(self) -> object:
        """Gets the retrieval of this RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.

        For now, this is always going to be an empty object.  # noqa: E501

        :return: The retrieval of this RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.
        :rtype: object
        """
        return self._retrieval

    @retrieval.setter
    def retrieval(self, retrieval: object):
        """Sets the retrieval of this RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.

        For now, this is always going to be an empty object.  # noqa: E501

        :param retrieval: The retrieval of this RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.
        :type retrieval: object
        """

        self._retrieval = retrieval

    @property
    def function(self) -> RunStepDeltaStepDetailsToolCallsFunctionObjectFunction:
        """Gets the function of this RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.


        :return: The function of this RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.
        :rtype: RunStepDeltaStepDetailsToolCallsFunctionObjectFunction
        """
        return self._function

    @function.setter
    def function(self, function: RunStepDeltaStepDetailsToolCallsFunctionObjectFunction):
        """Sets the function of this RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.


        :param function: The function of this RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.
        :type function: RunStepDeltaStepDetailsToolCallsFunctionObjectFunction
        """

        self._function = function
