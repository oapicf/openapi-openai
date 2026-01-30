/**
 * The InvitesController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/InvitesService');
const deleteInvite = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteInvite);
};

const inviteUser = async (request, response) => {
  await Controller.handleRequest(request, response, service.inviteUser);
};

const listInvites = async (request, response) => {
  await Controller.handleRequest(request, response, service.listInvites);
};

const retrieveInvite = async (request, response) => {
  await Controller.handleRequest(request, response, service.retrieveInvite);
};


module.exports = {
  deleteInvite,
  inviteUser,
  listInvites,
  retrieveInvite,
};
