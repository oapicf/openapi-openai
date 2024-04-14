#' Create a new CreateChatCompletionResponseChoicesInner
#'
#' @description
#' CreateChatCompletionResponseChoicesInner Class
#'
#' @docType class
#' @title CreateChatCompletionResponseChoicesInner
#' @description CreateChatCompletionResponseChoicesInner Class
#' @format An \code{R6Class} generator object
#' @field finish_reason The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, `tool_calls` if the model called a tool, or `function_call` (deprecated) if the model called a function. character
#' @field index The index of the choice in the list of choices. integer
#' @field message  \link{ChatCompletionResponseMessage}
#' @field logprobs  \link{CreateChatCompletionResponseChoicesInnerLogprobs}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CreateChatCompletionResponseChoicesInner <- R6::R6Class(
  "CreateChatCompletionResponseChoicesInner",
  public = list(
    `finish_reason` = NULL,
    `index` = NULL,
    `message` = NULL,
    `logprobs` = NULL,
    #' Initialize a new CreateChatCompletionResponseChoicesInner class.
    #'
    #' @description
    #' Initialize a new CreateChatCompletionResponseChoicesInner class.
    #'
    #' @param finish_reason The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, `tool_calls` if the model called a tool, or `function_call` (deprecated) if the model called a function.
    #' @param index The index of the choice in the list of choices.
    #' @param message message
    #' @param logprobs logprobs
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`finish_reason`, `index`, `message`, `logprobs`, ...) {
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
      if (!missing(`message`)) {
        stopifnot(R6::is.R6(`message`))
        self$`message` <- `message`
      }
      if (!missing(`logprobs`)) {
        stopifnot(R6::is.R6(`logprobs`))
        self$`logprobs` <- `logprobs`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CreateChatCompletionResponseChoicesInner in JSON format
    #' @export
    toJSON = function() {
      CreateChatCompletionResponseChoicesInnerObject <- list()
      if (!is.null(self$`finish_reason`)) {
        CreateChatCompletionResponseChoicesInnerObject[["finish_reason"]] <-
          self$`finish_reason`
      }
      if (!is.null(self$`index`)) {
        CreateChatCompletionResponseChoicesInnerObject[["index"]] <-
          self$`index`
      }
      if (!is.null(self$`message`)) {
        CreateChatCompletionResponseChoicesInnerObject[["message"]] <-
          self$`message`$toJSON()
      }
      if (!is.null(self$`logprobs`)) {
        CreateChatCompletionResponseChoicesInnerObject[["logprobs"]] <-
          self$`logprobs`$toJSON()
      }
      CreateChatCompletionResponseChoicesInnerObject
    },
    #' Deserialize JSON string into an instance of CreateChatCompletionResponseChoicesInner
    #'
    #' @description
    #' Deserialize JSON string into an instance of CreateChatCompletionResponseChoicesInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateChatCompletionResponseChoicesInner
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`finish_reason`)) {
        if (!is.null(this_object$`finish_reason`) && !(this_object$`finish_reason` %in% c("stop", "length", "tool_calls", "content_filter", "function_call"))) {
          stop(paste("Error! \"", this_object$`finish_reason`, "\" cannot be assigned to `finish_reason`. Must be \"stop\", \"length\", \"tool_calls\", \"content_filter\", \"function_call\".", sep = ""))
        }
        self$`finish_reason` <- this_object$`finish_reason`
      }
      if (!is.null(this_object$`index`)) {
        self$`index` <- this_object$`index`
      }
      if (!is.null(this_object$`message`)) {
        `message_object` <- ChatCompletionResponseMessage$new()
        `message_object`$fromJSON(jsonlite::toJSON(this_object$`message`, auto_unbox = TRUE, digits = NA))
        self$`message` <- `message_object`
      }
      if (!is.null(this_object$`logprobs`)) {
        `logprobs_object` <- CreateChatCompletionResponseChoicesInnerLogprobs$new()
        `logprobs_object`$fromJSON(jsonlite::toJSON(this_object$`logprobs`, auto_unbox = TRUE, digits = NA))
        self$`logprobs` <- `logprobs_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CreateChatCompletionResponseChoicesInner in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
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
        },
        if (!is.null(self$`message`)) {
          sprintf(
          '"message":
          %s
          ',
          jsonlite::toJSON(self$`message`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`logprobs`)) {
          sprintf(
          '"logprobs":
          %s
          ',
          jsonlite::toJSON(self$`logprobs`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of CreateChatCompletionResponseChoicesInner
    #'
    #' @description
    #' Deserialize JSON string into an instance of CreateChatCompletionResponseChoicesInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateChatCompletionResponseChoicesInner
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`finish_reason`) && !(this_object$`finish_reason` %in% c("stop", "length", "tool_calls", "content_filter", "function_call"))) {
        stop(paste("Error! \"", this_object$`finish_reason`, "\" cannot be assigned to `finish_reason`. Must be \"stop\", \"length\", \"tool_calls\", \"content_filter\", \"function_call\".", sep = ""))
      }
      self$`finish_reason` <- this_object$`finish_reason`
      self$`index` <- this_object$`index`
      self$`message` <- ChatCompletionResponseMessage$new()$fromJSON(jsonlite::toJSON(this_object$`message`, auto_unbox = TRUE, digits = NA))
      self$`logprobs` <- CreateChatCompletionResponseChoicesInnerLogprobs$new()$fromJSON(jsonlite::toJSON(this_object$`logprobs`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to CreateChatCompletionResponseChoicesInner
    #'
    #' @description
    #' Validate JSON input with respect to CreateChatCompletionResponseChoicesInner and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `finish_reason`
      if (!is.null(input_json$`finish_reason`)) {
        if (!(is.character(input_json$`finish_reason`) && length(input_json$`finish_reason`) == 1)) {
          stop(paste("Error! Invalid data for `finish_reason`. Must be a string:", input_json$`finish_reason`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateChatCompletionResponseChoicesInner: the required field `finish_reason` is missing."))
      }
      # check the required field `index`
      if (!is.null(input_json$`index`)) {
        if (!(is.numeric(input_json$`index`) && length(input_json$`index`) == 1)) {
          stop(paste("Error! Invalid data for `index`. Must be an integer:", input_json$`index`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateChatCompletionResponseChoicesInner: the required field `index` is missing."))
      }
      # check the required field `message`
      if (!is.null(input_json$`message`)) {
        stopifnot(R6::is.R6(input_json$`message`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateChatCompletionResponseChoicesInner: the required field `message` is missing."))
      }
      # check the required field `logprobs`
      if (!is.null(input_json$`logprobs`)) {
        stopifnot(R6::is.R6(input_json$`logprobs`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateChatCompletionResponseChoicesInner: the required field `logprobs` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CreateChatCompletionResponseChoicesInner
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
      # check if the required `finish_reason` is null
      if (is.null(self$`finish_reason`)) {
        return(FALSE)
      }

      # check if the required `index` is null
      if (is.null(self$`index`)) {
        return(FALSE)
      }

      # check if the required `message` is null
      if (is.null(self$`message`)) {
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
      # check if the required `finish_reason` is null
      if (is.null(self$`finish_reason`)) {
        invalid_fields["finish_reason"] <- "Non-nullable required field `finish_reason` cannot be null."
      }

      # check if the required `index` is null
      if (is.null(self$`index`)) {
        invalid_fields["index"] <- "Non-nullable required field `index` cannot be null."
      }

      # check if the required `message` is null
      if (is.null(self$`message`)) {
        invalid_fields["message"] <- "Non-nullable required field `message` cannot be null."
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
# CreateChatCompletionResponseChoicesInner$unlock()
#
## Below is an example to define the print function
# CreateChatCompletionResponseChoicesInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CreateChatCompletionResponseChoicesInner$lock()

