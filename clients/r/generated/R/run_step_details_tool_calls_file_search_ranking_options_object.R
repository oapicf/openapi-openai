#' Create a new RunStepDetailsToolCallsFileSearchRankingOptionsObject
#'
#' @description
#' The ranking options for the file search.
#'
#' @docType class
#' @title RunStepDetailsToolCallsFileSearchRankingOptionsObject
#' @description RunStepDetailsToolCallsFileSearchRankingOptionsObject Class
#' @format An \code{R6Class} generator object
#' @field ranker The ranker used for the file search. character
#' @field score_threshold The score threshold for the file search. All values must be a floating point number between 0 and 1. numeric
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RunStepDetailsToolCallsFileSearchRankingOptionsObject <- R6::R6Class(
  "RunStepDetailsToolCallsFileSearchRankingOptionsObject",
  public = list(
    `ranker` = NULL,
    `score_threshold` = NULL,

    #' @description
    #' Initialize a new RunStepDetailsToolCallsFileSearchRankingOptionsObject class.
    #'
    #' @param ranker The ranker used for the file search.
    #' @param score_threshold The score threshold for the file search. All values must be a floating point number between 0 and 1.
    #' @param ... Other optional arguments.
    initialize = function(`ranker`, `score_threshold`, ...) {
      if (!missing(`ranker`)) {
        if (!(`ranker` %in% c("default_2024_08_21"))) {
          stop(paste("Error! \"", `ranker`, "\" cannot be assigned to `ranker`. Must be \"default_2024_08_21\".", sep = ""))
        }
        if (!(is.character(`ranker`) && length(`ranker`) == 1)) {
          stop(paste("Error! Invalid data for `ranker`. Must be a string:", `ranker`))
        }
        self$`ranker` <- `ranker`
      }
      if (!missing(`score_threshold`)) {
        self$`score_threshold` <- `score_threshold`
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
    #' @return RunStepDetailsToolCallsFileSearchRankingOptionsObject as a base R list.
    #' @examples
    #' # convert array of RunStepDetailsToolCallsFileSearchRankingOptionsObject (x) to a data frame
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
    #' Convert RunStepDetailsToolCallsFileSearchRankingOptionsObject to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      RunStepDetailsToolCallsFileSearchRankingOptionsObjectObject <- list()
      if (!is.null(self$`ranker`)) {
        RunStepDetailsToolCallsFileSearchRankingOptionsObjectObject[["ranker"]] <-
          self$`ranker`
      }
      if (!is.null(self$`score_threshold`)) {
        RunStepDetailsToolCallsFileSearchRankingOptionsObjectObject[["score_threshold"]] <-
          self$`score_threshold`
      }
      return(RunStepDetailsToolCallsFileSearchRankingOptionsObjectObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of RunStepDetailsToolCallsFileSearchRankingOptionsObject
    #'
    #' @param input_json the JSON input
    #' @return the instance of RunStepDetailsToolCallsFileSearchRankingOptionsObject
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`ranker`)) {
        if (!is.null(this_object$`ranker`) && !(this_object$`ranker` %in% c("default_2024_08_21"))) {
          stop(paste("Error! \"", this_object$`ranker`, "\" cannot be assigned to `ranker`. Must be \"default_2024_08_21\".", sep = ""))
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
    #' @return RunStepDetailsToolCallsFileSearchRankingOptionsObject in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of RunStepDetailsToolCallsFileSearchRankingOptionsObject
    #'
    #' @param input_json the JSON input
    #' @return the instance of RunStepDetailsToolCallsFileSearchRankingOptionsObject
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`ranker`) && !(this_object$`ranker` %in% c("default_2024_08_21"))) {
        stop(paste("Error! \"", this_object$`ranker`, "\" cannot be assigned to `ranker`. Must be \"default_2024_08_21\".", sep = ""))
      }
      self$`ranker` <- this_object$`ranker`
      self$`score_threshold` <- this_object$`score_threshold`
      self
    },

    #' @description
    #' Validate JSON input with respect to RunStepDetailsToolCallsFileSearchRankingOptionsObject and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `ranker`
      if (!is.null(input_json$`ranker`)) {
        if (!(is.character(input_json$`ranker`) && length(input_json$`ranker`) == 1)) {
          stop(paste("Error! Invalid data for `ranker`. Must be a string:", input_json$`ranker`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RunStepDetailsToolCallsFileSearchRankingOptionsObject: the required field `ranker` is missing."))
      }
      # check the required field `score_threshold`
      if (!is.null(input_json$`score_threshold`)) {
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RunStepDetailsToolCallsFileSearchRankingOptionsObject: the required field `score_threshold` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of RunStepDetailsToolCallsFileSearchRankingOptionsObject
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `ranker` is null
      if (is.null(self$`ranker`)) {
        return(FALSE)
      }

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
      # check if the required `ranker` is null
      if (is.null(self$`ranker`)) {
        invalid_fields["ranker"] <- "Non-nullable required field `ranker` cannot be null."
      }

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
# RunStepDetailsToolCallsFileSearchRankingOptionsObject$unlock()
#
## Below is an example to define the print function
# RunStepDetailsToolCallsFileSearchRankingOptionsObject$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# RunStepDetailsToolCallsFileSearchRankingOptionsObject$lock()

