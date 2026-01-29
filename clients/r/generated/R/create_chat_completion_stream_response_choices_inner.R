#' Create a new CreateChatCompletionStreamResponseChoicesInner
#'
#' @description
#' CreateChatCompletionStreamResponseChoicesInner Class
#'
#' @docType class
#' @title CreateChatCompletionStreamResponseChoicesInner
#' @description CreateChatCompletionStreamResponseChoicesInner Class
#' @format An \code{R6Class} generator object
#' @field delta  \link{ChatCompletionStreamResponseDelta}
#' @field logprobs  \link{CreateChatCompletionResponseChoicesInnerLogprobs} [optional]
#' @field finish_reason The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, `tool_calls` if the model called a tool, or `function_call` (deprecated) if the model called a function. character
#' @field index The index of the choice in the list of choices. integer
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CreateChatCompletionStreamResponseChoicesInner <- R6::R6Class(
  "CreateChatCompletionStreamResponseChoicesInner",
  public = list(
    `delta` = NULL,
    `logprobs` = NULL,
    `finish_reason` = NULL,
    `index` = NULL,

    #' @description
    #' Initialize a new CreateChatCompletionStreamResponseChoicesInner class.
    #'
    #' @param delta delta
    #' @param finish_reason The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, `tool_calls` if the model called a tool, or `function_call` (deprecated) if the model called a function.
    #' @param index The index of the choice in the list of choices.
    #' @param logprobs logprobs
    #' @param ... Other optional arguments.
    initialize = function(`delta`, `finish_reason`, `index`, `logprobs` = NULL, ...) {
      if (!missing(`delta`)) {
        stopifnot(R6::is.R6(`delta`))
        self$`delta` <- `delta`
      }
      if (!missing(`finish_reason`)) {
        if (!(`finish_reason` %in% c("stop", "length", "tool_calls", "content_filter", "function_call"))) {
          stop(paste("Error! \"", `finish_reason`, "\" cannot be assigned to `finish_reason`. Must be \"stop\", \"length\", \"tool_calls\", \"content_filter\", \"function_call\".", sep = ""))
        }
        if (!(is.character(`finish_reason`) && length(`finish_reason`) == 1)) {
          stop(paste("Error! Invalid data for `finish_reason`. Must be a string:", `finish_reason`))
        }
        self$`finish_reason` <- `finish_reason`
      }
      if (!missing(`index`)) {
        if (!(is.numeric(`index`) && length(`index`) == 1)) {
          stop(paste("Error! Invalid data for `index`. Must be an integer:", `index`))
        }
        self$`index` <- `index`
      }
      if (!is.null(`logprobs`)) {
        stopifnot(R6::is.R6(`logprobs`))
        self$`logprobs` <- `logprobs`
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
    #' @return CreateChatCompletionStreamResponseChoicesInner as a base R list.
    #' @examples
    #' # convert array of CreateChatCompletionStreamResponseChoicesInner (x) to a data frame
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
    #' Convert CreateChatCompletionStreamResponseChoicesInner to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CreateChatCompletionStreamResponseChoicesInnerObject <- list()
      if (!is.null(self$`delta`)) {
        CreateChatCompletionStreamResponseChoicesInnerObject[["delta"]] <-
          self$`delta`$toSimpleType()
      }
      if (!is.null(self$`logprobs`)) {
        CreateChatCompletionStreamResponseChoicesInnerObject[["logprobs"]] <-
          self$`logprobs`$toSimpleType()
      }
      if (!is.null(self$`finish_reason`)) {
        CreateChatCompletionStreamResponseChoicesInnerObject[["finish_reason"]] <-
          self$`finish_reason`
      }
      if (!is.null(self$`index`)) {
        CreateChatCompletionStreamResponseChoicesInnerObject[["index"]] <-
          self$`index`
      }
      return(CreateChatCompletionStreamResponseChoicesInnerObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of CreateChatCompletionStreamResponseChoicesInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateChatCompletionStreamResponseChoicesInner
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`delta`)) {
        `delta_object` <- ChatCompletionStreamResponseDelta$new()
        `delta_object`$fromJSON(jsonlite::toJSON(this_object$`delta`, auto_unbox = TRUE, digits = NA))
        self$`delta` <- `delta_object`
      }
      if (!is.null(this_object$`logprobs`)) {
        `logprobs_object` <- CreateChatCompletionResponseChoicesInnerLogprobs$new()
        `logprobs_object`$fromJSON(jsonlite::toJSON(this_object$`logprobs`, auto_unbox = TRUE, digits = NA))
        self$`logprobs` <- `logprobs_object`
      }
      if (!is.null(this_object$`finish_reason`)) {
        if (!is.null(this_object$`finish_reason`) && !(this_object$`finish_reason` %in% c("stop", "length", "tool_calls", "content_filter", "function_call"))) {
          stop(paste("Error! \"", this_object$`finish_reason`, "\" cannot be assigned to `finish_reason`. Must be \"stop\", \"length\", \"tool_calls\", \"content_filter\", \"function_call\".", sep = ""))
        }
        self$`finish_reason` <- this_object$`finish_reason`
      }
      if (!is.null(this_object$`index`)) {
        self$`index` <- this_object$`index`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CreateChatCompletionStreamResponseChoicesInner in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CreateChatCompletionStreamResponseChoicesInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateChatCompletionStreamResponseChoicesInner
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`delta` <- ChatCompletionStreamResponseDelta$new()$fromJSON(jsonlite::toJSON(this_object$`delta`, auto_unbox = TRUE, digits = NA))
      self$`logprobs` <- CreateChatCompletionResponseChoicesInnerLogprobs$new()$fromJSON(jsonlite::toJSON(this_object$`logprobs`, auto_unbox = TRUE, digits = NA))
      if (!is.null(this_object$`finish_reason`) && !(this_object$`finish_reason` %in% c("stop", "length", "tool_calls", "content_filter", "function_call"))) {
        stop(paste("Error! \"", this_object$`finish_reason`, "\" cannot be assigned to `finish_reason`. Must be \"stop\", \"length\", \"tool_calls\", \"content_filter\", \"function_call\".", sep = ""))
      }
      self$`finish_reason` <- this_object$`finish_reason`
      self$`index` <- this_object$`index`
      self
    },

    #' @description
    #' Validate JSON input with respect to CreateChatCompletionStreamResponseChoicesInner and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `delta`
      if (!is.null(input_json$`delta`)) {
        stopifnot(R6::is.R6(input_json$`delta`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateChatCompletionStreamResponseChoicesInner: the required field `delta` is missing."))
      }
      # check the required field `finish_reason`
      if (!is.null(input_json$`finish_reason`)) {
        if (!(is.character(input_json$`finish_reason`) && length(input_json$`finish_reason`) == 1)) {
          stop(paste("Error! Invalid data for `finish_reason`. Must be a string:", input_json$`finish_reason`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateChatCompletionStreamResponseChoicesInner: the required field `finish_reason` is missing."))
      }
      # check the required field `index`
      if (!is.null(input_json$`index`)) {
        if (!(is.numeric(input_json$`index`) && length(input_json$`index`) == 1)) {
          stop(paste("Error! Invalid data for `index`. Must be an integer:", input_json$`index`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateChatCompletionStreamResponseChoicesInner: the required field `index` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CreateChatCompletionStreamResponseChoicesInner
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `delta` is null
      if (is.null(self$`delta`)) {
        return(FALSE)
      }

      # check if the required `index` is null
      if (is.null(self$`index`)) {
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
      # check if the required `delta` is null
      if (is.null(self$`delta`)) {
        invalid_fields["delta"] <- "Non-nullable required field `delta` cannot be null."
      }

      # check if the required `index` is null
      if (is.null(self$`index`)) {
        invalid_fields["index"] <- "Non-nullable required field `index` cannot be null."
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
# CreateChatCompletionStreamResponseChoicesInner$unlock()
#
## Below is an example to define the print function
# CreateChatCompletionStreamResponseChoicesInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CreateChatCompletionStreamResponseChoicesInner$lock()

