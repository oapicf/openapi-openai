# coding: utf-8

import pytest
import json
from aiohttp import web

from openapi_server.models.invite import Invite
from openapi_server.models.invite_delete_response import InviteDeleteResponse
from openapi_server.models.invite_list_response import InviteListResponse
from openapi_server.models.invite_request import InviteRequest


pytestmark = pytest.mark.asyncio

async def test_delete_invite(client):
    """Test case for delete_invite

    Delete an invite. If the invite has already been accepted, it cannot be deleted.
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='DELETE',
        path='/v1/organization/invites/{invite_id}'.format(invite_id='invite_id_example'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_invite_user(client):
    """Test case for invite_user

    Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.
    """
    body = {"role":"reader","projects":[{"role":"member","id":"id"},{"role":"member","id":"id"}],"email":"email"}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/v1/organization/invites',
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_list_invites(client):
    """Test case for list_invites

    Returns a list of invites in the organization.
    """
    params = [('limit', 20),
                    ('after', 'after_example')]
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/v1/organization/invites',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_retrieve_invite(client):
    """Test case for retrieve_invite

    Retrieves an invite.
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/v1/organization/invites/{invite_id}'.format(invite_id='invite_id_example'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

