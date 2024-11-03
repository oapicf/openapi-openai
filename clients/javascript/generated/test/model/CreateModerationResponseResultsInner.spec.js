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
    instance = new OpenapiOpenai.CreateModerationResponseResultsInner();
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

  describe('CreateModerationResponseResultsInner', function() {
    it('should create an instance of CreateModerationResponseResultsInner', function() {
      // uncomment below and update the code to test CreateModerationResponseResultsInner
      //var instance = new OpenapiOpenai.CreateModerationResponseResultsInner();
      //expect(instance).to.be.a(OpenapiOpenai.CreateModerationResponseResultsInner);
    });

    it('should have the property flagged (base name: "flagged")', function() {
      // uncomment below and update the code to test the property flagged
      //var instance = new OpenapiOpenai.CreateModerationResponseResultsInner();
      //expect(instance).to.be();
    });

    it('should have the property categories (base name: "categories")', function() {
      // uncomment below and update the code to test the property categories
      //var instance = new OpenapiOpenai.CreateModerationResponseResultsInner();
      //expect(instance).to.be();
    });

    it('should have the property categoryScores (base name: "category_scores")', function() {
      // uncomment below and update the code to test the property categoryScores
      //var instance = new OpenapiOpenai.CreateModerationResponseResultsInner();
      //expect(instance).to.be();
    });

  });

}));
