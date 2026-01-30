#' Create a new AssistantToolsFileSearch
#'
#' @description
#' AssistantToolsFileSearch Class
#'
#' @docType class
#' @title AssistantToolsFileSearch
#' @description AssistantToolsFileSearch Class
#' @format An \code{R6Class} generator object
#' @field type The type of tool being defined: `file_search` character
#' @field file_search  \link{AssistantToolsFileSearchFileSearch} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AssistantToolsFileSearch <- R6::R6Class(
  "AssistantToolsFileSearch",
  public = list(
    `type` = NULL,
    `file_search` = NULL,

    #' @description
    #' Initialize a new AssistantToolsFileSearch class.
    #'
    #' @param type The type of tool being defined: `file_search`
    #' @param file_search file_search
    #' @param ... Other optional arguments.
    initialize = function(`type`, `file_search` = NULL, ...) {
      if (!missing(`type`)) {
        if (!(`type` %in% c("file_search"))) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be \"file_search\".", sep = ""))
        }
        if (!(is.character(`type`) && length(`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", `type`))
        }
        self$`type` <- `type`
      }
      if (!is.null(`file_search`)) {
        stopifnot(R6::is.R6(`file_search`))
        self$`file_search` <- `file_search`
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
    #' @return AssistantToolsFileSearch as a base R list.
    #' @examples
    #' # convert array of AssistantToolsFileSearch (x) to a data frame
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
    #' Convert AssistantToolsFileSearch to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      AssistantToolsFileSearchObject <- list()
      if (!is.null(self$`type`)) {
        AssistantToolsFileSearchObject[["type"]] <-
          self$`type`
      }
      if (!is.null(self$`file_search`)) {
        AssistantToolsFileSearchObject[["file_search"]] <-
          self$`file_search`$toSimpleType()
      }
      return(AssistantToolsFileSearchObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of AssistantToolsFileSearch
    #'
    #' @param input_json the JSON input
    #' @return the instance of AssistantToolsFileSearch
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`)) {
        if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("file_search"))) {
          stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"file_search\".", sep = ""))
        }
        self$`type` <- this_object$`type`
      }
      if (!is.null(this_object$`file_search`)) {
        `file_search_object` <- AssistantToolsFileSearchFileSearch$new()
        `file_search_object`$fromJSON(jsonlite::toJSON(this_object$`file_search`, auto_unbox = TRUE, digits = NA))
        self$`file_search` <- `file_search_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return AssistantToolsFileSearch in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AssistantToolsFileSearch
    #'
    #' @param input_json the JSON input
    #' @return the instance of AssistantToolsFileSearch
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("file_search"))) {
        stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"file_search\".", sep = ""))
      }
      self$`type` <- this_object$`type`
      self$`file_search` <- AssistantToolsFileSearchFileSearch$new()$fromJSON(jsonlite::toJSON(this_object$`file_search`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to AssistantToolsFileSearch and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `type`
      if (!is.null(input_json$`type`)) {
        if (!(is.character(input_json$`type`) && length(input_json$`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", input_json$`type`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AssistantToolsFileSearch: the required field `type` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AssistantToolsFileSearch
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `type` is null
      if (is.null(self$`type`)) {
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
      # check if the required `type` is null
      if (is.null(self$`type`)) {
        invalid_fields["type"] <- "Non-nullable required field `type` cannot be null."
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
# AssistantToolsFileSearch$unlock()
#
## Below is an example to define the print function
# AssistantToolsFileSearch$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AssistantToolsFileSearch$lock()

