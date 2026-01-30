#' Create a new AuditLogProjectUpdatedChangesRequested
#'
#' @description
#' The payload used to update the project.
#'
#' @docType class
#' @title AuditLogProjectUpdatedChangesRequested
#' @description AuditLogProjectUpdatedChangesRequested Class
#' @format An \code{R6Class} generator object
#' @field title The title of the project as seen on the dashboard. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AuditLogProjectUpdatedChangesRequested <- R6::R6Class(
  "AuditLogProjectUpdatedChangesRequested",
  public = list(
    `title` = NULL,

    #' @description
    #' Initialize a new AuditLogProjectUpdatedChangesRequested class.
    #'
    #' @param title The title of the project as seen on the dashboard.
    #' @param ... Other optional arguments.
    initialize = function(`title` = NULL, ...) {
      if (!is.null(`title`)) {
        if (!(is.character(`title`) && length(`title`) == 1)) {
          stop(paste("Error! Invalid data for `title`. Must be a string:", `title`))
        }
        self$`title` <- `title`
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
    #' @return AuditLogProjectUpdatedChangesRequested as a base R list.
    #' @examples
    #' # convert array of AuditLogProjectUpdatedChangesRequested (x) to a data frame
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
    #' Convert AuditLogProjectUpdatedChangesRequested to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      AuditLogProjectUpdatedChangesRequestedObject <- list()
      if (!is.null(self$`title`)) {
        AuditLogProjectUpdatedChangesRequestedObject[["title"]] <-
          self$`title`
      }
      return(AuditLogProjectUpdatedChangesRequestedObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of AuditLogProjectUpdatedChangesRequested
    #'
    #' @param input_json the JSON input
    #' @return the instance of AuditLogProjectUpdatedChangesRequested
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`title`)) {
        self$`title` <- this_object$`title`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return AuditLogProjectUpdatedChangesRequested in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AuditLogProjectUpdatedChangesRequested
    #'
    #' @param input_json the JSON input
    #' @return the instance of AuditLogProjectUpdatedChangesRequested
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`title` <- this_object$`title`
      self
    },

    #' @description
    #' Validate JSON input with respect to AuditLogProjectUpdatedChangesRequested and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AuditLogProjectUpdatedChangesRequested
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
# AuditLogProjectUpdatedChangesRequested$unlock()
#
## Below is an example to define the print function
# AuditLogProjectUpdatedChangesRequested$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AuditLogProjectUpdatedChangesRequested$lock()

