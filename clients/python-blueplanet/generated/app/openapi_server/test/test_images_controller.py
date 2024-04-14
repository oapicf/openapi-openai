# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.openapi_server.models.create_image_edit_request_model import CreateImageEditRequestModel  # noqa: E501
from app.openapi_server.models.create_image_request import CreateImageRequest  # noqa: E501
from app.openapi_server.models.images_response import ImagesResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestImagesController(BaseTestCase):
    """ImagesController integration test stubs"""

    def test_create_image(self):
        """Test case for create_image

        Creates an image given a prompt.
        """
        body = {"response_format":"url","size":"1024x1024","model":"dall-e-3","style":"vivid","prompt":"A cute baby sea otter","user":"user-1234","n":1,"quality":"standard"}
        response = self.client.open(
            '/v1/images/generations',
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_create_image_edit(self):
        """Test case for create_image_edit

        Creates an edited or extended image given an original image and a prompt.
        """
        data = dict(image='/path/to/file',
                    prompt='prompt_example',
                    mask='/path/to/file',
                    model=openapi_server.CreateImageEditRequestModel(),
                    n=1,
                    size='1024x1024',
                    response_format='url',
                    user='user_example')
        response = self.client.open(
            '/v1/images/edits',
            method='POST',
            data=data,
            content_type='multipart/form-data')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_create_image_variation(self):
        """Test case for create_image_variation

        Creates a variation of a given image.
        """
        data = dict(image='/path/to/file',
                    model=openapi_server.CreateImageEditRequestModel(),
                    n=1,
                    response_format='url',
                    size='1024x1024',
                    user='user_example')
        response = self.client.open(
            '/v1/images/variations',
            method='POST',
            data=data,
            content_type='multipart/form-data')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
