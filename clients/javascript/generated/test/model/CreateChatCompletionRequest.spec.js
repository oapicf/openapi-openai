/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD.
    define(['expect.js', process.cwd()+'/src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require(process.cwd()+'/src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.OpenapiOpenai);
  }
}(this, function(expect, OpenapiOpenai) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new OpenapiOpenai.CreateChatCompletionRequest();
  });

  var getProperty = function(object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === 'function')
      return object[getter]();
    else
      return object[property];
  }

  var setProperty = function(object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === 'function')
      object[setter](value);
    else
      object[property] = value;
  }

  describe('CreateChatCompletionRequest', function() {
    it('should create an instance of CreateChatCompletionRequest', function() {
      // uncomment below and update the code to test CreateChatCompletionRequest
      //var instance = new OpenapiOpenai.CreateChatCompletionRequest();
      //expect(instance).to.be.a(OpenapiOpenai.CreateChatCompletionRequest);
    });

    it('should have the property messages (base name: "messages")', function() {
      // uncomment below and update the code to test the property messages
      //var instance = new OpenapiOpenai.CreateChatCompletionRequest();
      //expect(instance).to.be();
    });

    it('should have the property model (base name: "model")', function() {
      // uncomment below and update the code to test the property model
      //var instance = new OpenapiOpenai.CreateChatCompletionRequest();
      //expect(instance).to.be();
    });

    it('should have the property frequencyPenalty (base name: "frequency_penalty")', function() {
      // uncomment below and update the code to test the property frequencyPenalty
      //var instance = new OpenapiOpenai.CreateChatCompletionRequest();
      //expect(instance).to.be();
    });

    it('should have the property logitBias (base name: "logit_bias")', function() {
      // uncomment below and update the code to test the property logitBias
      //var instance = new OpenapiOpenai.CreateChatCompletionRequest();
      //expect(instance).to.be();
    });

    it('should have the property logprobs (base name: "logprobs")', function() {
      // uncomment below and update the code to test the property logprobs
      //var instance = new OpenapiOpenai.CreateChatCompletionRequest();
      //expect(instance).to.be();
    });

    it('should have the property topLogprobs (base name: "top_logprobs")', function() {
      // uncomment below and update the code to test the property topLogprobs
      //var instance = new OpenapiOpenai.CreateChatCompletionRequest();
      //expect(instance).to.be();
    });

    it('should have the property maxTokens (base name: "max_tokens")', function() {
      // uncomment below and update the code to test the property maxTokens
      //var instance = new OpenapiOpenai.CreateChatCompletionRequest();
      //expect(instance).to.be();
    });

    it('should have the property n (base name: "n")', function() {
      // uncomment below and update the code to test the property n
      //var instance = new OpenapiOpenai.CreateChatCompletionRequest();
      //expect(instance).to.be();
    });

    it('should have the property presencePenalty (base name: "presence_penalty")', function() {
      // uncomment below and update the code to test the property presencePenalty
      //var instance = new OpenapiOpenai.CreateChatCompletionRequest();
      //expect(instance).to.be();
    });

    it('should have the property responseFormat (base name: "response_format")', function() {
      // uncomment below and update the code to test the property responseFormat
      //var instance = new OpenapiOpenai.CreateChatCompletionRequest();
      //expect(instance).to.be();
    });

    it('should have the property seed (base name: "seed")', function() {
      // uncomment below and update the code to test the property seed
      //var instance = new OpenapiOpenai.CreateChatCompletionRequest();
      //expect(instance).to.be();
    });

    it('should have the property stop (base name: "stop")', function() {
      // uncomment below and update the code to test the property stop
      //var instance = new OpenapiOpenai.CreateChatCompletionRequest();
      //expect(instance).to.be();
    });

    it('should have the property stream (base name: "stream")', function() {
      // uncomment below and update the code to test the property stream
      //var instance = new OpenapiOpenai.CreateChatCompletionRequest();
      //expect(instance).to.be();
    });

    it('should have the property temperature (base name: "temperature")', function() {
      // uncomment below and update the code to test the property temperature
      //var instance = new OpenapiOpenai.CreateChatCompletionRequest();
      //expect(instance).to.be();
    });

    it('should have the property topP (base name: "top_p")', function() {
      // uncomment below and update the code to test the property topP
      //var instance = new OpenapiOpenai.CreateChatCompletionRequest();
      //expect(instance).to.be();
    });

    it('should have the property tools (base name: "tools")', function() {
      // uncomment below and update the code to test the property tools
      //var instance = new OpenapiOpenai.CreateChatCompletionRequest();
      //expect(instance).to.be();
    });

    it('should have the property toolChoice (base name: "tool_choice")', function() {
      // uncomment below and update the code to test the property toolChoice
      //var instance = new OpenapiOpenai.CreateChatCompletionRequest();
      //expect(instance).to.be();
    });

    it('should have the property user (base name: "user")', function() {
      // uncomment below and update the code to test the property user
      //var instance = new OpenapiOpenai.CreateChatCompletionRequest();
      //expect(instance).to.be();
    });

    it('should have the property functionCall (base name: "function_call")', function() {
      // uncomment below and update the code to test the property functionCall
      //var instance = new OpenapiOpenai.CreateChatCompletionRequest();
      //expect(instance).to.be();
    });

    it('should have the property functions (base name: "functions")', function() {
      // uncomment below and update the code to test the property functions
      //var instance = new OpenapiOpenai.CreateChatCompletionRequest();
      //expect(instance).to.be();
    });

  });

}));
