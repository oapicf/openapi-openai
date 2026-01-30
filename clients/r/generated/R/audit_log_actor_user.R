#' Create a new AuditLogActorUser
#'
#' @description
#' The user who performed the audit logged action.
#'
#' @docType class
#' @title AuditLogActorUser
#' @description AuditLogActorUser Class
#' @format An \code{R6Class} generator object
#' @field id The user id. character [optional]
#' @field email The user email. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AuditLogActorUser <- R6::R6Class(
  "AuditLogActorUser",
  public = list(
    `id` = NULL,
    `email` = NULL,

    #' @description
    #' Initialize a new AuditLogActorUser class.
    #'
    #' @param id The user id.
    #' @param email The user email.
    #' @param ... Other optional arguments.
    initialize = function(`id` = NULL, `email` = NULL, ...) {
      if (!is.null(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`email`)) {
        if (!(is.character(`email`) && length(`email`) == 1)) {
          stop(paste("Error! Invalid data for `email`. Must be a string:", `email`))
        }
        self$`email` <- `email`
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
    #' @return AuditLogActorUser as a base R list.
    #' @examples
    #' # convert array of AuditLogActorUser (x) to a data frame
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
    #' Convert AuditLogActorUser to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      AuditLogActorUserObject <- list()
      if (!is.null(self$`id`)) {
        AuditLogActorUserObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`email`)) {
        AuditLogActorUserObject[["email"]] <-
          self$`email`
      }
      return(AuditLogActorUserObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of AuditLogActorUser
    #'
    #' @param input_json the JSON input
    #' @return the instance of AuditLogActorUser
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`email`)) {
        self$`email` <- this_object$`email`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return AuditLogActorUser in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AuditLogActorUser
    #'
    #' @param input_json the JSON input
    #' @return the instance of AuditLogActorUser
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`email` <- this_object$`email`
      self
    },

    #' @description
    #' Validate JSON input with respect to AuditLogActorUser and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AuditLogActorUser
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
# AuditLogActorUser$unlock()
#
## Below is an example to define the print function
# AuditLogActorUser$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AuditLogActorUser$lock()

