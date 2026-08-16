import openapiopenai
from openapiopenai.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.openai.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapiopenai.Configuration(
    host = "https://api.openai.com/v1",
    access_token = "YOUR_OPENAI_API_KEY"
)

# Enter a context with an instance of the API client
with openapiopenai.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapiopenai.AssistantsApi(api_client)
    thread_id = 'thread_id'
    run_id = 'run_id'

    try:
        # Cancel a run
        api_response = api_instance.cancel_run(thread_id, run_id)
        print("The response of AssistantsApi->cancel_run:\n")
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling AssistantsApi->cancel_run: %s\n" % e)
        raise
