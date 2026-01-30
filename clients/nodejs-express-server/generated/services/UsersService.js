/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Deletes a user from the organization.
*
* userUnderscoreid String The ID of the user.
* returns UserDeleteResponse
* */
const deleteUser = ({ userUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userUnderscoreid,
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
* Lists all of the users in the organization.
*
* limit Integer A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional)
* after String A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
* returns UserListResponse
* */
const listUsers = ({ limit, after }) => new Promise(
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
* Modifies a user's role in the organization.
*
* userUnderscoreid String The ID of the user.
* userRoleUpdateRequest UserRoleUpdateRequest The new user role to modify. This must be one of `owner` or `member`.
* returns User
* */
const modifyUser = ({ userUnderscoreid, userRoleUpdateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userUnderscoreid,
        userRoleUpdateRequest,
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
* Retrieves a user by their identifier.
*
* userUnderscoreid String The ID of the user.
* returns User
* */
const retrieveUser = ({ userUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userUnderscoreid,
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
  deleteUser,
  listUsers,
  modifyUser,
  retrieveUser,
};
