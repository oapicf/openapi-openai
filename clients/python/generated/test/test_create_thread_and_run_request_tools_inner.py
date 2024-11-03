# coding: utf-8

"""
    OpenAI API

    The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.

    The version of the OpenAPI document: 2.0.0
    Contact: blah+oapicf@cliffano.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapiopenai.models.create_thread_and_run_request_tools_inner import CreateThreadAndRunRequestToolsInner

class TestCreateThreadAndRunRequestToolsInner(unittest.TestCase):
    """CreateThreadAndRunRequestToolsInner unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CreateThreadAndRunRequestToolsInner:
        """Test CreateThreadAndRunRequestToolsInner
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CreateThreadAndRunRequestToolsInner`
        """
        model = CreateThreadAndRunRequestToolsInner()
        if include_optional:
            return CreateThreadAndRunRequestToolsInner(
                type = 'code_interpreter',
                function = openapiopenai.models.function_object.FunctionObject(
                    description = '', 
                    name = '', 
                    parameters = { }, )
            )
        else:
            return CreateThreadAndRunRequestToolsInner(
                type = 'code_interpreter',
                function = openapiopenai.models.function_object.FunctionObject(
                    description = '', 
                    name = '', 
                    parameters = { }, ),
        )
        """

    def testCreateThreadAndRunRequestToolsInner(self):
        """Test CreateThreadAndRunRequestToolsInner"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
