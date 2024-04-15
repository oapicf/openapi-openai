# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model import Model
from openapi_server import util


class RunStepDeltaStepDetailsToolCallsRetrievalObject(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, index: int=None, id: str=None, type: str=None, retrieval: object=None):
        """RunStepDeltaStepDetailsToolCallsRetrievalObject - a model defined in OpenAPI

        :param index: The index of this RunStepDeltaStepDetailsToolCallsRetrievalObject.
        :param id: The id of this RunStepDeltaStepDetailsToolCallsRetrievalObject.
        :param type: The type of this RunStepDeltaStepDetailsToolCallsRetrievalObject.
        :param retrieval: The retrieval of this RunStepDeltaStepDetailsToolCallsRetrievalObject.
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
    def from_dict(cls, dikt: dict) -> 'RunStepDeltaStepDetailsToolCallsRetrievalObject':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The RunStepDeltaStepDetailsToolCallsRetrievalObject of this RunStepDeltaStepDetailsToolCallsRetrievalObject.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def index(self):
        """Gets the index of this RunStepDeltaStepDetailsToolCallsRetrievalObject.

        The index of the tool call in the tool calls array.

        :return: The index of this RunStepDeltaStepDetailsToolCallsRetrievalObject.
        :rtype: int
        """
        return self._index

    @index.setter
    def index(self, index):
        """Sets the index of this RunStepDeltaStepDetailsToolCallsRetrievalObject.

        The index of the tool call in the tool calls array.

        :param index: The index of this RunStepDeltaStepDetailsToolCallsRetrievalObject.
        :type index: int
        """
        if index is None:
            raise ValueError("Invalid value for `index`, must not be `None`")

        self._index = index

    @property
    def id(self):
        """Gets the id of this RunStepDeltaStepDetailsToolCallsRetrievalObject.

        The ID of the tool call object.

        :return: The id of this RunStepDeltaStepDetailsToolCallsRetrievalObject.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this RunStepDeltaStepDetailsToolCallsRetrievalObject.

        The ID of the tool call object.

        :param id: The id of this RunStepDeltaStepDetailsToolCallsRetrievalObject.
        :type id: str
        """

        self._id = id

    @property
    def type(self):
        """Gets the type of this RunStepDeltaStepDetailsToolCallsRetrievalObject.

        The type of tool call. This is always going to be `retrieval` for this type of tool call.

        :return: The type of this RunStepDeltaStepDetailsToolCallsRetrievalObject.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """Sets the type of this RunStepDeltaStepDetailsToolCallsRetrievalObject.

        The type of tool call. This is always going to be `retrieval` for this type of tool call.

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
    def retrieval(self):
        """Gets the retrieval of this RunStepDeltaStepDetailsToolCallsRetrievalObject.

        For now, this is always going to be an empty object.

        :return: The retrieval of this RunStepDeltaStepDetailsToolCallsRetrievalObject.
        :rtype: object
        """
        return self._retrieval

    @retrieval.setter
    def retrieval(self, retrieval):
        """Sets the retrieval of this RunStepDeltaStepDetailsToolCallsRetrievalObject.

        For now, this is always going to be an empty object.

        :param retrieval: The retrieval of this RunStepDeltaStepDetailsToolCallsRetrievalObject.
        :type retrieval: object
        """

        self._retrieval = retrieval