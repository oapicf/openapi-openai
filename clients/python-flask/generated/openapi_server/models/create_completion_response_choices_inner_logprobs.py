from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class CreateCompletionResponseChoicesInnerLogprobs(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, tokens=None, token_logprobs=None, top_logprobs=None, text_offset=None):  # noqa: E501
        """CreateCompletionResponseChoicesInnerLogprobs - a model defined in OpenAPI

        :param tokens: The tokens of this CreateCompletionResponseChoicesInnerLogprobs.  # noqa: E501
        :type tokens: List[str]
        :param token_logprobs: The token_logprobs of this CreateCompletionResponseChoicesInnerLogprobs.  # noqa: E501
        :type token_logprobs: List[float]
        :param top_logprobs: The top_logprobs of this CreateCompletionResponseChoicesInnerLogprobs.  # noqa: E501
        :type top_logprobs: List[object]
        :param text_offset: The text_offset of this CreateCompletionResponseChoicesInnerLogprobs.  # noqa: E501
        :type text_offset: List[int]
        """
        self.openapi_types = {
            'tokens': List[str],
            'token_logprobs': List[float],
            'top_logprobs': List[object],
            'text_offset': List[int]
        }

        self.attribute_map = {
            'tokens': 'tokens',
            'token_logprobs': 'token_logprobs',
            'top_logprobs': 'top_logprobs',
            'text_offset': 'text_offset'
        }

        self._tokens = tokens
        self._token_logprobs = token_logprobs
        self._top_logprobs = top_logprobs
        self._text_offset = text_offset

    @classmethod
    def from_dict(cls, dikt) -> 'CreateCompletionResponseChoicesInnerLogprobs':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The CreateCompletionResponse_choices_inner_logprobs of this CreateCompletionResponseChoicesInnerLogprobs.  # noqa: E501
        :rtype: CreateCompletionResponseChoicesInnerLogprobs
        """
        return util.deserialize_model(dikt, cls)

    @property
    def tokens(self) -> List[str]:
        """Gets the tokens of this CreateCompletionResponseChoicesInnerLogprobs.


        :return: The tokens of this CreateCompletionResponseChoicesInnerLogprobs.
        :rtype: List[str]
        """
        return self._tokens

    @tokens.setter
    def tokens(self, tokens: List[str]):
        """Sets the tokens of this CreateCompletionResponseChoicesInnerLogprobs.


        :param tokens: The tokens of this CreateCompletionResponseChoicesInnerLogprobs.
        :type tokens: List[str]
        """

        self._tokens = tokens

    @property
    def token_logprobs(self) -> List[float]:
        """Gets the token_logprobs of this CreateCompletionResponseChoicesInnerLogprobs.


        :return: The token_logprobs of this CreateCompletionResponseChoicesInnerLogprobs.
        :rtype: List[float]
        """
        return self._token_logprobs

    @token_logprobs.setter
    def token_logprobs(self, token_logprobs: List[float]):
        """Sets the token_logprobs of this CreateCompletionResponseChoicesInnerLogprobs.


        :param token_logprobs: The token_logprobs of this CreateCompletionResponseChoicesInnerLogprobs.
        :type token_logprobs: List[float]
        """

        self._token_logprobs = token_logprobs

    @property
    def top_logprobs(self) -> List[object]:
        """Gets the top_logprobs of this CreateCompletionResponseChoicesInnerLogprobs.


        :return: The top_logprobs of this CreateCompletionResponseChoicesInnerLogprobs.
        :rtype: List[object]
        """
        return self._top_logprobs

    @top_logprobs.setter
    def top_logprobs(self, top_logprobs: List[object]):
        """Sets the top_logprobs of this CreateCompletionResponseChoicesInnerLogprobs.


        :param top_logprobs: The top_logprobs of this CreateCompletionResponseChoicesInnerLogprobs.
        :type top_logprobs: List[object]
        """

        self._top_logprobs = top_logprobs

    @property
    def text_offset(self) -> List[int]:
        """Gets the text_offset of this CreateCompletionResponseChoicesInnerLogprobs.


        :return: The text_offset of this CreateCompletionResponseChoicesInnerLogprobs.
        :rtype: List[int]
        """
        return self._text_offset

    @text_offset.setter
    def text_offset(self, text_offset: List[int]):
        """Sets the text_offset of this CreateCompletionResponseChoicesInnerLogprobs.


        :param text_offset: The text_offset of this CreateCompletionResponseChoicesInnerLogprobs.
        :type text_offset: List[int]
        """

        self._text_offset = text_offset
