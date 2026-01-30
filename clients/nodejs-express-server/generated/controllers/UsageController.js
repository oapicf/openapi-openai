/**
 * The UsageController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/UsageService');
const usageAudioSpeeches = async (request, response) => {
  await Controller.handleRequest(request, response, service.usageAudioSpeeches);
};

const usageAudioTranscriptions = async (request, response) => {
  await Controller.handleRequest(request, response, service.usageAudioTranscriptions);
};

const usageCodeInterpreterSessions = async (request, response) => {
  await Controller.handleRequest(request, response, service.usageCodeInterpreterSessions);
};

const usageCompletions = async (request, response) => {
  await Controller.handleRequest(request, response, service.usageCompletions);
};

const usageCosts = async (request, response) => {
  await Controller.handleRequest(request, response, service.usageCosts);
};

const usageEmbeddings = async (request, response) => {
  await Controller.handleRequest(request, response, service.usageEmbeddings);
};

const usageImages = async (request, response) => {
  await Controller.handleRequest(request, response, service.usageImages);
};

const usageModerations = async (request, response) => {
  await Controller.handleRequest(request, response, service.usageModerations);
};

const usageVectorStores = async (request, response) => {
  await Controller.handleRequest(request, response, service.usageVectorStores);
};


module.exports = {
  usageAudioSpeeches,
  usageAudioTranscriptions,
  usageCodeInterpreterSessions,
  usageCompletions,
  usageCosts,
  usageEmbeddings,
  usageImages,
  usageModerations,
  usageVectorStores,
};
