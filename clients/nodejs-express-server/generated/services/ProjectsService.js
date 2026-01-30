/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Archives a project in the organization. Archived projects cannot be used or updated.
*
* projectUnderscoreid String The ID of the project.
* returns Project
* */
const archiveProject = ({ projectUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectUnderscoreid,
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
* Create a new project in the organization. Projects can be created and archived, but cannot be deleted.
*
* projectCreateRequest ProjectCreateRequest The project create request payload.
* returns Project
* */
const createProject = ({ projectCreateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectCreateRequest,
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
* Creates a new service account in the project. This also returns an unredacted API key for the service account.
*
* projectUnderscoreid String The ID of the project.
* projectServiceAccountCreateRequest ProjectServiceAccountCreateRequest The project service account create request payload.
* returns ProjectServiceAccountCreateResponse
* */
const createProjectServiceAccount = ({ projectUnderscoreid, projectServiceAccountCreateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectUnderscoreid,
        projectServiceAccountCreateRequest,
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
* Adds a user to the project. Users must already be members of the organization to be added to a project.
*
* projectUnderscoreid String The ID of the project.
* projectUserCreateRequest ProjectUserCreateRequest The project user create request payload.
* returns ProjectUser
* */
const createProjectUser = ({ projectUnderscoreid, projectUserCreateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectUnderscoreid,
        projectUserCreateRequest,
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
* Deletes an API key from the project.
*
* projectUnderscoreid String The ID of the project.
* keyUnderscoreid String The ID of the API key.
* returns ProjectApiKeyDeleteResponse
* */
const deleteProjectApiKey = ({ projectUnderscoreid, keyUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectUnderscoreid,
        keyUnderscoreid,
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
* Deletes a service account from the project.
*
* projectUnderscoreid String The ID of the project.
* serviceUnderscoreaccountUnderscoreid String The ID of the service account.
* returns ProjectServiceAccountDeleteResponse
* */
const deleteProjectServiceAccount = ({ projectUnderscoreid, serviceUnderscoreaccountUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectUnderscoreid,
        serviceUnderscoreaccountUnderscoreid,
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
* Deletes a user from the project.
*
* projectUnderscoreid String The ID of the project.
* userUnderscoreid String The ID of the user.
* returns ProjectUserDeleteResponse
* */
const deleteProjectUser = ({ projectUnderscoreid, userUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectUnderscoreid,
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
* Returns a list of API keys in the project.
*
* projectUnderscoreid String The ID of the project.
* limit Integer A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional)
* after String A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
* returns ProjectApiKeyListResponse
* */
const listProjectApiKeys = ({ projectUnderscoreid, limit, after }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectUnderscoreid,
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
* Returns the rate limits per model for a project.
*
* projectUnderscoreid String The ID of the project.
* limit Integer A limit on the number of objects to be returned. The default is 100.  (optional)
* after String A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
* before String A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, beginning with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (optional)
* returns ProjectRateLimitListResponse
* */
const listProjectRateLimits = ({ projectUnderscoreid, limit, after, before }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectUnderscoreid,
        limit,
        after,
        before,
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
* Returns a list of service accounts in the project.
*
* projectUnderscoreid String The ID of the project.
* limit Integer A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional)
* after String A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
* returns ProjectServiceAccountListResponse
* */
const listProjectServiceAccounts = ({ projectUnderscoreid, limit, after }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectUnderscoreid,
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
* Returns a list of users in the project.
*
* projectUnderscoreid String The ID of the project.
* limit Integer A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional)
* after String A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
* returns ProjectUserListResponse
* */
const listProjectUsers = ({ projectUnderscoreid, limit, after }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectUnderscoreid,
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
* Returns a list of projects.
*
* limit Integer A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional)
* after String A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
* includeUnderscorearchived Boolean If `true` returns all projects including those that have been `archived`. Archived projects are not included by default. (optional)
* returns ProjectListResponse
* */
const listProjects = ({ limit, after, includeUnderscorearchived }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        limit,
        after,
        includeUnderscorearchived,
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
* Modifies a project in the organization.
*
* projectUnderscoreid String The ID of the project.
* projectUpdateRequest ProjectUpdateRequest The project update request payload.
* returns Project
* */
const modifyProject = ({ projectUnderscoreid, projectUpdateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectUnderscoreid,
        projectUpdateRequest,
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
* Modifies a user's role in the project.
*
* projectUnderscoreid String The ID of the project.
* userUnderscoreid String The ID of the user.
* projectUserUpdateRequest ProjectUserUpdateRequest The project user update request payload.
* returns ProjectUser
* */
const modifyProjectUser = ({ projectUnderscoreid, userUnderscoreid, projectUserUpdateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectUnderscoreid,
        userUnderscoreid,
        projectUserUpdateRequest,
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
* Retrieves a project.
*
* projectUnderscoreid String The ID of the project.
* returns Project
* */
const retrieveProject = ({ projectUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectUnderscoreid,
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
* Retrieves an API key in the project.
*
* projectUnderscoreid String The ID of the project.
* keyUnderscoreid String The ID of the API key.
* returns ProjectApiKey
* */
const retrieveProjectApiKey = ({ projectUnderscoreid, keyUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectUnderscoreid,
        keyUnderscoreid,
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
* Retrieves a service account in the project.
*
* projectUnderscoreid String The ID of the project.
* serviceUnderscoreaccountUnderscoreid String The ID of the service account.
* returns ProjectServiceAccount
* */
const retrieveProjectServiceAccount = ({ projectUnderscoreid, serviceUnderscoreaccountUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectUnderscoreid,
        serviceUnderscoreaccountUnderscoreid,
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
* Retrieves a user in the project.
*
* projectUnderscoreid String The ID of the project.
* userUnderscoreid String The ID of the user.
* returns ProjectUser
* */
const retrieveProjectUser = ({ projectUnderscoreid, userUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectUnderscoreid,
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
* Updates a project rate limit.
*
* projectUnderscoreid String The ID of the project.
* rateUnderscorelimitUnderscoreid String The ID of the rate limit.
* projectRateLimitUpdateRequest ProjectRateLimitUpdateRequest The project rate limit update request payload.
* returns ProjectRateLimit
* */
const updateProjectRateLimits = ({ projectUnderscoreid, rateUnderscorelimitUnderscoreid, projectRateLimitUpdateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectUnderscoreid,
        rateUnderscorelimitUnderscoreid,
        projectRateLimitUpdateRequest,
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
