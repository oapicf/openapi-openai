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
    instance = new OpenapiOpenai.CreateRunRequest();
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

  describe('CreateRunRequest', function() {
    it('should create an instance of CreateRunRequest', function() {
      // uncomment below and update the code to test CreateRunRequest
      //var instance = new OpenapiOpenai.CreateRunRequest();
      //expect(instance).to.be.a(OpenapiOpenai.CreateRunRequest);
    });

    it('should have the property assistantId (base name: "assistant_id")', function() {
      // uncomment below and update the code to test the property assistantId
      //var instance = new OpenapiOpenai.CreateRunRequest();
      //expect(instance).to.be();
    });

    it('should have the property model (base name: "model")', function() {
      // uncomment below and update the code to test the property model
      //var instance = new OpenapiOpenai.CreateRunRequest();
      //expect(instance).to.be();
    });

    it('should have the property instructions (base name: "instructions")', function() {
      // uncomment below and update the code to test the property instructions
      //var instance = new OpenapiOpenai.CreateRunRequest();
      //expect(instance).to.be();
    });

    it('should have the property additionalInstructions (base name: "additional_instructions")', function() {
      // uncomment below and update the code to test the property additionalInstructions
      //var instance = new OpenapiOpenai.CreateRunRequest();
      //expect(instance).to.be();
    });

    it('should have the property additionalMessages (base name: "additional_messages")', function() {
      // uncomment below and update the code to test the property additionalMessages
      //var instance = new OpenapiOpenai.CreateRunRequest();
      //expect(instance).to.be();
    });

    it('should have the property tools (base name: "tools")', function() {
      // uncomment below and update the code to test the property tools
      //var instance = new OpenapiOpenai.CreateRunRequest();
      //expect(instance).to.be();
    });

    it('should have the property metadata (base name: "metadata")', function() {
      // uncomment below and update the code to test the property metadata
      //var instance = new OpenapiOpenai.CreateRunRequest();
      //expect(instance).to.be();
    });

    it('should have the property temperature (base name: "temperature")', function() {
      // uncomment below and update the code to test the property temperature
      //var instance = new OpenapiOpenai.CreateRunRequest();
      //expect(instance).to.be();
    });

    it('should have the property stream (base name: "stream")', function() {
      // uncomment below and update the code to test the property stream
      //var instance = new OpenapiOpenai.CreateRunRequest();
      //expect(instance).to.be();
    });

    it('should have the property maxPromptTokens (base name: "max_prompt_tokens")', function() {
      // uncomment below and update the code to test the property maxPromptTokens
      //var instance = new OpenapiOpenai.CreateRunRequest();
      //expect(instance).to.be();
    });

    it('should have the property maxCompletionTokens (base name: "max_completion_tokens")', function() {
      // uncomment below and update the code to test the property maxCompletionTokens
      //var instance = new OpenapiOpenai.CreateRunRequest();
      //expect(instance).to.be();
    });

    it('should have the property truncationStrategy (base name: "truncation_strategy")', function() {
      // uncomment below and update the code to test the property truncationStrategy
      //var instance = new OpenapiOpenai.CreateRunRequest();
      //expect(instance).to.be();
    });

    it('should have the property toolChoice (base name: "tool_choice")', function() {
      // uncomment below and update the code to test the property toolChoice
      //var instance = new OpenapiOpenai.CreateRunRequest();
      //expect(instance).to.be();
    });

    it('should have the property responseFormat (base name: "response_format")', function() {
      // uncomment below and update the code to test the property responseFormat
      //var instance = new OpenapiOpenai.CreateRunRequest();
      //expect(instance).to.be();
    });

  });

}));
