/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Create an organization admin API key
* Create a new admin-level API key for the organization.
*
* adminApiKeysCreateRequest AdminApiKeysCreateRequest 
* returns AdminApiKey
* */
const adminApiKeysCreate = ({ adminApiKeysCreateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        adminApiKeysCreateRequest,
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
* Delete an organization admin API key
* Delete the specified admin API key.
*
* keyUnderscoreid String 
* returns admin_api_keys_delete_200_response
* */
const adminApiKeysDelete = ({ keyUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        keyUnderscoreid,
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
* Retrieve a single organization API key
* Get details for a specific organization API key by its ID.
*
* keyUnderscoreid String 
* returns AdminApiKey
* */
const adminApiKeysGet = ({ keyUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        keyUnderscoreid,
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
* List organization API keys
* Retrieve a paginated list of organization admin API keys.
*
* after String  (optional)
* order String  (optional)
* limit Integer  (optional)
* returns ApiKeyList
* */
const adminApiKeysList = ({ after, order, limit }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        after,
        order,
        limit,
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
  adminApiKeysCreate,
  adminApiKeysDelete,
  adminApiKeysGet,
  adminApiKeysList,
};
