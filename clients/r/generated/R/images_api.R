#' OpenAI API
#'
#' The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
#'
#' The version of the OpenAPI document: 2.0.0
#' Contact: blah+oapicf@cliffano.com
#' Generated by: https://openapi-generator.tech
#'
#' @docType class
#' @title Images operations
#' @description ImagesApi
#' @format An \code{R6Class} generator object
#' @field api_client Handles the client-server communication.
#'
#' @examples
#' \dontrun{
#' ####################  CreateImage  ####################
#'
#' library(openapi)
#' var_create_image_request <- CreateImageRequest$new("prompt_example", CreateImageRequest_model$new(), 123, "standard", "url", "256x256", "vivid", "user_example") # CreateImageRequest | 
#'
#' #Creates an image given a prompt.
#' api_instance <- ImagesApi$new()
#'
#' # Configure HTTP bearer authorization: ApiKeyAuth
#' api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
#'
#' # to save the result into a file, simply add the optional `data_file` parameter, e.g.
#' # result <- api_instance$CreateImage(var_create_image_requestdata_file = "result.txt")
#' result <- api_instance$CreateImage(var_create_image_request)
#' dput(result)
#'
#'
#' ####################  CreateImageEdit  ####################
#'
#' library(openapi)
#' var_image <- File.new('/path/to/file') # data.frame | The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask.
#' var_prompt <- "prompt_example" # character | A text description of the desired image(s). The maximum length is 1000 characters.
#' var_mask <- File.new('/path/to/file') # data.frame | An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where `image` should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as `image`. (Optional)
#' var_model <- CreateImageEditRequest_model$new() # CreateImageEditRequestModel |  (Optional)
#' var_n <- 1 # integer | The number of images to generate. Must be between 1 and 10. (Optional)
#' var_size <- "1024x1024" # character | The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`. (Optional)
#' var_response_format <- "url" # character | The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated. (Optional)
#' var_user <- "user_example" # character | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  (Optional)
#'
#' #Creates an edited or extended image given an original image and a prompt.
#' api_instance <- ImagesApi$new()
#'
#' # Configure HTTP bearer authorization: ApiKeyAuth
#' api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
#'
#' # to save the result into a file, simply add the optional `data_file` parameter, e.g.
#' # result <- api_instance$CreateImageEdit(var_image, var_prompt, mask = var_mask, model = var_model, n = var_n, size = var_size, response_format = var_response_format, user = var_userdata_file = "result.txt")
#' result <- api_instance$CreateImageEdit(var_image, var_prompt, mask = var_mask, model = var_model, n = var_n, size = var_size, response_format = var_response_format, user = var_user)
#' dput(result)
#'
#'
#' ####################  CreateImageVariation  ####################
#'
#' library(openapi)
#' var_image <- File.new('/path/to/file') # data.frame | The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square.
#' var_model <- CreateImageEditRequest_model$new() # CreateImageEditRequestModel |  (Optional)
#' var_n <- 1 # integer | The number of images to generate. Must be between 1 and 10. For `dall-e-3`, only `n=1` is supported. (Optional)
#' var_response_format <- "url" # character | The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated. (Optional)
#' var_size <- "1024x1024" # character | The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`. (Optional)
#' var_user <- "user_example" # character | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  (Optional)
#'
#' #Creates a variation of a given image.
#' api_instance <- ImagesApi$new()
#'
#' # Configure HTTP bearer authorization: ApiKeyAuth
#' api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
#'
#' # to save the result into a file, simply add the optional `data_file` parameter, e.g.
#' # result <- api_instance$CreateImageVariation(var_image, model = var_model, n = var_n, response_format = var_response_format, size = var_size, user = var_userdata_file = "result.txt")
#' result <- api_instance$CreateImageVariation(var_image, model = var_model, n = var_n, response_format = var_response_format, size = var_size, user = var_user)
#' dput(result)
#'
#'
#' }
#' @importFrom R6 R6Class
#' @importFrom base64enc base64encode
#' @export
ImagesApi <- R6::R6Class(
  "ImagesApi",
  public = list(
    api_client = NULL,

    #' @description
    #' Initialize a new ImagesApi.
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
    #' Creates an image given a prompt.
    #'
    #' @param create_image_request 
    #' @param data_file (optional) name of the data file to save the result
    #' @param ... Other optional arguments
    #'
    #' @return ImagesResponse
    CreateImage = function(create_image_request, data_file = NULL, ...) {
      local_var_response <- self$CreateImageWithHttpInfo(create_image_request, data_file = data_file, ...)
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
    #' Creates an image given a prompt.
    #'
    #' @param create_image_request 
    #' @param data_file (optional) name of the data file to save the result
    #' @param ... Other optional arguments
    #'
    #' @return API response (ImagesResponse) with additional information such as HTTP status code, headers
    CreateImageWithHttpInfo = function(create_image_request, data_file = NULL, ...) {
      args <- list(...)
      query_params <- list()
      header_params <- c()
      form_params <- list()
      file_params <- list()
      local_var_body <- NULL
      oauth_scopes <- NULL
      is_oauth <- FALSE

      if (missing(`create_image_request`)) {
        stop("Missing required parameter `create_image_request`.")
      }


      if (!is.null(`create_image_request`)) {
        local_var_body <- `create_image_request`$toJSONString()
      } else {
        body <- NULL
      }

      local_var_url_path <- "/images/generations"
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
          self$api_client$deserialize(local_var_resp$response_as_text(), "ImagesResponse", loadNamespace("openapi")),
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
    #' Creates an edited or extended image given an original image and a prompt.
    #'
    #' @param image The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask.
    #' @param prompt A text description of the desired image(s). The maximum length is 1000 characters.
    #' @param mask (optional) An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where `image` should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as `image`.
    #' @param model (optional) No description
    #' @param n (optional) The number of images to generate. Must be between 1 and 10. (default value: 1)
    #' @param size (optional) The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`. (default value: "1024x1024")
    #' @param response_format (optional) The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated. (default value: "url")
    #' @param user (optional) A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
    #' @param data_file (optional) name of the data file to save the result
    #' @param ... Other optional arguments
    #'
    #' @return ImagesResponse
    CreateImageEdit = function(image, prompt, mask = NULL, model = NULL, n = 1, size = "1024x1024", response_format = "url", user = NULL, data_file = NULL, ...) {
      local_var_response <- self$CreateImageEditWithHttpInfo(image, prompt, mask, model, n, size, response_format, user, data_file = data_file, ...)
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
    #' Creates an edited or extended image given an original image and a prompt.
    #'
    #' @param image The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask.
    #' @param prompt A text description of the desired image(s). The maximum length is 1000 characters.
    #' @param mask (optional) An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where `image` should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as `image`.
    #' @param model (optional) No description
    #' @param n (optional) The number of images to generate. Must be between 1 and 10. (default value: 1)
    #' @param size (optional) The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`. (default value: "1024x1024")
    #' @param response_format (optional) The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated. (default value: "url")
    #' @param user (optional) A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
    #' @param data_file (optional) name of the data file to save the result
    #' @param ... Other optional arguments
    #'
    #' @return API response (ImagesResponse) with additional information such as HTTP status code, headers
    CreateImageEditWithHttpInfo = function(image, prompt, mask = NULL, model = NULL, n = 1, size = "1024x1024", response_format = "url", user = NULL, data_file = NULL, ...) {
      args <- list(...)
      query_params <- list()
      header_params <- c()
      form_params <- list()
      file_params <- list()
      local_var_body <- NULL
      oauth_scopes <- NULL
      is_oauth <- FALSE

      if (missing(`image`)) {
        stop("Missing required parameter `image`.")
      }

      if (missing(`prompt`)) {
        stop("Missing required parameter `prompt`.")
      }





      if (`n` > 10) {
        stop("Invalid value for `n` when calling ImagesApi$CreateImageEdit, must be smaller than or equal to 10.")
      }
      if (`n` < 1) {
        stop("Invalid value for `n` when calling ImagesApi$CreateImageEdit, must be bigger than or equal to 1.")
      }




      file_params["image"] <- httr::upload_file(`image`)
      form_params["prompt"] <- `prompt`
      file_params["mask"] <- httr::upload_file(`mask`)
      form_params["model"] <- `model`
      form_params["n"] <- `n`
      form_params["size"] <- `size`
      form_params["response_format"] <- `response_format`
      form_params["user"] <- `user`
      local_var_url_path <- "/images/edits"
      # Bearer token
      if (!is.null(self$api_client$bearer_token)) {
        header_params["Authorization"] <- paste("Bearer", self$api_client$bearer_token, sep = " ")
      }

      # The Accept request HTTP header
      local_var_accepts <- list("application/json")

      # The Content-Type representation header
      local_var_content_types <- list("multipart/form-data")

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
          self$api_client$deserialize(local_var_resp$response_as_text(), "ImagesResponse", loadNamespace("openapi")),
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
    #' Creates a variation of a given image.
    #'
    #' @param image The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square.
    #' @param model (optional) No description
    #' @param n (optional) The number of images to generate. Must be between 1 and 10. For `dall-e-3`, only `n=1` is supported. (default value: 1)
    #' @param response_format (optional) The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated. (default value: "url")
    #' @param size (optional) The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`. (default value: "1024x1024")
    #' @param user (optional) A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
    #' @param data_file (optional) name of the data file to save the result
    #' @param ... Other optional arguments
    #'
    #' @return ImagesResponse
    CreateImageVariation = function(image, model = NULL, n = 1, response_format = "url", size = "1024x1024", user = NULL, data_file = NULL, ...) {
      local_var_response <- self$CreateImageVariationWithHttpInfo(image, model, n, response_format, size, user, data_file = data_file, ...)
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
    #' Creates a variation of a given image.
    #'
    #' @param image The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square.
    #' @param model (optional) No description
    #' @param n (optional) The number of images to generate. Must be between 1 and 10. For `dall-e-3`, only `n=1` is supported. (default value: 1)
    #' @param response_format (optional) The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated. (default value: "url")
    #' @param size (optional) The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`. (default value: "1024x1024")
    #' @param user (optional) A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
    #' @param data_file (optional) name of the data file to save the result
    #' @param ... Other optional arguments
    #'
    #' @return API response (ImagesResponse) with additional information such as HTTP status code, headers
    CreateImageVariationWithHttpInfo = function(image, model = NULL, n = 1, response_format = "url", size = "1024x1024", user = NULL, data_file = NULL, ...) {
      args <- list(...)
      query_params <- list()
      header_params <- c()
      form_params <- list()
      file_params <- list()
      local_var_body <- NULL
      oauth_scopes <- NULL
      is_oauth <- FALSE

      if (missing(`image`)) {
        stop("Missing required parameter `image`.")
      }



      if (`n` > 10) {
        stop("Invalid value for `n` when calling ImagesApi$CreateImageVariation, must be smaller than or equal to 10.")
      }
      if (`n` < 1) {
        stop("Invalid value for `n` when calling ImagesApi$CreateImageVariation, must be bigger than or equal to 1.")
      }




      file_params["image"] <- httr::upload_file(`image`)
      form_params["model"] <- `model`
      form_params["n"] <- `n`
      form_params["response_format"] <- `response_format`
      form_params["size"] <- `size`
      form_params["user"] <- `user`
      local_var_url_path <- "/images/variations"
      # Bearer token
      if (!is.null(self$api_client$bearer_token)) {
        header_params["Authorization"] <- paste("Bearer", self$api_client$bearer_token, sep = " ")
      }

      # The Accept request HTTP header
      local_var_accepts <- list("application/json")

      # The Content-Type representation header
      local_var_content_types <- list("multipart/form-data")

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
          self$api_client$deserialize(local_var_resp$response_as_text(), "ImagesResponse", loadNamespace("openapi")),
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
