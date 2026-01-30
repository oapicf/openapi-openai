/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Upload a file that can be used across various endpoints. Individual files can be up to 512 MB, and the size of all files uploaded by one organization can be up to 100 GB.  The Assistants API supports files up to 2 million tokens and of specific file types. See the [Assistants Tools guide](/docs/assistants/tools) for details.  The Fine-tuning API only supports `.jsonl` files. The input also has certain required formats for fine-tuning [chat](/docs/api-reference/fine-tuning/chat-input) or [completions](/docs/api-reference/fine-tuning/completions-input) models.  The Batch API only supports `.jsonl` files up to 200 MB in size. The input also has a specific required [format](/docs/api-reference/batch/request-input).  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
*
* file File The File object (not file name) to be uploaded. 
* purpose String The intended purpose of the uploaded file.  Use \\\"assistants\\\" for [Assistants](/docs/api-reference/assistants) and [Message](/docs/api-reference/messages) files, \\\"vision\\\" for Assistants image file inputs, \\\"batch\\\" for [Batch API](/docs/guides/batch), and \\\"fine-tune\\\" for [Fine-tuning](/docs/api-reference/fine-tuning). 
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
* Returns a list of files.
*
* purpose String Only return files with the given purpose. (optional)
* limit Integer A limit on the number of objects to be returned. Limit can range between 1 and 10,000, and the default is 10,000.  (optional)
* order String Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  (optional)
* after String A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
* returns ListFilesResponse
* */
const listFiles = ({ purpose, limit, order, after }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        purpose,
        limit,
        order,
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
