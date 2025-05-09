#' OpenAI API
#'
#' The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
#'
#' The version of the OpenAPI document: 2.0.0
#' Contact: blah+oapicf@cliffano.com
#' Generated by: https://openapi-generator.tech
#'
#' @docType class
#' @title Completions operations
#' @description CompletionsApi
#' @format An \code{R6Class} generator object
#' @field api_client Handles the client-server communication.
#'
#' @examples
#' \dontrun{
#' ####################  CreateCompletion  ####################
#'
#' library(openapi)
#' var_create_completion_request <- CreateCompletionRequest$new(CreateCompletionRequest_model$new(), CreateCompletionRequest_prompt$new(), 123, "echo_example", 123, c(key = 123), 123, 123, 123, 123, 123, CreateCompletionRequest_stop$new(), "stream_example", "suffix_example", 123, 123, "user_example") # CreateCompletionRequest | 
#'
#' #Creates a completion for the provided prompt and parameters.
#' api_instance <- CompletionsApi$new()
#'
#' # Configure HTTP bearer authorization: ApiKeyAuth
#' api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
#'
#' # to save the result into a file, simply add the optional `data_file` parameter, e.g.
#' # result <- api_instance$CreateCompletion(var_create_completion_requestdata_file = "result.txt")
#' result <- api_instance$CreateCompletion(var_create_completion_request)
#' dput(result)
#'
#'
#' }
#' @importFrom R6 R6Class
#' @importFrom base64enc base64encode
#' @export
CompletionsApi <- R6::R6Class(
  "CompletionsApi",
  public = list(
    api_client = NULL,

    #' @description
    #' Initialize a new CompletionsApi.
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
    #' Creates a completion for the provided prompt and parameters.
    #'
    #' @param create_completion_request 
    #' @param data_file (optional) name of the data file to save the result
    #' @param ... Other optional arguments
    #'
    #' @return CreateCompletionResponse
    CreateCompletion = function(create_completion_request, data_file = NULL, ...) {
      local_var_response <- self$CreateCompletionWithHttpInfo(create_completion_request, data_file = data_file, ...)
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
    #' Creates a completion for the provided prompt and parameters.
    #'
    #' @param create_completion_request 
    #' @param data_file (optional) name of the data file to save the result
    #' @param ... Other optional arguments
    #'
    #' @return API response (CreateCompletionResponse) with additional information such as HTTP status code, headers
    CreateCompletionWithHttpInfo = function(create_completion_request, data_file = NULL, ...) {
      args <- list(...)
      query_params <- list()
      header_params <- c()
      form_params <- list()
      file_params <- list()
      local_var_body <- NULL
      oauth_scopes <- NULL
      is_oauth <- FALSE

      if (missing(`create_completion_request`)) {
        stop("Missing required parameter `create_completion_request`.")
      }


      if (!is.null(`create_completion_request`)) {
        local_var_body <- `create_completion_request`$toJSONString()
      } else {
        body <- NULL
      }

      local_var_url_path <- "/completions"
      # Bearer token
      if (!is.null(self$api_client$bearer_token)) {
        header_params["Authorization"] <- paste("Bearer", self$api_client$bearer_token, sep = " ")
      }

      # The Accept request HTTP header
      local_var_accepts <- list("application/json")

      # The Content-Type representation header
      local_var_content_types <- list("application/json")

      local_var_resp <- self$api_client$CallApi(url = paste0(self$api_client$base_path, local_var_url_path),
                                 method = "POST",
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
          self$api_client$deserialize(local_var_resp$response_as_text(), "CreateCompletionResponse", loadNamespace("openapi")),
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
