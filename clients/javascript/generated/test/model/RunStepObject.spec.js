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
    instance = new OpenapiOpenai.RunStepObject();
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

  describe('RunStepObject', function() {
    it('should create an instance of RunStepObject', function() {
      // uncomment below and update the code to test RunStepObject
      //var instance = new OpenapiOpenai.RunStepObject();
      //expect(instance).to.be.a(OpenapiOpenai.RunStepObject);
    });

    it('should have the property id (base name: "id")', function() {
      // uncomment below and update the code to test the property id
      //var instance = new OpenapiOpenai.RunStepObject();
      //expect(instance).to.be();
    });

    it('should have the property object (base name: "object")', function() {
      // uncomment below and update the code to test the property object
      //var instance = new OpenapiOpenai.RunStepObject();
      //expect(instance).to.be();
    });

    it('should have the property createdAt (base name: "created_at")', function() {
      // uncomment below and update the code to test the property createdAt
      //var instance = new OpenapiOpenai.RunStepObject();
      //expect(instance).to.be();
    });

    it('should have the property assistantId (base name: "assistant_id")', function() {
      // uncomment below and update the code to test the property assistantId
      //var instance = new OpenapiOpenai.RunStepObject();
      //expect(instance).to.be();
    });

    it('should have the property threadId (base name: "thread_id")', function() {
      // uncomment below and update the code to test the property threadId
      //var instance = new OpenapiOpenai.RunStepObject();
      //expect(instance).to.be();
    });

    it('should have the property runId (base name: "run_id")', function() {
      // uncomment below and update the code to test the property runId
      //var instance = new OpenapiOpenai.RunStepObject();
      //expect(instance).to.be();
    });

    it('should have the property type (base name: "type")', function() {
      // uncomment below and update the code to test the property type
      //var instance = new OpenapiOpenai.RunStepObject();
      //expect(instance).to.be();
    });

    it('should have the property status (base name: "status")', function() {
      // uncomment below and update the code to test the property status
      //var instance = new OpenapiOpenai.RunStepObject();
      //expect(instance).to.be();
    });

    it('should have the property stepDetails (base name: "step_details")', function() {
      // uncomment below and update the code to test the property stepDetails
      //var instance = new OpenapiOpenai.RunStepObject();
      //expect(instance).to.be();
    });

    it('should have the property lastError (base name: "last_error")', function() {
      // uncomment below and update the code to test the property lastError
      //var instance = new OpenapiOpenai.RunStepObject();
      //expect(instance).to.be();
    });

    it('should have the property expiredAt (base name: "expired_at")', function() {
      // uncomment below and update the code to test the property expiredAt
      //var instance = new OpenapiOpenai.RunStepObject();
      //expect(instance).to.be();
    });

    it('should have the property cancelledAt (base name: "cancelled_at")', function() {
      // uncomment below and update the code to test the property cancelledAt
      //var instance = new OpenapiOpenai.RunStepObject();
      //expect(instance).to.be();
    });

    it('should have the property failedAt (base name: "failed_at")', function() {
      // uncomment below and update the code to test the property failedAt
      //var instance = new OpenapiOpenai.RunStepObject();
      //expect(instance).to.be();
    });

    it('should have the property completedAt (base name: "completed_at")', function() {
      // uncomment below and update the code to test the property completedAt
      //var instance = new OpenapiOpenai.RunStepObject();
      //expect(instance).to.be();
    });

    it('should have the property metadata (base name: "metadata")', function() {
      // uncomment below and update the code to test the property metadata
      //var instance = new OpenapiOpenai.RunStepObject();
      //expect(instance).to.be();
    });

    it('should have the property usage (base name: "usage")', function() {
      // uncomment below and update the code to test the property usage
      //var instance = new OpenapiOpenai.RunStepObject();
      //expect(instance).to.be();
    });

  });

}));
