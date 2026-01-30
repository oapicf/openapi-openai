/**
 * The ProjectsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/ProjectsService');
const archiveProject = async (request, response) => {
  await Controller.handleRequest(request, response, service.archiveProject);
};

const createProject = async (request, response) => {
  await Controller.handleRequest(request, response, service.createProject);
};

const createProjectServiceAccount = async (request, response) => {
  await Controller.handleRequest(request, response, service.createProjectServiceAccount);
};

const createProjectUser = async (request, response) => {
  await Controller.handleRequest(request, response, service.createProjectUser);
};

const deleteProjectApiKey = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteProjectApiKey);
};

const deleteProjectServiceAccount = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteProjectServiceAccount);
};

const deleteProjectUser = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteProjectUser);
};

const listProjectApiKeys = async (request, response) => {
  await Controller.handleRequest(request, response, service.listProjectApiKeys);
};

const listProjectRateLimits = async (request, response) => {
  await Controller.handleRequest(request, response, service.listProjectRateLimits);
};

const listProjectServiceAccounts = async (request, response) => {
  await Controller.handleRequest(request, response, service.listProjectServiceAccounts);
};

const listProjectUsers = async (request, response) => {
  await Controller.handleRequest(request, response, service.listProjectUsers);
};

const listProjects = async (request, response) => {
  await Controller.handleRequest(request, response, service.listProjects);
};

const modifyProject = async (request, response) => {
  await Controller.handleRequest(request, response, service.modifyProject);
};

const modifyProjectUser = async (request, response) => {
  await Controller.handleRequest(request, response, service.modifyProjectUser);
};

const retrieveProject = async (request, response) => {
  await Controller.handleRequest(request, response, service.retrieveProject);
};

const retrieveProjectApiKey = async (request, response) => {
  await Controller.handleRequest(request, response, service.retrieveProjectApiKey);
};

const retrieveProjectServiceAccount = async (request, response) => {
  await Controller.handleRequest(request, response, service.retrieveProjectServiceAccount);
};

const retrieveProjectUser = async (request, response) => {
  await Controller.handleRequest(request, response, service.retrieveProjectUser);
};

const updateProjectRateLimits = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateProjectRateLimits);
};


module.exports = {
  archiveProject,
  createProject,
  createProjectServiceAccount,
  createProjectUser,
  deleteProjectApiKey,
  deleteProjectServiceAccount,
  deleteProjectUser,
  listProjectApiKeys,
  listProjectRateLimits,
  listProjectServiceAccounts,
  listProjectUsers,
  listProjects,
  modifyProject,
  modifyProjectUser,
  retrieveProject,
  retrieveProjectApiKey,
  retrieveProjectServiceAccount,
  retrieveProjectUser,
  updateProjectRateLimits,
};
