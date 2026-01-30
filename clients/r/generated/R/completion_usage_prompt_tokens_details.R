#' Create a new CompletionUsagePromptTokensDetails
#'
#' @description
#' Breakdown of tokens used in the prompt.
#'
#' @docType class
#' @title CompletionUsagePromptTokensDetails
#' @description CompletionUsagePromptTokensDetails Class
#' @format An \code{R6Class} generator object
#' @field audio_tokens Audio input tokens present in the prompt. integer [optional]
#' @field cached_tokens Cached tokens present in the prompt. integer [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CompletionUsagePromptTokensDetails <- R6::R6Class(
  "CompletionUsagePromptTokensDetails",
  public = list(
    `audio_tokens` = NULL,
    `cached_tokens` = NULL,

    #' @description
    #' Initialize a new CompletionUsagePromptTokensDetails class.
    #'
    #' @param audio_tokens Audio input tokens present in the prompt.
    #' @param cached_tokens Cached tokens present in the prompt.
    #' @param ... Other optional arguments.
    initialize = function(`audio_tokens` = NULL, `cached_tokens` = NULL, ...) {
      if (!is.null(`audio_tokens`)) {
        if (!(is.numeric(`audio_tokens`) && length(`audio_tokens`) == 1)) {
          stop(paste("Error! Invalid data for `audio_tokens`. Must be an integer:", `audio_tokens`))
        }
        self$`audio_tokens` <- `audio_tokens`
      }
      if (!is.null(`cached_tokens`)) {
        if (!(is.numeric(`cached_tokens`) && length(`cached_tokens`) == 1)) {
          stop(paste("Error! Invalid data for `cached_tokens`. Must be an integer:", `cached_tokens`))
        }
        self$`cached_tokens` <- `cached_tokens`
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
    #' @return CompletionUsagePromptTokensDetails as a base R list.
    #' @examples
    #' # convert array of CompletionUsagePromptTokensDetails (x) to a data frame
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
    #' Convert CompletionUsagePromptTokensDetails to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CompletionUsagePromptTokensDetailsObject <- list()
      if (!is.null(self$`audio_tokens`)) {
        CompletionUsagePromptTokensDetailsObject[["audio_tokens"]] <-
          self$`audio_tokens`
      }
      if (!is.null(self$`cached_tokens`)) {
        CompletionUsagePromptTokensDetailsObject[["cached_tokens"]] <-
          self$`cached_tokens`
      }
      return(CompletionUsagePromptTokensDetailsObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of CompletionUsagePromptTokensDetails
    #'
    #' @param input_json the JSON input
    #' @return the instance of CompletionUsagePromptTokensDetails
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`audio_tokens`)) {
        self$`audio_tokens` <- this_object$`audio_tokens`
      }
      if (!is.null(this_object$`cached_tokens`)) {
        self$`cached_tokens` <- this_object$`cached_tokens`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CompletionUsagePromptTokensDetails in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CompletionUsagePromptTokensDetails
    #'
    #' @param input_json the JSON input
    #' @return the instance of CompletionUsagePromptTokensDetails
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`audio_tokens` <- this_object$`audio_tokens`
      self$`cached_tokens` <- this_object$`cached_tokens`
      self
    },

    #' @description
    #' Validate JSON input with respect to CompletionUsagePromptTokensDetails and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CompletionUsagePromptTokensDetails
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
# CompletionUsagePromptTokensDetails$unlock()
#
## Below is an example to define the print function
# CompletionUsagePromptTokensDetails$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CompletionUsagePromptTokensDetails$lock()

