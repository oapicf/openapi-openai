import unittest

from flask import json

from openapi_server.models.realtime_session_create_request import RealtimeSessionCreateRequest  # noqa: E501
from openapi_server.models.realtime_session_create_response import RealtimeSessionCreateResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestRealtimeController(BaseTestCase):
    """RealtimeController integration test stubs"""

    def test_create_realtime_session(self):
        """Test case for create_realtime_session

        Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the `session.update` client event.  It responds with a session object, plus a `client_secret` key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API. 
        """
        realtime_session_create_request = {"voice":"alloy","instructions":"instructions","input_audio_format":"pcm16","modalities":["text","text"],"max_response_output_tokens":5,"output_audio_format":"pcm16","input_audio_transcription":{"model":"model"},"temperature":5.962133916683182,"turn_detection":{"silence_duration_ms":1,"create_response":True,"prefix_padding_ms":6,"threshold":0.8008281904610115,"type":"type"},"tool_choice":"tool_choice","model":"gpt-4o-realtime-preview","tools":[{"name":"name","description":"description","type":"function","parameters":"{}"},{"name":"name","description":"description","type":"function","parameters":"{}"}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/realtime/sessions',
            method='POST',
            headers=headers,
            data=json.dumps(realtime_session_create_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
