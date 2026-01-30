#' Create a new ChatCompletionStreamOptions
#'
#' @description
#' Options for streaming response. Only set this when you set `stream: true`. 
#'
#' @docType class
#' @title ChatCompletionStreamOptions
#' @description ChatCompletionStreamOptions Class
#' @format An \code{R6Class} generator object
#' @field include_usage If set, an additional chunk will be streamed before the `data: [DONE]` message. The `usage` field on this chunk shows the token usage statistics for the entire request, and the `choices` field will always be an empty array. All other chunks will also include a `usage` field, but with a null value. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ChatCompletionStreamOptions <- R6::R6Class(
  "ChatCompletionStreamOptions",
  public = list(
    `include_usage` = NULL,

    #' @description
    #' Initialize a new ChatCompletionStreamOptions class.
    #'
    #' @param include_usage If set, an additional chunk will be streamed before the `data: [DONE]` message. The `usage` field on this chunk shows the token usage statistics for the entire request, and the `choices` field will always be an empty array. All other chunks will also include a `usage` field, but with a null value.
    #' @param ... Other optional arguments.
    initialize = function(`include_usage` = NULL, ...) {
      if (!is.null(`include_usage`)) {
        if (!(is.logical(`include_usage`) && length(`include_usage`) == 1)) {
          stop(paste("Error! Invalid data for `include_usage`. Must be a boolean:", `include_usage`))
        }
        self$`include_usage` <- `include_usage`
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
    #' @return ChatCompletionStreamOptions as a base R list.
    #' @examples
    #' # convert array of ChatCompletionStreamOptions (x) to a data frame
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
    #' Convert ChatCompletionStreamOptions to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      ChatCompletionStreamOptionsObject <- list()
      if (!is.null(self$`include_usage`)) {
        ChatCompletionStreamOptionsObject[["include_usage"]] <-
          self$`include_usage`
      }
      return(ChatCompletionStreamOptionsObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of ChatCompletionStreamOptions
    #'
    #' @param input_json the JSON input
    #' @return the instance of ChatCompletionStreamOptions
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`include_usage`)) {
        self$`include_usage` <- this_object$`include_usage`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return ChatCompletionStreamOptions in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of ChatCompletionStreamOptions
    #'
    #' @param input_json the JSON input
    #' @return the instance of ChatCompletionStreamOptions
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`include_usage` <- this_object$`include_usage`
      self
    },

    #' @description
    #' Validate JSON input with respect to ChatCompletionStreamOptions and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ChatCompletionStreamOptions
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
# ChatCompletionStreamOptions$unlock()
#
## Below is an example to define the print function
# ChatCompletionStreamOptions$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ChatCompletionStreamOptions$lock()

