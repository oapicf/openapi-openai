/**
 * The VectorStoresController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/VectorStoresService');
const cancelVectorStoreFileBatch = async (request, response) => {
  await Controller.handleRequest(request, response, service.cancelVectorStoreFileBatch);
};

const createVectorStore = async (request, response) => {
  await Controller.handleRequest(request, response, service.createVectorStore);
};

const createVectorStoreFile = async (request, response) => {
  await Controller.handleRequest(request, response, service.createVectorStoreFile);
};

const createVectorStoreFileBatch = async (request, response) => {
  await Controller.handleRequest(request, response, service.createVectorStoreFileBatch);
};

const deleteVectorStore = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteVectorStore);
};

const deleteVectorStoreFile = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteVectorStoreFile);
};

const getVectorStore = async (request, response) => {
  await Controller.handleRequest(request, response, service.getVectorStore);
};

const getVectorStoreFile = async (request, response) => {
  await Controller.handleRequest(request, response, service.getVectorStoreFile);
};

const getVectorStoreFileBatch = async (request, response) => {
  await Controller.handleRequest(request, response, service.getVectorStoreFileBatch);
};

const listFilesInVectorStoreBatch = async (request, response) => {
  await Controller.handleRequest(request, response, service.listFilesInVectorStoreBatch);
};

const listVectorStoreFiles = async (request, response) => {
  await Controller.handleRequest(request, response, service.listVectorStoreFiles);
};

const listVectorStores = async (request, response) => {
  await Controller.handleRequest(request, response, service.listVectorStores);
};

const modifyVectorStore = async (request, response) => {
  await Controller.handleRequest(request, response, service.modifyVectorStore);
};


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
