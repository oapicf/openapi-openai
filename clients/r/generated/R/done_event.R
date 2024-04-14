#' Create a new DoneEvent
#'
#' @description
#' Occurs when a stream ends.
#'
#' @docType class
#' @title DoneEvent
#' @description DoneEvent Class
#' @format An \code{R6Class} generator object
#' @field event  character
#' @field data  character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
DoneEvent <- R6::R6Class(
  "DoneEvent",
  public = list(
    `event` = NULL,
    `data` = NULL,
    #' Initialize a new DoneEvent class.
    #'
    #' @description
    #' Initialize a new DoneEvent class.
    #'
    #' @param event event
    #' @param data data
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`event`, `data`, ...) {
      if (!missing(`event`)) {
        if (!(`event` %in% c("done"))) {
          stop(paste("Error! \"", `event`, "\" cannot be assigned to `event`. Must be \"done\".", sep = ""))
        }
        if (!(is.character(`event`) && length(`event`) == 1)) {
          stop(paste("Error! Invalid data for `event`. Must be a string:", `event`))
        }
        self$`event` <- `event`
      }
      if (!missing(`data`)) {
        if (!(`data` %in% c("[DONE]"))) {
          stop(paste("Error! \"", `data`, "\" cannot be assigned to `data`. Must be \"[DONE]\".", sep = ""))
        }
        if (!(is.character(`data`) && length(`data`) == 1)) {
          stop(paste("Error! Invalid data for `data`. Must be a string:", `data`))
        }
        self$`data` <- `data`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return DoneEvent in JSON format
    #' @export
    toJSON = function() {
      DoneEventObject <- list()
      if (!is.null(self$`event`)) {
        DoneEventObject[["event"]] <-
          self$`event`
      }
      if (!is.null(self$`data`)) {
        DoneEventObject[["data"]] <-
          self$`data`
      }
      DoneEventObject
    },
    #' Deserialize JSON string into an instance of DoneEvent
    #'
    #' @description
    #' Deserialize JSON string into an instance of DoneEvent
    #'
    #' @param input_json the JSON input
    #' @return the instance of DoneEvent
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`event`)) {
        if (!is.null(this_object$`event`) && !(this_object$`event` %in% c("done"))) {
          stop(paste("Error! \"", this_object$`event`, "\" cannot be assigned to `event`. Must be \"done\".", sep = ""))
        }
        self$`event` <- this_object$`event`
      }
      if (!is.null(this_object$`data`)) {
        if (!is.null(this_object$`data`) && !(this_object$`data` %in% c("[DONE]"))) {
          stop(paste("Error! \"", this_object$`data`, "\" cannot be assigned to `data`. Must be \"[DONE]\".", sep = ""))
        }
        self$`data` <- this_object$`data`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return DoneEvent in JSON format
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
            "%s"
                    ',
          self$`data`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of DoneEvent
    #'
    #' @description
    #' Deserialize JSON string into an instance of DoneEvent
    #'
    #' @param input_json the JSON input
    #' @return the instance of DoneEvent
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`event`) && !(this_object$`event` %in% c("done"))) {
        stop(paste("Error! \"", this_object$`event`, "\" cannot be assigned to `event`. Must be \"done\".", sep = ""))
      }
      self$`event` <- this_object$`event`
      if (!is.null(this_object$`data`) && !(this_object$`data` %in% c("[DONE]"))) {
        stop(paste("Error! \"", this_object$`data`, "\" cannot be assigned to `data`. Must be \"[DONE]\".", sep = ""))
      }
      self$`data` <- this_object$`data`
      self
    },
    #' Validate JSON input with respect to DoneEvent
    #'
    #' @description
    #' Validate JSON input with respect to DoneEvent and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for DoneEvent: the required field `event` is missing."))
      }
      # check the required field `data`
      if (!is.null(input_json$`data`)) {
        if (!(is.character(input_json$`data`) && length(input_json$`data`) == 1)) {
          stop(paste("Error! Invalid data for `data`. Must be a string:", input_json$`data`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for DoneEvent: the required field `data` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of DoneEvent
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
# DoneEvent$unlock()
#
## Below is an example to define the print function
# DoneEvent$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# DoneEvent$lock()

