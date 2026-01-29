/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Creates an embedding vector representing the input text.
*
* createEmbeddingRequest CreateEmbeddingRequest 
* returns CreateEmbeddingResponse
* */
const createEmbedding = ({ createEmbeddingRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        createEmbeddingRequest,
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
  createEmbedding,
};
