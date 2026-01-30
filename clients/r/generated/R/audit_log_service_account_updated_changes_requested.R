#' Create a new AuditLogServiceAccountUpdatedChangesRequested
#'
#' @description
#' The payload used to updated the service account.
#'
#' @docType class
#' @title AuditLogServiceAccountUpdatedChangesRequested
#' @description AuditLogServiceAccountUpdatedChangesRequested Class
#' @format An \code{R6Class} generator object
#' @field role The role of the service account. Is either `owner` or `member`. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AuditLogServiceAccountUpdatedChangesRequested <- R6::R6Class(
  "AuditLogServiceAccountUpdatedChangesRequested",
  public = list(
    `role` = NULL,

    #' @description
    #' Initialize a new AuditLogServiceAccountUpdatedChangesRequested class.
    #'
    #' @param role The role of the service account. Is either `owner` or `member`.
    #' @param ... Other optional arguments.
    initialize = function(`role` = NULL, ...) {
      if (!is.null(`role`)) {
        if (!(is.character(`role`) && length(`role`) == 1)) {
          stop(paste("Error! Invalid data for `role`. Must be a string:", `role`))
        }
        self$`role` <- `role`
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
    #' @return AuditLogServiceAccountUpdatedChangesRequested as a base R list.
    #' @examples
    #' # convert array of AuditLogServiceAccountUpdatedChangesRequested (x) to a data frame
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
    #' Convert AuditLogServiceAccountUpdatedChangesRequested to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      AuditLogServiceAccountUpdatedChangesRequestedObject <- list()
      if (!is.null(self$`role`)) {
        AuditLogServiceAccountUpdatedChangesRequestedObject[["role"]] <-
          self$`role`
      }
      return(AuditLogServiceAccountUpdatedChangesRequestedObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of AuditLogServiceAccountUpdatedChangesRequested
    #'
    #' @param input_json the JSON input
    #' @return the instance of AuditLogServiceAccountUpdatedChangesRequested
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`role`)) {
        self$`role` <- this_object$`role`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return AuditLogServiceAccountUpdatedChangesRequested in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AuditLogServiceAccountUpdatedChangesRequested
    #'
    #' @param input_json the JSON input
    #' @return the instance of AuditLogServiceAccountUpdatedChangesRequested
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`role` <- this_object$`role`
      self
    },

    #' @description
    #' Validate JSON input with respect to AuditLogServiceAccountUpdatedChangesRequested and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AuditLogServiceAccountUpdatedChangesRequested
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
# AuditLogServiceAccountUpdatedChangesRequested$unlock()
#
## Below is an example to define the print function
# AuditLogServiceAccountUpdatedChangesRequested$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AuditLogServiceAccountUpdatedChangesRequested$lock()

