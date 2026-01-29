#' Create a new RunStepDetailsToolCallsObject
#'
#' @description
#' Details of the tool call.
#'
#' @docType class
#' @title RunStepDetailsToolCallsObject
#' @description RunStepDetailsToolCallsObject Class
#' @format An \code{R6Class} generator object
#' @field type Always `tool_calls`. character
#' @field tool_calls An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `retrieval`, or `function`. list(\link{RunStepDetailsToolCallsObjectToolCallsInner})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RunStepDetailsToolCallsObject <- R6::R6Class(
  "RunStepDetailsToolCallsObject",
  public = list(
    `type` = NULL,
    `tool_calls` = NULL,

    #' @description
    #' Initialize a new RunStepDetailsToolCallsObject class.
    #'
    #' @param type Always `tool_calls`.
    #' @param tool_calls An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `retrieval`, or `function`.
    #' @param ... Other optional arguments.
    initialize = function(`type`, `tool_calls`, ...) {
      if (!missing(`type`)) {
        if (!(`type` %in% c("tool_calls"))) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be \"tool_calls\".", sep = ""))
        }
        if (!(is.character(`type`) && length(`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", `type`))
        }
        self$`type` <- `type`
      }
      if (!missing(`tool_calls`)) {
        stopifnot(is.vector(`tool_calls`), length(`tool_calls`) != 0)
        sapply(`tool_calls`, function(x) stopifnot(R6::is.R6(x)))
        self$`tool_calls` <- `tool_calls`
      }
    },

    #' @description
    #' Convert to an R object. This method is deprecated. Use `toSimpleType()` instead.
    toJSON = function() {
      .Deprecated(new = "toSimpleType", msg = "Use the '$toSimpleType()' method instead since that is more clearly named. Use '$toJSONString()' to get a JSON string")
      return(self$toSimpleType())
    },

    #' @description
    #' Convert to a List
    #'
    #' Convert the R6 object to a list to work more easily with other tooling.
    #'
    #' @return RunStepDetailsToolCallsObject as a base R list.
    #' @examples
    #' # convert array of RunStepDetailsToolCallsObject (x) to a data frame
    #' \dontrun{
    #' library(purrr)
    #' library(tibble)
    #' df <- x |> map(\(y)y$toList()) |> map(as_tibble) |> list_rbind()
    #' df
    #' }
    toList = function() {
      return(self$toSimpleType())
    },

    #' @description
    #' Convert RunStepDetailsToolCallsObject to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      RunStepDetailsToolCallsObjectObject <- list()
      if (!is.null(self$`type`)) {
        RunStepDetailsToolCallsObjectObject[["type"]] <-
          self$`type`
      }
      if (!is.null(self$`tool_calls`)) {
        RunStepDetailsToolCallsObjectObject[["tool_calls"]] <-
          lapply(self$`tool_calls`, function(x) x$toSimpleType())
      }
      return(RunStepDetailsToolCallsObjectObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of RunStepDetailsToolCallsObject
    #'
    #' @param input_json the JSON input
    #' @return the instance of RunStepDetailsToolCallsObject
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`)) {
        if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("tool_calls"))) {
          stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"tool_calls\".", sep = ""))
        }
        self$`type` <- this_object$`type`
      }
      if (!is.null(this_object$`tool_calls`)) {
        self$`tool_calls` <- ApiClient$new()$deserializeObj(this_object$`tool_calls`, "array[RunStepDetailsToolCallsObjectToolCallsInner]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return RunStepDetailsToolCallsObject in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of RunStepDetailsToolCallsObject
    #'
    #' @param input_json the JSON input
    #' @return the instance of RunStepDetailsToolCallsObject
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("tool_calls"))) {
        stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"tool_calls\".", sep = ""))
      }
      self$`type` <- this_object$`type`
      self$`tool_calls` <- ApiClient$new()$deserializeObj(this_object$`tool_calls`, "array[RunStepDetailsToolCallsObjectToolCallsInner]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to RunStepDetailsToolCallsObject and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `type`
      if (!is.null(input_json$`type`)) {
        if (!(is.character(input_json$`type`) && length(input_json$`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", input_json$`type`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RunStepDetailsToolCallsObject: the required field `type` is missing."))
      }
      # check the required field `tool_calls`
      if (!is.null(input_json$`tool_calls`)) {
        stopifnot(is.vector(input_json$`tool_calls`), length(input_json$`tool_calls`) != 0)
        tmp <- sapply(input_json$`tool_calls`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RunStepDetailsToolCallsObject: the required field `tool_calls` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of RunStepDetailsToolCallsObject
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `type` is null
      if (is.null(self$`type`)) {
        return(FALSE)
      }

      # check if the required `tool_calls` is null
      if (is.null(self$`tool_calls`)) {
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
      # check if the required `type` is null
      if (is.null(self$`type`)) {
        invalid_fields["type"] <- "Non-nullable required field `type` cannot be null."
      }

      # check if the required `tool_calls` is null
      if (is.null(self$`tool_calls`)) {
        invalid_fields["tool_calls"] <- "Non-nullable required field `tool_calls` cannot be null."
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
# RunStepDetailsToolCallsObject$unlock()
#
## Below is an example to define the print function
# RunStepDetailsToolCallsObject$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# RunStepDetailsToolCallsObject$lock()

