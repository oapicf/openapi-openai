# coding: utf-8

import pytest
import json
from aiohttp import web

from openapi_server.models.audit_log_event_type import AuditLogEventType
from openapi_server.models.list_audit_logs_effective_at_parameter import ListAuditLogsEffectiveAtParameter
from openapi_server.models.list_audit_logs_response import ListAuditLogsResponse


pytestmark = pytest.mark.asyncio

async def test_list_audit_logs(client):
    """Test case for list_audit_logs

    List user actions and configuration changes within this organization.
    """
    params = [('effective_at', openapi_server.ListAuditLogsEffectiveAtParameter()),
                    ('project_ids[]', ['project_ids_example']),
                    ('event_types[]', [openapi_server.AuditLogEventType()]),
                    ('actor_ids[]', ['actor_ids_example']),
                    ('actor_emails[]', ['actor_emails_example']),
                    ('resource_ids[]', ['resource_ids_example']),
                    ('limit', 20),
                    ('after', 'after_example'),
                    ('before', 'before_example')]
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/v1/organization/audit_logs',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

