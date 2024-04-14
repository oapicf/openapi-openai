# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model import Model
from openapi_server import util


class RunObjectIncompleteDetails(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, reason: str=None):
        """RunObjectIncompleteDetails - a model defined in OpenAPI

        :param reason: The reason of this RunObjectIncompleteDetails.
        """
        self.openapi_types = {
            'reason': str
        }

        self.attribute_map = {
            'reason': 'reason'
        }

        self._reason = reason

    @classmethod
    def from_dict(cls, dikt: dict) -> 'RunObjectIncompleteDetails':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The RunObject_incomplete_details of this RunObjectIncompleteDetails.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def reason(self):
        """Gets the reason of this RunObjectIncompleteDetails.

        The reason why the run is incomplete. This will point to which specific token limit was reached over the course of the run.

        :return: The reason of this RunObjectIncompleteDetails.
        :rtype: str
        """
        return self._reason

    @reason.setter
    def reason(self, reason):
        """Sets the reason of this RunObjectIncompleteDetails.

        The reason why the run is incomplete. This will point to which specific token limit was reached over the course of the run.

        :param reason: The reason of this RunObjectIncompleteDetails.
        :type reason: str
        """
        allowed_values = ["max_completion_tokens", "max_prompt_tokens"]  # noqa: E501
        if reason not in allowed_values:
            raise ValueError(
                "Invalid value for `reason` ({0}), must be one of {1}"
                .format(reason, allowed_values)
            )

        self._reason = reason
