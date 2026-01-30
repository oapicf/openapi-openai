#' Create a new AuditLogOrganizationUpdatedChangesRequestedSettings
#'
#' @description
#' AuditLogOrganizationUpdatedChangesRequestedSettings Class
#'
#' @docType class
#' @title AuditLogOrganizationUpdatedChangesRequestedSettings
#' @description AuditLogOrganizationUpdatedChangesRequestedSettings Class
#' @format An \code{R6Class} generator object
#' @field threads_ui_visibility Visibility of the threads page which shows messages created with the Assistants API and Playground. One of `ANY_ROLE`, `OWNERS`, or `NONE`. character [optional]
#' @field usage_dashboard_visibility Visibility of the usage dashboard which shows activity and costs for your organization. One of `ANY_ROLE` or `OWNERS`. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AuditLogOrganizationUpdatedChangesRequestedSettings <- R6::R6Class(
  "AuditLogOrganizationUpdatedChangesRequestedSettings",
  public = list(
    `threads_ui_visibility` = NULL,
    `usage_dashboard_visibility` = NULL,

    #' @description
    #' Initialize a new AuditLogOrganizationUpdatedChangesRequestedSettings class.
    #'
    #' @param threads_ui_visibility Visibility of the threads page which shows messages created with the Assistants API and Playground. One of `ANY_ROLE`, `OWNERS`, or `NONE`.
    #' @param usage_dashboard_visibility Visibility of the usage dashboard which shows activity and costs for your organization. One of `ANY_ROLE` or `OWNERS`.
    #' @param ... Other optional arguments.
    initialize = function(`threads_ui_visibility` = NULL, `usage_dashboard_visibility` = NULL, ...) {
      if (!is.null(`threads_ui_visibility`)) {
        if (!(is.character(`threads_ui_visibility`) && length(`threads_ui_visibility`) == 1)) {
          stop(paste("Error! Invalid data for `threads_ui_visibility`. Must be a string:", `threads_ui_visibility`))
        }
        self$`threads_ui_visibility` <- `threads_ui_visibility`
      }
      if (!is.null(`usage_dashboard_visibility`)) {
        if (!(is.character(`usage_dashboard_visibility`) && length(`usage_dashboard_visibility`) == 1)) {
          stop(paste("Error! Invalid data for `usage_dashboard_visibility`. Must be a string:", `usage_dashboard_visibility`))
        }
        self$`usage_dashboard_visibility` <- `usage_dashboard_visibility`
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
    #' @return AuditLogOrganizationUpdatedChangesRequestedSettings as a base R list.
    #' @examples
    #' # convert array of AuditLogOrganizationUpdatedChangesRequestedSettings (x) to a data frame
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
    #' Convert AuditLogOrganizationUpdatedChangesRequestedSettings to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      AuditLogOrganizationUpdatedChangesRequestedSettingsObject <- list()
      if (!is.null(self$`threads_ui_visibility`)) {
        AuditLogOrganizationUpdatedChangesRequestedSettingsObject[["threads_ui_visibility"]] <-
          self$`threads_ui_visibility`
      }
      if (!is.null(self$`usage_dashboard_visibility`)) {
        AuditLogOrganizationUpdatedChangesRequestedSettingsObject[["usage_dashboard_visibility"]] <-
          self$`usage_dashboard_visibility`
      }
      return(AuditLogOrganizationUpdatedChangesRequestedSettingsObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of AuditLogOrganizationUpdatedChangesRequestedSettings
    #'
    #' @param input_json the JSON input
    #' @return the instance of AuditLogOrganizationUpdatedChangesRequestedSettings
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`threads_ui_visibility`)) {
        self$`threads_ui_visibility` <- this_object$`threads_ui_visibility`
      }
      if (!is.null(this_object$`usage_dashboard_visibility`)) {
        self$`usage_dashboard_visibility` <- this_object$`usage_dashboard_visibility`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return AuditLogOrganizationUpdatedChangesRequestedSettings in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AuditLogOrganizationUpdatedChangesRequestedSettings
    #'
    #' @param input_json the JSON input
    #' @return the instance of AuditLogOrganizationUpdatedChangesRequestedSettings
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`threads_ui_visibility` <- this_object$`threads_ui_visibility`
      self$`usage_dashboard_visibility` <- this_object$`usage_dashboard_visibility`
      self
    },

    #' @description
    #' Validate JSON input with respect to AuditLogOrganizationUpdatedChangesRequestedSettings and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AuditLogOrganizationUpdatedChangesRequestedSettings
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
# AuditLogOrganizationUpdatedChangesRequestedSettings$unlock()
#
## Below is an example to define the print function
# AuditLogOrganizationUpdatedChangesRequestedSettings$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AuditLogOrganizationUpdatedChangesRequestedSettings$lock()

