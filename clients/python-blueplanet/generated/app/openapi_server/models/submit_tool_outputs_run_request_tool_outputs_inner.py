# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.openapi_server.models.base_model import Model
from openapi_server import util


class SubmitToolOutputsRunRequestToolOutputsInner(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, tool_call_id: str=None, output: str=None):  # noqa: E501
        """SubmitToolOutputsRunRequestToolOutputsInner - a model defined in Swagger

        :param tool_call_id: The tool_call_id of this SubmitToolOutputsRunRequestToolOutputsInner.  # noqa: E501
        :type tool_call_id: str
        :param output: The output of this SubmitToolOutputsRunRequestToolOutputsInner.  # noqa: E501
        :type output: str
        """
        self.swagger_types = {
            'tool_call_id': str,
            'output': str
        }

        self.attribute_map = {
            'tool_call_id': 'tool_call_id',
            'output': 'output'
        }

        self._tool_call_id = tool_call_id
        self._output = output

    @classmethod
    def from_dict(cls, dikt) -> 'SubmitToolOutputsRunRequestToolOutputsInner':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The SubmitToolOutputsRunRequest_tool_outputs_inner of this SubmitToolOutputsRunRequestToolOutputsInner.  # noqa: E501
        :rtype: SubmitToolOutputsRunRequestToolOutputsInner
        """
        return util.deserialize_model(dikt, cls)

    @property
    def tool_call_id(self) -> str:
        """Gets the tool_call_id of this SubmitToolOutputsRunRequestToolOutputsInner.

        The ID of the tool call in the `required_action` object within the run object the output is being submitted for.  # noqa: E501

        :return: The tool_call_id of this SubmitToolOutputsRunRequestToolOutputsInner.
        :rtype: str
        """
        return self._tool_call_id

    @tool_call_id.setter
    def tool_call_id(self, tool_call_id: str):
        """Sets the tool_call_id of this SubmitToolOutputsRunRequestToolOutputsInner.

        The ID of the tool call in the `required_action` object within the run object the output is being submitted for.  # noqa: E501

        :param tool_call_id: The tool_call_id of this SubmitToolOutputsRunRequestToolOutputsInner.
        :type tool_call_id: str
        """

        self._tool_call_id = tool_call_id

    @property
    def output(self) -> str:
        """Gets the output of this SubmitToolOutputsRunRequestToolOutputsInner.

        The output of the tool call to be submitted to continue the run.  # noqa: E501

        :return: The output of this SubmitToolOutputsRunRequestToolOutputsInner.
        :rtype: str
        """
        return self._output

    @output.setter
    def output(self, output: str):
        """Sets the output of this SubmitToolOutputsRunRequestToolOutputsInner.

        The output of the tool call to be submitted to continue the run.  # noqa: E501

        :param output: The output of this SubmitToolOutputsRunRequestToolOutputsInner.
        :type output: str
        """

        self._output = output