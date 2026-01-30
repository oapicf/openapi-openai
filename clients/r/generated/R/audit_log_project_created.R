#' Create a new AuditLogProjectCreated
#'
#' @description
#' The details for events with this `type`.
#'
#' @docType class
#' @title AuditLogProjectCreated
#' @description AuditLogProjectCreated Class
#' @format An \code{R6Class} generator object
#' @field id The project ID. character [optional]
#' @field data  \link{AuditLogProjectCreatedData} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AuditLogProjectCreated <- R6::R6Class(
  "AuditLogProjectCreated",
  public = list(
    `id` = NULL,
    `data` = NULL,

    #' @description
    #' Initialize a new AuditLogProjectCreated class.
    #'
    #' @param id The project ID.
    #' @param data data
    #' @param ... Other optional arguments.
    initialize = function(`id` = NULL, `data` = NULL, ...) {
      if (!is.null(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`data`)) {
        stopifnot(R6::is.R6(`data`))
        self$`data` <- `data`
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
    #' @return AuditLogProjectCreated as a base R list.
    #' @examples
    #' # convert array of AuditLogProjectCreated (x) to a data frame
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
    #' Convert AuditLogProjectCreated to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      AuditLogProjectCreatedObject <- list()
      if (!is.null(self$`id`)) {
        AuditLogProjectCreatedObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`data`)) {
        AuditLogProjectCreatedObject[["data"]] <-
          self$`data`$toSimpleType()
      }
      return(AuditLogProjectCreatedObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of AuditLogProjectCreated
    #'
    #' @param input_json the JSON input
    #' @return the instance of AuditLogProjectCreated
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`data`)) {
        `data_object` <- AuditLogProjectCreatedData$new()
        `data_object`$fromJSON(jsonlite::toJSON(this_object$`data`, auto_unbox = TRUE, digits = NA))
        self$`data` <- `data_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return AuditLogProjectCreated in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AuditLogProjectCreated
    #'
    #' @param input_json the JSON input
    #' @return the instance of AuditLogProjectCreated
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`data` <- AuditLogProjectCreatedData$new()$fromJSON(jsonlite::toJSON(this_object$`data`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to AuditLogProjectCreated and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AuditLogProjectCreated
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
# AuditLogProjectCreated$unlock()
#
## Below is an example to define the print function
# AuditLogProjectCreated$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AuditLogProjectCreated$lock()

