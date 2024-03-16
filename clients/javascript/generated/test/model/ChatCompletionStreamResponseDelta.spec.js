/**
 * OpenAI API
 * APIs for sampling from and fine-tuning language models
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
    instance = new OpenapiOpenai.ChatCompletionStreamResponseDelta();
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

  describe('ChatCompletionStreamResponseDelta', function() {
    it('should create an instance of ChatCompletionStreamResponseDelta', function() {
      // uncomment below and update the code to test ChatCompletionStreamResponseDelta
      //var instance = new OpenapiOpenai.ChatCompletionStreamResponseDelta();
      //expect(instance).to.be.a(OpenapiOpenai.ChatCompletionStreamResponseDelta);
    });

    it('should have the property role (base name: "role")', function() {
      // uncomment below and update the code to test the property role
      //var instance = new OpenapiOpenai.ChatCompletionStreamResponseDelta();
      //expect(instance).to.be();
    });

    it('should have the property content (base name: "content")', function() {
      // uncomment below and update the code to test the property content
      //var instance = new OpenapiOpenai.ChatCompletionStreamResponseDelta();
      //expect(instance).to.be();
    });

    it('should have the property functionCall (base name: "function_call")', function() {
      // uncomment below and update the code to test the property functionCall
      //var instance = new OpenapiOpenai.ChatCompletionStreamResponseDelta();
      //expect(instance).to.be();
    });

  });

}));
