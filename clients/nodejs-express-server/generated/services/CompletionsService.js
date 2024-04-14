/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Creates a completion for the provided prompt and parameters.
*
* createCompletionRequest CreateCompletionRequest 
* returns CreateCompletionResponse
* */
const createCompletion = ({ createCompletionRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        createCompletionRequest,
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
  createCompletion,
};
