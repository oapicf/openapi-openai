package org.openapitools.api;

import org.openapitools.api.ApiUtils
import java.math.BigDecimal
import org.openapitools.model.CreateChatCompletionRequest
import org.openapitools.model.CreateChatCompletionResponse
import org.openapitools.model.CreateCompletionRequest
import org.openapitools.model.CreateCompletionResponse
import org.openapitools.model.CreateEditRequest
import org.openapitools.model.CreateEditResponse
import org.openapitools.model.CreateEmbeddingRequest
import org.openapitools.model.CreateEmbeddingResponse
import org.openapitools.model.CreateFineTuneRequest
import org.openapitools.model.CreateImageRequest
import org.openapitools.model.CreateModerationRequest
import org.openapitools.model.CreateModerationResponse
import org.openapitools.model.CreateTranscriptionRequestModel
import org.openapitools.model.CreateTranscriptionResponse
import org.openapitools.model.CreateTranslationResponse
import org.openapitools.model.DeleteFileResponse
import org.openapitools.model.DeleteModelResponse
import org.openapitools.model.FineTune
import org.openapitools.model.ImagesResponse
import org.openapitools.model.ListFilesResponse
import org.openapitools.model.ListFineTuneEventsResponse
import org.openapitools.model.ListFineTunesResponse
import org.openapitools.model.ListModelsResponse
import org.openapitools.model.Model
import org.openapitools.model.OpenAIFile

class OpenAiApi {
    String basePath = "https://api.openai.com/v1"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def cancelFineTune ( String fineTuneId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/fine-tunes/${fine_tune_id}/cancel"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (fineTuneId == null) {
            throw new RuntimeException("missing required params fineTuneId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    FineTune.class )

    }

    def createChatCompletion ( CreateChatCompletionRequest createChatCompletionRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/chat/completions"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (createChatCompletionRequest == null) {
            throw new RuntimeException("missing required params createChatCompletionRequest")
        }



        contentType = 'application/json';
        bodyParams = createChatCompletionRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    CreateChatCompletionResponse.class )

    }

    def createCompletion ( CreateCompletionRequest createCompletionRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/completions"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (createCompletionRequest == null) {
            throw new RuntimeException("missing required params createCompletionRequest")
        }



        contentType = 'application/json';
        bodyParams = createCompletionRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    CreateCompletionResponse.class )

    }

    def createEdit ( CreateEditRequest createEditRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/edits"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (createEditRequest == null) {
            throw new RuntimeException("missing required params createEditRequest")
        }



        contentType = 'application/json';
        bodyParams = createEditRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    CreateEditResponse.class )

    }

    def createEmbedding ( CreateEmbeddingRequest createEmbeddingRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/embeddings"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (createEmbeddingRequest == null) {
            throw new RuntimeException("missing required params createEmbeddingRequest")
        }



        contentType = 'application/json';
        bodyParams = createEmbeddingRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    CreateEmbeddingResponse.class )

    }

    def createFile ( File _file, String purpose, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/files"

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
        if (purpose == null) {
            throw new RuntimeException("missing required params purpose")
        }




        contentType = 'multipart/form-data';
        bodyParams = [:]
        bodyParams.put("file", _file)
        bodyParams.put("purpose", purpose)

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    OpenAIFile.class )

    }

    def createFineTune ( CreateFineTuneRequest createFineTuneRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/fine-tunes"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (createFineTuneRequest == null) {
            throw new RuntimeException("missing required params createFineTuneRequest")
        }



        contentType = 'application/json';
        bodyParams = createFineTuneRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    FineTune.class )

    }

    def createImage ( CreateImageRequest createImageRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/images/generations"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (createImageRequest == null) {
            throw new RuntimeException("missing required params createImageRequest")
        }



        contentType = 'application/json';
        bodyParams = createImageRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    ImagesResponse.class )

    }

    def createImageEdit ( File image, String prompt, File mask, Integer n, String size, String responseFormat, String user, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/images/edits"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (image == null) {
            throw new RuntimeException("missing required params image")
        }
        // verify required params are set
        if (prompt == null) {
            throw new RuntimeException("missing required params prompt")
        }




        contentType = 'multipart/form-data';
        bodyParams = [:]
        bodyParams.put("image", image)
        bodyParams.put("mask", mask)
        bodyParams.put("prompt", prompt)
        bodyParams.put("n", n)
        bodyParams.put("size", size)
        bodyParams.put("response_format", responseFormat)
        bodyParams.put("user", user)

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    ImagesResponse.class )

    }

    def createImageVariation ( File image, Integer n, String size, String responseFormat, String user, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/images/variations"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (image == null) {
            throw new RuntimeException("missing required params image")
        }




        contentType = 'multipart/form-data';
        bodyParams = [:]
        bodyParams.put("image", image)
        bodyParams.put("n", n)
        bodyParams.put("size", size)
        bodyParams.put("response_format", responseFormat)
        bodyParams.put("user", user)

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    ImagesResponse.class )

    }

    def createModeration ( CreateModerationRequest createModerationRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/moderations"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (createModerationRequest == null) {
            throw new RuntimeException("missing required params createModerationRequest")
        }



        contentType = 'application/json';
        bodyParams = createModerationRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    CreateModerationResponse.class )

    }

    def createTranscription ( File _file, CreateTranscriptionRequestModel model, String prompt, String responseFormat, BigDecimal temperature, String language, Closure onSuccess, Closure onFailure)  {
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
        bodyParams.put("prompt", prompt)
        bodyParams.put("response_format", responseFormat)
        bodyParams.put("temperature", temperature)
        bodyParams.put("language", language)

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    CreateTranscriptionResponse.class )

    }

    def createTranslation ( File _file, CreateTranscriptionRequestModel model, String prompt, String responseFormat, BigDecimal temperature, Closure onSuccess, Closure onFailure)  {
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
                    CreateTranslationResponse.class )

    }

    def deleteFile ( String fileId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/files/${file_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (fileId == null) {
            throw new RuntimeException("missing required params fileId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    DeleteFileResponse.class )

    }

    def deleteModel ( String model, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/models/${model}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (model == null) {
            throw new RuntimeException("missing required params model")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    DeleteModelResponse.class )

    }

    def downloadFile ( String fileId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/files/${file_id}/content"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (fileId == null) {
            throw new RuntimeException("missing required params fileId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    String.class )

    }

    def listFiles ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/files"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType






        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    ListFilesResponse.class )

    }

    def listFineTuneEvents ( String fineTuneId, Boolean stream, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/fine-tunes/${fine_tune_id}/events"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (fineTuneId == null) {
            throw new RuntimeException("missing required params fineTuneId")
        }

        if (stream != null) {
            queryParams.put("stream", stream)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    ListFineTuneEventsResponse.class )

    }

    def listFineTunes ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/fine-tunes"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType






        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    ListFineTunesResponse.class )

    }

    def listModels ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/models"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType






        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    ListModelsResponse.class )

    }

    def retrieveFile ( String fileId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/files/${file_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (fileId == null) {
            throw new RuntimeException("missing required params fileId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    OpenAIFile.class )

    }

    def retrieveFineTune ( String fineTuneId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/fine-tunes/${fine_tune_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (fineTuneId == null) {
            throw new RuntimeException("missing required params fineTuneId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    FineTune.class )

    }

    def retrieveModel ( String model, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/models/${model}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (model == null) {
            throw new RuntimeException("missing required params model")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    Model.class )

    }

}
