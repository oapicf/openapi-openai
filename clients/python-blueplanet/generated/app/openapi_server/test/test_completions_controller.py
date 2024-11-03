# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.openapi_server.models.create_completion_request import CreateCompletionRequest  # noqa: E501
from app.openapi_server.models.create_completion_response import CreateCompletionResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestCompletionsController(BaseTestCase):
    """CompletionsController integration test stubs"""

    def test_create_completion(self):
        """Test case for create_completion

        Creates a completion for the provided prompt and parameters.
        """
        body = {"logit_bias":{"key":1},"seed":-2147483648,"max_tokens":16,"presence_penalty":0.25495066265333133,"echo":False,"suffix":"test.","n":1,"logprobs":2,"top_p":1,"frequency_penalty":0.4109824732281613,"best_of":1,"stop":"\n","stream":False,"temperature":1,"model":"CreateCompletionRequest_model","prompt":"This is a test.","user":"user-1234"}
        response = self.client.open(
            '/v1/completions',
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
