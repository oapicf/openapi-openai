#' Create a new ChatCompletionRequestFunctionMessage
#'
#' @description
#' ChatCompletionRequestFunctionMessage Class
#'
#' @docType class
#' @title ChatCompletionRequestFunctionMessage
#' @description ChatCompletionRequestFunctionMessage Class
#' @format An \code{R6Class} generator object
#' @field role The role of the messages author, in this case `function`. character
#' @field content The contents of the function message. character
#' @field name The name of the function to call. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ChatCompletionRequestFunctionMessage <- R6::R6Class(
  "ChatCompletionRequestFunctionMessage",
  public = list(
    `role` = NULL,
    `content` = NULL,
    `name` = NULL,

    #' @description
    #' Initialize a new ChatCompletionRequestFunctionMessage class.
    #'
    #' @param role The role of the messages author, in this case `function`.
    #' @param content The contents of the function message.
    #' @param name The name of the function to call.
    #' @param ... Other optional arguments.
    initialize = function(`role`, `content`, `name`, ...) {
      if (!missing(`role`)) {
        if (!(`role` %in% c("function"))) {
          stop(paste("Error! \"", `role`, "\" cannot be assigned to `role`. Must be \"function\".", sep = ""))
        }
        if (!(is.character(`role`) && length(`role`) == 1)) {
          stop(paste("Error! Invalid data for `role`. Must be a string:", `role`))
        }
        self$`role` <- `role`
      }
      if (!missing(`content`)) {
        if (!(is.character(`content`) && length(`content`) == 1)) {
          stop(paste("Error! Invalid data for `content`. Must be a string:", `content`))
        }
        self$`content` <- `content`
      }
      if (!missing(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return ChatCompletionRequestFunctionMessage in JSON format
    toJSON = function() {
      ChatCompletionRequestFunctionMessageObject <- list()
      if (!is.null(self$`role`)) {
        ChatCompletionRequestFunctionMessageObject[["role"]] <-
          self$`role`
      }
      if (!is.null(self$`content`)) {
        ChatCompletionRequestFunctionMessageObject[["content"]] <-
          self$`content`
      }
      if (!is.null(self$`name`)) {
        ChatCompletionRequestFunctionMessageObject[["name"]] <-
          self$`name`
      }
      ChatCompletionRequestFunctionMessageObject
    },

    #' @description
    #' Deserialize JSON string into an instance of ChatCompletionRequestFunctionMessage
    #'
    #' @param input_json the JSON input
    #' @return the instance of ChatCompletionRequestFunctionMessage
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`role`)) {
        if (!is.null(this_object$`role`) && !(this_object$`role` %in% c("function"))) {
          stop(paste("Error! \"", this_object$`role`, "\" cannot be assigned to `role`. Must be \"function\".", sep = ""))
        }
        self$`role` <- this_object$`role`
      }
      if (!is.null(this_object$`content`)) {
        self$`content` <- this_object$`content`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return ChatCompletionRequestFunctionMessage in JSON format
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
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of ChatCompletionRequestFunctionMessage
    #'
    #' @param input_json the JSON input
    #' @return the instance of ChatCompletionRequestFunctionMessage
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`role`) && !(this_object$`role` %in% c("function"))) {
        stop(paste("Error! \"", this_object$`role`, "\" cannot be assigned to `role`. Must be \"function\".", sep = ""))
      }
      self$`role` <- this_object$`role`
      self$`content` <- this_object$`content`
      self$`name` <- this_object$`name`
      self
    },

    #' @description
    #' Validate JSON input with respect to ChatCompletionRequestFunctionMessage and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `role`
      if (!is.null(input_json$`role`)) {
        if (!(is.character(input_json$`role`) && length(input_json$`role`) == 1)) {
          stop(paste("Error! Invalid data for `role`. Must be a string:", input_json$`role`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ChatCompletionRequestFunctionMessage: the required field `role` is missing."))
      }
      # check the required field `content`
      if (!is.null(input_json$`content`)) {
        if (!(is.character(input_json$`content`) && length(input_json$`content`) == 1)) {
          stop(paste("Error! Invalid data for `content`. Must be a string:", input_json$`content`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ChatCompletionRequestFunctionMessage: the required field `content` is missing."))
      }
      # check the required field `name`
      if (!is.null(input_json$`name`)) {
        if (!(is.character(input_json$`name`) && length(input_json$`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", input_json$`name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ChatCompletionRequestFunctionMessage: the required field `name` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ChatCompletionRequestFunctionMessage
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `role` is null
      if (is.null(self$`role`)) {
        return(FALSE)
      }

      # check if the required `name` is null
      if (is.null(self$`name`)) {
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
      # check if the required `role` is null
      if (is.null(self$`role`)) {
        invalid_fields["role"] <- "Non-nullable required field `role` cannot be null."
      }

      # check if the required `name` is null
      if (is.null(self$`name`)) {
        invalid_fields["name"] <- "Non-nullable required field `name` cannot be null."
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
# ChatCompletionRequestFunctionMessage$unlock()
#
## Below is an example to define the print function
# ChatCompletionRequestFunctionMessage$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ChatCompletionRequestFunctionMessage$lock()

