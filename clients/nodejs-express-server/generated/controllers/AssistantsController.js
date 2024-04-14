/**
 * The AssistantsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/AssistantsService');
const cancelRun = async (request, response) => {
  await Controller.handleRequest(request, response, service.cancelRun);
};

const createAssistant = async (request, response) => {
  await Controller.handleRequest(request, response, service.createAssistant);
};

const createAssistantFile = async (request, response) => {
  await Controller.handleRequest(request, response, service.createAssistantFile);
};

const createMessage = async (request, response) => {
  await Controller.handleRequest(request, response, service.createMessage);
};

const createRun = async (request, response) => {
  await Controller.handleRequest(request, response, service.createRun);
};

const createThread = async (request, response) => {
  await Controller.handleRequest(request, response, service.createThread);
};

const createThreadAndRun = async (request, response) => {
  await Controller.handleRequest(request, response, service.createThreadAndRun);
};

const deleteAssistant = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteAssistant);
};

const deleteAssistantFile = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteAssistantFile);
};

const deleteThread = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteThread);
};

const getAssistant = async (request, response) => {
  await Controller.handleRequest(request, response, service.getAssistant);
};

const getAssistantFile = async (request, response) => {
  await Controller.handleRequest(request, response, service.getAssistantFile);
};

const getMessage = async (request, response) => {
  await Controller.handleRequest(request, response, service.getMessage);
};

const getMessageFile = async (request, response) => {
  await Controller.handleRequest(request, response, service.getMessageFile);
};

const getRun = async (request, response) => {
  await Controller.handleRequest(request, response, service.getRun);
};

const getRunStep = async (request, response) => {
  await Controller.handleRequest(request, response, service.getRunStep);
};

const getThread = async (request, response) => {
  await Controller.handleRequest(request, response, service.getThread);
};

const listAssistantFiles = async (request, response) => {
  await Controller.handleRequest(request, response, service.listAssistantFiles);
};

const listAssistants = async (request, response) => {
  await Controller.handleRequest(request, response, service.listAssistants);
};

const listMessageFiles = async (request, response) => {
  await Controller.handleRequest(request, response, service.listMessageFiles);
};

const listMessages = async (request, response) => {
  await Controller.handleRequest(request, response, service.listMessages);
};

const listRunSteps = async (request, response) => {
  await Controller.handleRequest(request, response, service.listRunSteps);
};

const listRuns = async (request, response) => {
  await Controller.handleRequest(request, response, service.listRuns);
};

const modifyAssistant = async (request, response) => {
  await Controller.handleRequest(request, response, service.modifyAssistant);
};

const modifyMessage = async (request, response) => {
  await Controller.handleRequest(request, response, service.modifyMessage);
};

const modifyRun = async (request, response) => {
  await Controller.handleRequest(request, response, service.modifyRun);
};

const modifyThread = async (request, response) => {
  await Controller.handleRequest(request, response, service.modifyThread);
};

const submitToolOuputsToRun = async (request, response) => {
  await Controller.handleRequest(request, response, service.submitToolOuputsToRun);
};


module.exports = {
  cancelRun,
  createAssistant,
  createAssistantFile,
  createMessage,
  createRun,
  createThread,
  createThreadAndRun,
  deleteAssistant,
  deleteAssistantFile,
  deleteThread,
  getAssistant,
  getAssistantFile,
  getMessage,
  getMessageFile,
  getRun,
  getRunStep,
  getThread,
  listAssistantFiles,
  listAssistants,
  listMessageFiles,
  listMessages,
  listRunSteps,
  listRuns,
  modifyAssistant,
  modifyMessage,
  modifyRun,
  modifyThread,
  submitToolOuputsToRun,
};
