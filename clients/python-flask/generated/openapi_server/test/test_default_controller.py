import unittest

from flask import json

from openapi_server.models.admin_api_key import AdminApiKey  # noqa: E501
from openapi_server.models.admin_api_keys_create_request import AdminApiKeysCreateRequest  # noqa: E501
from openapi_server.models.admin_api_keys_delete200_response import AdminApiKeysDelete200Response  # noqa: E501
from openapi_server.models.api_key_list import ApiKeyList  # noqa: E501
from openapi_server.test import BaseTestCase


class TestDefaultController(BaseTestCase):
    """DefaultController integration test stubs"""

    def test_admin_api_keys_create(self):
        """Test case for admin_api_keys_create

        Create an organization admin API key
        """
        admin_api_keys_create_request = openapi_server.AdminApiKeysCreateRequest()
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/organization/admin_api_keys',
            method='POST',
            headers=headers,
            data=json.dumps(admin_api_keys_create_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_admin_api_keys_delete(self):
        """Test case for admin_api_keys_delete

        Delete an organization admin API key
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/organization/admin_api_keys/{key_id}'.format(key_id='key_id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_admin_api_keys_get(self):
        """Test case for admin_api_keys_get

        Retrieve a single organization API key
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/organization/admin_api_keys/{key_id}'.format(key_id='key_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_admin_api_keys_list(self):
        """Test case for admin_api_keys_list

        List organization API keys
        """
        query_string = [('after', 'after_example'),
                        ('order', asc),
                        ('limit', 20)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/organization/admin_api_keys',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
