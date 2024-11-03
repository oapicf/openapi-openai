#' @docType class
#' @title AssistantStreamEvent
#'
#' @description AssistantStreamEvent Class
#'
#' @format An \code{R6Class} generator object
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AssistantStreamEvent <- R6::R6Class(
  "AssistantStreamEvent",
  public = list(
    #' @field actual_instance the object stored in this instance.
    actual_instance = NULL,
    #' @field actual_type the type of the object stored in this instance.
    actual_type = NULL,
    #' @field one_of  a list of types defined in the oneOf schema.
    one_of = list("DoneEvent", "ErrorEvent", "MessageStreamEvent", "RunStepStreamEvent", "RunStreamEvent", "ThreadStreamEvent"),

    #' @description
    #' Initialize a new AssistantStreamEvent.
    #'
    #' @param instance an instance of the object defined in the oneOf schemas: "DoneEvent", "ErrorEvent", "MessageStreamEvent", "RunStepStreamEvent", "RunStreamEvent", "ThreadStreamEvent"
    initialize = function(instance = NULL) {
      if (is.null(instance)) {
        # do nothing
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "DoneEvent") {
        self$actual_instance <- instance
        self$actual_type <- "DoneEvent"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "ErrorEvent") {
        self$actual_instance <- instance
        self$actual_type <- "ErrorEvent"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "MessageStreamEvent") {
        self$actual_instance <- instance
        self$actual_type <- "MessageStreamEvent"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "RunStepStreamEvent") {
        self$actual_instance <- instance
        self$actual_type <- "RunStepStreamEvent"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "RunStreamEvent") {
        self$actual_instance <- instance
        self$actual_type <- "RunStreamEvent"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "ThreadStreamEvent") {
        self$actual_instance <- instance
        self$actual_type <- "ThreadStreamEvent"
      } else {
        stop(paste("Failed to initialize AssistantStreamEvent with oneOf schemas DoneEvent, ErrorEvent, MessageStreamEvent, RunStepStreamEvent, RunStreamEvent, ThreadStreamEvent. Provided class name: ",
                   get(class(instance)[[1]], pos = -1)$classname))
      }
    },

    #' @description
    #' Deserialize JSON string into an instance of AssistantStreamEvent.
    #' An alias to the method `fromJSON` .
    #'
    #' @param input The input JSON.
    #'
    #' @return An instance of AssistantStreamEvent.
    fromJSONString = function(input) {
      self$fromJSON(input)
    },

    #' @description
    #' Deserialize JSON string into an instance of AssistantStreamEvent.
    #'
    #' @param input The input JSON.
    #'
    #' @return An instance of AssistantStreamEvent.
    fromJSON = function(input) {
      matched <- 0 # match counter
      matched_schemas <- list() #names of matched schemas
      error_messages <- list()
      instance <- NULL

      `ThreadStreamEvent_result` <- tryCatch({
          `ThreadStreamEvent`$public_methods$validateJSON(input)
          `ThreadStreamEvent_instance` <- `ThreadStreamEvent`$new()
          instance <- `ThreadStreamEvent_instance`$fromJSON(input)
          instance_type <- "ThreadStreamEvent"
          matched_schemas <- append(matched_schemas, "ThreadStreamEvent")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`ThreadStreamEvent_result`["error"])) {
        error_messages <- append(error_messages, `ThreadStreamEvent_result`["message"])
      }

      `RunStreamEvent_result` <- tryCatch({
          `RunStreamEvent`$public_methods$validateJSON(input)
          `RunStreamEvent_instance` <- `RunStreamEvent`$new()
          instance <- `RunStreamEvent_instance`$fromJSON(input)
          instance_type <- "RunStreamEvent"
          matched_schemas <- append(matched_schemas, "RunStreamEvent")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`RunStreamEvent_result`["error"])) {
        error_messages <- append(error_messages, `RunStreamEvent_result`["message"])
      }

      `RunStepStreamEvent_result` <- tryCatch({
          `RunStepStreamEvent`$public_methods$validateJSON(input)
          `RunStepStreamEvent_instance` <- `RunStepStreamEvent`$new()
          instance <- `RunStepStreamEvent_instance`$fromJSON(input)
          instance_type <- "RunStepStreamEvent"
          matched_schemas <- append(matched_schemas, "RunStepStreamEvent")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`RunStepStreamEvent_result`["error"])) {
        error_messages <- append(error_messages, `RunStepStreamEvent_result`["message"])
      }

      `MessageStreamEvent_result` <- tryCatch({
          `MessageStreamEvent`$public_methods$validateJSON(input)
          `MessageStreamEvent_instance` <- `MessageStreamEvent`$new()
          instance <- `MessageStreamEvent_instance`$fromJSON(input)
          instance_type <- "MessageStreamEvent"
          matched_schemas <- append(matched_schemas, "MessageStreamEvent")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`MessageStreamEvent_result`["error"])) {
        error_messages <- append(error_messages, `MessageStreamEvent_result`["message"])
      }

      `ErrorEvent_result` <- tryCatch({
          `ErrorEvent`$public_methods$validateJSON(input)
          `ErrorEvent_instance` <- `ErrorEvent`$new()
          instance <- `ErrorEvent_instance`$fromJSON(input)
          instance_type <- "ErrorEvent"
          matched_schemas <- append(matched_schemas, "ErrorEvent")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`ErrorEvent_result`["error"])) {
        error_messages <- append(error_messages, `ErrorEvent_result`["message"])
      }

      `DoneEvent_result` <- tryCatch({
          `DoneEvent`$public_methods$validateJSON(input)
          `DoneEvent_instance` <- `DoneEvent`$new()
          instance <- `DoneEvent_instance`$fromJSON(input)
          instance_type <- "DoneEvent"
          matched_schemas <- append(matched_schemas, "DoneEvent")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`DoneEvent_result`["error"])) {
        error_messages <- append(error_messages, `DoneEvent_result`["message"])
      }

      if (matched == 1) {
        # successfully match exactly 1 schema specified in oneOf
        self$actual_instance <- instance
        self$actual_type <- instance_type
      } else if (matched > 1) {
        # more than 1 match
        stop(paste("Multiple matches found when deserializing the input into AssistantStreamEvent with oneOf schemas DoneEvent, ErrorEvent, MessageStreamEvent, RunStepStreamEvent, RunStreamEvent, ThreadStreamEvent. Matched schemas: ",
                   paste(matched_schemas, collapse = ", ")))
      } else {
        # no match
        stop(paste("No match found when deserializing the input into AssistantStreamEvent with oneOf schemas DoneEvent, ErrorEvent, MessageStreamEvent, RunStepStreamEvent, RunStreamEvent, ThreadStreamEvent. Details: >>",
                   paste(error_messages, collapse = " >> ")))
      }

      self
    },

    #' @description
    #' Serialize AssistantStreamEvent to JSON string.
    #'
    #' @return JSON string representation of the AssistantStreamEvent.
    toJSONString = function() {
      if (!is.null(self$actual_instance)) {
        as.character(jsonlite::minify(self$actual_instance$toJSONString()))
      } else {
        NULL
      }
    },

    #' @description
    #' Serialize AssistantStreamEvent to JSON.
    #'
    #' @return JSON representation of the AssistantStreamEvent.
    toJSON = function() {
      if (!is.null(self$actual_instance)) {
        self$actual_instance$toJSON()
      } else {
        NULL
      }
    },

    #' @description
    #' Validate the input JSON with respect to AssistantStreamEvent and
    #' throw exception if invalid.
    #'
    #' @param input The input JSON.
    validateJSON = function(input) {
      # backup current values
      actual_instance_bak <- self$actual_instance
      actual_type_bak <- self$actual_type

      # if it's not valid, an error will be thrown
      self$fromJSON(input)

      # no error thrown, restore old values
      self$actual_instance <- actual_instance_bak
      self$actual_type <- actual_type_bak
    },

    #' @description
    #' Returns the string representation of the instance.
    #'
    #' @return The string representation of the instance.
    toString = function() {
      jsoncontent <- c(
        sprintf('"actual_instance": %s', if (is.null(self$actual_instance)) NULL else self$actual_instance$toJSONString()),
        sprintf('"actual_type": "%s"', self$actual_type),
        sprintf('"one_of": "%s"', paste(unlist(self$one_of), collapse = ", "))
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      as.character(jsonlite::prettify(paste("{", jsoncontent, "}", sep = "")))
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
#AssistantStreamEvent$unlock()
#
## Below is an example to define the print function
#AssistantStreamEvent$set("public", "print", function(...) {
#  print(jsonlite::prettify(self$toJSONString()))
#  invisible(self)
#})
## Uncomment below to lock the class to prevent modifications to the method or field
#AssistantStreamEvent$lock()

