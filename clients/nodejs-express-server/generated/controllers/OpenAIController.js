/**
 * The OpenAIController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/OpenAIService');
const cancelFineTune = async (request, response) => {
  await Controller.handleRequest(request, response, service.cancelFineTune);
};

const createChatCompletion = async (request, response) => {
  await Controller.handleRequest(request, response, service.createChatCompletion);
};

const createCompletion = async (request, response) => {
  await Controller.handleRequest(request, response, service.createCompletion);
};

const createEdit = async (request, response) => {
  await Controller.handleRequest(request, response, service.createEdit);
};

const createEmbedding = async (request, response) => {
  await Controller.handleRequest(request, response, service.createEmbedding);
};

const createFile = async (request, response) => {
  await Controller.handleRequest(request, response, service.createFile);
};

const createFineTune = async (request, response) => {
  await Controller.handleRequest(request, response, service.createFineTune);
};

const createImage = async (request, response) => {
  await Controller.handleRequest(request, response, service.createImage);
};

const createImageEdit = async (request, response) => {
  await Controller.handleRequest(request, response, service.createImageEdit);
};

const createImageVariation = async (request, response) => {
  await Controller.handleRequest(request, response, service.createImageVariation);
};

const createModeration = async (request, response) => {
  await Controller.handleRequest(request, response, service.createModeration);
};

const createTranscription = async (request, response) => {
  await Controller.handleRequest(request, response, service.createTranscription);
};

const createTranslation = async (request, response) => {
  await Controller.handleRequest(request, response, service.createTranslation);
};

const deleteFile = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteFile);
};

const deleteModel = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteModel);
};

const downloadFile = async (request, response) => {
  await Controller.handleRequest(request, response, service.downloadFile);
};

const listFiles = async (request, response) => {
  await Controller.handleRequest(request, response, service.listFiles);
};

const listFineTuneEvents = async (request, response) => {
  await Controller.handleRequest(request, response, service.listFineTuneEvents);
};

const listFineTunes = async (request, response) => {
  await Controller.handleRequest(request, response, service.listFineTunes);
};

const listModels = async (request, response) => {
  await Controller.handleRequest(request, response, service.listModels);
};

const retrieveFile = async (request, response) => {
  await Controller.handleRequest(request, response, service.retrieveFile);
};

const retrieveFineTune = async (request, response) => {
  await Controller.handleRequest(request, response, service.retrieveFineTune);
};

const retrieveModel = async (request, response) => {
  await Controller.handleRequest(request, response, service.retrieveModel);
};


module.exports = {
  cancelFineTune,
  createChatCompletion,
  createCompletion,
  createEdit,
  createEmbedding,
  createFile,
  createFineTune,
  createImage,
  createImageEdit,
  createImageVariation,
  createModeration,
  createTranscription,
  createTranslation,
  deleteFile,
  deleteModel,
  downloadFile,
  listFiles,
  listFineTuneEvents,
  listFineTunes,
  listModels,
  retrieveFile,
  retrieveFineTune,
  retrieveModel,
};
