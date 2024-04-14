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
    instance = new OpenapiOpenai.FineTuningJobIntegrationsInner();
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

  describe('FineTuningJobIntegrationsInner', function() {
    it('should create an instance of FineTuningJobIntegrationsInner', function() {
      // uncomment below and update the code to test FineTuningJobIntegrationsInner
      //var instance = new OpenapiOpenai.FineTuningJobIntegrationsInner();
      //expect(instance).to.be.a(OpenapiOpenai.FineTuningJobIntegrationsInner);
    });

    it('should have the property type (base name: "type")', function() {
      // uncomment below and update the code to test the property type
      //var instance = new OpenapiOpenai.FineTuningJobIntegrationsInner();
      //expect(instance).to.be();
    });

    it('should have the property wandb (base name: "wandb")', function() {
      // uncomment below and update the code to test the property wandb
      //var instance = new OpenapiOpenai.FineTuningJobIntegrationsInner();
      //expect(instance).to.be();
    });

  });

}));
