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
    instance = new OpenapiOpenai.ListRunsResponse();
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

  describe('ListRunsResponse', function() {
    it('should create an instance of ListRunsResponse', function() {
      // uncomment below and update the code to test ListRunsResponse
      //var instance = new OpenapiOpenai.ListRunsResponse();
      //expect(instance).to.be.a(OpenapiOpenai.ListRunsResponse);
    });

    it('should have the property object (base name: "object")', function() {
      // uncomment below and update the code to test the property object
      //var instance = new OpenapiOpenai.ListRunsResponse();
      //expect(instance).to.be();
    });

    it('should have the property data (base name: "data")', function() {
      // uncomment below and update the code to test the property data
      //var instance = new OpenapiOpenai.ListRunsResponse();
      //expect(instance).to.be();
    });

    it('should have the property firstId (base name: "first_id")', function() {
      // uncomment below and update the code to test the property firstId
      //var instance = new OpenapiOpenai.ListRunsResponse();
      //expect(instance).to.be();
    });

    it('should have the property lastId (base name: "last_id")', function() {
      // uncomment below and update the code to test the property lastId
      //var instance = new OpenapiOpenai.ListRunsResponse();
      //expect(instance).to.be();
    });

    it('should have the property hasMore (base name: "has_more")', function() {
      // uncomment below and update the code to test the property hasMore
      //var instance = new OpenapiOpenai.ListRunsResponse();
      //expect(instance).to.be();
    });

  });

}));
