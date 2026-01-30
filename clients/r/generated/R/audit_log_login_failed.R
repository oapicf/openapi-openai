#' Create a new AuditLogLoginFailed
#'
#' @description
#' The details for events with this `type`.
#'
#' @docType class
#' @title AuditLogLoginFailed
#' @description AuditLogLoginFailed Class
#' @format An \code{R6Class} generator object
#' @field error_code The error code of the failure. character [optional]
#' @field error_message The error message of the failure. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AuditLogLoginFailed <- R6::R6Class(
  "AuditLogLoginFailed",
  public = list(
    `error_code` = NULL,
    `error_message` = NULL,

    #' @description
    #' Initialize a new AuditLogLoginFailed class.
    #'
    #' @param error_code The error code of the failure.
    #' @param error_message The error message of the failure.
    #' @param ... Other optional arguments.
    initialize = function(`error_code` = NULL, `error_message` = NULL, ...) {
      if (!is.null(`error_code`)) {
        if (!(is.character(`error_code`) && length(`error_code`) == 1)) {
          stop(paste("Error! Invalid data for `error_code`. Must be a string:", `error_code`))
        }
        self$`error_code` <- `error_code`
      }
      if (!is.null(`error_message`)) {
        if (!(is.character(`error_message`) && length(`error_message`) == 1)) {
          stop(paste("Error! Invalid data for `error_message`. Must be a string:", `error_message`))
        }
        self$`error_message` <- `error_message`
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
    #' @return AuditLogLoginFailed as a base R list.
    #' @examples
    #' # convert array of AuditLogLoginFailed (x) to a data frame
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
    #' Convert AuditLogLoginFailed to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      AuditLogLoginFailedObject <- list()
      if (!is.null(self$`error_code`)) {
        AuditLogLoginFailedObject[["error_code"]] <-
          self$`error_code`
      }
      if (!is.null(self$`error_message`)) {
        AuditLogLoginFailedObject[["error_message"]] <-
          self$`error_message`
      }
      return(AuditLogLoginFailedObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of AuditLogLoginFailed
    #'
    #' @param input_json the JSON input
    #' @return the instance of AuditLogLoginFailed
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`error_code`)) {
        self$`error_code` <- this_object$`error_code`
      }
      if (!is.null(this_object$`error_message`)) {
        self$`error_message` <- this_object$`error_message`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return AuditLogLoginFailed in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AuditLogLoginFailed
    #'
    #' @param input_json the JSON input
    #' @return the instance of AuditLogLoginFailed
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`error_code` <- this_object$`error_code`
      self$`error_message` <- this_object$`error_message`
      self
    },

    #' @description
    #' Validate JSON input with respect to AuditLogLoginFailed and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AuditLogLoginFailed
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
# AuditLogLoginFailed$unlock()
#
## Below is an example to define the print function
# AuditLogLoginFailed$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AuditLogLoginFailed$lock()

