/**
 * The FilesController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/FilesService');
const createFile = async (request, response) => {
  await Controller.handleRequest(request, response, service.createFile);
};

const deleteFile = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteFile);
};

const downloadFile = async (request, response) => {
  await Controller.handleRequest(request, response, service.downloadFile);
};

const listFiles = async (request, response) => {
  await Controller.handleRequest(request, response, service.listFiles);
};

const retrieveFile = async (request, response) => {
  await Controller.handleRequest(request, response, service.retrieveFile);
};


module.exports = {
  createFile,
  deleteFile,
  downloadFile,
  listFiles,
  retrieveFile,
};
