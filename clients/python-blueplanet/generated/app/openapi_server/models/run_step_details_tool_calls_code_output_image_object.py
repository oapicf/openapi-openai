# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.openapi_server.models.base_model import Model
from app.openapi_server.models.run_step_details_tool_calls_code_output_image_object_image import RunStepDetailsToolCallsCodeOutputImageObjectImage  # noqa: F401,E501
from openapi_server import util


class RunStepDetailsToolCallsCodeOutputImageObject(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, type: str=None, image: RunStepDetailsToolCallsCodeOutputImageObjectImage=None):  # noqa: E501
        """RunStepDetailsToolCallsCodeOutputImageObject - a model defined in Swagger

        :param type: The type of this RunStepDetailsToolCallsCodeOutputImageObject.  # noqa: E501
        :type type: str
        :param image: The image of this RunStepDetailsToolCallsCodeOutputImageObject.  # noqa: E501
        :type image: RunStepDetailsToolCallsCodeOutputImageObjectImage
        """
        self.swagger_types = {
            'type': str,
            'image': RunStepDetailsToolCallsCodeOutputImageObjectImage
        }

        self.attribute_map = {
            'type': 'type',
            'image': 'image'
        }

        self._type = type
        self._image = image

    @classmethod
    def from_dict(cls, dikt) -> 'RunStepDetailsToolCallsCodeOutputImageObject':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The RunStepDetailsToolCallsCodeOutputImageObject of this RunStepDetailsToolCallsCodeOutputImageObject.  # noqa: E501
        :rtype: RunStepDetailsToolCallsCodeOutputImageObject
        """
        return util.deserialize_model(dikt, cls)

    @property
    def type(self) -> str:
        """Gets the type of this RunStepDetailsToolCallsCodeOutputImageObject.

        Always `image`.  # noqa: E501

        :return: The type of this RunStepDetailsToolCallsCodeOutputImageObject.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this RunStepDetailsToolCallsCodeOutputImageObject.

        Always `image`.  # noqa: E501

        :param type: The type of this RunStepDetailsToolCallsCodeOutputImageObject.
        :type type: str
        """
        allowed_values = ["image"]  # noqa: E501
        if type not in allowed_values:
            raise ValueError(
                "Invalid value for `type` ({0}), must be one of {1}"
                .format(type, allowed_values)
            )

        self._type = type

    @property
    def image(self) -> RunStepDetailsToolCallsCodeOutputImageObjectImage:
        """Gets the image of this RunStepDetailsToolCallsCodeOutputImageObject.


        :return: The image of this RunStepDetailsToolCallsCodeOutputImageObject.
        :rtype: RunStepDetailsToolCallsCodeOutputImageObjectImage
        """
        return self._image

    @image.setter
    def image(self, image: RunStepDetailsToolCallsCodeOutputImageObjectImage):
        """Sets the image of this RunStepDetailsToolCallsCodeOutputImageObject.


        :param image: The image of this RunStepDetailsToolCallsCodeOutputImageObject.
        :type image: RunStepDetailsToolCallsCodeOutputImageObjectImage
        """
        if image is None:
            raise ValueError("Invalid value for `image`, must not be `None`")  # noqa: E501

        self._image = image
