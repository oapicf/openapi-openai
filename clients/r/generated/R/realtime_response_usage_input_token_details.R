#' Create a new RealtimeResponseUsageInputTokenDetails
#'
#' @description
#' Details about the input tokens used in the Response.
#'
#' @docType class
#' @title RealtimeResponseUsageInputTokenDetails
#' @description RealtimeResponseUsageInputTokenDetails Class
#' @format An \code{R6Class} generator object
#' @field cached_tokens The number of cached tokens used in the Response. integer [optional]
#' @field text_tokens The number of text tokens used in the Response. integer [optional]
#' @field audio_tokens The number of audio tokens used in the Response. integer [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RealtimeResponseUsageInputTokenDetails <- R6::R6Class(
  "RealtimeResponseUsageInputTokenDetails",
  public = list(
    `cached_tokens` = NULL,
    `text_tokens` = NULL,
    `audio_tokens` = NULL,

    #' @description
    #' Initialize a new RealtimeResponseUsageInputTokenDetails class.
    #'
    #' @param cached_tokens The number of cached tokens used in the Response.
    #' @param text_tokens The number of text tokens used in the Response.
    #' @param audio_tokens The number of audio tokens used in the Response.
    #' @param ... Other optional arguments.
    initialize = function(`cached_tokens` = NULL, `text_tokens` = NULL, `audio_tokens` = NULL, ...) {
      if (!is.null(`cached_tokens`)) {
        if (!(is.numeric(`cached_tokens`) && length(`cached_tokens`) == 1)) {
          stop(paste("Error! Invalid data for `cached_tokens`. Must be an integer:", `cached_tokens`))
        }
        self$`cached_tokens` <- `cached_tokens`
      }
      if (!is.null(`text_tokens`)) {
        if (!(is.numeric(`text_tokens`) && length(`text_tokens`) == 1)) {
          stop(paste("Error! Invalid data for `text_tokens`. Must be an integer:", `text_tokens`))
        }
        self$`text_tokens` <- `text_tokens`
      }
      if (!is.null(`audio_tokens`)) {
        if (!(is.numeric(`audio_tokens`) && length(`audio_tokens`) == 1)) {
          stop(paste("Error! Invalid data for `audio_tokens`. Must be an integer:", `audio_tokens`))
        }
        self$`audio_tokens` <- `audio_tokens`
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
    #' @return RealtimeResponseUsageInputTokenDetails as a base R list.
    #' @examples
    #' # convert array of RealtimeResponseUsageInputTokenDetails (x) to a data frame
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
    #' Convert RealtimeResponseUsageInputTokenDetails to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      RealtimeResponseUsageInputTokenDetailsObject <- list()
      if (!is.null(self$`cached_tokens`)) {
        RealtimeResponseUsageInputTokenDetailsObject[["cached_tokens"]] <-
          self$`cached_tokens`
      }
      if (!is.null(self$`text_tokens`)) {
        RealtimeResponseUsageInputTokenDetailsObject[["text_tokens"]] <-
          self$`text_tokens`
      }
      if (!is.null(self$`audio_tokens`)) {
        RealtimeResponseUsageInputTokenDetailsObject[["audio_tokens"]] <-
          self$`audio_tokens`
      }
      return(RealtimeResponseUsageInputTokenDetailsObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of RealtimeResponseUsageInputTokenDetails
    #'
    #' @param input_json the JSON input
    #' @return the instance of RealtimeResponseUsageInputTokenDetails
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`cached_tokens`)) {
        self$`cached_tokens` <- this_object$`cached_tokens`
      }
      if (!is.null(this_object$`text_tokens`)) {
        self$`text_tokens` <- this_object$`text_tokens`
      }
      if (!is.null(this_object$`audio_tokens`)) {
        self$`audio_tokens` <- this_object$`audio_tokens`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return RealtimeResponseUsageInputTokenDetails in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of RealtimeResponseUsageInputTokenDetails
    #'
    #' @param input_json the JSON input
    #' @return the instance of RealtimeResponseUsageInputTokenDetails
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`cached_tokens` <- this_object$`cached_tokens`
      self$`text_tokens` <- this_object$`text_tokens`
      self$`audio_tokens` <- this_object$`audio_tokens`
      self
    },

    #' @description
    #' Validate JSON input with respect to RealtimeResponseUsageInputTokenDetails and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of RealtimeResponseUsageInputTokenDetails
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
# RealtimeResponseUsageInputTokenDetails$unlock()
#
## Below is an example to define the print function
# RealtimeResponseUsageInputTokenDetails$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# RealtimeResponseUsageInputTokenDetails$lock()

