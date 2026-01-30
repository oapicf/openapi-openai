import unittest

from flask import json

from openapi_server.models.create_moderation_request import CreateModerationRequest  # noqa: E501
from openapi_server.models.create_moderation_response import CreateModerationResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestModerationsController(BaseTestCase):
    """ModerationsController integration test stubs"""

    def test_create_moderation(self):
        """Test case for create_moderation

        Classifies if text and/or image inputs are potentially harmful. Learn more in the [moderation guide](/docs/guides/moderation). 
        """
        create_moderation_request = {"input":"I want to kill them.","model":"omni-moderation-2024-09-26"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/moderations',
            method='POST',
            headers=headers,
            data=json.dumps(create_moderation_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
