#' Create a new SubmitToolOutputsRunRequestToolOutputsInner
#'
#' @description
#' SubmitToolOutputsRunRequestToolOutputsInner Class
#'
#' @docType class
#' @title SubmitToolOutputsRunRequestToolOutputsInner
#' @description SubmitToolOutputsRunRequestToolOutputsInner Class
#' @format An \code{R6Class} generator object
#' @field tool_call_id The ID of the tool call in the `required_action` object within the run object the output is being submitted for. character [optional]
#' @field output The output of the tool call to be submitted to continue the run. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
SubmitToolOutputsRunRequestToolOutputsInner <- R6::R6Class(
  "SubmitToolOutputsRunRequestToolOutputsInner",
  public = list(
    `tool_call_id` = NULL,
    `output` = NULL,

    #' @description
    #' Initialize a new SubmitToolOutputsRunRequestToolOutputsInner class.
    #'
    #' @param tool_call_id The ID of the tool call in the `required_action` object within the run object the output is being submitted for.
    #' @param output The output of the tool call to be submitted to continue the run.
    #' @param ... Other optional arguments.
    initialize = function(`tool_call_id` = NULL, `output` = NULL, ...) {
      if (!is.null(`tool_call_id`)) {
        if (!(is.character(`tool_call_id`) && length(`tool_call_id`) == 1)) {
          stop(paste("Error! Invalid data for `tool_call_id`. Must be a string:", `tool_call_id`))
        }
        self$`tool_call_id` <- `tool_call_id`
      }
      if (!is.null(`output`)) {
        if (!(is.character(`output`) && length(`output`) == 1)) {
          stop(paste("Error! Invalid data for `output`. Must be a string:", `output`))
        }
        self$`output` <- `output`
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
    #' @return SubmitToolOutputsRunRequestToolOutputsInner as a base R list.
    #' @examples
    #' # convert array of SubmitToolOutputsRunRequestToolOutputsInner (x) to a data frame
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
    #' Convert SubmitToolOutputsRunRequestToolOutputsInner to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      SubmitToolOutputsRunRequestToolOutputsInnerObject <- list()
      if (!is.null(self$`tool_call_id`)) {
        SubmitToolOutputsRunRequestToolOutputsInnerObject[["tool_call_id"]] <-
          self$`tool_call_id`
      }
      if (!is.null(self$`output`)) {
        SubmitToolOutputsRunRequestToolOutputsInnerObject[["output"]] <-
          self$`output`
      }
      return(SubmitToolOutputsRunRequestToolOutputsInnerObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of SubmitToolOutputsRunRequestToolOutputsInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of SubmitToolOutputsRunRequestToolOutputsInner
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`tool_call_id`)) {
        self$`tool_call_id` <- this_object$`tool_call_id`
      }
      if (!is.null(this_object$`output`)) {
        self$`output` <- this_object$`output`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return SubmitToolOutputsRunRequestToolOutputsInner in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of SubmitToolOutputsRunRequestToolOutputsInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of SubmitToolOutputsRunRequestToolOutputsInner
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`tool_call_id` <- this_object$`tool_call_id`
      self$`output` <- this_object$`output`
      self
    },

    #' @description
    #' Validate JSON input with respect to SubmitToolOutputsRunRequestToolOutputsInner and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of SubmitToolOutputsRunRequestToolOutputsInner
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
# SubmitToolOutputsRunRequestToolOutputsInner$unlock()
#
## Below is an example to define the print function
# SubmitToolOutputsRunRequestToolOutputsInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# SubmitToolOutputsRunRequestToolOutputsInner$lock()

