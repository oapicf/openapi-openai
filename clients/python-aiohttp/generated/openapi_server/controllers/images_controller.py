from typing import List, Dict
from aiohttp import web

from openapi_server.models.create_image_edit_request_model import CreateImageEditRequestModel
from openapi_server.models.create_image_request import CreateImageRequest
from openapi_server.models.images_response import ImagesResponse
from openapi_server import util


async def create_image(request: web.Request, body) -> web.Response:
    """Creates an image given a prompt.

    

    :param body: 
    :type body: dict | bytes

    """
    body = CreateImageRequest.from_dict(body)
    return web.Response(status=200)


async def create_image_edit(request: web.Request, image, prompt, mask=None, model=None, n=None, size=None, response_format=None, user=None) -> web.Response:
    """Creates an edited or extended image given an original image and a prompt.

    

    :param image: The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask.
    :type image: str
    :param prompt: A text description of the desired image(s). The maximum length is 1000 characters.
    :type prompt: str
    :param mask: An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where &#x60;image&#x60; should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as &#x60;image&#x60;.
    :type mask: str
    :param model: 
    :type model: dict | bytes
    :param n: The number of images to generate. Must be between 1 and 10.
    :type n: int
    :param size: The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;.
    :type size: str
    :param response_format: The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. URLs are only valid for 60 minutes after the image has been generated.
    :type response_format: str
    :param user: A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids). 
    :type user: str

    """
    model = CreateImageEditRequestModel.from_dict(model)
    return web.Response(status=200)


async def create_image_variation(request: web.Request, image, model=None, n=None, response_format=None, size=None, user=None) -> web.Response:
    """Creates a variation of a given image.

    

    :param image: The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square.
    :type image: str
    :param model: 
    :type model: dict | bytes
    :param n: The number of images to generate. Must be between 1 and 10. For &#x60;dall-e-3&#x60;, only &#x60;n&#x3D;1&#x60; is supported.
    :type n: int
    :param response_format: The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. URLs are only valid for 60 minutes after the image has been generated.
    :type response_format: str
    :param size: The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;.
    :type size: str
    :param user: A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids). 
    :type user: str

    """
    model = CreateImageEditRequestModel.from_dict(model)
    return web.Response(status=200)
