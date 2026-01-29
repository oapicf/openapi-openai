/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Creates a model response for the given chat conversation.
*
* createChatCompletionRequest CreateChatCompletionRequest 
* returns CreateChatCompletionResponse
* */
const createChatCompletion = ({ createChatCompletionRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        createChatCompletionRequest,
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
  createChatCompletion,
};
