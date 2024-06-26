from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class Image(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, b64_json=None, url=None, revised_prompt=None):  # noqa: E501
        """Image - a model defined in OpenAPI

        :param b64_json: The b64_json of this Image.  # noqa: E501
        :type b64_json: str
        :param url: The url of this Image.  # noqa: E501
        :type url: str
        :param revised_prompt: The revised_prompt of this Image.  # noqa: E501
        :type revised_prompt: str
        """
        self.openapi_types = {
            'b64_json': str,
            'url': str,
            'revised_prompt': str
        }

        self.attribute_map = {
            'b64_json': 'b64_json',
            'url': 'url',
            'revised_prompt': 'revised_prompt'
        }

        self._b64_json = b64_json
        self._url = url
        self._revised_prompt = revised_prompt

    @classmethod
    def from_dict(cls, dikt) -> 'Image':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Image of this Image.  # noqa: E501
        :rtype: Image
        """
        return util.deserialize_model(dikt, cls)

    @property
    def b64_json(self) -> str:
        """Gets the b64_json of this Image.

        The base64-encoded JSON of the generated image, if `response_format` is `b64_json`.  # noqa: E501

        :return: The b64_json of this Image.
        :rtype: str
        """
        return self._b64_json

    @b64_json.setter
    def b64_json(self, b64_json: str):
        """Sets the b64_json of this Image.

        The base64-encoded JSON of the generated image, if `response_format` is `b64_json`.  # noqa: E501

        :param b64_json: The b64_json of this Image.
        :type b64_json: str
        """

        self._b64_json = b64_json

    @property
    def url(self) -> str:
        """Gets the url of this Image.

        The URL of the generated image, if `response_format` is `url` (default).  # noqa: E501

        :return: The url of this Image.
        :rtype: str
        """
        return self._url

    @url.setter
    def url(self, url: str):
        """Sets the url of this Image.

        The URL of the generated image, if `response_format` is `url` (default).  # noqa: E501

        :param url: The url of this Image.
        :type url: str
        """

        self._url = url

    @property
    def revised_prompt(self) -> str:
        """Gets the revised_prompt of this Image.

        The prompt that was used to generate the image, if there was any revision to the prompt.  # noqa: E501

        :return: The revised_prompt of this Image.
        :rtype: str
        """
        return self._revised_prompt

    @revised_prompt.setter
    def revised_prompt(self, revised_prompt: str):
        """Sets the revised_prompt of this Image.

        The prompt that was used to generate the image, if there was any revision to the prompt.  # noqa: E501

        :param revised_prompt: The revised_prompt of this Image.
        :type revised_prompt: str
        """

        self._revised_prompt = revised_prompt
