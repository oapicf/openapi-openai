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
    #' Initialize a new CreateChatCompletionStreamResponseChoicesInner class.
    #'
    #' @description
    #' Initialize a new CreateChatCompletionStreamResponseChoicesInner class.
    #'
    #' @param delta delta
    #' @param finish_reason The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, `tool_calls` if the model called a tool, or `function_call` (deprecated) if the model called a function.
    #' @param index The index of the choice in the list of choices.
    #' @param logprobs logprobs
    #' @param ... Other optional arguments.
    #' @export
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
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CreateChatCompletionStreamResponseChoicesInner in JSON format
    #' @export
    toJSON = function() {
      CreateChatCompletionStreamResponseChoicesInnerObject <- list()
      if (!is.null(self$`delta`)) {
        CreateChatCompletionStreamResponseChoicesInnerObject[["delta"]] <-
          self$`delta`$toJSON()
      }
      if (!is.null(self$`logprobs`)) {
        CreateChatCompletionStreamResponseChoicesInnerObject[["logprobs"]] <-
          self$`logprobs`$toJSON()
      }
      if (!is.null(self$`finish_reason`)) {
        CreateChatCompletionStreamResponseChoicesInnerObject[["finish_reason"]] <-
          self$`finish_reason`
      }
      if (!is.null(self$`index`)) {
        CreateChatCompletionStreamResponseChoicesInnerObject[["index"]] <-
          self$`index`
      }
      CreateChatCompletionStreamResponseChoicesInnerObject
    },
    #' Deserialize JSON string into an instance of CreateChatCompletionStreamResponseChoicesInner
    #'
    #' @description
    #' Deserialize JSON string into an instance of CreateChatCompletionStreamResponseChoicesInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateChatCompletionStreamResponseChoicesInner
    #' @export
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
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CreateChatCompletionStreamResponseChoicesInner in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`delta`)) {
          sprintf(
          '"delta":
          %s
          ',
          jsonlite::toJSON(self$`delta`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`logprobs`)) {
          sprintf(
          '"logprobs":
          %s
          ',
          jsonlite::toJSON(self$`logprobs`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`finish_reason`)) {
          sprintf(
          '"finish_reason":
            "%s"
                    ',
          self$`finish_reason`
          )
        },
        if (!is.null(self$`index`)) {
          sprintf(
          '"index":
            %d
                    ',
          self$`index`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of CreateChatCompletionStreamResponseChoicesInner
    #'
    #' @description
    #' Deserialize JSON string into an instance of CreateChatCompletionStreamResponseChoicesInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateChatCompletionStreamResponseChoicesInner
    #' @export
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
    #' Validate JSON input with respect to CreateChatCompletionStreamResponseChoicesInner
    #'
    #' @description
    #' Validate JSON input with respect to CreateChatCompletionStreamResponseChoicesInner and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
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
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CreateChatCompletionStreamResponseChoicesInner
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
    #' Return a list of invalid fields (if any).
    #'
    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    #' @export
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
# CreateChatCompletionStreamResponseChoicesInner$unlock()
#
## Below is an example to define the print function
# CreateChatCompletionStreamResponseChoicesInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CreateChatCompletionStreamResponseChoicesInner$lock()

