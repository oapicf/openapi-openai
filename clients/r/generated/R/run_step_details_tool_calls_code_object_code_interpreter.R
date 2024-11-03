#' Create a new RunStepDetailsToolCallsCodeObjectCodeInterpreter
#'
#' @description
#' The Code Interpreter tool call definition.
#'
#' @docType class
#' @title RunStepDetailsToolCallsCodeObjectCodeInterpreter
#' @description RunStepDetailsToolCallsCodeObjectCodeInterpreter Class
#' @format An \code{R6Class} generator object
#' @field input The input to the Code Interpreter tool call. character
#' @field outputs The outputs from the Code Interpreter tool call. Code Interpreter can output one or more items, including text (`logs`) or images (`image`). Each of these are represented by a different object type. list(\link{RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RunStepDetailsToolCallsCodeObjectCodeInterpreter <- R6::R6Class(
  "RunStepDetailsToolCallsCodeObjectCodeInterpreter",
  public = list(
    `input` = NULL,
    `outputs` = NULL,

    #' @description
    #' Initialize a new RunStepDetailsToolCallsCodeObjectCodeInterpreter class.
    #'
    #' @param input The input to the Code Interpreter tool call.
    #' @param outputs The outputs from the Code Interpreter tool call. Code Interpreter can output one or more items, including text (`logs`) or images (`image`). Each of these are represented by a different object type.
    #' @param ... Other optional arguments.
    initialize = function(`input`, `outputs`, ...) {
      if (!missing(`input`)) {
        if (!(is.character(`input`) && length(`input`) == 1)) {
          stop(paste("Error! Invalid data for `input`. Must be a string:", `input`))
        }
        self$`input` <- `input`
      }
      if (!missing(`outputs`)) {
        stopifnot(is.vector(`outputs`), length(`outputs`) != 0)
        sapply(`outputs`, function(x) stopifnot(R6::is.R6(x)))
        self$`outputs` <- `outputs`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return RunStepDetailsToolCallsCodeObjectCodeInterpreter in JSON format
    toJSON = function() {
      RunStepDetailsToolCallsCodeObjectCodeInterpreterObject <- list()
      if (!is.null(self$`input`)) {
        RunStepDetailsToolCallsCodeObjectCodeInterpreterObject[["input"]] <-
          self$`input`
      }
      if (!is.null(self$`outputs`)) {
        RunStepDetailsToolCallsCodeObjectCodeInterpreterObject[["outputs"]] <-
          lapply(self$`outputs`, function(x) x$toJSON())
      }
      RunStepDetailsToolCallsCodeObjectCodeInterpreterObject
    },

    #' @description
    #' Deserialize JSON string into an instance of RunStepDetailsToolCallsCodeObjectCodeInterpreter
    #'
    #' @param input_json the JSON input
    #' @return the instance of RunStepDetailsToolCallsCodeObjectCodeInterpreter
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`input`)) {
        self$`input` <- this_object$`input`
      }
      if (!is.null(this_object$`outputs`)) {
        self$`outputs` <- ApiClient$new()$deserializeObj(this_object$`outputs`, "array[RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return RunStepDetailsToolCallsCodeObjectCodeInterpreter in JSON format
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
    #' Deserialize JSON string into an instance of RunStepDetailsToolCallsCodeObjectCodeInterpreter
    #'
    #' @param input_json the JSON input
    #' @return the instance of RunStepDetailsToolCallsCodeObjectCodeInterpreter
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`input` <- this_object$`input`
      self$`outputs` <- ApiClient$new()$deserializeObj(this_object$`outputs`, "array[RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to RunStepDetailsToolCallsCodeObjectCodeInterpreter and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `input`
      if (!is.null(input_json$`input`)) {
        if (!(is.character(input_json$`input`) && length(input_json$`input`) == 1)) {
          stop(paste("Error! Invalid data for `input`. Must be a string:", input_json$`input`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RunStepDetailsToolCallsCodeObjectCodeInterpreter: the required field `input` is missing."))
      }
      # check the required field `outputs`
      if (!is.null(input_json$`outputs`)) {
        stopifnot(is.vector(input_json$`outputs`), length(input_json$`outputs`) != 0)
        tmp <- sapply(input_json$`outputs`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RunStepDetailsToolCallsCodeObjectCodeInterpreter: the required field `outputs` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of RunStepDetailsToolCallsCodeObjectCodeInterpreter
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `input` is null
      if (is.null(self$`input`)) {
        return(FALSE)
      }

      # check if the required `outputs` is null
      if (is.null(self$`outputs`)) {
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
      # check if the required `input` is null
      if (is.null(self$`input`)) {
        invalid_fields["input"] <- "Non-nullable required field `input` cannot be null."
      }

      # check if the required `outputs` is null
      if (is.null(self$`outputs`)) {
        invalid_fields["outputs"] <- "Non-nullable required field `outputs` cannot be null."
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
# RunStepDetailsToolCallsCodeObjectCodeInterpreter$unlock()
#
## Below is an example to define the print function
# RunStepDetailsToolCallsCodeObjectCodeInterpreter$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# RunStepDetailsToolCallsCodeObjectCodeInterpreter$lock()

