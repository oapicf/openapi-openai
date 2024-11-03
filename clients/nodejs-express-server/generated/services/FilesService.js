/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports `.jsonl` files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
*
* file File The File object (not file name) to be uploaded. 
* purpose String The intended purpose of the uploaded file.  Use \\\"fine-tune\\\" for [Fine-tuning](/docs/api-reference/fine-tuning) and \\\"assistants\\\" for [Assistants](/docs/api-reference/assistants) and [Messages](/docs/api-reference/messages). This allows us to validate the format of the uploaded file is correct for fine-tuning. 
* returns OpenAIFile
* */
const createFile = ({ file, purpose }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        file,
        purpose,
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
* Delete a file.
*
* fileUnderscoreid String The ID of the file to use for this request.
* returns DeleteFileResponse
* */
const deleteFile = ({ fileUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        fileUnderscoreid,
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
* Returns the contents of the specified file.
*
* fileUnderscoreid String The ID of the file to use for this request.
* returns String
* */
const downloadFile = ({ fileUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        fileUnderscoreid,
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
* Returns a list of files that belong to the user's organization.
*
* purpose String Only return files with the given purpose. (optional)
* returns ListFilesResponse
* */
const listFiles = ({ purpose }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        purpose,
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
* Returns information about a specific file.
*
* fileUnderscoreid String The ID of the file to use for this request.
* returns OpenAIFile
* */
const retrieveFile = ({ fileUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        fileUnderscoreid,
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
  createFile,
  deleteFile,
  downloadFile,
  listFiles,
  retrieveFile,
};
