# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.openapi_server.models.batch import Batch  # noqa: E501
from app.openapi_server.models.create_batch_request import CreateBatchRequest  # noqa: E501
from app.openapi_server.models.list_batches_response import ListBatchesResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestBatchController(BaseTestCase):
    """BatchController integration test stubs"""

    def test_cancel_batch(self):
        """Test case for cancel_batch

        Cancels an in-progress batch. The batch will be in status `cancelling` for up to 10 minutes, before changing to `cancelled`, where it will have partial results (if any) available in the output file.
        """
        response = self.client.open(
            '/v1/batches/{batch_id}/cancel'.format(batch_id='batch_id_example'),
            method='POST')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_create_batch(self):
        """Test case for create_batch

        Creates and executes a batch from an uploaded file of requests
        """
        body = openapi_server.CreateBatchRequest()
        response = self.client.open(
            '/v1/batches',
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_list_batches(self):
        """Test case for list_batches

        List your organization's batches.
        """
        query_string = [('after', 'after_example'),
                        ('limit', 20)]
        response = self.client.open(
            '/v1/batches',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_retrieve_batch(self):
        """Test case for retrieve_batch

        Retrieves a batch.
        """
        response = self.client.open(
            '/v1/batches/{batch_id}'.format(batch_id='batch_id_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
