# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.openapi_server.models.invite import Invite  # noqa: E501
from app.openapi_server.models.invite_delete_response import InviteDeleteResponse  # noqa: E501
from app.openapi_server.models.invite_list_response import InviteListResponse  # noqa: E501
from app.openapi_server.models.invite_request import InviteRequest  # noqa: E501
from openapi_server.test import BaseTestCase


class TestInvitesController(BaseTestCase):
    """InvitesController integration test stubs"""

    def test_delete_invite(self):
        """Test case for delete_invite

        Delete an invite. If the invite has already been accepted, it cannot be deleted.
        """
        response = self.client.open(
            '/v1/organization/invites/{invite_id}'.format(invite_id='invite_id_example'),
            method='DELETE')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_invite_user(self):
        """Test case for invite_user

        Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.
        """
        body = {"role":"reader","projects":[{"role":"member","id":"id"},{"role":"member","id":"id"}],"email":"email"}
        response = self.client.open(
            '/v1/organization/invites',
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_list_invites(self):
        """Test case for list_invites

        Returns a list of invites in the organization.
        """
        query_string = [('limit', 20),
                        ('after', 'after_example')]
        response = self.client.open(
            '/v1/organization/invites',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_retrieve_invite(self):
        """Test case for retrieve_invite

        Retrieves an invite.
        """
        response = self.client.open(
            '/v1/organization/invites/{invite_id}'.format(invite_id='invite_id_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
