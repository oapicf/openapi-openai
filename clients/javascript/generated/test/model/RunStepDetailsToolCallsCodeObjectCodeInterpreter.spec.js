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
    instance = new OpenapiOpenai.RunStepDetailsToolCallsCodeObjectCodeInterpreter();
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

  describe('RunStepDetailsToolCallsCodeObjectCodeInterpreter', function() {
    it('should create an instance of RunStepDetailsToolCallsCodeObjectCodeInterpreter', function() {
      // uncomment below and update the code to test RunStepDetailsToolCallsCodeObjectCodeInterpreter
      //var instance = new OpenapiOpenai.RunStepDetailsToolCallsCodeObjectCodeInterpreter();
      //expect(instance).to.be.a(OpenapiOpenai.RunStepDetailsToolCallsCodeObjectCodeInterpreter);
    });

    it('should have the property input (base name: "input")', function() {
      // uncomment below and update the code to test the property input
      //var instance = new OpenapiOpenai.RunStepDetailsToolCallsCodeObjectCodeInterpreter();
      //expect(instance).to.be();
    });

    it('should have the property outputs (base name: "outputs")', function() {
      // uncomment below and update the code to test the property outputs
      //var instance = new OpenapiOpenai.RunStepDetailsToolCallsCodeObjectCodeInterpreter();
      //expect(instance).to.be();
    });

  });

}));
