/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Immediately cancel a fine-tune job. 
*
* fineUnderscoretuningUnderscorejobUnderscoreid String The ID of the fine-tuning job to cancel. 
* returns FineTuningJob
* */
const cancelFineTuningJob = ({ fineUnderscoretuningUnderscorejobUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        fineUnderscoretuningUnderscorejobUnderscoreid,
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
* Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
*
* createFineTuningJobRequest CreateFineTuningJobRequest 
* returns FineTuningJob
* */
const createFineTuningJob = ({ createFineTuningJobRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        createFineTuningJobRequest,
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
* Get status updates for a fine-tuning job. 
*
* fineUnderscoretuningUnderscorejobUnderscoreid String The ID of the fine-tuning job to get events for. 
* after String Identifier for the last event from the previous pagination request. (optional)
* limit Integer Number of events to retrieve. (optional)
* returns ListFineTuningJobEventsResponse
* */
const listFineTuningEvents = ({ fineUnderscoretuningUnderscorejobUnderscoreid, after, limit }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        fineUnderscoretuningUnderscorejobUnderscoreid,
        after,
        limit,
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
* List checkpoints for a fine-tuning job. 
*
* fineUnderscoretuningUnderscorejobUnderscoreid String The ID of the fine-tuning job to get checkpoints for. 
* after String Identifier for the last checkpoint ID from the previous pagination request. (optional)
* limit Integer Number of checkpoints to retrieve. (optional)
* returns ListFineTuningJobCheckpointsResponse
* */
const listFineTuningJobCheckpoints = ({ fineUnderscoretuningUnderscorejobUnderscoreid, after, limit }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        fineUnderscoretuningUnderscorejobUnderscoreid,
        after,
        limit,
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
* List your organization's fine-tuning jobs 
*
* after String Identifier for the last job from the previous pagination request. (optional)
* limit Integer Number of fine-tuning jobs to retrieve. (optional)
* returns ListPaginatedFineTuningJobsResponse
* */
const listPaginatedFineTuningJobs = ({ after, limit }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        after,
        limit,
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
* Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
*
* fineUnderscoretuningUnderscorejobUnderscoreid String The ID of the fine-tuning job. 
* returns FineTuningJob
* */
const retrieveFineTuningJob = ({ fineUnderscoretuningUnderscorejobUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        fineUnderscoretuningUnderscorejobUnderscoreid,
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
  cancelFineTuningJob,
  createFineTuningJob,
  listFineTuningEvents,
  listFineTuningJobCheckpoints,
  listPaginatedFineTuningJobs,
  retrieveFineTuningJob,
};
