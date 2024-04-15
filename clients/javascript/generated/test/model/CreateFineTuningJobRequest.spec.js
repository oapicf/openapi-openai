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
    instance = new OpenapiOpenai.CreateFineTuningJobRequest();
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

  describe('CreateFineTuningJobRequest', function() {
    it('should create an instance of CreateFineTuningJobRequest', function() {
      // uncomment below and update the code to test CreateFineTuningJobRequest
      //var instance = new OpenapiOpenai.CreateFineTuningJobRequest();
      //expect(instance).to.be.a(OpenapiOpenai.CreateFineTuningJobRequest);
    });

    it('should have the property model (base name: "model")', function() {
      // uncomment below and update the code to test the property model
      //var instance = new OpenapiOpenai.CreateFineTuningJobRequest();
      //expect(instance).to.be();
    });

    it('should have the property trainingFile (base name: "training_file")', function() {
      // uncomment below and update the code to test the property trainingFile
      //var instance = new OpenapiOpenai.CreateFineTuningJobRequest();
      //expect(instance).to.be();
    });

    it('should have the property hyperparameters (base name: "hyperparameters")', function() {
      // uncomment below and update the code to test the property hyperparameters
      //var instance = new OpenapiOpenai.CreateFineTuningJobRequest();
      //expect(instance).to.be();
    });

    it('should have the property suffix (base name: "suffix")', function() {
      // uncomment below and update the code to test the property suffix
      //var instance = new OpenapiOpenai.CreateFineTuningJobRequest();
      //expect(instance).to.be();
    });

    it('should have the property validationFile (base name: "validation_file")', function() {
      // uncomment below and update the code to test the property validationFile
      //var instance = new OpenapiOpenai.CreateFineTuningJobRequest();
      //expect(instance).to.be();
    });

    it('should have the property integrations (base name: "integrations")', function() {
      // uncomment below and update the code to test the property integrations
      //var instance = new OpenapiOpenai.CreateFineTuningJobRequest();
      //expect(instance).to.be();
    });

    it('should have the property seed (base name: "seed")', function() {
      // uncomment below and update the code to test the property seed
      //var instance = new OpenapiOpenai.CreateFineTuningJobRequest();
      //expect(instance).to.be();
    });

  });

}));