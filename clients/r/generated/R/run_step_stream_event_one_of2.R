#' Create a new RunStepStreamEventOneOf2
#'
#' @description
#' Occurs when parts of a [run step](/docs/api-reference/runs/step-object) are being streamed.
#'
#' @docType class
#' @title RunStepStreamEventOneOf2
#' @description RunStepStreamEventOneOf2 Class
#' @format An \code{R6Class} generator object
#' @field event  character
#' @field data  \link{RunStepDeltaObject}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RunStepStreamEventOneOf2 <- R6::R6Class(
  "RunStepStreamEventOneOf2",
  public = list(
    `event` = NULL,
    `data` = NULL,
    #' Initialize a new RunStepStreamEventOneOf2 class.
    #'
    #' @description
    #' Initialize a new RunStepStreamEventOneOf2 class.
    #'
    #' @param event event
    #' @param data data
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`event`, `data`, ...) {
      if (!missing(`event`)) {
        if (!(`event` %in% c("thread.run.step.delta"))) {
          stop(paste("Error! \"", `event`, "\" cannot be assigned to `event`. Must be \"thread.run.step.delta\".", sep = ""))
        }
        if (!(is.character(`event`) && length(`event`) == 1)) {
          stop(paste("Error! Invalid data for `event`. Must be a string:", `event`))
        }
        self$`event` <- `event`
      }
      if (!missing(`data`)) {
        stopifnot(R6::is.R6(`data`))
        self$`data` <- `data`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return RunStepStreamEventOneOf2 in JSON format
    #' @export
    toJSON = function() {
      RunStepStreamEventOneOf2Object <- list()
      if (!is.null(self$`event`)) {
        RunStepStreamEventOneOf2Object[["event"]] <-
          self$`event`
      }
      if (!is.null(self$`data`)) {
        RunStepStreamEventOneOf2Object[["data"]] <-
          self$`data`$toJSON()
      }
      RunStepStreamEventOneOf2Object
    },
    #' Deserialize JSON string into an instance of RunStepStreamEventOneOf2
    #'
    #' @description
    #' Deserialize JSON string into an instance of RunStepStreamEventOneOf2
    #'
    #' @param input_json the JSON input
    #' @return the instance of RunStepStreamEventOneOf2
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`event`)) {
        if (!is.null(this_object$`event`) && !(this_object$`event` %in% c("thread.run.step.delta"))) {
          stop(paste("Error! \"", this_object$`event`, "\" cannot be assigned to `event`. Must be \"thread.run.step.delta\".", sep = ""))
        }
        self$`event` <- this_object$`event`
      }
      if (!is.null(this_object$`data`)) {
        `data_object` <- RunStepDeltaObject$new()
        `data_object`$fromJSON(jsonlite::toJSON(this_object$`data`, auto_unbox = TRUE, digits = NA))
        self$`data` <- `data_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return RunStepStreamEventOneOf2 in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`event`)) {
          sprintf(
          '"event":
            "%s"
                    ',
          self$`event`
          )
        },
        if (!is.null(self$`data`)) {
          sprintf(
          '"data":
          %s
          ',
          jsonlite::toJSON(self$`data`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of RunStepStreamEventOneOf2
    #'
    #' @description
    #' Deserialize JSON string into an instance of RunStepStreamEventOneOf2
    #'
    #' @param input_json the JSON input
    #' @return the instance of RunStepStreamEventOneOf2
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`event`) && !(this_object$`event` %in% c("thread.run.step.delta"))) {
        stop(paste("Error! \"", this_object$`event`, "\" cannot be assigned to `event`. Must be \"thread.run.step.delta\".", sep = ""))
      }
      self$`event` <- this_object$`event`
      self$`data` <- RunStepDeltaObject$new()$fromJSON(jsonlite::toJSON(this_object$`data`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to RunStepStreamEventOneOf2
    #'
    #' @description
    #' Validate JSON input with respect to RunStepStreamEventOneOf2 and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `event`
      if (!is.null(input_json$`event`)) {
        if (!(is.character(input_json$`event`) && length(input_json$`event`) == 1)) {
          stop(paste("Error! Invalid data for `event`. Must be a string:", input_json$`event`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RunStepStreamEventOneOf2: the required field `event` is missing."))
      }
      # check the required field `data`
      if (!is.null(input_json$`data`)) {
        stopifnot(R6::is.R6(input_json$`data`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RunStepStreamEventOneOf2: the required field `data` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of RunStepStreamEventOneOf2
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
      # check if the required `event` is null
      if (is.null(self$`event`)) {
        return(FALSE)
      }

      # check if the required `data` is null
      if (is.null(self$`data`)) {
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
      # check if the required `event` is null
      if (is.null(self$`event`)) {
        invalid_fields["event"] <- "Non-nullable required field `event` cannot be null."
      }

      # check if the required `data` is null
      if (is.null(self$`data`)) {
        invalid_fields["data"] <- "Non-nullable required field `data` cannot be null."
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
# RunStepStreamEventOneOf2$unlock()
#
## Below is an example to define the print function
# RunStepStreamEventOneOf2$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# RunStepStreamEventOneOf2$lock()

