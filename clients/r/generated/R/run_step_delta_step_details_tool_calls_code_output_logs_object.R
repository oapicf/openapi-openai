#' Create a new RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject
#'
#' @description
#' Text output from the Code Interpreter tool call as part of a run step.
#'
#' @docType class
#' @title RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject
#' @description RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject Class
#' @format An \code{R6Class} generator object
#' @field index The index of the output in the outputs array. integer
#' @field type Always `logs`. character
#' @field logs The text output from the Code Interpreter tool call. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject <- R6::R6Class(
  "RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject",
  public = list(
    `index` = NULL,
    `type` = NULL,
    `logs` = NULL,

    #' @description
    #' Initialize a new RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject class.
    #'
    #' @param index The index of the output in the outputs array.
    #' @param type Always `logs`.
    #' @param logs The text output from the Code Interpreter tool call.
    #' @param ... Other optional arguments.
    initialize = function(`index`, `type`, `logs` = NULL, ...) {
      if (!missing(`index`)) {
        if (!(is.numeric(`index`) && length(`index`) == 1)) {
          stop(paste("Error! Invalid data for `index`. Must be an integer:", `index`))
        }
        self$`index` <- `index`
      }
      if (!missing(`type`)) {
        if (!(`type` %in% c("logs"))) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be \"logs\".", sep = ""))
        }
        if (!(is.character(`type`) && length(`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", `type`))
        }
        self$`type` <- `type`
      }
      if (!is.null(`logs`)) {
        if (!(is.character(`logs`) && length(`logs`) == 1)) {
          stop(paste("Error! Invalid data for `logs`. Must be a string:", `logs`))
        }
        self$`logs` <- `logs`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject in JSON format
    toJSON = function() {
      RunStepDeltaStepDetailsToolCallsCodeOutputLogsObjectObject <- list()
      if (!is.null(self$`index`)) {
        RunStepDeltaStepDetailsToolCallsCodeOutputLogsObjectObject[["index"]] <-
          self$`index`
      }
      if (!is.null(self$`type`)) {
        RunStepDeltaStepDetailsToolCallsCodeOutputLogsObjectObject[["type"]] <-
          self$`type`
      }
      if (!is.null(self$`logs`)) {
        RunStepDeltaStepDetailsToolCallsCodeOutputLogsObjectObject[["logs"]] <-
          self$`logs`
      }
      RunStepDeltaStepDetailsToolCallsCodeOutputLogsObjectObject
    },

    #' @description
    #' Deserialize JSON string into an instance of RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject
    #'
    #' @param input_json the JSON input
    #' @return the instance of RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`index`)) {
        self$`index` <- this_object$`index`
      }
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

    #' @description
    #' To JSON String
    #'
    #' @return RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`index`)) {
          sprintf(
          '"index":
            %d
                    ',
          self$`index`
          )
        },
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

    #' @description
    #' Deserialize JSON string into an instance of RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject
    #'
    #' @param input_json the JSON input
    #' @return the instance of RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`index` <- this_object$`index`
      if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("logs"))) {
        stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"logs\".", sep = ""))
      }
      self$`type` <- this_object$`type`
      self$`logs` <- this_object$`logs`
      self
    },

    #' @description
    #' Validate JSON input with respect to RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `index`
      if (!is.null(input_json$`index`)) {
        if (!(is.numeric(input_json$`index`) && length(input_json$`index`) == 1)) {
          stop(paste("Error! Invalid data for `index`. Must be an integer:", input_json$`index`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject: the required field `index` is missing."))
      }
      # check the required field `type`
      if (!is.null(input_json$`type`)) {
        if (!(is.character(input_json$`type`) && length(input_json$`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", input_json$`type`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject: the required field `type` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `index` is null
      if (is.null(self$`index`)) {
        return(FALSE)
      }

      # check if the required `type` is null
      if (is.null(self$`type`)) {
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
      # check if the required `index` is null
      if (is.null(self$`index`)) {
        invalid_fields["index"] <- "Non-nullable required field `index` cannot be null."
      }

      # check if the required `type` is null
      if (is.null(self$`type`)) {
        invalid_fields["type"] <- "Non-nullable required field `type` cannot be null."
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
# RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject$unlock()
#
## Below is an example to define the print function
# RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject$lock()

