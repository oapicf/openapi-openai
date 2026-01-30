#' Create a new ListAuditLogsEffectiveAtParameter
#'
#' @description
#' ListAuditLogsEffectiveAtParameter Class
#'
#' @docType class
#' @title ListAuditLogsEffectiveAtParameter
#' @description ListAuditLogsEffectiveAtParameter Class
#' @format An \code{R6Class} generator object
#' @field gt Return only events whose `effective_at` (Unix seconds) is greater than this value. integer [optional]
#' @field gte Return only events whose `effective_at` (Unix seconds) is greater than or equal to this value. integer [optional]
#' @field lt Return only events whose `effective_at` (Unix seconds) is less than this value. integer [optional]
#' @field lte Return only events whose `effective_at` (Unix seconds) is less than or equal to this value. integer [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ListAuditLogsEffectiveAtParameter <- R6::R6Class(
  "ListAuditLogsEffectiveAtParameter",
  public = list(
    `gt` = NULL,
    `gte` = NULL,
    `lt` = NULL,
    `lte` = NULL,

    #' @description
    #' Initialize a new ListAuditLogsEffectiveAtParameter class.
    #'
    #' @param gt Return only events whose `effective_at` (Unix seconds) is greater than this value.
    #' @param gte Return only events whose `effective_at` (Unix seconds) is greater than or equal to this value.
    #' @param lt Return only events whose `effective_at` (Unix seconds) is less than this value.
    #' @param lte Return only events whose `effective_at` (Unix seconds) is less than or equal to this value.
    #' @param ... Other optional arguments.
    initialize = function(`gt` = NULL, `gte` = NULL, `lt` = NULL, `lte` = NULL, ...) {
      if (!is.null(`gt`)) {
        if (!(is.numeric(`gt`) && length(`gt`) == 1)) {
          stop(paste("Error! Invalid data for `gt`. Must be an integer:", `gt`))
        }
        self$`gt` <- `gt`
      }
      if (!is.null(`gte`)) {
        if (!(is.numeric(`gte`) && length(`gte`) == 1)) {
          stop(paste("Error! Invalid data for `gte`. Must be an integer:", `gte`))
        }
        self$`gte` <- `gte`
      }
      if (!is.null(`lt`)) {
        if (!(is.numeric(`lt`) && length(`lt`) == 1)) {
          stop(paste("Error! Invalid data for `lt`. Must be an integer:", `lt`))
        }
        self$`lt` <- `lt`
      }
      if (!is.null(`lte`)) {
        if (!(is.numeric(`lte`) && length(`lte`) == 1)) {
          stop(paste("Error! Invalid data for `lte`. Must be an integer:", `lte`))
        }
        self$`lte` <- `lte`
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
    #' @return ListAuditLogsEffectiveAtParameter as a base R list.
    #' @examples
    #' # convert array of ListAuditLogsEffectiveAtParameter (x) to a data frame
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
    #' Convert ListAuditLogsEffectiveAtParameter to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      ListAuditLogsEffectiveAtParameterObject <- list()
      if (!is.null(self$`gt`)) {
        ListAuditLogsEffectiveAtParameterObject[["gt"]] <-
          self$`gt`
      }
      if (!is.null(self$`gte`)) {
        ListAuditLogsEffectiveAtParameterObject[["gte"]] <-
          self$`gte`
      }
      if (!is.null(self$`lt`)) {
        ListAuditLogsEffectiveAtParameterObject[["lt"]] <-
          self$`lt`
      }
      if (!is.null(self$`lte`)) {
        ListAuditLogsEffectiveAtParameterObject[["lte"]] <-
          self$`lte`
      }
      return(ListAuditLogsEffectiveAtParameterObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of ListAuditLogsEffectiveAtParameter
    #'
    #' @param input_json the JSON input
    #' @return the instance of ListAuditLogsEffectiveAtParameter
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`gt`)) {
        self$`gt` <- this_object$`gt`
      }
      if (!is.null(this_object$`gte`)) {
        self$`gte` <- this_object$`gte`
      }
      if (!is.null(this_object$`lt`)) {
        self$`lt` <- this_object$`lt`
      }
      if (!is.null(this_object$`lte`)) {
        self$`lte` <- this_object$`lte`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return ListAuditLogsEffectiveAtParameter in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of ListAuditLogsEffectiveAtParameter
    #'
    #' @param input_json the JSON input
    #' @return the instance of ListAuditLogsEffectiveAtParameter
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`gt` <- this_object$`gt`
      self$`gte` <- this_object$`gte`
      self$`lt` <- this_object$`lt`
      self$`lte` <- this_object$`lte`
      self
    },

    #' @description
    #' Validate JSON input with respect to ListAuditLogsEffectiveAtParameter and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ListAuditLogsEffectiveAtParameter
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
# ListAuditLogsEffectiveAtParameter$unlock()
#
## Below is an example to define the print function
# ListAuditLogsEffectiveAtParameter$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ListAuditLogsEffectiveAtParameter$lock()

