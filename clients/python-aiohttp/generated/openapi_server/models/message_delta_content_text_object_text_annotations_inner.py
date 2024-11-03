# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model import Model
from openapi_server.models.message_delta_content_text_annotations_file_citation_object import MessageDeltaContentTextAnnotationsFileCitationObject
from openapi_server.models.message_delta_content_text_annotations_file_citation_object_file_citation import MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation
from openapi_server.models.message_delta_content_text_annotations_file_path_object import MessageDeltaContentTextAnnotationsFilePathObject
from openapi_server.models.message_delta_content_text_annotations_file_path_object_file_path import MessageDeltaContentTextAnnotationsFilePathObjectFilePath
from openapi_server import util


class MessageDeltaContentTextObjectTextAnnotationsInner(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, index: int=None, type: str=None, text: str=None, file_citation: MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation=None, start_index: int=None, end_index: int=None, file_path: MessageDeltaContentTextAnnotationsFilePathObjectFilePath=None):
        """MessageDeltaContentTextObjectTextAnnotationsInner - a model defined in OpenAPI

        :param index: The index of this MessageDeltaContentTextObjectTextAnnotationsInner.
        :param type: The type of this MessageDeltaContentTextObjectTextAnnotationsInner.
        :param text: The text of this MessageDeltaContentTextObjectTextAnnotationsInner.
        :param file_citation: The file_citation of this MessageDeltaContentTextObjectTextAnnotationsInner.
        :param start_index: The start_index of this MessageDeltaContentTextObjectTextAnnotationsInner.
        :param end_index: The end_index of this MessageDeltaContentTextObjectTextAnnotationsInner.
        :param file_path: The file_path of this MessageDeltaContentTextObjectTextAnnotationsInner.
        """
        self.openapi_types = {
            'index': int,
            'type': str,
            'text': str,
            'file_citation': MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation,
            'start_index': int,
            'end_index': int,
            'file_path': MessageDeltaContentTextAnnotationsFilePathObjectFilePath
        }

        self.attribute_map = {
            'index': 'index',
            'type': 'type',
            'text': 'text',
            'file_citation': 'file_citation',
            'start_index': 'start_index',
            'end_index': 'end_index',
            'file_path': 'file_path'
        }

        self._index = index
        self._type = type
        self._text = text
        self._file_citation = file_citation
        self._start_index = start_index
        self._end_index = end_index
        self._file_path = file_path

    @classmethod
    def from_dict(cls, dikt: dict) -> 'MessageDeltaContentTextObjectTextAnnotationsInner':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The MessageDeltaContentTextObject_text_annotations_inner of this MessageDeltaContentTextObjectTextAnnotationsInner.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def index(self):
        """Gets the index of this MessageDeltaContentTextObjectTextAnnotationsInner.

        The index of the annotation in the text content part.

        :return: The index of this MessageDeltaContentTextObjectTextAnnotationsInner.
        :rtype: int
        """
        return self._index

    @index.setter
    def index(self, index):
        """Sets the index of this MessageDeltaContentTextObjectTextAnnotationsInner.

        The index of the annotation in the text content part.

        :param index: The index of this MessageDeltaContentTextObjectTextAnnotationsInner.
        :type index: int
        """
        if index is None:
            raise ValueError("Invalid value for `index`, must not be `None`")

        self._index = index

    @property
    def type(self):
        """Gets the type of this MessageDeltaContentTextObjectTextAnnotationsInner.

        Always `file_citation`.

        :return: The type of this MessageDeltaContentTextObjectTextAnnotationsInner.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """Sets the type of this MessageDeltaContentTextObjectTextAnnotationsInner.

        Always `file_citation`.

        :param type: The type of this MessageDeltaContentTextObjectTextAnnotationsInner.
        :type type: str
        """
        allowed_values = ["file_citation", "file_path"]  # noqa: E501
        if type not in allowed_values:
            raise ValueError(
                "Invalid value for `type` ({0}), must be one of {1}"
                .format(type, allowed_values)
            )

        self._type = type

    @property
    def text(self):
        """Gets the text of this MessageDeltaContentTextObjectTextAnnotationsInner.

        The text in the message content that needs to be replaced.

        :return: The text of this MessageDeltaContentTextObjectTextAnnotationsInner.
        :rtype: str
        """
        return self._text

    @text.setter
    def text(self, text):
        """Sets the text of this MessageDeltaContentTextObjectTextAnnotationsInner.

        The text in the message content that needs to be replaced.

        :param text: The text of this MessageDeltaContentTextObjectTextAnnotationsInner.
        :type text: str
        """

        self._text = text

    @property
    def file_citation(self):
        """Gets the file_citation of this MessageDeltaContentTextObjectTextAnnotationsInner.


        :return: The file_citation of this MessageDeltaContentTextObjectTextAnnotationsInner.
        :rtype: MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation
        """
        return self._file_citation

    @file_citation.setter
    def file_citation(self, file_citation):
        """Sets the file_citation of this MessageDeltaContentTextObjectTextAnnotationsInner.


        :param file_citation: The file_citation of this MessageDeltaContentTextObjectTextAnnotationsInner.
        :type file_citation: MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation
        """

        self._file_citation = file_citation

    @property
    def start_index(self):
        """Gets the start_index of this MessageDeltaContentTextObjectTextAnnotationsInner.


        :return: The start_index of this MessageDeltaContentTextObjectTextAnnotationsInner.
        :rtype: int
        """
        return self._start_index

    @start_index.setter
    def start_index(self, start_index):
        """Sets the start_index of this MessageDeltaContentTextObjectTextAnnotationsInner.


        :param start_index: The start_index of this MessageDeltaContentTextObjectTextAnnotationsInner.
        :type start_index: int
        """
        if start_index is not None and start_index < 0:
            raise ValueError("Invalid value for `start_index`, must be a value greater than or equal to `0`")

        self._start_index = start_index

    @property
    def end_index(self):
        """Gets the end_index of this MessageDeltaContentTextObjectTextAnnotationsInner.


        :return: The end_index of this MessageDeltaContentTextObjectTextAnnotationsInner.
        :rtype: int
        """
        return self._end_index

    @end_index.setter
    def end_index(self, end_index):
        """Sets the end_index of this MessageDeltaContentTextObjectTextAnnotationsInner.


        :param end_index: The end_index of this MessageDeltaContentTextObjectTextAnnotationsInner.
        :type end_index: int
        """
        if end_index is not None and end_index < 0:
            raise ValueError("Invalid value for `end_index`, must be a value greater than or equal to `0`")

        self._end_index = end_index

    @property
    def file_path(self):
        """Gets the file_path of this MessageDeltaContentTextObjectTextAnnotationsInner.


        :return: The file_path of this MessageDeltaContentTextObjectTextAnnotationsInner.
        :rtype: MessageDeltaContentTextAnnotationsFilePathObjectFilePath
        """
        return self._file_path

    @file_path.setter
    def file_path(self, file_path):
        """Sets the file_path of this MessageDeltaContentTextObjectTextAnnotationsInner.


        :param file_path: The file_path of this MessageDeltaContentTextObjectTextAnnotationsInner.
        :type file_path: MessageDeltaContentTextAnnotationsFilePathObjectFilePath
        """

        self._file_path = file_path
