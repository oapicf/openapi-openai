#' Create a new ChatCompletionRequestUserMessage
#'
#' @description
#' ChatCompletionRequestUserMessage Class
#'
#' @docType class
#' @title ChatCompletionRequestUserMessage
#' @description ChatCompletionRequestUserMessage Class
#' @format An \code{R6Class} generator object
#' @field content  \link{ChatCompletionRequestUserMessageContent}
#' @field role The role of the messages author, in this case `user`. character
#' @field name An optional name for the participant. Provides the model information to differentiate between participants of the same role. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ChatCompletionRequestUserMessage <- R6::R6Class(
  "ChatCompletionRequestUserMessage",
  public = list(
    `content` = NULL,
    `role` = NULL,
    `name` = NULL,
    #' Initialize a new ChatCompletionRequestUserMessage class.
    #'
    #' @description
    #' Initialize a new ChatCompletionRequestUserMessage class.
    #'
    #' @param content content
    #' @param role The role of the messages author, in this case `user`.
    #' @param name An optional name for the participant. Provides the model information to differentiate between participants of the same role.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`content`, `role`, `name` = NULL, ...) {
      if (!missing(`content`)) {
        stopifnot(R6::is.R6(`content`))
        self$`content` <- `content`
      }
      if (!missing(`role`)) {
        if (!(`role` %in% c("user"))) {
          stop(paste("Error! \"", `role`, "\" cannot be assigned to `role`. Must be \"user\".", sep = ""))
        }
        if (!(is.character(`role`) && length(`role`) == 1)) {
          stop(paste("Error! Invalid data for `role`. Must be a string:", `role`))
        }
        self$`role` <- `role`
      }
      if (!is.null(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ChatCompletionRequestUserMessage in JSON format
    #' @export
    toJSON = function() {
      ChatCompletionRequestUserMessageObject <- list()
      if (!is.null(self$`content`)) {
        ChatCompletionRequestUserMessageObject[["content"]] <-
          self$`content`$toJSON()
      }
      if (!is.null(self$`role`)) {
        ChatCompletionRequestUserMessageObject[["role"]] <-
          self$`role`
      }
      if (!is.null(self$`name`)) {
        ChatCompletionRequestUserMessageObject[["name"]] <-
          self$`name`
      }
      ChatCompletionRequestUserMessageObject
    },
    #' Deserialize JSON string into an instance of ChatCompletionRequestUserMessage
    #'
    #' @description
    #' Deserialize JSON string into an instance of ChatCompletionRequestUserMessage
    #'
    #' @param input_json the JSON input
    #' @return the instance of ChatCompletionRequestUserMessage
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`content`)) {
        `content_object` <- ChatCompletionRequestUserMessageContent$new()
        `content_object`$fromJSON(jsonlite::toJSON(this_object$`content`, auto_unbox = TRUE, digits = NA))
        self$`content` <- `content_object`
      }
      if (!is.null(this_object$`role`)) {
        if (!is.null(this_object$`role`) && !(this_object$`role` %in% c("user"))) {
          stop(paste("Error! \"", this_object$`role`, "\" cannot be assigned to `role`. Must be \"user\".", sep = ""))
        }
        self$`role` <- this_object$`role`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ChatCompletionRequestUserMessage in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`content`)) {
          sprintf(
          '"content":
          %s
          ',
          jsonlite::toJSON(self$`content`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`role`)) {
          sprintf(
          '"role":
            "%s"
                    ',
          self$`role`
          )
        },
        if (!is.null(self$`name`)) {
          sprintf(
          '"name":
            "%s"
                    ',
          self$`name`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of ChatCompletionRequestUserMessage
    #'
    #' @description
    #' Deserialize JSON string into an instance of ChatCompletionRequestUserMessage
    #'
    #' @param input_json the JSON input
    #' @return the instance of ChatCompletionRequestUserMessage
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`content` <- ChatCompletionRequestUserMessageContent$new()$fromJSON(jsonlite::toJSON(this_object$`content`, auto_unbox = TRUE, digits = NA))
      if (!is.null(this_object$`role`) && !(this_object$`role` %in% c("user"))) {
        stop(paste("Error! \"", this_object$`role`, "\" cannot be assigned to `role`. Must be \"user\".", sep = ""))
      }
      self$`role` <- this_object$`role`
      self$`name` <- this_object$`name`
      self
    },
    #' Validate JSON input with respect to ChatCompletionRequestUserMessage
    #'
    #' @description
    #' Validate JSON input with respect to ChatCompletionRequestUserMessage and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `content`
      if (!is.null(input_json$`content`)) {
        stopifnot(R6::is.R6(input_json$`content`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ChatCompletionRequestUserMessage: the required field `content` is missing."))
      }
      # check the required field `role`
      if (!is.null(input_json$`role`)) {
        if (!(is.character(input_json$`role`) && length(input_json$`role`) == 1)) {
          stop(paste("Error! Invalid data for `role`. Must be a string:", input_json$`role`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ChatCompletionRequestUserMessage: the required field `role` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ChatCompletionRequestUserMessage
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
      # check if the required `content` is null
      if (is.null(self$`content`)) {
        return(FALSE)
      }

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
      # check if the required `content` is null
      if (is.null(self$`content`)) {
        invalid_fields["content"] <- "Non-nullable required field `content` cannot be null."
      }

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
# ChatCompletionRequestUserMessage$unlock()
#
## Below is an example to define the print function
# ChatCompletionRequestUserMessage$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ChatCompletionRequestUserMessage$lock()

