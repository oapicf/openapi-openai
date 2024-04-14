# coding: utf-8

import pytest
import json
from aiohttp import web
from aiohttp import FormData
from aiohttp import FormData

from openapi_server.models.create_image_edit_request_model import CreateImageEditRequestModel
from openapi_server.models.create_image_request import CreateImageRequest
from openapi_server.models.images_response import ImagesResponse


pytestmark = pytest.mark.asyncio

async def test_create_image(client):
    """Test case for create_image

    Creates an image given a prompt.
    """
    body = {"response_format":"url","size":"1024x1024","model":"dall-e-3","style":"vivid","prompt":"A cute baby sea otter","user":"user-1234","n":1,"quality":"standard"}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/v1/images/generations',
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

@pytest.mark.skip("multipart/form-data not supported by Connexion")
async def test_create_image_edit(client):
    """Test case for create_image_edit

    Creates an edited or extended image given an original image and a prompt.
    """
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'multipart/form-data',
        'Authorization': 'Bearer special-key',
    }
    data = FormData()
    data.add_field('image', '/path/to/file')
    data.add_field('prompt', 'prompt_example')
    data.add_field('mask', '/path/to/file')
    data.add_field('model', openapi_server.CreateImageEditRequestModel())
    data.add_field('n', 1)
    data.add_field('size', '1024x1024')
    data.add_field('response_format', 'url')
    data.add_field('user', 'user_example')
    response = await client.request(
        method='POST',
        path='/v1/images/edits',
        headers=headers,
        data=data,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

@pytest.mark.skip("multipart/form-data not supported by Connexion")
async def test_create_image_variation(client):
    """Test case for create_image_variation

    Creates a variation of a given image.
    """
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'multipart/form-data',
        'Authorization': 'Bearer special-key',
    }
    data = FormData()
    data.add_field('image', '/path/to/file')
    data.add_field('model', openapi_server.CreateImageEditRequestModel())
    data.add_field('n', 1)
    data.add_field('response_format', 'url')
    data.add_field('size', '1024x1024')
    data.add_field('user', 'user_example')
    response = await client.request(
        method='POST',
        path='/v1/images/variations',
        headers=headers,
        data=data,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

