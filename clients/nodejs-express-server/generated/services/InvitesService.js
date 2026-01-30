/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Delete an invite. If the invite has already been accepted, it cannot be deleted.
*
* inviteUnderscoreid String The ID of the invite to delete.
* returns InviteDeleteResponse
* */
const deleteInvite = ({ inviteUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        inviteUnderscoreid,
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
* Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.
*
* inviteRequest InviteRequest The invite request payload.
* returns Invite
* */
const inviteUser = ({ inviteRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        inviteRequest,
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
* Returns a list of invites in the organization.
*
* limit Integer A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional)
* after String A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
* returns InviteListResponse
* */
const listInvites = ({ limit, after }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        limit,
        after,
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
* Retrieves an invite.
*
* inviteUnderscoreid String The ID of the invite to retrieve.
* returns Invite
* */
const retrieveInvite = ({ inviteUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        inviteUnderscoreid,
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
  deleteInvite,
  inviteUser,
  listInvites,
  retrieveInvite,
};
