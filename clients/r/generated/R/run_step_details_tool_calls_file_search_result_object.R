#' Create a new RunStepDetailsToolCallsFileSearchResultObject
#'
#' @description
#' A result instance of the file search.
#'
#' @docType class
#' @title RunStepDetailsToolCallsFileSearchResultObject
#' @description RunStepDetailsToolCallsFileSearchResultObject Class
#' @format An \code{R6Class} generator object
#' @field file_id The ID of the file that result was found in. character
#' @field file_name The name of the file that result was found in. character
#' @field score The score of the result. All values must be a floating point number between 0 and 1. numeric
#' @field content The content of the result that was found. The content is only included if requested via the include query parameter. list(\link{RunStepDetailsToolCallsFileSearchResultObjectContentInner}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RunStepDetailsToolCallsFileSearchResultObject <- R6::R6Class(
  "RunStepDetailsToolCallsFileSearchResultObject",
  public = list(
    `file_id` = NULL,
    `file_name` = NULL,
    `score` = NULL,
    `content` = NULL,

    #' @description
    #' Initialize a new RunStepDetailsToolCallsFileSearchResultObject class.
    #'
    #' @param file_id The ID of the file that result was found in.
    #' @param file_name The name of the file that result was found in.
    #' @param score The score of the result. All values must be a floating point number between 0 and 1.
    #' @param content The content of the result that was found. The content is only included if requested via the include query parameter.
    #' @param ... Other optional arguments.
    initialize = function(`file_id`, `file_name`, `score`, `content` = NULL, ...) {
      if (!missing(`file_id`)) {
        if (!(is.character(`file_id`) && length(`file_id`) == 1)) {
          stop(paste("Error! Invalid data for `file_id`. Must be a string:", `file_id`))
        }
        self$`file_id` <- `file_id`
      }
      if (!missing(`file_name`)) {
        if (!(is.character(`file_name`) && length(`file_name`) == 1)) {
          stop(paste("Error! Invalid data for `file_name`. Must be a string:", `file_name`))
        }
        self$`file_name` <- `file_name`
      }
      if (!missing(`score`)) {
        self$`score` <- `score`
      }
      if (!is.null(`content`)) {
        stopifnot(is.vector(`content`), length(`content`) != 0)
        sapply(`content`, function(x) stopifnot(R6::is.R6(x)))
        self$`content` <- `content`
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
    #' @return RunStepDetailsToolCallsFileSearchResultObject as a base R list.
    #' @examples
    #' # convert array of RunStepDetailsToolCallsFileSearchResultObject (x) to a data frame
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
    #' Convert RunStepDetailsToolCallsFileSearchResultObject to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      RunStepDetailsToolCallsFileSearchResultObjectObject <- list()
      if (!is.null(self$`file_id`)) {
        RunStepDetailsToolCallsFileSearchResultObjectObject[["file_id"]] <-
          self$`file_id`
      }
      if (!is.null(self$`file_name`)) {
        RunStepDetailsToolCallsFileSearchResultObjectObject[["file_name"]] <-
          self$`file_name`
      }
      if (!is.null(self$`score`)) {
        RunStepDetailsToolCallsFileSearchResultObjectObject[["score"]] <-
          self$`score`
      }
      if (!is.null(self$`content`)) {
        RunStepDetailsToolCallsFileSearchResultObjectObject[["content"]] <-
          lapply(self$`content`, function(x) x$toSimpleType())
      }
      return(RunStepDetailsToolCallsFileSearchResultObjectObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of RunStepDetailsToolCallsFileSearchResultObject
    #'
    #' @param input_json the JSON input
    #' @return the instance of RunStepDetailsToolCallsFileSearchResultObject
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`file_id`)) {
        self$`file_id` <- this_object$`file_id`
      }
      if (!is.null(this_object$`file_name`)) {
        self$`file_name` <- this_object$`file_name`
      }
      if (!is.null(this_object$`score`)) {
        self$`score` <- this_object$`score`
      }
      if (!is.null(this_object$`content`)) {
        self$`content` <- ApiClient$new()$deserializeObj(this_object$`content`, "array[RunStepDetailsToolCallsFileSearchResultObjectContentInner]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return RunStepDetailsToolCallsFileSearchResultObject in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of RunStepDetailsToolCallsFileSearchResultObject
    #'
    #' @param input_json the JSON input
    #' @return the instance of RunStepDetailsToolCallsFileSearchResultObject
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`file_id` <- this_object$`file_id`
      self$`file_name` <- this_object$`file_name`
      self$`score` <- this_object$`score`
      self$`content` <- ApiClient$new()$deserializeObj(this_object$`content`, "array[RunStepDetailsToolCallsFileSearchResultObjectContentInner]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to RunStepDetailsToolCallsFileSearchResultObject and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `file_id`
      if (!is.null(input_json$`file_id`)) {
        if (!(is.character(input_json$`file_id`) && length(input_json$`file_id`) == 1)) {
          stop(paste("Error! Invalid data for `file_id`. Must be a string:", input_json$`file_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RunStepDetailsToolCallsFileSearchResultObject: the required field `file_id` is missing."))
      }
      # check the required field `file_name`
      if (!is.null(input_json$`file_name`)) {
        if (!(is.character(input_json$`file_name`) && length(input_json$`file_name`) == 1)) {
          stop(paste("Error! Invalid data for `file_name`. Must be a string:", input_json$`file_name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RunStepDetailsToolCallsFileSearchResultObject: the required field `file_name` is missing."))
      }
      # check the required field `score`
      if (!is.null(input_json$`score`)) {
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RunStepDetailsToolCallsFileSearchResultObject: the required field `score` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of RunStepDetailsToolCallsFileSearchResultObject
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `file_id` is null
      if (is.null(self$`file_id`)) {
        return(FALSE)
      }

      # check if the required `file_name` is null
      if (is.null(self$`file_name`)) {
        return(FALSE)
      }

      # check if the required `score` is null
      if (is.null(self$`score`)) {
        return(FALSE)
      }

      if (self$`score` > 1) {
        return(FALSE)
      }
      if (self$`score` < 0) {
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
      # check if the required `file_id` is null
      if (is.null(self$`file_id`)) {
        invalid_fields["file_id"] <- "Non-nullable required field `file_id` cannot be null."
      }

      # check if the required `file_name` is null
      if (is.null(self$`file_name`)) {
        invalid_fields["file_name"] <- "Non-nullable required field `file_name` cannot be null."
      }

      # check if the required `score` is null
      if (is.null(self$`score`)) {
        invalid_fields["score"] <- "Non-nullable required field `score` cannot be null."
      }

      if (self$`score` > 1) {
        invalid_fields["score"] <- "Invalid value for `score`, must be smaller than or equal to 1."
      }
      if (self$`score` < 0) {
        invalid_fields["score"] <- "Invalid value for `score`, must be bigger than or equal to 0."
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
# RunStepDetailsToolCallsFileSearchResultObject$unlock()
#
## Below is an example to define the print function
# RunStepDetailsToolCallsFileSearchResultObject$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# RunStepDetailsToolCallsFileSearchResultObject$lock()

