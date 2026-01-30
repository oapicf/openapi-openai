#' Create a new RealtimeResponseUsage
#'
#' @description
#' Usage statistics for the Response, this will correspond to billing. A  Realtime API session will maintain a conversation context and append new  Items to the Conversation, thus output from previous turns (text and  audio tokens) will become the input for later turns. 
#'
#' @docType class
#' @title RealtimeResponseUsage
#' @description RealtimeResponseUsage Class
#' @format An \code{R6Class} generator object
#' @field total_tokens The total number of tokens in the Response including input and output  text and audio tokens. integer [optional]
#' @field input_tokens The number of input tokens used in the Response, including text and  audio tokens. integer [optional]
#' @field output_tokens The number of output tokens sent in the Response, including text and  audio tokens. integer [optional]
#' @field input_token_details  \link{RealtimeResponseUsageInputTokenDetails} [optional]
#' @field output_token_details  \link{RealtimeResponseUsageOutputTokenDetails} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RealtimeResponseUsage <- R6::R6Class(
  "RealtimeResponseUsage",
  public = list(
    `total_tokens` = NULL,
    `input_tokens` = NULL,
    `output_tokens` = NULL,
    `input_token_details` = NULL,
    `output_token_details` = NULL,

    #' @description
    #' Initialize a new RealtimeResponseUsage class.
    #'
    #' @param total_tokens The total number of tokens in the Response including input and output  text and audio tokens.
    #' @param input_tokens The number of input tokens used in the Response, including text and  audio tokens.
    #' @param output_tokens The number of output tokens sent in the Response, including text and  audio tokens.
    #' @param input_token_details input_token_details
    #' @param output_token_details output_token_details
    #' @param ... Other optional arguments.
    initialize = function(`total_tokens` = NULL, `input_tokens` = NULL, `output_tokens` = NULL, `input_token_details` = NULL, `output_token_details` = NULL, ...) {
      if (!is.null(`total_tokens`)) {
        if (!(is.numeric(`total_tokens`) && length(`total_tokens`) == 1)) {
          stop(paste("Error! Invalid data for `total_tokens`. Must be an integer:", `total_tokens`))
        }
        self$`total_tokens` <- `total_tokens`
      }
      if (!is.null(`input_tokens`)) {
        if (!(is.numeric(`input_tokens`) && length(`input_tokens`) == 1)) {
          stop(paste("Error! Invalid data for `input_tokens`. Must be an integer:", `input_tokens`))
        }
        self$`input_tokens` <- `input_tokens`
      }
      if (!is.null(`output_tokens`)) {
        if (!(is.numeric(`output_tokens`) && length(`output_tokens`) == 1)) {
          stop(paste("Error! Invalid data for `output_tokens`. Must be an integer:", `output_tokens`))
        }
        self$`output_tokens` <- `output_tokens`
      }
      if (!is.null(`input_token_details`)) {
        stopifnot(R6::is.R6(`input_token_details`))
        self$`input_token_details` <- `input_token_details`
      }
      if (!is.null(`output_token_details`)) {
        stopifnot(R6::is.R6(`output_token_details`))
        self$`output_token_details` <- `output_token_details`
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
    #' @return RealtimeResponseUsage as a base R list.
    #' @examples
    #' # convert array of RealtimeResponseUsage (x) to a data frame
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
    #' Convert RealtimeResponseUsage to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      RealtimeResponseUsageObject <- list()
      if (!is.null(self$`total_tokens`)) {
        RealtimeResponseUsageObject[["total_tokens"]] <-
          self$`total_tokens`
      }
      if (!is.null(self$`input_tokens`)) {
        RealtimeResponseUsageObject[["input_tokens"]] <-
          self$`input_tokens`
      }
      if (!is.null(self$`output_tokens`)) {
        RealtimeResponseUsageObject[["output_tokens"]] <-
          self$`output_tokens`
      }
      if (!is.null(self$`input_token_details`)) {
        RealtimeResponseUsageObject[["input_token_details"]] <-
          self$`input_token_details`$toSimpleType()
      }
      if (!is.null(self$`output_token_details`)) {
        RealtimeResponseUsageObject[["output_token_details"]] <-
          self$`output_token_details`$toSimpleType()
      }
      return(RealtimeResponseUsageObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of RealtimeResponseUsage
    #'
    #' @param input_json the JSON input
    #' @return the instance of RealtimeResponseUsage
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`total_tokens`)) {
        self$`total_tokens` <- this_object$`total_tokens`
      }
      if (!is.null(this_object$`input_tokens`)) {
        self$`input_tokens` <- this_object$`input_tokens`
      }
      if (!is.null(this_object$`output_tokens`)) {
        self$`output_tokens` <- this_object$`output_tokens`
      }
      if (!is.null(this_object$`input_token_details`)) {
        `input_token_details_object` <- RealtimeResponseUsageInputTokenDetails$new()
        `input_token_details_object`$fromJSON(jsonlite::toJSON(this_object$`input_token_details`, auto_unbox = TRUE, digits = NA))
        self$`input_token_details` <- `input_token_details_object`
      }
      if (!is.null(this_object$`output_token_details`)) {
        `output_token_details_object` <- RealtimeResponseUsageOutputTokenDetails$new()
        `output_token_details_object`$fromJSON(jsonlite::toJSON(this_object$`output_token_details`, auto_unbox = TRUE, digits = NA))
        self$`output_token_details` <- `output_token_details_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return RealtimeResponseUsage in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of RealtimeResponseUsage
    #'
    #' @param input_json the JSON input
    #' @return the instance of RealtimeResponseUsage
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`total_tokens` <- this_object$`total_tokens`
      self$`input_tokens` <- this_object$`input_tokens`
      self$`output_tokens` <- this_object$`output_tokens`
      self$`input_token_details` <- RealtimeResponseUsageInputTokenDetails$new()$fromJSON(jsonlite::toJSON(this_object$`input_token_details`, auto_unbox = TRUE, digits = NA))
      self$`output_token_details` <- RealtimeResponseUsageOutputTokenDetails$new()$fromJSON(jsonlite::toJSON(this_object$`output_token_details`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to RealtimeResponseUsage and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of RealtimeResponseUsage
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
# RealtimeResponseUsage$unlock()
#
## Below is an example to define the print function
# RealtimeResponseUsage$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# RealtimeResponseUsage$lock()

