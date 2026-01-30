# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.openapi_server.models.delete_model_response import DeleteModelResponse  # noqa: E501
from app.openapi_server.models.list_models_response import ListModelsResponse  # noqa: E501
from app.openapi_server.models.model import Model  # noqa: E501
from openapi_server.test import BaseTestCase


class TestModelsController(BaseTestCase):
    """ModelsController integration test stubs"""

    def test_delete_model(self):
        """Test case for delete_model

        Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
        """
        response = self.client.open(
            '/v1/models/{model}'.format(model='ft:gpt-4o-mini:acemeco:suffix:abc123'),
            method='DELETE')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_list_models(self):
        """Test case for list_models

        Lists the currently available models, and provides basic information about each one such as the owner and availability.
        """
        response = self.client.open(
            '/v1/models',
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_retrieve_model(self):
        """Test case for retrieve_model

        Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
        """
        response = self.client.open(
            '/v1/models/{model}'.format(model='gpt-4o-mini'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
