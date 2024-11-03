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
    instance = new OpenapiOpenai.CreateTranscription200Response();
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

  describe('CreateTranscription200Response', function() {
    it('should create an instance of CreateTranscription200Response', function() {
      // uncomment below and update the code to test CreateTranscription200Response
      //var instance = new OpenapiOpenai.CreateTranscription200Response();
      //expect(instance).to.be.a(OpenapiOpenai.CreateTranscription200Response);
    });

    it('should have the property text (base name: "text")', function() {
      // uncomment below and update the code to test the property text
      //var instance = new OpenapiOpenai.CreateTranscription200Response();
      //expect(instance).to.be();
    });

    it('should have the property language (base name: "language")', function() {
      // uncomment below and update the code to test the property language
      //var instance = new OpenapiOpenai.CreateTranscription200Response();
      //expect(instance).to.be();
    });

    it('should have the property duration (base name: "duration")', function() {
      // uncomment below and update the code to test the property duration
      //var instance = new OpenapiOpenai.CreateTranscription200Response();
      //expect(instance).to.be();
    });

    it('should have the property words (base name: "words")', function() {
      // uncomment below and update the code to test the property words
      //var instance = new OpenapiOpenai.CreateTranscription200Response();
      //expect(instance).to.be();
    });

    it('should have the property segments (base name: "segments")', function() {
      // uncomment below and update the code to test the property segments
      //var instance = new OpenapiOpenai.CreateTranscription200Response();
      //expect(instance).to.be();
    });

  });

}));
