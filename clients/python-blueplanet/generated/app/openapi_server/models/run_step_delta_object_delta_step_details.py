# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.openapi_server.models.base_model import Model
from app.openapi_server.models.run_step_delta_step_details_message_creation_object import RunStepDeltaStepDetailsMessageCreationObject  # noqa: F401,E501
from app.openapi_server.models.run_step_delta_step_details_message_creation_object_message_creation import RunStepDeltaStepDetailsMessageCreationObjectMessageCreation  # noqa: F401,E501
from app.openapi_server.models.run_step_delta_step_details_tool_calls_object import RunStepDeltaStepDetailsToolCallsObject  # noqa: F401,E501
from app.openapi_server.models.run_step_delta_step_details_tool_calls_object_tool_calls_inner import RunStepDeltaStepDetailsToolCallsObjectToolCallsInner  # noqa: F401,E501
from openapi_server import util


class RunStepDeltaObjectDeltaStepDetails(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, type: str=None, message_creation: RunStepDeltaStepDetailsMessageCreationObjectMessageCreation=None, tool_calls: List[RunStepDeltaStepDetailsToolCallsObjectToolCallsInner]=None):  # noqa: E501
        """RunStepDeltaObjectDeltaStepDetails - a model defined in Swagger

        :param type: The type of this RunStepDeltaObjectDeltaStepDetails.  # noqa: E501
        :type type: str
        :param message_creation: The message_creation of this RunStepDeltaObjectDeltaStepDetails.  # noqa: E501
        :type message_creation: RunStepDeltaStepDetailsMessageCreationObjectMessageCreation
        :param tool_calls: The tool_calls of this RunStepDeltaObjectDeltaStepDetails.  # noqa: E501
        :type tool_calls: List[RunStepDeltaStepDetailsToolCallsObjectToolCallsInner]
        """
        self.swagger_types = {
            'type': str,
            'message_creation': RunStepDeltaStepDetailsMessageCreationObjectMessageCreation,
            'tool_calls': List[RunStepDeltaStepDetailsToolCallsObjectToolCallsInner]
        }

        self.attribute_map = {
            'type': 'type',
            'message_creation': 'message_creation',
            'tool_calls': 'tool_calls'
        }

        self._type = type
        self._message_creation = message_creation
        self._tool_calls = tool_calls

    @classmethod
    def from_dict(cls, dikt) -> 'RunStepDeltaObjectDeltaStepDetails':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The RunStepDeltaObject_delta_step_details of this RunStepDeltaObjectDeltaStepDetails.  # noqa: E501
        :rtype: RunStepDeltaObjectDeltaStepDetails
        """
        return util.deserialize_model(dikt, cls)

    @property
    def type(self) -> str:
        """Gets the type of this RunStepDeltaObjectDeltaStepDetails.

        Always `message_creation`.  # noqa: E501

        :return: The type of this RunStepDeltaObjectDeltaStepDetails.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this RunStepDeltaObjectDeltaStepDetails.

        Always `message_creation`.  # noqa: E501

        :param type: The type of this RunStepDeltaObjectDeltaStepDetails.
        :type type: str
        """
        allowed_values = ["message_creation", "tool_calls"]  # noqa: E501
        if type not in allowed_values:
            raise ValueError(
                "Invalid value for `type` ({0}), must be one of {1}"
                .format(type, allowed_values)
            )

        self._type = type

    @property
    def message_creation(self) -> RunStepDeltaStepDetailsMessageCreationObjectMessageCreation:
        """Gets the message_creation of this RunStepDeltaObjectDeltaStepDetails.


        :return: The message_creation of this RunStepDeltaObjectDeltaStepDetails.
        :rtype: RunStepDeltaStepDetailsMessageCreationObjectMessageCreation
        """
        return self._message_creation

    @message_creation.setter
    def message_creation(self, message_creation: RunStepDeltaStepDetailsMessageCreationObjectMessageCreation):
        """Sets the message_creation of this RunStepDeltaObjectDeltaStepDetails.


        :param message_creation: The message_creation of this RunStepDeltaObjectDeltaStepDetails.
        :type message_creation: RunStepDeltaStepDetailsMessageCreationObjectMessageCreation
        """

        self._message_creation = message_creation

    @property
    def tool_calls(self) -> List[RunStepDeltaStepDetailsToolCallsObjectToolCallsInner]:
        """Gets the tool_calls of this RunStepDeltaObjectDeltaStepDetails.

        An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `retrieval`, or `function`.   # noqa: E501

        :return: The tool_calls of this RunStepDeltaObjectDeltaStepDetails.
        :rtype: List[RunStepDeltaStepDetailsToolCallsObjectToolCallsInner]
        """
        return self._tool_calls

    @tool_calls.setter
    def tool_calls(self, tool_calls: List[RunStepDeltaStepDetailsToolCallsObjectToolCallsInner]):
        """Sets the tool_calls of this RunStepDeltaObjectDeltaStepDetails.

        An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `retrieval`, or `function`.   # noqa: E501

        :param tool_calls: The tool_calls of this RunStepDeltaObjectDeltaStepDetails.
        :type tool_calls: List[RunStepDeltaStepDetailsToolCallsObjectToolCallsInner]
        """

        self._tool_calls = tool_calls
