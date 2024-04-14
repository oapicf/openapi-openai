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
    #' Initialize a new SubmitToolOutputsRunRequestToolOutputsInner class.
    #'
    #' @description
    #' Initialize a new SubmitToolOutputsRunRequestToolOutputsInner class.
    #'
    #' @param tool_call_id The ID of the tool call in the `required_action` object within the run object the output is being submitted for.
    #' @param output The output of the tool call to be submitted to continue the run.
    #' @param ... Other optional arguments.
    #' @export
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
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return SubmitToolOutputsRunRequestToolOutputsInner in JSON format
    #' @export
    toJSON = function() {
      SubmitToolOutputsRunRequestToolOutputsInnerObject <- list()
      if (!is.null(self$`tool_call_id`)) {
        SubmitToolOutputsRunRequestToolOutputsInnerObject[["tool_call_id"]] <-
          self$`tool_call_id`
      }
      if (!is.null(self$`output`)) {
        SubmitToolOutputsRunRequestToolOutputsInnerObject[["output"]] <-
          self$`output`
      }
      SubmitToolOutputsRunRequestToolOutputsInnerObject
    },
    #' Deserialize JSON string into an instance of SubmitToolOutputsRunRequestToolOutputsInner
    #'
    #' @description
    #' Deserialize JSON string into an instance of SubmitToolOutputsRunRequestToolOutputsInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of SubmitToolOutputsRunRequestToolOutputsInner
    #' @export
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
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return SubmitToolOutputsRunRequestToolOutputsInner in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`tool_call_id`)) {
          sprintf(
          '"tool_call_id":
            "%s"
                    ',
          self$`tool_call_id`
          )
        },
        if (!is.null(self$`output`)) {
          sprintf(
          '"output":
            "%s"
                    ',
          self$`output`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of SubmitToolOutputsRunRequestToolOutputsInner
    #'
    #' @description
    #' Deserialize JSON string into an instance of SubmitToolOutputsRunRequestToolOutputsInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of SubmitToolOutputsRunRequestToolOutputsInner
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`tool_call_id` <- this_object$`tool_call_id`
      self$`output` <- this_object$`output`
      self
    },
    #' Validate JSON input with respect to SubmitToolOutputsRunRequestToolOutputsInner
    #'
    #' @description
    #' Validate JSON input with respect to SubmitToolOutputsRunRequestToolOutputsInner and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of SubmitToolOutputsRunRequestToolOutputsInner
    #' @export
    toString = function() {
      self$toJSONString()
    },
    #' Return true if the values in all fields are valid.
    #'
    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    #' @export
    isValid = function() {
      TRUE
    },
    #' Return a list of invalid fields (if any).
    #'
    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    #' @export
    getInvalidFields = function() {
      invalid_fields <- list()
      invalid_fields
    },
    #' Print the object
    #'
    #' @description
    #' Print the object
    #'
    #' @export
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

