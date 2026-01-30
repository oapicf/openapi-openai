#' Create a new CreateBatchRequest
#'
#' @description
#' CreateBatchRequest Class
#'
#' @docType class
#' @title CreateBatchRequest
#' @description CreateBatchRequest Class
#' @format An \code{R6Class} generator object
#' @field input_file_id The ID of an uploaded file that contains requests for the new batch.  See [upload file](/docs/api-reference/files/create) for how to upload a file.  Your input file must be formatted as a [JSONL file](/docs/api-reference/batch/request-input), and must be uploaded with the purpose `batch`. The file can contain up to 50,000 requests, and can be up to 200 MB in size. character
#' @field endpoint The endpoint to be used for all requests in the batch. Currently `/v1/chat/completions`, `/v1/embeddings`, and `/v1/completions` are supported. Note that `/v1/embeddings` batches are also restricted to a maximum of 50,000 embedding inputs across all requests in the batch. character
#' @field completion_window The time frame within which the batch should be processed. Currently only `24h` is supported. character
#' @field metadata Optional custom metadata for the batch. named list(character) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CreateBatchRequest <- R6::R6Class(
  "CreateBatchRequest",
  public = list(
    `input_file_id` = NULL,
    `endpoint` = NULL,
    `completion_window` = NULL,
    `metadata` = NULL,

    #' @description
    #' Initialize a new CreateBatchRequest class.
    #'
    #' @param input_file_id The ID of an uploaded file that contains requests for the new batch.  See [upload file](/docs/api-reference/files/create) for how to upload a file.  Your input file must be formatted as a [JSONL file](/docs/api-reference/batch/request-input), and must be uploaded with the purpose `batch`. The file can contain up to 50,000 requests, and can be up to 200 MB in size.
    #' @param endpoint The endpoint to be used for all requests in the batch. Currently `/v1/chat/completions`, `/v1/embeddings`, and `/v1/completions` are supported. Note that `/v1/embeddings` batches are also restricted to a maximum of 50,000 embedding inputs across all requests in the batch.
    #' @param completion_window The time frame within which the batch should be processed. Currently only `24h` is supported.
    #' @param metadata Optional custom metadata for the batch.
    #' @param ... Other optional arguments.
    initialize = function(`input_file_id`, `endpoint`, `completion_window`, `metadata` = NULL, ...) {
      if (!missing(`input_file_id`)) {
        if (!(is.character(`input_file_id`) && length(`input_file_id`) == 1)) {
          stop(paste("Error! Invalid data for `input_file_id`. Must be a string:", `input_file_id`))
        }
        self$`input_file_id` <- `input_file_id`
      }
      if (!missing(`endpoint`)) {
        if (!(`endpoint` %in% c("/v1/chat/completions", "/v1/embeddings", "/v1/completions"))) {
          stop(paste("Error! \"", `endpoint`, "\" cannot be assigned to `endpoint`. Must be \"/v1/chat/completions\", \"/v1/embeddings\", \"/v1/completions\".", sep = ""))
        }
        if (!(is.character(`endpoint`) && length(`endpoint`) == 1)) {
          stop(paste("Error! Invalid data for `endpoint`. Must be a string:", `endpoint`))
        }
        self$`endpoint` <- `endpoint`
      }
      if (!missing(`completion_window`)) {
        if (!(`completion_window` %in% c("24h"))) {
          stop(paste("Error! \"", `completion_window`, "\" cannot be assigned to `completion_window`. Must be \"24h\".", sep = ""))
        }
        if (!(is.character(`completion_window`) && length(`completion_window`) == 1)) {
          stop(paste("Error! Invalid data for `completion_window`. Must be a string:", `completion_window`))
        }
        self$`completion_window` <- `completion_window`
      }
      if (!is.null(`metadata`)) {
        stopifnot(is.vector(`metadata`), length(`metadata`) != 0)
        sapply(`metadata`, function(x) stopifnot(is.character(x)))
        self$`metadata` <- `metadata`
      }
    },

    #' @description
    #' Convert to an R object. This method is deprecated. Use `toSimpleType()` instead.
    toJSON = function() {
      .Deprecated(new = "toSimpleType", msg = "Use the '$toSimpleType()' method instead since that is more clearly named. Use '$toJSONString()' to get a JSON string")
      return(self$toSimpleType())
    },

    #' @description
    #' Convert to a List
    #'
    #' Convert the R6 object to a list to work more easily with other tooling.
    #'
    #' @return CreateBatchRequest as a base R list.
    #' @examples
    #' # convert array of CreateBatchRequest (x) to a data frame
    #' \dontrun{
    #' library(purrr)
    #' library(tibble)
    #' df <- x |> map(\(y)y$toList()) |> map(as_tibble) |> list_rbind()
    #' df
    #' }
    toList = function() {
      return(self$toSimpleType())
    },

    #' @description
    #' Convert CreateBatchRequest to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CreateBatchRequestObject <- list()
      if (!is.null(self$`input_file_id`)) {
        CreateBatchRequestObject[["input_file_id"]] <-
          self$`input_file_id`
      }
      if (!is.null(self$`endpoint`)) {
        CreateBatchRequestObject[["endpoint"]] <-
          self$`endpoint`
      }
      if (!is.null(self$`completion_window`)) {
        CreateBatchRequestObject[["completion_window"]] <-
          self$`completion_window`
      }
      if (!is.null(self$`metadata`)) {
        CreateBatchRequestObject[["metadata"]] <-
          self$`metadata`
      }
      return(CreateBatchRequestObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of CreateBatchRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateBatchRequest
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`input_file_id`)) {
        self$`input_file_id` <- this_object$`input_file_id`
      }
      if (!is.null(this_object$`endpoint`)) {
        if (!is.null(this_object$`endpoint`) && !(this_object$`endpoint` %in% c("/v1/chat/completions", "/v1/embeddings", "/v1/completions"))) {
          stop(paste("Error! \"", this_object$`endpoint`, "\" cannot be assigned to `endpoint`. Must be \"/v1/chat/completions\", \"/v1/embeddings\", \"/v1/completions\".", sep = ""))
        }
        self$`endpoint` <- this_object$`endpoint`
      }
      if (!is.null(this_object$`completion_window`)) {
        if (!is.null(this_object$`completion_window`) && !(this_object$`completion_window` %in% c("24h"))) {
          stop(paste("Error! \"", this_object$`completion_window`, "\" cannot be assigned to `completion_window`. Must be \"24h\".", sep = ""))
        }
        self$`completion_window` <- this_object$`completion_window`
      }
      if (!is.null(this_object$`metadata`)) {
        self$`metadata` <- ApiClient$new()$deserializeObj(this_object$`metadata`, "map(character)", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CreateBatchRequest in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CreateBatchRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateBatchRequest
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`input_file_id` <- this_object$`input_file_id`
      if (!is.null(this_object$`endpoint`) && !(this_object$`endpoint` %in% c("/v1/chat/completions", "/v1/embeddings", "/v1/completions"))) {
        stop(paste("Error! \"", this_object$`endpoint`, "\" cannot be assigned to `endpoint`. Must be \"/v1/chat/completions\", \"/v1/embeddings\", \"/v1/completions\".", sep = ""))
      }
      self$`endpoint` <- this_object$`endpoint`
      if (!is.null(this_object$`completion_window`) && !(this_object$`completion_window` %in% c("24h"))) {
        stop(paste("Error! \"", this_object$`completion_window`, "\" cannot be assigned to `completion_window`. Must be \"24h\".", sep = ""))
      }
      self$`completion_window` <- this_object$`completion_window`
      self$`metadata` <- ApiClient$new()$deserializeObj(this_object$`metadata`, "map(character)", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to CreateBatchRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `input_file_id`
      if (!is.null(input_json$`input_file_id`)) {
        if (!(is.character(input_json$`input_file_id`) && length(input_json$`input_file_id`) == 1)) {
          stop(paste("Error! Invalid data for `input_file_id`. Must be a string:", input_json$`input_file_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateBatchRequest: the required field `input_file_id` is missing."))
      }
      # check the required field `endpoint`
      if (!is.null(input_json$`endpoint`)) {
        if (!(is.character(input_json$`endpoint`) && length(input_json$`endpoint`) == 1)) {
          stop(paste("Error! Invalid data for `endpoint`. Must be a string:", input_json$`endpoint`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateBatchRequest: the required field `endpoint` is missing."))
      }
      # check the required field `completion_window`
      if (!is.null(input_json$`completion_window`)) {
        if (!(is.character(input_json$`completion_window`) && length(input_json$`completion_window`) == 1)) {
          stop(paste("Error! Invalid data for `completion_window`. Must be a string:", input_json$`completion_window`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateBatchRequest: the required field `completion_window` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CreateBatchRequest
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `input_file_id` is null
      if (is.null(self$`input_file_id`)) {
        return(FALSE)
      }

      # check if the required `endpoint` is null
      if (is.null(self$`endpoint`)) {
        return(FALSE)
      }

      # check if the required `completion_window` is null
      if (is.null(self$`completion_window`)) {
        return(FALSE)
      }

      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
      # check if the required `input_file_id` is null
      if (is.null(self$`input_file_id`)) {
        invalid_fields["input_file_id"] <- "Non-nullable required field `input_file_id` cannot be null."
      }

      # check if the required `endpoint` is null
      if (is.null(self$`endpoint`)) {
        invalid_fields["endpoint"] <- "Non-nullable required field `endpoint` cannot be null."
      }

      # check if the required `completion_window` is null
      if (is.null(self$`completion_window`)) {
        invalid_fields["completion_window"] <- "Non-nullable required field `completion_window` cannot be null."
      }

      invalid_fields
    },

    #' @description
    #' Print the object
    print = function() {
      print(jsonlite::prettify(self$toJSONString()))
      invisible(self)
    }
  ),
  # Lock the class to prevent modifications to the method or field
  lock_class = TRUE
)
## Uncomment below to unlock the class to allow modifications of the method or field
# CreateBatchRequest$unlock()
#
## Below is an example to define the print function
# CreateBatchRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CreateBatchRequest$lock()

