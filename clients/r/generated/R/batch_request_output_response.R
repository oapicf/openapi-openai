#' Create a new BatchRequestOutputResponse
#'
#' @description
#' BatchRequestOutputResponse Class
#'
#' @docType class
#' @title BatchRequestOutputResponse
#' @description BatchRequestOutputResponse Class
#' @format An \code{R6Class} generator object
#' @field status_code The HTTP status code of the response integer [optional]
#' @field request_id An unique identifier for the OpenAI API request. Please include this request ID when contacting support. character [optional]
#' @field body The JSON body of the response object [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
BatchRequestOutputResponse <- R6::R6Class(
  "BatchRequestOutputResponse",
  public = list(
    `status_code` = NULL,
    `request_id` = NULL,
    `body` = NULL,

    #' @description
    #' Initialize a new BatchRequestOutputResponse class.
    #'
    #' @param status_code The HTTP status code of the response
    #' @param request_id An unique identifier for the OpenAI API request. Please include this request ID when contacting support.
    #' @param body The JSON body of the response
    #' @param ... Other optional arguments.
    initialize = function(`status_code` = NULL, `request_id` = NULL, `body` = NULL, ...) {
      if (!is.null(`status_code`)) {
        if (!(is.numeric(`status_code`) && length(`status_code`) == 1)) {
          stop(paste("Error! Invalid data for `status_code`. Must be an integer:", `status_code`))
        }
        self$`status_code` <- `status_code`
      }
      if (!is.null(`request_id`)) {
        if (!(is.character(`request_id`) && length(`request_id`) == 1)) {
          stop(paste("Error! Invalid data for `request_id`. Must be a string:", `request_id`))
        }
        self$`request_id` <- `request_id`
      }
      if (!is.null(`body`)) {
        self$`body` <- `body`
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
    #' @return BatchRequestOutputResponse as a base R list.
    #' @examples
    #' # convert array of BatchRequestOutputResponse (x) to a data frame
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
    #' Convert BatchRequestOutputResponse to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      BatchRequestOutputResponseObject <- list()
      if (!is.null(self$`status_code`)) {
        BatchRequestOutputResponseObject[["status_code"]] <-
          self$`status_code`
      }
      if (!is.null(self$`request_id`)) {
        BatchRequestOutputResponseObject[["request_id"]] <-
          self$`request_id`
      }
      if (!is.null(self$`body`)) {
        BatchRequestOutputResponseObject[["body"]] <-
          self$`body`
      }
      return(BatchRequestOutputResponseObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of BatchRequestOutputResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of BatchRequestOutputResponse
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`status_code`)) {
        self$`status_code` <- this_object$`status_code`
      }
      if (!is.null(this_object$`request_id`)) {
        self$`request_id` <- this_object$`request_id`
      }
      if (!is.null(this_object$`body`)) {
        self$`body` <- this_object$`body`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return BatchRequestOutputResponse in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of BatchRequestOutputResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of BatchRequestOutputResponse
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`status_code` <- this_object$`status_code`
      self$`request_id` <- this_object$`request_id`
      self$`body` <- this_object$`body`
      self
    },

    #' @description
    #' Validate JSON input with respect to BatchRequestOutputResponse and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of BatchRequestOutputResponse
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
# BatchRequestOutputResponse$unlock()
#
## Below is an example to define the print function
# BatchRequestOutputResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# BatchRequestOutputResponse$lock()

