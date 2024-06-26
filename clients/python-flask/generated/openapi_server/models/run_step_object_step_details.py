from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.run_step_details_message_creation_object import RunStepDetailsMessageCreationObject
from openapi_server.models.run_step_details_message_creation_object_message_creation import RunStepDetailsMessageCreationObjectMessageCreation
from openapi_server.models.run_step_details_tool_calls_object import RunStepDetailsToolCallsObject
from openapi_server.models.run_step_details_tool_calls_object_tool_calls_inner import RunStepDetailsToolCallsObjectToolCallsInner
from openapi_server import util

from openapi_server.models.run_step_details_message_creation_object import RunStepDetailsMessageCreationObject  # noqa: E501
from openapi_server.models.run_step_details_message_creation_object_message_creation import RunStepDetailsMessageCreationObjectMessageCreation  # noqa: E501
from openapi_server.models.run_step_details_tool_calls_object import RunStepDetailsToolCallsObject  # noqa: E501
from openapi_server.models.run_step_details_tool_calls_object_tool_calls_inner import RunStepDetailsToolCallsObjectToolCallsInner  # noqa: E501

class RunStepObjectStepDetails(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, type=None, message_creation=None, tool_calls=None):  # noqa: E501
        """RunStepObjectStepDetails - a model defined in OpenAPI

        :param type: The type of this RunStepObjectStepDetails.  # noqa: E501
        :type type: str
        :param message_creation: The message_creation of this RunStepObjectStepDetails.  # noqa: E501
        :type message_creation: RunStepDetailsMessageCreationObjectMessageCreation
        :param tool_calls: The tool_calls of this RunStepObjectStepDetails.  # noqa: E501
        :type tool_calls: List[RunStepDetailsToolCallsObjectToolCallsInner]
        """
        self.openapi_types = {
            'type': str,
            'message_creation': RunStepDetailsMessageCreationObjectMessageCreation,
            'tool_calls': List[RunStepDetailsToolCallsObjectToolCallsInner]
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
    def from_dict(cls, dikt) -> 'RunStepObjectStepDetails':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The RunStepObject_step_details of this RunStepObjectStepDetails.  # noqa: E501
        :rtype: RunStepObjectStepDetails
        """
        return util.deserialize_model(dikt, cls)

    @property
    def type(self) -> str:
        """Gets the type of this RunStepObjectStepDetails.

        Always `message_creation`.  # noqa: E501

        :return: The type of this RunStepObjectStepDetails.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this RunStepObjectStepDetails.

        Always `message_creation`.  # noqa: E501

        :param type: The type of this RunStepObjectStepDetails.
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
    def message_creation(self) -> RunStepDetailsMessageCreationObjectMessageCreation:
        """Gets the message_creation of this RunStepObjectStepDetails.


        :return: The message_creation of this RunStepObjectStepDetails.
        :rtype: RunStepDetailsMessageCreationObjectMessageCreation
        """
        return self._message_creation

    @message_creation.setter
    def message_creation(self, message_creation: RunStepDetailsMessageCreationObjectMessageCreation):
        """Sets the message_creation of this RunStepObjectStepDetails.


        :param message_creation: The message_creation of this RunStepObjectStepDetails.
        :type message_creation: RunStepDetailsMessageCreationObjectMessageCreation
        """
        if message_creation is None:
            raise ValueError("Invalid value for `message_creation`, must not be `None`")  # noqa: E501

        self._message_creation = message_creation

    @property
    def tool_calls(self) -> List[RunStepDetailsToolCallsObjectToolCallsInner]:
        """Gets the tool_calls of this RunStepObjectStepDetails.

        An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `retrieval`, or `function`.   # noqa: E501

        :return: The tool_calls of this RunStepObjectStepDetails.
        :rtype: List[RunStepDetailsToolCallsObjectToolCallsInner]
        """
        return self._tool_calls

    @tool_calls.setter
    def tool_calls(self, tool_calls: List[RunStepDetailsToolCallsObjectToolCallsInner]):
        """Sets the tool_calls of this RunStepObjectStepDetails.

        An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `retrieval`, or `function`.   # noqa: E501

        :param tool_calls: The tool_calls of this RunStepObjectStepDetails.
        :type tool_calls: List[RunStepDetailsToolCallsObjectToolCallsInner]
        """
        if tool_calls is None:
            raise ValueError("Invalid value for `tool_calls`, must not be `None`")  # noqa: E501

        self._tool_calls = tool_calls
