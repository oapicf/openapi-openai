#' Create a new FileSearchRankingOptions
#'
#' @description
#' The ranking options for the file search. If not specified, the file search tool will use the `auto` ranker and a score_threshold of 0.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. 
#'
#' @docType class
#' @title FileSearchRankingOptions
#' @description FileSearchRankingOptions Class
#' @format An \code{R6Class} generator object
#' @field ranker The ranker to use for the file search. If not specified will use the `auto` ranker. character [optional]
#' @field score_threshold The score threshold for the file search. All values must be a floating point number between 0 and 1. numeric
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
FileSearchRankingOptions <- R6::R6Class(
  "FileSearchRankingOptions",
  public = list(
    `ranker` = NULL,
    `score_threshold` = NULL,

    #' @description
    #' Initialize a new FileSearchRankingOptions class.
    #'
    #' @param score_threshold The score threshold for the file search. All values must be a floating point number between 0 and 1.
    #' @param ranker The ranker to use for the file search. If not specified will use the `auto` ranker.
    #' @param ... Other optional arguments.
    initialize = function(`score_threshold`, `ranker` = NULL, ...) {
      if (!missing(`score_threshold`)) {
        self$`score_threshold` <- `score_threshold`
      }
      if (!is.null(`ranker`)) {
        if (!(`ranker` %in% c("auto", "default_2024_08_21"))) {
          stop(paste("Error! \"", `ranker`, "\" cannot be assigned to `ranker`. Must be \"auto\", \"default_2024_08_21\".", sep = ""))
        }
        if (!(is.character(`ranker`) && length(`ranker`) == 1)) {
          stop(paste("Error! Invalid data for `ranker`. Must be a string:", `ranker`))
        }
        self$`ranker` <- `ranker`
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
    #' @return FileSearchRankingOptions as a base R list.
    #' @examples
    #' # convert array of FileSearchRankingOptions (x) to a data frame
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
    #' Convert FileSearchRankingOptions to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      FileSearchRankingOptionsObject <- list()
      if (!is.null(self$`ranker`)) {
        FileSearchRankingOptionsObject[["ranker"]] <-
          self$`ranker`
      }
      if (!is.null(self$`score_threshold`)) {
        FileSearchRankingOptionsObject[["score_threshold"]] <-
          self$`score_threshold`
      }
      return(FileSearchRankingOptionsObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of FileSearchRankingOptions
    #'
    #' @param input_json the JSON input
    #' @return the instance of FileSearchRankingOptions
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`ranker`)) {
        if (!is.null(this_object$`ranker`) && !(this_object$`ranker` %in% c("auto", "default_2024_08_21"))) {
          stop(paste("Error! \"", this_object$`ranker`, "\" cannot be assigned to `ranker`. Must be \"auto\", \"default_2024_08_21\".", sep = ""))
        }
        self$`ranker` <- this_object$`ranker`
      }
      if (!is.null(this_object$`score_threshold`)) {
        self$`score_threshold` <- this_object$`score_threshold`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return FileSearchRankingOptions in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of FileSearchRankingOptions
    #'
    #' @param input_json the JSON input
    #' @return the instance of FileSearchRankingOptions
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`ranker`) && !(this_object$`ranker` %in% c("auto", "default_2024_08_21"))) {
        stop(paste("Error! \"", this_object$`ranker`, "\" cannot be assigned to `ranker`. Must be \"auto\", \"default_2024_08_21\".", sep = ""))
      }
      self$`ranker` <- this_object$`ranker`
      self$`score_threshold` <- this_object$`score_threshold`
      self
    },

    #' @description
    #' Validate JSON input with respect to FileSearchRankingOptions and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `score_threshold`
      if (!is.null(input_json$`score_threshold`)) {
      } else {
        stop(paste("The JSON input `", input, "` is invalid for FileSearchRankingOptions: the required field `score_threshold` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of FileSearchRankingOptions
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `score_threshold` is null
      if (is.null(self$`score_threshold`)) {
        return(FALSE)
      }

      if (self$`score_threshold` > 1) {
        return(FALSE)
      }
      if (self$`score_threshold` < 0) {
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
      # check if the required `score_threshold` is null
      if (is.null(self$`score_threshold`)) {
        invalid_fields["score_threshold"] <- "Non-nullable required field `score_threshold` cannot be null."
      }

      if (self$`score_threshold` > 1) {
        invalid_fields["score_threshold"] <- "Invalid value for `score_threshold`, must be smaller than or equal to 1."
      }
      if (self$`score_threshold` < 0) {
        invalid_fields["score_threshold"] <- "Invalid value for `score_threshold`, must be bigger than or equal to 0."
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
# FileSearchRankingOptions$unlock()
#
## Below is an example to define the print function
# FileSearchRankingOptions$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# FileSearchRankingOptions$lock()

