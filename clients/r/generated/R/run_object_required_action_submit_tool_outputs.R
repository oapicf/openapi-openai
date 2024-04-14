#' Create a new RunObjectRequiredActionSubmitToolOutputs
#'
#' @description
#' Details on the tool outputs needed for this run to continue.
#'
#' @docType class
#' @title RunObjectRequiredActionSubmitToolOutputs
#' @description RunObjectRequiredActionSubmitToolOutputs Class
#' @format An \code{R6Class} generator object
#' @field tool_calls A list of the relevant tool calls. list(\link{RunToolCallObject})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RunObjectRequiredActionSubmitToolOutputs <- R6::R6Class(
  "RunObjectRequiredActionSubmitToolOutputs",
  public = list(
    `tool_calls` = NULL,
    #' Initialize a new RunObjectRequiredActionSubmitToolOutputs class.
    #'
    #' @description
    #' Initialize a new RunObjectRequiredActionSubmitToolOutputs class.
    #'
    #' @param tool_calls A list of the relevant tool calls.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`tool_calls`, ...) {
      if (!missing(`tool_calls`)) {
        stopifnot(is.vector(`tool_calls`), length(`tool_calls`) != 0)
        sapply(`tool_calls`, function(x) stopifnot(R6::is.R6(x)))
        self$`tool_calls` <- `tool_calls`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return RunObjectRequiredActionSubmitToolOutputs in JSON format
    #' @export
    toJSON = function() {
      RunObjectRequiredActionSubmitToolOutputsObject <- list()
      if (!is.null(self$`tool_calls`)) {
        RunObjectRequiredActionSubmitToolOutputsObject[["tool_calls"]] <-
          lapply(self$`tool_calls`, function(x) x$toJSON())
      }
      RunObjectRequiredActionSubmitToolOutputsObject
    },
    #' Deserialize JSON string into an instance of RunObjectRequiredActionSubmitToolOutputs
    #'
    #' @description
    #' Deserialize JSON string into an instance of RunObjectRequiredActionSubmitToolOutputs
    #'
    #' @param input_json the JSON input
    #' @return the instance of RunObjectRequiredActionSubmitToolOutputs
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`tool_calls`)) {
        self$`tool_calls` <- ApiClient$new()$deserializeObj(this_object$`tool_calls`, "array[RunToolCallObject]", loadNamespace("openapi"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return RunObjectRequiredActionSubmitToolOutputs in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`tool_calls`)) {
          sprintf(
          '"tool_calls":
          [%s]
',
          paste(sapply(self$`tool_calls`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of RunObjectRequiredActionSubmitToolOutputs
    #'
    #' @description
    #' Deserialize JSON string into an instance of RunObjectRequiredActionSubmitToolOutputs
    #'
    #' @param input_json the JSON input
    #' @return the instance of RunObjectRequiredActionSubmitToolOutputs
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`tool_calls` <- ApiClient$new()$deserializeObj(this_object$`tool_calls`, "array[RunToolCallObject]", loadNamespace("openapi"))
      self
    },
    #' Validate JSON input with respect to RunObjectRequiredActionSubmitToolOutputs
    #'
    #' @description
    #' Validate JSON input with respect to RunObjectRequiredActionSubmitToolOutputs and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `tool_calls`
      if (!is.null(input_json$`tool_calls`)) {
        stopifnot(is.vector(input_json$`tool_calls`), length(input_json$`tool_calls`) != 0)
        tmp <- sapply(input_json$`tool_calls`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RunObjectRequiredActionSubmitToolOutputs: the required field `tool_calls` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of RunObjectRequiredActionSubmitToolOutputs
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
      # check if the required `tool_calls` is null
      if (is.null(self$`tool_calls`)) {
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
      # check if the required `tool_calls` is null
      if (is.null(self$`tool_calls`)) {
        invalid_fields["tool_calls"] <- "Non-nullable required field `tool_calls` cannot be null."
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
# RunObjectRequiredActionSubmitToolOutputs$unlock()
#
## Below is an example to define the print function
# RunObjectRequiredActionSubmitToolOutputs$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# RunObjectRequiredActionSubmitToolOutputs$lock()

