import unittest
import openapiopenai
from openapiopenai.rest import ApiException
from pprint import pprint

class TestOpenApiOpenAIListModels(unittest.TestCase):

    def test_list_models_with_invalid_token(self):
        """Test list_models API call with invalid token should fail with 401 Unauthorized"""

        configuration = openapiopenai.Configuration(
            host = "https://api.openai.com/v1",
            access_token = "INEXISTING_TOKEN"
        )

        with openapiopenai.ApiClient(configuration) as api_client:

            api_instance = openapiopenai.ModelsApi(api_client)

            try:
                api_response = api_instance.list_models()
                self.fail('API called successfully when it should have failed')
            except ApiException as e:
                print("Exception when calling ModelsApi->list_models: %s\n" % e)
                self.assertEqual(e.status, 401)
                self.assertIn('Unauthorized', e.reason)
                self.assertIn('Incorrect API key provided', e.body)

if __name__ == '__main__':
    unittest.main()
