# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model import Model
from openapi_server import util


class RunStepDeltaStepDetailsMessageCreationObjectMessageCreation(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, message_id: str=None):
        """RunStepDeltaStepDetailsMessageCreationObjectMessageCreation - a model defined in OpenAPI

        :param message_id: The message_id of this RunStepDeltaStepDetailsMessageCreationObjectMessageCreation.
        """
        self.openapi_types = {
            'message_id': str
        }

        self.attribute_map = {
            'message_id': 'message_id'
        }

        self._message_id = message_id

    @classmethod
    def from_dict(cls, dikt: dict) -> 'RunStepDeltaStepDetailsMessageCreationObjectMessageCreation':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The RunStepDeltaStepDetailsMessageCreationObject_message_creation of this RunStepDeltaStepDetailsMessageCreationObjectMessageCreation.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def message_id(self):
        """Gets the message_id of this RunStepDeltaStepDetailsMessageCreationObjectMessageCreation.

        The ID of the message that was created by this run step.

        :return: The message_id of this RunStepDeltaStepDetailsMessageCreationObjectMessageCreation.
        :rtype: str
        """
        return self._message_id

    @message_id.setter
    def message_id(self, message_id):
        """Sets the message_id of this RunStepDeltaStepDetailsMessageCreationObjectMessageCreation.

        The ID of the message that was created by this run step.

        :param message_id: The message_id of this RunStepDeltaStepDetailsMessageCreationObjectMessageCreation.
        :type message_id: str
        """

        self._message_id = message_id
