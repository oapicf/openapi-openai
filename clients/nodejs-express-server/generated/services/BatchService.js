/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Cancels an in-progress batch. The batch will be in status `cancelling` for up to 10 minutes, before changing to `cancelled`, where it will have partial results (if any) available in the output file.
*
* batchUnderscoreid String The ID of the batch to cancel.
* returns Batch
* */
const cancelBatch = ({ batchUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        batchUnderscoreid,
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
* Creates and executes a batch from an uploaded file of requests
*
* createBatchRequest CreateBatchRequest 
* returns Batch
* */
const createBatch = ({ createBatchRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        createBatchRequest,
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
* List your organization's batches.
*
* after String A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
* limit Integer A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional)
* returns ListBatchesResponse
* */
const listBatches = ({ after, limit }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        after,
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
/**
* Retrieves a batch.
*
* batchUnderscoreid String The ID of the batch to retrieve.
* returns Batch
* */
const retrieveBatch = ({ batchUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        batchUnderscoreid,
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
  cancelBatch,
  createBatch,
  listBatches,
  retrieveBatch,
};
