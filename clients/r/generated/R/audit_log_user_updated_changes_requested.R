#' Create a new AuditLogUserUpdatedChangesRequested
#'
#' @description
#' The payload used to update the user.
#'
#' @docType class
#' @title AuditLogUserUpdatedChangesRequested
#' @description AuditLogUserUpdatedChangesRequested Class
#' @format An \code{R6Class} generator object
#' @field role The role of the user. Is either `owner` or `member`. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AuditLogUserUpdatedChangesRequested <- R6::R6Class(
  "AuditLogUserUpdatedChangesRequested",
  public = list(
    `role` = NULL,

    #' @description
    #' Initialize a new AuditLogUserUpdatedChangesRequested class.
    #'
    #' @param role The role of the user. Is either `owner` or `member`.
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
    #' @return AuditLogUserUpdatedChangesRequested as a base R list.
    #' @examples
    #' # convert array of AuditLogUserUpdatedChangesRequested (x) to a data frame
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
    #' Convert AuditLogUserUpdatedChangesRequested to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      AuditLogUserUpdatedChangesRequestedObject <- list()
      if (!is.null(self$`role`)) {
        AuditLogUserUpdatedChangesRequestedObject[["role"]] <-
          self$`role`
      }
      return(AuditLogUserUpdatedChangesRequestedObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of AuditLogUserUpdatedChangesRequested
    #'
    #' @param input_json the JSON input
    #' @return the instance of AuditLogUserUpdatedChangesRequested
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
    #' @return AuditLogUserUpdatedChangesRequested in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AuditLogUserUpdatedChangesRequested
    #'
    #' @param input_json the JSON input
    #' @return the instance of AuditLogUserUpdatedChangesRequested
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`role` <- this_object$`role`
      self
    },

    #' @description
    #' Validate JSON input with respect to AuditLogUserUpdatedChangesRequested and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AuditLogUserUpdatedChangesRequested
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
# AuditLogUserUpdatedChangesRequested$unlock()
#
## Below is an example to define the print function
# AuditLogUserUpdatedChangesRequested$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AuditLogUserUpdatedChangesRequested$lock()

