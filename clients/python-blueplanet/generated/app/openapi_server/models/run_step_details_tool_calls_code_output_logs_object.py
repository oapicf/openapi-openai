# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.openapi_server.models.base_model import Model
from openapi_server import util


class RunStepDetailsToolCallsCodeOutputLogsObject(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, type: str=None, logs: str=None):  # noqa: E501
        """RunStepDetailsToolCallsCodeOutputLogsObject - a model defined in Swagger

        :param type: The type of this RunStepDetailsToolCallsCodeOutputLogsObject.  # noqa: E501
        :type type: str
        :param logs: The logs of this RunStepDetailsToolCallsCodeOutputLogsObject.  # noqa: E501
        :type logs: str
        """
        self.swagger_types = {
            'type': str,
            'logs': str
        }

        self.attribute_map = {
            'type': 'type',
            'logs': 'logs'
        }

        self._type = type
        self._logs = logs

    @classmethod
    def from_dict(cls, dikt) -> 'RunStepDetailsToolCallsCodeOutputLogsObject':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The RunStepDetailsToolCallsCodeOutputLogsObject of this RunStepDetailsToolCallsCodeOutputLogsObject.  # noqa: E501
        :rtype: RunStepDetailsToolCallsCodeOutputLogsObject
        """
        return util.deserialize_model(dikt, cls)

    @property
    def type(self) -> str:
        """Gets the type of this RunStepDetailsToolCallsCodeOutputLogsObject.

        Always `logs`.  # noqa: E501

        :return: The type of this RunStepDetailsToolCallsCodeOutputLogsObject.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this RunStepDetailsToolCallsCodeOutputLogsObject.

        Always `logs`.  # noqa: E501

        :param type: The type of this RunStepDetailsToolCallsCodeOutputLogsObject.
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
        """Gets the logs of this RunStepDetailsToolCallsCodeOutputLogsObject.

        The text output from the Code Interpreter tool call.  # noqa: E501

        :return: The logs of this RunStepDetailsToolCallsCodeOutputLogsObject.
        :rtype: str
        """
        return self._logs

    @logs.setter
    def logs(self, logs: str):
        """Sets the logs of this RunStepDetailsToolCallsCodeOutputLogsObject.

        The text output from the Code Interpreter tool call.  # noqa: E501

        :param logs: The logs of this RunStepDetailsToolCallsCodeOutputLogsObject.
        :type logs: str
        """
        if logs is None:
            raise ValueError("Invalid value for `logs`, must not be `None`")  # noqa: E501

        self._logs = logs
