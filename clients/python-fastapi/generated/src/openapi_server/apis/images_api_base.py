# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from pydantic import Field, StrictBytes, StrictStr, field_validator
from typing import Optional, Tuple, Union
from typing_extensions import Annotated
from openapi_server.models.create_image_edit_request_model import CreateImageEditRequestModel
from openapi_server.models.create_image_request import CreateImageRequest
from openapi_server.models.images_response import ImagesResponse
from openapi_server.security_api import get_token_ApiKeyAuth

class BaseImagesApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseImagesApi.subclasses = BaseImagesApi.subclasses + (cls,)
    async def create_image(
        self,
        create_image_request: CreateImageRequest,
    ) -> ImagesResponse:
        ...


    async def create_image_edit(
        self,
        image: Annotated[Union[StrictBytes, StrictStr, Tuple[StrictStr, StrictBytes]], Field(description="The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask.")],
        prompt: Annotated[StrictStr, Field(description="A text description of the desired image(s). The maximum length is 1000 characters.")],
        mask: Annotated[Optional[Union[StrictBytes, StrictStr, Tuple[StrictStr, StrictBytes]]], Field(description="An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where `image` should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as `image`.")],
        model: Optional[CreateImageEditRequestModel],
        n: Annotated[Optional[Annotated[int, Field(le=10, strict=True, ge=1)]], Field(description="The number of images to generate. Must be between 1 and 10.")],
        size: Annotated[Optional[StrictStr], Field(description="The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.")],
        response_format: Annotated[Optional[StrictStr], Field(description="The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated.")],
        user: Annotated[Optional[StrictStr], Field(description="A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). ")],
    ) -> ImagesResponse:
        ...


    async def create_image_variation(
        self,
        image: Annotated[Union[StrictBytes, StrictStr, Tuple[StrictStr, StrictBytes]], Field(description="The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square.")],
        model: Optional[CreateImageEditRequestModel],
        n: Annotated[Optional[Annotated[int, Field(le=10, strict=True, ge=1)]], Field(description="The number of images to generate. Must be between 1 and 10. For `dall-e-3`, only `n=1` is supported.")],
        response_format: Annotated[Optional[StrictStr], Field(description="The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated.")],
        size: Annotated[Optional[StrictStr], Field(description="The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.")],
        user: Annotated[Optional[StrictStr], Field(description="A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). ")],
    ) -> ImagesResponse:
        ...
