#' Create a new AuditLogActor
#'
#' @description
#' The actor who performed the audit logged action.
#'
#' @docType class
#' @title AuditLogActor
#' @description AuditLogActor Class
#' @format An \code{R6Class} generator object
#' @field type The type of actor. Is either `session` or `api_key`. character [optional]
#' @field session  \link{AuditLogActorSession} [optional]
#' @field api_key  \link{AuditLogActorApiKey} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AuditLogActor <- R6::R6Class(
  "AuditLogActor",
  public = list(
    `type` = NULL,
    `session` = NULL,
    `api_key` = NULL,

    #' @description
    #' Initialize a new AuditLogActor class.
    #'
    #' @param type The type of actor. Is either `session` or `api_key`.
    #' @param session session
    #' @param api_key api_key
    #' @param ... Other optional arguments.
    initialize = function(`type` = NULL, `session` = NULL, `api_key` = NULL, ...) {
      if (!is.null(`type`)) {
        if (!(`type` %in% c("session", "api_key"))) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be \"session\", \"api_key\".", sep = ""))
        }
        if (!(is.character(`type`) && length(`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", `type`))
        }
        self$`type` <- `type`
      }
      if (!is.null(`session`)) {
        stopifnot(R6::is.R6(`session`))
        self$`session` <- `session`
      }
      if (!is.null(`api_key`)) {
        stopifnot(R6::is.R6(`api_key`))
        self$`api_key` <- `api_key`
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
    #' @return AuditLogActor as a base R list.
    #' @examples
    #' # convert array of AuditLogActor (x) to a data frame
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
    #' Convert AuditLogActor to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      AuditLogActorObject <- list()
      if (!is.null(self$`type`)) {
        AuditLogActorObject[["type"]] <-
          self$`type`
      }
      if (!is.null(self$`session`)) {
        AuditLogActorObject[["session"]] <-
          self$`session`$toSimpleType()
      }
      if (!is.null(self$`api_key`)) {
        AuditLogActorObject[["api_key"]] <-
          self$`api_key`$toSimpleType()
      }
      return(AuditLogActorObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of AuditLogActor
    #'
    #' @param input_json the JSON input
    #' @return the instance of AuditLogActor
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`)) {
        if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("session", "api_key"))) {
          stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"session\", \"api_key\".", sep = ""))
        }
        self$`type` <- this_object$`type`
      }
      if (!is.null(this_object$`session`)) {
        `session_object` <- AuditLogActorSession$new()
        `session_object`$fromJSON(jsonlite::toJSON(this_object$`session`, auto_unbox = TRUE, digits = NA))
        self$`session` <- `session_object`
      }
      if (!is.null(this_object$`api_key`)) {
        `api_key_object` <- AuditLogActorApiKey$new()
        `api_key_object`$fromJSON(jsonlite::toJSON(this_object$`api_key`, auto_unbox = TRUE, digits = NA))
        self$`api_key` <- `api_key_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return AuditLogActor in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AuditLogActor
    #'
    #' @param input_json the JSON input
    #' @return the instance of AuditLogActor
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("session", "api_key"))) {
        stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"session\", \"api_key\".", sep = ""))
      }
      self$`type` <- this_object$`type`
      self$`session` <- AuditLogActorSession$new()$fromJSON(jsonlite::toJSON(this_object$`session`, auto_unbox = TRUE, digits = NA))
      self$`api_key` <- AuditLogActorApiKey$new()$fromJSON(jsonlite::toJSON(this_object$`api_key`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to AuditLogActor and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AuditLogActor
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
# AuditLogActor$unlock()
#
## Below is an example to define the print function
# AuditLogActor$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AuditLogActor$lock()

