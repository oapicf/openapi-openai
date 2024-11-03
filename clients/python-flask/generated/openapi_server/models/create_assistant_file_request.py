from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class CreateAssistantFileRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, file_id=None):  # noqa: E501
        """CreateAssistantFileRequest - a model defined in OpenAPI

        :param file_id: The file_id of this CreateAssistantFileRequest.  # noqa: E501
        :type file_id: str
        """
        self.openapi_types = {
            'file_id': str
        }

        self.attribute_map = {
            'file_id': 'file_id'
        }

        self._file_id = file_id

    @classmethod
    def from_dict(cls, dikt) -> 'CreateAssistantFileRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The CreateAssistantFileRequest of this CreateAssistantFileRequest.  # noqa: E501
        :rtype: CreateAssistantFileRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def file_id(self) -> str:
        """Gets the file_id of this CreateAssistantFileRequest.

        A [File](/docs/api-reference/files) ID (with `purpose=\"assistants\"`) that the assistant should use. Useful for tools like `retrieval` and `code_interpreter` that can access files.  # noqa: E501

        :return: The file_id of this CreateAssistantFileRequest.
        :rtype: str
        """
        return self._file_id

    @file_id.setter
    def file_id(self, file_id: str):
        """Sets the file_id of this CreateAssistantFileRequest.

        A [File](/docs/api-reference/files) ID (with `purpose=\"assistants\"`) that the assistant should use. Useful for tools like `retrieval` and `code_interpreter` that can access files.  # noqa: E501

        :param file_id: The file_id of this CreateAssistantFileRequest.
        :type file_id: str
        """
        if file_id is None:
            raise ValueError("Invalid value for `file_id`, must not be `None`")  # noqa: E501

        self._file_id = file_id
