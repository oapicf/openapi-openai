const assert = require('assert');
const OpenapiOpenai = require('openapi_openai');
const api = new OpenapiOpenai.OpenAIApi();

describe('openai', function() {

  const fineTuneId = 'ft-AF1WoRqd3aJAHsqc9NY7iL8F';
  const callback = function(error, data, response) {
    if (error) {
      assert.equal(error.message, 'Not Found');
    } else {
      assert.fail('Surely we are not that lucky for that fine tune ID to exist');
    }
  };
  api.cancelFineTune(fineTuneId, callback);
});
