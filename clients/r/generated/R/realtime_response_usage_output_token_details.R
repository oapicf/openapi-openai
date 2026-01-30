#' Create a new RealtimeResponseUsageOutputTokenDetails
#'
#' @description
#' Details about the output tokens used in the Response.
#'
#' @docType class
#' @title RealtimeResponseUsageOutputTokenDetails
#' @description RealtimeResponseUsageOutputTokenDetails Class
#' @format An \code{R6Class} generator object
#' @field text_tokens The number of text tokens used in the Response. integer [optional]
#' @field audio_tokens The number of audio tokens used in the Response. integer [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RealtimeResponseUsageOutputTokenDetails <- R6::R6Class(
  "RealtimeResponseUsageOutputTokenDetails",
  public = list(
    `text_tokens` = NULL,
    `audio_tokens` = NULL,

    #' @description
    #' Initialize a new RealtimeResponseUsageOutputTokenDetails class.
    #'
    #' @param text_tokens The number of text tokens used in the Response.
    #' @param audio_tokens The number of audio tokens used in the Response.
    #' @param ... Other optional arguments.
    initialize = function(`text_tokens` = NULL, `audio_tokens` = NULL, ...) {
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
    #' @return RealtimeResponseUsageOutputTokenDetails as a base R list.
    #' @examples
    #' # convert array of RealtimeResponseUsageOutputTokenDetails (x) to a data frame
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
    #' Convert RealtimeResponseUsageOutputTokenDetails to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      RealtimeResponseUsageOutputTokenDetailsObject <- list()
      if (!is.null(self$`text_tokens`)) {
        RealtimeResponseUsageOutputTokenDetailsObject[["text_tokens"]] <-
          self$`text_tokens`
      }
      if (!is.null(self$`audio_tokens`)) {
        RealtimeResponseUsageOutputTokenDetailsObject[["audio_tokens"]] <-
          self$`audio_tokens`
      }
      return(RealtimeResponseUsageOutputTokenDetailsObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of RealtimeResponseUsageOutputTokenDetails
    #'
    #' @param input_json the JSON input
    #' @return the instance of RealtimeResponseUsageOutputTokenDetails
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
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
    #' @return RealtimeResponseUsageOutputTokenDetails in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of RealtimeResponseUsageOutputTokenDetails
    #'
    #' @param input_json the JSON input
    #' @return the instance of RealtimeResponseUsageOutputTokenDetails
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`text_tokens` <- this_object$`text_tokens`
      self$`audio_tokens` <- this_object$`audio_tokens`
      self
    },

    #' @description
    #' Validate JSON input with respect to RealtimeResponseUsageOutputTokenDetails and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of RealtimeResponseUsageOutputTokenDetails
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
# RealtimeResponseUsageOutputTokenDetails$unlock()
#
## Below is an example to define the print function
# RealtimeResponseUsageOutputTokenDetails$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# RealtimeResponseUsageOutputTokenDetails$lock()

