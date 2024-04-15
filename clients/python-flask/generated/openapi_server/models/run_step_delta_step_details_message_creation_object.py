from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.run_step_delta_step_details_message_creation_object_message_creation import RunStepDeltaStepDetailsMessageCreationObjectMessageCreation
from openapi_server import util

from openapi_server.models.run_step_delta_step_details_message_creation_object_message_creation import RunStepDeltaStepDetailsMessageCreationObjectMessageCreation  # noqa: E501

class RunStepDeltaStepDetailsMessageCreationObject(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, type=None, message_creation=None):  # noqa: E501
        """RunStepDeltaStepDetailsMessageCreationObject - a model defined in OpenAPI

        :param type: The type of this RunStepDeltaStepDetailsMessageCreationObject.  # noqa: E501
        :type type: str
        :param message_creation: The message_creation of this RunStepDeltaStepDetailsMessageCreationObject.  # noqa: E501
        :type message_creation: RunStepDeltaStepDetailsMessageCreationObjectMessageCreation
        """
        self.openapi_types = {
            'type': str,
            'message_creation': RunStepDeltaStepDetailsMessageCreationObjectMessageCreation
        }

        self.attribute_map = {
            'type': 'type',
            'message_creation': 'message_creation'
        }

        self._type = type
        self._message_creation = message_creation

    @classmethod
    def from_dict(cls, dikt) -> 'RunStepDeltaStepDetailsMessageCreationObject':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The RunStepDeltaStepDetailsMessageCreationObject of this RunStepDeltaStepDetailsMessageCreationObject.  # noqa: E501
        :rtype: RunStepDeltaStepDetailsMessageCreationObject
        """
        return util.deserialize_model(dikt, cls)

    @property
    def type(self) -> str:
        """Gets the type of this RunStepDeltaStepDetailsMessageCreationObject.

        Always `message_creation`.  # noqa: E501

        :return: The type of this RunStepDeltaStepDetailsMessageCreationObject.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this RunStepDeltaStepDetailsMessageCreationObject.

        Always `message_creation`.  # noqa: E501

        :param type: The type of this RunStepDeltaStepDetailsMessageCreationObject.
        :type type: str
        """
        allowed_values = ["message_creation"]  # noqa: E501
        if type not in allowed_values:
            raise ValueError(
                "Invalid value for `type` ({0}), must be one of {1}"
                .format(type, allowed_values)
            )

        self._type = type

    @property
    def message_creation(self) -> RunStepDeltaStepDetailsMessageCreationObjectMessageCreation:
        """Gets the message_creation of this RunStepDeltaStepDetailsMessageCreationObject.


        :return: The message_creation of this RunStepDeltaStepDetailsMessageCreationObject.
        :rtype: RunStepDeltaStepDetailsMessageCreationObjectMessageCreation
        """
        return self._message_creation

    @message_creation.setter
    def message_creation(self, message_creation: RunStepDeltaStepDetailsMessageCreationObjectMessageCreation):
        """Sets the message_creation of this RunStepDeltaStepDetailsMessageCreationObject.


        :param message_creation: The message_creation of this RunStepDeltaStepDetailsMessageCreationObject.
        :type message_creation: RunStepDeltaStepDetailsMessageCreationObjectMessageCreation
        """

        self._message_creation = message_creation