#' Create a new AuditLogProjectCreatedData
#'
#' @description
#' The payload used to create the project.
#'
#' @docType class
#' @title AuditLogProjectCreatedData
#' @description AuditLogProjectCreatedData Class
#' @format An \code{R6Class} generator object
#' @field name The project name. character [optional]
#' @field title The title of the project as seen on the dashboard. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AuditLogProjectCreatedData <- R6::R6Class(
  "AuditLogProjectCreatedData",
  public = list(
    `name` = NULL,
    `title` = NULL,

    #' @description
    #' Initialize a new AuditLogProjectCreatedData class.
    #'
    #' @param name The project name.
    #' @param title The title of the project as seen on the dashboard.
    #' @param ... Other optional arguments.
    initialize = function(`name` = NULL, `title` = NULL, ...) {
      if (!is.null(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
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
    #' @return AuditLogProjectCreatedData as a base R list.
    #' @examples
    #' # convert array of AuditLogProjectCreatedData (x) to a data frame
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
    #' Convert AuditLogProjectCreatedData to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      AuditLogProjectCreatedDataObject <- list()
      if (!is.null(self$`name`)) {
        AuditLogProjectCreatedDataObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`title`)) {
        AuditLogProjectCreatedDataObject[["title"]] <-
          self$`title`
      }
      return(AuditLogProjectCreatedDataObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of AuditLogProjectCreatedData
    #'
    #' @param input_json the JSON input
    #' @return the instance of AuditLogProjectCreatedData
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`title`)) {
        self$`title` <- this_object$`title`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return AuditLogProjectCreatedData in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AuditLogProjectCreatedData
    #'
    #' @param input_json the JSON input
    #' @return the instance of AuditLogProjectCreatedData
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`name` <- this_object$`name`
      self$`title` <- this_object$`title`
      self
    },

    #' @description
    #' Validate JSON input with respect to AuditLogProjectCreatedData and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AuditLogProjectCreatedData
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
# AuditLogProjectCreatedData$unlock()
#
## Below is an example to define the print function
# AuditLogProjectCreatedData$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AuditLogProjectCreatedData$lock()

