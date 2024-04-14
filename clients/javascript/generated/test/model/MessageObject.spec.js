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
    instance = new OpenapiOpenai.MessageObject();
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

  describe('MessageObject', function() {
    it('should create an instance of MessageObject', function() {
      // uncomment below and update the code to test MessageObject
      //var instance = new OpenapiOpenai.MessageObject();
      //expect(instance).to.be.a(OpenapiOpenai.MessageObject);
    });

    it('should have the property id (base name: "id")', function() {
      // uncomment below and update the code to test the property id
      //var instance = new OpenapiOpenai.MessageObject();
      //expect(instance).to.be();
    });

    it('should have the property object (base name: "object")', function() {
      // uncomment below and update the code to test the property object
      //var instance = new OpenapiOpenai.MessageObject();
      //expect(instance).to.be();
    });

    it('should have the property createdAt (base name: "created_at")', function() {
      // uncomment below and update the code to test the property createdAt
      //var instance = new OpenapiOpenai.MessageObject();
      //expect(instance).to.be();
    });

    it('should have the property threadId (base name: "thread_id")', function() {
      // uncomment below and update the code to test the property threadId
      //var instance = new OpenapiOpenai.MessageObject();
      //expect(instance).to.be();
    });

    it('should have the property status (base name: "status")', function() {
      // uncomment below and update the code to test the property status
      //var instance = new OpenapiOpenai.MessageObject();
      //expect(instance).to.be();
    });

    it('should have the property incompleteDetails (base name: "incomplete_details")', function() {
      // uncomment below and update the code to test the property incompleteDetails
      //var instance = new OpenapiOpenai.MessageObject();
      //expect(instance).to.be();
    });

    it('should have the property completedAt (base name: "completed_at")', function() {
      // uncomment below and update the code to test the property completedAt
      //var instance = new OpenapiOpenai.MessageObject();
      //expect(instance).to.be();
    });

    it('should have the property incompleteAt (base name: "incomplete_at")', function() {
      // uncomment below and update the code to test the property incompleteAt
      //var instance = new OpenapiOpenai.MessageObject();
      //expect(instance).to.be();
    });

    it('should have the property role (base name: "role")', function() {
      // uncomment below and update the code to test the property role
      //var instance = new OpenapiOpenai.MessageObject();
      //expect(instance).to.be();
    });

    it('should have the property content (base name: "content")', function() {
      // uncomment below and update the code to test the property content
      //var instance = new OpenapiOpenai.MessageObject();
      //expect(instance).to.be();
    });

    it('should have the property assistantId (base name: "assistant_id")', function() {
      // uncomment below and update the code to test the property assistantId
      //var instance = new OpenapiOpenai.MessageObject();
      //expect(instance).to.be();
    });

    it('should have the property runId (base name: "run_id")', function() {
      // uncomment below and update the code to test the property runId
      //var instance = new OpenapiOpenai.MessageObject();
      //expect(instance).to.be();
    });

    it('should have the property fileIds (base name: "file_ids")', function() {
      // uncomment below and update the code to test the property fileIds
      //var instance = new OpenapiOpenai.MessageObject();
      //expect(instance).to.be();
    });

    it('should have the property metadata (base name: "metadata")', function() {
      // uncomment below and update the code to test the property metadata
      //var instance = new OpenapiOpenai.MessageObject();
      //expect(instance).to.be();
    });

  });

}));
