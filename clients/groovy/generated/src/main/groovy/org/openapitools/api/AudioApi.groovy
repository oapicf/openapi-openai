package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.AudioResponseFormat
import java.math.BigDecimal
import org.openapitools.model.CreateSpeechRequest
import org.openapitools.model.CreateTranscription200Response
import org.openapitools.model.CreateTranscriptionRequestModel
import org.openapitools.model.CreateTranslation200Response

class AudioApi {
    String basePath = "https://api.openai.com/v1"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def createSpeech ( CreateSpeechRequest createSpeechRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/audio/speech"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (createSpeechRequest == null) {
            throw new RuntimeException("missing required params createSpeechRequest")
        }



        contentType = 'application/json';
        bodyParams = createSpeechRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    File.class )

    }

    def createTranscription ( File _file, CreateTranscriptionRequestModel model, String language, String prompt, AudioResponseFormat responseFormat, BigDecimal temperature, List<String> timestampGranularities, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/audio/transcriptions"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (_file == null) {
            throw new RuntimeException("missing required params _file")
        }
        // verify required params are set
        if (model == null) {
            throw new RuntimeException("missing required params model")
        }




        contentType = 'multipart/form-data';
        bodyParams = [:]
        bodyParams.put("file", _file)
        bodyParams.put("model", model)
        bodyParams.put("language", language)
        bodyParams.put("prompt", prompt)
        bodyParams.put("response_format", responseFormat)
        bodyParams.put("temperature", temperature)
        bodyParams.put("timestamp_granularities[]", timestampGranularities)

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    CreateTranscription200Response.class )

    }

    def createTranslation ( File _file, CreateTranscriptionRequestModel model, String prompt, AudioResponseFormat responseFormat, BigDecimal temperature, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/audio/translations"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (_file == null) {
            throw new RuntimeException("missing required params _file")
        }
        // verify required params are set
        if (model == null) {
            throw new RuntimeException("missing required params model")
        }




        contentType = 'multipart/form-data';
        bodyParams = [:]
        bodyParams.put("file", _file)
        bodyParams.put("model", model)
        bodyParams.put("prompt", prompt)
        bodyParams.put("response_format", responseFormat)
        bodyParams.put("temperature", temperature)

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    CreateTranslation200Response.class )

    }

}
