#' Create a new ChatCompletionRequestMessage
#'
#' @description
#' ChatCompletionRequestMessage Class
#'
#' @docType class
#' @title ChatCompletionRequestMessage
#' @description ChatCompletionRequestMessage Class
#' @format An \code{R6Class} generator object
#' @field role The role of the messages author. One of `system`, `user`, `assistant`, or `function`. character
#' @field content The contents of the message. `content` is required for all messages except assistant messages with function calls. character [optional]
#' @field name The name of the author of this message. `name` is required if role is `function`, and it should be the name of the function whose response is in the `content`. May contain a-z, A-Z, 0-9, and underscores, with a maximum length of 64 characters. character [optional]
#' @field function_call  \link{ChatCompletionRequestMessageFunctionCall} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ChatCompletionRequestMessage <- R6::R6Class(
  "ChatCompletionRequestMessage",
  public = list(
    `role` = NULL,
    `content` = NULL,
    `name` = NULL,
    `function_call` = NULL,
    #' Initialize a new ChatCompletionRequestMessage class.
    #'
    #' @description
    #' Initialize a new ChatCompletionRequestMessage class.
    #'
    #' @param role The role of the messages author. One of `system`, `user`, `assistant`, or `function`.
    #' @param content The contents of the message. `content` is required for all messages except assistant messages with function calls.
    #' @param name The name of the author of this message. `name` is required if role is `function`, and it should be the name of the function whose response is in the `content`. May contain a-z, A-Z, 0-9, and underscores, with a maximum length of 64 characters.
    #' @param function_call function_call
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`role`, `content` = NULL, `name` = NULL, `function_call` = NULL, ...) {
      if (!missing(`role`)) {
        if (!(`role` %in% c("system", "user", "assistant", "function"))) {
          stop(paste("Error! \"", `role`, "\" cannot be assigned to `role`. Must be \"system\", \"user\", \"assistant\", \"function\".", sep = ""))
        }
        if (!(is.character(`role`) && length(`role`) == 1)) {
          stop(paste("Error! Invalid data for `role`. Must be a string:", `role`))
        }
        self$`role` <- `role`
      }
      if (!is.null(`content`)) {
        if (!(is.character(`content`) && length(`content`) == 1)) {
          stop(paste("Error! Invalid data for `content`. Must be a string:", `content`))
        }
        self$`content` <- `content`
      }
      if (!is.null(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!is.null(`function_call`)) {
        stopifnot(R6::is.R6(`function_call`))
        self$`function_call` <- `function_call`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ChatCompletionRequestMessage in JSON format
    #' @export
    toJSON = function() {
      ChatCompletionRequestMessageObject <- list()
      if (!is.null(self$`role`)) {
        ChatCompletionRequestMessageObject[["role"]] <-
          self$`role`
      }
      if (!is.null(self$`content`)) {
        ChatCompletionRequestMessageObject[["content"]] <-
          self$`content`
      }
      if (!is.null(self$`name`)) {
        ChatCompletionRequestMessageObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`function_call`)) {
        ChatCompletionRequestMessageObject[["function_call"]] <-
          self$`function_call`$toJSON()
      }
      ChatCompletionRequestMessageObject
    },
    #' Deserialize JSON string into an instance of ChatCompletionRequestMessage
    #'
    #' @description
    #' Deserialize JSON string into an instance of ChatCompletionRequestMessage
    #'
    #' @param input_json the JSON input
    #' @return the instance of ChatCompletionRequestMessage
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`role`)) {
        if (!is.null(this_object$`role`) && !(this_object$`role` %in% c("system", "user", "assistant", "function"))) {
          stop(paste("Error! \"", this_object$`role`, "\" cannot be assigned to `role`. Must be \"system\", \"user\", \"assistant\", \"function\".", sep = ""))
        }
        self$`role` <- this_object$`role`
      }
      if (!is.null(this_object$`content`)) {
        self$`content` <- this_object$`content`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`function_call`)) {
        `function_call_object` <- ChatCompletionRequestMessageFunctionCall$new()
        `function_call_object`$fromJSON(jsonlite::toJSON(this_object$`function_call`, auto_unbox = TRUE, digits = NA))
        self$`function_call` <- `function_call_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ChatCompletionRequestMessage in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`role`)) {
          sprintf(
          '"role":
            "%s"
                    ',
          self$`role`
          )
        },
        if (!is.null(self$`content`)) {
          sprintf(
          '"content":
            "%s"
                    ',
          self$`content`
          )
        },
        if (!is.null(self$`name`)) {
          sprintf(
          '"name":
            "%s"
                    ',
          self$`name`
          )
        },
        if (!is.null(self$`function_call`)) {
          sprintf(
          '"function_call":
          %s
          ',
          jsonlite::toJSON(self$`function_call`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of ChatCompletionRequestMessage
    #'
    #' @description
    #' Deserialize JSON string into an instance of ChatCompletionRequestMessage
    #'
    #' @param input_json the JSON input
    #' @return the instance of ChatCompletionRequestMessage
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`role`) && !(this_object$`role` %in% c("system", "user", "assistant", "function"))) {
        stop(paste("Error! \"", this_object$`role`, "\" cannot be assigned to `role`. Must be \"system\", \"user\", \"assistant\", \"function\".", sep = ""))
      }
      self$`role` <- this_object$`role`
      self$`content` <- this_object$`content`
      self$`name` <- this_object$`name`
      self$`function_call` <- ChatCompletionRequestMessageFunctionCall$new()$fromJSON(jsonlite::toJSON(this_object$`function_call`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to ChatCompletionRequestMessage
    #'
    #' @description
    #' Validate JSON input with respect to ChatCompletionRequestMessage and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `role`
      if (!is.null(input_json$`role`)) {
        if (!(is.character(input_json$`role`) && length(input_json$`role`) == 1)) {
          stop(paste("Error! Invalid data for `role`. Must be a string:", input_json$`role`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ChatCompletionRequestMessage: the required field `role` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ChatCompletionRequestMessage
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
      # check if the required `role` is null
      if (is.null(self$`role`)) {
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
      # check if the required `role` is null
      if (is.null(self$`role`)) {
        invalid_fields["role"] <- "Non-nullable required field `role` cannot be null."
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
# ChatCompletionRequestMessage$unlock()
#
## Below is an example to define the print function
# ChatCompletionRequestMessage$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ChatCompletionRequestMessage$lock()

