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
    instance = new OpenapiOpenai.RunStepDeltaStepDetailsToolCallsFunctionObject();
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

  describe('RunStepDeltaStepDetailsToolCallsFunctionObject', function() {
    it('should create an instance of RunStepDeltaStepDetailsToolCallsFunctionObject', function() {
      // uncomment below and update the code to test RunStepDeltaStepDetailsToolCallsFunctionObject
      //var instance = new OpenapiOpenai.RunStepDeltaStepDetailsToolCallsFunctionObject();
      //expect(instance).to.be.a(OpenapiOpenai.RunStepDeltaStepDetailsToolCallsFunctionObject);
    });

    it('should have the property index (base name: "index")', function() {
      // uncomment below and update the code to test the property index
      //var instance = new OpenapiOpenai.RunStepDeltaStepDetailsToolCallsFunctionObject();
      //expect(instance).to.be();
    });

    it('should have the property id (base name: "id")', function() {
      // uncomment below and update the code to test the property id
      //var instance = new OpenapiOpenai.RunStepDeltaStepDetailsToolCallsFunctionObject();
      //expect(instance).to.be();
    });

    it('should have the property type (base name: "type")', function() {
      // uncomment below and update the code to test the property type
      //var instance = new OpenapiOpenai.RunStepDeltaStepDetailsToolCallsFunctionObject();
      //expect(instance).to.be();
    });

    it('should have the property _function (base name: "function")', function() {
      // uncomment below and update the code to test the property _function
      //var instance = new OpenapiOpenai.RunStepDeltaStepDetailsToolCallsFunctionObject();
      //expect(instance).to.be();
    });

  });

}));
