# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.openapi_server.models.base_model import Model
from app.openapi_server.models.run_step_details_tool_calls_code_output_image_object import RunStepDetailsToolCallsCodeOutputImageObject  # noqa: F401,E501
from app.openapi_server.models.run_step_details_tool_calls_code_output_image_object_image import RunStepDetailsToolCallsCodeOutputImageObjectImage  # noqa: F401,E501
from app.openapi_server.models.run_step_details_tool_calls_code_output_logs_object import RunStepDetailsToolCallsCodeOutputLogsObject  # noqa: F401,E501
from openapi_server import util


class RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, type: str=None, logs: str=None, image: RunStepDetailsToolCallsCodeOutputImageObjectImage=None):  # noqa: E501
        """RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner - a model defined in Swagger

        :param type: The type of this RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.  # noqa: E501
        :type type: str
        :param logs: The logs of this RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.  # noqa: E501
        :type logs: str
        :param image: The image of this RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.  # noqa: E501
        :type image: RunStepDetailsToolCallsCodeOutputImageObjectImage
        """
        self.swagger_types = {
            'type': str,
            'logs': str,
            'image': RunStepDetailsToolCallsCodeOutputImageObjectImage
        }

        self.attribute_map = {
            'type': 'type',
            'logs': 'logs',
            'image': 'image'
        }

        self._type = type
        self._logs = logs
        self._image = image

    @classmethod
    def from_dict(cls, dikt) -> 'RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner of this RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.  # noqa: E501
        :rtype: RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner
        """
        return util.deserialize_model(dikt, cls)

    @property
    def type(self) -> str:
        """Gets the type of this RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.

        Always `logs`.  # noqa: E501

        :return: The type of this RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.

        Always `logs`.  # noqa: E501

        :param type: The type of this RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.
        :type type: str
        """
        allowed_values = ["logs", "image"]  # noqa: E501
        if type not in allowed_values:
            raise ValueError(
                "Invalid value for `type` ({0}), must be one of {1}"
                .format(type, allowed_values)
            )

        self._type = type

    @property
    def logs(self) -> str:
        """Gets the logs of this RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.

        The text output from the Code Interpreter tool call.  # noqa: E501

        :return: The logs of this RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.
        :rtype: str
        """
        return self._logs

    @logs.setter
    def logs(self, logs: str):
        """Sets the logs of this RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.

        The text output from the Code Interpreter tool call.  # noqa: E501

        :param logs: The logs of this RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.
        :type logs: str
        """
        if logs is None:
            raise ValueError("Invalid value for `logs`, must not be `None`")  # noqa: E501

        self._logs = logs

    @property
    def image(self) -> RunStepDetailsToolCallsCodeOutputImageObjectImage:
        """Gets the image of this RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.


        :return: The image of this RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.
        :rtype: RunStepDetailsToolCallsCodeOutputImageObjectImage
        """
        return self._image

    @image.setter
    def image(self, image: RunStepDetailsToolCallsCodeOutputImageObjectImage):
        """Sets the image of this RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.


        :param image: The image of this RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.
        :type image: RunStepDetailsToolCallsCodeOutputImageObjectImage
        """
        if image is None:
            raise ValueError("Invalid value for `image`, must not be `None`")  # noqa: E501

        self._image = image
