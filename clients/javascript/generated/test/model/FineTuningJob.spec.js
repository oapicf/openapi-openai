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
    instance = new OpenapiOpenai.FineTuningJob();
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

  describe('FineTuningJob', function() {
    it('should create an instance of FineTuningJob', function() {
      // uncomment below and update the code to test FineTuningJob
      //var instance = new OpenapiOpenai.FineTuningJob();
      //expect(instance).to.be.a(OpenapiOpenai.FineTuningJob);
    });

    it('should have the property id (base name: "id")', function() {
      // uncomment below and update the code to test the property id
      //var instance = new OpenapiOpenai.FineTuningJob();
      //expect(instance).to.be();
    });

    it('should have the property createdAt (base name: "created_at")', function() {
      // uncomment below and update the code to test the property createdAt
      //var instance = new OpenapiOpenai.FineTuningJob();
      //expect(instance).to.be();
    });

    it('should have the property error (base name: "error")', function() {
      // uncomment below and update the code to test the property error
      //var instance = new OpenapiOpenai.FineTuningJob();
      //expect(instance).to.be();
    });

    it('should have the property fineTunedModel (base name: "fine_tuned_model")', function() {
      // uncomment below and update the code to test the property fineTunedModel
      //var instance = new OpenapiOpenai.FineTuningJob();
      //expect(instance).to.be();
    });

    it('should have the property finishedAt (base name: "finished_at")', function() {
      // uncomment below and update the code to test the property finishedAt
      //var instance = new OpenapiOpenai.FineTuningJob();
      //expect(instance).to.be();
    });

    it('should have the property hyperparameters (base name: "hyperparameters")', function() {
      // uncomment below and update the code to test the property hyperparameters
      //var instance = new OpenapiOpenai.FineTuningJob();
      //expect(instance).to.be();
    });

    it('should have the property model (base name: "model")', function() {
      // uncomment below and update the code to test the property model
      //var instance = new OpenapiOpenai.FineTuningJob();
      //expect(instance).to.be();
    });

    it('should have the property object (base name: "object")', function() {
      // uncomment below and update the code to test the property object
      //var instance = new OpenapiOpenai.FineTuningJob();
      //expect(instance).to.be();
    });

    it('should have the property organizationId (base name: "organization_id")', function() {
      // uncomment below and update the code to test the property organizationId
      //var instance = new OpenapiOpenai.FineTuningJob();
      //expect(instance).to.be();
    });

    it('should have the property resultFiles (base name: "result_files")', function() {
      // uncomment below and update the code to test the property resultFiles
      //var instance = new OpenapiOpenai.FineTuningJob();
      //expect(instance).to.be();
    });

    it('should have the property status (base name: "status")', function() {
      // uncomment below and update the code to test the property status
      //var instance = new OpenapiOpenai.FineTuningJob();
      //expect(instance).to.be();
    });

    it('should have the property trainedTokens (base name: "trained_tokens")', function() {
      // uncomment below and update the code to test the property trainedTokens
      //var instance = new OpenapiOpenai.FineTuningJob();
      //expect(instance).to.be();
    });

    it('should have the property trainingFile (base name: "training_file")', function() {
      // uncomment below and update the code to test the property trainingFile
      //var instance = new OpenapiOpenai.FineTuningJob();
      //expect(instance).to.be();
    });

    it('should have the property validationFile (base name: "validation_file")', function() {
      // uncomment below and update the code to test the property validationFile
      //var instance = new OpenapiOpenai.FineTuningJob();
      //expect(instance).to.be();
    });

    it('should have the property integrations (base name: "integrations")', function() {
      // uncomment below and update the code to test the property integrations
      //var instance = new OpenapiOpenai.FineTuningJob();
      //expect(instance).to.be();
    });

    it('should have the property seed (base name: "seed")', function() {
      // uncomment below and update the code to test the property seed
      //var instance = new OpenapiOpenai.FineTuningJob();
      //expect(instance).to.be();
    });

  });

}));
