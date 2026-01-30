#' Create a new BatchErrorsDataInner
#'
#' @description
#' BatchErrorsDataInner Class
#'
#' @docType class
#' @title BatchErrorsDataInner
#' @description BatchErrorsDataInner Class
#' @format An \code{R6Class} generator object
#' @field code An error code identifying the error type. character [optional]
#' @field message A human-readable message providing more details about the error. character [optional]
#' @field param The name of the parameter that caused the error, if applicable. character [optional]
#' @field line The line number of the input file where the error occurred, if applicable. integer [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
BatchErrorsDataInner <- R6::R6Class(
  "BatchErrorsDataInner",
  public = list(
    `code` = NULL,
    `message` = NULL,
    `param` = NULL,
    `line` = NULL,

    #' @description
    #' Initialize a new BatchErrorsDataInner class.
    #'
    #' @param code An error code identifying the error type.
    #' @param message A human-readable message providing more details about the error.
    #' @param param The name of the parameter that caused the error, if applicable.
    #' @param line The line number of the input file where the error occurred, if applicable.
    #' @param ... Other optional arguments.
    initialize = function(`code` = NULL, `message` = NULL, `param` = NULL, `line` = NULL, ...) {
      if (!is.null(`code`)) {
        if (!(is.character(`code`) && length(`code`) == 1)) {
          stop(paste("Error! Invalid data for `code`. Must be a string:", `code`))
        }
        self$`code` <- `code`
      }
      if (!is.null(`message`)) {
        if (!(is.character(`message`) && length(`message`) == 1)) {
          stop(paste("Error! Invalid data for `message`. Must be a string:", `message`))
        }
        self$`message` <- `message`
      }
      if (!is.null(`param`)) {
        if (!(is.character(`param`) && length(`param`) == 1)) {
          stop(paste("Error! Invalid data for `param`. Must be a string:", `param`))
        }
        self$`param` <- `param`
      }
      if (!is.null(`line`)) {
        if (!(is.numeric(`line`) && length(`line`) == 1)) {
          stop(paste("Error! Invalid data for `line`. Must be an integer:", `line`))
        }
        self$`line` <- `line`
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
    #' @return BatchErrorsDataInner as a base R list.
    #' @examples
    #' # convert array of BatchErrorsDataInner (x) to a data frame
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
    #' Convert BatchErrorsDataInner to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      BatchErrorsDataInnerObject <- list()
      if (!is.null(self$`code`)) {
        BatchErrorsDataInnerObject[["code"]] <-
          self$`code`
      }
      if (!is.null(self$`message`)) {
        BatchErrorsDataInnerObject[["message"]] <-
          self$`message`
      }
      if (!is.null(self$`param`)) {
        BatchErrorsDataInnerObject[["param"]] <-
          self$`param`
      }
      if (!is.null(self$`line`)) {
        BatchErrorsDataInnerObject[["line"]] <-
          self$`line`
      }
      return(BatchErrorsDataInnerObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of BatchErrorsDataInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of BatchErrorsDataInner
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`code`)) {
        self$`code` <- this_object$`code`
      }
      if (!is.null(this_object$`message`)) {
        self$`message` <- this_object$`message`
      }
      if (!is.null(this_object$`param`)) {
        self$`param` <- this_object$`param`
      }
      if (!is.null(this_object$`line`)) {
        self$`line` <- this_object$`line`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return BatchErrorsDataInner in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of BatchErrorsDataInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of BatchErrorsDataInner
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`code` <- this_object$`code`
      self$`message` <- this_object$`message`
      self$`param` <- this_object$`param`
      self$`line` <- this_object$`line`
      self
    },

    #' @description
    #' Validate JSON input with respect to BatchErrorsDataInner and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of BatchErrorsDataInner
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
# BatchErrorsDataInner$unlock()
#
## Below is an example to define the print function
# BatchErrorsDataInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# BatchErrorsDataInner$lock()

