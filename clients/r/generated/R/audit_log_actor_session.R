#' Create a new AuditLogActorSession
#'
#' @description
#' The session in which the audit logged action was performed.
#'
#' @docType class
#' @title AuditLogActorSession
#' @description AuditLogActorSession Class
#' @format An \code{R6Class} generator object
#' @field user  \link{AuditLogActorUser} [optional]
#' @field ip_address The IP address from which the action was performed. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AuditLogActorSession <- R6::R6Class(
  "AuditLogActorSession",
  public = list(
    `user` = NULL,
    `ip_address` = NULL,

    #' @description
    #' Initialize a new AuditLogActorSession class.
    #'
    #' @param user user
    #' @param ip_address The IP address from which the action was performed.
    #' @param ... Other optional arguments.
    initialize = function(`user` = NULL, `ip_address` = NULL, ...) {
      if (!is.null(`user`)) {
        stopifnot(R6::is.R6(`user`))
        self$`user` <- `user`
      }
      if (!is.null(`ip_address`)) {
        if (!(is.character(`ip_address`) && length(`ip_address`) == 1)) {
          stop(paste("Error! Invalid data for `ip_address`. Must be a string:", `ip_address`))
        }
        self$`ip_address` <- `ip_address`
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
    #' @return AuditLogActorSession as a base R list.
    #' @examples
    #' # convert array of AuditLogActorSession (x) to a data frame
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
    #' Convert AuditLogActorSession to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      AuditLogActorSessionObject <- list()
      if (!is.null(self$`user`)) {
        AuditLogActorSessionObject[["user"]] <-
          self$`user`$toSimpleType()
      }
      if (!is.null(self$`ip_address`)) {
        AuditLogActorSessionObject[["ip_address"]] <-
          self$`ip_address`
      }
      return(AuditLogActorSessionObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of AuditLogActorSession
    #'
    #' @param input_json the JSON input
    #' @return the instance of AuditLogActorSession
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`user`)) {
        `user_object` <- AuditLogActorUser$new()
        `user_object`$fromJSON(jsonlite::toJSON(this_object$`user`, auto_unbox = TRUE, digits = NA))
        self$`user` <- `user_object`
      }
      if (!is.null(this_object$`ip_address`)) {
        self$`ip_address` <- this_object$`ip_address`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return AuditLogActorSession in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AuditLogActorSession
    #'
    #' @param input_json the JSON input
    #' @return the instance of AuditLogActorSession
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`user` <- AuditLogActorUser$new()$fromJSON(jsonlite::toJSON(this_object$`user`, auto_unbox = TRUE, digits = NA))
      self$`ip_address` <- this_object$`ip_address`
      self
    },

    #' @description
    #' Validate JSON input with respect to AuditLogActorSession and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AuditLogActorSession
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
# AuditLogActorSession$unlock()
#
## Below is an example to define the print function
# AuditLogActorSession$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AuditLogActorSession$lock()

