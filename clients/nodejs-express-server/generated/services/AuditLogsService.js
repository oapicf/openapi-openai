/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* List user actions and configuration changes within this organization.
*
* effectiveUnderscoreat ListAuditLogsEffectiveAtParameter Return only events whose `effective_at` (Unix seconds) is in this range. (optional)
* projectUnderscoreidsLeft_Square_BracketRight_Square_Bracket List Return only events for these projects. (optional)
* eventUnderscoretypesLeft_Square_BracketRight_Square_Bracket List Return only events with a `type` in one of these values. For example, `project.created`. For all options, see the documentation for the [audit log object](/docs/api-reference/audit-logs/object). (optional)
* actorUnderscoreidsLeft_Square_BracketRight_Square_Bracket List Return only events performed by these actors. Can be a user ID, a service account ID, or an api key tracking ID. (optional)
* actorUnderscoreemailsLeft_Square_BracketRight_Square_Bracket List Return only events performed by users with these emails. (optional)
* resourceUnderscoreidsLeft_Square_BracketRight_Square_Bracket List Return only events performed on these targets. For example, a project ID updated. (optional)
* limit Integer A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional)
* after String A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
* before String A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (optional)
* returns ListAuditLogsResponse
* */
const listAuditLogs = ({ effectiveUnderscoreat, projectUnderscoreidsLeft_Square_BracketRight_Square_Bracket, eventUnderscoretypesLeft_Square_BracketRight_Square_Bracket, actorUnderscoreidsLeft_Square_BracketRight_Square_Bracket, actorUnderscoreemailsLeft_Square_BracketRight_Square_Bracket, resourceUnderscoreidsLeft_Square_BracketRight_Square_Bracket, limit, after, before }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        effectiveUnderscoreat,
        projectUnderscoreidsLeft_Square_BracketRight_Square_Bracket,
        eventUnderscoretypesLeft_Square_BracketRight_Square_Bracket,
        actorUnderscoreidsLeft_Square_BracketRight_Square_Bracket,
        actorUnderscoreemailsLeft_Square_BracketRight_Square_Bracket,
        resourceUnderscoreidsLeft_Square_BracketRight_Square_Bracket,
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

module.exports = {
  listAuditLogs,
};
