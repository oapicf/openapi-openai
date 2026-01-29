#' Create a new ChatCompletionRequestToolMessage
#'
#' @description
#' ChatCompletionRequestToolMessage Class
#'
#' @docType class
#' @title ChatCompletionRequestToolMessage
#' @description ChatCompletionRequestToolMessage Class
#' @format An \code{R6Class} generator object
#' @field role The role of the messages author, in this case `tool`. character
#' @field content The contents of the tool message. character
#' @field tool_call_id Tool call that this message is responding to. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ChatCompletionRequestToolMessage <- R6::R6Class(
  "ChatCompletionRequestToolMessage",
  public = list(
    `role` = NULL,
    `content` = NULL,
    `tool_call_id` = NULL,

    #' @description
    #' Initialize a new ChatCompletionRequestToolMessage class.
    #'
    #' @param role The role of the messages author, in this case `tool`.
    #' @param content The contents of the tool message.
    #' @param tool_call_id Tool call that this message is responding to.
    #' @param ... Other optional arguments.
    initialize = function(`role`, `content`, `tool_call_id`, ...) {
      if (!missing(`role`)) {
        if (!(`role` %in% c("tool"))) {
          stop(paste("Error! \"", `role`, "\" cannot be assigned to `role`. Must be \"tool\".", sep = ""))
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
      if (!missing(`tool_call_id`)) {
        if (!(is.character(`tool_call_id`) && length(`tool_call_id`) == 1)) {
          stop(paste("Error! Invalid data for `tool_call_id`. Must be a string:", `tool_call_id`))
        }
        self$`tool_call_id` <- `tool_call_id`
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
    #' @return ChatCompletionRequestToolMessage as a base R list.
    #' @examples
    #' # convert array of ChatCompletionRequestToolMessage (x) to a data frame
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
    #' Convert ChatCompletionRequestToolMessage to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      ChatCompletionRequestToolMessageObject <- list()
      if (!is.null(self$`role`)) {
        ChatCompletionRequestToolMessageObject[["role"]] <-
          self$`role`
      }
      if (!is.null(self$`content`)) {
        ChatCompletionRequestToolMessageObject[["content"]] <-
          self$`content`
      }
      if (!is.null(self$`tool_call_id`)) {
        ChatCompletionRequestToolMessageObject[["tool_call_id"]] <-
          self$`tool_call_id`
      }
      return(ChatCompletionRequestToolMessageObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of ChatCompletionRequestToolMessage
    #'
    #' @param input_json the JSON input
    #' @return the instance of ChatCompletionRequestToolMessage
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`role`)) {
        if (!is.null(this_object$`role`) && !(this_object$`role` %in% c("tool"))) {
          stop(paste("Error! \"", this_object$`role`, "\" cannot be assigned to `role`. Must be \"tool\".", sep = ""))
        }
        self$`role` <- this_object$`role`
      }
      if (!is.null(this_object$`content`)) {
        self$`content` <- this_object$`content`
      }
      if (!is.null(this_object$`tool_call_id`)) {
        self$`tool_call_id` <- this_object$`tool_call_id`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return ChatCompletionRequestToolMessage in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of ChatCompletionRequestToolMessage
    #'
    #' @param input_json the JSON input
    #' @return the instance of ChatCompletionRequestToolMessage
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`role`) && !(this_object$`role` %in% c("tool"))) {
        stop(paste("Error! \"", this_object$`role`, "\" cannot be assigned to `role`. Must be \"tool\".", sep = ""))
      }
      self$`role` <- this_object$`role`
      self$`content` <- this_object$`content`
      self$`tool_call_id` <- this_object$`tool_call_id`
      self
    },

    #' @description
    #' Validate JSON input with respect to ChatCompletionRequestToolMessage and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for ChatCompletionRequestToolMessage: the required field `role` is missing."))
      }
      # check the required field `content`
      if (!is.null(input_json$`content`)) {
        if (!(is.character(input_json$`content`) && length(input_json$`content`) == 1)) {
          stop(paste("Error! Invalid data for `content`. Must be a string:", input_json$`content`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ChatCompletionRequestToolMessage: the required field `content` is missing."))
      }
      # check the required field `tool_call_id`
      if (!is.null(input_json$`tool_call_id`)) {
        if (!(is.character(input_json$`tool_call_id`) && length(input_json$`tool_call_id`) == 1)) {
          stop(paste("Error! Invalid data for `tool_call_id`. Must be a string:", input_json$`tool_call_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ChatCompletionRequestToolMessage: the required field `tool_call_id` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ChatCompletionRequestToolMessage
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

      # check if the required `content` is null
      if (is.null(self$`content`)) {
        return(FALSE)
      }

      # check if the required `tool_call_id` is null
      if (is.null(self$`tool_call_id`)) {
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

      # check if the required `content` is null
      if (is.null(self$`content`)) {
        invalid_fields["content"] <- "Non-nullable required field `content` cannot be null."
      }

      # check if the required `tool_call_id` is null
      if (is.null(self$`tool_call_id`)) {
        invalid_fields["tool_call_id"] <- "Non-nullable required field `tool_call_id` cannot be null."
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
# ChatCompletionRequestToolMessage$unlock()
#
## Below is an example to define the print function
# ChatCompletionRequestToolMessage$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ChatCompletionRequestToolMessage$lock()

