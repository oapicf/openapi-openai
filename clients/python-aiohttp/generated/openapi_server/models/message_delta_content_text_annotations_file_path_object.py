# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model import Model
from openapi_server.models.message_delta_content_text_annotations_file_path_object_file_path import MessageDeltaContentTextAnnotationsFilePathObjectFilePath
from openapi_server import util


class MessageDeltaContentTextAnnotationsFilePathObject(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, index: int=None, type: str=None, text: str=None, file_path: MessageDeltaContentTextAnnotationsFilePathObjectFilePath=None, start_index: int=None, end_index: int=None):
        """MessageDeltaContentTextAnnotationsFilePathObject - a model defined in OpenAPI

        :param index: The index of this MessageDeltaContentTextAnnotationsFilePathObject.
        :param type: The type of this MessageDeltaContentTextAnnotationsFilePathObject.
        :param text: The text of this MessageDeltaContentTextAnnotationsFilePathObject.
        :param file_path: The file_path of this MessageDeltaContentTextAnnotationsFilePathObject.
        :param start_index: The start_index of this MessageDeltaContentTextAnnotationsFilePathObject.
        :param end_index: The end_index of this MessageDeltaContentTextAnnotationsFilePathObject.
        """
        self.openapi_types = {
            'index': int,
            'type': str,
            'text': str,
            'file_path': MessageDeltaContentTextAnnotationsFilePathObjectFilePath,
            'start_index': int,
            'end_index': int
        }

        self.attribute_map = {
            'index': 'index',
            'type': 'type',
            'text': 'text',
            'file_path': 'file_path',
            'start_index': 'start_index',
            'end_index': 'end_index'
        }

        self._index = index
        self._type = type
        self._text = text
        self._file_path = file_path
        self._start_index = start_index
        self._end_index = end_index

    @classmethod
    def from_dict(cls, dikt: dict) -> 'MessageDeltaContentTextAnnotationsFilePathObject':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The MessageDeltaContentTextAnnotationsFilePathObject of this MessageDeltaContentTextAnnotationsFilePathObject.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def index(self):
        """Gets the index of this MessageDeltaContentTextAnnotationsFilePathObject.

        The index of the annotation in the text content part.

        :return: The index of this MessageDeltaContentTextAnnotationsFilePathObject.
        :rtype: int
        """
        return self._index

    @index.setter
    def index(self, index):
        """Sets the index of this MessageDeltaContentTextAnnotationsFilePathObject.

        The index of the annotation in the text content part.

        :param index: The index of this MessageDeltaContentTextAnnotationsFilePathObject.
        :type index: int
        """
        if index is None:
            raise ValueError("Invalid value for `index`, must not be `None`")

        self._index = index

    @property
    def type(self):
        """Gets the type of this MessageDeltaContentTextAnnotationsFilePathObject.

        Always `file_path`.

        :return: The type of this MessageDeltaContentTextAnnotationsFilePathObject.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """Sets the type of this MessageDeltaContentTextAnnotationsFilePathObject.

        Always `file_path`.

        :param type: The type of this MessageDeltaContentTextAnnotationsFilePathObject.
        :type type: str
        """
        allowed_values = ["file_path"]  # noqa: E501
        if type not in allowed_values:
            raise ValueError(
                "Invalid value for `type` ({0}), must be one of {1}"
                .format(type, allowed_values)
            )

        self._type = type

    @property
    def text(self):
        """Gets the text of this MessageDeltaContentTextAnnotationsFilePathObject.

        The text in the message content that needs to be replaced.

        :return: The text of this MessageDeltaContentTextAnnotationsFilePathObject.
        :rtype: str
        """
        return self._text

    @text.setter
    def text(self, text):
        """Sets the text of this MessageDeltaContentTextAnnotationsFilePathObject.

        The text in the message content that needs to be replaced.

        :param text: The text of this MessageDeltaContentTextAnnotationsFilePathObject.
        :type text: str
        """

        self._text = text

    @property
    def file_path(self):
        """Gets the file_path of this MessageDeltaContentTextAnnotationsFilePathObject.


        :return: The file_path of this MessageDeltaContentTextAnnotationsFilePathObject.
        :rtype: MessageDeltaContentTextAnnotationsFilePathObjectFilePath
        """
        return self._file_path

    @file_path.setter
    def file_path(self, file_path):
        """Sets the file_path of this MessageDeltaContentTextAnnotationsFilePathObject.


        :param file_path: The file_path of this MessageDeltaContentTextAnnotationsFilePathObject.
        :type file_path: MessageDeltaContentTextAnnotationsFilePathObjectFilePath
        """

        self._file_path = file_path

    @property
    def start_index(self):
        """Gets the start_index of this MessageDeltaContentTextAnnotationsFilePathObject.


        :return: The start_index of this MessageDeltaContentTextAnnotationsFilePathObject.
        :rtype: int
        """
        return self._start_index

    @start_index.setter
    def start_index(self, start_index):
        """Sets the start_index of this MessageDeltaContentTextAnnotationsFilePathObject.


        :param start_index: The start_index of this MessageDeltaContentTextAnnotationsFilePathObject.
        :type start_index: int
        """
        if start_index is not None and start_index < 0:
            raise ValueError("Invalid value for `start_index`, must be a value greater than or equal to `0`")

        self._start_index = start_index

    @property
    def end_index(self):
        """Gets the end_index of this MessageDeltaContentTextAnnotationsFilePathObject.


        :return: The end_index of this MessageDeltaContentTextAnnotationsFilePathObject.
        :rtype: int
        """
        return self._end_index

    @end_index.setter
    def end_index(self, end_index):
        """Sets the end_index of this MessageDeltaContentTextAnnotationsFilePathObject.


        :param end_index: The end_index of this MessageDeltaContentTextAnnotationsFilePathObject.
        :type end_index: int
        """
        if end_index is not None and end_index < 0:
            raise ValueError("Invalid value for `end_index`, must be a value greater than or equal to `0`")

        self._end_index = end_index