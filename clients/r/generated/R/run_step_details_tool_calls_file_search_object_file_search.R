#' Create a new RunStepDetailsToolCallsFileSearchObjectFileSearch
#'
#' @description
#' For now, this is always going to be an empty object.
#'
#' @docType class
#' @title RunStepDetailsToolCallsFileSearchObjectFileSearch
#' @description RunStepDetailsToolCallsFileSearchObjectFileSearch Class
#' @format An \code{R6Class} generator object
#' @field ranking_options  \link{RunStepDetailsToolCallsFileSearchRankingOptionsObject} [optional]
#' @field results The results of the file search. list(\link{RunStepDetailsToolCallsFileSearchResultObject}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RunStepDetailsToolCallsFileSearchObjectFileSearch <- R6::R6Class(
  "RunStepDetailsToolCallsFileSearchObjectFileSearch",
  public = list(
    `ranking_options` = NULL,
    `results` = NULL,

    #' @description
    #' Initialize a new RunStepDetailsToolCallsFileSearchObjectFileSearch class.
    #'
    #' @param ranking_options ranking_options
    #' @param results The results of the file search.
    #' @param ... Other optional arguments.
    initialize = function(`ranking_options` = NULL, `results` = NULL, ...) {
      if (!is.null(`ranking_options`)) {
        stopifnot(R6::is.R6(`ranking_options`))
        self$`ranking_options` <- `ranking_options`
      }
      if (!is.null(`results`)) {
        stopifnot(is.vector(`results`), length(`results`) != 0)
        sapply(`results`, function(x) stopifnot(R6::is.R6(x)))
        self$`results` <- `results`
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
    #' @return RunStepDetailsToolCallsFileSearchObjectFileSearch as a base R list.
    #' @examples
    #' # convert array of RunStepDetailsToolCallsFileSearchObjectFileSearch (x) to a data frame
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
    #' Convert RunStepDetailsToolCallsFileSearchObjectFileSearch to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      RunStepDetailsToolCallsFileSearchObjectFileSearchObject <- list()
      if (!is.null(self$`ranking_options`)) {
        RunStepDetailsToolCallsFileSearchObjectFileSearchObject[["ranking_options"]] <-
          self$`ranking_options`$toSimpleType()
      }
      if (!is.null(self$`results`)) {
        RunStepDetailsToolCallsFileSearchObjectFileSearchObject[["results"]] <-
          lapply(self$`results`, function(x) x$toSimpleType())
      }
      return(RunStepDetailsToolCallsFileSearchObjectFileSearchObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of RunStepDetailsToolCallsFileSearchObjectFileSearch
    #'
    #' @param input_json the JSON input
    #' @return the instance of RunStepDetailsToolCallsFileSearchObjectFileSearch
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`ranking_options`)) {
        `ranking_options_object` <- RunStepDetailsToolCallsFileSearchRankingOptionsObject$new()
        `ranking_options_object`$fromJSON(jsonlite::toJSON(this_object$`ranking_options`, auto_unbox = TRUE, digits = NA))
        self$`ranking_options` <- `ranking_options_object`
      }
      if (!is.null(this_object$`results`)) {
        self$`results` <- ApiClient$new()$deserializeObj(this_object$`results`, "array[RunStepDetailsToolCallsFileSearchResultObject]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return RunStepDetailsToolCallsFileSearchObjectFileSearch in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of RunStepDetailsToolCallsFileSearchObjectFileSearch
    #'
    #' @param input_json the JSON input
    #' @return the instance of RunStepDetailsToolCallsFileSearchObjectFileSearch
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`ranking_options` <- RunStepDetailsToolCallsFileSearchRankingOptionsObject$new()$fromJSON(jsonlite::toJSON(this_object$`ranking_options`, auto_unbox = TRUE, digits = NA))
      self$`results` <- ApiClient$new()$deserializeObj(this_object$`results`, "array[RunStepDetailsToolCallsFileSearchResultObject]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to RunStepDetailsToolCallsFileSearchObjectFileSearch and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of RunStepDetailsToolCallsFileSearchObjectFileSearch
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
# RunStepDetailsToolCallsFileSearchObjectFileSearch$unlock()
#
## Below is an example to define the print function
# RunStepDetailsToolCallsFileSearchObjectFileSearch$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# RunStepDetailsToolCallsFileSearchObjectFileSearch$lock()

