# coding: utf-8

"""
    OpenAI API

    The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.

    The version of the OpenAPI document: 2.0.0
    Contact: blah+oapicf@cliffano.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import json
from enum import Enum
from typing_extensions import Self


class ChatCompletionRole(str, Enum):
    """
    The role of the author of a message
    """

    """
    allowed enum values
    """
    SYSTEM = 'system'
    USER = 'user'
    ASSISTANT = 'assistant'
    TOOL = 'tool'
    FUNCTION = 'function'

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of ChatCompletionRole from a JSON string"""
        return cls(json.loads(json_str))

