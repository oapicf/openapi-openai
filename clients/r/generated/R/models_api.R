#' OpenAI API
#'
#' The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
#'
#' The version of the OpenAPI document: 2.0.0
#' Contact: blah+oapicf@cliffano.com
#' Generated by: https://openapi-generator.tech
#'
#' @docType class
#' @title Models operations
#' @description ModelsApi
#' @format An \code{R6Class} generator object
#' @field api_client Handles the client-server communication.
#'
#' @examples
#' \dontrun{
#' ####################  DeleteModel  ####################
#'
#' library(openapi)
#' var_model <- "ft:gpt-3.5-turbo:acemeco:suffix:abc123" # character | The model to delete
#'
#' #Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
#' api_instance <- ModelsApi$new()
#'
#' # Configure HTTP bearer authorization: ApiKeyAuth
#' api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
#'
#' # to save the result into a file, simply add the optional `data_file` parameter, e.g.
#' # result <- api_instance$DeleteModel(var_modeldata_file = "result.txt")
#' result <- api_instance$DeleteModel(var_model)
#' dput(result)
#'
#'
#' ####################  ListModels  ####################
#'
#' library(openapi)
#'
#' #Lists the currently available models, and provides basic information about each one such as the owner and availability.
#' api_instance <- ModelsApi$new()
#'
#' # Configure HTTP bearer authorization: ApiKeyAuth
#' api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
#'
#' # to save the result into a file, simply add the optional `data_file` parameter, e.g.
#' # result <- api_instance$ListModels(data_file = "result.txt")
#' result <- api_instance$ListModels()
#' dput(result)
#'
#'
#' ####################  RetrieveModel  ####################
#'
#' library(openapi)
#' var_model <- "gpt-3.5-turbo" # character | The ID of the model to use for this request
#'
#' #Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
#' api_instance <- ModelsApi$new()
#'
#' # Configure HTTP bearer authorization: ApiKeyAuth
#' api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
#'
#' # to save the result into a file, simply add the optional `data_file` parameter, e.g.
#' # result <- api_instance$RetrieveModel(var_modeldata_file = "result.txt")
#' result <- api_instance$RetrieveModel(var_model)
#' dput(result)
#'
#'
#' }
#' @importFrom R6 R6Class
#' @importFrom base64enc base64encode
#' @export
ModelsApi <- R6::R6Class(
  "ModelsApi",
  public = list(
    api_client = NULL,

    #' @description
    #' Initialize a new ModelsApi.
    #'
    #' @param api_client An instance of API client.
    initialize = function(api_client) {
      if (!missing(api_client)) {
        self$api_client <- api_client
      } else {
        self$api_client <- ApiClient$new()
      }
    },

    #' @description
    #' Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
    #'
    #' @param model The model to delete
    #' @param data_file (optional) name of the data file to save the result
    #' @param ... Other optional arguments
    #'
    #' @return DeleteModelResponse
    DeleteModel = function(model, data_file = NULL, ...) {
      local_var_response <- self$DeleteModelWithHttpInfo(model, data_file = data_file, ...)
      if (local_var_response$status_code >= 200 && local_var_response$status_code <= 299) {
        local_var_response$content
      } else if (local_var_response$status_code >= 300 && local_var_response$status_code <= 399) {
        local_var_response
      } else if (local_var_response$status_code >= 400 && local_var_response$status_code <= 499) {
        local_var_response
      } else if (local_var_response$status_code >= 500 && local_var_response$status_code <= 599) {
        local_var_response
      }
    },

    #' @description
    #' Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
    #'
    #' @param model The model to delete
    #' @param data_file (optional) name of the data file to save the result
    #' @param ... Other optional arguments
    #'
    #' @return API response (DeleteModelResponse) with additional information such as HTTP status code, headers
    DeleteModelWithHttpInfo = function(model, data_file = NULL, ...) {
      args <- list(...)
      query_params <- list()
      header_params <- c()
      form_params <- list()
      file_params <- list()
      local_var_body <- NULL
      oauth_scopes <- NULL
      is_oauth <- FALSE

      if (missing(`model`)) {
        stop("Missing required parameter `model`.")
      }


      local_var_url_path <- "/models/{model}"
      if (!missing(`model`)) {
        local_var_url_path <- gsub("\\{model\\}", URLencode(as.character(`model`), reserved = TRUE), local_var_url_path)
      }

      # Bearer token
      if (!is.null(self$api_client$bearer_token)) {
        header_params["Authorization"] <- paste("Bearer", self$api_client$bearer_token, sep = " ")
      }

      # The Accept request HTTP header
      local_var_accepts <- list("application/json")

      # The Content-Type representation header
      local_var_content_types <- list()

      local_var_resp <- self$api_client$CallApi(url = paste0(self$api_client$base_path, local_var_url_path),
                                 method = "DELETE",
                                 query_params = query_params,
                                 header_params = header_params,
                                 form_params = form_params,
                                 file_params = file_params,
                                 accepts = local_var_accepts,
                                 content_types = local_var_content_types,
                                 body = local_var_body,
                                 is_oauth = is_oauth,
                                 oauth_scopes = oauth_scopes,
                                 ...)

      if (local_var_resp$status_code >= 200 && local_var_resp$status_code <= 299) {
        # save response in a file
        if (!is.null(data_file)) {
          write(local_var_resp$response, data_file)
        }

        deserialized_resp_obj <- tryCatch(
          self$api_client$deserialize(local_var_resp$response_as_text(), "DeleteModelResponse", loadNamespace("openapi")),
          error = function(e) {
            stop("Failed to deserialize response")
          }
        )
        local_var_resp$content <- deserialized_resp_obj
        local_var_resp
      } else if (local_var_resp$status_code >= 300 && local_var_resp$status_code <= 399) {
        ApiResponse$new(paste("Server returned ", local_var_resp$status_code, " response status code."), local_var_resp)
      } else if (local_var_resp$status_code >= 400 && local_var_resp$status_code <= 499) {
        ApiResponse$new("API client error", local_var_resp)
      } else if (local_var_resp$status_code >= 500 && local_var_resp$status_code <= 599) {
        if (is.null(local_var_resp$response) || local_var_resp$response == "") {
          local_var_resp$response <- "API server error"
        }
        local_var_resp
      }
    },

    #' @description
    #' Lists the currently available models, and provides basic information about each one such as the owner and availability.
    #'
    #' @param data_file (optional) name of the data file to save the result
    #' @param ... Other optional arguments
    #'
    #' @return ListModelsResponse
    ListModels = function(data_file = NULL, ...) {
      local_var_response <- self$ListModelsWithHttpInfo(data_file = data_file, ...)
      if (local_var_response$status_code >= 200 && local_var_response$status_code <= 299) {
        local_var_response$content
      } else if (local_var_response$status_code >= 300 && local_var_response$status_code <= 399) {
        local_var_response
      } else if (local_var_response$status_code >= 400 && local_var_response$status_code <= 499) {
        local_var_response
      } else if (local_var_response$status_code >= 500 && local_var_response$status_code <= 599) {
        local_var_response
      }
    },

    #' @description
    #' Lists the currently available models, and provides basic information about each one such as the owner and availability.
    #'
    #' @param data_file (optional) name of the data file to save the result
    #' @param ... Other optional arguments
    #'
    #' @return API response (ListModelsResponse) with additional information such as HTTP status code, headers
    ListModelsWithHttpInfo = function(data_file = NULL, ...) {
      args <- list(...)
      query_params <- list()
      header_params <- c()
      form_params <- list()
      file_params <- list()
      local_var_body <- NULL
      oauth_scopes <- NULL
      is_oauth <- FALSE

      local_var_url_path <- "/models"
      # Bearer token
      if (!is.null(self$api_client$bearer_token)) {
        header_params["Authorization"] <- paste("Bearer", self$api_client$bearer_token, sep = " ")
      }

      # The Accept request HTTP header
      local_var_accepts <- list("application/json")

      # The Content-Type representation header
      local_var_content_types <- list()

      local_var_resp <- self$api_client$CallApi(url = paste0(self$api_client$base_path, local_var_url_path),
                                 method = "GET",
                                 query_params = query_params,
                                 header_params = header_params,
                                 form_params = form_params,
                                 file_params = file_params,
                                 accepts = local_var_accepts,
                                 content_types = local_var_content_types,
                                 body = local_var_body,
                                 is_oauth = is_oauth,
                                 oauth_scopes = oauth_scopes,
                                 ...)

      if (local_var_resp$status_code >= 200 && local_var_resp$status_code <= 299) {
        # save response in a file
        if (!is.null(data_file)) {
          write(local_var_resp$response, data_file)
        }

        deserialized_resp_obj <- tryCatch(
          self$api_client$deserialize(local_var_resp$response_as_text(), "ListModelsResponse", loadNamespace("openapi")),
          error = function(e) {
            stop("Failed to deserialize response")
          }
        )
        local_var_resp$content <- deserialized_resp_obj
        local_var_resp
      } else if (local_var_resp$status_code >= 300 && local_var_resp$status_code <= 399) {
        ApiResponse$new(paste("Server returned ", local_var_resp$status_code, " response status code."), local_var_resp)
      } else if (local_var_resp$status_code >= 400 && local_var_resp$status_code <= 499) {
        ApiResponse$new("API client error", local_var_resp)
      } else if (local_var_resp$status_code >= 500 && local_var_resp$status_code <= 599) {
        if (is.null(local_var_resp$response) || local_var_resp$response == "") {
          local_var_resp$response <- "API server error"
        }
        local_var_resp
      }
    },

    #' @description
    #' Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
    #'
    #' @param model The ID of the model to use for this request
    #' @param data_file (optional) name of the data file to save the result
    #' @param ... Other optional arguments
    #'
    #' @return Model
    RetrieveModel = function(model, data_file = NULL, ...) {
      local_var_response <- self$RetrieveModelWithHttpInfo(model, data_file = data_file, ...)
      if (local_var_response$status_code >= 200 && local_var_response$status_code <= 299) {
        local_var_response$content
      } else if (local_var_response$status_code >= 300 && local_var_response$status_code <= 399) {
        local_var_response
      } else if (local_var_response$status_code >= 400 && local_var_response$status_code <= 499) {
        local_var_response
      } else if (local_var_response$status_code >= 500 && local_var_response$status_code <= 599) {
        local_var_response
      }
    },

    #' @description
    #' Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
    #'
    #' @param model The ID of the model to use for this request
    #' @param data_file (optional) name of the data file to save the result
    #' @param ... Other optional arguments
    #'
    #' @return API response (Model) with additional information such as HTTP status code, headers
    RetrieveModelWithHttpInfo = function(model, data_file = NULL, ...) {
      args <- list(...)
      query_params <- list()
      header_params <- c()
      form_params <- list()
      file_params <- list()
      local_var_body <- NULL
      oauth_scopes <- NULL
      is_oauth <- FALSE

      if (missing(`model`)) {
        stop("Missing required parameter `model`.")
      }


      local_var_url_path <- "/models/{model}"
      if (!missing(`model`)) {
        local_var_url_path <- gsub("\\{model\\}", URLencode(as.character(`model`), reserved = TRUE), local_var_url_path)
      }

      # Bearer token
      if (!is.null(self$api_client$bearer_token)) {
        header_params["Authorization"] <- paste("Bearer", self$api_client$bearer_token, sep = " ")
      }

      # The Accept request HTTP header
      local_var_accepts <- list("application/json")

      # The Content-Type representation header
      local_var_content_types <- list()

      local_var_resp <- self$api_client$CallApi(url = paste0(self$api_client$base_path, local_var_url_path),
                                 method = "GET",
                                 query_params = query_params,
                                 header_params = header_params,
                                 form_params = form_params,
                                 file_params = file_params,
                                 accepts = local_var_accepts,
                                 content_types = local_var_content_types,
                                 body = local_var_body,
                                 is_oauth = is_oauth,
                                 oauth_scopes = oauth_scopes,
                                 ...)

      if (local_var_resp$status_code >= 200 && local_var_resp$status_code <= 299) {
        # save response in a file
        if (!is.null(data_file)) {
          write(local_var_resp$response, data_file)
        }

        deserialized_resp_obj <- tryCatch(
          self$api_client$deserialize(local_var_resp$response_as_text(), "Model", loadNamespace("openapi")),
          error = function(e) {
            stop("Failed to deserialize response")
          }
        )
        local_var_resp$content <- deserialized_resp_obj
        local_var_resp
      } else if (local_var_resp$status_code >= 300 && local_var_resp$status_code <= 399) {
        ApiResponse$new(paste("Server returned ", local_var_resp$status_code, " response status code."), local_var_resp)
      } else if (local_var_resp$status_code >= 400 && local_var_resp$status_code <= 499) {
        ApiResponse$new("API client error", local_var_resp)
      } else if (local_var_resp$status_code >= 500 && local_var_resp$status_code <= 599) {
        if (is.null(local_var_resp$response) || local_var_resp$response == "") {
          local_var_resp$response <- "API server error"
        }
        local_var_resp
      }
    }
  )
)
