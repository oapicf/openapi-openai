#' Create a new AuditLogProject
#'
#' @description
#' The project that the action was scoped to. Absent for actions not scoped to projects.
#'
#' @docType class
#' @title AuditLogProject
#' @description AuditLogProject Class
#' @format An \code{R6Class} generator object
#' @field id The project ID. character [optional]
#' @field name The project title. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AuditLogProject <- R6::R6Class(
  "AuditLogProject",
  public = list(
    `id` = NULL,
    `name` = NULL,

    #' @description
    #' Initialize a new AuditLogProject class.
    #'
    #' @param id The project ID.
    #' @param name The project title.
    #' @param ... Other optional arguments.
    initialize = function(`id` = NULL, `name` = NULL, ...) {
      if (!is.null(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
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
    #' @return AuditLogProject as a base R list.
    #' @examples
    #' # convert array of AuditLogProject (x) to a data frame
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
    #' Convert AuditLogProject to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      AuditLogProjectObject <- list()
      if (!is.null(self$`id`)) {
        AuditLogProjectObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`name`)) {
        AuditLogProjectObject[["name"]] <-
          self$`name`
      }
      return(AuditLogProjectObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of AuditLogProject
    #'
    #' @param input_json the JSON input
    #' @return the instance of AuditLogProject
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return AuditLogProject in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AuditLogProject
    #'
    #' @param input_json the JSON input
    #' @return the instance of AuditLogProject
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`name` <- this_object$`name`
      self
    },

    #' @description
    #' Validate JSON input with respect to AuditLogProject and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AuditLogProject
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
# AuditLogProject$unlock()
#
## Below is an example to define the print function
# AuditLogProject$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AuditLogProject$lock()

