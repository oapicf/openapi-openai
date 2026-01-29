/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
*
* model String The model to delete
* returns DeleteModelResponse
* */
const deleteModel = ({ model }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        model,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Lists the currently available models, and provides basic information about each one such as the owner and availability.
*
* returns ListModelsResponse
* */
const listModels = () => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
*
* model String The ID of the model to use for this request
* returns Model
* */
const retrieveModel = ({ model }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        model,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);

module.exports = {
  deleteModel,
  listModels,
  retrieveModel,
};
