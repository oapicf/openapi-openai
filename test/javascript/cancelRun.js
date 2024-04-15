const assert = require('assert');
const OpenapiOpenai = require('openapi_openai');
const api = new OpenapiOpenai.AssistantsApi();

const defaultClient = OpenapiOpenai.ApiClient.instance;
const ApiKeyAuth = defaultClient.authentications['ApiKeyAuth'];
ApiKeyAuth.accessToken = 'INEXISTING_TOKEN';

describe('API call should fail with inexisting token', function() {

  const threadId = 'inexisting_thread_id';
  const runId = 'inexisting_run_id';
  const callback = function(error, data, response) {
    if (error) {
      assert.equal(error.message, 'Unauthorized');
      assert.equal(error.status, 401);
      assert.equal(error.response.text.includes('Incorrect API key provided'), true);
    } else {
      console.error('API called successfully when it should have failed');
      assert.fail();
    }
  };
  api.cancelRun(threadId, runId, callback);

});
