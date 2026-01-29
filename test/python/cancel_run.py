import unittest
import openapiopenai
from openapiopenai.rest import ApiException
from pprint import pprint

class TestOpenApiOpenAICancelRun(unittest.TestCase):

    def test_cancel_run_with_invalid_token(self):
        """Test cancel_run API call with invalid token should fail with 401 Unauthorized"""

        configuration = openapiopenai.Configuration(
            host = "https://api.openai.com/v1",
            access_token = "INEXISTING_TOKEN"
        )

        with openapiopenai.ApiClient(configuration) as api_client:

            api_instance = openapiopenai.AssistantsApi(api_client)
            thread_id = 'inexisting_thread_id'
            run_id = 'inexisting_run_id'

            try:
                api_response = api_instance.cancel_run(thread_id, run_id)
                self.fail('API called successfully when it should have failed')
            except ApiException as e:
                print("Exception when calling AssistantsApi->cancel_run: %s\n" % e)
                self.assertEqual(e.status, 401)
                self.assertIn('Unauthorized', e.reason)
                self.assertIn('Incorrect API key provided', e.body)

if __name__ == '__main__':
    unittest.main()
