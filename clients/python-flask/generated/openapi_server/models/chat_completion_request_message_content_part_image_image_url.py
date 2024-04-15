from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class ChatCompletionRequestMessageContentPartImageImageUrl(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, url=None, detail='auto'):  # noqa: E501
        """ChatCompletionRequestMessageContentPartImageImageUrl - a model defined in OpenAPI

        :param url: The url of this ChatCompletionRequestMessageContentPartImageImageUrl.  # noqa: E501
        :type url: str
        :param detail: The detail of this ChatCompletionRequestMessageContentPartImageImageUrl.  # noqa: E501
        :type detail: str
        """
        self.openapi_types = {
            'url': str,
            'detail': str
        }

        self.attribute_map = {
            'url': 'url',
            'detail': 'detail'
        }

        self._url = url
        self._detail = detail

    @classmethod
    def from_dict(cls, dikt) -> 'ChatCompletionRequestMessageContentPartImageImageUrl':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ChatCompletionRequestMessageContentPartImage_image_url of this ChatCompletionRequestMessageContentPartImageImageUrl.  # noqa: E501
        :rtype: ChatCompletionRequestMessageContentPartImageImageUrl
        """
        return util.deserialize_model(dikt, cls)

    @property
    def url(self) -> str:
        """Gets the url of this ChatCompletionRequestMessageContentPartImageImageUrl.

        Either a URL of the image or the base64 encoded image data.  # noqa: E501

        :return: The url of this ChatCompletionRequestMessageContentPartImageImageUrl.
        :rtype: str
        """
        return self._url

    @url.setter
    def url(self, url: str):
        """Sets the url of this ChatCompletionRequestMessageContentPartImageImageUrl.

        Either a URL of the image or the base64 encoded image data.  # noqa: E501

        :param url: The url of this ChatCompletionRequestMessageContentPartImageImageUrl.
        :type url: str
        """
        if url is None:
            raise ValueError("Invalid value for `url`, must not be `None`")  # noqa: E501

        self._url = url

    @property
    def detail(self) -> str:
        """Gets the detail of this ChatCompletionRequestMessageContentPartImageImageUrl.

        Specifies the detail level of the image. Learn more in the [Vision guide](/docs/guides/vision/low-or-high-fidelity-image-understanding).  # noqa: E501

        :return: The detail of this ChatCompletionRequestMessageContentPartImageImageUrl.
        :rtype: str
        """
        return self._detail

    @detail.setter
    def detail(self, detail: str):
        """Sets the detail of this ChatCompletionRequestMessageContentPartImageImageUrl.

        Specifies the detail level of the image. Learn more in the [Vision guide](/docs/guides/vision/low-or-high-fidelity-image-understanding).  # noqa: E501

        :param detail: The detail of this ChatCompletionRequestMessageContentPartImageImageUrl.
        :type detail: str
        """
        allowed_values = ["auto", "low", "high"]  # noqa: E501
        if detail not in allowed_values:
            raise ValueError(
                "Invalid value for `detail` ({0}), must be one of {1}"
                .format(detail, allowed_values)
            )

        self._detail = detail