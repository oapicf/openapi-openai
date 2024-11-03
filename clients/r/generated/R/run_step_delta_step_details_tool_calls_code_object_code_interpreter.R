#' Create a new RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter
#'
#' @description
#' The Code Interpreter tool call definition.
#'
#' @docType class
#' @title RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter
#' @description RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter Class
#' @format An \code{R6Class} generator object
#' @field input The input to the Code Interpreter tool call. character [optional]
#' @field outputs The outputs from the Code Interpreter tool call. Code Interpreter can output one or more items, including text (`logs`) or images (`image`). Each of these are represented by a different object type. list(\link{RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter <- R6::R6Class(
  "RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter",
  public = list(
    `input` = NULL,
    `outputs` = NULL,

    #' @description
    #' Initialize a new RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter class.
    #'
    #' @param input The input to the Code Interpreter tool call.
    #' @param outputs The outputs from the Code Interpreter tool call. Code Interpreter can output one or more items, including text (`logs`) or images (`image`). Each of these are represented by a different object type.
    #' @param ... Other optional arguments.
    initialize = function(`input` = NULL, `outputs` = NULL, ...) {
      if (!is.null(`input`)) {
        if (!(is.character(`input`) && length(`input`) == 1)) {
          stop(paste("Error! Invalid data for `input`. Must be a string:", `input`))
        }
        self$`input` <- `input`
      }
      if (!is.null(`outputs`)) {
        stopifnot(is.vector(`outputs`), length(`outputs`) != 0)
        sapply(`outputs`, function(x) stopifnot(R6::is.R6(x)))
        self$`outputs` <- `outputs`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter in JSON format
    toJSON = function() {
      RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterObject <- list()
      if (!is.null(self$`input`)) {
        RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterObject[["input"]] <-
          self$`input`
      }
      if (!is.null(self$`outputs`)) {
        RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterObject[["outputs"]] <-
          lapply(self$`outputs`, function(x) x$toJSON())
      }
      RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterObject
    },

    #' @description
    #' Deserialize JSON string into an instance of RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter
    #'
    #' @param input_json the JSON input
    #' @return the instance of RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`input`)) {
        self$`input` <- this_object$`input`
      }
      if (!is.null(this_object$`outputs`)) {
        self$`outputs` <- ApiClient$new()$deserializeObj(this_object$`outputs`, "array[RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`input`)) {
          sprintf(
          '"input":
            "%s"
                    ',
          self$`input`
          )
        },
        if (!is.null(self$`outputs`)) {
          sprintf(
          '"outputs":
          [%s]
',
          paste(sapply(self$`outputs`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter
    #'
    #' @param input_json the JSON input
    #' @return the instance of RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`input` <- this_object$`input`
      self$`outputs` <- ApiClient$new()$deserializeObj(this_object$`outputs`, "array[RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter
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
# RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter$unlock()
#
## Below is an example to define the print function
# RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter$lock()

