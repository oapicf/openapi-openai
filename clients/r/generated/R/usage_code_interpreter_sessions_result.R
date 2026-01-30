#' Create a new UsageCodeInterpreterSessionsResult
#'
#' @description
#' The aggregated code interpreter sessions usage details of the specific time bucket.
#'
#' @docType class
#' @title UsageCodeInterpreterSessionsResult
#' @description UsageCodeInterpreterSessionsResult Class
#' @format An \code{R6Class} generator object
#' @field object  character
#' @field sessions The number of code interpreter sessions. integer
#' @field project_id When `group_by=project_id`, this field provides the project ID of the grouped usage result. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
UsageCodeInterpreterSessionsResult <- R6::R6Class(
  "UsageCodeInterpreterSessionsResult",
  public = list(
    `object` = NULL,
    `sessions` = NULL,
    `project_id` = NULL,

    #' @description
    #' Initialize a new UsageCodeInterpreterSessionsResult class.
    #'
    #' @param object object
    #' @param sessions The number of code interpreter sessions.
    #' @param project_id When `group_by=project_id`, this field provides the project ID of the grouped usage result.
    #' @param ... Other optional arguments.
    initialize = function(`object`, `sessions`, `project_id` = NULL, ...) {
      if (!missing(`object`)) {
        if (!(`object` %in% c("organization.usage.code_interpreter_sessions.result"))) {
          stop(paste("Error! \"", `object`, "\" cannot be assigned to `object`. Must be \"organization.usage.code_interpreter_sessions.result\".", sep = ""))
        }
        if (!(is.character(`object`) && length(`object`) == 1)) {
          stop(paste("Error! Invalid data for `object`. Must be a string:", `object`))
        }
        self$`object` <- `object`
      }
      if (!missing(`sessions`)) {
        if (!(is.numeric(`sessions`) && length(`sessions`) == 1)) {
          stop(paste("Error! Invalid data for `sessions`. Must be an integer:", `sessions`))
        }
        self$`sessions` <- `sessions`
      }
      if (!is.null(`project_id`)) {
        if (!(is.character(`project_id`) && length(`project_id`) == 1)) {
          stop(paste("Error! Invalid data for `project_id`. Must be a string:", `project_id`))
        }
        self$`project_id` <- `project_id`
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
    #' @return UsageCodeInterpreterSessionsResult as a base R list.
    #' @examples
    #' # convert array of UsageCodeInterpreterSessionsResult (x) to a data frame
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
    #' Convert UsageCodeInterpreterSessionsResult to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      UsageCodeInterpreterSessionsResultObject <- list()
      if (!is.null(self$`object`)) {
        UsageCodeInterpreterSessionsResultObject[["object"]] <-
          self$`object`
      }
      if (!is.null(self$`sessions`)) {
        UsageCodeInterpreterSessionsResultObject[["sessions"]] <-
          self$`sessions`
      }
      if (!is.null(self$`project_id`)) {
        UsageCodeInterpreterSessionsResultObject[["project_id"]] <-
          self$`project_id`
      }
      return(UsageCodeInterpreterSessionsResultObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of UsageCodeInterpreterSessionsResult
    #'
    #' @param input_json the JSON input
    #' @return the instance of UsageCodeInterpreterSessionsResult
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`object`)) {
        if (!is.null(this_object$`object`) && !(this_object$`object` %in% c("organization.usage.code_interpreter_sessions.result"))) {
          stop(paste("Error! \"", this_object$`object`, "\" cannot be assigned to `object`. Must be \"organization.usage.code_interpreter_sessions.result\".", sep = ""))
        }
        self$`object` <- this_object$`object`
      }
      if (!is.null(this_object$`sessions`)) {
        self$`sessions` <- this_object$`sessions`
      }
      if (!is.null(this_object$`project_id`)) {
        self$`project_id` <- this_object$`project_id`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return UsageCodeInterpreterSessionsResult in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of UsageCodeInterpreterSessionsResult
    #'
    #' @param input_json the JSON input
    #' @return the instance of UsageCodeInterpreterSessionsResult
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`object`) && !(this_object$`object` %in% c("organization.usage.code_interpreter_sessions.result"))) {
        stop(paste("Error! \"", this_object$`object`, "\" cannot be assigned to `object`. Must be \"organization.usage.code_interpreter_sessions.result\".", sep = ""))
      }
      self$`object` <- this_object$`object`
      self$`sessions` <- this_object$`sessions`
      self$`project_id` <- this_object$`project_id`
      self
    },

    #' @description
    #' Validate JSON input with respect to UsageCodeInterpreterSessionsResult and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `object`
      if (!is.null(input_json$`object`)) {
        if (!(is.character(input_json$`object`) && length(input_json$`object`) == 1)) {
          stop(paste("Error! Invalid data for `object`. Must be a string:", input_json$`object`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for UsageCodeInterpreterSessionsResult: the required field `object` is missing."))
      }
      # check the required field `sessions`
      if (!is.null(input_json$`sessions`)) {
        if (!(is.numeric(input_json$`sessions`) && length(input_json$`sessions`) == 1)) {
          stop(paste("Error! Invalid data for `sessions`. Must be an integer:", input_json$`sessions`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for UsageCodeInterpreterSessionsResult: the required field `sessions` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of UsageCodeInterpreterSessionsResult
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `object` is null
      if (is.null(self$`object`)) {
        return(FALSE)
      }

      # check if the required `sessions` is null
      if (is.null(self$`sessions`)) {
        return(FALSE)
      }

      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
      # check if the required `object` is null
      if (is.null(self$`object`)) {
        invalid_fields["object"] <- "Non-nullable required field `object` cannot be null."
      }

      # check if the required `sessions` is null
      if (is.null(self$`sessions`)) {
        invalid_fields["sessions"] <- "Non-nullable required field `sessions` cannot be null."
      }

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
# UsageCodeInterpreterSessionsResult$unlock()
#
## Below is an example to define the print function
# UsageCodeInterpreterSessionsResult$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# UsageCodeInterpreterSessionsResult$lock()

