#' Create a new AuditLogProjectUpdated
#'
#' @description
#' The details for events with this `type`.
#'
#' @docType class
#' @title AuditLogProjectUpdated
#' @description AuditLogProjectUpdated Class
#' @format An \code{R6Class} generator object
#' @field id The project ID. character [optional]
#' @field changes_requested  \link{AuditLogProjectUpdatedChangesRequested} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AuditLogProjectUpdated <- R6::R6Class(
  "AuditLogProjectUpdated",
  public = list(
    `id` = NULL,
    `changes_requested` = NULL,

    #' @description
    #' Initialize a new AuditLogProjectUpdated class.
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
    #' @return AuditLogProjectUpdated as a base R list.
    #' @examples
    #' # convert array of AuditLogProjectUpdated (x) to a data frame
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
    #' Convert AuditLogProjectUpdated to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      AuditLogProjectUpdatedObject <- list()
      if (!is.null(self$`id`)) {
        AuditLogProjectUpdatedObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`changes_requested`)) {
        AuditLogProjectUpdatedObject[["changes_requested"]] <-
          self$`changes_requested`$toSimpleType()
      }
      return(AuditLogProjectUpdatedObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of AuditLogProjectUpdated
    #'
    #' @param input_json the JSON input
    #' @return the instance of AuditLogProjectUpdated
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`changes_requested`)) {
        `changes_requested_object` <- AuditLogProjectUpdatedChangesRequested$new()
        `changes_requested_object`$fromJSON(jsonlite::toJSON(this_object$`changes_requested`, auto_unbox = TRUE, digits = NA))
        self$`changes_requested` <- `changes_requested_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return AuditLogProjectUpdated in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AuditLogProjectUpdated
    #'
    #' @param input_json the JSON input
    #' @return the instance of AuditLogProjectUpdated
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`changes_requested` <- AuditLogProjectUpdatedChangesRequested$new()$fromJSON(jsonlite::toJSON(this_object$`changes_requested`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to AuditLogProjectUpdated and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AuditLogProjectUpdated
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
# AuditLogProjectUpdated$unlock()
#
## Below is an example to define the print function
# AuditLogProjectUpdated$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AuditLogProjectUpdated$lock()

