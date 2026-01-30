import unittest

from flask import json

from openapi_server.models.audit_log_event_type import AuditLogEventType  # noqa: E501
from openapi_server.models.list_audit_logs_effective_at_parameter import ListAuditLogsEffectiveAtParameter  # noqa: E501
from openapi_server.models.list_audit_logs_response import ListAuditLogsResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestAuditLogsController(BaseTestCase):
    """AuditLogsController integration test stubs"""

    def test_list_audit_logs(self):
        """Test case for list_audit_logs

        List user actions and configuration changes within this organization.
        """
        query_string = [('effective_at', openapi_server.ListAuditLogsEffectiveAtParameter()),
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
        response = self.client.open(
            '/v1/organization/audit_logs',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
