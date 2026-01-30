/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Classifies if text and/or image inputs are potentially harmful. Learn more in the [moderation guide](/docs/guides/moderation). 
*
* createModerationRequest CreateModerationRequest 
* returns CreateModerationResponse
* */
const createModeration = ({ createModerationRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        createModerationRequest,
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
  createModeration,
};
