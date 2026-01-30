# coding: utf-8

from fastapi.testclient import TestClient


from openapi_server.models.create_chat_completion_request import CreateChatCompletionRequest  # noqa: F401
from openapi_server.models.create_chat_completion_response import CreateChatCompletionResponse  # noqa: F401


def test_create_chat_completion(client: TestClient):
    """Test case for create_chat_completion

    Creates a model response for the given chat conversation. Learn more in the [text generation](/docs/guides/text-generation), [vision](/docs/guides/vision), and [audio](/docs/guides/audio) guides.  Parameter support can differ depending on the model used to generate the response, particularly for newer reasoning models. Parameters that are only supported for reasoning models are noted below. For the current state of  unsupported parameters in reasoning models,  [refer to the reasoning guide](/docs/guides/reasoning). 
    """
    create_chat_completion_request = {"reasoning_effort":"medium","top_logprobs":2,"metadata":{"key":"metadata"},"logit_bias":{"key":6},"seed":2147483647,"functions":[{"name":"name","description":"description","parameters":{"key":""}},{"name":"name","description":"description","parameters":{"key":""}},{"name":"name","description":"description","parameters":{"key":""}},{"name":"name","description":"description","parameters":{"key":""}},{"name":"name","description":"description","parameters":{"key":""}}],"function_call":"none","presence_penalty":-1.079145645226094,"tools":[{"function":{"name":"name","description":"description","strict":0,"parameters":{"key":""}},"type":"function"},{"function":{"name":"name","description":"description","strict":0,"parameters":{"key":""}},"type":"function"}],"logprobs":0,"top_p":1,"max_completion_tokens":5,"frequency_penalty":-1.6796687238155954,"modalities":["text","text"],"response_format":{"type":"text"},"stream":0,"temperature":1,"tool_choice":"none","model":"gpt-4o","service_tier":"auto","audio":{"voice":"alloy","format":"wav"},"max_tokens":5,"store":0,"n":1,"stop":"CreateChatCompletionRequest_stop","parallel_tool_calls":1,"prediction":"","messages":[{"role":"developer","name":"name","content":"ChatCompletionRequestDeveloperMessage_content"},{"role":"developer","name":"name","content":"ChatCompletionRequestDeveloperMessage_content"}],"stream_options":{"include_usage":1},"user":"user-1234"}

    headers = {
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/chat/completions",
    #    headers=headers,
    #    json=create_chat_completion_request,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

