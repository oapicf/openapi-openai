#' Create a new AuditLogUserUpdated
#'
#' @description
#' The details for events with this `type`.
#'
#' @docType class
#' @title AuditLogUserUpdated
#' @description AuditLogUserUpdated Class
#' @format An \code{R6Class} generator object
#' @field id The project ID. character [optional]
#' @field changes_requested  \link{AuditLogUserUpdatedChangesRequested} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AuditLogUserUpdated <- R6::R6Class(
  "AuditLogUserUpdated",
  public = list(
    `id` = NULL,
    `changes_requested` = NULL,

    #' @description
    #' Initialize a new AuditLogUserUpdated class.
    #'
    #' @param id The project ID.
    #' @param changes_requested changes_requested
    #' @param ... Other optional arguments.
    initialize = function(`id` = NULL, `changes_requested` = NULL, ...) {
      if (!is.null(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`changes_requested`)) {
        stopifnot(R6::is.R6(`changes_requested`))
        self$`changes_requested` <- `changes_requested`
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
    #' @return AuditLogUserUpdated as a base R list.
    #' @examples
    #' # convert array of AuditLogUserUpdated (x) to a data frame
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
    #' Convert AuditLogUserUpdated to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      AuditLogUserUpdatedObject <- list()
      if (!is.null(self$`id`)) {
        AuditLogUserUpdatedObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`changes_requested`)) {
        AuditLogUserUpdatedObject[["changes_requested"]] <-
          self$`changes_requested`$toSimpleType()
      }
      return(AuditLogUserUpdatedObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of AuditLogUserUpdated
    #'
    #' @param input_json the JSON input
    #' @return the instance of AuditLogUserUpdated
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`changes_requested`)) {
        `changes_requested_object` <- AuditLogUserUpdatedChangesRequested$new()
        `changes_requested_object`$fromJSON(jsonlite::toJSON(this_object$`changes_requested`, auto_unbox = TRUE, digits = NA))
        self$`changes_requested` <- `changes_requested_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return AuditLogUserUpdated in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AuditLogUserUpdated
    #'
    #' @param input_json the JSON input
    #' @return the instance of AuditLogUserUpdated
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`changes_requested` <- AuditLogUserUpdatedChangesRequested$new()$fromJSON(jsonlite::toJSON(this_object$`changes_requested`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to AuditLogUserUpdated and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AuditLogUserUpdated
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
# AuditLogUserUpdated$unlock()
#
## Below is an example to define the print function
# AuditLogUserUpdated$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AuditLogUserUpdated$lock()

