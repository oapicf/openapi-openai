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
    instance = new OpenapiOpenai.CreateFineTuneRequest();
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

  describe('CreateFineTuneRequest', function() {
    it('should create an instance of CreateFineTuneRequest', function() {
      // uncomment below and update the code to test CreateFineTuneRequest
      //var instance = new OpenapiOpenai.CreateFineTuneRequest();
      //expect(instance).to.be.a(OpenapiOpenai.CreateFineTuneRequest);
    });

    it('should have the property trainingFile (base name: "training_file")', function() {
      // uncomment below and update the code to test the property trainingFile
      //var instance = new OpenapiOpenai.CreateFineTuneRequest();
      //expect(instance).to.be();
    });

    it('should have the property validationFile (base name: "validation_file")', function() {
      // uncomment below and update the code to test the property validationFile
      //var instance = new OpenapiOpenai.CreateFineTuneRequest();
      //expect(instance).to.be();
    });

    it('should have the property model (base name: "model")', function() {
      // uncomment below and update the code to test the property model
      //var instance = new OpenapiOpenai.CreateFineTuneRequest();
      //expect(instance).to.be();
    });

    it('should have the property nEpochs (base name: "n_epochs")', function() {
      // uncomment below and update the code to test the property nEpochs
      //var instance = new OpenapiOpenai.CreateFineTuneRequest();
      //expect(instance).to.be();
    });

    it('should have the property batchSize (base name: "batch_size")', function() {
      // uncomment below and update the code to test the property batchSize
      //var instance = new OpenapiOpenai.CreateFineTuneRequest();
      //expect(instance).to.be();
    });

    it('should have the property learningRateMultiplier (base name: "learning_rate_multiplier")', function() {
      // uncomment below and update the code to test the property learningRateMultiplier
      //var instance = new OpenapiOpenai.CreateFineTuneRequest();
      //expect(instance).to.be();
    });

    it('should have the property promptLossWeight (base name: "prompt_loss_weight")', function() {
      // uncomment below and update the code to test the property promptLossWeight
      //var instance = new OpenapiOpenai.CreateFineTuneRequest();
      //expect(instance).to.be();
    });

    it('should have the property computeClassificationMetrics (base name: "compute_classification_metrics")', function() {
      // uncomment below and update the code to test the property computeClassificationMetrics
      //var instance = new OpenapiOpenai.CreateFineTuneRequest();
      //expect(instance).to.be();
    });

    it('should have the property classificationNClasses (base name: "classification_n_classes")', function() {
      // uncomment below and update the code to test the property classificationNClasses
      //var instance = new OpenapiOpenai.CreateFineTuneRequest();
      //expect(instance).to.be();
    });

    it('should have the property classificationPositiveClass (base name: "classification_positive_class")', function() {
      // uncomment below and update the code to test the property classificationPositiveClass
      //var instance = new OpenapiOpenai.CreateFineTuneRequest();
      //expect(instance).to.be();
    });

    it('should have the property classificationBetas (base name: "classification_betas")', function() {
      // uncomment below and update the code to test the property classificationBetas
      //var instance = new OpenapiOpenai.CreateFineTuneRequest();
      //expect(instance).to.be();
    });

    it('should have the property suffix (base name: "suffix")', function() {
      // uncomment below and update the code to test the property suffix
      //var instance = new OpenapiOpenai.CreateFineTuneRequest();
      //expect(instance).to.be();
    });

  });

}));