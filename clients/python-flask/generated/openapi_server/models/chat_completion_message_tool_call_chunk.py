from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.chat_completion_message_tool_call_chunk_function import ChatCompletionMessageToolCallChunkFunction
from openapi_server import util

from openapi_server.models.chat_completion_message_tool_call_chunk_function import ChatCompletionMessageToolCallChunkFunction  # noqa: E501

class ChatCompletionMessageToolCallChunk(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, index=None, id=None, type=None, function=None):  # noqa: E501
        """ChatCompletionMessageToolCallChunk - a model defined in OpenAPI

        :param index: The index of this ChatCompletionMessageToolCallChunk.  # noqa: E501
        :type index: int
        :param id: The id of this ChatCompletionMessageToolCallChunk.  # noqa: E501
        :type id: str
        :param type: The type of this ChatCompletionMessageToolCallChunk.  # noqa: E501
        :type type: str
        :param function: The function of this ChatCompletionMessageToolCallChunk.  # noqa: E501
        :type function: ChatCompletionMessageToolCallChunkFunction
        """
        self.openapi_types = {
            'index': int,
            'id': str,
            'type': str,
            'function': ChatCompletionMessageToolCallChunkFunction
        }

        self.attribute_map = {
            'index': 'index',
            'id': 'id',
            'type': 'type',
            'function': 'function'
        }

        self._index = index
        self._id = id
        self._type = type
        self._function = function

    @classmethod
    def from_dict(cls, dikt) -> 'ChatCompletionMessageToolCallChunk':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ChatCompletionMessageToolCallChunk of this ChatCompletionMessageToolCallChunk.  # noqa: E501
        :rtype: ChatCompletionMessageToolCallChunk
        """
        return util.deserialize_model(dikt, cls)

    @property
    def index(self) -> int:
        """Gets the index of this ChatCompletionMessageToolCallChunk.


        :return: The index of this ChatCompletionMessageToolCallChunk.
        :rtype: int
        """
        return self._index

    @index.setter
    def index(self, index: int):
        """Sets the index of this ChatCompletionMessageToolCallChunk.


        :param index: The index of this ChatCompletionMessageToolCallChunk.
        :type index: int
        """
        if index is None:
            raise ValueError("Invalid value for `index`, must not be `None`")  # noqa: E501

        self._index = index

    @property
    def id(self) -> str:
        """Gets the id of this ChatCompletionMessageToolCallChunk.

        The ID of the tool call.  # noqa: E501

        :return: The id of this ChatCompletionMessageToolCallChunk.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this ChatCompletionMessageToolCallChunk.

        The ID of the tool call.  # noqa: E501

        :param id: The id of this ChatCompletionMessageToolCallChunk.
        :type id: str
        """

        self._id = id

    @property
    def type(self) -> str:
        """Gets the type of this ChatCompletionMessageToolCallChunk.

        The type of the tool. Currently, only `function` is supported.  # noqa: E501

        :return: The type of this ChatCompletionMessageToolCallChunk.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this ChatCompletionMessageToolCallChunk.

        The type of the tool. Currently, only `function` is supported.  # noqa: E501

        :param type: The type of this ChatCompletionMessageToolCallChunk.
        :type type: str
        """
        allowed_values = ["function"]  # noqa: E501
        if type not in allowed_values:
            raise ValueError(
                "Invalid value for `type` ({0}), must be one of {1}"
                .format(type, allowed_values)
            )

        self._type = type

    @property
    def function(self) -> ChatCompletionMessageToolCallChunkFunction:
        """Gets the function of this ChatCompletionMessageToolCallChunk.


        :return: The function of this ChatCompletionMessageToolCallChunk.
        :rtype: ChatCompletionMessageToolCallChunkFunction
        """
        return self._function

    @function.setter
    def function(self, function: ChatCompletionMessageToolCallChunkFunction):
        """Sets the function of this ChatCompletionMessageToolCallChunk.


        :param function: The function of this ChatCompletionMessageToolCallChunk.
        :type function: ChatCompletionMessageToolCallChunkFunction
        """

        self._function = function
