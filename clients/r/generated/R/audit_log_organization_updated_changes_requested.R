#' Create a new AuditLogOrganizationUpdatedChangesRequested
#'
#' @description
#' The payload used to update the organization settings.
#'
#' @docType class
#' @title AuditLogOrganizationUpdatedChangesRequested
#' @description AuditLogOrganizationUpdatedChangesRequested Class
#' @format An \code{R6Class} generator object
#' @field title The organization title. character [optional]
#' @field description The organization description. character [optional]
#' @field name The organization name. character [optional]
#' @field settings  \link{AuditLogOrganizationUpdatedChangesRequestedSettings} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AuditLogOrganizationUpdatedChangesRequested <- R6::R6Class(
  "AuditLogOrganizationUpdatedChangesRequested",
  public = list(
    `title` = NULL,
    `description` = NULL,
    `name` = NULL,
    `settings` = NULL,

    #' @description
    #' Initialize a new AuditLogOrganizationUpdatedChangesRequested class.
    #'
    #' @param title The organization title.
    #' @param description The organization description.
    #' @param name The organization name.
    #' @param settings settings
    #' @param ... Other optional arguments.
    initialize = function(`title` = NULL, `description` = NULL, `name` = NULL, `settings` = NULL, ...) {
      if (!is.null(`title`)) {
        if (!(is.character(`title`) && length(`title`) == 1)) {
          stop(paste("Error! Invalid data for `title`. Must be a string:", `title`))
        }
        self$`title` <- `title`
      }
      if (!is.null(`description`)) {
        if (!(is.character(`description`) && length(`description`) == 1)) {
          stop(paste("Error! Invalid data for `description`. Must be a string:", `description`))
        }
        self$`description` <- `description`
      }
      if (!is.null(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!is.null(`settings`)) {
        stopifnot(R6::is.R6(`settings`))
        self$`settings` <- `settings`
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
    #' @return AuditLogOrganizationUpdatedChangesRequested as a base R list.
    #' @examples
    #' # convert array of AuditLogOrganizationUpdatedChangesRequested (x) to a data frame
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
    #' Convert AuditLogOrganizationUpdatedChangesRequested to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      AuditLogOrganizationUpdatedChangesRequestedObject <- list()
      if (!is.null(self$`title`)) {
        AuditLogOrganizationUpdatedChangesRequestedObject[["title"]] <-
          self$`title`
      }
      if (!is.null(self$`description`)) {
        AuditLogOrganizationUpdatedChangesRequestedObject[["description"]] <-
          self$`description`
      }
      if (!is.null(self$`name`)) {
        AuditLogOrganizationUpdatedChangesRequestedObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`settings`)) {
        AuditLogOrganizationUpdatedChangesRequestedObject[["settings"]] <-
          self$`settings`$toSimpleType()
      }
      return(AuditLogOrganizationUpdatedChangesRequestedObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of AuditLogOrganizationUpdatedChangesRequested
    #'
    #' @param input_json the JSON input
    #' @return the instance of AuditLogOrganizationUpdatedChangesRequested
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`title`)) {
        self$`title` <- this_object$`title`
      }
      if (!is.null(this_object$`description`)) {
        self$`description` <- this_object$`description`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`settings`)) {
        `settings_object` <- AuditLogOrganizationUpdatedChangesRequestedSettings$new()
        `settings_object`$fromJSON(jsonlite::toJSON(this_object$`settings`, auto_unbox = TRUE, digits = NA))
        self$`settings` <- `settings_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return AuditLogOrganizationUpdatedChangesRequested in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AuditLogOrganizationUpdatedChangesRequested
    #'
    #' @param input_json the JSON input
    #' @return the instance of AuditLogOrganizationUpdatedChangesRequested
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`title` <- this_object$`title`
      self$`description` <- this_object$`description`
      self$`name` <- this_object$`name`
      self$`settings` <- AuditLogOrganizationUpdatedChangesRequestedSettings$new()$fromJSON(jsonlite::toJSON(this_object$`settings`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to AuditLogOrganizationUpdatedChangesRequested and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AuditLogOrganizationUpdatedChangesRequested
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
# AuditLogOrganizationUpdatedChangesRequested$unlock()
#
## Below is an example to define the print function
# AuditLogOrganizationUpdatedChangesRequested$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AuditLogOrganizationUpdatedChangesRequested$lock()

