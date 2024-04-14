/**
 * The FineTuningController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/FineTuningService');
const cancelFineTuningJob = async (request, response) => {
  await Controller.handleRequest(request, response, service.cancelFineTuningJob);
};

const createFineTuningJob = async (request, response) => {
  await Controller.handleRequest(request, response, service.createFineTuningJob);
};

const listFineTuningEvents = async (request, response) => {
  await Controller.handleRequest(request, response, service.listFineTuningEvents);
};

const listFineTuningJobCheckpoints = async (request, response) => {
  await Controller.handleRequest(request, response, service.listFineTuningJobCheckpoints);
};

const listPaginatedFineTuningJobs = async (request, response) => {
  await Controller.handleRequest(request, response, service.listPaginatedFineTuningJobs);
};

const retrieveFineTuningJob = async (request, response) => {
  await Controller.handleRequest(request, response, service.retrieveFineTuningJob);
};


module.exports = {
  cancelFineTuningJob,
  createFineTuningJob,
  listFineTuningEvents,
  listFineTuningJobCheckpoints,
  listPaginatedFineTuningJobs,
  retrieveFineTuningJob,
};
