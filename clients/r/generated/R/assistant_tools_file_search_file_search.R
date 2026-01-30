#' Create a new AssistantToolsFileSearchFileSearch
#'
#' @description
#' Overrides for the file search tool.
#'
#' @docType class
#' @title AssistantToolsFileSearchFileSearch
#' @description AssistantToolsFileSearchFileSearch Class
#' @format An \code{R6Class} generator object
#' @field max_num_results The maximum number of results the file search tool should output. The default is 20 for `gpt-4*` models and 5 for `gpt-3.5-turbo`. This number should be between 1 and 50 inclusive.  Note that the file search tool may output fewer than `max_num_results` results. See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. integer [optional]
#' @field ranking_options  \link{FileSearchRankingOptions} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AssistantToolsFileSearchFileSearch <- R6::R6Class(
  "AssistantToolsFileSearchFileSearch",
  public = list(
    `max_num_results` = NULL,
    `ranking_options` = NULL,

    #' @description
    #' Initialize a new AssistantToolsFileSearchFileSearch class.
    #'
    #' @param max_num_results The maximum number of results the file search tool should output. The default is 20 for `gpt-4*` models and 5 for `gpt-3.5-turbo`. This number should be between 1 and 50 inclusive.  Note that the file search tool may output fewer than `max_num_results` results. See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.
    #' @param ranking_options ranking_options
    #' @param ... Other optional arguments.
    initialize = function(`max_num_results` = NULL, `ranking_options` = NULL, ...) {
      if (!is.null(`max_num_results`)) {
        if (!(is.numeric(`max_num_results`) && length(`max_num_results`) == 1)) {
          stop(paste("Error! Invalid data for `max_num_results`. Must be an integer:", `max_num_results`))
        }
        self$`max_num_results` <- `max_num_results`
      }
      if (!is.null(`ranking_options`)) {
        stopifnot(R6::is.R6(`ranking_options`))
        self$`ranking_options` <- `ranking_options`
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
    #' @return AssistantToolsFileSearchFileSearch as a base R list.
    #' @examples
    #' # convert array of AssistantToolsFileSearchFileSearch (x) to a data frame
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
    #' Convert AssistantToolsFileSearchFileSearch to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      AssistantToolsFileSearchFileSearchObject <- list()
      if (!is.null(self$`max_num_results`)) {
        AssistantToolsFileSearchFileSearchObject[["max_num_results"]] <-
          self$`max_num_results`
      }
      if (!is.null(self$`ranking_options`)) {
        AssistantToolsFileSearchFileSearchObject[["ranking_options"]] <-
          self$`ranking_options`$toSimpleType()
      }
      return(AssistantToolsFileSearchFileSearchObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of AssistantToolsFileSearchFileSearch
    #'
    #' @param input_json the JSON input
    #' @return the instance of AssistantToolsFileSearchFileSearch
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`max_num_results`)) {
        self$`max_num_results` <- this_object$`max_num_results`
      }
      if (!is.null(this_object$`ranking_options`)) {
        `ranking_options_object` <- FileSearchRankingOptions$new()
        `ranking_options_object`$fromJSON(jsonlite::toJSON(this_object$`ranking_options`, auto_unbox = TRUE, digits = NA))
        self$`ranking_options` <- `ranking_options_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return AssistantToolsFileSearchFileSearch in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AssistantToolsFileSearchFileSearch
    #'
    #' @param input_json the JSON input
    #' @return the instance of AssistantToolsFileSearchFileSearch
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`max_num_results` <- this_object$`max_num_results`
      self$`ranking_options` <- FileSearchRankingOptions$new()$fromJSON(jsonlite::toJSON(this_object$`ranking_options`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to AssistantToolsFileSearchFileSearch and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AssistantToolsFileSearchFileSearch
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (self$`max_num_results` > 50) {
        return(FALSE)
      }
      if (self$`max_num_results` < 1) {
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
      if (self$`max_num_results` > 50) {
        invalid_fields["max_num_results"] <- "Invalid value for `max_num_results`, must be smaller than or equal to 50."
      }
      if (self$`max_num_results` < 1) {
        invalid_fields["max_num_results"] <- "Invalid value for `max_num_results`, must be bigger than or equal to 1."
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
# AssistantToolsFileSearchFileSearch$unlock()
#
## Below is an example to define the print function
# AssistantToolsFileSearchFileSearch$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AssistantToolsFileSearchFileSearch$lock()

