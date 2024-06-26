# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.openapi_server.models.base_model import Model
from openapi_server import util


class RunStepDeltaStepDetailsMessageCreationObjectMessageCreation(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, message_id: str=None):  # noqa: E501
        """RunStepDeltaStepDetailsMessageCreationObjectMessageCreation - a model defined in Swagger

        :param message_id: The message_id of this RunStepDeltaStepDetailsMessageCreationObjectMessageCreation.  # noqa: E501
        :type message_id: str
        """
        self.swagger_types = {
            'message_id': str
        }

        self.attribute_map = {
            'message_id': 'message_id'
        }

        self._message_id = message_id

    @classmethod
    def from_dict(cls, dikt) -> 'RunStepDeltaStepDetailsMessageCreationObjectMessageCreation':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The RunStepDeltaStepDetailsMessageCreationObject_message_creation of this RunStepDeltaStepDetailsMessageCreationObjectMessageCreation.  # noqa: E501
        :rtype: RunStepDeltaStepDetailsMessageCreationObjectMessageCreation
        """
        return util.deserialize_model(dikt, cls)

    @property
    def message_id(self) -> str:
        """Gets the message_id of this RunStepDeltaStepDetailsMessageCreationObjectMessageCreation.

        The ID of the message that was created by this run step.  # noqa: E501

        :return: The message_id of this RunStepDeltaStepDetailsMessageCreationObjectMessageCreation.
        :rtype: str
        """
        return self._message_id

    @message_id.setter
    def message_id(self, message_id: str):
        """Sets the message_id of this RunStepDeltaStepDetailsMessageCreationObjectMessageCreation.

        The ID of the message that was created by this run step.  # noqa: E501

        :param message_id: The message_id of this RunStepDeltaStepDetailsMessageCreationObjectMessageCreation.
        :type message_id: str
        """

        self._message_id = message_id
