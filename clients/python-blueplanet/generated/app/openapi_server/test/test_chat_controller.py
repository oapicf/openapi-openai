# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.openapi_server.models.create_chat_completion_request import CreateChatCompletionRequest  # noqa: E501
from app.openapi_server.models.create_chat_completion_response import CreateChatCompletionResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestChatController(BaseTestCase):
    """ChatController integration test stubs"""

    def test_create_chat_completion(self):
        """Test case for create_chat_completion

        Creates a model response for the given chat conversation. Learn more in the [text generation](/docs/guides/text-generation), [vision](/docs/guides/vision), and [audio](/docs/guides/audio) guides.  Parameter support can differ depending on the model used to generate the response, particularly for newer reasoning models. Parameters that are only supported for reasoning models are noted below. For the current state of  unsupported parameters in reasoning models,  [refer to the reasoning guide](/docs/guides/reasoning). 
        """
        body = {"reasoning_effort":"medium","top_logprobs":2,"metadata":{"key":"metadata"},"logit_bias":{"key":6},"seed":2147483647,"functions":[{"name":"name","description":"description","parameters":{"key":""}},{"name":"name","description":"description","parameters":{"key":""}},{"name":"name","description":"description","parameters":{"key":""}},{"name":"name","description":"description","parameters":{"key":""}},{"name":"name","description":"description","parameters":{"key":""}}],"function_call":"none","presence_penalty":-1.079145645226094,"tools":[{"function":{"name":"name","description":"description","strict":False,"parameters":{"key":""}},"type":"function"},{"function":{"name":"name","description":"description","strict":False,"parameters":{"key":""}},"type":"function"}],"logprobs":False,"top_p":1,"max_completion_tokens":5,"frequency_penalty":-1.6796687238155954,"modalities":["text","text"],"response_format":{"type":"text"},"stream":False,"temperature":1,"tool_choice":"none","model":"gpt-4o","service_tier":"auto","audio":{"voice":"alloy","format":"wav"},"max_tokens":5,"store":False,"n":1,"stop":"CreateChatCompletionRequest_stop","parallel_tool_calls":True,"prediction":"","messages":[{"role":"developer","name":"name","content":"ChatCompletionRequestDeveloperMessage_content"},{"role":"developer","name":"name","content":"ChatCompletionRequestDeveloperMessage_content"}],"stream_options":{"include_usage":True},"user":"user-1234"}
        response = self.client.open(
            '/v1/chat/completions',
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
