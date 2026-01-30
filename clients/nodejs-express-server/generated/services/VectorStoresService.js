/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.
*
* vectorUnderscorestoreUnderscoreid String The ID of the vector store that the file batch belongs to.
* batchUnderscoreid String The ID of the file batch to cancel.
* returns VectorStoreFileBatchObject
* */
const cancelVectorStoreFileBatch = ({ vectorUnderscorestoreUnderscoreid, batchUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        vectorUnderscorestoreUnderscoreid,
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
* Create a vector store.
*
* createVectorStoreRequest CreateVectorStoreRequest 
* returns VectorStoreObject
* */
const createVectorStore = ({ createVectorStoreRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        createVectorStoreRequest,
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
* Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).
*
* vectorUnderscorestoreUnderscoreid String The ID of the vector store for which to create a File. 
* createVectorStoreFileRequest CreateVectorStoreFileRequest 
* returns VectorStoreFileObject
* */
const createVectorStoreFile = ({ vectorUnderscorestoreUnderscoreid, createVectorStoreFileRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        vectorUnderscorestoreUnderscoreid,
        createVectorStoreFileRequest,
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
* Create a vector store file batch.
*
* vectorUnderscorestoreUnderscoreid String The ID of the vector store for which to create a File Batch. 
* createVectorStoreFileBatchRequest CreateVectorStoreFileBatchRequest 
* returns VectorStoreFileBatchObject
* */
const createVectorStoreFileBatch = ({ vectorUnderscorestoreUnderscoreid, createVectorStoreFileBatchRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        vectorUnderscorestoreUnderscoreid,
        createVectorStoreFileBatchRequest,
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
* Delete a vector store.
*
* vectorUnderscorestoreUnderscoreid String The ID of the vector store to delete.
* returns DeleteVectorStoreResponse
* */
const deleteVectorStore = ({ vectorUnderscorestoreUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        vectorUnderscorestoreUnderscoreid,
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
* Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.
*
* vectorUnderscorestoreUnderscoreid String The ID of the vector store that the file belongs to.
* fileUnderscoreid String The ID of the file to delete.
* returns DeleteVectorStoreFileResponse
* */
const deleteVectorStoreFile = ({ vectorUnderscorestoreUnderscoreid, fileUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        vectorUnderscorestoreUnderscoreid,
        fileUnderscoreid,
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
* Retrieves a vector store.
*
* vectorUnderscorestoreUnderscoreid String The ID of the vector store to retrieve.
* returns VectorStoreObject
* */
const getVectorStore = ({ vectorUnderscorestoreUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        vectorUnderscorestoreUnderscoreid,
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
* Retrieves a vector store file.
*
* vectorUnderscorestoreUnderscoreid String The ID of the vector store that the file belongs to.
* fileUnderscoreid String The ID of the file being retrieved.
* returns VectorStoreFileObject
* */
const getVectorStoreFile = ({ vectorUnderscorestoreUnderscoreid, fileUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        vectorUnderscorestoreUnderscoreid,
        fileUnderscoreid,
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
* Retrieves a vector store file batch.
*
* vectorUnderscorestoreUnderscoreid String The ID of the vector store that the file batch belongs to.
* batchUnderscoreid String The ID of the file batch being retrieved.
* returns VectorStoreFileBatchObject
* */
const getVectorStoreFileBatch = ({ vectorUnderscorestoreUnderscoreid, batchUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        vectorUnderscorestoreUnderscoreid,
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
* Returns a list of vector store files in a batch.
*
* vectorUnderscorestoreUnderscoreid String The ID of the vector store that the files belong to.
* batchUnderscoreid String The ID of the file batch that the files belong to.
* limit Integer A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional)
* order String Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  (optional)
* after String A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
* before String A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (optional)
* filter String Filter by file status. One of `in_progress`, `completed`, `failed`, `cancelled`. (optional)
* returns ListVectorStoreFilesResponse
* */
const listFilesInVectorStoreBatch = ({ vectorUnderscorestoreUnderscoreid, batchUnderscoreid, limit, order, after, before, filter }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        vectorUnderscorestoreUnderscoreid,
        batchUnderscoreid,
        limit,
        order,
        after,
        before,
        filter,
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
* Returns a list of vector store files.
*
* vectorUnderscorestoreUnderscoreid String The ID of the vector store that the files belong to.
* limit Integer A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional)
* order String Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  (optional)
* after String A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
* before String A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (optional)
* filter String Filter by file status. One of `in_progress`, `completed`, `failed`, `cancelled`. (optional)
* returns ListVectorStoreFilesResponse
* */
const listVectorStoreFiles = ({ vectorUnderscorestoreUnderscoreid, limit, order, after, before, filter }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        vectorUnderscorestoreUnderscoreid,
        limit,
        order,
        after,
        before,
        filter,
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
* Returns a list of vector stores.
*
* limit Integer A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional)
* order String Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  (optional)
* after String A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
* before String A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (optional)
* returns ListVectorStoresResponse
* */
const listVectorStores = ({ limit, order, after, before }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        limit,
        order,
        after,
        before,
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
* Modifies a vector store.
*
* vectorUnderscorestoreUnderscoreid String The ID of the vector store to modify.
* updateVectorStoreRequest UpdateVectorStoreRequest 
* returns VectorStoreObject
* */
const modifyVectorStore = ({ vectorUnderscorestoreUnderscoreid, updateVectorStoreRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        vectorUnderscorestoreUnderscoreid,
        updateVectorStoreRequest,
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
  cancelVectorStoreFileBatch,
  createVectorStore,
  createVectorStoreFile,
  createVectorStoreFileBatch,
  deleteVectorStore,
  deleteVectorStoreFile,
  getVectorStore,
  getVectorStoreFile,
  getVectorStoreFileBatch,
  listFilesInVectorStoreBatch,
  listVectorStoreFiles,
  listVectorStores,
  modifyVectorStore,
};
