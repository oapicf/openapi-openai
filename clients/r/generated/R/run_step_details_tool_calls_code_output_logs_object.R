#' Create a new RunStepDetailsToolCallsCodeOutputLogsObject
#'
#' @description
#' Text output from the Code Interpreter tool call as part of a run step.
#'
#' @docType class
#' @title RunStepDetailsToolCallsCodeOutputLogsObject
#' @description RunStepDetailsToolCallsCodeOutputLogsObject Class
#' @format An \code{R6Class} generator object
#' @field type Always `logs`. character
#' @field logs The text output from the Code Interpreter tool call. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RunStepDetailsToolCallsCodeOutputLogsObject <- R6::R6Class(
  "RunStepDetailsToolCallsCodeOutputLogsObject",
  public = list(
    `type` = NULL,
    `logs` = NULL,
    #' Initialize a new RunStepDetailsToolCallsCodeOutputLogsObject class.
    #'
    #' @description
    #' Initialize a new RunStepDetailsToolCallsCodeOutputLogsObject class.
    #'
    #' @param type Always `logs`.
    #' @param logs The text output from the Code Interpreter tool call.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`type`, `logs`, ...) {
      if (!missing(`type`)) {
        if (!(`type` %in% c("logs"))) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be \"logs\".", sep = ""))
        }
        if (!(is.character(`type`) && length(`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", `type`))
        }
        self$`type` <- `type`
      }
      if (!missing(`logs`)) {
        if (!(is.character(`logs`) && length(`logs`) == 1)) {
          stop(paste("Error! Invalid data for `logs`. Must be a string:", `logs`))
        }
        self$`logs` <- `logs`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return RunStepDetailsToolCallsCodeOutputLogsObject in JSON format
    #' @export
    toJSON = function() {
      RunStepDetailsToolCallsCodeOutputLogsObjectObject <- list()
      if (!is.null(self$`type`)) {
        RunStepDetailsToolCallsCodeOutputLogsObjectObject[["type"]] <-
          self$`type`
      }
      if (!is.null(self$`logs`)) {
        RunStepDetailsToolCallsCodeOutputLogsObjectObject[["logs"]] <-
          self$`logs`
      }
      RunStepDetailsToolCallsCodeOutputLogsObjectObject
    },
    #' Deserialize JSON string into an instance of RunStepDetailsToolCallsCodeOutputLogsObject
    #'
    #' @description
    #' Deserialize JSON string into an instance of RunStepDetailsToolCallsCodeOutputLogsObject
    #'
    #' @param input_json the JSON input
    #' @return the instance of RunStepDetailsToolCallsCodeOutputLogsObject
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`)) {
        if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("logs"))) {
          stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"logs\".", sep = ""))
        }
        self$`type` <- this_object$`type`
      }
      if (!is.null(this_object$`logs`)) {
        self$`logs` <- this_object$`logs`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return RunStepDetailsToolCallsCodeOutputLogsObject in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`type`)) {
          sprintf(
          '"type":
            "%s"
                    ',
          self$`type`
          )
        },
        if (!is.null(self$`logs`)) {
          sprintf(
          '"logs":
            "%s"
                    ',
          self$`logs`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of RunStepDetailsToolCallsCodeOutputLogsObject
    #'
    #' @description
    #' Deserialize JSON string into an instance of RunStepDetailsToolCallsCodeOutputLogsObject
    #'
    #' @param input_json the JSON input
    #' @return the instance of RunStepDetailsToolCallsCodeOutputLogsObject
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("logs"))) {
        stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"logs\".", sep = ""))
      }
      self$`type` <- this_object$`type`
      self$`logs` <- this_object$`logs`
      self
    },
    #' Validate JSON input with respect to RunStepDetailsToolCallsCodeOutputLogsObject
    #'
    #' @description
    #' Validate JSON input with respect to RunStepDetailsToolCallsCodeOutputLogsObject and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `type`
      if (!is.null(input_json$`type`)) {
        if (!(is.character(input_json$`type`) && length(input_json$`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", input_json$`type`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RunStepDetailsToolCallsCodeOutputLogsObject: the required field `type` is missing."))
      }
      # check the required field `logs`
      if (!is.null(input_json$`logs`)) {
        if (!(is.character(input_json$`logs`) && length(input_json$`logs`) == 1)) {
          stop(paste("Error! Invalid data for `logs`. Must be a string:", input_json$`logs`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RunStepDetailsToolCallsCodeOutputLogsObject: the required field `logs` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of RunStepDetailsToolCallsCodeOutputLogsObject
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
      # check if the required `type` is null
      if (is.null(self$`type`)) {
        return(FALSE)
      }

      # check if the required `logs` is null
      if (is.null(self$`logs`)) {
        return(FALSE)
      }

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
      # check if the required `type` is null
      if (is.null(self$`type`)) {
        invalid_fields["type"] <- "Non-nullable required field `type` cannot be null."
      }

      # check if the required `logs` is null
      if (is.null(self$`logs`)) {
        invalid_fields["logs"] <- "Non-nullable required field `logs` cannot be null."
      }

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
# RunStepDetailsToolCallsCodeOutputLogsObject$unlock()
#
## Below is an example to define the print function
# RunStepDetailsToolCallsCodeOutputLogsObject$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# RunStepDetailsToolCallsCodeOutputLogsObject$lock()

