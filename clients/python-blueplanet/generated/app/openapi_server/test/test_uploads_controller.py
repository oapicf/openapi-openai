# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.openapi_server.models.complete_upload_request import CompleteUploadRequest  # noqa: E501
from app.openapi_server.models.create_upload_request import CreateUploadRequest  # noqa: E501
from app.openapi_server.models.upload import Upload  # noqa: E501
from app.openapi_server.models.upload_part import UploadPart  # noqa: E501
from openapi_server.test import BaseTestCase


class TestUploadsController(BaseTestCase):
    """UploadsController integration test stubs"""

    def test_add_upload_part(self):
        """Test case for add_upload_part

        Adds a [Part](/docs/api-reference/uploads/part-object) to an [Upload](/docs/api-reference/uploads/object) object. A Part represents a chunk of bytes from the file you are trying to upload.   Each Part can be at most 64 MB, and you can add Parts until you hit the Upload maximum of 8 GB.  It is possible to add multiple Parts in parallel. You can decide the intended order of the Parts when you [complete the Upload](/docs/api-reference/uploads/complete). 
        """
        data = dict(data='/path/to/file')
        response = self.client.open(
            '/v1/uploads/{upload_id}/parts'.format(upload_id='upload_abc123'),
            method='POST',
            data=data,
            content_type='multipart/form-data')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_cancel_upload(self):
        """Test case for cancel_upload

        Cancels the Upload. No Parts may be added after an Upload is cancelled. 
        """
        response = self.client.open(
            '/v1/uploads/{upload_id}/cancel'.format(upload_id='upload_abc123'),
            method='POST')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_complete_upload(self):
        """Test case for complete_upload

        Completes the [Upload](/docs/api-reference/uploads/object).   Within the returned Upload object, there is a nested [File](/docs/api-reference/files/object) object that is ready to use in the rest of the platform.  You can specify the order of the Parts by passing in an ordered list of the Part IDs.  The number of bytes uploaded upon completion must match the number of bytes initially specified when creating the Upload object. No Parts may be added after an Upload is completed. 
        """
        body = {"part_ids":["part_ids","part_ids"],"md5":"md5"}
        response = self.client.open(
            '/v1/uploads/{upload_id}/complete'.format(upload_id='upload_abc123'),
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_create_upload(self):
        """Test case for create_upload

        Creates an intermediate [Upload](/docs/api-reference/uploads/object) object that you can add [Parts](/docs/api-reference/uploads/part-object) to. Currently, an Upload can accept at most 8 GB in total and expires after an hour after you create it.  Once you complete the Upload, we will create a [File](/docs/api-reference/files/object) object that contains all the parts you uploaded. This File is usable in the rest of our platform as a regular File object.  For certain `purpose`s, the correct `mime_type` must be specified. Please refer to documentation for the supported MIME types for your use case: - [Assistants](/docs/assistants/tools/file-search#supported-files)  For guidance on the proper filename extensions for each purpose, please follow the documentation on [creating a File](/docs/api-reference/files/create). 
        """
        body = {"filename":"filename","purpose":"assistants","mime_type":"mime_type","bytes":0}
        response = self.client.open(
            '/v1/uploads',
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
