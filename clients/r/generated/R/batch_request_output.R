#' Create a new BatchRequestOutput
#'
#' @description
#' The per-line object of the batch output and error files
#'
#' @docType class
#' @title BatchRequestOutput
#' @description BatchRequestOutput Class
#' @format An \code{R6Class} generator object
#' @field id  character [optional]
#' @field custom_id A developer-provided per-request id that will be used to match outputs to inputs. character [optional]
#' @field response  \link{BatchRequestOutputResponse} [optional]
#' @field error  \link{BatchRequestOutputError} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
BatchRequestOutput <- R6::R6Class(
  "BatchRequestOutput",
  public = list(
    `id` = NULL,
    `custom_id` = NULL,
    `response` = NULL,
    `error` = NULL,

    #' @description
    #' Initialize a new BatchRequestOutput class.
    #'
    #' @param id id
    #' @param custom_id A developer-provided per-request id that will be used to match outputs to inputs.
    #' @param response response
    #' @param error error
    #' @param ... Other optional arguments.
    initialize = function(`id` = NULL, `custom_id` = NULL, `response` = NULL, `error` = NULL, ...) {
      if (!is.null(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`custom_id`)) {
        if (!(is.character(`custom_id`) && length(`custom_id`) == 1)) {
          stop(paste("Error! Invalid data for `custom_id`. Must be a string:", `custom_id`))
        }
        self$`custom_id` <- `custom_id`
      }
      if (!is.null(`response`)) {
        stopifnot(R6::is.R6(`response`))
        self$`response` <- `response`
      }
      if (!is.null(`error`)) {
        stopifnot(R6::is.R6(`error`))
        self$`error` <- `error`
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
    #' @return BatchRequestOutput as a base R list.
    #' @examples
    #' # convert array of BatchRequestOutput (x) to a data frame
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
    #' Convert BatchRequestOutput to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      BatchRequestOutputObject <- list()
      if (!is.null(self$`id`)) {
        BatchRequestOutputObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`custom_id`)) {
        BatchRequestOutputObject[["custom_id"]] <-
          self$`custom_id`
      }
      if (!is.null(self$`response`)) {
        BatchRequestOutputObject[["response"]] <-
          self$`response`$toSimpleType()
      }
      if (!is.null(self$`error`)) {
        BatchRequestOutputObject[["error"]] <-
          self$`error`$toSimpleType()
      }
      return(BatchRequestOutputObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of BatchRequestOutput
    #'
    #' @param input_json the JSON input
    #' @return the instance of BatchRequestOutput
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`custom_id`)) {
        self$`custom_id` <- this_object$`custom_id`
      }
      if (!is.null(this_object$`response`)) {
        `response_object` <- BatchRequestOutputResponse$new()
        `response_object`$fromJSON(jsonlite::toJSON(this_object$`response`, auto_unbox = TRUE, digits = NA))
        self$`response` <- `response_object`
      }
      if (!is.null(this_object$`error`)) {
        `error_object` <- BatchRequestOutputError$new()
        `error_object`$fromJSON(jsonlite::toJSON(this_object$`error`, auto_unbox = TRUE, digits = NA))
        self$`error` <- `error_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return BatchRequestOutput in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of BatchRequestOutput
    #'
    #' @param input_json the JSON input
    #' @return the instance of BatchRequestOutput
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`custom_id` <- this_object$`custom_id`
      self$`response` <- BatchRequestOutputResponse$new()$fromJSON(jsonlite::toJSON(this_object$`response`, auto_unbox = TRUE, digits = NA))
      self$`error` <- BatchRequestOutputError$new()$fromJSON(jsonlite::toJSON(this_object$`error`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to BatchRequestOutput and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of BatchRequestOutput
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
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
# BatchRequestOutput$unlock()
#
## Below is an example to define the print function
# BatchRequestOutput$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# BatchRequestOutput$lock()

