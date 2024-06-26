from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class RunStepDeltaStepDetailsToolCallsRetrievalObject(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, index=None, id=None, type=None, retrieval=None):  # noqa: E501
        """RunStepDeltaStepDetailsToolCallsRetrievalObject - a model defined in OpenAPI

        :param index: The index of this RunStepDeltaStepDetailsToolCallsRetrievalObject.  # noqa: E501
        :type index: int
        :param id: The id of this RunStepDeltaStepDetailsToolCallsRetrievalObject.  # noqa: E501
        :type id: str
        :param type: The type of this RunStepDeltaStepDetailsToolCallsRetrievalObject.  # noqa: E501
        :type type: str
        :param retrieval: The retrieval of this RunStepDeltaStepDetailsToolCallsRetrievalObject.  # noqa: E501
        :type retrieval: object
        """
        self.openapi_types = {
            'index': int,
            'id': str,
            'type': str,
            'retrieval': object
        }

        self.attribute_map = {
            'index': 'index',
            'id': 'id',
            'type': 'type',
            'retrieval': 'retrieval'
        }

        self._index = index
        self._id = id
        self._type = type
        self._retrieval = retrieval

    @classmethod
    def from_dict(cls, dikt) -> 'RunStepDeltaStepDetailsToolCallsRetrievalObject':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The RunStepDeltaStepDetailsToolCallsRetrievalObject of this RunStepDeltaStepDetailsToolCallsRetrievalObject.  # noqa: E501
        :rtype: RunStepDeltaStepDetailsToolCallsRetrievalObject
        """
        return util.deserialize_model(dikt, cls)

    @property
    def index(self) -> int:
        """Gets the index of this RunStepDeltaStepDetailsToolCallsRetrievalObject.

        The index of the tool call in the tool calls array.  # noqa: E501

        :return: The index of this RunStepDeltaStepDetailsToolCallsRetrievalObject.
        :rtype: int
        """
        return self._index

    @index.setter
    def index(self, index: int):
        """Sets the index of this RunStepDeltaStepDetailsToolCallsRetrievalObject.

        The index of the tool call in the tool calls array.  # noqa: E501

        :param index: The index of this RunStepDeltaStepDetailsToolCallsRetrievalObject.
        :type index: int
        """
        if index is None:
            raise ValueError("Invalid value for `index`, must not be `None`")  # noqa: E501

        self._index = index

    @property
    def id(self) -> str:
        """Gets the id of this RunStepDeltaStepDetailsToolCallsRetrievalObject.

        The ID of the tool call object.  # noqa: E501

        :return: The id of this RunStepDeltaStepDetailsToolCallsRetrievalObject.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this RunStepDeltaStepDetailsToolCallsRetrievalObject.

        The ID of the tool call object.  # noqa: E501

        :param id: The id of this RunStepDeltaStepDetailsToolCallsRetrievalObject.
        :type id: str
        """

        self._id = id

    @property
    def type(self) -> str:
        """Gets the type of this RunStepDeltaStepDetailsToolCallsRetrievalObject.

        The type of tool call. This is always going to be `retrieval` for this type of tool call.  # noqa: E501

        :return: The type of this RunStepDeltaStepDetailsToolCallsRetrievalObject.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this RunStepDeltaStepDetailsToolCallsRetrievalObject.

        The type of tool call. This is always going to be `retrieval` for this type of tool call.  # noqa: E501

        :param type: The type of this RunStepDeltaStepDetailsToolCallsRetrievalObject.
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
        """Gets the retrieval of this RunStepDeltaStepDetailsToolCallsRetrievalObject.

        For now, this is always going to be an empty object.  # noqa: E501

        :return: The retrieval of this RunStepDeltaStepDetailsToolCallsRetrievalObject.
        :rtype: object
        """
        return self._retrieval

    @retrieval.setter
    def retrieval(self, retrieval: object):
        """Sets the retrieval of this RunStepDeltaStepDetailsToolCallsRetrievalObject.

        For now, this is always going to be an empty object.  # noqa: E501

        :param retrieval: The retrieval of this RunStepDeltaStepDetailsToolCallsRetrievalObject.
        :type retrieval: object
        """

        self._retrieval = retrieval
