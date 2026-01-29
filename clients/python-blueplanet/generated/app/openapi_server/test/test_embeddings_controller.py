# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.openapi_server.models.create_embedding_request import CreateEmbeddingRequest  # noqa: E501
from app.openapi_server.models.create_embedding_response import CreateEmbeddingResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestEmbeddingsController(BaseTestCase):
    """EmbeddingsController integration test stubs"""

    def test_create_embedding(self):
        """Test case for create_embedding

        Creates an embedding vector representing the input text.
        """
        body = {"input":"The quick brown fox jumped over the lazy dog","encoding_format":"float","model":"text-embedding-3-small","user":"user-1234","dimensions":1}
        response = self.client.open(
            '/v1/embeddings',
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
