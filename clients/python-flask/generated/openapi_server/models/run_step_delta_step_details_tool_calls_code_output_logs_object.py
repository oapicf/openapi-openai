from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, index=None, type=None, logs=None):  # noqa: E501
        """RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject - a model defined in OpenAPI

        :param index: The index of this RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject.  # noqa: E501
        :type index: int
        :param type: The type of this RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject.  # noqa: E501
        :type type: str
        :param logs: The logs of this RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject.  # noqa: E501
        :type logs: str
        """
        self.openapi_types = {
            'index': int,
            'type': str,
            'logs': str
        }

        self.attribute_map = {
            'index': 'index',
            'type': 'type',
            'logs': 'logs'
        }

        self._index = index
        self._type = type
        self._logs = logs

    @classmethod
    def from_dict(cls, dikt) -> 'RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject of this RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject.  # noqa: E501
        :rtype: RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject
        """
        return util.deserialize_model(dikt, cls)

    @property
    def index(self) -> int:
        """Gets the index of this RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject.

        The index of the output in the outputs array.  # noqa: E501

        :return: The index of this RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject.
        :rtype: int
        """
        return self._index

    @index.setter
    def index(self, index: int):
        """Sets the index of this RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject.

        The index of the output in the outputs array.  # noqa: E501

        :param index: The index of this RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject.
        :type index: int
        """
        if index is None:
            raise ValueError("Invalid value for `index`, must not be `None`")  # noqa: E501

        self._index = index

    @property
    def type(self) -> str:
        """Gets the type of this RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject.

        Always `logs`.  # noqa: E501

        :return: The type of this RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject.

        Always `logs`.  # noqa: E501

        :param type: The type of this RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject.
        :type type: str
        """
        allowed_values = ["logs"]  # noqa: E501
        if type not in allowed_values:
            raise ValueError(
                "Invalid value for `type` ({0}), must be one of {1}"
                .format(type, allowed_values)
            )

        self._type = type

    @property
    def logs(self) -> str:
        """Gets the logs of this RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject.

        The text output from the Code Interpreter tool call.  # noqa: E501

        :return: The logs of this RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject.
        :rtype: str
        """
        return self._logs

    @logs.setter
    def logs(self, logs: str):
        """Sets the logs of this RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject.

        The text output from the Code Interpreter tool call.  # noqa: E501

        :param logs: The logs of this RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject.
        :type logs: str
        """

        self._logs = logs
