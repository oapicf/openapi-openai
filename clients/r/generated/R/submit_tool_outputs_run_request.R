#' Create a new SubmitToolOutputsRunRequest
#'
#' @description
#' SubmitToolOutputsRunRequest Class
#'
#' @docType class
#' @title SubmitToolOutputsRunRequest
#' @description SubmitToolOutputsRunRequest Class
#' @format An \code{R6Class} generator object
#' @field tool_outputs A list of tools for which the outputs are being submitted. list(\link{SubmitToolOutputsRunRequestToolOutputsInner})
#' @field stream If `true`, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a `data: [DONE]` message. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
SubmitToolOutputsRunRequest <- R6::R6Class(
  "SubmitToolOutputsRunRequest",
  public = list(
    `tool_outputs` = NULL,
    `stream` = NULL,
    #' Initialize a new SubmitToolOutputsRunRequest class.
    #'
    #' @description
    #' Initialize a new SubmitToolOutputsRunRequest class.
    #'
    #' @param tool_outputs A list of tools for which the outputs are being submitted.
    #' @param stream If `true`, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a `data: [DONE]` message.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`tool_outputs`, `stream` = NULL, ...) {
      if (!missing(`tool_outputs`)) {
        stopifnot(is.vector(`tool_outputs`), length(`tool_outputs`) != 0)
        sapply(`tool_outputs`, function(x) stopifnot(R6::is.R6(x)))
        self$`tool_outputs` <- `tool_outputs`
      }
      if (!is.null(`stream`)) {
        if (!(is.logical(`stream`) && length(`stream`) == 1)) {
          stop(paste("Error! Invalid data for `stream`. Must be a boolean:", `stream`))
        }
        self$`stream` <- `stream`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return SubmitToolOutputsRunRequest in JSON format
    #' @export
    toJSON = function() {
      SubmitToolOutputsRunRequestObject <- list()
      if (!is.null(self$`tool_outputs`)) {
        SubmitToolOutputsRunRequestObject[["tool_outputs"]] <-
          lapply(self$`tool_outputs`, function(x) x$toJSON())
      }
      if (!is.null(self$`stream`)) {
        SubmitToolOutputsRunRequestObject[["stream"]] <-
          self$`stream`
      }
      SubmitToolOutputsRunRequestObject
    },
    #' Deserialize JSON string into an instance of SubmitToolOutputsRunRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of SubmitToolOutputsRunRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of SubmitToolOutputsRunRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`tool_outputs`)) {
        self$`tool_outputs` <- ApiClient$new()$deserializeObj(this_object$`tool_outputs`, "array[SubmitToolOutputsRunRequestToolOutputsInner]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`stream`)) {
        self$`stream` <- this_object$`stream`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return SubmitToolOutputsRunRequest in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`tool_outputs`)) {
          sprintf(
          '"tool_outputs":
          [%s]
',
          paste(sapply(self$`tool_outputs`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`stream`)) {
          sprintf(
          '"stream":
            %s
                    ',
          tolower(self$`stream`)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of SubmitToolOutputsRunRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of SubmitToolOutputsRunRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of SubmitToolOutputsRunRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`tool_outputs` <- ApiClient$new()$deserializeObj(this_object$`tool_outputs`, "array[SubmitToolOutputsRunRequestToolOutputsInner]", loadNamespace("openapi"))
      self$`stream` <- this_object$`stream`
      self
    },
    #' Validate JSON input with respect to SubmitToolOutputsRunRequest
    #'
    #' @description
    #' Validate JSON input with respect to SubmitToolOutputsRunRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `tool_outputs`
      if (!is.null(input_json$`tool_outputs`)) {
        stopifnot(is.vector(input_json$`tool_outputs`), length(input_json$`tool_outputs`) != 0)
        tmp <- sapply(input_json$`tool_outputs`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for SubmitToolOutputsRunRequest: the required field `tool_outputs` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of SubmitToolOutputsRunRequest
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
      # check if the required `tool_outputs` is null
      if (is.null(self$`tool_outputs`)) {
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
      # check if the required `tool_outputs` is null
      if (is.null(self$`tool_outputs`)) {
        invalid_fields["tool_outputs"] <- "Non-nullable required field `tool_outputs` cannot be null."
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
# SubmitToolOutputsRunRequest$unlock()
#
## Below is an example to define the print function
# SubmitToolOutputsRunRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# SubmitToolOutputsRunRequest$lock()

