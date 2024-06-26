from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class RunStepDetailsToolCallsRetrievalObject(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, id=None, type=None, retrieval=None):  # noqa: E501
        """RunStepDetailsToolCallsRetrievalObject - a model defined in OpenAPI

        :param id: The id of this RunStepDetailsToolCallsRetrievalObject.  # noqa: E501
        :type id: str
        :param type: The type of this RunStepDetailsToolCallsRetrievalObject.  # noqa: E501
        :type type: str
        :param retrieval: The retrieval of this RunStepDetailsToolCallsRetrievalObject.  # noqa: E501
        :type retrieval: object
        """
        self.openapi_types = {
            'id': str,
            'type': str,
            'retrieval': object
        }

        self.attribute_map = {
            'id': 'id',
            'type': 'type',
            'retrieval': 'retrieval'
        }

        self._id = id
        self._type = type
        self._retrieval = retrieval

    @classmethod
    def from_dict(cls, dikt) -> 'RunStepDetailsToolCallsRetrievalObject':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The RunStepDetailsToolCallsRetrievalObject of this RunStepDetailsToolCallsRetrievalObject.  # noqa: E501
        :rtype: RunStepDetailsToolCallsRetrievalObject
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self) -> str:
        """Gets the id of this RunStepDetailsToolCallsRetrievalObject.

        The ID of the tool call object.  # noqa: E501

        :return: The id of this RunStepDetailsToolCallsRetrievalObject.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this RunStepDetailsToolCallsRetrievalObject.

        The ID of the tool call object.  # noqa: E501

        :param id: The id of this RunStepDetailsToolCallsRetrievalObject.
        :type id: str
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")  # noqa: E501

        self._id = id

    @property
    def type(self) -> str:
        """Gets the type of this RunStepDetailsToolCallsRetrievalObject.

        The type of tool call. This is always going to be `retrieval` for this type of tool call.  # noqa: E501

        :return: The type of this RunStepDetailsToolCallsRetrievalObject.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this RunStepDetailsToolCallsRetrievalObject.

        The type of tool call. This is always going to be `retrieval` for this type of tool call.  # noqa: E501

        :param type: The type of this RunStepDetailsToolCallsRetrievalObject.
        :type type: str
        """
        allowed_values = ["retrieval"]  # noqa: E501
        if type not in allowed_values:
            raise ValueError(
                "Invalid value for `type` ({0}), must be one of {1}"
                .format(type, allowed_values)
            )

        self._type = type

    @property
    def retrieval(self) -> object:
        """Gets the retrieval of this RunStepDetailsToolCallsRetrievalObject.

        For now, this is always going to be an empty object.  # noqa: E501

        :return: The retrieval of this RunStepDetailsToolCallsRetrievalObject.
        :rtype: object
        """
        return self._retrieval

    @retrieval.setter
    def retrieval(self, retrieval: object):
        """Sets the retrieval of this RunStepDetailsToolCallsRetrievalObject.

        For now, this is always going to be an empty object.  # noqa: E501

        :param retrieval: The retrieval of this RunStepDetailsToolCallsRetrievalObject.
        :type retrieval: object
        """
        if retrieval is None:
            raise ValueError("Invalid value for `retrieval`, must not be `None`")  # noqa: E501

        self._retrieval = retrieval
