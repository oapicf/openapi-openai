# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.openapi_server.models.base_model import Model
from openapi_server import util


class MessageContentImageFileObjectImageFile(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, file_id: str=None):  # noqa: E501
        """MessageContentImageFileObjectImageFile - a model defined in Swagger

        :param file_id: The file_id of this MessageContentImageFileObjectImageFile.  # noqa: E501
        :type file_id: str
        """
        self.swagger_types = {
            'file_id': str
        }

        self.attribute_map = {
            'file_id': 'file_id'
        }

        self._file_id = file_id

    @classmethod
    def from_dict(cls, dikt) -> 'MessageContentImageFileObjectImageFile':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The MessageContentImageFileObject_image_file of this MessageContentImageFileObjectImageFile.  # noqa: E501
        :rtype: MessageContentImageFileObjectImageFile
        """
        return util.deserialize_model(dikt, cls)

    @property
    def file_id(self) -> str:
        """Gets the file_id of this MessageContentImageFileObjectImageFile.

        The [File](/docs/api-reference/files) ID of the image in the message content.  # noqa: E501

        :return: The file_id of this MessageContentImageFileObjectImageFile.
        :rtype: str
        """
        return self._file_id

    @file_id.setter
    def file_id(self, file_id: str):
        """Sets the file_id of this MessageContentImageFileObjectImageFile.

        The [File](/docs/api-reference/files) ID of the image in the message content.  # noqa: E501

        :param file_id: The file_id of this MessageContentImageFileObjectImageFile.
        :type file_id: str
        """
        if file_id is None:
            raise ValueError("Invalid value for `file_id`, must not be `None`")  # noqa: E501

        self._file_id = file_id
