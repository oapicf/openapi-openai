from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.message_content_text_object_text_annotations_inner import MessageContentTextObjectTextAnnotationsInner
from openapi_server import util

from openapi_server.models.message_content_text_object_text_annotations_inner import MessageContentTextObjectTextAnnotationsInner  # noqa: E501

class MessageContentTextObjectText(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, value=None, annotations=None):  # noqa: E501
        """MessageContentTextObjectText - a model defined in OpenAPI

        :param value: The value of this MessageContentTextObjectText.  # noqa: E501
        :type value: str
        :param annotations: The annotations of this MessageContentTextObjectText.  # noqa: E501
        :type annotations: List[MessageContentTextObjectTextAnnotationsInner]
        """
        self.openapi_types = {
            'value': str,
            'annotations': List[MessageContentTextObjectTextAnnotationsInner]
        }

        self.attribute_map = {
            'value': 'value',
            'annotations': 'annotations'
        }

        self._value = value
        self._annotations = annotations

    @classmethod
    def from_dict(cls, dikt) -> 'MessageContentTextObjectText':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The MessageContentTextObject_text of this MessageContentTextObjectText.  # noqa: E501
        :rtype: MessageContentTextObjectText
        """
        return util.deserialize_model(dikt, cls)

    @property
    def value(self) -> str:
        """Gets the value of this MessageContentTextObjectText.

        The data that makes up the text.  # noqa: E501

        :return: The value of this MessageContentTextObjectText.
        :rtype: str
        """
        return self._value

    @value.setter
    def value(self, value: str):
        """Sets the value of this MessageContentTextObjectText.

        The data that makes up the text.  # noqa: E501

        :param value: The value of this MessageContentTextObjectText.
        :type value: str
        """
        if value is None:
            raise ValueError("Invalid value for `value`, must not be `None`")  # noqa: E501

        self._value = value

    @property
    def annotations(self) -> List[MessageContentTextObjectTextAnnotationsInner]:
        """Gets the annotations of this MessageContentTextObjectText.


        :return: The annotations of this MessageContentTextObjectText.
        :rtype: List[MessageContentTextObjectTextAnnotationsInner]
        """
        return self._annotations

    @annotations.setter
    def annotations(self, annotations: List[MessageContentTextObjectTextAnnotationsInner]):
        """Sets the annotations of this MessageContentTextObjectText.


        :param annotations: The annotations of this MessageContentTextObjectText.
        :type annotations: List[MessageContentTextObjectTextAnnotationsInner]
        """
        if annotations is None:
            raise ValueError("Invalid value for `annotations`, must not be `None`")  # noqa: E501

        self._annotations = annotations
