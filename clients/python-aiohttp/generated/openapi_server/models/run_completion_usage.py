# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model import Model
from openapi_server import util


class RunCompletionUsage(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, completion_tokens: int=None, prompt_tokens: int=None, total_tokens: int=None):
        """RunCompletionUsage - a model defined in OpenAPI

        :param completion_tokens: The completion_tokens of this RunCompletionUsage.
        :param prompt_tokens: The prompt_tokens of this RunCompletionUsage.
        :param total_tokens: The total_tokens of this RunCompletionUsage.
        """
        self.openapi_types = {
            'completion_tokens': int,
            'prompt_tokens': int,
            'total_tokens': int
        }

        self.attribute_map = {
            'completion_tokens': 'completion_tokens',
            'prompt_tokens': 'prompt_tokens',
            'total_tokens': 'total_tokens'
        }

        self._completion_tokens = completion_tokens
        self._prompt_tokens = prompt_tokens
        self._total_tokens = total_tokens

    @classmethod
    def from_dict(cls, dikt: dict) -> 'RunCompletionUsage':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The RunCompletionUsage of this RunCompletionUsage.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def completion_tokens(self):
        """Gets the completion_tokens of this RunCompletionUsage.

        Number of completion tokens used over the course of the run.

        :return: The completion_tokens of this RunCompletionUsage.
        :rtype: int
        """
        return self._completion_tokens

    @completion_tokens.setter
    def completion_tokens(self, completion_tokens):
        """Sets the completion_tokens of this RunCompletionUsage.

        Number of completion tokens used over the course of the run.

        :param completion_tokens: The completion_tokens of this RunCompletionUsage.
        :type completion_tokens: int
        """
        if completion_tokens is None:
            raise ValueError("Invalid value for `completion_tokens`, must not be `None`")

        self._completion_tokens = completion_tokens

    @property
    def prompt_tokens(self):
        """Gets the prompt_tokens of this RunCompletionUsage.

        Number of prompt tokens used over the course of the run.

        :return: The prompt_tokens of this RunCompletionUsage.
        :rtype: int
        """
        return self._prompt_tokens

    @prompt_tokens.setter
    def prompt_tokens(self, prompt_tokens):
        """Sets the prompt_tokens of this RunCompletionUsage.

        Number of prompt tokens used over the course of the run.

        :param prompt_tokens: The prompt_tokens of this RunCompletionUsage.
        :type prompt_tokens: int
        """
        if prompt_tokens is None:
            raise ValueError("Invalid value for `prompt_tokens`, must not be `None`")

        self._prompt_tokens = prompt_tokens

    @property
    def total_tokens(self):
        """Gets the total_tokens of this RunCompletionUsage.

        Total number of tokens used (prompt + completion).

        :return: The total_tokens of this RunCompletionUsage.
        :rtype: int
        """
        return self._total_tokens

    @total_tokens.setter
    def total_tokens(self, total_tokens):
        """Sets the total_tokens of this RunCompletionUsage.

        Total number of tokens used (prompt + completion).

        :param total_tokens: The total_tokens of this RunCompletionUsage.
        :type total_tokens: int
        """
        if total_tokens is None:
            raise ValueError("Invalid value for `total_tokens`, must not be `None`")

        self._total_tokens = total_tokens
