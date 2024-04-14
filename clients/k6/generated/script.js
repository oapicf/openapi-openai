/*
 * OpenAI API
 * APIs for sampling from and fine-tuning language models
 *
 * OpenAPI spec version: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://github.com/OpenAPITools/openapi-generator
 *
 * Generator version: 7.4.0
 */


import http from "k6/http";
import { group, check, sleep } from "k6";

const BASE_URL = "https://api.openai.com/v1";
// Sleep duration between successive requests.
// You might want to edit the value of this variable or remove calls to the sleep function on the script.
const SLEEP_DURATION = 0.1;
// Global variables should be initialized.

export default function() {
    group("/fine-tunes/{fine_tune_id}/cancel", () => {
        let fineTuneId = 'TODO_EDIT_THE_FINE_TUNE_ID'; // specify value as there is no example value for this parameter in OpenAPI spec

        // Request No. 1: cancelFineTune
        {
            let url = BASE_URL + `/fine-tunes/${fine_tune_id}/cancel`;
            let request = http.post(url);

            check(request, {
                "OK": (r) => r.status === 200
            });
        }
    });

    group("/files/{file_id}/content", () => {
        let fileId = 'TODO_EDIT_THE_FILE_ID'; // specify value as there is no example value for this parameter in OpenAPI spec

        // Request No. 1: downloadFile
        {
            let url = BASE_URL + `/files/${file_id}/content`;
            let request = http.get(url);

            check(request, {
                "OK": (r) => r.status === 200
            });
        }
    });

    group("/images/generations", () => {

        // Request No. 1: createImage
        {
            let url = BASE_URL + `/images/generations`;
            // TODO: edit the parameters of the request body.
            let body = {"prompt": "string", "n": "integer", "size": "string", "responseFormat": "string", "user": "string"};
            let params = {headers: {"Content-Type": "application/json", "Accept": "application/json"}};
            let request = http.post(url, JSON.stringify(body), params);

            check(request, {
                "OK": (r) => r.status === 200
            });
        }
    });

    group("/edits", () => {

        // Request No. 1: createEdit
        {
            let url = BASE_URL + `/edits`;
            // TODO: edit the parameters of the request body.
            let body = {"model": {}, "input": "string", "instruction": "string", "n": "integer", "temperature": "bigdecimal", "topP": "bigdecimal"};
            let params = {headers: {"Content-Type": "application/json", "Accept": "application/json"}};
            let request = http.post(url, JSON.stringify(body), params);

            check(request, {
                "OK": (r) => r.status === 200
            });
        }
    });

    group("/images/variations", () => {

        // Request No. 1: createImageVariation
        {
            let url = BASE_URL + `/images/variations`;
            // TODO: edit the parameters of the request body.
            let body = {"image": http.file(open("/path/to/file.bin", "b"), "test.bin"), "n": "integer", "size": "string", "responseFormat": "string", "user": "string"};
            let params = {headers: {"Content-Type": "multipart/form-data", "Accept": "application/json"}};
            let request = http.post(url, JSON.stringify(body), params);

            check(request, {
                "OK": (r) => r.status === 200
            });
        }
    });

    group("/models", () => {

        // Request No. 1: listModels
        {
            let url = BASE_URL + `/models`;
            let request = http.get(url);

            check(request, {
                "OK": (r) => r.status === 200
            });
        }
    });

    group("/files", () => {

        // Request No. 1: listFiles
        {
            let url = BASE_URL + `/files`;
            let request = http.get(url);

            check(request, {
                "OK": (r) => r.status === 200
            });

            sleep(SLEEP_DURATION);
        }

        // Request No. 2: createFile
        {
            let url = BASE_URL + `/files`;
            // TODO: edit the parameters of the request body.
            let body = {"file": http.file(open("/path/to/file.bin", "b"), "test.bin"), "purpose": "string"};
            let params = {headers: {"Content-Type": "multipart/form-data", "Accept": "application/json"}};
            let request = http.post(url, JSON.stringify(body), params);

            check(request, {
                "OK": (r) => r.status === 200
            });
        }
    });

    group("/chat/completions", () => {

        // Request No. 1: createChatCompletion
        {
            let url = BASE_URL + `/chat/completions`;
            // TODO: edit the parameters of the request body.
            let body = {"model": {}, "messages": "list", "functions": "list", "functionCall": {"name": "string"}, "temperature": "bigdecimal", "topP": "bigdecimal", "n": "integer", "stream": "boolean", "stop": {}, "maxTokens": "integer", "presencePenalty": "bigdecimal", "frequencyPenalty": "bigdecimal", "logitBias": "object", "user": "string"};
            let params = {headers: {"Content-Type": "application/json", "Accept": "application/json"}};
            let request = http.post(url, JSON.stringify(body), params);

            check(request, {
                "OK": (r) => r.status === 200
            });
        }
    });

    group("/fine-tunes/{fine_tune_id}", () => {
        let fineTuneId = 'TODO_EDIT_THE_FINE_TUNE_ID'; // specify value as there is no example value for this parameter in OpenAPI spec

        // Request No. 1: retrieveFineTune
        {
            let url = BASE_URL + `/fine-tunes/${fine_tune_id}`;
            let request = http.get(url);

            check(request, {
                "OK": (r) => r.status === 200
            });
        }
    });

    group("/embeddings", () => {

        // Request No. 1: createEmbedding
        {
            let url = BASE_URL + `/embeddings`;
            // TODO: edit the parameters of the request body.
            let body = {"model": {}, "input": {}, "user": "string"};
            let params = {headers: {"Content-Type": "application/json", "Accept": "application/json"}};
            let request = http.post(url, JSON.stringify(body), params);

            check(request, {
                "OK": (r) => r.status === 200
            });
        }
    });

    group("/completions", () => {

        // Request No. 1: createCompletion
        {
            let url = BASE_URL + `/completions`;
            // TODO: edit the parameters of the request body.
            let body = {"model": {}, "prompt": {}, "suffix": "string", "maxTokens": "integer", "temperature": "bigdecimal", "topP": "bigdecimal", "n": "integer", "stream": "boolean", "logprobs": "integer", "echo": "boolean", "stop": {}, "presencePenalty": "bigdecimal", "frequencyPenalty": "bigdecimal", "bestOf": "integer", "logitBias": "object", "user": "string"};
            let params = {headers: {"Content-Type": "application/json", "Accept": "application/json"}};
            let request = http.post(url, JSON.stringify(body), params);

            check(request, {
                "OK": (r) => r.status === 200
            });
        }
    });

    group("/moderations", () => {

        // Request No. 1: createModeration
        {
            let url = BASE_URL + `/moderations`;
            // TODO: edit the parameters of the request body.
            let body = {"input": {}, "model": {}};
            let params = {headers: {"Content-Type": "application/json", "Accept": "application/json"}};
            let request = http.post(url, JSON.stringify(body), params);

            check(request, {
                "OK": (r) => r.status === 200
            });
        }
    });

    group("/audio/transcriptions", () => {

        // Request No. 1: createTranscription
        {
            let url = BASE_URL + `/audio/transcriptions`;
            // TODO: edit the parameters of the request body.
            let body = {"file": http.file(open("/path/to/file.bin", "b"), "test.bin"), "model": {}, "prompt": "string", "responseFormat": "string", "temperature": "bigdecimal", "language": "string"};
            let params = {headers: {"Content-Type": "multipart/form-data", "Accept": "application/json"}};
            let request = http.post(url, JSON.stringify(body), params);

            check(request, {
                "OK": (r) => r.status === 200
            });
        }
    });

    group("/fine-tunes/{fine_tune_id}/events", () => {
        let stream = 'TODO_EDIT_THE_STREAM'; // specify value as there is no example value for this parameter in OpenAPI spec
        let fineTuneId = 'TODO_EDIT_THE_FINE_TUNE_ID'; // specify value as there is no example value for this parameter in OpenAPI spec

        // Request No. 1: listFineTuneEvents
        {
            let url = BASE_URL + `/fine-tunes/${fine_tune_id}/events?stream=${stream}`;
            let request = http.get(url);

            check(request, {
                "OK": (r) => r.status === 200
            });
        }
    });

    group("/models/{model}", () => {
        let model = 'TODO_EDIT_THE_MODEL'; // specify value as there is no example value for this parameter in OpenAPI spec

        // Request No. 1: retrieveModel
        {
            let url = BASE_URL + `/models/${model}`;
            let request = http.get(url);

            check(request, {
                "OK": (r) => r.status === 200
            });

            sleep(SLEEP_DURATION);
        }

        // Request No. 2: deleteModel
        {
            let url = BASE_URL + `/models/${model}`;
            let request = http.del(url);

            check(request, {
                "OK": (r) => r.status === 200
            });
        }
    });

    group("/images/edits", () => {

        // Request No. 1: createImageEdit
        {
            let url = BASE_URL + `/images/edits`;
            // TODO: edit the parameters of the request body.
            let body = {"image": http.file(open("/path/to/file.bin", "b"), "test.bin"), "mask": http.file(open("/path/to/file.bin", "b"), "test.bin"), "prompt": "string", "n": "integer", "size": "string", "responseFormat": "string", "user": "string"};
            let params = {headers: {"Content-Type": "multipart/form-data", "Accept": "application/json"}};
            let request = http.post(url, JSON.stringify(body), params);

            check(request, {
                "OK": (r) => r.status === 200
            });
        }
    });

    group("/files/{file_id}", () => {
        let fileId = 'TODO_EDIT_THE_FILE_ID'; // specify value as there is no example value for this parameter in OpenAPI spec

        // Request No. 1: retrieveFile
        {
            let url = BASE_URL + `/files/${file_id}`;
            let request = http.get(url);

            check(request, {
                "OK": (r) => r.status === 200
            });

            sleep(SLEEP_DURATION);
        }

        // Request No. 2: deleteFile
        {
            let url = BASE_URL + `/files/${file_id}`;
            let request = http.del(url);

            check(request, {
                "OK": (r) => r.status === 200
            });
        }
    });

    group("/fine-tunes", () => {

        // Request No. 1: listFineTunes
        {
            let url = BASE_URL + `/fine-tunes`;
            let request = http.get(url);

            check(request, {
                "OK": (r) => r.status === 200
            });

            sleep(SLEEP_DURATION);
        }

        // Request No. 2: createFineTune
        {
            let url = BASE_URL + `/fine-tunes`;
            // TODO: edit the parameters of the request body.
            let body = {"trainingFile": "string", "validationFile": "string", "model": {}, "nEpochs": "integer", "batchSize": "integer", "learningRateMultiplier": "bigdecimal", "promptLossWeight": "bigdecimal", "computeClassificationMetrics": "boolean", "classificationNClasses": "integer", "classificationPositiveClass": "string", "classificationBetas": "list", "suffix": "string"};
            let params = {headers: {"Content-Type": "application/json", "Accept": "application/json"}};
            let request = http.post(url, JSON.stringify(body), params);

            check(request, {
                "OK": (r) => r.status === 200
            });
        }
    });

    group("/audio/translations", () => {

        // Request No. 1: createTranslation
        {
            let url = BASE_URL + `/audio/translations`;
            // TODO: edit the parameters of the request body.
            let body = {"file": http.file(open("/path/to/file.bin", "b"), "test.bin"), "model": {}, "prompt": "string", "responseFormat": "string", "temperature": "bigdecimal"};
            let params = {headers: {"Content-Type": "multipart/form-data", "Accept": "application/json"}};
            let request = http.post(url, JSON.stringify(body), params);

            check(request, {
                "OK": (r) => r.status === 200
            });
        }
    });

}