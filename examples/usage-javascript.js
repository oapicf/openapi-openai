var OpenapiOpenai = require('openapi_openai');

var api = new OpenapiOpenai.AssistantsApi();

var defaultClient = OpenapiOpenai.ApiClient.instance;
var ApiKeyAuth = defaultClient.authentications['ApiKeyAuth'];
ApiKeyAuth.accessToken = 'YOUR_OPENAI_API_KEY';

var threadId = 'thread_id';
var runId = 'run_id';
var callback = function(error, data, response) {
  if (error) {
    console.error(error);
    process.exitCode = 1;
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
api.cancelRun(threadId, runId, callback);
