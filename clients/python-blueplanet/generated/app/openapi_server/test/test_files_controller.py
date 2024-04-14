# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.openapi_server.models.delete_file_response import DeleteFileResponse  # noqa: E501
from app.openapi_server.models.list_files_response import ListFilesResponse  # noqa: E501
from app.openapi_server.models.open_ai_file import OpenAIFile  # noqa: E501
from openapi_server.test import BaseTestCase


class TestFilesController(BaseTestCase):
    """FilesController integration test stubs"""

    def test_create_file(self):
        """Test case for create_file

        Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports `.jsonl` files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
        """
        data = dict(file='/path/to/file',
                    purpose='purpose_example')
        response = self.client.open(
            '/v1/files',
            method='POST',
            data=data,
            content_type='multipart/form-data')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_file(self):
        """Test case for delete_file

        Delete a file.
        """
        response = self.client.open(
            '/v1/files/{file_id}'.format(file_id='file_id_example'),
            method='DELETE')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_download_file(self):
        """Test case for download_file

        Returns the contents of the specified file.
        """
        response = self.client.open(
            '/v1/files/{file_id}/content'.format(file_id='file_id_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_list_files(self):
        """Test case for list_files

        Returns a list of files that belong to the user's organization.
        """
        query_string = [('purpose', 'purpose_example')]
        response = self.client.open(
            '/v1/files',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_retrieve_file(self):
        """Test case for retrieve_file

        Returns information about a specific file.
        """
        response = self.client.open(
            '/v1/files/{file_id}'.format(file_id='file_id_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
