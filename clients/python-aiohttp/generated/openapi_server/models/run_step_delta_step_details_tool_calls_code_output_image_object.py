# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model import Model
from openapi_server.models.run_step_delta_step_details_tool_calls_code_output_image_object_image import RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage
from openapi_server import util


class RunStepDeltaStepDetailsToolCallsCodeOutputImageObject(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, index: int=None, type: str=None, image: RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage=None):
        """RunStepDeltaStepDetailsToolCallsCodeOutputImageObject - a model defined in OpenAPI

        :param index: The index of this RunStepDeltaStepDetailsToolCallsCodeOutputImageObject.
        :param type: The type of this RunStepDeltaStepDetailsToolCallsCodeOutputImageObject.
        :param image: The image of this RunStepDeltaStepDetailsToolCallsCodeOutputImageObject.
        """
        self.openapi_types = {
            'index': int,
            'type': str,
            'image': RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage
        }

        self.attribute_map = {
            'index': 'index',
            'type': 'type',
            'image': 'image'
        }

        self._index = index
        self._type = type
        self._image = image

    @classmethod
    def from_dict(cls, dikt: dict) -> 'RunStepDeltaStepDetailsToolCallsCodeOutputImageObject':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The RunStepDeltaStepDetailsToolCallsCodeOutputImageObject of this RunStepDeltaStepDetailsToolCallsCodeOutputImageObject.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def index(self):
        """Gets the index of this RunStepDeltaStepDetailsToolCallsCodeOutputImageObject.

        The index of the output in the outputs array.

        :return: The index of this RunStepDeltaStepDetailsToolCallsCodeOutputImageObject.
        :rtype: int
        """
        return self._index

    @index.setter
    def index(self, index):
        """Sets the index of this RunStepDeltaStepDetailsToolCallsCodeOutputImageObject.

        The index of the output in the outputs array.

        :param index: The index of this RunStepDeltaStepDetailsToolCallsCodeOutputImageObject.
        :type index: int
        """
        if index is None:
            raise ValueError("Invalid value for `index`, must not be `None`")

        self._index = index

    @property
    def type(self):
        """Gets the type of this RunStepDeltaStepDetailsToolCallsCodeOutputImageObject.

        Always `image`.

        :return: The type of this RunStepDeltaStepDetailsToolCallsCodeOutputImageObject.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """Sets the type of this RunStepDeltaStepDetailsToolCallsCodeOutputImageObject.

        Always `image`.

        :param type: The type of this RunStepDeltaStepDetailsToolCallsCodeOutputImageObject.
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
    def image(self):
        """Gets the image of this RunStepDeltaStepDetailsToolCallsCodeOutputImageObject.


        :return: The image of this RunStepDeltaStepDetailsToolCallsCodeOutputImageObject.
        :rtype: RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage
        """
        return self._image

    @image.setter
    def image(self, image):
        """Sets the image of this RunStepDeltaStepDetailsToolCallsCodeOutputImageObject.


        :param image: The image of this RunStepDeltaStepDetailsToolCallsCodeOutputImageObject.
        :type image: RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage
        """

        self._image = image