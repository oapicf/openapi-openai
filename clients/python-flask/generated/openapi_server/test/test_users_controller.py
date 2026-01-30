import unittest

from flask import json

from openapi_server.models.user import User  # noqa: E501
from openapi_server.models.user_delete_response import UserDeleteResponse  # noqa: E501
from openapi_server.models.user_list_response import UserListResponse  # noqa: E501
from openapi_server.models.user_role_update_request import UserRoleUpdateRequest  # noqa: E501
from openapi_server.test import BaseTestCase


class TestUsersController(BaseTestCase):
    """UsersController integration test stubs"""

    def test_delete_user(self):
        """Test case for delete_user

        Deletes a user from the organization.
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/organization/users/{user_id}'.format(user_id='user_id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_list_users(self):
        """Test case for list_users

        Lists all of the users in the organization.
        """
        query_string = [('limit', 20),
                        ('after', 'after_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/organization/users',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_modify_user(self):
        """Test case for modify_user

        Modifies a user's role in the organization.
        """
        user_role_update_request = {"role":"owner"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/organization/users/{user_id}'.format(user_id='user_id_example'),
            method='POST',
            headers=headers,
            data=json.dumps(user_role_update_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_retrieve_user(self):
        """Test case for retrieve_user

        Retrieves a user by their identifier.
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/organization/users/{user_id}'.format(user_id='user_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
